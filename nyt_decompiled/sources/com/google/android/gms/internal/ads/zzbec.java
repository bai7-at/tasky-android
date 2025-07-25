package com.google.android.gms.internal.ads;

import defpackage.m0f;
import defpackage.n0f;

/* loaded from: classes3.dex */
public enum zzbec implements m0f {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);

    private static final n0f zzg = new n0f() { // from class: com.google.android.gms.internal.ads.e4
    };
    private final int zzi;

    zzbec(int i) {
        this.zzi = i;
    }

    public static zzbec zzb(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTING;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return DISCONNECTING;
        }
        if (i == 4) {
            return DISCONNECTED;
        }
        if (i != 5) {
            return null;
        }
        return SUSPENDED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }
}
