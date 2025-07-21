package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.o;
import defpackage.ur;
import defpackage.z19;

/* loaded from: classes2.dex */
final class z0 {
    public final o.b a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    z0(o.b bVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        ur.a(!z4 || z2);
        ur.a(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        ur.a(z5);
        this.a = bVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public z0 a(long j) {
        return j == this.c ? this : new z0(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public z0 b(long j) {
        return j == this.b ? this : new z0(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.b == z0Var.b && this.c == z0Var.c && this.d == z0Var.d && this.e == z0Var.e && this.f == z0Var.f && this.g == z0Var.g && this.h == z0Var.h && this.i == z0Var.i && z19.c(this.a, z0Var.a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.a.hashCode()) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
