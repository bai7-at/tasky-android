package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzaaa extends zzxi {
    private static final zzxj zza = new zzzy(zzxf.DOUBLE);
    private final zzwm zzb;
    private final zzxg zzc;

    /* synthetic */ zzaaa(zzwm zzwmVar, zzxg zzxgVar, zzzz zzzzVar) {
        this.zzb = zzwmVar;
        this.zzc = zzxgVar;
    }

    public static zzxj zza(zzxg zzxgVar) {
        return zzxgVar == zzxf.DOUBLE ? zza : new zzzy(zzxgVar);
    }

    private final Object zzb(zzacv zzacvVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 5) {
            return zzacvVar.zzi();
        }
        if (i2 == 6) {
            return this.zzc.zza(zzacvVar);
        }
        if (i2 == 7) {
            return Boolean.valueOf(zzacvVar.zzs());
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzacw.zza(i)));
        }
        zzacvVar.zzn();
        return null;
    }

    private static final Object zzc(zzacv zzacvVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            zzacvVar.zzj();
            return new ArrayList();
        }
        if (i2 != 2) {
            return null;
        }
        zzacvVar.zzk();
        return new zzyy();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final Object read(zzacv zzacvVar) throws IOException {
        int zzt = zzacvVar.zzt();
        Object zzc = zzc(zzacvVar, zzt);
        if (zzc == null) {
            return zzb(zzacvVar, zzt);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzacvVar.zzq()) {
                String zzh = zzc instanceof Map ? zzacvVar.zzh() : null;
                int zzt2 = zzacvVar.zzt();
                Object zzc2 = zzc(zzacvVar, zzt2);
                Object zzb = zzc2 == null ? zzb(zzacvVar, zzt2) : zzc2;
                if (zzc instanceof List) {
                    ((List) zzc).add(zzb);
                } else {
                    ((Map) zzc).put(zzh, zzb);
                }
                if (zzc2 != null) {
                    arrayDeque.addLast(zzc);
                    zzc = zzb;
                }
            } else {
                if (zzc instanceof List) {
                    zzacvVar.zzl();
                } else {
                    zzacvVar.zzm();
                }
                if (arrayDeque.isEmpty()) {
                    return zzc;
                }
                zzc = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, Object obj) throws IOException {
        if (obj == null) {
            zzacxVar.zzf();
            return;
        }
        zzxi zza2 = this.zzb.zza(zzact.zza(obj.getClass()));
        if (!(zza2 instanceof zzaaa)) {
            zza2.write(zzacxVar, obj);
        } else {
            zzacxVar.zzb();
            zzacxVar.zzd();
        }
    }
}
