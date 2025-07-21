package defpackage;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
final class xcc implements lhc {
    final /* synthetic */ Activity a;

    xcc(mic micVar, Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.lhc
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.a);
    }
}
