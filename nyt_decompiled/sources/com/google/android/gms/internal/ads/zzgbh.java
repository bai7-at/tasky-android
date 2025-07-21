package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class zzgbh extends ga implements Serializable {
    static final zzgbh a = new zzgbh();

    private zzgbh() {
    }

    @Override // com.google.android.gms.internal.ads.ga
    public final ga a() {
        return zzgbr.a;
    }

    @Override // com.google.android.gms.internal.ads.ga, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
