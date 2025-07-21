package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzaay extends zzxi {
    zzaay() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() != 9) {
            return new StringBuffer(zzacvVar.zzi());
        }
        zzacvVar.zzn();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        StringBuffer stringBuffer = (StringBuffer) obj;
        zzacxVar.zzk(stringBuffer == null ? null : stringBuffer.toString());
    }
}
