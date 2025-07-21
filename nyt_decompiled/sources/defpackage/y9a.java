package defpackage;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
final class y9a implements gx9 {
    private final v9a a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public y9a(v9a v9aVar, int i, long j, long j2) {
        this.a = v9aVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / v9aVar.d;
        this.d = j3;
        this.e = c(j3);
    }

    private final long c(long j) {
        return khe.H(j * this.b, 1000000L, this.a.c, RoundingMode.FLOOR);
    }

    @Override // defpackage.gx9
    public final ex9 a(long j) {
        long max = Math.max(0L, Math.min((this.a.c * j) / (this.b * 1000000), this.d - 1));
        long c = c(max);
        hx9 hx9Var = new hx9(c, this.c + (this.a.d * max));
        if (c >= j || max == this.d - 1) {
            return new ex9(hx9Var, hx9Var);
        }
        long j2 = max + 1;
        return new ex9(hx9Var, new hx9(c(j2), this.c + (j2 * this.a.d)));
    }

    @Override // defpackage.gx9
    public final long zza() {
        return this.e;
    }

    @Override // defpackage.gx9
    public final boolean zzh() {
        return true;
    }
}
