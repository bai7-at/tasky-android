package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzacu extends zzyp {
    zzacu() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzyp
    public final void zza(zzacv zzacvVar) throws IOException {
        int i;
        int i2 = zzacvVar.zza;
        if (i2 == 0) {
            i2 = zzacvVar.zzb();
        }
        if (i2 == 13) {
            i = 9;
        } else if (i2 == 12) {
            i = 8;
        } else {
            if (i2 != 14) {
                throw new IllegalStateException(zzacw.zzb(zzacvVar, "Expected a name but was "));
            }
            i = 10;
        }
        zzacvVar.zza = i;
    }
}
