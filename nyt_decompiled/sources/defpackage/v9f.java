package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
final class v9f extends r9f {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    v9f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.r9f
    final u9f a(aaf aafVar, u9f u9fVar) {
        return (u9f) this.d.getAndSet(aafVar, u9fVar);
    }

    @Override // defpackage.r9f
    final z9f b(aaf aafVar, z9f z9fVar) {
        return (z9f) this.c.getAndSet(aafVar, z9fVar);
    }

    @Override // defpackage.r9f
    final void c(z9f z9fVar, z9f z9fVar2) {
        this.b.lazySet(z9fVar, z9fVar2);
    }

    @Override // defpackage.r9f
    final void d(z9f z9fVar, Thread thread) {
        this.a.lazySet(z9fVar, thread);
    }

    @Override // defpackage.r9f
    final boolean e(aaf aafVar, Object obj, Object obj2) {
        return caf.a(this.e, aafVar, obj, obj2);
    }

    @Override // defpackage.r9f
    final boolean f(aaf aafVar, z9f z9fVar, z9f z9fVar2) {
        return caf.a(this.c, aafVar, z9fVar, z9fVar2);
    }
}
