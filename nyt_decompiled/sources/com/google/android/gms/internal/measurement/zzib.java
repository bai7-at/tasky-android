package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzib extends zzid {
    static final zzib a = new zzib();

    private zzib() {
    }

    @Override // com.google.android.gms.internal.measurement.zzid
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.zzid
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
