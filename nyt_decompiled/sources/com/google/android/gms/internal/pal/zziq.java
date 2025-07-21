package com.google.android.gms.internal.pal;

import defpackage.o7f;

/* loaded from: classes3.dex */
final class zziq extends zzil {
    private final Object zza;

    zziq(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final zzil a(o7f o7fVar) {
        return new zziq(o7fVar.zza(this.zza));
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final Object b() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final Object c(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zziq) {
            return this.zza.equals(((zziq) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza + ")";
    }
}
