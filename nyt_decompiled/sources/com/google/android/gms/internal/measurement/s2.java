package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class s2 implements x2 {
    private final x2[] a;

    s2(x2... x2VarArr) {
        this.a = x2VarArr;
    }

    @Override // com.google.android.gms.internal.measurement.x2
    public final w2 zzb(Class cls) {
        x2[] x2VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            x2 x2Var = x2VarArr[i];
            if (x2Var.zzc(cls)) {
                return x2Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.x2
    public final boolean zzc(Class cls) {
        x2[] x2VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (x2VarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
