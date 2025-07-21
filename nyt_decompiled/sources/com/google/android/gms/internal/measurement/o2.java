package com.google.android.gms.internal.measurement;

import defpackage.mcf;
import defpackage.tbf;

/* loaded from: classes3.dex */
final class o2 extends p2 {
    /* synthetic */ o2(mcf mcfVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.p2
    final void a(Object obj, long j) {
        ((tbf) s3.k(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.p2
    final void b(Object obj, Object obj2, long j) {
        tbf tbfVar = (tbf) s3.k(obj, j);
        tbf tbfVar2 = (tbf) s3.k(obj2, j);
        int size = tbfVar.size();
        int size2 = tbfVar2.size();
        if (size > 0 && size2 > 0) {
            if (!tbfVar.zzc()) {
                tbfVar = tbfVar.zzd(size2 + size);
            }
            tbfVar.addAll(tbfVar2);
        }
        if (size > 0) {
            tbfVar2 = tbfVar;
        }
        s3.x(obj, j, tbfVar2);
    }
}
