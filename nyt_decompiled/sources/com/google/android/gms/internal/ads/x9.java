package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class x9 extends AbstractMap {
    private transient Set a;
    private transient Collection b;

    x9() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set a = a();
        this.a = a;
        return a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        w9 w9Var = new w9(this);
        this.b = w9Var;
        return w9Var;
    }
}
