package defpackage;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
final class sfa implements tfa {
    final /* synthetic */ Activity a;

    sfa(ufa ufaVar, Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.tfa
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.a);
    }
}
