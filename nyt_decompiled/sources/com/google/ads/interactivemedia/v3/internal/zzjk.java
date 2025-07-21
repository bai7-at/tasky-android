package com.google.ads.interactivemedia.v3.internal;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes2.dex */
public final class zzjk {
    protected volatile Boolean zzb;
    private final zzkt zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzqo zza = null;
    private static volatile Random zzd = null;

    public zzjk(zzkt zzktVar) {
        this.zze = zzktVar;
        zzktVar.zzk().execute(new zzjj(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return zze().nextInt();
        }
    }

    private static Random zze() {
        if (zzd == null) {
            synchronized (zzjk.class) {
                try {
                    if (zzd == null) {
                        zzd = new Random();
                    }
                } finally {
                }
            }
        }
        return zzd;
    }

    public final void zzc(int i, int i2, long j, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzr zza2 = zzv.zza();
            zza2.zza(this.zze.zza.getPackageName());
            zza2.zze(j);
            if (str != null) {
                zza2.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzf(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            zzqn zza3 = zza.zza(((zzv) zza2.zzak()).zzav());
            zza3.zza(i);
            if (i2 != -1) {
                zza3.zzb(i2);
            }
            zza3.zzc();
        } catch (Exception unused) {
        }
    }
}
