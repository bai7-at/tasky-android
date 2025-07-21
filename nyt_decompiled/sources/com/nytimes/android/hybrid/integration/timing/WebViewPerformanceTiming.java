package com.nytimes.android.hybrid.integration.timing;

import defpackage.et3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class WebViewPerformanceTiming {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    private final long n;
    private final long o;
    private final long p;
    private final long q;
    private final long r;
    private final long s;
    private final long t;
    private final long u;

    public WebViewPerformanceTiming(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.p = j16;
        this.q = j17;
        this.r = j18;
        this.s = j19;
        this.t = j20;
        this.u = j21;
    }

    public final long a() {
        return this.j;
    }

    public final long b() {
        return this.i;
    }

    public final long c() {
        return this.s;
    }

    public final long d() {
        return this.r;
    }

    public final long e() {
        return this.q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewPerformanceTiming)) {
            return false;
        }
        WebViewPerformanceTiming webViewPerformanceTiming = (WebViewPerformanceTiming) obj;
        return this.a == webViewPerformanceTiming.a && this.b == webViewPerformanceTiming.b && this.c == webViewPerformanceTiming.c && this.d == webViewPerformanceTiming.d && this.e == webViewPerformanceTiming.e && this.f == webViewPerformanceTiming.f && this.g == webViewPerformanceTiming.g && this.h == webViewPerformanceTiming.h && this.i == webViewPerformanceTiming.i && this.j == webViewPerformanceTiming.j && this.k == webViewPerformanceTiming.k && this.l == webViewPerformanceTiming.l && this.m == webViewPerformanceTiming.m && this.n == webViewPerformanceTiming.n && this.o == webViewPerformanceTiming.o && this.p == webViewPerformanceTiming.p && this.q == webViewPerformanceTiming.q && this.r == webViewPerformanceTiming.r && this.s == webViewPerformanceTiming.s && this.t == webViewPerformanceTiming.t && this.u == webViewPerformanceTiming.u;
    }

    public final long f() {
        return this.p;
    }

    public final long g() {
        return this.o;
    }

    public final long h() {
        return this.h;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + Long.hashCode(this.d)) * 31) + Long.hashCode(this.e)) * 31) + Long.hashCode(this.f)) * 31) + Long.hashCode(this.g)) * 31) + Long.hashCode(this.h)) * 31) + Long.hashCode(this.i)) * 31) + Long.hashCode(this.j)) * 31) + Long.hashCode(this.k)) * 31) + Long.hashCode(this.l)) * 31) + Long.hashCode(this.m)) * 31) + Long.hashCode(this.n)) * 31) + Long.hashCode(this.o)) * 31) + Long.hashCode(this.p)) * 31) + Long.hashCode(this.q)) * 31) + Long.hashCode(this.r)) * 31) + Long.hashCode(this.s)) * 31) + Long.hashCode(this.t)) * 31) + Long.hashCode(this.u);
    }

    public final long i() {
        return this.g;
    }

    public final long j() {
        return this.f;
    }

    public final long k() {
        return this.u;
    }

    public final long l() {
        return this.t;
    }

    public final long m() {
        return this.a;
    }

    public final long n() {
        return this.e;
    }

    public final long o() {
        return this.d;
    }

    public final long p() {
        return this.l;
    }

    public final long q() {
        return this.n;
    }

    public final long r() {
        return this.m;
    }

    public final long s() {
        return this.k;
    }

    public final long t() {
        return this.c;
    }

    public String toString() {
        return "WebViewPerformanceTiming(navigationStart=" + this.a + ", unloadEventStart=" + this.b + ", unloadEventEnd=" + this.c + ", redirectStart=" + this.d + ", redirectEnd=" + this.e + ", fetchStart=" + this.f + ", domainLookupStart=" + this.g + ", domainLookupEnd=" + this.h + ", connectStart=" + this.i + ", connectEnd=" + this.j + ", secureConnectionStart=" + this.k + ", requestStart=" + this.l + ", responseStart=" + this.m + ", responseEnd=" + this.n + ", domLoading=" + this.o + ", domInteractive=" + this.p + ", domContentLoadedEventStart=" + this.q + ", domContentLoadedEventEnd=" + this.r + ", domComplete=" + this.s + ", loadEventStart=" + this.t + ", loadEventEnd=" + this.u + ")";
    }

    public final long u() {
        return this.b;
    }
}
