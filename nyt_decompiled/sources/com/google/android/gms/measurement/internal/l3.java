package com.google.android.gms.measurement.internal;

import defpackage.dcd;
import java.util.List;

/* loaded from: classes3.dex */
public final class l3 {
    private static final Object h = new Object();
    private final String a;
    private final j3 b;
    private final Object c;
    private final Object d;
    private final Object e = new Object();
    private volatile Object f = null;
    private volatile Object g = null;

    /* synthetic */ l3(String str, Object obj, Object obj2, j3 j3Var, dcd dcdVar) {
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.b = j3Var;
    }

    public final Object a(Object obj) {
        List<l3> list;
        synchronized (this.e) {
        }
        if (obj != null) {
            return obj;
        }
        if (k3.a == null) {
            return this.c;
        }
        synchronized (h) {
            try {
                if (c.a()) {
                    return this.g == null ? this.c : this.g;
                }
                try {
                    list = m3.a;
                    for (l3 l3Var : list) {
                        if (c.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            j3 j3Var = l3Var.b;
                            if (j3Var != null) {
                                obj2 = j3Var.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (h) {
                            l3Var.g = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                j3 j3Var2 = this.b;
                if (j3Var2 == null) {
                    return this.c;
                }
                try {
                    return j3Var2.zza();
                } catch (IllegalStateException unused3) {
                    return this.c;
                } catch (SecurityException unused4) {
                    return this.c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.a;
    }
}
