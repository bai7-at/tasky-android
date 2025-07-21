package defpackage;

import com.google.android.exoplayer2.source.rtsp.h;

/* loaded from: classes2.dex */
final class q37 implements a47 {
    private final h a;
    private final xo5 b = new xo5();
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private long g;
    private yp8 h;
    private long i;

    public q37(h hVar) {
        this.a = hVar;
        this.c = hVar.b;
        String str = (String) ur.e((String) hVar.d.get("mode"));
        if (tr.a(str, "AAC-hbr")) {
            this.d = 13;
            this.e = 3;
        } else {
            if (!tr.a(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.d = 6;
            this.e = 2;
        }
        this.f = this.e + this.d;
    }

    private static void e(yp8 yp8Var, long j, int i) {
        yp8Var.b(j, 1, i, 0, null);
    }

    @Override // defpackage.a47
    public void a(long j, long j2) {
        this.g = j;
        this.i = j2;
    }

    @Override // defpackage.a47
    public void b(a82 a82Var, int i) {
        yp8 a = a82Var.a(i, 1);
        this.h = a;
        a.d(this.a.c);
    }

    @Override // defpackage.a47
    public void c(long j, int i) {
        this.g = j;
    }

    @Override // defpackage.a47
    public void d(yo5 yo5Var, long j, int i, boolean z) {
        ur.e(this.h);
        short D = yo5Var.D();
        int i2 = D / this.f;
        long a = c47.a(this.i, j, this.g, this.c);
        this.b.m(yo5Var);
        if (i2 == 1) {
            int h = this.b.h(this.d);
            this.b.r(this.e);
            this.h.a(yo5Var, yo5Var.a());
            if (z) {
                e(this.h, a, h);
                return;
            }
            return;
        }
        yo5Var.V((D + 7) / 8);
        for (int i3 = 0; i3 < i2; i3++) {
            int h2 = this.b.h(this.d);
            this.b.r(this.e);
            this.h.a(yo5Var, h2);
            e(this.h, a, h2);
            a += z19.Q0(i2, 1000000L, this.c);
        }
    }
}
