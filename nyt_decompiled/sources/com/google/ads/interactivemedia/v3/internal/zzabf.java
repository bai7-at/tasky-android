package com.google.ads.interactivemedia.v3.internal;

import com.chartbeat.androidsdk.QueryKeys;
import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
final class zzabf extends zzxi {
    zzabf() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(zzacvVar.zzi(), QueryKeys.END_MARKER);
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        zzacxVar.zzk(locale == null ? null : locale.toString());
    }
}
