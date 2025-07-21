package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class v4 {
    public static final v4 a = new v4();
    private static final String b;
    private static final ScheduledExecutorService c;
    private static volatile ScheduledFuture d;
    private static final Object e;
    private static final AtomicInteger f;
    private static volatile gl7 g;
    private static final AtomicBoolean h;
    private static String i;
    private static long j;
    private static int k;
    private static WeakReference l;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            zq3.h(activity, "activity");
            k94.e.b(LoggingBehavior.APP_EVENTS, v4.b, "onActivityCreated");
            sl.a();
            v4.p(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            zq3.h(activity, "activity");
            k94.e.b(LoggingBehavior.APP_EVENTS, v4.b, "onActivityDestroyed");
            v4.a.r(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            zq3.h(activity, "activity");
            k94.e.b(LoggingBehavior.APP_EVENTS, v4.b, "onActivityPaused");
            sl.a();
            v4.a.s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            zq3.h(activity, "activity");
            k94.e.b(LoggingBehavior.APP_EVENTS, v4.b, "onActivityResumed");
            sl.a();
            v4.v(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zq3.h(activity, "activity");
            zq3.h(bundle, "outState");
            k94.e.b(LoggingBehavior.APP_EVENTS, v4.b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            zq3.h(activity, "activity");
            v4.k++;
            k94.e.b(LoggingBehavior.APP_EVENTS, v4.b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            zq3.h(activity, "activity");
            k94.e.b(LoggingBehavior.APP_EVENTS, v4.b, "onActivityStopped");
            AppEventsLogger.b.h();
            v4.k--;
        }
    }

    static {
        String canonicalName = v4.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        b = canonicalName;
        c = Executors.newSingleThreadScheduledExecutor();
        e = new Object();
        f = new AtomicInteger(0);
        h = new AtomicBoolean(false);
    }

    private v4() {
    }

    private final void k() {
        ScheduledFuture scheduledFuture;
        synchronized (e) {
            try {
                if (d != null && (scheduledFuture = d) != null) {
                    scheduledFuture.cancel(false);
                }
                d = null;
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final Activity l() {
        WeakReference weakReference = l;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public static final UUID m() {
        gl7 gl7Var;
        if (g == null || (gl7Var = g) == null) {
            return null;
        }
        return gl7Var.d();
    }

    private final int n() {
        FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.a;
        rd2 f2 = FetchedAppSettingsManager.f(w92.m());
        return f2 == null ? vu0.a() : f2.j();
    }

    public static final boolean o() {
        return k == 0;
    }

    public static final void p(Activity activity) {
        c.execute(new Runnable() { // from class: t4
            @Override // java.lang.Runnable
            public final void run() {
                v4.q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q() {
        if (g == null) {
            g = gl7.g.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(Activity activity) {
        bn0.j(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Activity activity) {
        AtomicInteger atomicInteger = f;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        k();
        final long currentTimeMillis = System.currentTimeMillis();
        final String t = g29.t(activity);
        bn0.k(activity);
        c.execute(new Runnable() { // from class: s4
            @Override // java.lang.Runnable
            public final void run() {
                v4.t(currentTimeMillis, t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final long j2, final String str) {
        zq3.h(str, "$activityName");
        if (g == null) {
            g = new gl7(Long.valueOf(j2), null, null, 4, null);
        }
        gl7 gl7Var = g;
        if (gl7Var != null) {
            gl7Var.k(Long.valueOf(j2));
        }
        if (f.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: u4
                @Override // java.lang.Runnable
                public final void run() {
                    v4.u(j2, str);
                }
            };
            synchronized (e) {
                d = c.schedule(runnable, a.n(), TimeUnit.SECONDS);
                ww8 ww8Var = ww8.a;
            }
        }
        long j3 = j;
        s20.e(str, j3 > 0 ? (j2 - j3) / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT : 0L);
        gl7 gl7Var2 = g;
        if (gl7Var2 == null) {
            return;
        }
        gl7Var2.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(long j2, String str) {
        zq3.h(str, "$activityName");
        if (g == null) {
            g = new gl7(Long.valueOf(j2), null, null, 4, null);
        }
        if (f.get() <= 0) {
            hl7 hl7Var = hl7.a;
            hl7.e(str, g, i);
            gl7.g.a();
            g = null;
        }
        synchronized (e) {
            d = null;
            ww8 ww8Var = ww8.a;
        }
    }

    public static final void v(Activity activity) {
        zq3.h(activity, "activity");
        l = new WeakReference(activity);
        f.incrementAndGet();
        a.k();
        final long currentTimeMillis = System.currentTimeMillis();
        j = currentTimeMillis;
        final String t = g29.t(activity);
        bn0.l(activity);
        ss4.d(activity);
        fc8.h(activity);
        qi3.b();
        final Context applicationContext = activity.getApplicationContext();
        c.execute(new Runnable() { // from class: r4
            @Override // java.lang.Runnable
            public final void run() {
                v4.w(currentTimeMillis, t, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(long j2, String str, Context context) {
        gl7 gl7Var;
        zq3.h(str, "$activityName");
        gl7 gl7Var2 = g;
        Long e2 = gl7Var2 == null ? null : gl7Var2.e();
        if (g == null) {
            g = new gl7(Long.valueOf(j2), null, null, 4, null);
            hl7 hl7Var = hl7.a;
            String str2 = i;
            zq3.g(context, "appContext");
            hl7.c(str, null, str2, context);
        } else if (e2 != null) {
            long longValue = j2 - e2.longValue();
            if (longValue > a.n() * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT) {
                hl7 hl7Var2 = hl7.a;
                hl7.e(str, g, i);
                String str3 = i;
                zq3.g(context, "appContext");
                hl7.c(str, null, str3, context);
                g = new gl7(Long.valueOf(j2), null, null, 4, null);
            } else if (longValue > 1000 && (gl7Var = g) != null) {
                gl7Var.h();
            }
        }
        gl7 gl7Var3 = g;
        if (gl7Var3 != null) {
            gl7Var3.k(Long.valueOf(j2));
        }
        gl7 gl7Var4 = g;
        if (gl7Var4 == null) {
            return;
        }
        gl7Var4.m();
    }

    public static final void x(Application application, String str) {
        zq3.h(application, "application");
        if (h.compareAndSet(false, true)) {
            FeatureManager featureManager = FeatureManager.a;
            FeatureManager.a(FeatureManager.Feature.CodelessEvents, new FeatureManager.a() { // from class: q4
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z) {
                    v4.y(z);
                }
            });
            i = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(boolean z) {
        if (z) {
            bn0.f();
        } else {
            bn0.e();
        }
    }
}
