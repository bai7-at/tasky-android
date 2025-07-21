package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.g2;

/* loaded from: classes2.dex */
public abstract class j extends g2 {
    protected final g2 f;

    public j(g2 g2Var) {
        this.f = g2Var;
    }

    @Override // com.google.android.exoplayer2.g2
    public int f(boolean z) {
        return this.f.f(z);
    }

    @Override // com.google.android.exoplayer2.g2
    public int g(Object obj) {
        return this.f.g(obj);
    }

    @Override // com.google.android.exoplayer2.g2
    public int h(boolean z) {
        return this.f.h(z);
    }

    @Override // com.google.android.exoplayer2.g2
    public int j(int i, int i2, boolean z) {
        return this.f.j(i, i2, z);
    }

    @Override // com.google.android.exoplayer2.g2
    public g2.b l(int i, g2.b bVar, boolean z) {
        return this.f.l(i, bVar, z);
    }

    @Override // com.google.android.exoplayer2.g2
    public int n() {
        return this.f.n();
    }

    @Override // com.google.android.exoplayer2.g2
    public int q(int i, int i2, boolean z) {
        return this.f.q(i, i2, z);
    }

    @Override // com.google.android.exoplayer2.g2
    public Object r(int i) {
        return this.f.r(i);
    }

    @Override // com.google.android.exoplayer2.g2
    public g2.d t(int i, g2.d dVar, long j) {
        return this.f.t(i, dVar, j);
    }

    @Override // com.google.android.exoplayer2.g2
    public int u() {
        return this.f.u();
    }
}
