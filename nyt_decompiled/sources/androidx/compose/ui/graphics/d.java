package androidx.compose.ui.graphics;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.fm1;
import defpackage.hm1;
import defpackage.nn0;
import defpackage.no7;
import defpackage.o23;
import defpackage.qt6;
import defpackage.yw6;
import defpackage.zq3;
import defpackage.zt7;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class d implements c {
    private int a;
    private float e;
    private float f;
    private float g;
    private float j;
    private float k;
    private float l;
    private boolean s;
    private float b = 1.0f;
    private float c = 1.0f;
    private float d = 1.0f;
    private long h = o23.a();
    private long i = o23.a();
    private float m = 8.0f;
    private long n = e.b.a();
    private no7 r = qt6.a();
    private int t = a.a.a();
    private long u = zt7.b.a();
    private fm1 w = hm1.b(1.0f, 0.0f, 2, null);

    @Override // androidx.compose.ui.graphics.c
    public float D0() {
        return this.b;
    }

    @Override // androidx.compose.ui.graphics.c
    public void G0(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }

    @Override // androidx.compose.ui.graphics.c
    public float M() {
        return this.k;
    }

    @Override // androidx.compose.ui.graphics.c
    public float R() {
        return this.l;
    }

    @Override // androidx.compose.ui.graphics.c
    public long b() {
        return this.u;
    }

    @Override // androidx.compose.ui.graphics.c
    public void b0(long j) {
        if (nn0.t(this.h, j)) {
            return;
        }
        this.a |= 64;
        this.h = j;
    }

    @Override // androidx.compose.ui.graphics.c
    public void c(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    @Override // defpackage.an2
    public float c1() {
        return this.w.c1();
    }

    public float d() {
        return this.d;
    }

    @Override // androidx.compose.ui.graphics.c
    public float d1() {
        return this.f;
    }

    public long e() {
        return this.h;
    }

    @Override // androidx.compose.ui.graphics.c
    public void e1(no7 no7Var) {
        if (zq3.c(this.r, no7Var)) {
            return;
        }
        this.a |= 8192;
        this.r = no7Var;
    }

    public boolean f() {
        return this.s;
    }

    @Override // androidx.compose.ui.graphics.c
    public float f0() {
        return this.m;
    }

    @Override // androidx.compose.ui.graphics.c
    public void g(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    @Override // defpackage.fm1
    public float getDensity() {
        return this.w.getDensity();
    }

    @Override // androidx.compose.ui.graphics.c
    public void h(yw6 yw6Var) {
        if (zq3.c(null, yw6Var)) {
            return;
        }
        this.a |= 131072;
    }

    public int i() {
        return this.t;
    }

    @Override // androidx.compose.ui.graphics.c
    public void i0(boolean z) {
        if (this.s != z) {
            this.a |= Http2.INITIAL_MAX_FRAME_SIZE;
            this.s = z;
        }
    }

    @Override // androidx.compose.ui.graphics.c
    public void j(int i) {
        if (a.e(this.t, i)) {
            return;
        }
        this.a |= 32768;
        this.t = i;
    }

    @Override // androidx.compose.ui.graphics.c
    public long j0() {
        return this.n;
    }

    public final int k() {
        return this.a;
    }

    public yw6 l() {
        return null;
    }

    public float m() {
        return this.g;
    }

    @Override // androidx.compose.ui.graphics.c
    public void m0(long j) {
        if (e.e(this.n, j)) {
            return;
        }
        this.a |= ProgressEvent.PART_FAILED_EVENT_CODE;
        this.n = j;
    }

    @Override // androidx.compose.ui.graphics.c
    public float m1() {
        return this.e;
    }

    @Override // androidx.compose.ui.graphics.c
    public void n(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    @Override // androidx.compose.ui.graphics.c
    public void n0(long j) {
        if (nn0.t(this.i, j)) {
            return;
        }
        this.a |= 128;
        this.i = j;
    }

    public no7 o() {
        return this.r;
    }

    @Override // androidx.compose.ui.graphics.c
    public float o1() {
        return this.j;
    }

    @Override // androidx.compose.ui.graphics.c
    public void p(float f) {
        if (this.m == f) {
            return;
        }
        this.a |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
        this.m = f;
    }

    @Override // androidx.compose.ui.graphics.c
    public void q(float f) {
        if (this.j == f) {
            return;
        }
        this.a |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        this.j = f;
    }

    @Override // androidx.compose.ui.graphics.c
    public void r(float f) {
        if (this.k == f) {
            return;
        }
        this.a |= 512;
        this.k = f;
    }

    @Override // androidx.compose.ui.graphics.c
    public void s(float f) {
        if (this.l == f) {
            return;
        }
        this.a |= 1024;
        this.l = f;
    }

    @Override // androidx.compose.ui.graphics.c
    public void t(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public long u() {
        return this.i;
    }

    public final void w() {
        n(1.0f);
        t(1.0f);
        c(1.0f);
        x(0.0f);
        g(0.0f);
        G0(0.0f);
        b0(o23.a());
        n0(o23.a());
        q(0.0f);
        r(0.0f);
        s(0.0f);
        p(8.0f);
        m0(e.b.a());
        e1(qt6.a());
        i0(false);
        h(null);
        j(a.a.a());
        z(zt7.b.a());
        this.a = 0;
    }

    @Override // androidx.compose.ui.graphics.c
    public void x(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    public final void y(fm1 fm1Var) {
        this.w = fm1Var;
    }

    @Override // androidx.compose.ui.graphics.c
    public float y1() {
        return this.c;
    }

    public void z(long j) {
        this.u = j;
    }
}
