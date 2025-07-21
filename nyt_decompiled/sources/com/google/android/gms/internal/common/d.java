package com.google.android.gms.internal.common;

/* loaded from: classes3.dex */
final class d extends f {
    private final zzag c;

    d(zzag zzagVar, int i) {
        super(zzagVar.size(), i);
        this.c = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.f
    protected final Object b(int i) {
        return this.c.get(i);
    }
}
