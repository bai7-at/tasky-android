package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* loaded from: classes2.dex */
final class zzafl extends zzafn {
    /* synthetic */ zzafl(zzafk zzafkVar) {
        super(null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafn
    final List zza(Object obj, long j) {
        zzaez zzaezVar = (zzaez) zzaht.zzf(obj, j);
        if (zzaezVar.zzc()) {
            return zzaezVar;
        }
        int size = zzaezVar.size();
        zzaez zzd = zzaezVar.zzd(size == 0 ? 10 : size + size);
        zzaht.zzs(obj, j, zzd);
        return zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafn
    final void zzb(Object obj, long j) {
        ((zzaez) zzaht.zzf(obj, j)).zzb();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafn
    final void zzc(Object obj, Object obj2, long j) {
        zzaez zzaezVar = (zzaez) zzaht.zzf(obj, j);
        zzaez zzaezVar2 = (zzaez) zzaht.zzf(obj2, j);
        int size = zzaezVar.size();
        int size2 = zzaezVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzaezVar.zzc()) {
                zzaezVar = zzaezVar.zzd(size2 + size);
            }
            zzaezVar.addAll(zzaezVar2);
        }
        if (size > 0) {
            zzaezVar2 = zzaezVar;
        }
        zzaht.zzs(obj, j, zzaezVar2);
    }

    private zzafl() {
        super(null);
    }
}
