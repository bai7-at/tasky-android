package com.google.android.gms.internal.ads;

import defpackage.gge;
import defpackage.tge;

/* loaded from: classes3.dex */
final class zzfxj extends zzfwz {
    private final Object zza;

    zzfxj(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfwz
    public final zzfwz a(gge ggeVar) {
        Object apply = ggeVar.apply(this.zza);
        tge.c(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfxj(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfwz
    public final Object b(Object obj) {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfxj) {
            return this.zza.equals(((zzfxj) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza.toString() + ")";
    }
}
