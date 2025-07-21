package defpackage;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
final class rbc implements lhc {
    final /* synthetic */ Activity a;

    rbc(mic micVar, Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.lhc
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.a);
    }
}
