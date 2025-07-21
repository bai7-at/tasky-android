package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
final class t2 extends q2 {
    private final zzu c;

    t2(zzu zzuVar, int i) {
        super(zzuVar.size(), i);
        this.c = zzuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.q2
    protected final Object b(int i) {
        return this.c.get(i);
    }
}
