package co.datadome.sdk;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.TrafficStats;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import co.datadome.sdk.DataDomeSDK;
import co.datadome.sdk.c;
import co.datadome.sdk.m;
import com.amazonaws.services.s3.util.Mimetypes;
import defpackage.b74;
import defpackage.sn9;
import defpackage.un9;
import defpackage.yn9;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {
    public static final String DATADOME_COOKIE_PREFIX = "datadome=";
    public static final String HTTP_HEADER_ACCEPT = "Accept";
    public static final String HTTP_HEADER_COOKIE = "Cookie";
    public static final String HTTP_HEADER_SET_COOKIE = "Set-Cookie";
    protected static String t = "";
    private static ConditionVariable u = new ConditionVariable();
    private static AtomicBoolean v = new AtomicBoolean(false);
    private static List w = Collections.synchronizedList(new ArrayList());
    private Boolean a;
    private Boolean b;
    public Boolean bypassDataDomeAcceptHeader;
    private Boolean c;
    private Boolean d;
    protected DataDomeSDK.BackBehaviour e;
    protected WeakReference f;
    protected WeakReference g;
    protected String h;
    protected String i;
    protected DataDomeSDKListener j;
    protected DataDomeSDKManualIntegrationListener k;
    private boolean l;
    private boolean m;
    private boolean n;
    protected String o;
    private m.a p;
    private ArrayList q;
    private ExecutorService r;
    private b s;
    public String userAgent;

    class a implements Runnable {
        final /* synthetic */ m a;

        a(m mVar) {
            this.a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Response execute;
            try {
                try {
                    Log.i("DataDome", "Logging events");
                    execute = new OkHttpClient.Builder().callTimeout(1L, TimeUnit.SECONDS).addNetworkInterceptor(new C0134c(new Random().nextInt(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT))).build().newCall(new Request.Builder().post(this.a.a()).url("https://api-sdk.datadome.co/sdk/").build()).execute();
                    try {
                    } catch (Throwable th) {
                        if (execute != null) {
                            try {
                                execute.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    Log.e("DataDome", "Event Tracker", e);
                }
                if (execute.code() == 200 && execute.body() != null) {
                    Map a = sn9.a(execute.body().string());
                    String str = (String) a.get(ChallengeActivity.ARG_COOKIE);
                    if (TextUtils.isEmpty(str)) {
                        StringBuilder sb = new StringBuilder("Send tracking payload failed\ncause: ");
                        sb.append(a.containsKey("body") ? (String) a.get("body") : "Unknown error");
                        Log.e("DataDome", sb.toString());
                    } else {
                        c cVar = (c) c.this.g.get();
                        if (cVar != null) {
                            Objects.requireNonNull(str);
                            cVar.p(str);
                        }
                        c.this.H();
                    }
                    execute.close();
                }
                execute.close();
                c.this.r(new Date());
                d.a("Failed sending tracking payload " + execute.body());
                d.a("Failed sending tracking payload with code " + execute.code());
                execute.close();
            } finally {
                i.a().c(false);
            }
        }
    }

    class b extends BroadcastReceiver {
        yn9 a;

        public b(yn9 yn9Var) {
            this.a = yn9Var;
        }

        private void a() {
            c.resetHandlingResponseInProgress();
            Intent intent = new Intent();
            intent.setAction(ChallengeActivity.BROADCAST_ACTION);
            intent.putExtra(ChallengeActivity.ARG_CAPTCHA_RESULT, 0);
            b74.b(((Application) c.this.f.get()).getApplicationContext()).d(intent);
        }

        private void b(Context context, Intent intent) {
            c.this.u(false);
            String stringExtra = intent.getStringExtra(ChallengeActivity.ARG_COOKIE);
            String stringExtra2 = intent.getStringExtra(ChallengeActivity.ARG_URL);
            Log.i("DataDome", "Did resolve challenge with cookie " + stringExtra);
            c.this.q.clear();
            c.this.p(stringExtra);
            yn9 yn9Var = this.a;
            if (yn9Var != null) {
                yn9Var.onCaptchaDismissed();
                this.a.onCaptchaSuccess();
            }
            c.this.logEvent(DataDomeSDK.a.CAPTCHA_SUCCESS.a("sdk"));
            d.a("Challenge succeed with url " + stringExtra2);
            if (c.this.a.booleanValue()) {
                a();
            }
            c.this.A(false);
        }

        private void c() {
            yn9 yn9Var = this.a;
            if (yn9Var != null) {
                yn9Var.onCaptchaLoaded();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra(ChallengeActivity.ARG_CAPTCHA_RESULT, 0);
            if (intExtra == -1) {
                b(context, intent);
                c.this.m = true;
                DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener = c.this.k;
                if (dataDomeSDKManualIntegrationListener != null) {
                    dataDomeSDKManualIntegrationListener.onComplete(null);
                }
            } else if (intExtra == 1) {
                c();
                c.this.u(true);
            } else {
                if (this.a != null && !c.this.m) {
                    this.a.onCaptchaDismissed();
                    this.a.onCaptchaCancelled();
                }
                c cVar = c.this;
                if (cVar.k != null && !cVar.m) {
                    c.this.k.onDismiss();
                }
                c.this.u(false);
                c.this.A(false);
                c.resetHandlingResponseInProgress();
                c.this.logEvent(DataDomeSDK.a.CAPTCHA_FAILURE.a("sdk"));
                d.a("onReceive ->  challenge dismissed");
            }
            if (intExtra == -1 || intExtra == 0) {
                c cVar2 = c.this;
                cVar2.d = Boolean.valueOf(cVar2.m);
                c.I();
            }
        }
    }

    /* renamed from: co.datadome.sdk.c$c, reason: collision with other inner class name */
    private static class C0134c implements Interceptor {
        int a;

        C0134c(int i) {
            this.a = i;
            if (i > 0) {
                TrafficStats.setThreadStatsTag(i);
            }
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            int i = this.a;
            if (i > 0) {
                TrafficStats.setThreadStatsTag(i);
            }
            return chain.proceed(chain.request());
        }
    }

    public c() {
        Boolean bool = Boolean.FALSE;
        this.a = bool;
        this.b = bool;
        this.c = bool;
        this.d = bool;
        this.bypassDataDomeAcceptHeader = bool;
        this.e = DataDomeSDK.BackBehaviour.GO_BACKGROUND;
        this.f = new WeakReference(null);
        this.g = new WeakReference(this);
        this.i = "";
        new ArrayList();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = null;
        this.p = m.a.OKHTTP;
        this.q = new ArrayList();
        this.r = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        r(new Date());
        w.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I() {
        u.open();
    }

    private Boolean J() {
        return Boolean.valueOf(i.a().d(w));
    }

    private static DataDomeSDK.ResponseType c(int i) {
        int i2 = i & 255;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? DataDomeSDK.ResponseType.TRAP : DataDomeSDK.ResponseType.REDIRECT : DataDomeSDK.ResponseType.DEVICE_CHECK : DataDomeSDK.ResponseType.HARD_BLOCK : DataDomeSDK.ResponseType.BLOCK;
    }

    private Boolean d(int i, Map map) {
        String h = h(map);
        d.a("X-DD-B header: " + h);
        boolean z = false;
        if (h != null) {
            try {
                int parseInt = Integer.parseInt(h);
                DataDomeSDK.ResponseType c = c(parseInt);
                this.b = Boolean.valueOf(c == DataDomeSDK.ResponseType.HARD_BLOCK);
                if (c == DataDomeSDK.ResponseType.DEVICE_CHECK && w(parseInt).booleanValue()) {
                    A(true);
                    d.a("Receiving a fast mode device check response");
                }
            } catch (Exception e) {
                Log.e("DataDome", "Failed to convert x-dd-b header to integer " + e.getLocalizedMessage());
            }
        }
        if ((i == 403 || i == 401) && !DataDomeUtils.isNullOrEmpty(h).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean isHandlingResponseInProgress() {
        return Boolean.valueOf(v.get());
    }

    private void j(int i, String str) {
        DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener = this.k;
        if (dataDomeSDKManualIntegrationListener != null) {
            dataDomeSDKManualIntegrationListener.onError(Integer.valueOf(i), "Not captcha's url found");
            v.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(String str, String str2) {
        ArrayList arrayList;
        Application application = (Application) this.f.get();
        if (application == null || application.getBaseContext() == null) {
            Log.e("DataDome", "Failed to display a DataDome challenge page due to an unexpected null application context. A non-null application instance must be provided when the SDK is initialized.");
            if (this.j != null) {
                logEvent(DataDomeSDK.a.NULL_CONTEXT.a("sdk"));
                this.j.onError(504, "Empty application context.");
                return;
            }
            return;
        }
        Context applicationContext = application.getApplicationContext();
        String g = g();
        Intent intent = new Intent();
        intent.setClass(applicationContext, ChallengeActivity.class);
        intent.addFlags(276824064);
        intent.putExtra(ChallengeActivity.ARG_COOKIE, g);
        intent.putExtra(ChallengeActivity.ARG_URL, str);
        intent.putExtra(ChallengeActivity.BACK_BEHAVIOUR, this.e);
        intent.putExtra(ChallengeActivity.RESPONSE_TYPE_IS_HARD_BLOCK, this.b);
        intent.putExtra(ChallengeActivity.RESPONSE_TYPE_IS_HTML, this.c);
        intent.putExtra(ChallengeActivity.REQUEST_URL, str2);
        if (this.c.booleanValue() && !this.q.isEmpty()) {
            intent.putStringArrayListExtra(ChallengeActivity.BLOCKED_RESPONSE_COOKIE, this.q);
        }
        if (this.a.booleanValue()) {
            intent.putExtra(ChallengeActivity.ARG_VISIBILITY, false);
        }
        if (this.n && (arrayList = this.q) != null && arrayList.size() > 0) {
            intent.putStringArrayListExtra(ChallengeActivity.BLOCKED_RESPONSE_COOKIE, this.q);
            intent.putExtra(ChallengeActivity.SFCC_REDIRECTION, this.n);
        }
        intent.putExtra(ChallengeActivity.RESPONSE_PAGE_LANGUAGE, this.o);
        IntentFilter intentFilter = new IntentFilter(ChallengeActivity.BROADCAST_ACTION);
        if (this.s != null) {
            b74.b(applicationContext).e(this.s);
        }
        this.s = new b(this.j);
        b74.b(applicationContext).c(this.s, intentFilter);
        applicationContext.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(Date date) {
        i.a().b(date);
    }

    public static void resetHandlingResponseInProgress() {
        v.set(false);
    }

    private void s(Response response, un9 un9Var) {
        String string;
        Log.i("DataDome", "Handling the blocked response");
        DataDomeSDKListener dataDomeSDKListener = this.j;
        if (dataDomeSDKListener != null) {
            dataDomeSDKListener.onHangOnRequest(response.code());
        }
        try {
            d.a("Blocked response: " + un9Var.b() + "\nFor request " + response.request().url());
            if (response.header("Content-type") == null || !response.header("Content-type").contains(Mimetypes.MIMETYPE_HTML)) {
                this.c = Boolean.FALSE;
                string = new JSONObject(un9Var.b()).getString("url");
            } else {
                this.c = Boolean.TRUE;
                String x = x();
                if (!x.isEmpty()) {
                    this.q.add(x);
                }
                string = un9Var.b();
            }
            if (DataDomeUtils.isNullOrEmpty(string).booleanValue()) {
                DataDomeSDKListener dataDomeSDKListener2 = this.j;
                if (dataDomeSDKListener2 != null) {
                    dataDomeSDKListener2.onError(504, "Challenge URL not found");
                    return;
                }
                return;
            }
            d.a("Challenge content: " + string);
            DataDomeSDKListener dataDomeSDKListener3 = this.j;
            if (dataDomeSDKListener3 != null) {
                dataDomeSDKListener3.willDisplayCaptcha();
            }
            z(string, response.request().url().toString());
            u.close();
            u.block();
        } catch (JSONException e) {
            Log.e("DataDome", "Blocked Response Handling", e);
            DataDomeSDKListener dataDomeSDKListener4 = this.j;
            if (dataDomeSDKListener4 != null) {
                dataDomeSDKListener4.onError(503, "Problem parsing json");
            }
        }
    }

    private void t(Response response, Map map) {
        Log.i("DataDome", "Handling Salesforce blocked response");
        DataDomeSDKListener dataDomeSDKListener = this.j;
        if (dataDomeSDKListener != null) {
            dataDomeSDKListener.onHangOnRequest(response.code());
        }
        String header = response.header("location");
        if (header == null) {
            DataDomeSDKListener dataDomeSDKListener2 = this.j;
            if (dataDomeSDKListener2 != null) {
                dataDomeSDKListener2.onError(504, "Challenge URL not found");
                return;
            }
            return;
        }
        DataDomeSDKListener dataDomeSDKListener3 = this.j;
        if (dataDomeSDKListener3 != null) {
            dataDomeSDKListener3.willDisplayCaptcha();
        }
        d.a("Retrieved challenge URL: " + header + "\nFor request " + response.request().url());
        Iterator<String> it2 = response.headers("set-cookie").iterator();
        while (it2.hasNext()) {
            this.q.add(DataDomeUtils.getCookieValueName(it2.next()));
        }
        String str = (String) map.get("dwsid");
        if (!TextUtils.isEmpty(str)) {
            this.q.add("dwsid=" + str);
        }
        z(header, response.request().url().toString());
        u.close();
        u.block();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(boolean z) {
        this.l = z;
    }

    static Boolean w(int i) {
        DataDomeSDK.ResponseType c = c(i);
        DataDomeSDK.ResponseType responseType = DataDomeSDK.ResponseType.DEVICE_CHECK;
        if (!c.equals(responseType)) {
            return Boolean.FALSE;
        }
        d.a("Response type " + responseType);
        return Boolean.valueOf(((i >> 8) & 1) == 1);
    }

    private void z(final String str, final String str2) {
        try {
            if (this.l) {
                Log.i("DataDome", "Challenge already displayed");
            } else {
                u(true);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ln9
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.q(str, str2);
                    }
                });
            }
        } catch (Exception e) {
            Log.e("DataDome", "Load challenge View", e);
            DataDomeSDKListener dataDomeSDKListener = this.j;
            if (dataDomeSDKListener != null) {
                dataDomeSDKListener.onError(505, "Can't start challenge web view");
            }
        }
    }

    protected void D() {
        if (J().booleanValue()) {
            i.a().c(true);
            this.r.execute(new a(new m(this.j, this.f, new j(g(), t, this.i, this.h, this.userAgent, w), this.p)));
        }
    }

    Boolean f(Response response) {
        if (response.code() != 302) {
            return Boolean.FALSE;
        }
        String header = response.header("location");
        return (header == null || header.isEmpty()) ? Boolean.FALSE : Boolean.valueOf(header.toLowerCase(Locale.ROOT).contains("dduser-challenge"));
    }

    protected String g() {
        return DataDomeUtils.parseCookieValue(x());
    }

    public List<DataDomeEvent> getCurrentEvents() {
        return w;
    }

    protected String h(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getKey()).equalsIgnoreCase("X-DD-B") || ((String) entry.getKey()).equalsIgnoreCase("X-SF-CC-X-dd-b")) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    protected Response i(Response response, Map map, String str, Call call) {
        logEvent(DataDomeSDK.a.RESPONSE_VALIDATION.a("sdk"));
        boolean booleanValue = f(response).booleanValue();
        this.n = booleanValue;
        if (booleanValue && !this.bypassDataDomeAcceptHeader.booleanValue()) {
            Log.e("DataDome", "bypassDataDomeAcceptHeader argument is not enabled is datadome sdk instance");
        }
        m(m.a.OKHTTP);
        if (!d(response.code(), map).booleanValue() && !this.n) {
            DataDomeSDKListener dataDomeSDKListener = this.j;
            if (dataDomeSDKListener != null) {
                dataDomeSDKListener.onDataDomeResponse(response.code(), str);
            }
            D();
            return response;
        }
        Log.i("DataDome", "Blocked request by DataDome");
        un9 un9Var = new un9(call.clone(), map, str);
        synchronized (u) {
            try {
                try {
                    Log.i("DataDome", "Validating the response");
                    this.m = false;
                    if (v.get()) {
                        Log.i("DataDome", "Validating another response already");
                        u.wait();
                    } else {
                        v.set(true);
                        if (this.n) {
                            t(response, map);
                        } else {
                            s(response, un9Var);
                        }
                    }
                    if (!this.d.booleanValue()) {
                        return response;
                    }
                    Response execute = un9Var.a().execute();
                    d.a("Retried failed request " + un9Var.a().request().url() + " finished with code: " + execute.code());
                    return execute;
                } catch (Exception e) {
                    Log.e("DataDome", "Response Handling", e);
                    v.set(false);
                    return response;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void logEvent(DataDomeEvent dataDomeEvent) {
        if (w.size() < 80) {
            try {
                w.add(dataDomeEvent);
            } catch (Exception unused) {
            }
        }
    }

    protected void m(m.a aVar) {
        this.p = aVar;
    }

    protected void n(Boolean bool) {
        d.a.set(bool.booleanValue());
    }

    protected void o(Integer num, Map map, int i, String str, String str2) {
        if (DataDomeUtils.isNullOrEmpty(str2).booleanValue() || !(str2.startsWith("https://") || str2.startsWith("http://"))) {
            throw new IllegalArgumentException("Domain must not be empty in handleResponse method, and must start with Http protocol");
        }
        h(map);
        if (!d(i, map).booleanValue()) {
            DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener = this.k;
            if (dataDomeSDKManualIntegrationListener != null) {
                dataDomeSDKManualIntegrationListener.onDismiss();
            }
            D();
            return;
        }
        Log.i("DataDome", "Blocked request by DataDome");
        try {
            if (v.get()) {
                DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener2 = this.k;
                if (dataDomeSDKManualIntegrationListener2 != null) {
                    dataDomeSDKManualIntegrationListener2.onRequestInProgress(num);
                    return;
                }
                return;
            }
            v.set(true);
            try {
                String isHeaderPresent = DataDomeUtils.isHeaderPresent(map, "Content-type");
                if (isHeaderPresent == null || !isHeaderPresent.contains(Mimetypes.MIMETYPE_HTML)) {
                    this.c = Boolean.FALSE;
                    str = new JSONObject(str).getString("url");
                } else {
                    this.c = Boolean.TRUE;
                    String x = x();
                    if (!x.isEmpty()) {
                        this.q.add(x);
                    }
                }
                if (DataDomeUtils.isNullOrEmpty(str).booleanValue()) {
                    j(num.intValue(), "Not captcha's url found");
                    return;
                }
                DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener3 = this.k;
                if (dataDomeSDKManualIntegrationListener3 != null) {
                    dataDomeSDKManualIntegrationListener3.willDisplayCaptcha();
                }
                Log.i("DataDome", "Showing captcha");
                z(str, str2);
                u.close();
                u.block();
                v.set(false);
                DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener4 = this.k;
                if (dataDomeSDKManualIntegrationListener4 != null) {
                    dataDomeSDKManualIntegrationListener4.onDismiss();
                }
            } catch (JSONException e) {
                j(num.intValue(), "Problem parsing json");
                new Handler().postDelayed(new Runnable() { // from class: mn9
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.I();
                    }
                }, 500L);
                Log.e("DataDome", "Manual Response Handling", e);
            }
        } catch (Exception e2) {
            j(num.intValue(), "Exception error: " + e2.getLocalizedMessage());
            Log.e("DataDome", "Manual Response Handling", e2);
        }
    }

    protected void p(String str) {
        Application application = (Application) this.f.get();
        if (application == null || application.getBaseContext() == null) {
            Log.e("DataDome", "Failed to set a cookie value for DataDome due to an unexpected null application context. A non-null application instance must be provided when the SDK is initialized.");
            return;
        }
        h d = h.d(application, t);
        if (!str.startsWith(DATADOME_COOKIE_PREFIX)) {
            str = DATADOME_COOKIE_PREFIX + str;
        }
        d.g(str);
    }

    protected String x() {
        Application application = (Application) this.f.get();
        if (application != null && application.getBaseContext() != null) {
            String h = h.d(application, t).h();
            return (h == null || !h.startsWith(DATADOME_COOKIE_PREFIX)) ? "" : h;
        }
        if (this.j != null) {
            logEvent(DataDomeSDK.a.NULL_CONTEXT.a("sdk"));
            this.j.onError(504, "Empty application context.");
        }
        return "";
    }
}
