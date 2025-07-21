package com.google.android.gms.internal.atv_ads_framework;

import defpackage.aif;

/* loaded from: classes3.dex */
final class zzak extends zzab {
    private final transient Object[] c;
    private final transient int d;
    private final transient int e;

    zzak(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aif.a(i, this.e, "index");
        Object obj = this.c[i + i + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
