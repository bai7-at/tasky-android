package defpackage;

import com.google.android.gms.internal.ads.ho;

/* loaded from: classes3.dex */
public final class ozf implements xzf, wzf {
    public final zzf a;
    private final long b;
    private b0g c;
    private xzf d;
    private wzf e;
    private long f = -9223372036854775807L;
    private final s7g g;

    public ozf(zzf zzfVar, s7g s7gVar, long j) {
        this.a = zzfVar;
        this.g = s7gVar;
        this.b = j;
    }

    private final long p(long j) {
        long j2 = this.f;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final boolean a(ho hoVar) {
        xzf xzfVar = this.d;
        return xzfVar != null && xzfVar.a(hoVar);
    }

    @Override // defpackage.q2g
    public final /* bridge */ /* synthetic */ void b(r2g r2gVar) {
        wzf wzfVar = this.e;
        int i = khe.a;
        wzfVar.b(this);
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final void c(long j) {
        xzf xzfVar = this.d;
        int i = khe.a;
        xzfVar.c(j);
    }

    @Override // defpackage.wzf
    public final void d(xzf xzfVar) {
        wzf wzfVar = this.e;
        int i = khe.a;
        wzfVar.d(this);
    }

    @Override // defpackage.xzf
    public final long e(o6g[] o6gVarArr, boolean[] zArr, p2g[] p2gVarArr, boolean[] zArr2, long j) {
        long j2 = this.f;
        long j3 = (j2 == -9223372036854775807L || j != this.b) ? j : j2;
        this.f = -9223372036854775807L;
        xzf xzfVar = this.d;
        int i = khe.a;
        return xzfVar.e(o6gVarArr, zArr, p2gVarArr, zArr2, j3);
    }

    @Override // defpackage.xzf
    public final long f(long j) {
        xzf xzfVar = this.d;
        int i = khe.a;
        return xzfVar.f(j);
    }

    public final long g() {
        return this.f;
    }

    public final long h() {
        return this.b;
    }

    @Override // defpackage.xzf
    public final void i(long j, boolean z) {
        xzf xzfVar = this.d;
        int i = khe.a;
        xzfVar.i(j, false);
    }

    @Override // defpackage.xzf
    public final long j(long j, ggf ggfVar) {
        xzf xzfVar = this.d;
        int i = khe.a;
        return xzfVar.j(j, ggfVar);
    }

    public final void k(zzf zzfVar) {
        long p = p(this.b);
        b0g b0gVar = this.c;
        b0gVar.getClass();
        xzf l = b0gVar.l(zzfVar, this.g, p);
        this.d = l;
        if (this.e != null) {
            l.l(this, p);
        }
    }

    @Override // defpackage.xzf
    public final void l(wzf wzfVar, long j) {
        this.e = wzfVar;
        xzf xzfVar = this.d;
        if (xzfVar != null) {
            xzfVar.l(this, p(this.b));
        }
    }

    public final void m(long j) {
        this.f = j;
    }

    public final void n() {
        xzf xzfVar = this.d;
        if (xzfVar != null) {
            b0g b0gVar = this.c;
            b0gVar.getClass();
            b0gVar.j(xzfVar);
        }
    }

    public final void o(b0g b0gVar) {
        wad.f(this.c == null);
        this.c = b0gVar;
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final long zzb() {
        xzf xzfVar = this.d;
        int i = khe.a;
        return xzfVar.zzb();
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final long zzc() {
        xzf xzfVar = this.d;
        int i = khe.a;
        return xzfVar.zzc();
    }

    @Override // defpackage.xzf
    public final long zzd() {
        xzf xzfVar = this.d;
        int i = khe.a;
        return xzfVar.zzd();
    }

    @Override // defpackage.xzf
    public final z2g zzh() {
        xzf xzfVar = this.d;
        int i = khe.a;
        return xzfVar.zzh();
    }

    @Override // defpackage.xzf
    public final void zzk() {
        xzf xzfVar = this.d;
        if (xzfVar != null) {
            xzfVar.zzk();
            return;
        }
        b0g b0gVar = this.c;
        if (b0gVar != null) {
            b0gVar.z();
        }
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final boolean zzp() {
        xzf xzfVar = this.d;
        return xzfVar != null && xzfVar.zzp();
    }
}
