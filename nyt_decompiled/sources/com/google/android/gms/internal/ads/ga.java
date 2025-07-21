package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class ga implements Comparator {
    protected ga() {
    }

    public static ga b(Comparator comparator) {
        return comparator instanceof ga ? (ga) comparator : new zzfzl(comparator);
    }

    public static ga c() {
        return zzgbh.a;
    }

    public ga a() {
        return new zzgbs(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
