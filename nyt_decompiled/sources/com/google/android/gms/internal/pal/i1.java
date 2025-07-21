package com.google.android.gms.internal.pal;

/* loaded from: classes3.dex */
abstract class i1 {
    i1() {
    }

    abstract int a(Object obj);

    abstract int b(Object obj);

    abstract Object c(Object obj);

    abstract Object d(Object obj);

    abstract Object e(Object obj, Object obj2);

    abstract Object f();

    abstract Object g(Object obj);

    abstract void h(Object obj, int i, int i2);

    abstract void i(Object obj, int i, long j);

    abstract void j(Object obj, int i, Object obj2);

    abstract void k(Object obj, int i, zzaby zzabyVar);

    abstract void l(Object obj, int i, long j);

    abstract void m(Object obj);

    abstract void n(Object obj, Object obj2);

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, v1 v1Var);

    final boolean q(Object obj, c1 c1Var) {
        int zzd = c1Var.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            l(obj, i, c1Var.zzl());
            return true;
        }
        if (i2 == 1) {
            i(obj, i, c1Var.zzk());
            return true;
        }
        if (i2 == 2) {
            k(obj, i, c1Var.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzadi.a();
            }
            h(obj, i, c1Var.zzf());
            return true;
        }
        Object f = f();
        int i3 = 4 | (i << 3);
        while (c1Var.zzc() != Integer.MAX_VALUE && q(f, c1Var)) {
        }
        if (i3 != c1Var.zzd()) {
            throw zzadi.b();
        }
        g(f);
        j(obj, i, f);
        return true;
    }

    abstract boolean r(c1 c1Var);
}
