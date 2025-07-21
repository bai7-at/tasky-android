package com.google.android.gms.internal.ads;

import defpackage.qie;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class q8 implements qie {
    private transient Set a;
    private transient Collection b;
    private transient Map c;

    q8() {
    }

    abstract Collection b();

    abstract Iterator c();

    abstract Map d();

    abstract Set e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qie) {
            return zzs().equals(((qie) obj).zzs());
        }
        return false;
    }

    public final Set f() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set e = e();
        this.a = e;
        return e;
    }

    public final int hashCode() {
        return zzs().hashCode();
    }

    public final String toString() {
        return zzs().toString();
    }

    @Override // defpackage.qie
    public final Collection zzr() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        Collection b = b();
        this.b = b;
        return b;
    }

    @Override // defpackage.qie
    public final Map zzs() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map d = d();
        this.c = d;
        return d;
    }
}
