package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzsi {
    static int zza(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= highestOneBit) {
            return highestOneBit;
        }
        int i2 = highestOneBit + highestOneBit;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    static int zzb(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    static int zzc(Object obj) {
        return zzb(obj == null ? 0 : obj.hashCode());
    }
}
