package com.google.android.gms.internal.ads;

import defpackage.m0f;
import defpackage.n0f;

/* loaded from: classes3.dex */
public enum zzgus implements m0f {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    private static final n0f zzg = new n0f() { // from class: com.google.android.gms.internal.ads.df
    };
    private final int zzi;

    zzgus(int i) {
        this.zzi = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
