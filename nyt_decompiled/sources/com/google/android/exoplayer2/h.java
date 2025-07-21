package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.w0;
import defpackage.sb4;
import defpackage.z19;

/* loaded from: classes2.dex */
public final class h implements v0 {
    private final float a;
    private final float b;
    private final long c;
    private final float d;
    private final long e;
    private final long f;
    private final float g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private float n;
    private float o;
    private float p;
    private long q;
    private long r;
    private long s;

    public static final class b {
        private float a = 0.97f;
        private float b = 1.03f;
        private long c = 1000;
        private float d = 1.0E-7f;
        private long e = z19.D0(20);
        private long f = z19.D0(500);
        private float g = 0.999f;

        public h a() {
            return new h(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }

    private void f(long j) {
        long j2 = this.r + (this.s * 3);
        if (this.m > j2) {
            float D0 = z19.D0(this.c);
            this.m = sb4.c(j2, this.j, this.m - (((long) ((this.p - 1.0f) * D0)) + ((long) ((this.n - 1.0f) * D0))));
            return;
        }
        long r = z19.r(j - ((long) (Math.max(0.0f, this.p - 1.0f) / this.d)), this.m, j2);
        this.m = r;
        long j3 = this.l;
        if (j3 == -9223372036854775807L || r <= j3) {
            return;
        }
        this.m = j3;
    }

    private void g() {
        long j = this.h;
        if (j != -9223372036854775807L) {
            long j2 = this.i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.j == j) {
            return;
        }
        this.j = j;
        this.m = j;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    private static long h(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    private void i(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.r;
        if (j4 == -9223372036854775807L) {
            this.r = j3;
            this.s = 0L;
        } else {
            long max = Math.max(j3, h(j4, j3, this.g));
            this.r = max;
            this.s = h(this.s, Math.abs(j3 - max), this.g);
        }
    }

    @Override // com.google.android.exoplayer2.v0
    public void a(w0.g gVar) {
        this.h = z19.D0(gVar.a);
        this.k = z19.D0(gVar.b);
        this.l = z19.D0(gVar.c);
        float f = gVar.d;
        if (f == -3.4028235E38f) {
            f = this.a;
        }
        this.o = f;
        float f2 = gVar.e;
        if (f2 == -3.4028235E38f) {
            f2 = this.b;
        }
        this.n = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.h = -9223372036854775807L;
        }
        g();
    }

    @Override // com.google.android.exoplayer2.v0
    public float b(long j, long j2) {
        if (this.h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j, j2);
        if (this.q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.q < this.c) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        f(j);
        long j3 = j - this.m;
        if (Math.abs(j3) < this.e) {
            this.p = 1.0f;
        } else {
            this.p = z19.p((this.d * j3) + 1.0f, this.o, this.n);
        }
        return this.p;
    }

    @Override // com.google.android.exoplayer2.v0
    public long c() {
        return this.m;
    }

    @Override // com.google.android.exoplayer2.v0
    public void d() {
        long j = this.m;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f;
        this.m = j2;
        long j3 = this.l;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.m = j3;
        }
        this.q = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.v0
    public void e(long j) {
        this.i = j;
        g();
    }

    private h(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = f3;
        this.e = j2;
        this.f = j3;
        this.g = f4;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.o = f;
        this.n = f2;
        this.p = 1.0f;
        this.q = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
    }
}
