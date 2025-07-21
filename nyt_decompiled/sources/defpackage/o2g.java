package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzrq;
import com.google.android.gms.internal.ads.zzsb;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class o2g implements tx9 {
    private boolean B;
    private lwf C;
    private final i2g a;
    private final kwf d;
    private final ewf e;
    private n2g f;
    private l6a g;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean v;
    private l6a y;
    private l6a z;
    private final k2g b = new k2g();
    private int h = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private long[] i = new long[NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT];
    private long[] j = new long[NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT];
    private long[] m = new long[NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT];
    private int[] l = new int[NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT];
    private int[] k = new int[NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT];
    private lx9[] n = new lx9[NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT];
    private final u2g c = new u2g(new pgd() { // from class: j2g
        @Override // defpackage.pgd
        public final void zza(Object obj) {
            throw null;
        }
    });
    private long s = Long.MIN_VALUE;
    private long t = Long.MIN_VALUE;
    private long u = Long.MIN_VALUE;
    private boolean x = true;
    private boolean w = true;
    private boolean A = true;

    protected o2g(s7g s7gVar, kwf kwfVar, ewf ewfVar) {
        this.d = kwfVar;
        this.e = ewfVar;
        this.a = new i2g(s7gVar);
    }

    static /* synthetic */ void D(m2g m2gVar) {
        jwf jwfVar = m2gVar.b;
        int i = iwf.a;
    }

    private final int h(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.m[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.l[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.h) {
                i = 0;
            }
        }
        return i3;
    }

    private final int i(int i) {
        int i2 = this.q + i;
        int i3 = this.h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int j(kdf kdfVar, n7f n7fVar, boolean z, boolean z2, k2g k2gVar) {
        try {
            n7fVar.e = false;
            if (!r()) {
                if (!z2 && !this.v) {
                    l6a l6aVar = this.z;
                    if (l6aVar == null || (!z && l6aVar == this.g)) {
                        return -3;
                    }
                    o(l6aVar, kdfVar);
                    return -5;
                }
                n7fVar.c(4);
                n7fVar.f = Long.MIN_VALUE;
                return -4;
            }
            l6a l6aVar2 = ((m2g) this.c.a(this.p + this.r)).a;
            if (!z && l6aVar2 == this.g) {
                int i = i(this.r);
                if (!s(i)) {
                    n7fVar.e = true;
                    return -3;
                }
                n7fVar.c(this.l[i]);
                if (this.r == this.o - 1 && (z2 || this.v)) {
                    n7fVar.a(536870912);
                }
                long j = this.m[i];
                n7fVar.f = j;
                if (j < this.s) {
                    n7fVar.a(RecyclerView.UNDEFINED_DURATION);
                }
                k2gVar.a = this.k[i];
                k2gVar.b = this.j[i];
                k2gVar.c = this.n[i];
                return -4;
            }
            o(l6aVar2, kdfVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized long k(long j, boolean z, boolean z2) {
        int i;
        try {
            int i2 = this.o;
            if (i2 != 0) {
                long[] jArr = this.m;
                int i3 = this.q;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.r) != i2) {
                        i2 = i + 1;
                    }
                    int h = h(i3, i2, j, false);
                    if (h != -1) {
                        return m(h);
                    }
                }
            }
            return -1L;
        } finally {
        }
    }

    private final synchronized long l() {
        int i = this.o;
        if (i == 0) {
            return -1L;
        }
        return m(i);
    }

    private final long m(int i) {
        long j = this.t;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int i2 = i(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                j2 = Math.max(j2, this.m[i2]);
                if ((this.l[i2] & 1) != 0) {
                    break;
                }
                i2--;
                if (i2 == -1) {
                    i2 = this.h - 1;
                }
            }
        }
        this.t = Math.max(j, j2);
        this.o -= i;
        int i4 = this.p + i;
        this.p = i4;
        int i5 = this.q + i;
        this.q = i5;
        int i6 = this.h;
        if (i5 >= i6) {
            this.q = i5 - i6;
        }
        int i7 = this.r - i;
        this.r = i7;
        if (i7 < 0) {
            this.r = 0;
        }
        this.c.e(i4);
        if (this.o != 0) {
            return this.j[this.q];
        }
        int i8 = this.q;
        if (i8 == 0) {
            i8 = this.h;
        }
        return this.j[i8 - 1] + this.k[r11];
    }

    private final synchronized void n(long j, int i, long j2, int i2, lx9 lx9Var) {
        try {
            int i3 = this.o;
            if (i3 > 0) {
                int i4 = i(i3 - 1);
                wad.d(this.j[i4] + ((long) this.k[i4]) <= j2);
            }
            this.v = (536870912 & i) != 0;
            this.u = Math.max(this.u, j);
            int i5 = i(this.o);
            this.m[i5] = j;
            this.j[i5] = j2;
            this.k[i5] = i2;
            this.l[i5] = i;
            this.n[i5] = lx9Var;
            this.i[i5] = 0;
            if (this.c.f() || !((m2g) this.c.b()).a.equals(this.z)) {
                l6a l6aVar = this.z;
                if (l6aVar == null) {
                    throw null;
                }
                this.c.c(this.p + this.o, new m2g(l6aVar, jwf.a, null));
            }
            int i6 = this.o + 1;
            this.o = i6;
            int i7 = this.h;
            if (i6 == i7) {
                int i8 = i7 + NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
                long[] jArr = new long[i8];
                long[] jArr2 = new long[i8];
                long[] jArr3 = new long[i8];
                int[] iArr = new int[i8];
                int[] iArr2 = new int[i8];
                lx9[] lx9VarArr = new lx9[i8];
                int i9 = this.q;
                int i10 = i7 - i9;
                System.arraycopy(this.j, i9, jArr2, 0, i10);
                System.arraycopy(this.m, this.q, jArr3, 0, i10);
                System.arraycopy(this.l, this.q, iArr, 0, i10);
                System.arraycopy(this.k, this.q, iArr2, 0, i10);
                System.arraycopy(this.n, this.q, lx9VarArr, 0, i10);
                System.arraycopy(this.i, this.q, jArr, 0, i10);
                int i11 = this.q;
                System.arraycopy(this.j, 0, jArr2, i10, i11);
                System.arraycopy(this.m, 0, jArr3, i10, i11);
                System.arraycopy(this.l, 0, iArr, i10, i11);
                System.arraycopy(this.k, 0, iArr2, i10, i11);
                System.arraycopy(this.n, 0, lx9VarArr, i10, i11);
                System.arraycopy(this.i, 0, jArr, i10, i11);
                this.j = jArr2;
                this.m = jArr3;
                this.l = iArr;
                this.k = iArr2;
                this.n = lx9VarArr;
                this.i = jArr;
                this.q = 0;
                this.h = i8;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void o(l6a l6aVar, kdf kdfVar) {
        l6a l6aVar2 = this.g;
        zzae zzaeVar = l6aVar2 == null ? null : l6aVar2.o;
        this.g = l6aVar;
        zzae zzaeVar2 = l6aVar.o;
        kdfVar.a = l6aVar.c(this.d.a(l6aVar));
        kdfVar.b = this.C;
        if (l6aVar2 == null || !khe.f(zzaeVar, zzaeVar2)) {
            lwf lwfVar = l6aVar.o != null ? new lwf(new zzrq(new zzsb(1), 6001)) : null;
            this.C = lwfVar;
            kdfVar.b = lwfVar;
        }
    }

    private final void p() {
        if (this.C != null) {
            this.C = null;
            this.g = null;
        }
    }

    private final synchronized void q() {
        this.r = 0;
        this.a.g();
    }

    private final boolean r() {
        return this.r != this.o;
    }

    private final boolean s(int i) {
        if (this.C != null) {
            return (this.l[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean t(l6a l6aVar) {
        try {
            this.x = false;
            if (khe.f(l6aVar, this.z)) {
                return false;
            }
            if (this.c.f() || !((m2g) this.c.b()).a.equals(l6aVar)) {
                this.z = l6aVar;
            } else {
                this.z = ((m2g) this.c.b()).a;
            }
            boolean z = this.A;
            l6a l6aVar2 = this.z;
            this.A = z & qcb.f(l6aVar2.l, l6aVar2.i);
            this.B = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized l6a A() {
        if (this.x) {
            return null;
        }
        return this.z;
    }

    public final void B(long j, boolean z, boolean z2) {
        this.a.c(k(j, false, z2));
    }

    public final void C() {
        this.a.c(l());
    }

    public final void E() {
        lwf lwfVar = this.C;
        if (lwfVar != null) {
            throw lwfVar.a();
        }
    }

    public final void F() {
        C();
        p();
    }

    public final void G() {
        H(true);
        p();
    }

    public final void H(boolean z) {
        this.a.f();
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.w = true;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = false;
        this.c.d();
        if (z) {
            this.y = null;
            this.z = null;
            this.x = true;
            this.A = true;
        }
    }

    public final void I(long j) {
        this.s = j;
    }

    public final void J(n2g n2gVar) {
        this.f = n2gVar;
    }

    public final synchronized void K(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.r + i <= this.o) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wad.d(z);
        this.r += i;
    }

    public final synchronized boolean L() {
        return this.v;
    }

    public final synchronized boolean M(boolean z) {
        boolean z2 = true;
        if (r()) {
            if (((m2g) this.c.a(this.p + this.r)).a != this.g) {
                return true;
            }
            return s(i(this.r));
        }
        if (!z && !this.v) {
            l6a l6aVar = this.z;
            if (l6aVar == null) {
                z2 = false;
            } else if (l6aVar == this.g) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean N(int i) {
        q();
        int i2 = this.p;
        if (i >= i2 && i <= this.o + i2) {
            this.s = Long.MIN_VALUE;
            this.r = i - i2;
            return true;
        }
        return false;
    }

    @Override // defpackage.tx9
    public final /* synthetic */ int a(xyf xyfVar, int i, boolean z) {
        return kx9.a(this, xyfVar, i, z);
    }

    @Override // defpackage.tx9
    public final /* synthetic */ void b(b9e b9eVar, int i) {
        kx9.b(this, b9eVar, i);
    }

    @Override // defpackage.tx9
    public final void c(long j, int i, int i2, int i3, lx9 lx9Var) {
        if (this.w) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.w = false;
            }
        }
        if (this.A) {
            if (j < this.s) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.B) {
                    ezd.f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.z)));
                    this.B = true;
                }
                i |= 1;
            }
        }
        n(j, i, (this.a.b() - i2) - i3, i2, lx9Var);
    }

    @Override // defpackage.tx9
    public final void d(b9e b9eVar, int i, int i2) {
        this.a.h(b9eVar, i);
    }

    @Override // defpackage.tx9
    public final int e(xyf xyfVar, int i, boolean z, int i2) {
        return this.a.a(xyfVar, i, z);
    }

    @Override // defpackage.tx9
    public final void f(l6a l6aVar) {
        this.y = l6aVar;
        boolean t = t(l6aVar);
        n2g n2gVar = this.f;
        if (n2gVar == null || !t) {
            return;
        }
        n2gVar.h(l6aVar);
    }

    public final synchronized boolean g(long j, boolean z) {
        int h;
        try {
            q();
            int i = this.r;
            int i2 = i(i);
            if (r() && j >= this.m[i2]) {
                if (j > this.u) {
                    if (z) {
                        z = true;
                    }
                }
                if (this.A) {
                    h = this.o - i;
                    int i3 = 0;
                    while (true) {
                        if (i3 < h) {
                            if (this.m[i2] >= j) {
                                h = i3;
                                break;
                            }
                            i2++;
                            if (i2 == this.h) {
                                i2 = 0;
                            }
                            i3++;
                        } else if (!z) {
                            h = -1;
                        }
                    }
                } else {
                    h = h(i2, this.o - i, j, true);
                }
                if (h != -1) {
                    this.s = j;
                    this.r += h;
                    return true;
                }
            }
            return false;
        } finally {
        }
    }

    public final int u() {
        return this.p;
    }

    public final int v() {
        return this.p + this.r;
    }

    public final synchronized int w(long j, boolean z) {
        int i = this.r;
        int i2 = i(i);
        if (r() && j >= this.m[i2]) {
            if (j > this.u && z) {
                return this.o - i;
            }
            int h = h(i2, this.o - i, j, true);
            if (h == -1) {
                return 0;
            }
            return h;
        }
        return 0;
    }

    public final int x() {
        return this.p + this.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r9 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(defpackage.kdf r9, defpackage.n7f r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            k2g r7 = r8.b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.j(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.f()
            if (r9 != 0) goto L2b
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L35
            if (r9 == 0) goto L2d
            i2g r9 = r8.a
            k2g r8 = r8.b
            r9.d(r10, r8)
        L2b:
            r9 = r12
            goto L3e
        L2d:
            i2g r9 = r8.a
            k2g r11 = r8.b
            r9.e(r10, r11)
            goto L38
        L35:
            if (r9 == 0) goto L38
            goto L2b
        L38:
            int r9 = r8.r
            int r9 = r9 + r1
            r8.r = r9
            return r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o2g.y(kdf, n7f, int, boolean):int");
    }

    public final synchronized long z() {
        return this.u;
    }
}
