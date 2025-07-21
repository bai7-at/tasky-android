package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzaar extends zzxi {
    zzaar() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        if (zzi.length() == 1) {
            return Character.valueOf(zzi.charAt(0));
        }
        throw new zzwz("Expecting character, got: " + zzi + "; at " + zzacvVar.zzf());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        Character ch = (Character) obj;
        zzacxVar.zzk(ch == null ? null : ch.toString());
    }
}
