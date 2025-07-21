package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzzf {
    public static zzwr zza(zzacv zzacvVar) throws zzwv {
        boolean z;
        try {
            try {
                zzacvVar.zzt();
                z = false;
                try {
                    return (zzwr) zzaby.zzV.read(zzacvVar);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return zzwt.zza;
                    }
                    throw new zzwz(e);
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (zzacy e3) {
            throw new zzwz(e3);
        } catch (IOException e4) {
            throw new zzws(e4);
        } catch (NumberFormatException e5) {
            throw new zzwz(e5);
        }
    }
}
