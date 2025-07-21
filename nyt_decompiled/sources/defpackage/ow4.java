package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.t0;
import defpackage.hi7;
import defpackage.re3;
import defpackage.vw4;
import java.io.EOFException;

/* loaded from: classes2.dex */
public final class ow4 implements y72 {
    public static final d82 u = new d82() { // from class: mw4
        @Override // defpackage.d82
        public final y72[] c() {
            y72[] o;
            o = ow4.o();
            return o;
        }
    };
    private static final re3.a v = new re3.a() { // from class: nw4
        @Override // re3.a
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            boolean p;
            p = ow4.p(i, i2, i3, i4, i5);
            return p;
        }
    };
    private final int a;
    private final long b;
    private final yo5 c;
    private final vw4.a d;
    private final bw2 e;
    private final se3 f;
    private final yp8 g;
    private a82 h;
    private yp8 i;
    private yp8 j;
    private int k;
    private Metadata l;
    private long m;
    private long n;
    private long o;
    private int p;
    private hi7 q;
    private boolean r;
    private boolean s;
    private long t;

    public ow4() {
        this(0);
    }

    private void g() {
        ur.i(this.i);
        z19.j(this.h);
    }

    private hi7 h(z72 z72Var) {
        long l;
        long j;
        hi7 r = r(z72Var);
        pu4 q = q(this.l, z72Var.getPosition());
        if (this.r) {
            return new hi7.a();
        }
        if ((this.a & 4) != 0) {
            if (q != null) {
                l = q.i();
                j = q.g();
            } else if (r != null) {
                l = r.i();
                j = r.g();
            } else {
                l = l(this.l);
                j = -1;
            }
            r = new aj3(l, z72Var.getPosition(), j);
        } else if (q != null) {
            r = q;
        } else if (r == null) {
            r = null;
        }
        if (r == null || !(r.h() || (this.a & 1) == 0)) {
            return k(z72Var, (this.a & 2) != 0);
        }
        return r;
    }

    private long i(long j) {
        return this.m + ((j * 1000000) / this.d.d);
    }

    private hi7 k(z72 z72Var, boolean z) {
        z72Var.r(this.c.e(), 0, 4);
        this.c.U(0);
        this.d.a(this.c.q());
        return new uu0(z72Var.getLength(), z72Var.getPosition(), this.d, z);
    }

    private static long l(Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int e = metadata.e();
        for (int i = 0; i < e; i++) {
            Metadata.Entry d = metadata.d(i);
            if (d instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) d;
                if (textInformationFrame.id.equals("TLEN")) {
                    return z19.D0(Long.parseLong(textInformationFrame.values.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int m(yo5 yo5Var, int i) {
        if (yo5Var.g() >= i + 4) {
            yo5Var.U(i);
            int q = yo5Var.q();
            if (q == 1483304551 || q == 1231971951) {
                return q;
            }
        }
        if (yo5Var.g() < 40) {
            return 0;
        }
        yo5Var.U(36);
        return yo5Var.q() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean n(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y72[] o() {
        return new y72[]{new ow4()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean p(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    private static pu4 q(Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int e = metadata.e();
        for (int i = 0; i < e; i++) {
            Metadata.Entry d = metadata.d(i);
            if (d instanceof MlltFrame) {
                return pu4.a(j, (MlltFrame) d, l(metadata));
            }
        }
        return null;
    }

    private hi7 r(z72 z72Var) {
        yo5 yo5Var = new yo5(this.d.c);
        z72Var.r(yo5Var.e(), 0, this.d.c);
        vw4.a aVar = this.d;
        int i = 21;
        if ((aVar.a & 1) != 0) {
            if (aVar.e != 1) {
                i = 36;
            }
        } else if (aVar.e == 1) {
            i = 13;
        }
        int i2 = i;
        int m = m(yo5Var, i2);
        if (m != 1483304551 && m != 1231971951) {
            if (m != 1447187017) {
                z72Var.g();
                return null;
            }
            y39 a = y39.a(z72Var.getLength(), z72Var.getPosition(), this.d, yo5Var);
            z72Var.p(this.d.c);
            return a;
        }
        am9 a2 = am9.a(z72Var.getLength(), z72Var.getPosition(), this.d, yo5Var);
        if (a2 != null && !this.e.a()) {
            z72Var.g();
            z72Var.n(i2 + 141);
            z72Var.r(this.c.e(), 0, 3);
            this.c.U(0);
            this.e.d(this.c.K());
        }
        z72Var.p(this.d.c);
        return (a2 == null || a2.h() || m != 1231971951) ? a2 : k(z72Var, false);
    }

    private boolean s(z72 z72Var) {
        hi7 hi7Var = this.q;
        if (hi7Var != null) {
            long g = hi7Var.g();
            if (g != -1 && z72Var.l() > g - 4) {
                return true;
            }
        }
        try {
            return !z72Var.e(this.c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int t(z72 z72Var) {
        if (this.k == 0) {
            try {
                v(z72Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.q == null) {
            hi7 h = h(z72Var);
            this.q = h;
            this.h.p(h);
            this.j.d(new t0.b().g0(this.d.b).Y(ProgressEvent.PART_FAILED_EVENT_CODE).J(this.d.e).h0(this.d.d).P(this.e.a).Q(this.e.b).Z((this.a & 8) != 0 ? null : this.l).G());
            this.o = z72Var.getPosition();
        } else if (this.o != 0) {
            long position = z72Var.getPosition();
            long j = this.o;
            if (position < j) {
                z72Var.p((int) (j - position));
            }
        }
        return u(z72Var);
    }

    private int u(z72 z72Var) {
        if (this.p == 0) {
            z72Var.g();
            if (s(z72Var)) {
                return -1;
            }
            this.c.U(0);
            int q = this.c.q();
            if (!n(q, this.k) || vw4.j(q) == -1) {
                z72Var.p(1);
                this.k = 0;
                return 0;
            }
            this.d.a(q);
            if (this.m == -9223372036854775807L) {
                this.m = this.q.b(z72Var.getPosition());
                if (this.b != -9223372036854775807L) {
                    this.m += this.b - this.q.b(0L);
                }
            }
            this.p = this.d.c;
            hi7 hi7Var = this.q;
            if (hi7Var instanceof aj3) {
                aj3 aj3Var = (aj3) hi7Var;
                aj3Var.c(i(this.n + r0.g), z72Var.getPosition() + this.d.c);
                if (this.s && aj3Var.a(this.t)) {
                    this.s = false;
                    this.j = this.i;
                }
            }
        }
        int e = this.j.e(z72Var, this.p, true);
        if (e == -1) {
            return -1;
        }
        int i = this.p - e;
        this.p = i;
        if (i > 0) {
            return 0;
        }
        this.j.b(i(this.n), 1, this.d.c, 0, null);
        this.n += this.d.g;
        this.p = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r13 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009c, code lost:
    
        r12.p(r1 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        r11.k = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a1, code lost:
    
        r12.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean v(defpackage.z72 r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.g()
            long r1 = r12.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L3e
            int r1 = r11.a
            r1 = r1 & 8
            if (r1 != 0) goto L1f
            r1 = r2
            goto L21
        L1f:
            re3$a r1 = defpackage.ow4.v
        L21:
            se3 r4 = r11.f
            com.google.android.exoplayer2.metadata.Metadata r1 = r4.a(r12, r1)
            r11.l = r1
            if (r1 == 0) goto L30
            bw2 r4 = r11.e
            r4.c(r1)
        L30:
            long r4 = r12.l()
            int r1 = (int) r4
            if (r13 != 0) goto L3a
            r12.p(r1)
        L3a:
            r4 = r3
        L3b:
            r5 = r4
            r6 = r5
            goto L41
        L3e:
            r1 = r3
            r4 = r1
            goto L3b
        L41:
            boolean r7 = r11.s(r12)
            r8 = 1
            if (r7 == 0) goto L51
            if (r5 <= 0) goto L4b
            goto L9a
        L4b:
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
        L51:
            yo5 r7 = r11.c
            r7.U(r3)
            yo5 r7 = r11.c
            int r7 = r7.q()
            if (r4 == 0) goto L65
            long r9 = (long) r4
            boolean r9 = n(r7, r9)
            if (r9 == 0) goto L6c
        L65:
            int r9 = defpackage.vw4.j(r7)
            r10 = -1
            if (r9 != r10) goto L8c
        L6c:
            int r4 = r6 + 1
            if (r6 != r0) goto L7a
            if (r13 == 0) goto L73
            return r3
        L73:
            java.lang.String r11 = "Searched too many bytes."
            com.google.android.exoplayer2.ParserException r11 = com.google.android.exoplayer2.ParserException.a(r11, r2)
            throw r11
        L7a:
            if (r13 == 0) goto L85
            r12.g()
            int r5 = r1 + r4
            r12.n(r5)
            goto L88
        L85:
            r12.p(r8)
        L88:
            r5 = r3
            r6 = r4
            r4 = r5
            goto L41
        L8c:
            int r5 = r5 + 1
            if (r5 != r8) goto L97
            vw4$a r4 = r11.d
            r4.a(r7)
            r4 = r7
            goto La7
        L97:
            r7 = 4
            if (r5 != r7) goto La7
        L9a:
            if (r13 == 0) goto La1
            int r1 = r1 + r6
            r12.p(r1)
            goto La4
        La1:
            r12.g()
        La4:
            r11.k = r4
            return r8
        La7:
            int r9 = r9 + (-4)
            r12.n(r9)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow4.v(z72, boolean):boolean");
    }

    @Override // defpackage.y72
    public void a(long j, long j2) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = j2;
        hi7 hi7Var = this.q;
        if (!(hi7Var instanceof aj3) || ((aj3) hi7Var).a(j2)) {
            return;
        }
        this.s = true;
        this.j = this.g;
    }

    @Override // defpackage.y72
    public void c(a82 a82Var) {
        this.h = a82Var;
        yp8 a = a82Var.a(0, 1);
        this.i = a;
        this.j = a;
        this.h.s();
    }

    @Override // defpackage.y72
    public int d(z72 z72Var, e06 e06Var) {
        g();
        int t = t(z72Var);
        if (t == -1 && (this.q instanceof aj3)) {
            long i = i(this.n);
            if (this.q.i() != i) {
                ((aj3) this.q).d(i);
                this.h.p(this.q);
            }
        }
        return t;
    }

    @Override // defpackage.y72
    public boolean e(z72 z72Var) {
        return v(z72Var, true);
    }

    public void j() {
        this.r = true;
    }

    @Override // defpackage.y72
    public void release() {
    }

    public ow4(int i) {
        this(i, -9223372036854775807L);
    }

    public ow4(int i, long j) {
        this.a = (i & 2) != 0 ? i | 1 : i;
        this.b = j;
        this.c = new yo5(10);
        this.d = new vw4.a();
        this.e = new bw2();
        this.m = -9223372036854775807L;
        this.f = new se3();
        rw1 rw1Var = new rw1();
        this.g = rw1Var;
        this.j = rw1Var;
    }
}
