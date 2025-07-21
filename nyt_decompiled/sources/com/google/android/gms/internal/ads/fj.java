package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
abstract class fj {
    fj() {
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

    abstract void k(Object obj, int i, zzgyl zzgylVar);

    abstract void l(Object obj, int i, long j);

    abstract void m(Object obj);

    abstract void n(Object obj, Object obj2);

    abstract void o(Object obj, Object obj2);

    final boolean p(Object obj, xi xiVar) {
        int zzd = xiVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            l(obj, i, xiVar.zzl());
            return true;
        }
        if (i2 == 1) {
            i(obj, i, xiVar.zzk());
            return true;
        }
        if (i2 == 2) {
            k(obj, i, xiVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhag.a();
            }
            h(obj, i, xiVar.zzf());
            return true;
        }
        Object f = f();
        int i3 = i << 3;
        while (xiVar.zzc() != Integer.MAX_VALUE && p(f, xiVar)) {
        }
        if ((4 | i3) != xiVar.zzd()) {
            throw zzhag.b();
        }
        g(f);
        j(obj, i, f);
        return true;
    }

    abstract boolean q(xi xiVar);

    abstract void r(Object obj, mh mhVar);
}
