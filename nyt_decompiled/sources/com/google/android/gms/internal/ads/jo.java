package com.google.android.gms.internal.ads;

import defpackage.khe;
import defpackage.wad;
import defpackage.zzf;

/* loaded from: classes3.dex */
final class jo {
    public final zzf a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    jo(zzf zzfVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        wad.d(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        wad.d(z5);
        this.a = zzfVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = false;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final jo a(long j) {
        return j == this.c ? this : new jo(this.a, this.b, j, this.d, this.e, false, this.g, this.h, this.i);
    }

    public final jo b(long j) {
        return j == this.b ? this : new jo(this.a, j, this.c, this.d, this.e, false, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jo.class == obj.getClass()) {
            jo joVar = (jo) obj;
            if (this.b == joVar.b && this.c == joVar.c && this.d == joVar.d && this.e == joVar.e && this.g == joVar.g && this.h == joVar.h && this.i == joVar.i && khe.f(this.a, joVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() + 527;
        long j = this.e;
        long j2 = this.d;
        return (((((((((((((hashCode * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) j2)) * 31) + ((int) j)) * 961) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
