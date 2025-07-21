package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.facebook.appevents.AppEventsLogger;
import defpackage.es7;

/* loaded from: classes4.dex */
public final class d92 implements es7 {
    private final d96 a;

    public d92(d96 d96Var) {
        zq3.h(d96Var, "purrManagerClient");
        this.a = d96Var;
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
        zq3.h(activity, "activity");
        if (this.a.j()) {
            AppEventsLogger.a aVar = AppEventsLogger.b;
            Application application = activity.getApplication();
            zq3.g(application, "getApplication(...)");
            aVar.a(application);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        es7.a.e(this, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        es7.a.f(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        es7.a.g(this, activity);
    }
}
