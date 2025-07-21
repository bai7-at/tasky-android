package com.google.android.exoplayer2;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import defpackage.cx6;
import defpackage.ep2;
import defpackage.rh4;
import defpackage.sv5;
import defpackage.ur;
import defpackage.y77;

/* loaded from: classes2.dex */
public abstract class f implements z1, a2 {
    private final int b;
    private cx6 d;
    private int e;
    private sv5 f;
    private int g;
    private y77 h;
    private t0[] i;
    private long j;
    private long k;
    private boolean m;
    private boolean n;
    private a2.a r;
    private final Object a = new Object();
    private final ep2 c = new ep2();
    private long l = Long.MIN_VALUE;

    public f(int i) {
        this.b = i;
    }

    private void b0(long j, boolean z) {
        this.m = false;
        this.k = j;
        this.l = j;
        T(j, z);
    }

    @Override // com.google.android.exoplayer2.z1
    public final void B(int i, sv5 sv5Var) {
        this.e = i;
        this.f = sv5Var;
    }

    @Override // com.google.android.exoplayer2.a2
    public int C() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.z1
    public final long E() {
        return this.l;
    }

    @Override // com.google.android.exoplayer2.z1
    public final void F(long j) {
        b0(j, false);
    }

    @Override // com.google.android.exoplayer2.z1
    public rh4 G() {
        return null;
    }

    @Override // com.google.android.exoplayer2.a2
    public final void H(a2.a aVar) {
        synchronized (this.a) {
            this.r = aVar;
        }
    }

    protected final ExoPlaybackException J(Throwable th, t0 t0Var, int i) {
        return K(th, t0Var, false, i);
    }

    protected final ExoPlaybackException K(Throwable th, t0 t0Var, boolean z, int i) {
        int i2;
        if (t0Var != null && !this.n) {
            this.n = true;
            try {
                i2 = a2.I(b(t0Var));
            } catch (ExoPlaybackException unused) {
            } finally {
                this.n = false;
            }
            return ExoPlaybackException.g(th, getName(), N(), t0Var, i2, z, i);
        }
        i2 = 4;
        return ExoPlaybackException.g(th, getName(), N(), t0Var, i2, z, i);
    }

    protected final cx6 L() {
        return (cx6) ur.e(this.d);
    }

    protected final ep2 M() {
        this.c.a();
        return this.c;
    }

    protected final int N() {
        return this.e;
    }

    protected final sv5 O() {
        return (sv5) ur.e(this.f);
    }

    protected final t0[] P() {
        return (t0[]) ur.e(this.i);
    }

    protected final boolean Q() {
        return k() ? this.m : ((y77) ur.e(this.h)).g();
    }

    protected abstract void R();

    protected void S(boolean z, boolean z2) {
    }

    protected abstract void T(long j, boolean z);

    protected void U() {
    }

    protected final void V() {
        a2.a aVar;
        synchronized (this.a) {
            aVar = this.r;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    protected void W() {
    }

    protected void X() {
    }

    protected void Y() {
    }

    protected abstract void Z(t0[] t0VarArr, long j, long j2);

    @Override // com.google.android.exoplayer2.z1
    public final void a() {
        ur.g(this.g == 0);
        this.c.a();
        W();
    }

    protected final int a0(ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i) {
        int p = ((y77) ur.e(this.h)).p(ep2Var, decoderInputBuffer, i);
        if (p == -4) {
            if (decoderInputBuffer.l()) {
                this.l = Long.MIN_VALUE;
                return this.m ? -4 : -3;
            }
            long j = decoderInputBuffer.e + this.j;
            decoderInputBuffer.e = j;
            this.l = Math.max(this.l, j);
        } else if (p == -5) {
            t0 t0Var = (t0) ur.e(ep2Var.b);
            if (t0Var.s != Long.MAX_VALUE) {
                ep2Var.b = t0Var.c().k0(t0Var.s + this.j).G();
            }
        }
        return p;
    }

    @Override // com.google.android.exoplayer2.z1
    public final void c() {
        ur.g(this.g == 1);
        this.c.a();
        this.g = 0;
        this.h = null;
        this.i = null;
        this.m = false;
        R();
    }

    protected int c0(long j) {
        return ((y77) ur.e(this.h)).s(j - this.j);
    }

    @Override // com.google.android.exoplayer2.z1, com.google.android.exoplayer2.a2
    public final int f() {
        return this.b;
    }

    @Override // com.google.android.exoplayer2.z1
    public final int getState() {
        return this.g;
    }

    @Override // com.google.android.exoplayer2.z1
    public final y77 h() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.a2
    public final void j() {
        synchronized (this.a) {
            this.r = null;
        }
    }

    @Override // com.google.android.exoplayer2.z1
    public final boolean k() {
        return this.l == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.z1
    public final void m() {
        this.m = true;
    }

    @Override // com.google.android.exoplayer2.z1
    public final void o(cx6 cx6Var, t0[] t0VarArr, y77 y77Var, long j, boolean z, boolean z2, long j2, long j3) {
        ur.g(this.g == 0);
        this.d = cx6Var;
        this.g = 1;
        S(z, z2);
        t(t0VarArr, y77Var, j2, j3);
        b0(j, z);
    }

    @Override // com.google.android.exoplayer2.z1
    public final void release() {
        ur.g(this.g == 0);
        U();
    }

    @Override // com.google.android.exoplayer2.w1.b
    public void s(int i, Object obj) {
    }

    @Override // com.google.android.exoplayer2.z1
    public final void start() {
        ur.g(this.g == 1);
        this.g = 2;
        X();
    }

    @Override // com.google.android.exoplayer2.z1
    public final void stop() {
        ur.g(this.g == 2);
        this.g = 1;
        Y();
    }

    @Override // com.google.android.exoplayer2.z1
    public final void t(t0[] t0VarArr, y77 y77Var, long j, long j2) {
        ur.g(!this.m);
        this.h = y77Var;
        if (this.l == Long.MIN_VALUE) {
            this.l = j;
        }
        this.i = t0VarArr;
        this.j = j2;
        Z(t0VarArr, j, j2);
    }

    @Override // com.google.android.exoplayer2.z1
    public final void u() {
        ((y77) ur.e(this.h)).a();
    }

    @Override // com.google.android.exoplayer2.z1
    public final boolean v() {
        return this.m;
    }

    @Override // com.google.android.exoplayer2.z1
    public final a2 x() {
        return this;
    }
}
