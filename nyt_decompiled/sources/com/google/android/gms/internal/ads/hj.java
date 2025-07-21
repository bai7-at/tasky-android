package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class hj extends fj {
    hj() {
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* synthetic */ int a(Object obj) {
        return ((gj) obj).a();
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* synthetic */ int b(Object obj) {
        return ((gj) obj).b();
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* bridge */ /* synthetic */ Object c(Object obj) {
        yh yhVar = (yh) obj;
        gj gjVar = yhVar.zzc;
        if (gjVar != gj.c()) {
            return gjVar;
        }
        gj f = gj.f();
        yhVar.zzc = f;
        return f;
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* synthetic */ Object d(Object obj) {
        return ((yh) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (gj.c().equals(obj2)) {
            return obj;
        }
        if (gj.c().equals(obj)) {
            return gj.e((gj) obj, (gj) obj2);
        }
        ((gj) obj).d((gj) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* synthetic */ Object f() {
        return gj.f();
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* synthetic */ Object g(Object obj) {
        ((gj) obj).h();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* bridge */ /* synthetic */ void h(Object obj, int i, int i2) {
        ((gj) obj).j((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* bridge */ /* synthetic */ void i(Object obj, int i, long j) {
        ((gj) obj).j((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* bridge */ /* synthetic */ void j(Object obj, int i, Object obj2) {
        ((gj) obj).j((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* bridge */ /* synthetic */ void k(Object obj, int i, zzgyl zzgylVar) {
        ((gj) obj).j((i << 3) | 2, zzgylVar);
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* bridge */ /* synthetic */ void l(Object obj, int i, long j) {
        ((gj) obj).j(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.fj
    final void m(Object obj) {
        ((yh) obj).zzc.h();
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* synthetic */ void n(Object obj, Object obj2) {
        ((yh) obj).zzc = (gj) obj2;
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* synthetic */ void o(Object obj, Object obj2) {
        ((yh) obj).zzc = (gj) obj2;
    }

    @Override // com.google.android.gms.internal.ads.fj
    final boolean q(xi xiVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fj
    final /* synthetic */ void r(Object obj, mh mhVar) {
        ((gj) obj).k(mhVar);
    }
}
