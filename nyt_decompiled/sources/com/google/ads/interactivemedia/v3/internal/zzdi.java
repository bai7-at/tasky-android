package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
final class zzdi implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzdj zza;

    zzdi(zzdj zzdjVar) {
        this.zza = zzdjVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2;
        zzdj zzdjVar = this.zza;
        activity2 = zzdjVar.zze;
        if (activity2 == activity) {
            zzdjVar.zze = null;
            this.zza.zzk();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Activity activity2;
        zzfm zzfmVar;
        String str;
        Activity activity3;
        zzdj zzdjVar = this.zza;
        activity2 = zzdjVar.zze;
        if (activity2 != null) {
            activity3 = zzdjVar.zze;
            if (activity3 != activity) {
                return;
            }
        }
        zzdjVar.zze = activity;
        com.google.ads.interactivemedia.v3.impl.data.zzb zzc = this.zza.zzc("", "", "inactive");
        zzfmVar = this.zza.zza;
        zzfd zzfdVar = zzfd.activityMonitor;
        zzfe zzfeVar = zzfe.appStateChanged;
        str = this.zza.zzb;
        zzfmVar.zzp(new zzff(zzfdVar, zzfeVar, str, zzc));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Activity activity2;
        zzfm zzfmVar;
        String str;
        zzdj zzdjVar = this.zza;
        activity2 = zzdjVar.zze;
        if (activity2 == activity) {
            com.google.ads.interactivemedia.v3.impl.data.zzb zzc = zzdjVar.zzc("", "", "active");
            zzfmVar = this.zza.zza;
            zzfd zzfdVar = zzfd.activityMonitor;
            zzfe zzfeVar = zzfe.appStateChanged;
            str = this.zza.zzb;
            zzfmVar.zzp(new zzff(zzfdVar, zzfeVar, str, zzc));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
