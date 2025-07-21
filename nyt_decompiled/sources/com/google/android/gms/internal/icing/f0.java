package com.google.android.gms.internal.icing;

import defpackage.vcc;

/* loaded from: classes3.dex */
final class f0 extends g0 {
    /* synthetic */ f0(d0 d0Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.icing.g0
    final void a(Object obj, long j) {
        ((vcc) k1.s(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.icing.g0
    final void b(Object obj, Object obj2, long j) {
        vcc vccVar = (vcc) k1.s(obj, j);
        vcc vccVar2 = (vcc) k1.s(obj2, j);
        int size = vccVar.size();
        int size2 = vccVar2.size();
        if (size > 0 && size2 > 0) {
            if (!vccVar.zza()) {
                vccVar = vccVar.i(size2 + size);
            }
            vccVar.addAll(vccVar2);
        }
        if (size > 0) {
            vccVar2 = vccVar;
        }
        k1.t(obj, j, vccVar2);
    }
}
