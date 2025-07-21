package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzie extends zzid {
    private final Object zza;

    zzie(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzid
    public final Object a() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzid
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzie) {
            return this.zza.equals(((zzie) obj).zza);
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
