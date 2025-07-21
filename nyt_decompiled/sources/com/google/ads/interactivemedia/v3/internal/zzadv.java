package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzadv {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzadw zzc;

    /* synthetic */ zzadv(zzadu zzaduVar) {
    }

    public static int zzs(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzt(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    static zzadv zzu(byte[] bArr, int i, int i2, boolean z) {
        zzadt zzadtVar = new zzadt(bArr, i, i2, z, null);
        try {
            zzadtVar.zzc(i2);
            return zzadtVar;
        } catch (zzafc e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int zzb();

    public abstract int zzc(int i) throws zzafc;

    public abstract int zzf() throws IOException;

    public abstract zzadr zzj() throws IOException;

    public abstract String zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract void zzm(int i) throws zzafc;

    public abstract void zzn(int i);

    public abstract boolean zzp() throws IOException;

    public abstract boolean zzq() throws IOException;

    public abstract boolean zzr(int i) throws IOException;
}
