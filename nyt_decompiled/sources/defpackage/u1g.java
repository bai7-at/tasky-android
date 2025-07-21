package defpackage;

import android.os.Looper;

/* loaded from: classes3.dex */
public final class u1g extends nyf implements k1g {
    private final hye h;
    private final kwf i;
    private final int j;
    private boolean k = true;
    private long l = -9223372036854775807L;
    private boolean m;
    private boolean n;
    private f6f o;
    private cza p;
    private final r1g q;
    private final j8g r;

    /* synthetic */ u1g(cza czaVar, hye hyeVar, r1g r1gVar, kwf kwfVar, j8g j8gVar, int i, t1g t1gVar) {
        this.p = czaVar;
        this.h = hyeVar;
        this.q = r1gVar;
        this.i = kwfVar;
        this.r = j8gVar;
        this.j = i;
    }

    private final void A() {
        long j = this.l;
        boolean z = this.m;
        boolean z2 = this.n;
        cza d = d();
        t2g t2gVar = new t2g(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, d, z2 ? d.d : null);
        w(this.k ? new q1g(this, t2gVar) : t2gVar);
    }

    @Override // defpackage.k1g
    public final void b(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.l;
        }
        if (!this.k && this.l == j && this.m == z && this.n == z2) {
            return;
        }
        this.l = j;
        this.m = z;
        this.n = z2;
        this.k = false;
        A();
    }

    @Override // defpackage.b0g
    public final synchronized cza d() {
        return this.p;
    }

    @Override // defpackage.nyf, defpackage.b0g
    public final synchronized void h(cza czaVar) {
        this.p = czaVar;
    }

    @Override // defpackage.b0g
    public final void j(xzf xzfVar) {
        ((p1g) xzfVar).w();
    }

    @Override // defpackage.b0g
    public final xzf l(zzf zzfVar, s7g s7gVar, long j) {
        kye zza = this.h.zza();
        f6f f6fVar = this.o;
        if (f6fVar != null) {
            zza.h(f6fVar);
        }
        rra rraVar = d().b;
        rraVar.getClass();
        r1g r1gVar = this.q;
        o();
        return new p1g(rraVar.a, zza, new oyf(r1gVar.a), this.i, p(zzfVar), this.r, r(zzfVar), this, s7gVar, null, this.j, khe.F(-9223372036854775807L));
    }

    @Override // defpackage.nyf
    protected final void v(f6f f6fVar) {
        this.o = f6fVar;
        Looper.myLooper().getClass();
        o();
        A();
    }

    @Override // defpackage.nyf
    protected final void x() {
    }

    @Override // defpackage.b0g
    public final void z() {
    }
}
