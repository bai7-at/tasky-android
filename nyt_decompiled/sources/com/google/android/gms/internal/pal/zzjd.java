package com.google.android.gms.internal.pal;

import defpackage.o9f;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzjd extends zziw implements Set {
    private transient zziz b;

    zzjd() {
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

    public abstract o9f g();

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return b3.a(this);
    }

    public final zziz j() {
        zziz zzizVar = this.b;
        if (zzizVar != null) {
            return zzizVar;
        }
        zziz k = k();
        this.b = k;
        return k;
    }

    zziz k() {
        return zziz.j(toArray());
    }
}
