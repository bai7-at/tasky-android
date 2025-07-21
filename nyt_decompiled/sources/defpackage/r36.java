package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class r36 implements Application.ActivityLifecycleCallbacks {
    private final a a;
    private final AtomicInteger b;
    private final AtomicInteger c;
    private final AtomicBoolean d;
    private final AtomicBoolean e;

    public interface a {
        void b();

        void c();

        void d();

        void f();
    }

    public r36(a aVar) {
        zq3.h(aVar, "callback");
        this.a = aVar;
        this.b = new AtomicInteger(0);
        this.c = new AtomicInteger(0);
        this.d = new AtomicBoolean(true);
        this.e = new AtomicBoolean(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        zq3.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        zq3.h(activity, "activity");
        if (this.b.decrementAndGet() != 0 || this.d.getAndSet(true)) {
            return;
        }
        this.a.d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        zq3.h(activity, "activity");
        if (this.b.incrementAndGet() == 1 && this.d.getAndSet(false)) {
            this.a.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        zq3.h(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        zq3.h(activity, "activity");
        if (this.c.incrementAndGet() == 1 && this.e.getAndSet(false)) {
            this.a.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        zq3.h(activity, "activity");
        if (this.c.decrementAndGet() == 0 && this.d.get()) {
            this.a.f();
            this.e.set(true);
        }
    }
}
