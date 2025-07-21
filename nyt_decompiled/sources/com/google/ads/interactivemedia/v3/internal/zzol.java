package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzol extends Exception {
    private final int zza;

    public zzol(int i) {
        super("Signal SDK error code: " + i);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }
}
