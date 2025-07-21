package defpackage;

import com.google.android.gms.internal.ads.zziz;

/* loaded from: classes3.dex */
public abstract class b8f implements wff, zff {
    private final int b;
    private bgf d;
    private int e;
    private hpf f;
    private acd g;
    private int h;
    private p2g i;
    private l6a[] j;
    private long k;
    private long l;
    private boolean n;
    private boolean o;
    private yff q;
    private final Object a = new Object();
    private final kdf c = new kdf();
    private long m = Long.MIN_VALUE;
    private n1c p = n1c.a;

    public b8f(int i) {
        this.b = i;
    }

    private final void H(long j, boolean z) {
        this.n = false;
        this.l = j;
        this.m = j;
        T(j, z);
    }

    protected abstract void A();

    protected abstract void B();

    protected abstract void C();

    protected abstract void D();

    protected abstract void E(l6a[] l6aVarArr, long j, long j2, zzf zzfVar);

    protected final boolean F() {
        if (j()) {
            return this.n;
        }
        p2g p2gVar = this.i;
        p2gVar.getClass();
        return p2gVar.zze();
    }

    protected final l6a[] G() {
        l6a[] l6aVarArr = this.j;
        l6aVarArr.getClass();
        return l6aVarArr;
    }

    protected final int I(kdf kdfVar, n7f n7fVar, int i) {
        p2g p2gVar = this.i;
        p2gVar.getClass();
        int a = p2gVar.a(kdfVar, n7fVar, i);
        if (a == -4) {
            if (n7fVar.f()) {
                this.m = Long.MIN_VALUE;
                return this.n ? -4 : -3;
            }
            long j = n7fVar.f + this.k;
            n7fVar.f = j;
            this.m = Math.max(this.m, j);
        } else if (a == -5) {
            l6a l6aVar = kdfVar.a;
            l6aVar.getClass();
            long j2 = l6aVar.p;
            if (j2 != Long.MAX_VALUE) {
                x3a b = l6aVar.b();
                b.B(j2 + this.k);
                kdfVar.a = b.D();
                return -5;
            }
        }
        return a;
    }

    protected final kdf J() {
        kdf kdfVar = this.c;
        kdfVar.b = null;
        kdfVar.a = null;
        return kdfVar;
    }

    protected final int K(long j) {
        p2g p2gVar = this.i;
        p2gVar.getClass();
        return p2gVar.b(j - this.k);
    }

    protected final long L() {
        return this.l;
    }

    protected final acd M() {
        acd acdVar = this.g;
        acdVar.getClass();
        return acdVar;
    }

    protected final zziz N(Throwable th, l6a l6aVar, boolean z, int i) {
        int i2 = 4;
        if (l6aVar != null && !this.o) {
            this.o = true;
            try {
                i2 = y(l6aVar) & 7;
            } catch (zziz unused) {
            } finally {
                this.o = false;
            }
        }
        return zziz.b(th, f(), this.e, l6aVar, i2, z, i);
    }

    protected final bgf O() {
        bgf bgfVar = this.d;
        bgfVar.getClass();
        return bgfVar;
    }

    protected final hpf P() {
        hpf hpfVar = this.f;
        hpfVar.getClass();
        return hpfVar;
    }

    protected abstract void Q();

    protected abstract void R(boolean z, boolean z2);

    protected void S() {
    }

    protected abstract void T(long j, boolean z);

    @Override // defpackage.wff
    public final void a() {
        p2g p2gVar = this.i;
        p2gVar.getClass();
        p2gVar.zzd();
    }

    @Override // defpackage.wff, defpackage.zff
    public final int b() {
        return this.b;
    }

    @Override // defpackage.wff
    public final void d() {
        this.n = true;
    }

    @Override // defpackage.wff
    public final boolean g() {
        return this.n;
    }

    @Override // defpackage.wff
    public final void h() {
        wad.f(this.h == 0);
        A();
    }

    @Override // defpackage.wff
    public final boolean j() {
        return this.m == Long.MIN_VALUE;
    }

    @Override // defpackage.wff
    public final void m() {
        wad.f(this.h == 0);
        kdf kdfVar = this.c;
        kdfVar.b = null;
        kdfVar.a = null;
        B();
    }

    @Override // defpackage.wff
    public final long n() {
        return this.m;
    }

    @Override // defpackage.zff
    public final void r(yff yffVar) {
        synchronized (this.a) {
            this.q = yffVar;
        }
    }

    @Override // defpackage.wff
    public final void t(long j) {
        H(j, false);
    }

    @Override // defpackage.wff
    public final void u(int i, hpf hpfVar, acd acdVar) {
        this.e = i;
        this.f = hpfVar;
        this.g = acdVar;
        S();
    }

    @Override // defpackage.wff
    public final int v() {
        return this.h;
    }

    @Override // defpackage.wff
    public final void w(bgf bgfVar, l6a[] l6aVarArr, p2g p2gVar, long j, boolean z, boolean z2, long j2, long j3, zzf zzfVar) {
        wad.f(this.h == 0);
        this.d = bgfVar;
        this.h = 1;
        R(z, z2);
        x(l6aVarArr, p2gVar, j2, j3, zzfVar);
        H(j2, z);
    }

    @Override // defpackage.wff
    public final void x(l6a[] l6aVarArr, p2g p2gVar, long j, long j2, zzf zzfVar) {
        wad.f(!this.n);
        this.i = p2gVar;
        if (this.m == Long.MIN_VALUE) {
            this.m = j;
        }
        this.j = l6aVarArr;
        this.k = j2;
        E(l6aVarArr, j, j2, zzfVar);
    }

    @Override // defpackage.wff
    public final void z(n1c n1cVar) {
        if (khe.f(this.p, n1cVar)) {
            return;
        }
        this.p = n1cVar;
    }

    @Override // defpackage.wff
    public final void zzN() {
        wad.f(this.h == 1);
        this.h = 2;
        C();
    }

    @Override // defpackage.wff
    public final void zzO() {
        wad.f(this.h == 2);
        this.h = 1;
        D();
    }

    @Override // defpackage.wff
    public xdf zzk() {
        return null;
    }

    @Override // defpackage.wff
    public final zff zzl() {
        return this;
    }

    @Override // defpackage.wff
    public final p2g zzo() {
        return this.i;
    }

    @Override // defpackage.zff
    public final void zzp() {
        synchronized (this.a) {
            this.q = null;
        }
    }

    @Override // defpackage.wff
    public final void zzq() {
        wad.f(this.h == 1);
        kdf kdfVar = this.c;
        kdfVar.b = null;
        kdfVar.a = null;
        this.h = 0;
        this.i = null;
        this.j = null;
        this.n = false;
        Q();
    }

    @Override // defpackage.wff
    public /* synthetic */ void zzs() {
    }
}
