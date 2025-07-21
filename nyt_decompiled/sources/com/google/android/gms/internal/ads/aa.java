package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
final class aa extends da {
    final /* synthetic */ Comparator a;

    aa(Comparator comparator) {
        this.a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.da
    final Map a() {
        return new TreeMap(this.a);
    }
}
