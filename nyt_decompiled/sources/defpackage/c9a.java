package defpackage;

/* loaded from: classes3.dex */
final class c9a implements uu9 {
    private final pfe a;
    private final b9e b = new b9e();
    private final int c;

    public c9a(int i, pfe pfeVar, int i2) {
        this.c = i;
        this.a = pfeVar;
    }

    @Override // defpackage.uu9
    public final tu9 a(ov9 ov9Var, long j) {
        int a;
        int a2;
        long zzf = ov9Var.zzf();
        int min = (int) Math.min(112800L, ov9Var.zzd() - zzf);
        this.b.h(min);
        ((bv9) ov9Var).d(this.b.m(), 0, min, false);
        b9e b9eVar = this.b;
        int t = b9eVar.t();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (b9eVar.q() >= 188 && (a2 = (a = o9a.a(b9eVar.m(), b9eVar.s(), t)) + 188) <= t) {
            long b = o9a.b(b9eVar, a, this.c);
            if (b != -9223372036854775807L) {
                long b2 = this.a.b(b);
                if (b2 <= j) {
                    j4 = a;
                    if (100000 + b2 <= j) {
                        j3 = b2;
                    }
                } else if (j3 == -9223372036854775807L) {
                    return tu9.d(b2, zzf);
                }
                return tu9.e(zzf + j4);
            }
            b9eVar.k(a2);
            j2 = a2;
        }
        return j3 != -9223372036854775807L ? tu9.f(j3, zzf + j2) : tu9.d;
    }

    @Override // defpackage.uu9
    public final void zzb() {
        byte[] bArr = khe.f;
        int length = bArr.length;
        this.b.i(bArr, 0);
    }
}
