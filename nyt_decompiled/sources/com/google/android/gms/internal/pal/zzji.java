package com.google.android.gms.internal.pal;

import defpackage.z7f;

/* loaded from: classes3.dex */
final class zzji extends zziz {
    private final transient Object[] c;
    private final transient int d;
    private final transient int e;

    zzji(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        z7f.a(i, this.e, "index");
        Object obj = this.c[i + i + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
