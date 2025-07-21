package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzy extends zzr implements Set {
    private transient zzu b;

    zzy() {
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

    @Override // com.google.android.gms.internal.play_billing.zzr
    public zzu f() {
        zzu zzuVar = this.b;
        if (zzuVar != null) {
            return zzuVar;
        }
        zzu k = k();
        this.b = k;
        return k;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return a.a(this);
    }

    zzu k() {
        Object[] array = toArray();
        int i = zzu.c;
        return zzu.n(array, array.length);
    }
}
