package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class zzgbs extends ga implements Serializable {
    final ga zza;

    zzgbs(ga gaVar) {
        this.zza = gaVar;
    }

    @Override // com.google.android.gms.internal.ads.ga
    public final ga a() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.ga, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgbs) {
            return this.zza.equals(((zzgbs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}
