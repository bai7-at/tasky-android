package com.google.ads.interactivemedia.v3.internal;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzlc {
    private static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private long zzb = 0;
    private long zzc = 0;
    private long zzd = -1;
    private boolean zze = false;

    zzlc(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new zzlb(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static zzlc zzd(Context context, Executor executor) {
        return new zzlc(context, executor, zza);
    }

    public final long zzb() {
        long j = this.zzd;
        this.zzd = -1L;
        return j;
    }

    public final long zzc() {
        if (this.zze) {
            return this.zzc - this.zzb;
        }
        return -1L;
    }

    public final void zzh() {
        if (this.zze) {
            this.zzc = System.currentTimeMillis();
        }
    }
}
