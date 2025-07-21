package com.google.android.gms.internal.pal;

import defpackage.o7f;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class zzil implements Serializable {
    zzil() {
    }

    public static zzil e() {
        return zzif.a;
    }

    public static zzil f(Object obj) {
        obj.getClass();
        return new zziq(obj);
    }

    public abstract zzil a(o7f o7fVar);

    public abstract Object b();

    public abstract Object c(Object obj);

    public abstract boolean d();
}
