package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzaac<T, A> extends zzxi<T> {
    final Map zza;

    zzaac(Map map) {
        this.zza = map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final T read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        Object zza = zza();
        try {
            zzacvVar.zzk();
            while (zzacvVar.zzq()) {
                zzaad zzaadVar = (zzaad) this.zza.get(zzacvVar.zzh());
                if (zzaadVar != null && zzaadVar.zzm) {
                    zzc(zza, zzacvVar, zzaadVar);
                }
                zzacvVar.zzp();
            }
            zzacvVar.zzm();
            return (T) zzb(zza);
        } catch (IllegalAccessException e) {
            throw zzacg.zzb(e);
        } catch (IllegalStateException e2) {
            throw new zzwz(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, T t) throws IOException {
        if (t == null) {
            zzacxVar.zzf();
            return;
        }
        zzacxVar.zzb();
        try {
            Iterator it2 = this.zza.values().iterator();
            while (it2.hasNext()) {
                ((zzaad) it2.next()).zzc(zzacxVar, t);
            }
            zzacxVar.zzd();
        } catch (IllegalAccessException e) {
            throw zzacg.zzb(e);
        }
    }

    abstract Object zza();

    abstract Object zzb(Object obj);

    abstract void zzc(Object obj, zzacv zzacvVar, zzaad zzaadVar) throws IllegalAccessException, IOException;
}
