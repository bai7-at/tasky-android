package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzwi extends zzxi {
    zzwi(zzwm zzwmVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() != 9) {
            return Float.valueOf((float) zzacvVar.zza());
        }
        zzacvVar.zzn();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            zzacxVar.zzf();
            return;
        }
        float floatValue = number.floatValue();
        zzwm.zzg(floatValue);
        if (!(number instanceof Float)) {
            number = Float.valueOf(floatValue);
        }
        zzacxVar.zzj(number);
    }
}
