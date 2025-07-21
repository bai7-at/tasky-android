package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import defpackage.h8f;
import defpackage.khe;
import defpackage.moa;

/* loaded from: classes3.dex */
public final class um {
    private final long a;
    private final long b;
    private long c = -9223372036854775807L;
    private long d = -9223372036854775807L;
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private float j = 0.97f;
    private float i = 1.03f;
    private float k = 1.0f;
    private long l = -9223372036854775807L;
    private long e = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private long m = -9223372036854775807L;
    private long n = -9223372036854775807L;

    /* synthetic */ um(float f, float f2, long j, float f3, long j2, long j3, float f4, h8f h8fVar) {
        this.a = j2;
        this.b = j3;
    }

    private static long f(long j, long j2, float f) {
        return (long) ((j * 0.999f) + (j2 * 9.999871E-4f));
    }

    private final void g() {
        long j;
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            j = this.d;
            if (j == -9223372036854775807L) {
                long j3 = this.f;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.g;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.e == j) {
            return;
        }
        this.e = j;
        this.h = j;
        this.m = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.l = -9223372036854775807L;
    }

    public final float a(long j, long j2) {
        long j3;
        if (this.c == -9223372036854775807L) {
            return 1.0f;
        }
        long j4 = j - j2;
        long j5 = this.m;
        if (j5 == -9223372036854775807L) {
            this.m = j4;
            this.n = 0L;
        } else {
            long max = Math.max(j4, f(j5, j4, 0.999f));
            this.m = max;
            this.n = f(this.n, Math.abs(j4 - max), 0.999f);
        }
        if (this.l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.l < 1000) {
            return this.k;
        }
        this.l = SystemClock.elapsedRealtime();
        long j6 = this.m + (this.n * 3);
        if (this.h > j6) {
            float F = khe.F(1000L);
            long[] jArr = {j6, this.e, this.h - (((long) ((this.k - 1.0f) * F)) + ((long) ((this.i - 1.0f) * F)))};
            j3 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j3) {
                    j3 = j7;
                }
            }
            this.h = j3;
        } else {
            long max2 = Math.max(this.h, Math.min(j - ((long) (Math.max(0.0f, this.k - 1.0f) / 1.0E-7f)), j6));
            this.h = max2;
            long j8 = this.g;
            if (j8 == -9223372036854775807L || max2 <= j8) {
                j3 = max2;
            } else {
                this.h = j8;
                j3 = j8;
            }
        }
        long j9 = j - j3;
        if (Math.abs(j9) < this.a) {
            this.k = 1.0f;
            return 1.0f;
        }
        float max3 = Math.max(this.j, Math.min((j9 * 1.0E-7f) + 1.0f, this.i));
        this.k = max3;
        return max3;
    }

    public final long b() {
        return this.h;
    }

    public final void c() {
        long j = this.h;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.b;
        this.h = j2;
        long j3 = this.g;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.h = j3;
        }
        this.l = -9223372036854775807L;
    }

    public final void d(moa moaVar) {
        long j = moaVar.a;
        this.c = khe.F(-9223372036854775807L);
        this.f = khe.F(-9223372036854775807L);
        this.g = khe.F(-9223372036854775807L);
        this.j = 0.97f;
        this.i = 1.03f;
        g();
    }

    public final void e(long j) {
        this.d = j;
        g();
    }
}
