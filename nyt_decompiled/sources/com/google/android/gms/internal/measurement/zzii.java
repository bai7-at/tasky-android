package com.google.android.gms.internal.measurement;

import defpackage.k7f;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzii implements Serializable, k7f {
    final Object zza;

    zzii(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzii)) {
            return false;
        }
        Object obj2 = this.zza;
        Object obj3 = ((zzii) obj).zza;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.zza + ")";
    }

    @Override // defpackage.k7f
    public final Object zza() {
        return this.zza;
    }
}
