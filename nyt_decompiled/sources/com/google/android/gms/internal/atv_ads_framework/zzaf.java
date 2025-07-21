package com.google.android.gms.internal.atv_ads_framework;

import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzaf extends zzy implements Set {
    private transient zzab b;

    zzaf() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public zzab f() {
        zzab zzabVar = this.b;
        if (zzabVar != null) {
            return zzabVar;
        }
        zzab k = k();
        this.b = k;
        return k;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return c.a(this);
    }

    zzab k() {
        return zzab.n(toArray());
    }
}
