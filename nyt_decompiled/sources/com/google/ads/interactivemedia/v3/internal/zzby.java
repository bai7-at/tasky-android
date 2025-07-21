package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzby implements Application.ActivityLifecycleCallbacks {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzby zza = new zzby();
    private boolean zzb;
    private boolean zzc;
    private zzcd zzd;

    private zzby() {
    }

    public static zzby zza() {
        return zza;
    }

    private final void zze() {
        boolean z = this.zzc;
        Iterator it2 = zzbx.zza().zzc().iterator();
        while (it2.hasNext()) {
            zzcj zzh = ((com.google.ads.interactivemedia.omid.library.adsession.zze) it2.next()).zzh();
            if (zzh.zzk()) {
                zzcc.zza().zzb(zzh.zza(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    private final void zzf(boolean z) {
        if (this.zzc != z) {
            this.zzc = z;
            if (this.zzb) {
                zze();
                if (this.zzd != null) {
                    if (z) {
                        zzcz.zzd().zzh();
                    } else {
                        zzcz.zzd().zzi();
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzf(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View zzg;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        boolean z = true;
        for (com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar : zzbx.zza().zzb()) {
            if (zzeVar.zzk() && (zzg = zzeVar.zzg()) != null && zzg.hasWindowFocus()) {
                z = false;
            }
        }
        zzf(i != 100 && z);
    }

    public final void zzb() {
        this.zzb = true;
        this.zzc = false;
        zze();
    }

    public final void zzc() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = null;
    }

    public final void zzd(zzcd zzcdVar) {
        this.zzd = zzcdVar;
    }
}
