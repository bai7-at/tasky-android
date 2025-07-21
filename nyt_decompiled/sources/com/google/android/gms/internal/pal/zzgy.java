package com.google.android.gms.internal.pal;

import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzgy extends Exception {
    private final int zza;

    public zzgy(int i) {
        super("Signal SDK error code: " + i);
        this.zza = i;
    }

    public final int a() {
        return this.zza;
    }
}
