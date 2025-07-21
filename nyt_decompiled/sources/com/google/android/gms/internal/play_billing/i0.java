package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
final class i0 implements n0 {
    private final n0[] a;

    i0(n0... n0VarArr) {
        this.a = n0VarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    public final m0 zzb(Class cls) {
        n0[] n0VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            n0 n0Var = n0VarArr[i];
            if (n0Var.zzc(cls)) {
                return n0Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    public final boolean zzc(Class cls) {
        n0[] n0VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (n0VarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
