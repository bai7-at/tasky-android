package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzzx extends zzxi {
    private static final zzxj zza = zzb(zzxf.LAZILY_PARSED_NUMBER);
    private final zzxg zzb;

    private zzzx(zzxg zzxgVar) {
        this.zzb = zzxgVar;
    }

    public static zzxj zza(zzxg zzxgVar) {
        return zzxgVar == zzxf.LAZILY_PARSED_NUMBER ? zza : zzb(zzxgVar);
    }

    private static zzxj zzb(zzxg zzxgVar) {
        return new zzzw(new zzzx(zzxgVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        int zzt = zzacvVar.zzt();
        int i = zzt - 1;
        if (i == 5 || i == 6) {
            return this.zzb.zza(zzacvVar);
        }
        if (i == 8) {
            zzacvVar.zzn();
            return null;
        }
        throw new zzwz("Expecting number, got: " + zzacw.zza(zzt) + "; at path " + zzacvVar.zze());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        zzacxVar.zzj((Number) obj);
    }
}
