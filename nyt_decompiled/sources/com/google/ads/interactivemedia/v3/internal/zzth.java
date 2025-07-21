package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class zzth implements Comparator {
    protected zzth() {
    }

    public static zzth zzb() {
        return zztf.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzth zza() {
        return new zztr(this);
    }

    public final zzth zzc(zzrc zzrcVar) {
        return new zzru(zzrcVar, this);
    }
}
