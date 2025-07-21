package defpackage;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
final class mac implements lhc {
    final /* synthetic */ Activity a;

    mac(mic micVar, Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.lhc
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.a);
    }
}
