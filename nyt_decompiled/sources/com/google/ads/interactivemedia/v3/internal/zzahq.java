package com.google.ads.interactivemedia.v3.internal;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzahq extends zzahs {
    zzahq(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahs
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahs
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahs
    public final void zzc(Object obj, long j, boolean z) {
        if (zzaht.zzb) {
            zzaht.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzaht.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahs
    public final void zzd(Object obj, long j, byte b) {
        if (zzaht.zzb) {
            zzaht.zzD(obj, j, b);
        } else {
            zzaht.zzE(obj, j, b);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahs
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahs
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahs
    public final boolean zzg(Object obj, long j) {
        return zzaht.zzb ? zzaht.zzt(obj, j) : zzaht.zzu(obj, j);
    }
}
