package com.google.android.exoplayer2;

import com.google.android.exoplayer2.g2;

/* loaded from: classes2.dex */
public abstract class e implements v1 {
    protected final g2.d a = new g2.d();

    protected e() {
    }

    private int C() {
        int q0 = q0();
        if (q0 == 1) {
            return 0;
        }
        return q0;
    }

    private void F(long j, int i) {
        D(x(), j, i, false);
    }

    @Override // com.google.android.exoplayer2.v1
    public final boolean A() {
        g2 m = m();
        return !m.v() && m.s(x(), this.a).i();
    }

    public final int B() {
        g2 m = m();
        if (m.v()) {
            return -1;
        }
        return m.q(x(), C(), y());
    }

    public abstract void D(int i, long j, int i2, boolean z);

    public final void E(long j) {
        F(j, 5);
    }

    public final long a() {
        g2 m = m();
        if (m.v()) {
            return -9223372036854775807L;
        }
        return m.s(x(), this.a).g();
    }

    public final int b() {
        g2 m = m();
        if (m.v()) {
            return -1;
        }
        return m.j(x(), C(), y());
    }

    @Override // com.google.android.exoplayer2.v1
    public final boolean h() {
        return b() != -1;
    }

    @Override // com.google.android.exoplayer2.v1
    public final boolean j(int i) {
        return o().d(i);
    }

    @Override // com.google.android.exoplayer2.v1
    public final boolean k() {
        g2 m = m();
        return !m.v() && m.s(x(), this.a).i;
    }

    @Override // com.google.android.exoplayer2.v1
    public final boolean r() {
        return B() != -1;
    }

    @Override // com.google.android.exoplayer2.v1
    public final boolean v() {
        g2 m = m();
        return !m.v() && m.s(x(), this.a).h;
    }
}
