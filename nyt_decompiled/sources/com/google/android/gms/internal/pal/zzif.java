package com.google.android.gms.internal.pal;

import defpackage.o7f;

/* loaded from: classes3.dex */
final class zzif extends zzil {
    static final zzif a = new zzif();

    private zzif() {
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final zzil a(o7f o7fVar) {
        o7fVar.getClass();
        return a;
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final Object c(Object obj) {
        return obj;
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final boolean d() {
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
