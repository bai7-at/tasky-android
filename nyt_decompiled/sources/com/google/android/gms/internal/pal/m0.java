package com.google.android.gms.internal.pal;

/* loaded from: classes3.dex */
final class m0 implements s0 {
    private final s0[] a;

    m0(s0... s0VarArr) {
        this.a = s0VarArr;
    }

    @Override // com.google.android.gms.internal.pal.s0
    public final r0 zzb(Class cls) {
        s0[] s0VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            s0 s0Var = s0VarArr[i];
            if (s0Var.zzc(cls)) {
                return s0Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.pal.s0
    public final boolean zzc(Class cls) {
        s0[] s0VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (s0VarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
