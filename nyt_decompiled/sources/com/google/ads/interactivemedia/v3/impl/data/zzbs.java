package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzacv;
import com.google.ads.interactivemedia.v3.internal.zzacx;
import com.google.ads.interactivemedia.v3.internal.zzxi;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzbs extends zzxi {
    zzbs() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public zzbt read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() != 9) {
            return new zzbt(zzacvVar.zzi());
        }
        zzacvVar.zzn();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public void write(zzacx zzacxVar, zzbt zzbtVar) throws IOException {
        if (zzbtVar == null) {
            zzacxVar.zzf();
        } else {
            zzacxVar.zzk(zzbtVar.getName());
        }
    }
}
