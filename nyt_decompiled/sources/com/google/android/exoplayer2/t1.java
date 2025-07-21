package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.o;
import com.google.common.collect.ImmutableList;
import defpackage.jq8;
import defpackage.wp8;
import defpackage.z19;
import java.util.List;

/* loaded from: classes2.dex */
final class t1 {
    private static final o.b t = new o.b(new Object());
    public final g2 a;
    public final o.b b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final wp8 h;
    public final jq8 i;
    public final List j;
    public final o.b k;
    public final boolean l;
    public final int m;
    public final u1 n;
    public final boolean o;
    public volatile long p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public t1(g2 g2Var, o.b bVar, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, wp8 wp8Var, jq8 jq8Var, List list, o.b bVar2, boolean z2, int i2, u1 u1Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = g2Var;
        this.b = bVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = wp8Var;
        this.i = jq8Var;
        this.j = list;
        this.k = bVar2;
        this.l = z2;
        this.m = i2;
        this.n = u1Var;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.s = j6;
        this.o = z3;
    }

    public static t1 k(jq8 jq8Var) {
        g2 g2Var = g2.a;
        o.b bVar = t;
        return new t1(g2Var, bVar, -9223372036854775807L, 0L, 1, null, false, wp8.d, jq8Var, ImmutableList.x(), bVar, false, 0, u1.d, 0L, 0L, 0L, 0L, false);
    }

    public static o.b l() {
        return t;
    }

    public t1 a() {
        return new t1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, m(), SystemClock.elapsedRealtime(), this.o);
    }

    public t1 b(boolean z) {
        return new t1(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public t1 c(o.b bVar) {
        return new t1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, bVar, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public t1 d(o.b bVar, long j, long j2, long j3, long j4, wp8 wp8Var, jq8 jq8Var, List list) {
        return new t1(this.a, bVar, j2, j3, this.e, this.f, this.g, wp8Var, jq8Var, list, this.k, this.l, this.m, this.n, this.p, j4, j, SystemClock.elapsedRealtime(), this.o);
    }

    public t1 e(boolean z, int i) {
        return new t1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public t1 f(ExoPlaybackException exoPlaybackException) {
        return new t1(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public t1 g(u1 u1Var) {
        return new t1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, u1Var, this.p, this.q, this.r, this.s, this.o);
    }

    public t1 h(int i) {
        return new t1(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public t1 i(boolean z) {
        return new t1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, z);
    }

    public t1 j(g2 g2Var) {
        return new t1(g2Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public long m() {
        long j;
        long j2;
        if (!n()) {
            return this.r;
        }
        do {
            j = this.s;
            j2 = this.r;
        } while (j != this.s);
        return z19.D0(z19.h1(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.n.a)));
    }

    public boolean n() {
        return this.e == 3 && this.l && this.m == 0;
    }

    public void o(long j) {
        this.r = j;
        this.s = SystemClock.elapsedRealtime();
    }
}
