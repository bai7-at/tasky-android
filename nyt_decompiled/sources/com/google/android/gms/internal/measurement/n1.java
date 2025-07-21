package com.google.android.gms.internal.measurement;

import defpackage.k7f;

/* loaded from: classes3.dex */
final class n1 implements k7f {
    volatile k7f a;
    volatile boolean b;
    Object c;

    n1(k7f k7fVar) {
        k7fVar.getClass();
        this.a = k7fVar;
    }

    public final String toString() {
        Object obj = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.k7f
    public final Object zza() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        k7f k7fVar = this.a;
                        k7fVar.getClass();
                        Object zza = k7fVar.zza();
                        this.c = zza;
                        this.b = true;
                        this.a = null;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }
}
