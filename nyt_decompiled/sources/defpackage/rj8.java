package defpackage;

import android.app.Activity;
import android.os.Bundle;
import defpackage.es7;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class rj8 implements es7 {
    private final Set a = new LinkedHashSet();

    private final void c(Activity activity) {
        this.a.add(new WeakReference(activity));
    }

    private final void e(Iterator it2, Activity activity) {
        Activity activity2 = (Activity) ((WeakReference) it2.next()).get();
        if (activity2 == null || !zq3.c(activity, activity2)) {
            return;
        }
        it2.remove();
    }

    private final void g(Set set, Activity activity) {
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            e(it2, activity);
        }
    }

    public final void d() {
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            Activity activity = (Activity) ((WeakReference) it2.next()).get();
            if (activity != null) {
                activity.recreate();
            }
        }
    }

    public final void f() {
        Activity activity = (Activity) ((WeakReference) i.v0(this.a)).get();
        if (activity != null) {
            activity.recreate();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        c(activity);
        es7.a.a(this, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        zq3.h(activity, "activity");
        g(this.a, activity);
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
        es7.a.f(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        es7.a.g(this, activity);
    }
}
