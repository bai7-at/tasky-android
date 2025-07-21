package com.google.ads.interactivemedia.v3.internal;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
final class zzacn implements zzxj {
    zzacn() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        if (zzactVar.zzc() == Timestamp.class) {
            return new zzacp(zzwmVar.zza(zzact.zza(Date.class)), null);
        }
        return null;
    }
}
