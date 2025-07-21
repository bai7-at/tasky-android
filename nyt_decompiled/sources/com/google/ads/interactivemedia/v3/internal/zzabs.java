package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzabs extends zzxi {
    zzabs() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        try {
            int zzc = zzacvVar.zzc();
            if (zzc <= 65535 && zzc >= -32768) {
                return Short.valueOf((short) zzc);
            }
            throw new zzwz("Lossy conversion from " + zzc + " to short; at path " + zzacvVar.zzf());
        } catch (NumberFormatException e) {
            throw new zzwz(e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        if (((Number) obj) == null) {
            zzacxVar.zzf();
        } else {
            zzacxVar.zzh(r4.shortValue());
        }
    }
}
