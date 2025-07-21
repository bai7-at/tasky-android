package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.v1;
import defpackage.bq8;
import defpackage.hq8;
import defpackage.pt0;

/* loaded from: classes2.dex */
public class b2 extends e implements v1 {
    private final h0 b;
    private final pt0 c;

    public static final class a {
        private final k a;

        public a(Context context) {
            this.a = new k(context);
        }

        public b2 a() {
            return this.a.f();
        }

        public a b(hq8 hq8Var) {
            this.a.l(hq8Var);
            return this;
        }
    }

    b2(k kVar) {
        pt0 pt0Var = new pt0();
        this.c = pt0Var;
        try {
            this.b = new h0(kVar, this);
            pt0Var.e();
        } catch (Throwable th) {
            this.c.e();
            throw th;
        }
    }

    private void G() {
        this.c.b();
    }

    @Override // com.google.android.exoplayer2.e
    public void D(int i, long j, int i2, boolean z) {
        G();
        this.b.D(i, j, i2, z);
    }

    public void H() {
        G();
        this.b.J0();
    }

    public long I() {
        G();
        return this.b.P0();
    }

    public bq8 J() {
        G();
        return this.b.T0();
    }

    @Override // com.google.android.exoplayer2.v1
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public ExoPlaybackException f() {
        G();
        return this.b.f();
    }

    public int L(int i) {
        G();
        return this.b.Z0(i);
    }

    public void M() {
        G();
        this.b.D1();
    }

    public void N() {
        G();
        this.b.E1();
    }

    public void O(com.google.android.exoplayer2.source.o oVar) {
        G();
        this.b.J1(oVar);
    }

    public void P(boolean z) {
        G();
        this.b.O1(z);
    }

    public void Q(int i) {
        G();
        this.b.P1(i);
    }

    public void R(SurfaceView surfaceView) {
        G();
        this.b.T1(surfaceView);
    }

    public void S(TextureView textureView) {
        G();
        this.b.U1(textureView);
    }

    public void T(float f) {
        G();
        this.b.V1(f);
    }

    @Override // com.google.android.exoplayer2.v1
    public boolean c() {
        G();
        return this.b.c();
    }

    @Override // com.google.android.exoplayer2.v1
    public long d() {
        G();
        return this.b.d();
    }

    @Override // com.google.android.exoplayer2.v1
    public void e(v1.d dVar) {
        G();
        this.b.e(dVar);
    }

    @Override // com.google.android.exoplayer2.v1
    public h2 g() {
        G();
        return this.b.g();
    }

    @Override // com.google.android.exoplayer2.v1
    public long getDuration() {
        G();
        return this.b.getDuration();
    }

    @Override // com.google.android.exoplayer2.v1
    public float getVolume() {
        G();
        return this.b.getVolume();
    }

    @Override // com.google.android.exoplayer2.v1
    public int i() {
        G();
        return this.b.i();
    }

    @Override // com.google.android.exoplayer2.v1
    public int l() {
        G();
        return this.b.l();
    }

    @Override // com.google.android.exoplayer2.v1
    public g2 m() {
        G();
        return this.b.m();
    }

    @Override // com.google.android.exoplayer2.v1
    public Looper n() {
        G();
        return this.b.n();
    }

    @Override // com.google.android.exoplayer2.v1
    public v1.b o() {
        G();
        return this.b.o();
    }

    @Override // com.google.android.exoplayer2.v1
    public boolean p() {
        G();
        return this.b.p();
    }

    @Override // com.google.android.exoplayer2.v1
    public int q() {
        G();
        return this.b.q();
    }

    @Override // com.google.android.exoplayer2.v1
    public int q0() {
        G();
        return this.b.q0();
    }

    @Override // com.google.android.exoplayer2.v1
    public int s() {
        G();
        return this.b.s();
    }

    @Override // com.google.android.exoplayer2.v1
    public long t() {
        G();
        return this.b.t();
    }

    @Override // com.google.android.exoplayer2.v1
    public void u(v1.d dVar) {
        G();
        this.b.u(dVar);
    }

    @Override // com.google.android.exoplayer2.v1
    public int w() {
        G();
        return this.b.w();
    }

    @Override // com.google.android.exoplayer2.v1
    public int x() {
        G();
        return this.b.x();
    }

    @Override // com.google.android.exoplayer2.v1
    public boolean y() {
        G();
        return this.b.y();
    }

    @Override // com.google.android.exoplayer2.v1
    public long z() {
        G();
        return this.b.z();
    }
}
