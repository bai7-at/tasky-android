package defpackage;

import android.app.Activity;
import android.os.Bundle;
import defpackage.es7;

/* loaded from: classes4.dex */
public final class k65 implements es7 {
    private final j65 a;

    public k65(j65 j65Var) {
        zq3.h(j65Var, "nightModeProvider");
        this.a = j65Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        es7.a.a(this, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        es7.a.b(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        es7.a.c(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        es7.a.d(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        es7.a.e(this, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        zq3.h(activity, "activity");
        this.a.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        es7.a.g(this, activity);
    }
}
