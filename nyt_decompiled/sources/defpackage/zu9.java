package defpackage;

/* loaded from: classes3.dex */
public abstract class zu9 implements gx9 {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public zu9(long j, long j2, int i, int i2, boolean z) {
        long d;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            d = -9223372036854775807L;
        } else {
            this.d = j - j2;
            d = d(j, j2, i);
        }
        this.f = d;
    }

    private static long d(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // defpackage.gx9
    public final ex9 a(long j) {
        long j2 = this.d;
        if (j2 == -1) {
            hx9 hx9Var = new hx9(0L, this.b);
            return new ex9(hx9Var, hx9Var);
        }
        long j3 = this.c;
        long j4 = (((this.e * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            j4 = Math.min(j4, j2 - j3);
        }
        long max = this.b + Math.max(j4, 0L);
        long c = c(max);
        hx9 hx9Var2 = new hx9(c, max);
        if (this.d != -1 && c < j) {
            long j5 = max + this.c;
            if (j5 < this.a) {
                return new ex9(hx9Var2, new hx9(c(j5), j5));
            }
        }
        return new ex9(hx9Var2, hx9Var2);
    }

    public final long c(long j) {
        return d(j, this.b, this.e);
    }

    @Override // defpackage.gx9
    public final long zza() {
        return this.f;
    }

    @Override // defpackage.gx9
    public final boolean zzh() {
        return this.d != -1;
    }
}
