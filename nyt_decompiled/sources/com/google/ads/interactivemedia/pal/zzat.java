package com.google.ads.interactivemedia.pal;

import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.internal.pal.zzagc;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzat {
    static final String zza = LibraryVersion.getInstance().getVersion("play-services-pal");
    public static final int zzb;
    public static final int zzc;
    public static final zzagc zzd;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zzb = (int) timeUnit.toMillis(20L);
        zzc = (int) timeUnit.toMillis(20L);
        zzd = zzagc.a(150L);
    }
}
