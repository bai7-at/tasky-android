package com.google.android.gms.internal.common;

import defpackage.twf;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes3.dex */
final class zzai extends zzag {
    static final zzag e = new zzai(new Object[0], 0);
    final transient Object[] c;
    private final transient int d;

    zzai(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    final int a(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
        return this.d;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int c() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        twf.a(i, this.d, "index");
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final Object[] j() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
