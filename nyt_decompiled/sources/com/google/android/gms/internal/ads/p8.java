package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class p8 extends AbstractCollection {
    final /* synthetic */ q8 a;

    p8(q8 q8Var) {
        this.a = q8Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.zzp();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it2 = this.a.zzs().values().iterator();
        while (it2.hasNext()) {
            if (((Collection) it2.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.zze();
    }
}
