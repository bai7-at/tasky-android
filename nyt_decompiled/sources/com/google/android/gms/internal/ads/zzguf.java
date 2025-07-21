package com.google.android.gms.internal.ads;

import defpackage.m0f;
import defpackage.n0f;

/* loaded from: classes3.dex */
public enum zzguf implements m0f {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private static final n0f zzh = new n0f() { // from class: com.google.android.gms.internal.ads.re
    };
    private final int zzj;

    zzguf(int i) {
        this.zzj = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzj;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
