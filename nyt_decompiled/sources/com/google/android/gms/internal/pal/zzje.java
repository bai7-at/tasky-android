package com.google.android.gms.internal.pal;

import defpackage.z7f;

/* loaded from: classes3.dex */
final class zzje extends zziz {
    static final zziz e = new zzje(new Object[0], 0);
    final transient Object[] c;
    private final transient int d;

    zzje(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.pal.zziz, com.google.android.gms.internal.pal.zziw
    final int a(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
        return this.d;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    final int c() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    final Object[] f() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        z7f.a(i, this.d, "index");
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
