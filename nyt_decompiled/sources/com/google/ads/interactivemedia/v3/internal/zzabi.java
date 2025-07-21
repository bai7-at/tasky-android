package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.BitSet;

/* loaded from: classes2.dex */
final class zzabi extends zzxi {
    zzabi() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        BitSet bitSet = new BitSet();
        zzacvVar.zzj();
        int zzt = zzacvVar.zzt();
        int i = 0;
        while (zzt != 2) {
            int i2 = zzt - 1;
            if (i2 == 5 || i2 == 6) {
                int zzc = zzacvVar.zzc();
                if (zzc != 0) {
                    if (zzc != 1) {
                        throw new zzwz("Invalid bitset value " + zzc + ", expected 0 or 1; at path " + zzacvVar.zzf());
                    }
                    bitSet.set(i);
                    i++;
                    zzt = zzacvVar.zzt();
                } else {
                    continue;
                    i++;
                    zzt = zzacvVar.zzt();
                }
            } else {
                if (i2 != 7) {
                    throw new zzwz("Invalid bitset value type: " + zzacw.zza(zzt) + "; at path " + zzacvVar.zze());
                }
                if (!zzacvVar.zzs()) {
                    i++;
                    zzt = zzacvVar.zzt();
                }
                bitSet.set(i);
                i++;
                zzt = zzacvVar.zzt();
            }
        }
        zzacvVar.zzl();
        return bitSet;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        zzacxVar.zza();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            zzacxVar.zzh(bitSet.get(i) ? 1L : 0L);
        }
        zzacxVar.zzc();
    }
}
