package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.t0;
import defpackage.ei7;
import defpackage.yu;
import defpackage.zu;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class rw4 implements y72, ei7 {
    public static final d82 y = new d82() { // from class: qw4
        @Override // defpackage.d82
        public final y72[] c() {
            y72[] s;
            s = rw4.s();
            return s;
        }
    };
    private final int a;
    private final yo5 b;
    private final yo5 c;
    private final yo5 d;
    private final yo5 e;
    private final ArrayDeque f;
    private final ii7 g;
    private final List h;
    private int i;
    private int j;
    private long k;
    private int l;
    private yo5 m;
    private int n;
    private int o;
    private int p;
    private int q;
    private a82 r;
    private a[] s;
    private long[][] t;
    private int u;
    private long v;
    private int w;
    private MotionPhotoMetadata x;

    private static final class a {
        public final qp8 a;
        public final zp8 b;
        public final yp8 c;
        public final dt8 d;
        public int e;

        public a(qp8 qp8Var, zp8 zp8Var, yp8 yp8Var) {
            this.a = qp8Var;
            this.b = zp8Var;
            this.c = yp8Var;
            this.d = "audio/true-hd".equals(qp8Var.f.l) ? new dt8() : null;
        }
    }

    public rw4() {
        this(0);
    }

    private boolean A(z72 z72Var) {
        yu.a aVar;
        if (this.l == 0) {
            if (!z72Var.h(this.e.e(), 0, 8, true)) {
                w();
                return false;
            }
            this.l = 8;
            this.e.U(0);
            this.k = this.e.J();
            this.j = this.e.q();
        }
        long j = this.k;
        if (j == 1) {
            z72Var.readFully(this.e.e(), 8, 8);
            this.l += 8;
            this.k = this.e.M();
        } else if (j == 0) {
            long length = z72Var.getLength();
            if (length == -1 && (aVar = (yu.a) this.f.peek()) != null) {
                length = aVar.b;
            }
            if (length != -1) {
                this.k = (length - z72Var.getPosition()) + this.l;
            }
        }
        if (this.k < this.l) {
            throw ParserException.e("Atom size less than header length (unsupported).");
        }
        if (E(this.j)) {
            long position = z72Var.getPosition();
            long j2 = this.k;
            int i = this.l;
            long j3 = (position + j2) - i;
            if (j2 != i && this.j == 1835365473) {
                u(z72Var);
            }
            this.f.push(new yu.a(this.j, j3));
            if (this.k == this.l) {
                v(j3);
            } else {
                n();
            }
        } else if (F(this.j)) {
            ur.g(this.l == 8);
            ur.g(this.k <= 2147483647L);
            yo5 yo5Var = new yo5((int) this.k);
            System.arraycopy(this.e.e(), 0, yo5Var.e(), 0, 8);
            this.m = yo5Var;
            this.i = 1;
        } else {
            z(z72Var.getPosition() - this.l);
            this.m = null;
            this.i = 1;
        }
        return true;
    }

    private boolean B(z72 z72Var, e06 e06Var) {
        boolean z;
        long j = this.k - this.l;
        long position = z72Var.getPosition() + j;
        yo5 yo5Var = this.m;
        if (yo5Var != null) {
            z72Var.readFully(yo5Var.e(), this.l, (int) j);
            if (this.j == 1718909296) {
                this.w = x(yo5Var);
            } else if (!this.f.isEmpty()) {
                ((yu.a) this.f.peek()).e(new yu.b(this.j, yo5Var));
            }
        } else {
            if (j >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                e06Var.a = z72Var.getPosition() + j;
                z = true;
                v(position);
                return (z || this.i == 2) ? false : true;
            }
            z72Var.p((int) j);
        }
        z = false;
        v(position);
        if (z) {
        }
    }

    private int C(z72 z72Var, e06 e06Var) {
        int i;
        e06 e06Var2;
        long position = z72Var.getPosition();
        if (this.n == -1) {
            int q = q(position);
            this.n = q;
            if (q == -1) {
                return -1;
            }
        }
        a aVar = this.s[this.n];
        yp8 yp8Var = aVar.c;
        int i2 = aVar.e;
        zp8 zp8Var = aVar.b;
        long j = zp8Var.c[i2];
        int i3 = zp8Var.d[i2];
        dt8 dt8Var = aVar.d;
        long j2 = (j - position) + this.o;
        if (j2 < 0) {
            i = 1;
            e06Var2 = e06Var;
        } else {
            if (j2 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                if (aVar.a.g == 1) {
                    j2 += 8;
                    i3 -= 8;
                }
                z72Var.p((int) j2);
                qp8 qp8Var = aVar.a;
                if (qp8Var.j == 0) {
                    if ("audio/ac4".equals(qp8Var.f.l)) {
                        if (this.p == 0) {
                            m2.a(i3, this.d);
                            yp8Var.a(this.d, 7);
                            this.p += 7;
                        }
                        i3 += 7;
                    } else if (dt8Var != null) {
                        dt8Var.d(z72Var);
                    }
                    while (true) {
                        int i4 = this.p;
                        if (i4 >= i3) {
                            break;
                        }
                        int e = yp8Var.e(z72Var, i3 - i4, false);
                        this.o += e;
                        this.p += e;
                        this.q -= e;
                    }
                } else {
                    byte[] e2 = this.c.e();
                    e2[0] = 0;
                    e2[1] = 0;
                    e2[2] = 0;
                    int i5 = aVar.a.j;
                    int i6 = 4 - i5;
                    while (this.p < i3) {
                        int i7 = this.q;
                        if (i7 == 0) {
                            z72Var.readFully(e2, i6, i5);
                            this.o += i5;
                            this.c.U(0);
                            int q2 = this.c.q();
                            if (q2 < 0) {
                                throw ParserException.a("Invalid NAL length", null);
                            }
                            this.q = q2;
                            this.b.U(0);
                            yp8Var.a(this.b, 4);
                            this.p += 4;
                            i3 += i6;
                        } else {
                            int e3 = yp8Var.e(z72Var, i7, false);
                            this.o += e3;
                            this.p += e3;
                            this.q -= e3;
                        }
                    }
                }
                int i8 = i3;
                zp8 zp8Var2 = aVar.b;
                long j3 = zp8Var2.f[i2];
                int i9 = zp8Var2.g[i2];
                if (dt8Var != null) {
                    dt8Var.c(yp8Var, j3, i9, i8, 0, null);
                    if (i2 + 1 == aVar.b.b) {
                        dt8Var.a(yp8Var, null);
                    }
                } else {
                    yp8Var.b(j3, i9, i8, 0, null);
                }
                aVar.e++;
                this.n = -1;
                this.o = 0;
                this.p = 0;
                this.q = 0;
                return 0;
            }
            e06Var2 = e06Var;
            i = 1;
        }
        e06Var2.a = j;
        return i;
    }

    private int D(z72 z72Var, e06 e06Var) {
        int c = this.g.c(z72Var, e06Var, this.h);
        if (c == 1 && e06Var.a == 0) {
            n();
        }
        return c;
    }

    private static boolean E(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    private static boolean F(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    private void G(a aVar, long j) {
        zp8 zp8Var = aVar.b;
        int a2 = zp8Var.a(j);
        if (a2 == -1) {
            a2 = zp8Var.b(j);
        }
        aVar.e = a2;
    }

    private static int l(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] m(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].b.b];
            jArr2[i] = aVarArr[i].b.f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            zp8 zp8Var = aVarArr[i3].b;
            j += zp8Var.d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = zp8Var.f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    private void n() {
        this.i = 0;
        this.l = 0;
    }

    private static int p(zp8 zp8Var, long j) {
        int a2 = zp8Var.a(j);
        return a2 == -1 ? zp8Var.b(j) : a2;
    }

    private int q(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.s;
            if (i3 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i3];
            int i4 = aVar.e;
            zp8 zp8Var = aVar.b;
            if (i4 != zp8Var.b) {
                long j5 = zp8Var.c[i4];
                long j6 = ((long[][]) z19.j(this.t))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    j4 = j7;
                    z2 = z3;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ qp8 r(qp8 qp8Var) {
        return qp8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y72[] s() {
        return new y72[]{new rw4()};
    }

    private static long t(zp8 zp8Var, long j, long j2) {
        int p = p(zp8Var, j);
        return p == -1 ? j2 : Math.min(zp8Var.c[p], j2);
    }

    private void u(z72 z72Var) {
        this.d.Q(8);
        z72Var.r(this.d.e(), 0, 8);
        zu.f(this.d);
        z72Var.p(this.d.f());
        z72Var.g();
    }

    private void v(long j) {
        while (!this.f.isEmpty() && ((yu.a) this.f.peek()).b == j) {
            yu.a aVar = (yu.a) this.f.pop();
            if (aVar.a == 1836019574) {
                y(aVar);
                this.f.clear();
                this.i = 2;
            } else if (!this.f.isEmpty()) {
                ((yu.a) this.f.peek()).d(aVar);
            }
        }
        if (this.i != 2) {
            n();
        }
    }

    private void w() {
        if (this.w != 2 || (this.a & 2) == 0) {
            return;
        }
        this.r.a(0, 4).d(new t0.b().Z(this.x == null ? null : new Metadata(this.x)).G());
        this.r.s();
        this.r.p(new ei7.b(-9223372036854775807L));
    }

    private static int x(yo5 yo5Var) {
        yo5Var.U(8);
        int l = l(yo5Var.q());
        if (l != 0) {
            return l;
        }
        yo5Var.V(4);
        while (yo5Var.a() > 0) {
            int l2 = l(yo5Var.q());
            if (l2 != 0) {
                return l2;
            }
        }
        return 0;
    }

    private void y(yu.a aVar) {
        Metadata metadata;
        Metadata metadata2;
        Metadata metadata3;
        List list;
        int i;
        bw2 bw2Var;
        Metadata metadata4;
        Metadata metadata5;
        ArrayList arrayList = new ArrayList();
        boolean z = this.w == 1;
        bw2 bw2Var2 = new bw2();
        yu.b g = aVar.g(1969517665);
        if (g != null) {
            zu.i C = zu.C(g);
            Metadata metadata6 = C.a;
            Metadata metadata7 = C.b;
            Metadata metadata8 = C.c;
            if (metadata6 != null) {
                bw2Var2.c(metadata6);
            }
            metadata2 = metadata8;
            metadata3 = metadata6;
            metadata = metadata7;
        } else {
            metadata = null;
            metadata2 = null;
            metadata3 = null;
        }
        yu.a f = aVar.f(1835365473);
        Metadata o = f != null ? zu.o(f) : null;
        Metadata metadata9 = zu.q(((yu.b) ur.e(aVar.g(1836476516))).b).a;
        Metadata metadata10 = o;
        Metadata metadata11 = metadata;
        List B = zu.B(aVar, bw2Var2, -9223372036854775807L, null, (this.a & 1) != 0, z, new ht2() { // from class: pw4
            @Override // defpackage.ht2
            public final Object apply(Object obj) {
                qp8 r;
                r = rw4.r((qp8) obj);
                return r;
            }
        });
        int size = B.size();
        long j = -9223372036854775807L;
        bw2 bw2Var3 = bw2Var2;
        int i2 = 0;
        int i3 = -1;
        long j2 = -9223372036854775807L;
        while (i2 < size) {
            zp8 zp8Var = (zp8) B.get(i2);
            if (zp8Var.b == 0) {
                list = B;
                i = size;
                bw2Var = bw2Var3;
                metadata5 = metadata11;
            } else {
                qp8 qp8Var = zp8Var.a;
                list = B;
                i = size;
                long j3 = qp8Var.e;
                if (j3 == j) {
                    j3 = zp8Var.h;
                }
                long max = Math.max(j2, j3);
                a aVar2 = new a(qp8Var, zp8Var, this.r.a(i2, qp8Var.b));
                int i4 = "audio/true-hd".equals(qp8Var.f.l) ? zp8Var.e * 16 : zp8Var.e + 30;
                t0.b c = qp8Var.f.c();
                c.Y(i4);
                if (qp8Var.b == 2 && j3 > 0) {
                    int i5 = zp8Var.b;
                    if (i5 > 1) {
                        c.R(i5 / (j3 / 1000000.0f));
                    }
                }
                bw2Var = bw2Var3;
                zs4.k(qp8Var.b, bw2Var, c);
                int i6 = qp8Var.b;
                if (this.h.isEmpty()) {
                    metadata5 = metadata11;
                    metadata4 = null;
                } else {
                    metadata4 = new Metadata(this.h);
                    metadata5 = metadata11;
                }
                zs4.l(i6, metadata3, metadata10, c, metadata5, metadata4, metadata2, metadata9);
                aVar2.c.d(c.G());
                if (qp8Var.b == 2 && i3 == -1) {
                    i3 = arrayList.size();
                }
                arrayList.add(aVar2);
                j2 = max;
            }
            i2++;
            bw2Var3 = bw2Var;
            metadata11 = metadata5;
            B = list;
            size = i;
            j = -9223372036854775807L;
        }
        this.u = i3;
        this.v = j2;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.s = aVarArr;
        this.t = m(aVarArr);
        this.r.s();
        this.r.p(this);
    }

    private void z(long j) {
        if (this.j == 1836086884) {
            int i = this.l;
            this.x = new MotionPhotoMetadata(0L, j, -9223372036854775807L, j + i, this.k - i);
        }
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        this.f.clear();
        this.l = 0;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        if (j == 0) {
            if (this.i != 3) {
                n();
                return;
            } else {
                this.g.g();
                this.h.clear();
                return;
            }
        }
        for (a aVar : this.s) {
            G(aVar, j2);
            dt8 dt8Var = aVar.d;
            if (dt8Var != null) {
                dt8Var.b();
            }
        }
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.r = a82Var;
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        while (true) {
            int i = this.i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return C(z72Var, e06Var);
                    }
                    if (i == 3) {
                        return D(z72Var, e06Var);
                    }
                    throw new IllegalStateException();
                }
                if (B(z72Var, e06Var)) {
                    return 1;
                }
            } else if (!A(z72Var)) {
                return -1;
            }
        }
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        return yw7.d(z72Var, (this.a & 2) != 0);
    }

    @Override // defpackage.ei7
    public ei7.a f(long j) {
        return o(j, -1);
    }

    @Override // defpackage.ei7
    public boolean h() {
        return true;
    }

    @Override // defpackage.ei7
    public long i() {
        return this.v;
    }

    public ei7.a o(long j, int i) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        long j6 = j;
        a[] aVarArr = this.s;
        if (aVarArr.length == 0) {
            return new ei7.a(gi7.c);
        }
        int i2 = i != -1 ? i : this.u;
        if (i2 != -1) {
            zp8 zp8Var = aVarArr[i2].b;
            int p = p(zp8Var, j6);
            if (p == -1) {
                return new ei7.a(gi7.c);
            }
            long j7 = zp8Var.f[p];
            j2 = zp8Var.c[p];
            if (j7 >= j6 || p >= zp8Var.b - 1 || (b = zp8Var.b(j6)) == -1 || b == p) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = zp8Var.f[b];
                j5 = zp8Var.c[b];
            }
            long j8 = j5;
            j6 = j7;
            j3 = j8;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        if (i == -1) {
            int i3 = 0;
            while (true) {
                a[] aVarArr2 = this.s;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                if (i3 != this.u) {
                    zp8 zp8Var2 = aVarArr2[i3].b;
                    long t = t(zp8Var2, j6, j2);
                    if (j4 != -9223372036854775807L) {
                        j3 = t(zp8Var2, j4, j3);
                    }
                    j2 = t;
                }
                i3++;
            }
        }
        gi7 gi7Var = new gi7(j6, j2);
        return j4 == -9223372036854775807L ? new ei7.a(gi7Var) : new ei7.a(gi7Var, new gi7(j4, j3));
    }

    @Override // defpackage.y72
    public void release() {
    }

    public rw4(int i) {
        this.a = i;
        this.i = (i & 4) != 0 ? 3 : 0;
        this.g = new ii7();
        this.h = new ArrayList();
        this.e = new yo5(16);
        this.f = new ArrayDeque();
        this.b = new yo5(j15.a);
        this.c = new yo5(4);
        this.d = new yo5();
        this.n = -1;
        this.r = a82.q;
        this.s = new a[0];
    }
}
