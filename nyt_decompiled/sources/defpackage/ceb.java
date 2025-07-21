package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ceb {
    private final AtomicReference a = new AtomicReference(null);
    private final Object b = new Object();
    private String c = null;
    final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicInteger e = new AtomicInteger(-1);
    private final AtomicReference f = new AtomicReference(null);
    private final AtomicReference g = new AtomicReference(null);
    private final ConcurrentMap h = new ConcurrentHashMap(9);
    private final AtomicReference i = new AtomicReference(null);
    private final BlockingQueue j = new ArrayBlockingQueue(20);
    private final Object k = new Object();

    static final boolean q(Context context) {
        if (!((Boolean) pla.c().a(mpa.h0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) pla.c().a(mpa.i0)).intValue()) {
            return false;
        }
        if (((Boolean) pla.c().a(mpa.j0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object r(String str, Context context) {
        if (!w(context, "com.google.android.gms.measurement.AppMeasurement", this.f, true)) {
            return null;
        }
        try {
            return s(context, str).invoke(this.f.get(), null);
        } catch (Exception unused) {
            this.v(str, true);
            return null;
        }
    }

    private final Method s(Context context, String str) {
        Method method = (Method) this.h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            this.h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            v(str, false);
            return null;
        }
    }

    private final void t(Context context, String str, String str2) {
        if (w(context, "com.google.android.gms.measurement.AppMeasurement", this.f, true)) {
            Method method = (Method) this.h.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.h.put(str2, method);
                } catch (Exception unused) {
                    v(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f.get(), str);
                pzc.k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                v(str2, false);
            }
        }
    }

    private final void u(Context context, String str, String str2, Bundle bundle) {
        if (p(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                fgb.e("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (w(context, "com.google.android.gms.measurement.AppMeasurement", this.f, true)) {
                Method method = (Method) this.h.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.h.put("logEventInternal", method);
                    } catch (Exception unused) {
                        v("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    v("logEventInternal", true);
                }
            }
        }
    }

    private final void v(String str, boolean z) {
        if (this.d.get()) {
            return;
        }
        fgb.g("Invoke Firebase method " + str + " error.");
        if (z) {
            fgb.g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.d.set(true);
        }
    }

    private final boolean w(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            zdb.a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            return true;
        } catch (Exception unused) {
            v("getInstance", z);
            return false;
        }
    }

    public final String a(Context context) {
        Object r;
        if (p(context) && (r = r("generateEventId", context)) != null) {
            return r.toString();
        }
        return null;
    }

    public final String b(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!p(context)) {
            return null;
        }
        long longValue = ((Long) pla.c().a(mpa.f0)).longValue();
        if (longValue < 0) {
            return (String) r("getAppInstanceId", context);
        }
        if (this.a.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = bde.a().b(((Integer) pla.c().a(mpa.g0)).intValue(), new beb(this), 2);
            } else {
                zoa zoaVar = mpa.g0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) pla.c().a(zoaVar)).intValue(), ((Integer) pla.c().a(zoaVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new beb(this));
            }
            zdb.a(this.a, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) this.a.get()).submit(new Callable() { // from class: aeb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ceb.this.e(context);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String c(Context context) {
        if (p(context) && w(context, "com.google.android.gms.measurement.AppMeasurement", this.f, true)) {
            try {
                String str = (String) s(context, "getCurrentScreenName").invoke(this.f.get(), null);
                if (str == null) {
                    str = (String) s(context, "getCurrentScreenClass").invoke(this.f.get(), null);
                }
                return str == null ? "" : str;
            } catch (Exception unused) {
                v("getCurrentScreenName", false);
            }
        }
        return "";
    }

    public final String d(Context context) {
        if (!p(context)) {
            return null;
        }
        synchronized (this.b) {
            try {
                String str = this.c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) r("getGmpAppId", context);
                this.c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ String e(Context context) {
        return (String) r("getAppInstanceId", context);
    }

    public final void f(Context context, String str) {
        if (p(context)) {
            t(context, str, "beginAdUnitExposure");
        }
    }

    public final void g(Context context, String str) {
        if (p(context)) {
            t(context, str, "endAdUnitExposure");
        }
    }

    public final void h(Context context, String str) {
        u(context, "_aa", str, null);
    }

    public final void i(Context context, String str) {
        u(context, "_aq", str, null);
    }

    public final void j(Context context, String str) {
        u(context, "_ac", str, null);
    }

    public final void k(Context context, String str) {
        u(context, "_ai", str, null);
    }

    public final void l(Context context, String str, String str2, String str3, int i) {
        if (p(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            u(context, "_ar", str, bundle);
            pzc.k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final void m(Context context, zzl zzlVar) {
        if (((Boolean) pla.c().a(mpa.m0)).booleanValue() && p(context) && q(context)) {
            synchronized (this.k) {
            }
        }
    }

    public final void n(Context context, zzff zzffVar) {
        deb.d(context).b().c(zzffVar);
        if (((Boolean) pla.c().a(mpa.m0)).booleanValue() && p(context) && q(context)) {
            synchronized (this.k) {
            }
        }
    }

    public final void o(Context context, String str) {
        if (p(context) && (context instanceof Activity) && w(context, "com.google.firebase.analytics.FirebaseAnalytics", this.g, false)) {
            Method method = (Method) this.h.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.h.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    v("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.g.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                v("setCurrentScreen", false);
            }
        }
    }

    public final boolean p(Context context) {
        if (((Boolean) pla.c().a(mpa.a0)).booleanValue() && !this.d.get()) {
            if (((Boolean) pla.c().a(mpa.k0)).booleanValue()) {
                return true;
            }
            if (this.e.get() == -1) {
                kia.b();
                if (!tfb.u(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    kia.b();
                    if (tfb.v(context)) {
                        fgb.g("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.e.set(0);
                    }
                }
                this.e.set(1);
            }
            if (this.e.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
