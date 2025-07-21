package com.google.android.gms.internal.measurement;

import defpackage.k7f;
import java.io.Serializable;

/* loaded from: classes3.dex */
final class zzig implements Serializable, k7f {
    volatile transient boolean a;
    transient Object b;
    final k7f zza;

    zzig(k7f k7fVar) {
        k7fVar.getClass();
        this.zza = k7fVar;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.a) {
            obj = "<supplier that returned " + this.b + ">";
        } else {
            obj = this.zza;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.k7f
    public final Object zza() {
        if (!this.a) {
            synchronized (this) {
                try {
                    if (!this.a) {
                        Object zza = this.zza.zza();
                        this.b = zza;
                        this.a = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
