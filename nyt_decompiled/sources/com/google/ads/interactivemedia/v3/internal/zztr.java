package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class zztr extends zzth implements Serializable {
    final zzth zza;

    zztr(zzth zzthVar) {
        this.zza = zzthVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzth, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zztr) {
            return this.zza.equals(((zztr) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzth
    public final zzth zza() {
        return this.zza;
    }
}
