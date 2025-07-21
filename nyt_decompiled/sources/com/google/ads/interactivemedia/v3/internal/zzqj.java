package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzqj extends Exception {
    private final int zza;

    public zzqj(int i, String str) {
        super(str);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzqj(int i, Throwable th) {
        super(th);
        this.zza = i;
    }
}
