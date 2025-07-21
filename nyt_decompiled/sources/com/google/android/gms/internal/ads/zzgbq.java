package com.google.android.gms.internal.ads;

import defpackage.yie;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzgbq extends zzgaf {
    private static final Object[] h;
    static final zzgbq i;
    final transient Object[] c;
    private final transient int d;
    final transient Object[] e;
    private final transient int f;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        h = objArr;
        i = new zzgbq(objArr, 0, objArr, 0, 0);
    }

    zzgbq(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.c = objArr;
        this.d = i2;
        this.e = objArr2;
        this.f = i3;
        this.g = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    final boolean C() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final int a(Object[] objArr, int i2) {
        System.arraycopy(this.c, 0, objArr, i2, this.g);
        return i2 + this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final int c() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.e;
            if (objArr.length != 0) {
                int b = e9.b(obj);
                while (true) {
                    int i2 = b & this.f;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    b = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv
    public final yie g() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final Object[] k() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    final zzgaa o() {
        return zzgaa.o(this.c, this.g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }
}
