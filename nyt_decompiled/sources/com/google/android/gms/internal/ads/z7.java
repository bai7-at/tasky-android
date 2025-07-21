package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
final class z7 extends u9 {
    final /* synthetic */ b8 a;

    z7(b8 b8Var) {
        this.a = b8Var;
    }

    @Override // com.google.android.gms.internal.ads.u9
    final Map a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.u9, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return t8.a(this.a.c.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a8(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        b8 b8Var = this.a;
        zzfyt.p(b8Var.d, entry.getKey());
        return true;
    }
}
