package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzabp extends zzxi {
    zzabp() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        int zzt = zzacvVar.zzt();
        if (zzt != 9) {
            return zzt == 6 ? Boolean.valueOf(Boolean.parseBoolean(zzacvVar.zzi())) : Boolean.valueOf(zzacvVar.zzs());
        }
        zzacvVar.zzn();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        zzacxVar.zzi((Boolean) obj);
    }
}
