package com.google.android.gms.internal.ads;

import defpackage.m0f;
import defpackage.n0f;

/* loaded from: classes3.dex */
public enum zzgvz implements m0f {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    private static final n0f zzg = new n0f() { // from class: com.google.android.gms.internal.ads.hg
    };
    private final int zzi;

    zzgvz(int i) {
        this.zzi = i;
    }

    public static zzgvz zzb(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
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
