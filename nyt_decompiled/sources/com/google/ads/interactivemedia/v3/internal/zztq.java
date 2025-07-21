package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class zztq extends zzth implements Serializable {
    static final zztq zza = new zztq();

    private zztq() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzth, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzth
    public final zzth zza() {
        return zztf.zza;
    }
}
