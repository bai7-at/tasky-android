package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.t0;
import defpackage.j15;
import defpackage.st8;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l63 implements uy1 {
    private final mi7 a;
    private final boolean b;
    private final boolean c;
    private long g;
    private String i;
    private yp8 j;
    private b k;
    private boolean l;
    private boolean n;
    private final boolean[] h = new boolean[3];
    private final i15 d = new i15(7, 128);
    private final i15 e = new i15(8, 128);
    private final i15 f = new i15(6, 128);
    private long m = -9223372036854775807L;
    private final yo5 o = new yo5();

    private static final class b {
        private final yp8 a;
        private final boolean b;
        private final boolean c;
        private final SparseArray d = new SparseArray();
        private final SparseArray e = new SparseArray();
        private final zo5 f;
        private byte[] g;
        private int h;
        private int i;
        private long j;
        private boolean k;
        private long l;
        private a m;
        private a n;
        private boolean o;
        private long p;
        private long q;
        private boolean r;

        private static final class a {
            private boolean a;
            private boolean b;
            private j15.c c;
            private int d;
            private int e;
            private int f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;
            private boolean k;
            private int l;
            private int m;
            private int n;
            private int o;
            private int p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.a) {
                    return false;
                }
                if (!aVar.a) {
                    return true;
                }
                j15.c cVar = (j15.c) ur.i(this.c);
                j15.c cVar2 = (j15.c) ur.i(aVar.c);
                return (this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && (!this.i || !aVar.i || this.j == aVar.j) && (((i = this.d) == (i2 = aVar.d) || (i != 0 && i2 != 0)) && (((i3 = cVar.l) != 0 || cVar2.l != 0 || (this.m == aVar.m && this.n == aVar.n)) && ((i3 != 1 || cVar2.l != 1 || (this.o == aVar.o && this.p == aVar.p)) && (z = this.k) == aVar.k && (!z || this.l == aVar.l))))) ? false : true;
            }

            public void b() {
                this.b = false;
                this.a = false;
            }

            public boolean d() {
                int i;
                return this.b && ((i = this.e) == 7 || i == 2);
            }

            public void e(j15.c cVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.c = cVar;
                this.d = i;
                this.e = i2;
                this.f = i3;
                this.g = i4;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i5;
                this.m = i6;
                this.n = i7;
                this.o = i8;
                this.p = i9;
                this.a = true;
                this.b = true;
            }

            public void f(int i) {
                this.e = i;
                this.b = true;
            }
        }

        public b(yp8 yp8Var, boolean z, boolean z2) {
            this.a = yp8Var;
            this.b = z;
            this.c = z2;
            this.m = new a();
            this.n = new a();
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new zo5(bArr, 0, 0);
            g();
        }

        private void d(int i) {
            long j = this.q;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.r;
            this.a.b(j, z ? 1 : 0, (int) (this.j - this.p), i, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 416
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: l63.b.a(byte[], int, int):void");
        }

        public boolean b(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.i == 9 || (this.c && this.n.c(this.m))) {
                if (z && this.o) {
                    d(i + ((int) (j - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            if (this.b) {
                z2 = this.n.d();
            }
            boolean z4 = this.r;
            int i2 = this.i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.r = z5;
            return z5;
        }

        public boolean c() {
            return this.c;
        }

        public void e(j15.b bVar) {
            this.e.append(bVar.a, bVar);
        }

        public void f(j15.c cVar) {
            this.d.append(cVar.d, cVar);
        }

        public void g() {
            this.k = false;
            this.o = false;
            this.n.b();
        }

        public void h(long j, int i, long j2) {
            this.i = i;
            this.l = j2;
            this.j = j;
            if (!this.b || i != 1) {
                if (!this.c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            a aVar = this.m;
            this.m = this.n;
            this.n = aVar;
            aVar.b();
            this.h = 0;
            this.k = true;
        }
    }

    public l63(mi7 mi7Var, boolean z, boolean z2) {
        this.a = mi7Var;
        this.b = z;
        this.c = z2;
    }

    private void b() {
        ur.i(this.j);
        z19.j(this.k);
    }

    private void g(long j, int i, int i2, long j2) {
        if (!this.l || this.k.c()) {
            this.d.b(i2);
            this.e.b(i2);
            if (this.l) {
                if (this.d.c()) {
                    i15 i15Var = this.d;
                    this.k.f(j15.l(i15Var.d, 3, i15Var.e));
                    this.d.d();
                } else if (this.e.c()) {
                    i15 i15Var2 = this.e;
                    this.k.e(j15.j(i15Var2.d, 3, i15Var2.e));
                    this.e.d();
                }
            } else if (this.d.c() && this.e.c()) {
                ArrayList arrayList = new ArrayList();
                i15 i15Var3 = this.d;
                arrayList.add(Arrays.copyOf(i15Var3.d, i15Var3.e));
                i15 i15Var4 = this.e;
                arrayList.add(Arrays.copyOf(i15Var4.d, i15Var4.e));
                i15 i15Var5 = this.d;
                j15.c l = j15.l(i15Var5.d, 3, i15Var5.e);
                i15 i15Var6 = this.e;
                j15.b j3 = j15.j(i15Var6.d, 3, i15Var6.e);
                this.j.d(new t0.b().U(this.i).g0("video/avc").K(wm0.a(l.a, l.b, l.c)).n0(l.f).S(l.g).c0(l.h).V(arrayList).G());
                this.l = true;
                this.k.f(l);
                this.k.e(j3);
                this.d.d();
                this.e.d();
            }
        }
        if (this.f.b(i2)) {
            i15 i15Var7 = this.f;
            this.o.S(this.f.d, j15.q(i15Var7.d, i15Var7.e));
            this.o.U(4);
            this.a.a(j2, this.o);
        }
        if (this.k.b(j, i, this.l, this.n)) {
            this.n = false;
        }
    }

    private void h(byte[] bArr, int i, int i2) {
        if (!this.l || this.k.c()) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    private void i(long j, int i, long j2) {
        if (!this.l || this.k.c()) {
            this.d.e(i);
            this.e.e(i);
        }
        this.f.e(i);
        this.k.h(j, i, j2);
    }

    @Override // defpackage.uy1
    public void a(yo5 yo5Var) {
        b();
        int f = yo5Var.f();
        int g = yo5Var.g();
        byte[] e = yo5Var.e();
        this.g += yo5Var.a();
        this.j.a(yo5Var, yo5Var.a());
        while (true) {
            int c = j15.c(e, f, g, this.h);
            if (c == g) {
                h(e, f, g);
                return;
            }
            int f2 = j15.f(e, c);
            int i = c - f;
            if (i > 0) {
                h(e, f, c);
            }
            int i2 = g - c;
            long j = this.g - i2;
            g(j, i2, i < 0 ? -i : 0, this.m);
            i(j, f2, this.m);
            f = c + 3;
        }
    }

    @Override // defpackage.uy1
    public void c() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        j15.a(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        b bVar = this.k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // defpackage.uy1
    public void d(a82 a82Var, st8.d dVar) {
        dVar.a();
        this.i = dVar.b();
        yp8 a2 = a82Var.a(dVar.c(), 2);
        this.j = a2;
        this.k = new b(a2, this.b, this.c);
        this.a.b(a82Var, dVar);
    }

    @Override // defpackage.uy1
    public void e() {
    }

    @Override // defpackage.uy1
    public void f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
        this.n |= (i & 2) != 0;
    }
}
