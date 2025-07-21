package defpackage;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.nytimes.android.utils.snackbar.LifecycleAwareSnackbarManager;
import com.nytimes.android.utils.snackbar.a;
import defpackage.es7;
import io.reactivex.subjects.PublishSubject;
import java.util.Queue;

/* loaded from: classes4.dex */
public final class kn implements es7 {
    private final PublishSubject a;
    private final Queue b;

    public kn(PublishSubject publishSubject, Queue queue) {
        zq3.h(publishSubject, "snackbarSubject");
        zq3.h(queue, "snackbarOverflow");
        this.a = publishSubject;
        this.b = queue;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        jk jkVar = activity instanceof jk ? (jk) activity : null;
        if (jkVar != null) {
            jk jkVar2 = jkVar instanceof a ? jkVar : null;
            if (jkVar2 != null) {
                LifecycleAwareSnackbarManager lifecycleAwareSnackbarManager = new LifecycleAwareSnackbarManager(jkVar2, this.a, this.b);
                Lifecycle lifecycle = jkVar2.getLifecycle();
                zq3.g(lifecycle, "<get-lifecycle>(...)");
                lifecycleAwareSnackbarManager.d(lifecycle);
            }
        }
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
        es7.a.f(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        es7.a.g(this, activity);
    }
}
