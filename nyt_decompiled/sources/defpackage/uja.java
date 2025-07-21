package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class uja implements Application.ActivityLifecycleCallbacks {
    private Activity a;
    private Context b;
    private Runnable h;
    private long j;
    private final Object c = new Object();
    private boolean d = true;
    private boolean e = false;
    private final List f = new ArrayList();
    private final List g = new ArrayList();
    private boolean i = false;

    uja() {
    }

    private final void m(Activity activity) {
        synchronized (this.c) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.a = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Activity c() {
        return this.a;
    }

    public final Context d() {
        return this.b;
    }

    public final void h(vja vjaVar) {
        synchronized (this.c) {
            this.f.add(vjaVar);
        }
    }

    public final void i(Application application, Context context) {
        if (this.i) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            m((Activity) context);
        }
        this.b = application;
        this.j = ((Long) pla.c().a(mpa.S0)).longValue();
        this.i = true;
    }

    public final void j(vja vjaVar) {
        synchronized (this.c) {
            this.f.remove(vjaVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.c) {
            try {
                Activity activity2 = this.a;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.a = null;
                }
                Iterator it2 = this.g.iterator();
                while (it2.hasNext()) {
                    lh4.a(it2.next());
                    try {
                        throw null;
                    } catch (Exception e) {
                        dyf.q().w(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        fgb.e("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m(activity);
        synchronized (this.c) {
            Iterator it2 = this.g.iterator();
            while (it2.hasNext()) {
                lh4.a(it2.next());
                try {
                    throw null;
                } catch (Exception e) {
                    dyf.q().w(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    fgb.e("", e);
                }
            }
        }
        this.e = true;
        Runnable runnable = this.h;
        if (runnable != null) {
            wxf.l.removeCallbacks(runnable);
        }
        cde cdeVar = wxf.l;
        tja tjaVar = new tja(this);
        this.h = tjaVar;
        cdeVar.postDelayed(tjaVar, this.j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m(activity);
        this.e = false;
        boolean z = this.d;
        this.d = true;
        Runnable runnable = this.h;
        if (runnable != null) {
            wxf.l.removeCallbacks(runnable);
        }
        synchronized (this.c) {
            Iterator it2 = this.g.iterator();
            while (it2.hasNext()) {
                lh4.a(it2.next());
                try {
                    throw null;
                } catch (Exception e) {
                    dyf.q().w(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    fgb.e("", e);
                }
            }
            if (z) {
                fgb.b("App is still foreground.");
            } else {
                Iterator it3 = this.f.iterator();
                while (it3.hasNext()) {
                    try {
                        ((vja) it3.next()).a(true);
                    } catch (Exception e2) {
                        fgb.e("", e2);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
