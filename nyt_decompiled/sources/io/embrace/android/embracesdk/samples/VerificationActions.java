package io.embrace.android.embracesdk.samples;

import android.os.Handler;
import android.os.Looper;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import defpackage.du8;
import defpackage.gm0;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.yj0;
import defpackage.zj8;
import defpackage.zq3;
import io.embrace.android.embracesdk.BuildConfig;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.Severity;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class VerificationActions {
    private static final long ANR_DURATION_MILLIS = 2000;
    public static final Companion Companion = new Companion(null);
    private static final long MOMENT_DURATION_MILLIS = 3000;
    private static final long THROW_EXCEPTION_DELAY_MILLIS = 100;
    private static final String embraceChangelogLink = "https://embrace.io/docs/android/changelog/";
    private static final String networkingGetUrl = "https://dash-api.embrace.io/external/sdk/android/version";
    private static final String networkingPostBody = "{\"key_one\":\"value_one\"}";
    private static final String networkingPostUrl = "https://httpbin.org/post";
    private static final String networkingWrongUrl = "https://httpbin.org/deaasd/ASdasdkjl";
    private final List<Pair<qs2, String>> actionsToVerify;
    private final AutomaticVerificationChecker automaticVerificationChecker;
    private int currentStep;
    private final Embrace embraceInstance;
    private final Handler handler;
    private final Map<String, Object> sampleProperties;
    private final int totalSteps;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public VerificationActions(Embrace embrace, AutomaticVerificationChecker automaticVerificationChecker) {
        zq3.h(embrace, "embraceInstance");
        zq3.h(automaticVerificationChecker, "automaticVerificationChecker");
        this.embraceInstance = embrace;
        this.automaticVerificationChecker = automaticVerificationChecker;
        this.handler = new Handler(Looper.getMainLooper());
        List<Pair<qs2, String>> o = i.o(new Pair(new qs2() { // from class: io.embrace.android.embracesdk.samples.VerificationActions$actionsToVerify$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                invoke();
                return ww8.a;
            }

            public final void invoke() {
                VerificationActions.this.setUserData();
            }
        }, "Set user data"), new Pair(new qs2() { // from class: io.embrace.android.embracesdk.samples.VerificationActions$actionsToVerify$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                invoke();
                return ww8.a;
            }

            public final void invoke() {
                VerificationActions.this.executeLogsActions();
            }
        }, "Log messages"), new Pair(new qs2() { // from class: io.embrace.android.embracesdk.samples.VerificationActions$actionsToVerify$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                invoke();
                return ww8.a;
            }

            public final void invoke() {
                VerificationActions.this.executeMoment();
            }
        }, "Trigger moment"), new Pair(new qs2() { // from class: io.embrace.android.embracesdk.samples.VerificationActions$actionsToVerify$4
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                invoke();
                return ww8.a;
            }

            public final void invoke() {
                VerificationActions.this.executeNetworkHttpGETRequest();
            }
        }, "Executing network request: GET"), new Pair(new qs2() { // from class: io.embrace.android.embracesdk.samples.VerificationActions$actionsToVerify$5
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                invoke();
                return ww8.a;
            }

            public final void invoke() {
                VerificationActions.this.executeNetworkHttpPOSTRequest();
            }
        }, "Executing network request: POST"), new Pair(new qs2() { // from class: io.embrace.android.embracesdk.samples.VerificationActions$actionsToVerify$6
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                invoke();
                return ww8.a;
            }

            public final void invoke() {
                VerificationActions.this.executeNetworkHttpWrongRequest();
            }
        }, "Executing network request: testing a wrong url"), new Pair(new qs2() { // from class: io.embrace.android.embracesdk.samples.VerificationActions$actionsToVerify$7
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                invoke();
                return ww8.a;
            }

            public final void invoke() {
                VerificationActions.this.triggerAnr();
            }
        }, "Causing an ANR, the application will be tilt"), new Pair(new qs2() { // from class: io.embrace.android.embracesdk.samples.VerificationActions$actionsToVerify$8
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                invoke();
                return ww8.a;
            }

            public final void invoke() {
                VerificationActions.this.throwAnException();
            }
        }, "Throwing an Exception! 💣"));
        this.actionsToVerify = o;
        this.totalSteps = o.size();
        this.sampleProperties = t.m(du8.a("String", "Test String"), du8.a("LongString", "This value will be trimmed Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum. In culpa qui officia deserunt mollit anim id est laborum."), du8.a("Float", Float.valueOf(1.0f)), du8.a("Nested Properties", t.m(du8.a(Tag.A, "b"), du8.a(QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN))));
    }

    private final void checkEmbraceSDKVersion(String str) {
        if (new ComparableVersion(BuildConfig.VERSION_NAME).compareTo(new ComparableVersion(str)) < 0) {
            logInfo("[EmbraceVerification] Note that there is a newer version of Embrace available 🙌! You can read the changelog for " + str + " here: https://embrace.io/docs/android/changelog/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeLogsActions() {
        this.embraceInstance.logMessage("test info", Severity.INFO, this.sampleProperties);
        this.embraceInstance.logMessage("test warn", Severity.WARNING, this.sampleProperties);
        this.embraceInstance.logException(new Throwable("Sample throwable"), Severity.ERROR, this.sampleProperties, "test error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeMoment() {
        final String str = "Verify Integration Moment";
        final String str2 = "Verify Integration identifier";
        this.embraceInstance.startMoment("Verify Integration Moment", "Verify Integration identifier", this.sampleProperties);
        this.handler.postDelayed(new Runnable() { // from class: io.embrace.android.embracesdk.samples.VerificationActions$executeMoment$1
            @Override // java.lang.Runnable
            public final void run() {
                Embrace embrace;
                embrace = VerificationActions.this.embraceInstance;
                embrace.endMoment(str, str2);
            }
        }, MOMENT_DURATION_MILLIS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeNetworkHttpPOSTRequest() {
        URLConnection openConnection = new URL(networkingPostUrl).openConnection();
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.writeBytes(networkingPostBody);
            ww8 ww8Var = ww8.a;
            gm0.a(dataOutputStream, null);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                return;
            }
            throw new VerifyIntegrationException("RESPONSE CODE IS " + responseCode);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeNetworkHttpWrongRequest() {
        URLConnection openConnection = new URL(networkingWrongUrl).openConnection();
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        int responseCode = ((HttpURLConnection) openConnection).getResponseCode();
        if (responseCode == 404) {
            return;
        }
        throw new VerifyIntegrationException("RESPONSE CODE IS " + responseCode);
    }

    private final void logError(String str) {
        this.embraceInstance.getInternalInterface().logError("[EmbraceVerification] " + str, null, null, false);
    }

    private final void logInfo(String str) {
        this.embraceInstance.getInternalInterface().logInfo("[EmbraceVerification] " + str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUserData() {
        this.embraceInstance.setUserIdentifier("1234567890");
        this.embraceInstance.setUsername("Mr. Automated User");
        this.embraceInstance.setUserEmail("automated@embrace.io");
        this.embraceInstance.setUserAsPayer();
        this.embraceInstance.addUserPersona("userPersona");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwAnException() {
        this.handler.postDelayed(new Runnable() { // from class: io.embrace.android.embracesdk.samples.VerificationActions$throwAnException$1
            @Override // java.lang.Runnable
            public final void run() {
                throw new VerifyIntegrationException("Forced Exception to verify integration");
            }
        }, THROW_EXCEPTION_DELAY_MILLIS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerAnr() {
        this.handler.post(new Runnable() { // from class: io.embrace.android.embracesdk.samples.VerificationActions$triggerAnr$1
            @Override // java.lang.Runnable
            public final void run() {
                Thread.sleep(2000L);
            }
        });
        logInfo("[EmbraceVerification] ANR Finished");
    }

    private final void verifyAction(qs2 qs2Var, String str) {
        this.currentStep++;
        try {
            logInfo(" ✓ Step " + this.currentStep + '/' + this.totalSteps + ": " + str);
            qs2Var.mo865invoke();
        } catch (Throwable th) {
            logError("[EmbraceVerification] -- " + str + " ERROR " + th.getLocalizedMessage());
            this.automaticVerificationChecker.addException(th);
        }
    }

    public final void executeNetworkHttpGETRequest() {
        URLConnection openConnection = new URL(networkingGetUrl).openConnection();
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestProperty(this.embraceInstance.getTraceIdHeader(), "traceId : " + this.embraceInstance.getTraceIdHeader());
        InputStream inputStream = httpURLConnection.getInputStream();
        zq3.g(inputStream, "connection.inputStream");
        String f = zj8.f(new BufferedReader(new InputStreamReader(inputStream, yj0.b), 8192));
        if (httpURLConnection.getResponseCode() == 200) {
            String string = new JSONObject(f).getString("value");
            zq3.g(string, "JSONObject(data).getString(\"value\")");
            checkEmbraceSDKVersion(string);
        } else {
            throw new VerifyIntegrationException("RESPONSE CODE IS " + httpURLConnection.getResponseCode());
        }
    }

    public final void runActions() {
        logInfo("[EmbraceVerification] Starting Verification...");
        this.embraceInstance.addBreadcrumb("This is a breadcrumb");
        Iterator<T> it2 = this.actionsToVerify.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            verifyAction((qs2) pair.c(), (String) pair.d());
        }
    }
}
