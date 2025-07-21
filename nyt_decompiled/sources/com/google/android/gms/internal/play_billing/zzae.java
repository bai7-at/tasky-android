package com.google.android.gms.internal.play_billing;

import defpackage.aff;

/* loaded from: classes3.dex */
final class zzae extends zzu {
    private final transient Object[] d;
    private final transient int e;
    private final transient int f;

    zzae(Object[] objArr, int i, int i2) {
        this.d = objArr;
        this.e = i;
        this.f = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aff.a(i, this.f, "index");
        Object obj = this.d[i + i + this.e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
