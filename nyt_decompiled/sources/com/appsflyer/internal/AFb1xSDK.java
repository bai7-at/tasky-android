package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class AFb1xSDK {
    public static AFa1zSDK AFInAppEventParameterName = null;

    @VisibleForTesting
    public static long valueOf = 500;

    /* renamed from: com.appsflyer.internal.AFb1xSDK$5, reason: invalid class name */
    final class AnonymousClass5 implements Application.ActivityLifecycleCallbacks {
        boolean AFInAppEventParameterName = true;
        private /* synthetic */ Executor valueOf;
        boolean values;

        AnonymousClass5(Executor executor) {
            this.valueOf = executor;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NonNull final Activity activity, Bundle bundle) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1xSDK.5.3
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1tSDK.AFKeystoreWrapper();
                    Intent intent = activity.getIntent();
                    if (AFa1tSDK.valueOf(intent) == null || intent == AFa1tSDK.valueOf) {
                        return;
                    }
                    AFa1tSDK.valueOf = intent;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NonNull final Activity activity) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1xSDK.5.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass5.this.AFInAppEventParameterName = true;
                    final Context applicationContext = activity.getApplicationContext();
                    try {
                        new Timer().schedule(new TimerTask() { // from class: com.appsflyer.internal.AFb1xSDK.5.1.4
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public final void run() {
                                AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                if (anonymousClass5.values && anonymousClass5.AFInAppEventParameterName) {
                                    anonymousClass5.values = false;
                                    try {
                                        AFb1xSDK.AFInAppEventParameterName.AFInAppEventType(applicationContext);
                                    } catch (Exception e) {
                                        AFLogger.afErrorLog("Listener threw exception! ", e);
                                    }
                                }
                            }
                        }, AFb1xSDK.valueOf);
                    } catch (Throwable th) {
                        AFLogger.afErrorLog("Background task failed with a throwable: ", th);
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(final Activity activity) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1xSDK.5.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (!AnonymousClass5.this.values) {
                        try {
                            AFb1xSDK.AFInAppEventParameterName.AFInAppEventParameterName(activity);
                        } catch (Exception e) {
                            AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
                        }
                    }
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    anonymousClass5.AFInAppEventParameterName = false;
                    anonymousClass5.values = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    public interface AFa1zSDK {
        void AFInAppEventParameterName(Activity activity);

        void AFInAppEventType(Context context);
    }

    static void AFInAppEventParameterName(Context context, AFa1zSDK aFa1zSDK, Executor executor) {
        AFInAppEventParameterName = aFa1zSDK;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(executor);
        if (context instanceof Activity) {
            anonymousClass5.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(anonymousClass5);
    }
}
