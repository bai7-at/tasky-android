package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class x7a implements m7a {
    private static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final p9a a;
    private w7a f;
    private long g;
    private String h;
    private tx9 i;
    private boolean j;
    private final boolean[] c = new boolean[4];
    private final v7a d = new v7a(128);
    private long k = -9223372036854775807L;
    private final h8a e = new h8a(178, 128);
    private final b9e b = new b9e();

    x7a(p9a p9aVar) {
        this.a = p9aVar;
    }

    @Override // defpackage.m7a
    public final void a(boolean z) {
        wad.b(this.f);
        if (z) {
            this.f.b(this.g, 0, this.j);
            this.f.d();
        }
    }

    @Override // defpackage.m7a
    public final void b(b9e b9eVar) {
        int i;
        int i2 = 3;
        wad.b(this.f);
        wad.b(this.i);
        int s = b9eVar.s();
        int t = b9eVar.t();
        byte[] m = b9eVar.m();
        this.g += b9eVar.q();
        this.i.b(b9eVar, b9eVar.q());
        while (true) {
            int a = kre.a(m, s, t, this.c);
            if (a == t) {
                break;
            }
            int i3 = a + 3;
            int i4 = b9eVar.m()[i3] & 255;
            int i5 = a - s;
            if (!this.j) {
                if (i5 > 0) {
                    this.d.a(m, s, a);
                }
                if (this.d.c(i4, i5 < 0 ? -i5 : 0)) {
                    tx9 tx9Var = this.i;
                    v7a v7aVar = this.d;
                    int i6 = v7aVar.d;
                    String str = this.h;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(v7aVar.e, v7aVar.c);
                    g8e g8eVar = new g8e(copyOf, copyOf.length);
                    g8eVar.n(i6);
                    g8eVar.n(4);
                    g8eVar.l();
                    g8eVar.m(8);
                    if (g8eVar.o()) {
                        g8eVar.m(4);
                        g8eVar.m(i2);
                    }
                    int d = g8eVar.d(4);
                    float f = 1.0f;
                    if (d == 15) {
                        int d2 = g8eVar.d(8);
                        int d3 = g8eVar.d(8);
                        if (d3 == 0) {
                            ezd.f("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = d2 / d3;
                        }
                    } else if (d < 7) {
                        f = l[d];
                    } else {
                        ezd.f("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (g8eVar.o()) {
                        g8eVar.m(2);
                        g8eVar.m(1);
                        if (g8eVar.o()) {
                            g8eVar.m(15);
                            g8eVar.l();
                            g8eVar.m(15);
                            g8eVar.l();
                            g8eVar.m(15);
                            g8eVar.l();
                            g8eVar.m(3);
                            g8eVar.m(11);
                            g8eVar.l();
                            g8eVar.m(15);
                            g8eVar.l();
                        }
                    }
                    if (g8eVar.d(2) != 0) {
                        ezd.f("H263Reader", "Unhandled video object layer shape");
                    }
                    g8eVar.l();
                    int d4 = g8eVar.d(16);
                    g8eVar.l();
                    if (g8eVar.o()) {
                        if (d4 == 0) {
                            ezd.f("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = d4 - 1;
                            int i8 = 0;
                            while (i7 > 0) {
                                i7 >>= 1;
                                i8++;
                            }
                            g8eVar.m(i8);
                        }
                    }
                    g8eVar.l();
                    int d5 = g8eVar.d(13);
                    g8eVar.l();
                    int d6 = g8eVar.d(13);
                    g8eVar.l();
                    g8eVar.l();
                    x3a x3aVar = new x3a();
                    x3aVar.k(str);
                    x3aVar.w("video/mp4v-es");
                    x3aVar.C(d5);
                    x3aVar.i(d6);
                    x3aVar.s(f2);
                    x3aVar.l(Collections.singletonList(copyOf));
                    tx9Var.f(x3aVar.D());
                    this.j = true;
                }
            }
            this.f.a(m, s, a);
            h8a h8aVar = this.e;
            if (i5 > 0) {
                h8aVar.a(m, s, a);
                i = 0;
            } else {
                i = -i5;
            }
            if (this.e.d(i)) {
                h8a h8aVar2 = this.e;
                int b = kre.b(h8aVar2.d, h8aVar2.e);
                b9e b9eVar2 = this.b;
                int i9 = khe.a;
                b9eVar2.i(this.e.d, b);
                this.a.a(this.k, this.b);
            }
            if (i4 == 178) {
                if (b9eVar.m()[a + 2] == 1) {
                    this.e.c(178);
                }
                i4 = 178;
            }
            int i10 = t - a;
            this.f.b(this.g - i10, i10, this.j);
            this.f.c(i4, this.k);
            s = i3;
            i2 = 3;
        }
        if (!this.j) {
            this.d.a(m, s, t);
        }
        this.f.a(m, s, t);
        this.e.a(m, s, t);
    }

    @Override // defpackage.m7a
    public final void c(sv9 sv9Var, m9a m9aVar) {
        m9aVar.c();
        this.h = m9aVar.b();
        tx9 zzw = sv9Var.zzw(m9aVar.a(), 2);
        this.i = zzw;
        this.f = new w7a(zzw);
        this.a.b(sv9Var, m9aVar);
    }

    @Override // defpackage.m7a
    public final void d(long j, int i) {
        this.k = j;
    }

    @Override // defpackage.m7a
    public final void zze() {
        kre.f(this.c);
        this.d.b();
        w7a w7aVar = this.f;
        if (w7aVar != null) {
            w7aVar.d();
        }
        this.e.b();
        this.g = 0L;
        this.k = -9223372036854775807L;
    }
}
