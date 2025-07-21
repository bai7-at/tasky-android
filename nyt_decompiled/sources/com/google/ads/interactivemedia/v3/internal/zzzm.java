package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzzm extends zzxi {
    public static final zzxj zza = new zzzl();
    private final Class zzb;
    private final zzxi zzc;

    public zzzm(zzwm zzwmVar, zzxi zzxiVar, Class cls) {
        this.zzc = new zzaam(zzwmVar, zzxiVar, cls);
        this.zzb = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        zzacvVar.zzj();
        while (zzacvVar.zzq()) {
            arrayList.add(this.zzc.read(zzacvVar));
        }
        zzacvVar.zzl();
        int size = arrayList.size();
        if (!this.zzb.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.zzb, size));
        }
        Object newInstance = Array.newInstance((Class<?>) this.zzb, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, Object obj) throws IOException {
        if (obj == null) {
            zzacxVar.zzf();
            return;
        }
        zzacxVar.zza();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.zzc.write(zzacxVar, Array.get(obj, i));
        }
        zzacxVar.zzc();
    }
}
