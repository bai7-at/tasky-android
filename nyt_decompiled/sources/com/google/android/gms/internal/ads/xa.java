package com.google.android.gms.internal.ads;

import defpackage.tje;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
final class xa extends ua {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    xa(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.ua
    final wa a(eb ebVar, wa waVar) {
        return (wa) this.d.getAndSet(ebVar, waVar);
    }

    @Override // com.google.android.gms.internal.ads.ua
    final db b(eb ebVar, db dbVar) {
        return (db) this.c.getAndSet(ebVar, dbVar);
    }

    @Override // com.google.android.gms.internal.ads.ua
    final void c(db dbVar, db dbVar2) {
        this.b.lazySet(dbVar, dbVar2);
    }

    @Override // com.google.android.gms.internal.ads.ua
    final void d(db dbVar, Thread thread) {
        this.a.lazySet(dbVar, thread);
    }

    @Override // com.google.android.gms.internal.ads.ua
    final boolean e(eb ebVar, wa waVar, wa waVar2) {
        return tje.a(this.d, ebVar, waVar, waVar2);
    }

    @Override // com.google.android.gms.internal.ads.ua
    final boolean f(eb ebVar, Object obj, Object obj2) {
        return tje.a(this.e, ebVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.ua
    final boolean g(eb ebVar, db dbVar, db dbVar2) {
        return tje.a(this.c, ebVar, dbVar, dbVar2);
    }
}
