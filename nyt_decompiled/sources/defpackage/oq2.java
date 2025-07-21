package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.t0;
import defpackage.ei7;
import defpackage.yu;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public class oq2 implements y72 {
    public static final d82 I = new d82() { // from class: mq2
        @Override // defpackage.d82
        public final y72[] c() {
            y72[] m;
            m = oq2.m();
            return m;
        }
    };
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final t0 K = new t0.b().g0("application/x-emsg").G();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private a82 E;
    private yp8[] F;
    private yp8[] G;
    private boolean H;
    private final int a;
    private final qp8 b;
    private final List c;
    private final SparseArray d;
    private final yo5 e;
    private final yo5 f;
    private final yo5 g;
    private final byte[] h;
    private final yo5 i;
    private final qm8 j;
    private final j42 k;
    private final yo5 l;
    private final ArrayDeque m;
    private final ArrayDeque n;
    private final yp8 o;
    private int p;
    private int q;
    private long r;
    private int s;
    private yo5 t;
    private long u;
    private int v;
    private long w;
    private long x;
    private long y;
    private b z;

    private static final class a {
        public final long a;
        public final boolean b;
        public final int c;

        public a(long j, boolean z, int i) {
            this.a = j;
            this.b = z;
            this.c = i;
        }
    }

    private static final class b {
        public final yp8 a;
        public zp8 d;
        public gj1 e;
        public int f;
        public int g;
        public int h;
        public int i;
        private boolean l;
        public final sp8 b = new sp8();
        public final yo5 c = new yo5();
        private final yo5 j = new yo5(1);
        private final yo5 k = new yo5();

        public b(yp8 yp8Var, zp8 zp8Var, gj1 gj1Var) {
            this.a = yp8Var;
            this.d = zp8Var;
            this.e = gj1Var;
            j(zp8Var, gj1Var);
        }

        public int c() {
            int i = !this.l ? this.d.g[this.f] : this.b.k[this.f] ? 1 : 0;
            return g() != null ? i | 1073741824 : i;
        }

        public long d() {
            return !this.l ? this.d.c[this.f] : this.b.g[this.h];
        }

        public long e() {
            return !this.l ? this.d.f[this.f] : this.b.c(this.f);
        }

        public int f() {
            return !this.l ? this.d.d[this.f] : this.b.i[this.f];
        }

        public rp8 g() {
            if (!this.l) {
                return null;
            }
            int i = ((gj1) z19.j(this.b.a)).a;
            rp8 rp8Var = this.b.n;
            if (rp8Var == null) {
                rp8Var = this.d.a.a(i);
            }
            if (rp8Var == null || !rp8Var.a) {
                return null;
            }
            return rp8Var;
        }

        public boolean h() {
            this.f++;
            if (!this.l) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.h;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public int i(int i, int i2) {
            yo5 yo5Var;
            rp8 g = g();
            if (g == null) {
                return 0;
            }
            int i3 = g.d;
            if (i3 != 0) {
                yo5Var = this.b.o;
            } else {
                byte[] bArr = (byte[]) z19.j(g.e);
                this.k.S(bArr, bArr.length);
                yo5 yo5Var2 = this.k;
                i3 = bArr.length;
                yo5Var = yo5Var2;
            }
            boolean g2 = this.b.g(this.f);
            boolean z = g2 || i2 != 0;
            this.j.e()[0] = (byte) ((z ? 128 : 0) | i3);
            this.j.U(0);
            this.a.c(this.j, 1, 1);
            this.a.c(yo5Var, i3, 1);
            if (!z) {
                return i3 + 1;
            }
            if (!g2) {
                this.c.Q(8);
                byte[] e = this.c.e();
                e[0] = 0;
                e[1] = 1;
                e[2] = (byte) ((i2 >> 8) & 255);
                e[3] = (byte) (i2 & 255);
                e[4] = (byte) ((i >> 24) & 255);
                e[5] = (byte) ((i >> 16) & 255);
                e[6] = (byte) ((i >> 8) & 255);
                e[7] = (byte) (i & 255);
                this.a.c(this.c, 8, 1);
                return i3 + 9;
            }
            yo5 yo5Var3 = this.b.o;
            int N = yo5Var3.N();
            yo5Var3.V(-2);
            int i4 = (N * 6) + 2;
            if (i2 != 0) {
                this.c.Q(i4);
                byte[] e2 = this.c.e();
                yo5Var3.l(e2, 0, i4);
                int i5 = (((e2[2] & 255) << 8) | (e2[3] & 255)) + i2;
                e2[2] = (byte) ((i5 >> 8) & 255);
                e2[3] = (byte) (i5 & 255);
                yo5Var3 = this.c;
            }
            this.a.c(yo5Var3, i4, 1);
            return i3 + 1 + i4;
        }

        public void j(zp8 zp8Var, gj1 gj1Var) {
            this.d = zp8Var;
            this.e = gj1Var;
            this.a.d(zp8Var.a.f);
            k();
        }

        public void k() {
            this.b.f();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }

        public void l(long j) {
            int i = this.f;
            while (true) {
                sp8 sp8Var = this.b;
                if (i >= sp8Var.f || sp8Var.c(i) > j) {
                    return;
                }
                if (this.b.k[i]) {
                    this.i = i;
                }
                i++;
            }
        }

        public void m() {
            rp8 g = g();
            if (g == null) {
                return;
            }
            yo5 yo5Var = this.b.o;
            int i = g.d;
            if (i != 0) {
                yo5Var.V(i);
            }
            if (this.b.g(this.f)) {
                yo5Var.V(yo5Var.N() * 6);
            }
        }

        public void n(DrmInitData drmInitData) {
            rp8 a = this.d.a.a(((gj1) z19.j(this.b.a)).a);
            this.a.d(this.d.a.f.c().O(drmInitData.c(a != null ? a.b : null)).G());
        }
    }

    public oq2() {
        this(0);
    }

    private static void A(yo5 yo5Var, sp8 sp8Var) {
        z(yo5Var, 0, sp8Var);
    }

    private static Pair B(yo5 yo5Var, long j) {
        long M;
        long M2;
        yo5Var.U(8);
        int c = yu.c(yo5Var.q());
        yo5Var.V(4);
        long J2 = yo5Var.J();
        if (c == 0) {
            M = yo5Var.J();
            M2 = yo5Var.J();
        } else {
            M = yo5Var.M();
            M2 = yo5Var.M();
        }
        long j2 = M;
        long j3 = j + M2;
        long Q0 = z19.Q0(j2, 1000000L, J2);
        yo5Var.V(2);
        int N = yo5Var.N();
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        long[] jArr2 = new long[N];
        long[] jArr3 = new long[N];
        long j4 = Q0;
        int i = 0;
        long j5 = j2;
        while (i < N) {
            int q = yo5Var.q();
            if ((q & RecyclerView.UNDEFINED_DURATION) != 0) {
                throw ParserException.a("Unhandled indirect reference", null);
            }
            long J3 = yo5Var.J();
            iArr[i] = q & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            long j6 = j5 + J3;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i2 = N;
            long Q02 = z19.Q0(j6, 1000000L, J2);
            jArr4[i] = Q02 - jArr5[i];
            yo5Var.V(4);
            j3 += r1[i];
            i++;
            iArr = iArr;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            N = i2;
            j5 = j6;
            j4 = Q02;
        }
        return Pair.create(Long.valueOf(Q0), new rk0(iArr, jArr, jArr2, jArr3));
    }

    private static long C(yo5 yo5Var) {
        yo5Var.U(8);
        return yu.c(yo5Var.q()) == 1 ? yo5Var.M() : yo5Var.J();
    }

    private static b D(yo5 yo5Var, SparseArray sparseArray, boolean z) {
        yo5Var.U(8);
        int b2 = yu.b(yo5Var.q());
        b bVar = (b) (z ? sparseArray.valueAt(0) : sparseArray.get(yo5Var.q()));
        if (bVar == null) {
            return null;
        }
        if ((b2 & 1) != 0) {
            long M = yo5Var.M();
            sp8 sp8Var = bVar.b;
            sp8Var.c = M;
            sp8Var.d = M;
        }
        gj1 gj1Var = bVar.e;
        bVar.b.a = new gj1((b2 & 2) != 0 ? yo5Var.q() - 1 : gj1Var.a, (b2 & 8) != 0 ? yo5Var.q() : gj1Var.b, (b2 & 16) != 0 ? yo5Var.q() : gj1Var.c, (b2 & 32) != 0 ? yo5Var.q() : gj1Var.d);
        return bVar;
    }

    private static void E(yu.a aVar, SparseArray sparseArray, boolean z, int i, byte[] bArr) {
        b D = D(((yu.b) ur.e(aVar.g(1952868452))).b, sparseArray, z);
        if (D == null) {
            return;
        }
        sp8 sp8Var = D.b;
        long j = sp8Var.q;
        boolean z2 = sp8Var.r;
        D.k();
        D.l = true;
        yu.b g = aVar.g(1952867444);
        if (g == null || (i & 2) != 0) {
            sp8Var.q = j;
            sp8Var.r = z2;
        } else {
            sp8Var.q = C(g.b);
            sp8Var.r = true;
        }
        H(aVar, D, i);
        rp8 a2 = D.d.a.a(((gj1) ur.e(sp8Var.a)).a);
        yu.b g2 = aVar.g(1935763834);
        if (g2 != null) {
            x((rp8) ur.e(a2), g2.b, sp8Var);
        }
        yu.b g3 = aVar.g(1935763823);
        if (g3 != null) {
            w(g3.b, sp8Var);
        }
        yu.b g4 = aVar.g(1936027235);
        if (g4 != null) {
            A(g4.b, sp8Var);
        }
        y(aVar, a2 != null ? a2.b : null, sp8Var);
        int size = aVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            yu.b bVar = (yu.b) aVar.c.get(i2);
            if (bVar.a == 1970628964) {
                I(bVar.b, sp8Var, bArr);
            }
        }
    }

    private static Pair F(yo5 yo5Var) {
        yo5Var.U(12);
        return Pair.create(Integer.valueOf(yo5Var.q()), new gj1(yo5Var.q() - 1, yo5Var.q(), yo5Var.q(), yo5Var.q()));
    }

    private static int G(b bVar, int i, int i2, yo5 yo5Var, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6;
        b bVar2 = bVar;
        yo5Var.U(8);
        int b2 = yu.b(yo5Var.q());
        qp8 qp8Var = bVar2.d.a;
        sp8 sp8Var = bVar2.b;
        gj1 gj1Var = (gj1) z19.j(sp8Var.a);
        sp8Var.h[i] = yo5Var.L();
        long[] jArr = sp8Var.g;
        long j = sp8Var.c;
        jArr[i] = j;
        if ((b2 & 1) != 0) {
            jArr[i] = j + yo5Var.q();
        }
        boolean z6 = (b2 & 4) != 0;
        int i7 = gj1Var.d;
        if (z6) {
            i7 = yo5Var.q();
        }
        boolean z7 = (b2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0;
        boolean z8 = (b2 & 512) != 0;
        boolean z9 = (b2 & 1024) != 0;
        boolean z10 = (b2 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0;
        long j2 = l(qp8Var) ? ((long[]) z19.j(qp8Var.i))[0] : 0L;
        int[] iArr = sp8Var.i;
        long[] jArr2 = sp8Var.j;
        boolean[] zArr = sp8Var.k;
        int i8 = i7;
        boolean z11 = qp8Var.b == 2 && (i2 & 1) != 0;
        int i9 = i3 + sp8Var.h[i];
        boolean z12 = z11;
        long j3 = qp8Var.c;
        long j4 = sp8Var.q;
        int i10 = i3;
        while (i10 < i9) {
            int f = f(z7 ? yo5Var.q() : gj1Var.b);
            if (z8) {
                i4 = yo5Var.q();
                z = z7;
            } else {
                z = z7;
                i4 = gj1Var.c;
            }
            int f2 = f(i4);
            if (z9) {
                z2 = z6;
                i5 = yo5Var.q();
            } else if (i10 == 0 && z6) {
                z2 = z6;
                i5 = i8;
            } else {
                z2 = z6;
                i5 = gj1Var.d;
            }
            if (z10) {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                i6 = yo5Var.q();
            } else {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                i6 = 0;
            }
            long Q0 = z19.Q0((i6 + j4) - j2, 1000000L, j3);
            jArr2[i10] = Q0;
            if (!sp8Var.r) {
                jArr2[i10] = Q0 + bVar2.d.h;
            }
            iArr[i10] = f2;
            zArr[i10] = ((i5 >> 16) & 1) == 0 && (!z12 || i10 == 0);
            j4 += f;
            i10++;
            bVar2 = bVar;
            z7 = z;
            z6 = z2;
            z10 = z3;
            z8 = z4;
            z9 = z5;
        }
        sp8Var.q = j4;
        return i9;
    }

    private static void H(yu.a aVar, b bVar, int i) {
        List list = aVar.c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            yu.b bVar2 = (yu.b) list.get(i4);
            if (bVar2.a == 1953658222) {
                yo5 yo5Var = bVar2.b;
                yo5Var.U(12);
                int L = yo5Var.L();
                if (L > 0) {
                    i3 += L;
                    i2++;
                }
            }
        }
        bVar.h = 0;
        bVar.g = 0;
        bVar.f = 0;
        bVar.b.e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            yu.b bVar3 = (yu.b) list.get(i7);
            if (bVar3.a == 1953658222) {
                i6 = G(bVar, i5, i, bVar3.b, i6);
                i5++;
            }
        }
    }

    private static void I(yo5 yo5Var, sp8 sp8Var, byte[] bArr) {
        yo5Var.U(8);
        yo5Var.l(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            z(yo5Var, 16, sp8Var);
        }
    }

    private void J(long j) {
        while (!this.m.isEmpty() && ((yu.a) this.m.peek()).b == j) {
            o((yu.a) this.m.pop());
        }
        g();
    }

    private boolean K(z72 z72Var) {
        if (this.s == 0) {
            if (!z72Var.h(this.l.e(), 0, 8, true)) {
                return false;
            }
            this.s = 8;
            this.l.U(0);
            this.r = this.l.J();
            this.q = this.l.q();
        }
        long j = this.r;
        if (j == 1) {
            z72Var.readFully(this.l.e(), 8, 8);
            this.s += 8;
            this.r = this.l.M();
        } else if (j == 0) {
            long length = z72Var.getLength();
            if (length == -1 && !this.m.isEmpty()) {
                length = ((yu.a) this.m.peek()).b;
            }
            if (length != -1) {
                this.r = (length - z72Var.getPosition()) + this.s;
            }
        }
        if (this.r < this.s) {
            throw ParserException.e("Atom size less than header length (unsupported).");
        }
        long position = z72Var.getPosition() - this.s;
        int i = this.q;
        if ((i == 1836019558 || i == 1835295092) && !this.H) {
            this.E.p(new ei7.b(this.x, position));
            this.H = true;
        }
        if (this.q == 1836019558) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                sp8 sp8Var = ((b) this.d.valueAt(i2)).b;
                sp8Var.b = position;
                sp8Var.d = position;
                sp8Var.c = position;
            }
        }
        int i3 = this.q;
        if (i3 == 1835295092) {
            this.z = null;
            this.u = position + this.r;
            this.p = 2;
            return true;
        }
        if (O(i3)) {
            long position2 = (z72Var.getPosition() + this.r) - 8;
            this.m.push(new yu.a(this.q, position2));
            if (this.r == this.s) {
                J(position2);
            } else {
                g();
            }
        } else if (P(this.q)) {
            if (this.s != 8) {
                throw ParserException.e("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.r > 2147483647L) {
                throw ParserException.e("Leaf atom with length > 2147483647 (unsupported).");
            }
            yo5 yo5Var = new yo5((int) this.r);
            System.arraycopy(this.l.e(), 0, yo5Var.e(), 0, 8);
            this.t = yo5Var;
            this.p = 1;
        } else {
            if (this.r > 2147483647L) {
                throw ParserException.e("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.t = null;
            this.p = 1;
        }
        return true;
    }

    private void L(z72 z72Var) {
        int i = ((int) this.r) - this.s;
        yo5 yo5Var = this.t;
        if (yo5Var != null) {
            z72Var.readFully(yo5Var.e(), 8, i);
            q(new yu.b(this.q, yo5Var), z72Var.getPosition());
        } else {
            z72Var.p(i);
        }
        J(z72Var.getPosition());
    }

    private void M(z72 z72Var) {
        int size = this.d.size();
        long j = Long.MAX_VALUE;
        b bVar = null;
        for (int i = 0; i < size; i++) {
            sp8 sp8Var = ((b) this.d.valueAt(i)).b;
            if (sp8Var.p) {
                long j2 = sp8Var.d;
                if (j2 < j) {
                    bVar = (b) this.d.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVar == null) {
            this.p = 3;
            return;
        }
        int position = (int) (j - z72Var.getPosition());
        if (position < 0) {
            throw ParserException.a("Offset to encryption data was negative.", null);
        }
        z72Var.p(position);
        bVar.b.a(z72Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean N(z72 z72Var) {
        int e;
        b bVar = this.z;
        Throwable th = null;
        if (bVar == null) {
            bVar = j(this.d);
            if (bVar == null) {
                int position = (int) (this.u - z72Var.getPosition());
                if (position < 0) {
                    throw ParserException.a("Offset to end of mdat was negative.", null);
                }
                z72Var.p(position);
                g();
                return false;
            }
            int d = (int) (bVar.d() - z72Var.getPosition());
            if (d < 0) {
                a84.j("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d = 0;
            }
            z72Var.p(d);
            this.z = bVar;
        }
        int i = 4;
        int i2 = 1;
        if (this.p == 3) {
            int f = bVar.f();
            this.A = f;
            if (bVar.f < bVar.i) {
                z72Var.p(f);
                bVar.m();
                if (!bVar.h()) {
                    this.z = null;
                }
                this.p = 3;
                return true;
            }
            if (bVar.d.a.g == 1) {
                this.A = f - 8;
                z72Var.p(8);
            }
            if ("audio/ac4".equals(bVar.d.a.f.l)) {
                this.B = bVar.i(this.A, 7);
                m2.a(this.A, this.i);
                bVar.a.a(this.i, 7);
                this.B += 7;
            } else {
                this.B = bVar.i(this.A, 0);
            }
            this.A += this.B;
            this.p = 4;
            this.C = 0;
        }
        qp8 qp8Var = bVar.d.a;
        yp8 yp8Var = bVar.a;
        long e2 = bVar.e();
        qm8 qm8Var = this.j;
        if (qm8Var != null) {
            e2 = qm8Var.a(e2);
        }
        long j = e2;
        if (qp8Var.j == 0) {
            while (true) {
                int i3 = this.B;
                int i4 = this.A;
                if (i3 >= i4) {
                    break;
                }
                this.B += yp8Var.e(z72Var, i4 - i3, false);
            }
        } else {
            byte[] e3 = this.f.e();
            e3[0] = 0;
            e3[1] = 0;
            e3[2] = 0;
            int i5 = qp8Var.j;
            int i6 = i5 + 1;
            int i7 = 4 - i5;
            while (this.B < this.A) {
                int i8 = this.C;
                if (i8 == 0) {
                    z72Var.readFully(e3, i7, i6);
                    this.f.U(0);
                    int q = this.f.q();
                    if (q < i2) {
                        throw ParserException.a("Invalid NAL length", th);
                    }
                    this.C = q - 1;
                    this.e.U(0);
                    yp8Var.a(this.e, i);
                    yp8Var.a(this.f, i2);
                    this.D = (this.G.length <= 0 || !j15.g(qp8Var.f.l, e3[i])) ? 0 : i2;
                    this.B += 5;
                    this.A += i7;
                } else {
                    if (this.D) {
                        this.g.Q(i8);
                        z72Var.readFully(this.g.e(), 0, this.C);
                        yp8Var.a(this.g, this.C);
                        e = this.C;
                        int q2 = j15.q(this.g.e(), this.g.g());
                        this.g.U("video/hevc".equals(qp8Var.f.l) ? 1 : 0);
                        this.g.T(q2);
                        ri0.a(j, this.g, this.G);
                    } else {
                        e = yp8Var.e(z72Var, i8, false);
                    }
                    this.B += e;
                    this.C -= e;
                    th = null;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int c = bVar.c();
        rp8 g = bVar.g();
        yp8Var.b(j, c, this.A, 0, g != null ? g.c : null);
        t(j);
        if (!bVar.h()) {
            this.z = null;
        }
        this.p = 3;
        return true;
    }

    private static boolean O(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    private static boolean P(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    private static int f(int i) {
        if (i >= 0) {
            return i;
        }
        throw ParserException.a("Unexpected negative value: " + i, null);
    }

    private void g() {
        this.p = 0;
        this.s = 0;
    }

    private gj1 h(SparseArray sparseArray, int i) {
        return sparseArray.size() == 1 ? (gj1) sparseArray.valueAt(0) : (gj1) ur.e((gj1) sparseArray.get(i));
    }

    private static DrmInitData i(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            yu.b bVar = (yu.b) list.get(i);
            if (bVar.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] e = bVar.b.e();
                UUID f = w76.f(e);
                if (f == null) {
                    a84.j("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(f, "video/mp4", e));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private static b j(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            b bVar2 = (b) sparseArray.valueAt(i);
            if ((bVar2.l || bVar2.f != bVar2.d.b) && (!bVar2.l || bVar2.h != bVar2.b.e)) {
                long d = bVar2.d();
                if (d < j) {
                    bVar = bVar2;
                    j = d;
                }
            }
        }
        return bVar;
    }

    private void k() {
        int i;
        yp8[] yp8VarArr = new yp8[2];
        this.F = yp8VarArr;
        yp8 yp8Var = this.o;
        int i2 = 0;
        if (yp8Var != null) {
            yp8VarArr[0] = yp8Var;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.a & 4) != 0) {
            yp8VarArr[i] = this.E.a(100, 5);
            i3 = 101;
            i++;
        }
        yp8[] yp8VarArr2 = (yp8[]) z19.I0(this.F, i);
        this.F = yp8VarArr2;
        for (yp8 yp8Var2 : yp8VarArr2) {
            yp8Var2.d(K);
        }
        this.G = new yp8[this.c.size()];
        while (i2 < this.G.length) {
            yp8 a2 = this.E.a(i3, 3);
            a2.d((t0) this.c.get(i2));
            this.G[i2] = a2;
            i2++;
            i3++;
        }
    }

    private static boolean l(qp8 qp8Var) {
        long[] jArr;
        long[] jArr2 = qp8Var.h;
        if (jArr2 == null || jArr2.length != 1 || (jArr = qp8Var.i) == null) {
            return false;
        }
        long j = jArr2[0];
        return j == 0 || z19.Q0(j + jArr[0], 1000000L, qp8Var.d) >= qp8Var.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y72[] m() {
        return new y72[]{new oq2()};
    }

    private void o(yu.a aVar) {
        int i = aVar.a;
        if (i == 1836019574) {
            s(aVar);
        } else if (i == 1836019558) {
            r(aVar);
        } else {
            if (this.m.isEmpty()) {
                return;
            }
            ((yu.a) this.m.peek()).d(aVar);
        }
    }

    private void p(yo5 yo5Var) {
        long Q0;
        String str;
        long Q02;
        String str2;
        long J2;
        long j;
        if (this.F.length == 0) {
            return;
        }
        yo5Var.U(8);
        int c = yu.c(yo5Var.q());
        if (c == 0) {
            String str3 = (String) ur.e(yo5Var.B());
            String str4 = (String) ur.e(yo5Var.B());
            long J3 = yo5Var.J();
            Q0 = z19.Q0(yo5Var.J(), 1000000L, J3);
            long j2 = this.y;
            long j3 = j2 != -9223372036854775807L ? j2 + Q0 : -9223372036854775807L;
            str = str3;
            Q02 = z19.Q0(yo5Var.J(), 1000L, J3);
            str2 = str4;
            J2 = yo5Var.J();
            j = j3;
        } else {
            if (c != 1) {
                a84.j("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + c);
                return;
            }
            long J4 = yo5Var.J();
            j = z19.Q0(yo5Var.M(), 1000000L, J4);
            long Q03 = z19.Q0(yo5Var.J(), 1000L, J4);
            long J5 = yo5Var.J();
            str = (String) ur.e(yo5Var.B());
            Q02 = Q03;
            J2 = J5;
            str2 = (String) ur.e(yo5Var.B());
            Q0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[yo5Var.a()];
        yo5Var.l(bArr, 0, yo5Var.a());
        yo5 yo5Var2 = new yo5(this.k.a(new EventMessage(str, str2, Q02, J2, bArr)));
        int a2 = yo5Var2.a();
        for (yp8 yp8Var : this.F) {
            yo5Var2.U(0);
            yp8Var.a(yo5Var2, a2);
        }
        if (j == -9223372036854775807L) {
            this.n.addLast(new a(Q0, true, a2));
            this.v += a2;
            return;
        }
        if (!this.n.isEmpty()) {
            this.n.addLast(new a(j, false, a2));
            this.v += a2;
            return;
        }
        qm8 qm8Var = this.j;
        if (qm8Var != null && !qm8Var.f()) {
            this.n.addLast(new a(j, false, a2));
            this.v += a2;
            return;
        }
        qm8 qm8Var2 = this.j;
        if (qm8Var2 != null) {
            j = qm8Var2.a(j);
        }
        for (yp8 yp8Var2 : this.F) {
            yp8Var2.b(j, 1, a2, 0, null);
        }
    }

    private void q(yu.b bVar, long j) {
        if (!this.m.isEmpty()) {
            ((yu.a) this.m.peek()).e(bVar);
            return;
        }
        int i = bVar.a;
        if (i != 1936286840) {
            if (i == 1701671783) {
                p(bVar.b);
            }
        } else {
            Pair B = B(bVar.b, j);
            this.y = ((Long) B.first).longValue();
            this.E.p((ei7) B.second);
            this.H = true;
        }
    }

    private void r(yu.a aVar) {
        v(aVar, this.d, this.b != null, this.a, this.h);
        DrmInitData i = i(aVar.c);
        if (i != null) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((b) this.d.valueAt(i2)).n(i);
            }
        }
        if (this.w != -9223372036854775807L) {
            int size2 = this.d.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((b) this.d.valueAt(i3)).l(this.w);
            }
            this.w = -9223372036854775807L;
        }
    }

    private void s(yu.a aVar) {
        int i = 0;
        ur.h(this.b == null, "Unexpected moov box.");
        DrmInitData i2 = i(aVar.c);
        yu.a aVar2 = (yu.a) ur.e(aVar.f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.c.size();
        long j = -9223372036854775807L;
        for (int i3 = 0; i3 < size; i3++) {
            yu.b bVar = (yu.b) aVar2.c.get(i3);
            int i4 = bVar.a;
            if (i4 == 1953654136) {
                Pair F = F(bVar.b);
                sparseArray.put(((Integer) F.first).intValue(), (gj1) F.second);
            } else if (i4 == 1835362404) {
                j = u(bVar.b);
            }
        }
        List B = zu.B(aVar, new bw2(), j, i2, (this.a & 16) != 0, false, new ht2() { // from class: nq2
            @Override // defpackage.ht2
            public final Object apply(Object obj) {
                return oq2.this.n((qp8) obj);
            }
        });
        int size2 = B.size();
        if (this.d.size() != 0) {
            ur.g(this.d.size() == size2);
            while (i < size2) {
                zp8 zp8Var = (zp8) B.get(i);
                qp8 qp8Var = zp8Var.a;
                ((b) this.d.get(qp8Var.a)).j(zp8Var, h(sparseArray, qp8Var.a));
                i++;
            }
            return;
        }
        while (i < size2) {
            zp8 zp8Var2 = (zp8) B.get(i);
            qp8 qp8Var2 = zp8Var2.a;
            this.d.put(qp8Var2.a, new b(this.E.a(i, qp8Var2.b), zp8Var2, h(sparseArray, qp8Var2.a)));
            this.x = Math.max(this.x, qp8Var2.e);
            i++;
        }
        this.E.s();
    }

    private void t(long j) {
        while (!this.n.isEmpty()) {
            a aVar = (a) this.n.removeFirst();
            this.v -= aVar.c;
            long j2 = aVar.a;
            if (aVar.b) {
                j2 += j;
            }
            qm8 qm8Var = this.j;
            if (qm8Var != null) {
                j2 = qm8Var.a(j2);
            }
            for (yp8 yp8Var : this.F) {
                yp8Var.b(j2, 1, aVar.c, this.v, null);
            }
        }
    }

    private static long u(yo5 yo5Var) {
        yo5Var.U(8);
        return yu.c(yo5Var.q()) == 0 ? yo5Var.J() : yo5Var.M();
    }

    private static void v(yu.a aVar, SparseArray sparseArray, boolean z, int i, byte[] bArr) {
        int size = aVar.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            yu.a aVar2 = (yu.a) aVar.d.get(i2);
            if (aVar2.a == 1953653094) {
                E(aVar2, sparseArray, z, i, bArr);
            }
        }
    }

    private static void w(yo5 yo5Var, sp8 sp8Var) {
        yo5Var.U(8);
        int q = yo5Var.q();
        if ((yu.b(q) & 1) == 1) {
            yo5Var.V(8);
        }
        int L = yo5Var.L();
        if (L == 1) {
            sp8Var.d += yu.c(q) == 0 ? yo5Var.J() : yo5Var.M();
        } else {
            throw ParserException.a("Unexpected saio entry count: " + L, null);
        }
    }

    private static void x(rp8 rp8Var, yo5 yo5Var, sp8 sp8Var) {
        int i;
        int i2 = rp8Var.d;
        yo5Var.U(8);
        if ((yu.b(yo5Var.q()) & 1) == 1) {
            yo5Var.V(8);
        }
        int H = yo5Var.H();
        int L = yo5Var.L();
        if (L > sp8Var.f) {
            throw ParserException.a("Saiz sample count " + L + " is greater than fragment sample count" + sp8Var.f, null);
        }
        if (H == 0) {
            boolean[] zArr = sp8Var.m;
            i = 0;
            for (int i3 = 0; i3 < L; i3++) {
                int H2 = yo5Var.H();
                i += H2;
                zArr[i3] = H2 > i2;
            }
        } else {
            i = H * L;
            Arrays.fill(sp8Var.m, 0, L, H > i2);
        }
        Arrays.fill(sp8Var.m, L, sp8Var.f, false);
        if (i > 0) {
            sp8Var.d(i);
        }
    }

    private static void y(yu.a aVar, String str, sp8 sp8Var) {
        byte[] bArr = null;
        yo5 yo5Var = null;
        yo5 yo5Var2 = null;
        for (int i = 0; i < aVar.c.size(); i++) {
            yu.b bVar = (yu.b) aVar.c.get(i);
            yo5 yo5Var3 = bVar.b;
            int i2 = bVar.a;
            if (i2 == 1935828848) {
                yo5Var3.U(12);
                if (yo5Var3.q() == 1936025959) {
                    yo5Var = yo5Var3;
                }
            } else if (i2 == 1936158820) {
                yo5Var3.U(12);
                if (yo5Var3.q() == 1936025959) {
                    yo5Var2 = yo5Var3;
                }
            }
        }
        if (yo5Var == null || yo5Var2 == null) {
            return;
        }
        yo5Var.U(8);
        int c = yu.c(yo5Var.q());
        yo5Var.V(4);
        if (c == 1) {
            yo5Var.V(4);
        }
        if (yo5Var.q() != 1) {
            throw ParserException.e("Entry count in sbgp != 1 (unsupported).");
        }
        yo5Var2.U(8);
        int c2 = yu.c(yo5Var2.q());
        yo5Var2.V(4);
        if (c2 == 1) {
            if (yo5Var2.J() == 0) {
                throw ParserException.e("Variable length description in sgpd found (unsupported)");
            }
        } else if (c2 >= 2) {
            yo5Var2.V(4);
        }
        if (yo5Var2.J() != 1) {
            throw ParserException.e("Entry count in sgpd != 1 (unsupported).");
        }
        yo5Var2.V(1);
        int H = yo5Var2.H();
        int i3 = (H & 240) >> 4;
        int i4 = H & 15;
        boolean z = yo5Var2.H() == 1;
        if (z) {
            int H2 = yo5Var2.H();
            byte[] bArr2 = new byte[16];
            yo5Var2.l(bArr2, 0, 16);
            if (H2 == 0) {
                int H3 = yo5Var2.H();
                bArr = new byte[H3];
                yo5Var2.l(bArr, 0, H3);
            }
            sp8Var.l = true;
            sp8Var.n = new rp8(z, str, H2, bArr2, i3, i4, bArr);
        }
    }

    private static void z(yo5 yo5Var, int i, sp8 sp8Var) {
        yo5Var.U(i + 8);
        int b2 = yu.b(yo5Var.q());
        if ((b2 & 1) != 0) {
            throw ParserException.e("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (b2 & 2) != 0;
        int L = yo5Var.L();
        if (L == 0) {
            Arrays.fill(sp8Var.m, 0, sp8Var.f, false);
            return;
        }
        if (L == sp8Var.f) {
            Arrays.fill(sp8Var.m, 0, L, z);
            sp8Var.d(yo5Var.a());
            sp8Var.b(yo5Var);
        } else {
            throw ParserException.a("Senc sample count " + L + " is different from fragment sample count" + sp8Var.f, null);
        }
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ((b) this.d.valueAt(i)).k();
        }
        this.n.clear();
        this.v = 0;
        this.w = j2;
        this.m.clear();
        g();
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.E = a82Var;
        g();
        k();
        qp8 qp8Var = this.b;
        if (qp8Var != null) {
            this.d.put(0, new b(a82Var.a(0, qp8Var.b), new zp8(this.b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new gj1(0, 0, 0, 0)));
            this.E.s();
        }
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        while (true) {
            int i = this.p;
            if (i != 0) {
                if (i == 1) {
                    L(z72Var);
                } else if (i == 2) {
                    M(z72Var);
                } else if (N(z72Var)) {
                    return 0;
                }
            } else if (!K(z72Var)) {
                return -1;
            }
        }
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        return yw7.b(z72Var);
    }

    protected qp8 n(qp8 qp8Var) {
        return qp8Var;
    }

    @Override // defpackage.y72
    public void release() {
    }

    public oq2(int i) {
        this(i, null);
    }

    public oq2(int i, qm8 qm8Var) {
        this(i, qm8Var, null, Collections.emptyList());
    }

    public oq2(int i, qm8 qm8Var, qp8 qp8Var) {
        this(i, qm8Var, qp8Var, Collections.emptyList());
    }

    public oq2(int i, qm8 qm8Var, qp8 qp8Var, List list) {
        this(i, qm8Var, qp8Var, list, null);
    }

    public oq2(int i, qm8 qm8Var, qp8 qp8Var, List list, yp8 yp8Var) {
        this.a = i;
        this.j = qm8Var;
        this.b = qp8Var;
        this.c = Collections.unmodifiableList(list);
        this.o = yp8Var;
        this.k = new j42();
        this.l = new yo5(16);
        this.e = new yo5(j15.a);
        this.f = new yo5(5);
        this.g = new yo5();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new yo5(bArr);
        this.m = new ArrayDeque();
        this.n = new ArrayDeque();
        this.d = new SparseArray();
        this.x = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.E = a82.q;
        this.F = new yp8[0];
        this.G = new yp8[0];
    }
}
