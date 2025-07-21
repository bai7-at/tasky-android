package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
abstract class sb extends lb {
    private List s;

    sb(zzfzv zzfzvVar, boolean z) {
        super(zzfzvVar, z, true);
        List emptyList = zzfzvVar.isEmpty() ? Collections.emptyList() : s9.a(zzfzvVar.size());
        for (int i = 0; i < zzfzvVar.size(); i++) {
            emptyList.add(null);
        }
        this.s = emptyList;
    }

    @Override // com.google.android.gms.internal.ads.lb
    final void P(int i, Object obj) {
        List list = this.s;
        if (list != null) {
            list.set(i, new rb(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.lb
    final void Q() {
        List list = this.s;
        if (list != null) {
            f(V(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.lb
    final void U(int i) {
        super.U(i);
        this.s = null;
    }

    abstract Object V(List list);
}
