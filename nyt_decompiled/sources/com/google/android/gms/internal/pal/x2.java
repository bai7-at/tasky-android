package com.google.android.gms.internal.pal;

/* loaded from: classes3.dex */
final class x2 extends u2 {
    private final zziz c;

    x2(zziz zzizVar, int i) {
        super(zzizVar.size(), i);
        this.c = zzizVar;
    }

    @Override // com.google.android.gms.internal.pal.u2
    protected final Object b(int i) {
        return this.c.get(i);
    }
}
