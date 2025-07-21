package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzso;
import java.util.List;

/* loaded from: classes2.dex */
final class zzad extends zzbk {
    private zzso<zzbm> obstructions;

    zzad() {
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbk
    public zzbn build() {
        zzso<zzbm> zzsoVar = this.obstructions;
        if (zzsoVar != null) {
            return new zzaf(zzsoVar);
        }
        throw new IllegalStateException("Missing required properties: obstructions");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbk
    public zzbk obstructions(List<zzbm> list) {
        this.obstructions = zzso.zzk(list);
        return this;
    }
}
