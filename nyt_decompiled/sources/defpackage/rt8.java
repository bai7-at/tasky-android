package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import defpackage.ei7;
import defpackage.st8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class rt8 implements y72 {
    public static final d82 t = new d82() { // from class: qt8
        @Override // defpackage.d82
        public final y72[] c() {
            y72[] w;
            w = rt8.w();
            return w;
        }
    };
    private final int a;
    private final int b;
    private final List c;
    private final yo5 d;
    private final SparseIntArray e;
    private final st8.c f;
    private final SparseArray g;
    private final SparseBooleanArray h;
    private final SparseBooleanArray i;
    private final pt8 j;
    private ot8 k;
    private a82 l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private st8 q;
    private int r;
    private int s;

    private class a implements vh7 {
        private final xo5 a = new xo5(new byte[4]);

        public a() {
        }

        @Override // defpackage.vh7
        public void a(yo5 yo5Var) {
            if (yo5Var.H() == 0 && (yo5Var.H() & 128) != 0) {
                yo5Var.V(6);
                int a = yo5Var.a() / 4;
                for (int i = 0; i < a; i++) {
                    yo5Var.k(this.a, 4);
                    int h = this.a.h(16);
                    this.a.r(3);
                    if (h == 0) {
                        this.a.r(13);
                    } else {
                        int h2 = this.a.h(13);
                        if (rt8.this.g.get(h2) == null) {
                            rt8.this.g.put(h2, new xh7(rt8.this.new b(h2)));
                            rt8.k(rt8.this);
                        }
                    }
                }
                if (rt8.this.a != 2) {
                    rt8.this.g.remove(0);
                }
            }
        }

        @Override // defpackage.vh7
        public void b(qm8 qm8Var, a82 a82Var, st8.d dVar) {
        }
    }

    private class b implements vh7 {
        private final xo5 a = new xo5(new byte[5]);
        private final SparseArray b = new SparseArray();
        private final SparseIntArray c = new SparseIntArray();
        private final int d;

        public b(int i) {
            this.d = i;
        }

        private st8.b c(yo5 yo5Var, int i) {
            int f = yo5Var.f();
            int i2 = i + f;
            int i3 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (yo5Var.f() < i2) {
                int H = yo5Var.H();
                int f2 = yo5Var.f() + yo5Var.H();
                if (f2 > i2) {
                    break;
                }
                if (H == 5) {
                    long J = yo5Var.J();
                    if (J != 1094921523) {
                        if (J != 1161904947) {
                            if (J != 1094921524) {
                                if (J == 1212503619) {
                                    i3 = 36;
                                }
                            }
                            i3 = 172;
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                } else {
                    if (H != 106) {
                        if (H != 122) {
                            if (H == 127) {
                                if (yo5Var.H() != 21) {
                                }
                                i3 = 172;
                            } else if (H == 123) {
                                i3 = 138;
                            } else if (H == 10) {
                                str = yo5Var.E(3).trim();
                            } else if (H == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (yo5Var.f() < f2) {
                                    String trim = yo5Var.E(3).trim();
                                    int H2 = yo5Var.H();
                                    byte[] bArr = new byte[4];
                                    yo5Var.l(bArr, 0, 4);
                                    arrayList2.add(new st8.a(trim, H2, bArr));
                                }
                                arrayList = arrayList2;
                                i3 = 89;
                            } else if (H == 111) {
                                i3 = 257;
                            }
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                }
                yo5Var.V(f2 - yo5Var.f());
            }
            yo5Var.U(i2);
            return new st8.b(i3, str, arrayList, Arrays.copyOfRange(yo5Var.e(), f, i2));
        }

        @Override // defpackage.vh7
        public void a(yo5 yo5Var) {
            qm8 qm8Var;
            if (yo5Var.H() != 2) {
                return;
            }
            if (rt8.this.a == 1 || rt8.this.a == 2 || rt8.this.m == 1) {
                qm8Var = (qm8) rt8.this.c.get(0);
            } else {
                qm8Var = new qm8(((qm8) rt8.this.c.get(0)).c());
                rt8.this.c.add(qm8Var);
            }
            if ((yo5Var.H() & 128) == 0) {
                return;
            }
            yo5Var.V(1);
            int N = yo5Var.N();
            int i = 3;
            yo5Var.V(3);
            yo5Var.k(this.a, 2);
            this.a.r(3);
            int i2 = 13;
            rt8.this.s = this.a.h(13);
            yo5Var.k(this.a, 2);
            int i3 = 4;
            this.a.r(4);
            yo5Var.V(this.a.h(12));
            if (rt8.this.a == 2 && rt8.this.q == null) {
                st8.b bVar = new st8.b(21, null, null, z19.f);
                rt8 rt8Var = rt8.this;
                rt8Var.q = rt8Var.f.b(21, bVar);
                if (rt8.this.q != null) {
                    rt8.this.q.b(qm8Var, rt8.this.l, new st8.d(N, 21, 8192));
                }
            }
            this.b.clear();
            this.c.clear();
            int a = yo5Var.a();
            while (a > 0) {
                yo5Var.k(this.a, 5);
                int h = this.a.h(8);
                this.a.r(i);
                int h2 = this.a.h(i2);
                this.a.r(i3);
                int h3 = this.a.h(12);
                st8.b c = c(yo5Var, h3);
                if (h == 6 || h == 5) {
                    h = c.a;
                }
                a -= h3 + 5;
                int i4 = rt8.this.a == 2 ? h : h2;
                if (!rt8.this.h.get(i4)) {
                    st8 b = (rt8.this.a == 2 && h == 21) ? rt8.this.q : rt8.this.f.b(h, c);
                    if (rt8.this.a != 2 || h2 < this.c.get(i4, 8192)) {
                        this.c.put(i4, h2);
                        this.b.put(i4, b);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.c.size();
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = this.c.keyAt(i5);
                int valueAt = this.c.valueAt(i5);
                rt8.this.h.put(keyAt, true);
                rt8.this.i.put(valueAt, true);
                st8 st8Var = (st8) this.b.valueAt(i5);
                if (st8Var != null) {
                    if (st8Var != rt8.this.q) {
                        st8Var.b(qm8Var, rt8.this.l, new st8.d(N, keyAt, 8192));
                    }
                    rt8.this.g.put(valueAt, st8Var);
                }
            }
            if (rt8.this.a == 2) {
                if (rt8.this.n) {
                    return;
                }
                rt8.this.l.s();
                rt8.this.m = 0;
                rt8.this.n = true;
                return;
            }
            rt8.this.g.remove(this.d);
            rt8 rt8Var2 = rt8.this;
            rt8Var2.m = rt8Var2.a == 1 ? 0 : rt8.this.m - 1;
            if (rt8.this.m == 0) {
                rt8.this.l.s();
                rt8.this.n = true;
            }
        }

        @Override // defpackage.vh7
        public void b(qm8 qm8Var, a82 a82Var, st8.d dVar) {
        }
    }

    public rt8() {
        this(0);
    }

    static /* synthetic */ int k(rt8 rt8Var) {
        int i = rt8Var.m;
        rt8Var.m = i + 1;
        return i;
    }

    private boolean u(z72 z72Var) {
        byte[] e = this.d.e();
        if (9400 - this.d.f() < 188) {
            int a2 = this.d.a();
            if (a2 > 0) {
                System.arraycopy(e, this.d.f(), e, 0, a2);
            }
            this.d.S(e, a2);
        }
        while (this.d.a() < 188) {
            int g = this.d.g();
            int read = z72Var.read(e, g, 9400 - g);
            if (read == -1) {
                return false;
            }
            this.d.T(g + read);
        }
        return true;
    }

    private int v() {
        int f = this.d.f();
        int g = this.d.g();
        int a2 = tt8.a(this.d.e(), f, g);
        this.d.U(a2);
        int i = a2 + 188;
        if (i > g) {
            int i2 = this.r + (a2 - f);
            this.r = i2;
            if (this.a == 2 && i2 > 376) {
                throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.r = 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y72[] w() {
        return new y72[]{new rt8()};
    }

    private void x(long j) {
        if (this.o) {
            return;
        }
        this.o = true;
        if (this.j.b() == -9223372036854775807L) {
            this.l.p(new ei7.b(this.j.b()));
            return;
        }
        ot8 ot8Var = new ot8(this.j.c(), this.j.b(), j, this.s, this.b);
        this.k = ot8Var;
        this.l.p(ot8Var.b());
    }

    private void y() {
        this.h.clear();
        this.g.clear();
        SparseArray a2 = this.f.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            this.g.put(a2.keyAt(i), (st8) a2.valueAt(i));
        }
        this.g.put(0, new xh7(new a()));
        this.q = null;
    }

    private boolean z(int i) {
        return this.a == 2 || this.n || !this.i.get(i, false);
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        ot8 ot8Var;
        ur.g(this.a != 2);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            qm8 qm8Var = (qm8) this.c.get(i);
            boolean z = qm8Var.e() == -9223372036854775807L;
            if (!z) {
                long c = qm8Var.c();
                z = (c == -9223372036854775807L || c == 0 || c == j2) ? false : true;
            }
            if (z) {
                qm8Var.h(j2);
            }
        }
        if (j2 != 0 && (ot8Var = this.k) != null) {
            ot8Var.h(j2);
        }
        this.d.Q(0);
        this.e.clear();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            ((st8) this.g.valueAt(i2)).c();
        }
        this.r = 0;
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.l = a82Var;
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        long length = z72Var.getLength();
        if (this.n) {
            if (length != -1 && this.a != 2 && !this.j.d()) {
                return this.j.e(z72Var, e06Var, this.s);
            }
            x(length);
            if (this.p) {
                this.p = false;
                a(0L, 0L);
                if (z72Var.getPosition() != 0) {
                    e06Var.a = 0L;
                    return 1;
                }
            }
            ot8 ot8Var = this.k;
            if (ot8Var != null && ot8Var.d()) {
                return this.k.c(z72Var, e06Var);
            }
        }
        if (!u(z72Var)) {
            return -1;
        }
        int v = v();
        int g = this.d.g();
        if (v > g) {
            return 0;
        }
        int q = this.d.q();
        if ((8388608 & q) != 0) {
            this.d.U(v);
            return 0;
        }
        int i = (4194304 & q) != 0 ? 1 : 0;
        int i2 = (2096896 & q) >> 8;
        boolean z = (q & 32) != 0;
        st8 st8Var = (q & 16) != 0 ? (st8) this.g.get(i2) : null;
        if (st8Var == null) {
            this.d.U(v);
            return 0;
        }
        if (this.a != 2) {
            int i3 = q & 15;
            int i4 = this.e.get(i2, i3 - 1);
            this.e.put(i2, i3);
            if (i4 == i3) {
                this.d.U(v);
                return 0;
            }
            if (i3 != ((i4 + 1) & 15)) {
                st8Var.c();
            }
        }
        if (z) {
            int H = this.d.H();
            i |= (this.d.H() & 64) != 0 ? 2 : 0;
            this.d.V(H - 1);
        }
        boolean z2 = this.n;
        if (z(i2)) {
            this.d.T(v);
            st8Var.a(this.d, i);
            this.d.T(g);
        }
        if (this.a != 2 && !z2 && this.n && length != -1) {
            this.p = true;
        }
        this.d.U(v);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r0 = r0 + 1;
     */
    @Override // defpackage.y72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(defpackage.z72 r6) {
        /*
            r5 = this;
            yo5 r5 = r5.d
            byte[] r5 = r5.e()
            r0 = 940(0x3ac, float:1.317E-42)
            r1 = 0
            r6.r(r5, r1, r0)
            r0 = r1
        Ld:
            r2 = 188(0xbc, float:2.63E-43)
            if (r0 >= r2) goto L29
            r2 = r1
        L12:
            r3 = 5
            if (r2 >= r3) goto L24
            int r3 = r2 * 188
            int r3 = r3 + r0
            r3 = r5[r3]
            r4 = 71
            if (r3 == r4) goto L21
            int r0 = r0 + 1
            goto Ld
        L21:
            int r2 = r2 + 1
            goto L12
        L24:
            r6.p(r0)
            r5 = 1
            return r5
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt8.e(z72):boolean");
    }

    @Override // defpackage.y72
    public void release() {
    }

    public rt8(int i) {
        this(1, i, 112800);
    }

    public rt8(int i, int i2, int i3) {
        this(i, new qm8(0L), new vk1(i2), i3);
    }

    public rt8(int i, qm8 qm8Var, st8.c cVar) {
        this(i, qm8Var, cVar, 112800);
    }

    public rt8(int i, qm8 qm8Var, st8.c cVar, int i2) {
        this.f = (st8.c) ur.e(cVar);
        this.b = i2;
        this.a = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(qm8Var);
        } else {
            this.c = Collections.singletonList(qm8Var);
        }
        this.d = new yo5(new byte[9400], 0);
        this.h = new SparseBooleanArray();
        this.i = new SparseBooleanArray();
        this.g = new SparseArray();
        this.e = new SparseIntArray();
        this.j = new pt8(i2);
        this.l = a82.q;
        this.s = -1;
        y();
    }
}
