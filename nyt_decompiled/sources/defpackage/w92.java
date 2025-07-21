package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import defpackage.n90;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.b0;
import kotlin.text.h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class w92 {
    private static Executor d;
    private static volatile String e;
    private static volatile String f;
    private static volatile String g;
    private static volatile Boolean h;
    private static volatile boolean j;
    private static boolean k;
    private static x74 l;
    private static Context m;
    public static boolean q;
    public static boolean r;
    public static boolean s;
    private static boolean x;
    public static final w92 a = new w92();
    private static final String b = w92.class.getCanonicalName();
    private static final HashSet c = b0.f(LoggingBehavior.DEVELOPER_ERRORS);
    private static AtomicLong i = new AtomicLong(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
    private static int n = 64206;
    private static final ReentrantLock o = new ReentrantLock();
    private static String p = yk7.a();
    private static final AtomicBoolean t = new AtomicBoolean(false);
    private static volatile String u = "instagram.com";
    private static volatile String v = "facebook.com";
    private static a w = new a() { // from class: n92
        @Override // w92.a
        public final GraphRequest a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.b bVar) {
            GraphRequest B;
            B = w92.B(accessToken, str, jSONObject, bVar);
            return B;
        }
    };

    public interface a {
        GraphRequest a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.b bVar);
    }

    public interface b {
        void a();
    }

    private w92() {
    }

    public static final String A() {
        return "14.1.1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GraphRequest B(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.b bVar) {
        return GraphRequest.n.A(accessToken, str, jSONObject, bVar);
    }

    public static final boolean C() {
        return j;
    }

    public static final synchronized boolean D() {
        boolean z;
        synchronized (w92.class) {
            z = x;
        }
        return z;
    }

    public static final boolean E() {
        return t.get();
    }

    public static final boolean F() {
        return k;
    }

    public static final boolean G(LoggingBehavior loggingBehavior) {
        boolean z;
        zq3.h(loggingBehavior, "behavior");
        HashSet hashSet = c;
        synchronized (hashSet) {
            if (C()) {
                z = hashSet.contains(loggingBehavior);
            }
        }
        return z;
    }

    public static final void H(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return;
            }
            if (e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    zq3.g(locale, "ROOT");
                    String lowerCase = str.toLowerCase(locale);
                    zq3.g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (h.K(lowerCase, "fb", false, 2, null)) {
                        String substring = str.substring(2);
                        zq3.g(substring, "(this as java.lang.String).substring(startIndex)");
                        e = substring;
                    } else {
                        e = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f == null) {
                f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (g == null) {
                g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (n == 64206) {
                n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (h == null) {
                h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void I(Context context, String str) {
        try {
            if (c11.d(this)) {
                return;
            }
            try {
                kv e2 = kv.f.e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String q2 = zq3.q(str, "ping");
                long j2 = sharedPreferences.getLong(q2, 0L);
                try {
                    AppEventsLoggerUtility appEventsLoggerUtility = AppEventsLoggerUtility.a;
                    JSONObject a2 = AppEventsLoggerUtility.a(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, e2, AppEventsLogger.b.c(context), y(context), context);
                    z38 z38Var = z38.a;
                    String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                    zq3.g(format, "java.lang.String.format(format, *args)");
                    GraphRequest a3 = w.a(null, format, a2, null);
                    if (j2 == 0 && a3.k().b() == null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(q2, System.currentTimeMillis());
                        edit.apply();
                    }
                } catch (JSONException e3) {
                    throw new FacebookException("An error occurred while publishing install.", e3);
                }
            } catch (Exception e4) {
                g29.e0("Facebook-publish", e4);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public static final void J(Context context, final String str) {
        if (c11.d(w92.class)) {
            return;
        }
        try {
            zq3.h(context, "context");
            zq3.h(str, "applicationId");
            final Context applicationContext = context.getApplicationContext();
            t().execute(new Runnable() { // from class: v92
                @Override // java.lang.Runnable
                public final void run() {
                    w92.K(applicationContext, str);
                }
            });
            FeatureManager featureManager = FeatureManager.a;
            if (FeatureManager.g(FeatureManager.Feature.OnDeviceEventProcessing) && te5.d()) {
                te5.g(str, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th) {
            c11.b(th, w92.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(Context context, String str) {
        zq3.h(str, "$applicationId");
        w92 w92Var = a;
        zq3.g(context, "applicationContext");
        w92Var.I(context, str);
    }

    public static final synchronized void L(Context context) {
        synchronized (w92.class) {
            zq3.h(context, "applicationContext");
            M(context, null);
        }
    }

    public static final synchronized void M(Context context, final b bVar) {
        synchronized (w92.class) {
            zq3.h(context, "applicationContext");
            AtomicBoolean atomicBoolean = t;
            if (atomicBoolean.get()) {
                if (bVar != null) {
                    bVar.a();
                }
                return;
            }
            v29.g(context, false);
            v29.i(context, false);
            Context applicationContext = context.getApplicationContext();
            zq3.g(applicationContext, "applicationContext.applicationContext");
            m = applicationContext;
            AppEventsLogger.b.c(context);
            Context context2 = m;
            if (context2 == null) {
                zq3.z("applicationContext");
                throw null;
            }
            H(context2);
            String str = e;
            if (str == null || str.length() == 0) {
                throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            String str2 = g;
            if (str2 == null || str2.length() == 0) {
                throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
            }
            atomicBoolean.set(true);
            if (o()) {
                j();
            }
            Context context3 = m;
            if (context3 == null) {
                zq3.z("applicationContext");
                throw null;
            }
            if ((context3 instanceof Application) && d19.d()) {
                v4 v4Var = v4.a;
                Context context4 = m;
                if (context4 == null) {
                    zq3.z("applicationContext");
                    throw null;
                }
                v4.x((Application) context4, e);
            }
            FetchedAppSettingsManager.g();
            c25.E();
            n90.a aVar = n90.b;
            Context context5 = m;
            if (context5 == null) {
                zq3.z("applicationContext");
                throw null;
            }
            aVar.a(context5);
            l = new x74(new Callable() { // from class: o92
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    File N;
                    N = w92.N();
                    return N;
                }
            });
            FeatureManager featureManager = FeatureManager.a;
            FeatureManager.a(FeatureManager.Feature.Instrument, new FeatureManager.a() { // from class: p92
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    w92.O(z);
                }
            });
            FeatureManager.a(FeatureManager.Feature.AppEvents, new FeatureManager.a() { // from class: q92
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    w92.P(z);
                }
            });
            FeatureManager.a(FeatureManager.Feature.ChromeCustomTabsPrefetching, new FeatureManager.a() { // from class: r92
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    w92.Q(z);
                }
            });
            FeatureManager.a(FeatureManager.Feature.IgnoreAppSwitchToLoggedOut, new FeatureManager.a() { // from class: s92
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    w92.R(z);
                }
            });
            FeatureManager.a(FeatureManager.Feature.BypassAppSwitch, new FeatureManager.a() { // from class: t92
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    w92.S(z);
                }
            });
            t().execute(new FutureTask(new Callable(bVar) { // from class: u92
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void T;
                    T = w92.T(null);
                    return T;
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File N() {
        Context context = m;
        if (context != null) {
            return context.getCacheDir();
        }
        zq3.z("applicationContext");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(boolean z) {
        if (z) {
            em3.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(boolean z) {
        if (z) {
            fm.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(boolean z) {
        if (z) {
            q = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(boolean z) {
        if (z) {
            r = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(boolean z) {
        if (z) {
            s = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void T(b bVar) {
        t2.f.e().j();
        p46.d.a().d();
        if (AccessToken.Companion.g()) {
            Profile.b bVar2 = Profile.Companion;
            if (bVar2.b() == null) {
                bVar2.a();
            }
        }
        if (bVar != null) {
            bVar.a();
        }
        AppEventsLogger.a aVar = AppEventsLogger.b;
        aVar.f(l(), e);
        d19.k();
        Context applicationContext = l().getApplicationContext();
        zq3.g(applicationContext, "getApplicationContext().applicationContext");
        aVar.g(applicationContext).a();
        return null;
    }

    public static final void j() {
        x = true;
    }

    public static final boolean k() {
        return d19.b();
    }

    public static final Context l() {
        v29.o();
        Context context = m;
        if (context != null) {
            return context;
        }
        zq3.z("applicationContext");
        throw null;
    }

    public static final String m() {
        v29.o();
        String str = e;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String n() {
        v29.o();
        return f;
    }

    public static final boolean o() {
        return d19.c();
    }

    public static final boolean p() {
        return d19.d();
    }

    public static final int q() {
        v29.o();
        return n;
    }

    public static final String r() {
        v29.o();
        String str = g;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean s() {
        return d19.e();
    }

    public static final Executor t() {
        ReentrantLock reentrantLock = o;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            ww8 ww8Var = ww8.a;
            reentrantLock.unlock();
            Executor executor = d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String u() {
        return v;
    }

    public static final String v() {
        g29 g29Var = g29.a;
        String str = b;
        z38 z38Var = z38.a;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{p}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        g29.f0(str, format);
        return p;
    }

    public static final String w() {
        AccessToken e2 = AccessToken.Companion.e();
        return g29.B(e2 != null ? e2.h() : null);
    }

    public static final String x() {
        return u;
    }

    public static final boolean y(Context context) {
        zq3.h(context, "context");
        v29.o();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final long z() {
        v29.o();
        return i.get();
    }
}
