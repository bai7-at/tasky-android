package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
final class nb extends mb {
    final AtomicReferenceFieldUpdater a;
    final AtomicIntegerFieldUpdater b;

    nb(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.mb
    final int a(pb pbVar) {
        return this.b.decrementAndGet(pbVar);
    }

    @Override // com.google.android.gms.internal.ads.mb
    final void b(pb pbVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.a;
            if (defpackage.v1.a(atomicReferenceFieldUpdater, pbVar, null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(pbVar) == null);
    }
}
