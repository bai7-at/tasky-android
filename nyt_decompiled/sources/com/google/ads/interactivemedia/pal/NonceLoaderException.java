package com.google.ads.interactivemedia.pal;

/* loaded from: classes2.dex */
public final class NonceLoaderException extends Exception {
    private final int zza;

    public NonceLoaderException(int i, Exception exc) {
        super("NonceLoader exception, errorCode : " + i, exc);
        this.zza = i;
    }

    public static NonceLoaderException zzb(int i) {
        return new NonceLoaderException(i, new Exception());
    }

    final int zza() {
        return this.zza;
    }
}
