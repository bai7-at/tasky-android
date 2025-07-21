package com.google.android.gms.internal.pal;

/* loaded from: classes3.dex */
final class k1 extends i1 {
    k1() {
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* synthetic */ int a(Object obj) {
        return ((j1) obj).a();
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* synthetic */ int b(Object obj) {
        return ((j1) obj).b();
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* bridge */ /* synthetic */ Object c(Object obj) {
        c0 c0Var = (c0) obj;
        j1 j1Var = c0Var.zzc;
        if (j1Var != j1.c()) {
            return j1Var;
        }
        j1 e = j1.e();
        c0Var.zzc = e;
        return e;
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* synthetic */ Object d(Object obj) {
        return ((c0) obj).zzc;
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        j1 j1Var = (j1) obj2;
        return j1Var.equals(j1.c()) ? obj : j1.d((j1) obj, j1Var);
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* synthetic */ Object f() {
        return j1.e();
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* synthetic */ Object g(Object obj) {
        ((j1) obj).f();
        return obj;
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* bridge */ /* synthetic */ void h(Object obj, int i, int i2) {
        ((j1) obj).h((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* bridge */ /* synthetic */ void i(Object obj, int i, long j) {
        ((j1) obj).h((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* bridge */ /* synthetic */ void j(Object obj, int i, Object obj2) {
        ((j1) obj).h((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* bridge */ /* synthetic */ void k(Object obj, int i, zzaby zzabyVar) {
        ((j1) obj).h((i << 3) | 2, zzabyVar);
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* bridge */ /* synthetic */ void l(Object obj, int i, long j) {
        ((j1) obj).h(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.pal.i1
    final void m(Object obj) {
        ((c0) obj).zzc.f();
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* synthetic */ void n(Object obj, Object obj2) {
        ((c0) obj).zzc = (j1) obj2;
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* synthetic */ void o(Object obj, Object obj2) {
        ((c0) obj).zzc = (j1) obj2;
    }

    @Override // com.google.android.gms.internal.pal.i1
    final /* synthetic */ void p(Object obj, v1 v1Var) {
        ((j1) obj).i(v1Var);
    }

    @Override // com.google.android.gms.internal.pal.i1
    final boolean r(c1 c1Var) {
        return false;
    }
}
