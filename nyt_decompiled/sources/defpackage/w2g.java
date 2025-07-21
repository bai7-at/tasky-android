package defpackage;

import com.google.android.gms.internal.ads.go;
import com.google.android.gms.internal.ads.ho;

/* loaded from: classes3.dex */
final class w2g implements xzf, wzf {
    private final xzf a;
    private final long b;
    private wzf c;

    public w2g(xzf xzfVar, long j) {
        this.a = xzfVar;
        this.b = j;
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final boolean a(ho hoVar) {
        long j = hoVar.a;
        long j2 = this.b;
        go a = hoVar.a();
        a.e(j - j2);
        return this.a.a(a.g());
    }

    @Override // defpackage.q2g
    public final /* bridge */ /* synthetic */ void b(r2g r2gVar) {
        wzf wzfVar = this.c;
        wzfVar.getClass();
        wzfVar.b(this);
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final void c(long j) {
        this.a.c(j - this.b);
    }

    @Override // defpackage.wzf
    public final void d(xzf xzfVar) {
        wzf wzfVar = this.c;
        wzfVar.getClass();
        wzfVar.d(this);
    }

    @Override // defpackage.xzf
    public final long e(o6g[] o6gVarArr, boolean[] zArr, p2g[] p2gVarArr, boolean[] zArr2, long j) {
        p2g[] p2gVarArr2 = new p2g[p2gVarArr.length];
        int i = 0;
        while (true) {
            p2g p2gVar = null;
            if (i >= p2gVarArr.length) {
                break;
            }
            v2g v2gVar = (v2g) p2gVarArr[i];
            if (v2gVar != null) {
                p2gVar = v2gVar.c();
            }
            p2gVarArr2[i] = p2gVar;
            i++;
        }
        long e = this.a.e(o6gVarArr, zArr, p2gVarArr2, zArr2, j - this.b);
        for (int i2 = 0; i2 < p2gVarArr.length; i2++) {
            p2g p2gVar2 = p2gVarArr2[i2];
            if (p2gVar2 == null) {
                p2gVarArr[i2] = null;
            } else {
                p2g p2gVar3 = p2gVarArr[i2];
                if (p2gVar3 == null || ((v2g) p2gVar3).c() != p2gVar2) {
                    p2gVarArr[i2] = new v2g(p2gVar2, this.b);
                }
            }
        }
        return e + this.b;
    }

    @Override // defpackage.xzf
    public final long f(long j) {
        long j2 = this.b;
        return this.a.f(j - j2) + j2;
    }

    public final xzf g() {
        return this.a;
    }

    @Override // defpackage.xzf
    public final void i(long j, boolean z) {
        this.a.i(j - this.b, false);
    }

    @Override // defpackage.xzf
    public final long j(long j, ggf ggfVar) {
        long j2 = this.b;
        return this.a.j(j - j2, ggfVar) + j2;
    }

    @Override // defpackage.xzf
    public final void l(wzf wzfVar, long j) {
        this.c = wzfVar;
        this.a.l(this, j - this.b);
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final long zzb() {
        long zzb = this.a.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.b;
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final long zzc() {
        long zzc = this.a.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.b;
    }

    @Override // defpackage.xzf
    public final long zzd() {
        long zzd = this.a.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.b;
    }

    @Override // defpackage.xzf
    public final z2g zzh() {
        return this.a.zzh();
    }

    @Override // defpackage.xzf
    public final void zzk() {
        this.a.zzk();
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final boolean zzp() {
        return this.a.zzp();
    }
}
