package com.google.android.exoplayer2;

import defpackage.h08;
import defpackage.rh4;
import defpackage.ur;
import defpackage.vl0;

/* loaded from: classes2.dex */
final class i implements rh4 {
    private final h08 a;
    private final a b;
    private z1 c;
    private rh4 d;
    private boolean e = true;
    private boolean f;

    public interface a {
        void m(u1 u1Var);
    }

    public i(a aVar, vl0 vl0Var) {
        this.b = aVar;
        this.a = new h08(vl0Var);
    }

    private boolean d(boolean z) {
        z1 z1Var = this.c;
        return z1Var == null || z1Var.d() || (!this.c.g() && (z || this.c.k()));
    }

    private void j(boolean z) {
        if (d(z)) {
            this.e = true;
            if (this.f) {
                this.a.b();
                return;
            }
            return;
        }
        rh4 rh4Var = (rh4) ur.e(this.d);
        long z2 = rh4Var.z();
        if (this.e) {
            if (z2 < this.a.z()) {
                this.a.c();
                return;
            } else {
                this.e = false;
                if (this.f) {
                    this.a.b();
                }
            }
        }
        this.a.a(z2);
        u1 e = rh4Var.e();
        if (e.equals(this.a.e())) {
            return;
        }
        this.a.i(e);
        this.b.m(e);
    }

    public void a(z1 z1Var) {
        if (z1Var == this.c) {
            this.d = null;
            this.c = null;
            this.e = true;
        }
    }

    public void b(z1 z1Var) {
        rh4 rh4Var;
        rh4 G = z1Var.G();
        if (G == null || G == (rh4Var = this.d)) {
            return;
        }
        if (rh4Var != null) {
            throw ExoPlaybackException.i(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.d = G;
        this.c = z1Var;
        G.i(this.a.e());
    }

    public void c(long j) {
        this.a.a(j);
    }

    @Override // defpackage.rh4
    public u1 e() {
        rh4 rh4Var = this.d;
        return rh4Var != null ? rh4Var.e() : this.a.e();
    }

    public void f() {
        this.f = true;
        this.a.b();
    }

    public void g() {
        this.f = false;
        this.a.c();
    }

    public long h(boolean z) {
        j(z);
        return z();
    }

    @Override // defpackage.rh4
    public void i(u1 u1Var) {
        rh4 rh4Var = this.d;
        if (rh4Var != null) {
            rh4Var.i(u1Var);
            u1Var = this.d.e();
        }
        this.a.i(u1Var);
    }

    @Override // defpackage.rh4
    public long z() {
        return this.e ? this.a.z() : ((rh4) ur.e(this.d)).z();
    }
}
