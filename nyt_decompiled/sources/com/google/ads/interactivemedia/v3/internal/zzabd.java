package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Currency;

/* loaded from: classes2.dex */
final class zzabd extends zzxi {
    zzabd() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        String zzi = zzacvVar.zzi();
        try {
            return Currency.getInstance(zzi);
        } catch (IllegalArgumentException e) {
            throw new zzwz("Failed parsing '" + zzi + "' as Currency; at path " + zzacvVar.zzf(), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        zzacxVar.zzk(((Currency) obj).getCurrencyCode());
    }
}
