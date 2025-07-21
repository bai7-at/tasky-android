package defpackage;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
final class cja implements oja {
    final /* synthetic */ Activity a;

    cja(pja pjaVar, Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.oja
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.a);
    }
}
