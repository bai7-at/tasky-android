package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes2.dex */
final class zzaba extends zzxi {
    zzaba() {
    }

    public static final URI zza(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        try {
            String zzi = zzacvVar.zzi();
            if (Constants.NULL_VERSION_ID.equals(zzi)) {
                return null;
            }
            return new URI(zzi);
        } catch (URISyntaxException e) {
            throw new zzws(e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        return zza(zzacvVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        zzacxVar.zzk(uri == null ? null : uri.toASCIIString());
    }
}
