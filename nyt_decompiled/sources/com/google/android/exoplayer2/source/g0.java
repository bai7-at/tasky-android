package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.w0;
import defpackage.sq8;

/* loaded from: classes2.dex */
public abstract class g0 extends c {
    private static final Void l = null;
    protected final o k;

    protected g0(o oVar) {
        this.k = oVar;
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected final void B(sq8 sq8Var) {
        super.B(sq8Var);
        V();
    }

    protected o.b M(o.b bVar) {
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final o.b F(Void r1, o.b bVar) {
        return M(bVar);
    }

    protected long O(long j) {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final long G(Void r1, long j) {
        return O(j);
    }

    protected int Q(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int H(Void r1, int i) {
        return Q(i);
    }

    protected abstract void S(g2 g2Var);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void I(Void r1, o oVar, g2 g2Var) {
        S(g2Var);
    }

    protected final void U() {
        K(l, this.k);
    }

    protected void V() {
        U();
    }

    @Override // com.google.android.exoplayer2.source.o
    public w0 f() {
        return this.k.f();
    }

    @Override // com.google.android.exoplayer2.source.o
    public boolean q() {
        return this.k.q();
    }

    @Override // com.google.android.exoplayer2.source.o
    public g2 r() {
        return this.k.r();
    }
}
