package com.google.android.gms.internal.play_billing;

import defpackage.ehb;
import defpackage.rtb;

/* loaded from: classes3.dex */
final class e0 extends f0 {
    /* synthetic */ e0(rtb rtbVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.f0
    final void a(Object obj, long j) {
        ((ehb) h1.k(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.f0
    final void b(Object obj, Object obj2, long j) {
        ehb ehbVar = (ehb) h1.k(obj, j);
        ehb ehbVar2 = (ehb) h1.k(obj2, j);
        int size = ehbVar.size();
        int size2 = ehbVar2.size();
        if (size > 0 && size2 > 0) {
            if (!ehbVar.zzc()) {
                ehbVar = ehbVar.zzd(size2 + size);
            }
            ehbVar.addAll(ehbVar2);
        }
        if (size > 0) {
            ehbVar2 = ehbVar;
        }
        h1.x(obj, j, ehbVar2);
    }
}
