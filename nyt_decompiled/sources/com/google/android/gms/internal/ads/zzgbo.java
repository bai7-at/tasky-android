package com.google.android.gms.internal.ads;

import defpackage.tge;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgbo extends zzgaa {
    private final transient Object[] d;
    private final transient int e;
    private final transient int f;

    zzgbo(Object[] objArr, int i, int i2) {
        this.d = objArr;
        this.e = i;
        this.f = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tge.a(i, this.f, "index");
        Object obj = this.d[i + i + this.e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
