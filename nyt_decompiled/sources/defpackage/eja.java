package defpackage;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
final class eja implements oja {
    final /* synthetic */ Activity a;

    eja(pja pjaVar, Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.oja
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.a);
    }
}
