package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public enum zzxf implements zzxg {
    DOUBLE,
    LAZILY_PARSED_NUMBER,
    LONG_OR_DOUBLE,
    BIG_DECIMAL;

    @Override // com.google.ads.interactivemedia.v3.internal.zzxg
    public final /* synthetic */ Number zza(zzacv zzacvVar) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return Double.valueOf(zzacvVar.zza());
        }
        if (ordinal == 1) {
            return new zzyq(zzacvVar.zzi());
        }
        if (ordinal == 2) {
            throw null;
        }
        if (ordinal != 3) {
            throw null;
        }
        throw null;
    }
}
