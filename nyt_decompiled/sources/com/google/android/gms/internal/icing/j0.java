package com.google.android.gms.internal.icing;

/* loaded from: classes3.dex */
final class j0 implements o0 {
    private final o0[] a;

    j0(o0... o0VarArr) {
        this.a = o0VarArr;
    }

    @Override // com.google.android.gms.internal.icing.o0
    public final boolean zzb(Class cls) {
        o0[] o0VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (o0VarArr[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.icing.o0
    public final n0 zzc(Class cls) {
        o0[] o0VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            o0 o0Var = o0VarArr[i];
            if (o0Var.zzb(cls)) {
                return o0Var.zzc(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
