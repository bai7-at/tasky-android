package io.embrace.android.embracesdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import io.embrace.android.embracesdk.logging.InternalErrorService;
import io.embrace.android.embracesdk.samples.AutomaticVerificationChecker;
import io.embrace.android.embracesdk.samples.VerificationActions;
import io.embrace.android.embracesdk.samples.VerifyIntegrationException;
import io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener;
import io.embrace.android.embracesdk.session.lifecycle.ActivityTracker;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class EmbraceAutomaticVerification implements ActivityLifecycleListener, ProcessStateListener {
    private static final String EMBRACE_CONTACT_EMAIL = "support@embrace.io";
    private static final long ON_FOREGROUND_DELAY = 5000;
    private static final long ON_FOREGROUND_TIMEOUT = 5000;
    public static final String TAG = "[EmbraceVerification]";
    private static final long VERIFY_INTEGRATION_DELAY = 200;
    public ActivityTracker activityLifecycleTracker;
    private AutomaticVerificationChecker automaticVerificationChecker;
    private boolean foregroundEventTriggered;
    private final Handler handler;
    private boolean isResultDisplayed;
    public ProcessStateService processStateService;
    private final ScheduledExecutorService scheduledExecutorService;
    private VerificationActions verificationActions;
    public static final Companion Companion = new Companion(null);
    private static final EmbraceAutomaticVerification instance = new EmbraceAutomaticVerification(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    public static final class Companion {
        private Companion() {
        }

        public final EmbraceAutomaticVerification getInstance$embrace_android_sdk_release() {
            return EmbraceAutomaticVerification.instance;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmbraceAutomaticVerification() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearUserData() {
        Embrace.getInstance().clearUserEmail();
        Embrace.getInstance().clearUsername();
        Embrace.getInstance().clearAllUserPersonas();
        Embrace.getInstance().clearUserIdentifier();
        Embrace.getInstance().clearUserAsPayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayResult() {
        this.isResultDisplayed = true;
        Boolean isVerificationCorrect = this.automaticVerificationChecker.isVerificationCorrect();
        if (isVerificationCorrect == null) {
            logError("Cannot display end message");
            ww8 ww8Var = ww8.a;
        } else if (isVerificationCorrect.booleanValue()) {
            logInfo("Successful - Embrace is ready to go! 🎉");
            showSuccessDialog();
        } else {
            logError("Error - Something is wrong with the Embrace Configuration ⚠️");
            showDialogWithError$default(this, null, 1, null);
        }
    }

    private final String generateErrorLog(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("App ID: ");
        EmbraceImpl impl = Embrace.getImpl();
        zq3.g(impl, "Embrace.getImpl()");
        MetadataService metadataService = impl.getMetadataService();
        sb.append(metadataService != null ? metadataService.getAppId() : null);
        sb.append('\n');
        sb.append("App Version: ");
        EmbraceImpl impl2 = Embrace.getImpl();
        zq3.g(impl2, "Embrace.getImpl()");
        MetadataService metadataService2 = impl2.getMetadataService();
        sb.append(metadataService2 != null ? metadataService2.getAppVersionName() : null);
        return (sb.toString() + "\n\n-----------------\n\n") + str;
    }

    private final void logError(String str) {
        Embrace embrace = Embrace.getInstance();
        zq3.g(embrace, "Embrace.getInstance()");
        embrace.getInternalInterface().logError("[EmbraceVerification] " + str, null, null, false);
    }

    private final void logInfo(String str) {
        Embrace embrace = Embrace.getInstance();
        zq3.g(embrace, "Embrace.getInstance()");
        embrace.getInternalInterface().logInfo("[EmbraceVerification] " + str, null);
    }

    private final void logInternalError(Throwable th, String str) {
        if (str != null) {
            logError(str);
        }
        Embrace embrace = Embrace.getInstance();
        zq3.g(embrace, "Embrace.getInstance()");
        embrace.getInternalInterface().logInternalError(th);
    }

    static /* synthetic */ void logInternalError$default(EmbraceAutomaticVerification embraceAutomaticVerification, Throwable th, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        embraceAutomaticVerification.logInternalError(th, str);
    }

    private final void logWarning(String str) {
        Embrace embrace = Embrace.getInstance();
        zq3.g(embrace, "Embrace.getInstance()");
        embrace.getInternalInterface().logWarning("[EmbraceVerification] " + str, null, null);
    }

    private final void runVerifyIntegration() {
        try {
            this.scheduledExecutorService.schedule(new Runnable() { // from class: io.embrace.android.embracesdk.EmbraceAutomaticVerification$runVerifyIntegration$1
                @Override // java.lang.Runnable
                public final void run() {
                    EmbraceAutomaticVerification.this.startVerification();
                }
            }, VERIFY_INTEGRATION_DELAY, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logInternalError(e, "Start verification rejected");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendErrorLog(Activity activity, String str) {
        String generateErrorLog = generateErrorLog(str);
        Intent data = new Intent("android.intent.action.SENDTO").setData(Uri.parse("mailto:support@embrace.io"));
        zq3.g(data, "Intent(Intent.ACTION_SEN…$EMBRACE_CONTACT_EMAIL\"))");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{EMBRACE_CONTACT_EMAIL});
        intent.putExtra("android.intent.extra.SUBJECT", "Android Verification Log");
        intent.putExtra("android.intent.extra.TEXT", generateErrorLog);
        intent.setSelector(data);
        activity.startActivity(Intent.createChooser(intent, "Send Email"));
    }

    private final void showDialogWithError(Integer num) {
        final String string;
        ActivityTracker activityTracker = this.activityLifecycleTracker;
        if (activityTracker == null) {
            zq3.z("activityLifecycleTracker");
        }
        final Activity foregroundActivity = activityTracker.getForegroundActivity();
        if (foregroundActivity == null) {
            logError("Verification error - Cannot display popup");
            return;
        }
        List<Throwable> exceptions = this.automaticVerificationChecker.getExceptions();
        ArrayList arrayList = new ArrayList(i.w(exceptions, 10));
        Iterator<T> it2 = exceptions.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Throwable) it2.next()).getMessage());
        }
        List a1 = i.a1(arrayList);
        if (num != null) {
            a1.add(foregroundActivity.getString(num.intValue()));
        }
        if (a1.isEmpty()) {
            string = foregroundActivity.getString(R.string.automatic_verification_default_error_message);
            zq3.g(string, "activity.getString(R.str…on_default_error_message)");
        } else {
            String string2 = foregroundActivity.getString(R.string.embrace_verification_errors);
            zq3.g(string2, "activity.getString(R.str…race_verification_errors)");
            string = h.F(string2, "[X]", i.u0(a1, "\n👉 ", "👉 ", null, 0, null, null, 60, null), false, 4, null);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(foregroundActivity);
        builder.setTitle(foregroundActivity.getString(R.string.automatic_verification_error_title)).setMessage(string).setCancelable(true).setNegativeButton(foregroundActivity.getString(R.string.send_error_log), new DialogInterface.OnClickListener() { // from class: io.embrace.android.embracesdk.EmbraceAutomaticVerification$showDialogWithError$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EmbraceAutomaticVerification.this.sendErrorLog(foregroundActivity, string);
                dialogInterface.dismiss();
            }
        }).setPositiveButton(foregroundActivity.getString(R.string.close), new DialogInterface.OnClickListener() { // from class: io.embrace.android.embracesdk.EmbraceAutomaticVerification$showDialogWithError$2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.create().show();
    }

    static /* synthetic */ void showDialogWithError$default(EmbraceAutomaticVerification embraceAutomaticVerification, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        embraceAutomaticVerification.showDialogWithError(num);
    }

    private final void showSuccessDialog() {
        ActivityTracker activityTracker = this.activityLifecycleTracker;
        if (activityTracker == null) {
            zq3.z("activityLifecycleTracker");
        }
        Activity foregroundActivity = activityTracker.getForegroundActivity();
        if (foregroundActivity == null) {
            logInfo("Verification success!");
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(foregroundActivity);
        builder.setTitle(foregroundActivity.getString(R.string.automatic_verification_success_title)).setMessage(foregroundActivity.getString(R.string.automatic_verification_success_message)).setCancelable(true).setPositiveButton(foregroundActivity.getString(R.string.got_it), new DialogInterface.OnClickListener() { // from class: io.embrace.android.embracesdk.EmbraceAutomaticVerification$showSuccessDialog$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.create().show();
    }

    private final void showToast(final Activity activity, final String str) {
        activity.runOnUiThread(new Runnable() { // from class: io.embrace.android.embracesdk.EmbraceAutomaticVerification$showToast$1
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(activity, str, 1).show();
            }
        });
    }

    private final boolean verifyIfInitializerIsDisabled() {
        logInfo("Trying to verify lifecycle annotations");
        try {
            try {
                int i = androidx.startup.a.f;
                EmbraceImpl impl = Embrace.getImpl();
                zq3.g(impl, "Embrace.getImpl()");
                Application application = impl.getApplication();
                if (application == null) {
                    return false;
                }
                if (androidx.startup.a.class.getMethod("isEagerlyInitialized", Class.class).invoke(androidx.startup.a.class.getMethod("getInstance", Context.class).invoke(null, application), ProcessLifecycleInitializer.class) != null) {
                    return !((Boolean) r1).booleanValue();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            } catch (Exception e) {
                logWarning("Could not verify if lifecycle annotations are working: " + e);
                return false;
            }
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void verifyLifecycle() {
        if (this.foregroundEventTriggered) {
            return;
        }
        logError("OnForeground event was not triggered");
        EmbraceImpl impl = Embrace.getImpl();
        zq3.g(impl, "Embrace.getImpl()");
        InternalErrorService internalErrorService = impl.getInternalErrorService();
        if (internalErrorService == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (verifyIfInitializerIsDisabled()) {
            internalErrorService.handleInternalError(new VerifyIntegrationException("ProcessLifecycleInitializer disabled"));
            showDialogWithError(Integer.valueOf(R.string.automatic_verification_no_initializer_message));
        } else {
            internalErrorService.handleInternalError(new VerifyIntegrationException("onForeground not invoked"));
            showDialogWithError(Integer.valueOf(R.string.automatic_verification_lifecycle_error_message));
        }
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void applicationStartupComplete() {
        ActivityLifecycleListener.DefaultImpls.applicationStartupComplete(this);
    }

    public final ActivityTracker getActivityLifecycleTracker$embrace_android_sdk_release() {
        ActivityTracker activityTracker = this.activityLifecycleTracker;
        if (activityTracker == null) {
            zq3.z("activityLifecycleTracker");
        }
        return activityTracker;
    }

    public final AutomaticVerificationChecker getAutomaticVerificationChecker() {
        return this.automaticVerificationChecker;
    }

    public final ProcessStateService getProcessStateService$embrace_android_sdk_release() {
        ProcessStateService processStateService = this.processStateService;
        if (processStateService == null) {
            zq3.z("processStateService");
        }
        return processStateService;
    }

    public final VerificationActions getVerificationActions() {
        return this.verificationActions;
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onActivityCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener
    public void onBackground(long j) {
        ProcessStateListener.DefaultImpls.onBackground(this, j);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener
    public void onForeground(boolean z, long j) {
        this.foregroundEventTriggered = true;
        ActivityTracker activityTracker = this.activityLifecycleTracker;
        if (activityTracker == null) {
            zq3.z("activityLifecycleTracker");
        }
        Activity foregroundActivity = activityTracker.getForegroundActivity();
        if (foregroundActivity == null) {
            logError("Cannot restart app, activity is not present");
        } else if (foregroundActivity.getIntent().getBooleanExtra("from_verification", false)) {
            if (this.isResultDisplayed) {
                logInfo("onForeground called but the result was already displayed");
            } else {
                this.handler.postDelayed(new Runnable() { // from class: io.embrace.android.embracesdk.EmbraceAutomaticVerification$onForeground$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        EmbraceAutomaticVerification.this.runEndSession();
                        EmbraceAutomaticVerification.this.displayResult();
                        EmbraceAutomaticVerification.this.clearUserData();
                        EmbraceAutomaticVerification.this.getAutomaticVerificationChecker().deleteFile();
                    }
                }, BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT);
            }
        }
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onView(Activity activity) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onView(this, activity);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onViewClose(Activity activity) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onViewClose(this, activity);
    }

    public final void restartAppFromPendingIntent() {
        ActivityTracker activityTracker = this.activityLifecycleTracker;
        if (activityTracker == null) {
            zq3.z("activityLifecycleTracker");
        }
        Activity foregroundActivity = activityTracker.getForegroundActivity();
        if (foregroundActivity == null) {
            logError("Cannot restart app, activity is not present");
            return;
        }
        Intent intent = foregroundActivity.getIntent();
        intent.addFlags(268468224);
        intent.putExtra("from_verification", true);
        foregroundActivity.finish();
        foregroundActivity.startActivity(intent);
        System.exit(2);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public final void runEndSession() {
        Embrace.getInstance().endSession();
        logInfo("End session manually");
    }

    public final void setActivityLifecycleTracker$embrace_android_sdk_release(ActivityTracker activityTracker) {
        zq3.h(activityTracker, "<set-?>");
        this.activityLifecycleTracker = activityTracker;
    }

    public final void setActivityListener() {
        if (this.activityLifecycleTracker == null) {
            EmbraceImpl impl = Embrace.getImpl();
            zq3.g(impl, "Embrace.getImpl()");
            ActivityTracker activityLifecycleTracker = impl.getActivityLifecycleTracker();
            if (activityLifecycleTracker == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.activityLifecycleTracker = activityLifecycleTracker;
        }
        if (this.processStateService == null) {
            EmbraceImpl impl2 = Embrace.getImpl();
            zq3.g(impl2, "Embrace.getImpl()");
            ProcessStateService activityService = impl2.getActivityService();
            if (activityService == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.processStateService = activityService;
        }
        ActivityTracker activityTracker = this.activityLifecycleTracker;
        if (activityTracker == null) {
            zq3.z("activityLifecycleTracker");
        }
        activityTracker.addListener(this);
        ProcessStateService processStateService = this.processStateService;
        if (processStateService == null) {
            zq3.z("processStateService");
        }
        processStateService.addListener(this);
    }

    public final void setAutomaticVerificationChecker(AutomaticVerificationChecker automaticVerificationChecker) {
        zq3.h(automaticVerificationChecker, "<set-?>");
        this.automaticVerificationChecker = automaticVerificationChecker;
    }

    public final void setProcessStateService$embrace_android_sdk_release(ProcessStateService processStateService) {
        zq3.h(processStateService, "<set-?>");
        this.processStateService = processStateService;
    }

    public final void setVerificationActions(VerificationActions verificationActions) {
        zq3.h(verificationActions, "<set-?>");
        this.verificationActions = verificationActions;
    }

    public final void startVerification() {
        ActivityTracker activityTracker = this.activityLifecycleTracker;
        if (activityTracker == null) {
            zq3.z("activityLifecycleTracker");
        }
        Activity foregroundActivity = activityTracker.getForegroundActivity();
        if (foregroundActivity == null) {
            logError("Embrace SDK cannot run the verification in this moment, Activity is not present");
            return;
        }
        try {
            if (this.automaticVerificationChecker.createFile(foregroundActivity)) {
                String string = foregroundActivity.getString(R.string.automatic_verification_started);
                zq3.g(string, "activity.getString(R.str…tic_verification_started)");
                showToast(foregroundActivity, string);
                this.verificationActions.runActions();
            } else {
                logInfo("Verification almost ready...");
                this.handler.postDelayed(new Runnable() { // from class: io.embrace.android.embracesdk.EmbraceAutomaticVerification$startVerification$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        EmbraceAutomaticVerification.this.verifyLifecycle();
                    }
                }, BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT);
            }
        } catch (IOException e) {
            logInternalError(e, "Embrace SDK cannot run the verification in this moment");
            String string2 = foregroundActivity.getString(R.string.automatic_verification_not_started);
            zq3.g(string2, "activity.getString(R.str…verification_not_started)");
            showToast(foregroundActivity, string2);
        }
    }

    public final void verifyIntegration() {
        EmbraceAutomaticVerification embraceAutomaticVerification = instance;
        embraceAutomaticVerification.setActivityListener();
        embraceAutomaticVerification.runVerifyIntegration();
    }

    public EmbraceAutomaticVerification(ScheduledExecutorService scheduledExecutorService) {
        zq3.h(scheduledExecutorService, "scheduledExecutorService");
        this.scheduledExecutorService = scheduledExecutorService;
        this.handler = new Handler(Looper.getMainLooper());
        this.automaticVerificationChecker = new AutomaticVerificationChecker();
        Embrace embrace = Embrace.getInstance();
        zq3.g(embrace, "Embrace.getInstance()");
        this.verificationActions = new VerificationActions(embrace, this.automaticVerificationChecker);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ EmbraceAutomaticVerification(java.util.concurrent.ScheduledExecutorService r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            java.lang.String r2 = "Executors.newSingleThreadScheduledExecutor()"
            defpackage.zq3.g(r1, r2)
        Ld:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.EmbraceAutomaticVerification.<init>(java.util.concurrent.ScheduledExecutorService, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
