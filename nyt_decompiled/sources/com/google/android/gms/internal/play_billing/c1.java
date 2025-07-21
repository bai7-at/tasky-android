package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
final class c1 extends a1 {
    c1() {
    }

    @Override // com.google.android.gms.internal.play_billing.a1
    final /* synthetic */ int a(Object obj) {
        return ((b1) obj).a();
    }

    @Override // com.google.android.gms.internal.play_billing.a1
    final /* synthetic */ int b(Object obj) {
        return ((b1) obj).b();
    }

    @Override // com.google.android.gms.internal.play_billing.a1
    final /* bridge */ /* synthetic */ Object c(Object obj) {
        z zVar = (z) obj;
        b1 b1Var = zVar.zzc;
        if (b1Var != b1.c()) {
            return b1Var;
        }
        b1 f = b1.f();
        zVar.zzc = f;
        return f;
    }

    @Override // com.google.android.gms.internal.play_billing.a1
    final /* synthetic */ Object d(Object obj) {
        return ((z) obj).zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.a1
    final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (b1.c().equals(obj2)) {
            return obj;
        }
        if (b1.c().equals(obj)) {
            return b1.e((b1) obj, (b1) obj2);
        }
        ((b1) obj).d((b1) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.a1
    final /* bridge */ /* synthetic */ void f(Object obj, int i, long j) {
        ((b1) obj).j(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.play_billing.a1
    final void g(Object obj) {
        ((z) obj).zzc.h();
    }

    @Override // com.google.android.gms.internal.play_billing.a1
    final /* synthetic */ void h(Object obj, Object obj2) {
        ((z) obj).zzc = (b1) obj2;
    }

    @Override // com.google.android.gms.internal.play_billing.a1
    final /* synthetic */ void i(Object obj, m1 m1Var) {
        ((b1) obj).k(m1Var);
    }
}
