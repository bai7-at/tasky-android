package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzz.class)
/* loaded from: classes2.dex */
public abstract class zzbg {
    public static zzbg create(long j, AdErrorEvent adErrorEvent) {
        return new zzz(j, null, null, adErrorEvent, null);
    }

    public abstract AdErrorEvent adErrorEvent();

    public abstract zzbe component();

    public abstract zzbi loggableException();

    public abstract zzbf method();

    public abstract long timestamp();

    private static zzbg create(long j, zzbe zzbeVar, zzbf zzbfVar, AdErrorEvent adErrorEvent, zzbi zzbiVar) {
        return new zzz(j, zzbeVar, zzbfVar, null, zzbiVar);
    }

    public static zzbg create(long j, zzbe zzbeVar, zzbf zzbfVar, Throwable th) {
        return create(j, zzbeVar, zzbfVar, null, zzbi.create(th));
    }
}
