package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class ii implements ni {
    private final ni[] a;

    ii(ni... niVarArr) {
        this.a = niVarArr;
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final mi zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            ni niVar = this.a[i];
            if (niVar.zzc(cls)) {
                return niVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.ni
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
