package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.net.URL;

/* loaded from: classes2.dex */
final class zzaaz extends zzxi {
    zzaaz() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        if (Constants.NULL_VERSION_ID.equals(zzi)) {
            return null;
        }
        return new URL(zzi);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        URL url = (URL) obj;
        zzacxVar.zzk(url == null ? null : url.toExternalForm());
    }
}
