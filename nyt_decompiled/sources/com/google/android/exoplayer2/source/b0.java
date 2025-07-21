package com.google.android.exoplayer2.source;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.t0;
import defpackage.ep2;
import defpackage.ku4;
import defpackage.kv0;
import defpackage.ob;
import defpackage.s91;
import defpackage.ur;
import defpackage.yo5;
import defpackage.yp8;
import defpackage.z19;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes2.dex */
public class b0 implements yp8 {
    private t0 A;
    private t0 B;
    private long C;
    private boolean D;
    private boolean E;
    private long F;
    private boolean G;
    private final z a;
    private final com.google.android.exoplayer2.drm.i d;
    private final h.a e;
    private d f;
    private t0 g;
    private DrmSession h;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean w;
    private boolean z;
    private final b b = new b();
    private int i = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private long[] j = new long[NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT];
    private long[] k = new long[NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT];
    private long[] n = new long[NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT];
    private int[] m = new int[NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT];
    private int[] l = new int[NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT];
    private yp8.a[] o = new yp8.a[NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT];
    private final f0 c = new f0(new kv0() { // from class: com.google.android.exoplayer2.source.a0
        @Override // defpackage.kv0
        public final void accept(Object obj) {
            b0.L((b0.c) obj);
        }
    });
    private long t = Long.MIN_VALUE;
    private long u = Long.MIN_VALUE;
    private long v = Long.MIN_VALUE;
    private boolean y = true;
    private boolean x = true;

    static final class b {
        public int a;
        public long b;
        public yp8.a c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {
        public final t0 a;
        public final i.b b;

        private c(t0 t0Var, i.b bVar) {
            this.a = t0Var;
            this.b = bVar;
        }
    }

    public interface d {
        void g(t0 t0Var);
    }

    protected b0(ob obVar, com.google.android.exoplayer2.drm.i iVar, h.a aVar) {
        this.d = iVar;
        this.e = aVar;
        this.a = new z(obVar);
    }

    private long B(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int D = D(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[D]);
            if ((this.m[D] & 1) != 0) {
                break;
            }
            D--;
            if (D == -1) {
                D = this.i - 1;
            }
        }
        return j;
    }

    private int D(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private boolean H() {
        return this.s != this.p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(c cVar) {
        cVar.b.release();
    }

    private boolean M(int i) {
        DrmSession drmSession = this.h;
        return drmSession == null || drmSession.getState() == 4 || ((this.m[i] & 1073741824) == 0 && this.h.d());
    }

    private void O(t0 t0Var, ep2 ep2Var) {
        t0 t0Var2 = this.g;
        boolean z = t0Var2 == null;
        DrmInitData drmInitData = z ? null : t0Var2.r;
        this.g = t0Var;
        DrmInitData drmInitData2 = t0Var.r;
        com.google.android.exoplayer2.drm.i iVar = this.d;
        ep2Var.b = iVar != null ? t0Var.d(iVar.a(t0Var)) : t0Var;
        ep2Var.a = this.h;
        if (this.d == null) {
            return;
        }
        if (z || !z19.c(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.h;
            DrmSession c2 = this.d.c(this.e, t0Var);
            this.h = c2;
            ep2Var.a = c2;
            if (drmSession != null) {
                drmSession.b(this.e);
            }
        }
    }

    private synchronized int P(ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2, b bVar) {
        try {
            decoderInputBuffer.d = false;
            if (!H()) {
                if (!z2 && !this.w) {
                    t0 t0Var = this.B;
                    if (t0Var == null || (!z && t0Var == this.g)) {
                        return -3;
                    }
                    O((t0) ur.e(t0Var), ep2Var);
                    return -5;
                }
                decoderInputBuffer.q(4);
                return -4;
            }
            t0 t0Var2 = ((c) this.c.e(C())).a;
            if (!z && t0Var2 == this.g) {
                int D = D(this.s);
                if (!M(D)) {
                    decoderInputBuffer.d = true;
                    return -3;
                }
                decoderInputBuffer.q(this.m[D]);
                if (this.s == this.p - 1 && (z2 || this.w)) {
                    decoderInputBuffer.e(536870912);
                }
                long j = this.n[D];
                decoderInputBuffer.e = j;
                if (j < this.t) {
                    decoderInputBuffer.e(RecyclerView.UNDEFINED_DURATION);
                }
                bVar.a = this.l[D];
                bVar.b = this.k[D];
                bVar.c = this.o[D];
                return -4;
            }
            O(t0Var2, ep2Var);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void U() {
        DrmSession drmSession = this.h;
        if (drmSession != null) {
            drmSession.b(this.e);
            this.h = null;
            this.g = null;
        }
    }

    private synchronized void X() {
        this.s = 0;
        this.a.o();
    }

    private synchronized boolean c0(t0 t0Var) {
        try {
            this.y = false;
            if (z19.c(t0Var, this.B)) {
                return false;
            }
            if (this.c.g() || !((c) this.c.f()).a.equals(t0Var)) {
                this.B = t0Var;
            } else {
                this.B = ((c) this.c.f()).a;
            }
            t0 t0Var2 = this.B;
            this.D = ku4.a(t0Var2.l, t0Var2.i);
            this.E = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized boolean h(long j) {
        if (this.p == 0) {
            return j > this.u;
        }
        if (A() >= j) {
            return false;
        }
        t(this.q + j(j));
        return true;
    }

    private synchronized void i(long j, int i, long j2, int i2, yp8.a aVar) {
        try {
            int i3 = this.p;
            if (i3 > 0) {
                int D = D(i3 - 1);
                ur.a(this.k[D] + ((long) this.l[D]) <= j2);
            }
            this.w = (536870912 & i) != 0;
            this.v = Math.max(this.v, j);
            int D2 = D(this.p);
            this.n[D2] = j;
            this.k[D2] = j2;
            this.l[D2] = i2;
            this.m[D2] = i;
            this.o[D2] = aVar;
            this.j[D2] = this.C;
            if (this.c.g() || !((c) this.c.f()).a.equals(this.B)) {
                com.google.android.exoplayer2.drm.i iVar = this.d;
                this.c.a(G(), new c((t0) ur.e(this.B), iVar != null ? iVar.d(this.e, this.B) : i.b.a));
            }
            int i4 = this.p + 1;
            this.p = i4;
            int i5 = this.i;
            if (i4 == i5) {
                int i6 = i5 + NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                yp8.a[] aVarArr = new yp8.a[i6];
                int i7 = this.r;
                int i8 = i5 - i7;
                System.arraycopy(this.k, i7, jArr2, 0, i8);
                System.arraycopy(this.n, this.r, jArr3, 0, i8);
                System.arraycopy(this.m, this.r, iArr, 0, i8);
                System.arraycopy(this.l, this.r, iArr2, 0, i8);
                System.arraycopy(this.o, this.r, aVarArr, 0, i8);
                System.arraycopy(this.j, this.r, jArr, 0, i8);
                int i9 = this.r;
                System.arraycopy(this.k, 0, jArr2, i8, i9);
                System.arraycopy(this.n, 0, jArr3, i8, i9);
                System.arraycopy(this.m, 0, iArr, i8, i9);
                System.arraycopy(this.l, 0, iArr2, i8, i9);
                System.arraycopy(this.o, 0, aVarArr, i8, i9);
                System.arraycopy(this.j, 0, jArr, i8, i9);
                this.k = jArr2;
                this.n = jArr3;
                this.m = iArr;
                this.l = iArr2;
                this.o = aVarArr;
                this.j = jArr;
                this.r = 0;
                this.i = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private int j(long j) {
        int i = this.p;
        int D = D(i - 1);
        while (i > this.s && this.n[D] >= j) {
            i--;
            D--;
            if (D == -1) {
                D = this.i - 1;
            }
        }
        return i;
    }

    public static b0 k(ob obVar, com.google.android.exoplayer2.drm.i iVar, h.a aVar) {
        return new b0(obVar, (com.google.android.exoplayer2.drm.i) ur.e(iVar), (h.a) ur.e(aVar));
    }

    public static b0 l(ob obVar) {
        return new b0(obVar, null, null);
    }

    private synchronized long m(long j, boolean z, boolean z2) {
        int i;
        try {
            int i2 = this.p;
            if (i2 != 0) {
                long[] jArr = this.n;
                int i3 = this.r;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.s) != i2) {
                        i2 = i + 1;
                    }
                    int v = v(i3, i2, j, z);
                    if (v == -1) {
                        return -1L;
                    }
                    return p(v);
                }
            }
            return -1L;
        } finally {
        }
    }

    private synchronized long n() {
        int i = this.p;
        if (i == 0) {
            return -1L;
        }
        return p(i);
    }

    private long p(int i) {
        this.u = Math.max(this.u, B(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        if (i5 < 0) {
            this.s = 0;
        }
        this.c.d(i2);
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i6 = this.r;
        if (i6 == 0) {
            i6 = this.i;
        }
        return this.k[i6 - 1] + this.l[r5];
    }

    private long t(int i) {
        int G = G() - i;
        boolean z = false;
        ur.a(G >= 0 && G <= this.p - this.s);
        int i2 = this.p - G;
        this.p = i2;
        this.v = Math.max(this.u, B(i2));
        if (G == 0 && this.w) {
            z = true;
        }
        this.w = z;
        this.c.c(i);
        int i3 = this.p;
        if (i3 == 0) {
            return 0L;
        }
        return this.k[D(i3 - 1)] + this.l[r9];
    }

    private int v(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public final synchronized long A() {
        return Math.max(this.u, B(this.s));
    }

    public final int C() {
        return this.q + this.s;
    }

    public final synchronized int E(long j, boolean z) {
        int D = D(this.s);
        if (H() && j >= this.n[D]) {
            if (j > this.v && z) {
                return this.p - this.s;
            }
            int v = v(D, this.p - this.s, j, true);
            if (v == -1) {
                return 0;
            }
            return v;
        }
        return 0;
    }

    public final synchronized t0 F() {
        return this.y ? null : this.B;
    }

    public final int G() {
        return this.q + this.p;
    }

    protected final void I() {
        this.z = true;
    }

    public final synchronized boolean J() {
        return this.w;
    }

    public synchronized boolean K(boolean z) {
        t0 t0Var;
        boolean z2 = true;
        if (H()) {
            if (((c) this.c.e(C())).a != this.g) {
                return true;
            }
            return M(D(this.s));
        }
        if (!z && !this.w && ((t0Var = this.B) == null || t0Var == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public void N() {
        DrmSession drmSession = this.h;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) ur.e(this.h.getError()));
        }
    }

    public final synchronized long Q() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return H() ? this.j[D(this.s)] : this.C;
    }

    public void R() {
        r();
        U();
    }

    public int S(ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i, boolean z) {
        int P = P(ep2Var, decoderInputBuffer, (i & 2) != 0, z, this.b);
        if (P == -4 && !decoderInputBuffer.l()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z2) {
                    this.a.f(decoderInputBuffer, this.b);
                } else {
                    this.a.m(decoderInputBuffer, this.b);
                }
            }
            if (!z2) {
                this.s++;
            }
        }
        return P;
    }

    public void T() {
        W(true);
        U();
    }

    public final void V() {
        W(false);
    }

    public void W(boolean z) {
        this.a.n();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        this.c.b();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
        }
    }

    public final synchronized boolean Y(int i) {
        X();
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean Z(long j, boolean z) {
        X();
        int D = D(this.s);
        if (H() && j >= this.n[D] && (j <= this.v || z)) {
            int v = v(D, this.p - this.s, j, true);
            if (v == -1) {
                return false;
            }
            this.t = j;
            this.s += v;
            return true;
        }
        return false;
    }

    public final void a0(long j) {
        if (this.F != j) {
            this.F = j;
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // defpackage.yp8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(long r11, int r13, int r14, int r15, yp8.a r16) {
        /*
            r10 = this;
            r0 = r10
            boolean r1 = r0.z
            if (r1 == 0) goto L10
            com.google.android.exoplayer2.t0 r1 = r0.A
            java.lang.Object r1 = defpackage.ur.i(r1)
            com.google.android.exoplayer2.t0 r1 = (com.google.android.exoplayer2.t0) r1
            r10.d(r1)
        L10:
            r1 = r13 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            r4 = r3
            goto L19
        L18:
            r4 = r2
        L19:
            boolean r5 = r0.x
            if (r5 == 0) goto L22
            if (r4 != 0) goto L20
            return
        L20:
            r0.x = r2
        L22:
            long r5 = r0.F
            long r5 = r5 + r11
            boolean r7 = r0.D
            if (r7 == 0) goto L54
            long r7 = r0.t
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L30
            return
        L30:
            if (r1 != 0) goto L54
            boolean r1 = r0.E
            if (r1 != 0) goto L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "Overriding unexpected non-sync sample for format: "
            r1.append(r7)
            com.google.android.exoplayer2.t0 r7 = r0.B
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "SampleQueue"
            defpackage.a84.j(r7, r1)
            r0.E = r3
        L50:
            r1 = r13 | 1
            r3 = r1
            goto L55
        L54:
            r3 = r13
        L55:
            boolean r1 = r0.G
            if (r1 == 0) goto L66
            if (r4 == 0) goto L65
            boolean r1 = r10.h(r5)
            if (r1 != 0) goto L62
            goto L65
        L62:
            r0.G = r2
            goto L66
        L65:
            return
        L66:
            com.google.android.exoplayer2.source.z r1 = r0.a
            long r1 = r1.e()
            r7 = r14
            long r8 = (long) r7
            long r1 = r1 - r8
            r4 = r15
            long r8 = (long) r4
            long r8 = r1 - r8
            r0 = r10
            r1 = r5
            r4 = r8
            r6 = r14
            r7 = r16
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.b0.b(long, int, int, int, yp8$a):void");
    }

    public final void b0(long j) {
        this.t = j;
    }

    @Override // defpackage.yp8
    public final void c(yo5 yo5Var, int i, int i2) {
        this.a.q(yo5Var, i);
    }

    @Override // defpackage.yp8
    public final void d(t0 t0Var) {
        t0 w = w(t0Var);
        this.z = false;
        this.A = t0Var;
        boolean c0 = c0(w);
        d dVar = this.f;
        if (dVar == null || !c0) {
            return;
        }
        dVar.g(w);
    }

    public final void d0(d dVar) {
        this.f = dVar;
    }

    public final synchronized void e0(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                    ur.a(z);
                    this.s += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        ur.a(z);
        this.s += i;
    }

    @Override // defpackage.yp8
    public final int f(s91 s91Var, int i, boolean z, int i2) {
        return this.a.p(s91Var, i, z);
    }

    public final void f0(long j) {
        this.C = j;
    }

    public final void g0() {
        this.G = true;
    }

    public synchronized long o() {
        int i = this.s;
        if (i == 0) {
            return -1L;
        }
        return p(i);
    }

    public final void q(long j, boolean z, boolean z2) {
        this.a.b(m(j, z, z2));
    }

    public final void r() {
        this.a.b(n());
    }

    public final void s() {
        this.a.b(o());
    }

    public final void u(int i) {
        this.a.c(t(i));
    }

    protected t0 w(t0 t0Var) {
        return (this.F == 0 || t0Var.s == Long.MAX_VALUE) ? t0Var : t0Var.c().k0(t0Var.s + this.F).G();
    }

    public final int x() {
        return this.q;
    }

    public final synchronized long y() {
        return this.p == 0 ? Long.MIN_VALUE : this.n[this.r];
    }

    public final synchronized long z() {
        return this.v;
    }
}
