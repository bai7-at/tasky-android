package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import defpackage.c7g;
import defpackage.hib;
import defpackage.n1c;
import defpackage.z2g;
import defpackage.zzf;
import java.util.List;

/* loaded from: classes3.dex */
final class xo {
    private static final zzf t = new zzf(new Object(), -1);
    public final n1c a;
    public final zzf b;
    public final long c;
    public final long d;
    public final int e;
    public final zziz f;
    public final boolean g;
    public final z2g h;
    public final c7g i;
    public final List j;
    public final zzf k;
    public final boolean l;
    public final int m;
    public final hib n;
    public final boolean o = false;
    public volatile long p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public xo(n1c n1cVar, zzf zzfVar, long j, long j2, int i, zziz zzizVar, boolean z, z2g z2gVar, c7g c7gVar, List list, zzf zzfVar2, boolean z2, int i2, hib hibVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = n1cVar;
        this.b = zzfVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = zzizVar;
        this.g = z;
        this.h = z2gVar;
        this.i = c7gVar;
        this.j = list;
        this.k = zzfVar2;
        this.l = z2;
        this.m = i2;
        this.n = hibVar;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.s = j6;
    }

    public static xo g(c7g c7gVar) {
        n1c n1cVar = n1c.a;
        zzf zzfVar = t;
        return new xo(n1cVar, zzfVar, -9223372036854775807L, 0L, 1, null, false, z2g.d, c7gVar, zzgaa.t(), zzfVar, false, 0, hib.d, 0L, 0L, 0L, 0L, false);
    }

    public static zzf h() {
        return t;
    }

    public final xo a(zzf zzfVar) {
        return new xo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, zzfVar, this.l, this.m, this.n, this.p, this.q, this.r, this.s, false);
    }

    public final xo b(zzf zzfVar, long j, long j2, long j3, long j4, z2g z2gVar, c7g c7gVar, List list) {
        zzf zzfVar2 = this.k;
        boolean z = this.l;
        int i = this.m;
        hib hibVar = this.n;
        long j5 = this.p;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new xo(this.a, zzfVar, j2, j3, this.e, this.f, this.g, z2gVar, c7gVar, list, zzfVar2, z, i, hibVar, j5, j4, j, elapsedRealtime, false);
    }

    public final xo c(boolean z, int i) {
        return new xo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.p, this.q, this.r, this.s, false);
    }

    public final xo d(zziz zzizVar) {
        return new xo(this.a, this.b, this.c, this.d, this.e, zzizVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, false);
    }

    public final xo e(int i) {
        return new xo(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, false);
    }

    public final xo f(n1c n1cVar) {
        return new xo(n1cVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, false);
    }

    public final boolean i() {
        return this.e == 3 && this.l && this.m == 0;
    }
}
