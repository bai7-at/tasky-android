package com.google.android.gms.internal.ads;

import defpackage.a7g;
import defpackage.c7g;
import defpackage.ezd;
import defpackage.n1c;
import defpackage.o6g;
import defpackage.p2g;
import defpackage.qyf;
import defpackage.s7g;
import defpackage.wad;
import defpackage.xzf;
import defpackage.z2g;
import defpackage.zff;
import defpackage.zzf;

/* loaded from: classes3.dex */
final class io {
    public final xzf a;
    public final Object b;
    public final p2g[] c;
    public boolean d;
    public boolean e;
    public jo f;
    public boolean g;
    private final boolean[] h;
    private final zff[] i;
    private final a7g j;
    private final wo k;
    private io l;
    private z2g m;
    private c7g n;
    private long o;

    public io(zff[] zffVarArr, long j, a7g a7gVar, s7g s7gVar, wo woVar, jo joVar, c7g c7gVar) {
        this.i = zffVarArr;
        this.o = j;
        this.j = a7gVar;
        this.k = woVar;
        zzf zzfVar = joVar.a;
        this.b = zzfVar.a;
        this.f = joVar;
        this.m = z2g.d;
        this.n = c7gVar;
        this.c = new p2g[2];
        this.h = new boolean[2];
        long j2 = joVar.b;
        long j3 = joVar.d;
        xzf o = woVar.o(zzfVar, s7gVar, j2);
        this.a = j3 != -9223372036854775807L ? new qyf(o, true, 0L, j3) : o;
    }

    private final void s() {
        if (!u()) {
            return;
        }
        int i = 0;
        while (true) {
            c7g c7gVar = this.n;
            if (i >= c7gVar.a) {
                return;
            }
            c7gVar.b(i);
            o6g o6gVar = this.n.c[i];
            i++;
        }
    }

    private final void t() {
        if (!u()) {
            return;
        }
        int i = 0;
        while (true) {
            c7g c7gVar = this.n;
            if (i >= c7gVar.a) {
                return;
            }
            c7gVar.b(i);
            o6g o6gVar = this.n.c[i];
            i++;
        }
    }

    private final boolean u() {
        return this.l == null;
    }

    public final long a(c7g c7gVar, long j, boolean z) {
        return b(c7gVar, j, false, new boolean[2]);
    }

    public final long b(c7g c7gVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c7gVar.a) {
                break;
            }
            boolean[] zArr2 = this.h;
            if (z || !c7gVar.a(this.n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zff[] zffVarArr = this.i;
            if (i2 >= 2) {
                break;
            }
            zffVarArr[i2].b();
            i2++;
        }
        s();
        this.n = c7gVar;
        t();
        long e = this.a.e(c7gVar.c, this.h, this.c, zArr, j);
        int i3 = 0;
        while (true) {
            zff[] zffVarArr2 = this.i;
            if (i3 >= 2) {
                break;
            }
            zffVarArr2[i3].b();
            i3++;
        }
        this.e = false;
        int i4 = 0;
        while (true) {
            p2g[] p2gVarArr = this.c;
            if (i4 >= 2) {
                return e;
            }
            if (p2gVarArr[i4] != null) {
                wad.f(c7gVar.b(i4));
                this.i[i4].b();
                this.e = true;
            } else {
                wad.f(c7gVar.c[i4] == null);
            }
            i4++;
        }
    }

    public final long c() {
        if (!this.d) {
            return this.f.b;
        }
        long zzb = this.e ? this.a.zzb() : Long.MIN_VALUE;
        return zzb == Long.MIN_VALUE ? this.f.e : zzb;
    }

    public final long d() {
        if (this.d) {
            return this.a.zzc();
        }
        return 0L;
    }

    public final long e() {
        return this.o;
    }

    public final long f() {
        return this.f.b + this.o;
    }

    public final io g() {
        return this.l;
    }

    public final z2g h() {
        return this.m;
    }

    public final c7g i() {
        return this.n;
    }

    public final c7g j(float f, n1c n1cVar) {
        c7g e = this.j.e(this.i, this.m, this.f.a, n1cVar);
        for (o6g o6gVar : e.c) {
        }
        return e;
    }

    public final void k(long j, float f, long j2) {
        wad.f(u());
        long j3 = j - this.o;
        go goVar = new go();
        goVar.e(j3);
        goVar.f(f);
        goVar.d(j2);
        this.a.a(new ho(goVar, null));
    }

    public final void l(float f, n1c n1cVar) {
        this.d = true;
        this.m = this.a.zzh();
        c7g j = j(f, n1cVar);
        jo joVar = this.f;
        long j2 = joVar.b;
        long j3 = joVar.e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false);
        long j4 = this.o;
        jo joVar2 = this.f;
        this.o = j4 + (joVar2.b - a);
        this.f = joVar2.b(a);
    }

    public final void m(long j) {
        wad.f(u());
        if (this.d) {
            this.a.c(j - this.o);
        }
    }

    public final void n() {
        s();
        xzf xzfVar = this.a;
        try {
            boolean z = xzfVar instanceof qyf;
            wo woVar = this.k;
            if (z) {
                woVar.i(((qyf) xzfVar).a);
            } else {
                woVar.i(xzfVar);
            }
        } catch (RuntimeException e) {
            ezd.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void o(io ioVar) {
        if (ioVar == this.l) {
            return;
        }
        s();
        this.l = ioVar;
        t();
    }

    public final void p(long j) {
        this.o = 1000000000000L;
    }

    public final void q() {
        xzf xzfVar = this.a;
        if (xzfVar instanceof qyf) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((qyf) xzfVar).g(0L, j);
        }
    }

    public final boolean r() {
        if (this.d) {
            return !this.e || this.a.zzb() == Long.MIN_VALUE;
        }
        return false;
    }
}
