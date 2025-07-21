package com.nytimes.android.external.cache3;

import com.nytimes.android.external.cache3.LocalCache;
import com.nytimes.android.external.cache3.b;
import defpackage.a74;
import defpackage.cg9;
import defpackage.dg0;
import defpackage.e16;
import defpackage.hw6;
import defpackage.iw6;
import defpackage.ql8;
import defpackage.sr;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class CacheBuilder {
    static final ql8 p = new a();
    private static final Logger q = Logger.getLogger(CacheBuilder.class.getName());
    cg9 f;
    LocalCache.Strength g;
    LocalCache.Strength h;
    Equivalence l;
    Equivalence m;
    hw6 n;
    ql8 o;
    boolean a = true;
    int b = -1;
    int c = -1;
    long d = -1;
    long e = -1;
    long i = -1;
    long j = -1;
    long k = -1;

    enum NullListener implements hw6 {
        INSTANCE;

        @Override // defpackage.hw6
        public void onRemoval(iw6 iw6Var) {
        }
    }

    enum OneWeigher implements cg9 {
        INSTANCE;

        @Override // defpackage.cg9
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    final class a extends ql8 {
        a() {
        }

        @Override // defpackage.ql8
        public long a() {
            return 0L;
        }
    }

    CacheBuilder() {
    }

    private void c() {
        e16.g(this.k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void d() {
        if (this.f == null) {
            e16.g(this.e == -1, "maximumWeight requires weigher");
        } else if (this.a) {
            e16.g(this.e != -1, "weigher requires maximumWeight");
        } else if (this.e == -1) {
            q.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public static CacheBuilder x() {
        return new CacheBuilder();
    }

    CacheBuilder A(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.h;
        e16.h(strength2 == null, "Value strength was already set to %s", strength2);
        this.h = (LocalCache.Strength) e16.d(strength);
        return this;
    }

    public CacheBuilder B(ql8 ql8Var) {
        e16.f(this.o == null);
        this.o = (ql8) e16.d(ql8Var);
        return this;
    }

    CacheBuilder C(Equivalence equivalence) {
        Equivalence equivalence2 = this.m;
        e16.h(equivalence2 == null, "value equivalence was already set to %s", equivalence2);
        this.m = (Equivalence) e16.d(equivalence);
        return this;
    }

    public CacheBuilder D(cg9 cg9Var) {
        e16.f(this.f == null);
        if (this.a) {
            long j = this.d;
            e16.h(j == -1, "weigher can not be combined with maximum size", Long.valueOf(j));
        }
        this.f = (cg9) e16.d(cg9Var);
        return this;
    }

    public dg0 a() {
        d();
        c();
        return new LocalCache.LocalManualCache(this);
    }

    public a74 b(CacheLoader cacheLoader) {
        d();
        return new LocalCache.LocalLoadingCache(this, cacheLoader);
    }

    public CacheBuilder e(int i) {
        int i2 = this.c;
        e16.h(i2 == -1, "concurrency level was already set to %s", Integer.valueOf(i2));
        e16.a(i > 0);
        this.c = i;
        return this;
    }

    public CacheBuilder f(long j, TimeUnit timeUnit) {
        long j2 = this.j;
        e16.h(j2 == -1, "expireAfterAccess was already set to %s ns", Long.valueOf(j2));
        e16.c(j >= 0, "duration cannot be negative: %s %s", Long.valueOf(j), timeUnit);
        this.j = timeUnit.toNanos(j);
        return this;
    }

    public CacheBuilder g(long j, TimeUnit timeUnit) {
        long j2 = this.i;
        e16.h(j2 == -1, "expireAfterWrite was already set to %s ns", Long.valueOf(j2));
        e16.c(j >= 0, "duration cannot be negative: %s %s", Long.valueOf(j), timeUnit);
        this.i = timeUnit.toNanos(j);
        return this;
    }

    int h() {
        int i = this.c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    long i() {
        long j = this.j;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    long j() {
        long j = this.i;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    int k() {
        int i = this.b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    Equivalence l() {
        return (Equivalence) b.a(this.l, m().defaultEquivalence());
    }

    LocalCache.Strength m() {
        return (LocalCache.Strength) b.a(this.g, LocalCache.Strength.STRONG);
    }

    long n() {
        if (this.i == 0 || this.j == 0) {
            return 0L;
        }
        return this.f == null ? this.d : this.e;
    }

    long o() {
        long j = this.k;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    hw6 p() {
        return (hw6) b.a(this.n, NullListener.INSTANCE);
    }

    ql8 q(boolean z) {
        ql8 ql8Var = this.o;
        return ql8Var != null ? ql8Var : z ? ql8.b() : p;
    }

    Equivalence r() {
        return (Equivalence) b.a(this.m, s().defaultEquivalence());
    }

    LocalCache.Strength s() {
        return (LocalCache.Strength) b.a(this.h, LocalCache.Strength.STRONG);
    }

    cg9 t() {
        return (cg9) b.a(this.f, OneWeigher.INSTANCE);
    }

    public String toString() {
        b.C0267b b = b.b(this);
        int i = this.b;
        if (i != -1) {
            b.a("initialCapacity", i);
        }
        int i2 = this.c;
        if (i2 != -1) {
            b.a("concurrencyLevel", i2);
        }
        long j = this.d;
        if (j != -1) {
            b.b("maximumSize", j);
        }
        long j2 = this.e;
        if (j2 != -1) {
            b.b("maximumWeight", j2);
        }
        if (this.i != -1) {
            b.c("expireAfterWrite", this.i + "ns");
        }
        if (this.j != -1) {
            b.c("expireAfterAccess", this.j + "ns");
        }
        LocalCache.Strength strength = this.g;
        if (strength != null) {
            b.c("keyStrength", sr.b(strength.toString()));
        }
        LocalCache.Strength strength2 = this.h;
        if (strength2 != null) {
            b.c("valueStrength", sr.b(strength2.toString()));
        }
        if (this.l != null) {
            b.g("keyEquivalence");
        }
        if (this.m != null) {
            b.g("valueEquivalence");
        }
        if (this.n != null) {
            b.g("removalListener");
        }
        return b.toString();
    }

    CacheBuilder u(Equivalence equivalence) {
        Equivalence equivalence2 = this.l;
        e16.h(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.l = (Equivalence) e16.d(equivalence);
        return this;
    }

    public CacheBuilder v(long j) {
        long j2 = this.d;
        e16.h(j2 == -1, "maximum size was already set to %s", Long.valueOf(j2));
        long j3 = this.e;
        e16.h(j3 == -1, "maximum weight was already set to %s", Long.valueOf(j3));
        e16.g(this.f == null, "maximum size can not be combined with weigher");
        e16.b(j >= 0, "maximum size must not be negative");
        this.d = j;
        return this;
    }

    public CacheBuilder w(long j) {
        long j2 = this.e;
        e16.h(j2 == -1, "maximum weight was already set to %s", Long.valueOf(j2));
        long j3 = this.d;
        e16.h(j3 == -1, "maximum size was already set to %s", Long.valueOf(j3));
        this.e = j;
        e16.b(j >= 0, "maximum weight must not be negative");
        return this;
    }

    public CacheBuilder y(hw6 hw6Var) {
        e16.f(this.n == null);
        this.n = (hw6) e16.d(hw6Var);
        return this;
    }

    CacheBuilder z(LocalCache.Strength strength) {
        LocalCache.Strength strength2 = this.g;
        e16.h(strength2 == null, "Key strength was already set to %s", strength2);
        this.g = (LocalCache.Strength) e16.d(strength);
        return this;
    }
}
