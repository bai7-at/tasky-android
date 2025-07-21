package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
final class zzaat extends zzxi {
    zzaat() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        try {
            return new BigDecimal(zzi);
        } catch (NumberFormatException e) {
            throw new zzwz("Failed parsing '" + zzi + "' as BigDecimal; at path " + zzacvVar.zzf(), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        zzacxVar.zzj((BigDecimal) obj);
    }
}
