package defpackage;

/* loaded from: classes3.dex */
final class z1a implements w1a {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    private z1a(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    public static z1a c(long j, y1a y1aVar, long j2) {
        long j3 = y1aVar.b;
        if (j3 == -1) {
            j3 = -1;
        }
        long G = khe.G((j3 * r7.g) - 1, y1aVar.a.d);
        long j4 = y1aVar.c;
        if (j4 == -1 || y1aVar.f == null) {
            return new z1a(j2, y1aVar.a.c, G, -1L, null);
        }
        if (j != -1) {
            long j5 = j2 + j4;
            if (j != j5) {
                ezd.f("XingSeeker", "XING data size mismatch: " + j + ", " + j5);
            }
        }
        return new z1a(j2, y1aVar.a.c, G, y1aVar.c, y1aVar.f);
    }

    private final long d(int i) {
        return (this.c * i) / 100;
    }

    @Override // defpackage.gx9
    public final ex9 a(long j) {
        if (!zzh()) {
            hx9 hx9Var = new hx9(0L, this.a + this.b);
            return new ex9(hx9Var, hx9Var);
        }
        long max = Math.max(0L, Math.min(j, this.c));
        double d = (max * 100.0d) / this.c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.f;
                wad.b(jArr);
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j2 = this.d;
        hx9 hx9Var2 = new hx9(max, this.a + Math.max(this.b, Math.min(Math.round((d2 / 256.0d) * j2), j2 - 1)));
        return new ex9(hx9Var2, hx9Var2);
    }

    @Override // defpackage.w1a
    public final long b(long j) {
        if (!zzh()) {
            return 0L;
        }
        long j2 = j - this.a;
        if (j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.f;
        wad.b(jArr);
        double d = (j2 * 256.0d) / this.d;
        int r = khe.r(jArr, (long) d, true, true);
        long d2 = d(r);
        long j3 = jArr[r];
        int i = r + 1;
        long d3 = d(i);
        return d2 + Math.round((j3 == (r == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (d3 - d2));
    }

    @Override // defpackage.gx9
    public final long zza() {
        return this.c;
    }

    @Override // defpackage.w1a
    public final long zzc() {
        return this.e;
    }

    @Override // defpackage.gx9
    public final boolean zzh() {
        return this.f != null;
    }
}
