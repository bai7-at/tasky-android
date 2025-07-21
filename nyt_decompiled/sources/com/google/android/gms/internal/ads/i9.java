package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class i9 extends x7 {
    private final zzgaa c;

    i9(zzgaa zzgaaVar, int i) {
        super(zzgaaVar.size(), i);
        this.c = zzgaaVar;
    }

    @Override // com.google.android.gms.internal.ads.x7
    protected final Object b(int i) {
        return this.c.get(i);
    }
}
