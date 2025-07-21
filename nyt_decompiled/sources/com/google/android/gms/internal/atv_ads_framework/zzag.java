package com.google.android.gms.internal.atv_ads_framework;

import defpackage.aif;

/* loaded from: classes3.dex */
final class zzag extends zzab {
    static final zzab e = new zzag(new Object[0], 0);
    final transient Object[] c;
    private final transient int d;

    zzag(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzab, com.google.android.gms.internal.atv_ads_framework.zzy
    final int a(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
        return this.d;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    final int c() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aif.a(i, this.d, "index");
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    final Object[] j() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
