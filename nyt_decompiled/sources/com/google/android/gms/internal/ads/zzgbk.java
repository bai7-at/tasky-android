package com.google.android.gms.internal.ads;

import defpackage.tge;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgbk extends zzgaa {
    static final zzgaa f = new zzgbk(new Object[0], 0);
    final transient Object[] d;
    private final transient int e;

    zzgbk(Object[] objArr, int i) {
        this.d = objArr;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa, com.google.android.gms.internal.ads.zzfzv
    final int a(Object[] objArr, int i) {
        System.arraycopy(this.d, 0, objArr, i, this.e);
        return i + this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final int c() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tge.a(i, this.e, "index");
        Object obj = this.d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final Object[] k() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
