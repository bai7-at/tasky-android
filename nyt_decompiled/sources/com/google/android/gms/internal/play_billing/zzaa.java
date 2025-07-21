package com.google.android.gms.internal.play_billing;

import defpackage.aff;

/* loaded from: classes3.dex */
final class zzaa extends zzu {
    static final zzu f = new zzaa(new Object[0], 0);
    final transient Object[] d;
    private final transient int e;

    zzaa(Object[] objArr, int i) {
        this.d = objArr;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzu, com.google.android.gms.internal.play_billing.zzr
    final int a(Object[] objArr, int i) {
        System.arraycopy(this.d, 0, objArr, 0, this.e);
        return this.e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    final int c() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aff.a(i, this.e, "index");
        Object obj = this.d[i];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    final Object[] j() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
