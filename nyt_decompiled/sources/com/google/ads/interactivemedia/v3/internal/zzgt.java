package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzgt implements zzgv {
    final String zza;

    public zzgt(String str) {
        this.zza = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgv
    public final boolean zza(zzgu zzguVar, boolean z) {
        String host;
        if (z || !zzguVar.zzc || !this.zza.contains("GOOGLE_INSTREAM_VIDEO_NONCE")) {
            return false;
        }
        String str = this.zza;
        List<String> list = zzguVar.zze;
        if (str == null || list == null || (host = Uri.parse(str).getHost()) == null) {
            return true;
        }
        if (host.startsWith("www.")) {
            host = host.substring(4);
        }
        for (String str2 : list) {
            if (host == str2) {
                return false;
            }
            if (host != null && host.equals(str2)) {
                return false;
            }
        }
        return true;
    }
}
