package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class cr9 {
    private long a;
    private long b;
    private long c;
    private long d;
    private long e;
    private long f;
    private final boolean[] g = new boolean[15];
    private int h;

    public final long a() {
        long j = this.e;
        if (j == 0) {
            return 0L;
        }
        return this.f / j;
    }

    public final long b() {
        return this.f;
    }

    public final void c(long j) {
        long j2 = this.d;
        if (j2 == 0) {
            this.a = j;
        } else if (j2 == 1) {
            long j3 = j - this.a;
            this.b = j3;
            this.f = j3;
            this.e = 1L;
        } else {
            long j4 = j - this.c;
            int i = (int) (j2 % 15);
            if (Math.abs(j4 - this.b) <= 1000000) {
                this.e++;
                this.f += j4;
                boolean[] zArr = this.g;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.h--;
                }
            } else {
                boolean[] zArr2 = this.g;
                if (!zArr2[i]) {
                    zArr2[i] = true;
                    this.h++;
                }
            }
        }
        this.d++;
        this.c = j;
    }

    public final void d() {
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.h = 0;
        Arrays.fill(this.g, false);
    }

    public final boolean e() {
        long j = this.d;
        if (j == 0) {
            return false;
        }
        return this.g[(int) ((j - 1) % 15)];
    }

    public final boolean f() {
        return this.d > 15 && this.h == 0;
    }
}
