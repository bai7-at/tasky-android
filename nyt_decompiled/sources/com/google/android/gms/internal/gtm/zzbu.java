package com.google.android.gms.internal.gtm;

import java.lang.Thread;

/* loaded from: classes3.dex */
final class zzbu implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzbv zza;

    zzbu(zzbv zzbvVar) {
        this.zza = zzbvVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        zzfb zzn = this.zza.zzn();
        if (zzn != null) {
            zzn.zzK("Job execution failed", th);
        }
    }
}
