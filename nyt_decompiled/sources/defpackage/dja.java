package defpackage;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
final class dja implements oja {
    final /* synthetic */ Activity a;

    dja(pja pjaVar, Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.oja
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.a);
    }
}
