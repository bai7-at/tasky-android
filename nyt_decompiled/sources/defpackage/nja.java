package defpackage;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
final class nja implements oja {
    final /* synthetic */ Activity a;

    nja(pja pjaVar, Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.oja
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.a);
    }
}
