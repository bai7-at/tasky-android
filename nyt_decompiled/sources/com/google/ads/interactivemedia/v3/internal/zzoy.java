package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import defpackage.cy0;
import defpackage.og8;
import defpackage.qg8;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzoy {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final og8 zzd;
    private final boolean zze;

    zzoy(Context context, Executor executor, og8 og8Var, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = og8Var;
        this.zze = z;
    }

    public static zzoy zza(final Context context, Executor executor, boolean z) {
        final qg8 qg8Var = new qg8();
        if (z) {
            executor.execute(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzou
                @Override // java.lang.Runnable
                public final void run() {
                    qg8Var.c(zzqo.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzov
                @Override // java.lang.Runnable
                public final void run() {
                    qg8.this.c(zzqo.zzc());
                }
            });
        }
        return new zzoy(context, executor, qg8Var.a(), z);
    }

    static void zzg(int i) {
        zzf = i;
    }

    private final og8 zzh(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.i(this.zzc, new cy0() { // from class: com.google.ads.interactivemedia.v3.internal.zzow
                @Override // defpackage.cy0
                public final Object then(og8 og8Var) {
                    return Boolean.valueOf(og8Var.q());
                }
            });
        }
        final zzr zza2 = zzv.zza();
        zza2.zza(this.zzb.getPackageName());
        zza2.zze(j);
        zza2.zzg(zzf);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zza2.zzf(stringWriter.toString());
            zza2.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zza2.zzb(str2);
        }
        if (str != null) {
            zza2.zzc(str);
        }
        return this.zzd.i(this.zzc, new cy0() { // from class: com.google.ads.interactivemedia.v3.internal.zzox
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                zzr zzrVar = zzr.this;
                int i2 = i;
                int i3 = zzoy.zza;
                if (!og8Var.q()) {
                    return Boolean.FALSE;
                }
                zzqn zza3 = ((zzqo) og8Var.m()).zza(((zzv) zzrVar.zzak()).zzav());
                zza3.zza(i2);
                zza3.zzc();
                return Boolean.TRUE;
            }
        });
    }

    public final og8 zzb(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final og8 zzc(int i, long j, Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final og8 zzd(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public final og8 zze(int i, long j, String str) {
        return zzh(i, j, null, null, null, str);
    }

    public final og8 zzf(int i, long j, String str, Map map) {
        return zzh(i, j, null, str, null, null);
    }
}
