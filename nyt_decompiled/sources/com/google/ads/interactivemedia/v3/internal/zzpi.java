package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzpi {
    public static zzqf zza(Context context, int i, int i2, String str, String str2, String str3, zzoy zzoyVar) {
        return new zzph(context, 1, i2, str, str2, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, zzoyVar).zzb(50000);
    }
}
