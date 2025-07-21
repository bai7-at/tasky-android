package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.UUID;

/* loaded from: classes2.dex */
final class zzabc extends zzxi {
    zzabc() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        try {
            return UUID.fromString(zzi);
        } catch (IllegalArgumentException e) {
            throw new zzwz("Failed parsing '" + zzi + "' as UUID; at path " + zzacvVar.zzf(), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        zzacxVar.zzk(uuid == null ? null : uuid.toString());
    }
}
