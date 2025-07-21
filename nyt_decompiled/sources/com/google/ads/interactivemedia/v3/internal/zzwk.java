package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
final class zzwk extends zzxi {
    final /* synthetic */ zzxi zza;

    zzwk(zzxi zzxiVar) {
        this.zza = zzxiVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        zzacvVar.zzj();
        while (zzacvVar.zzq()) {
            arrayList.add(Long.valueOf(((Number) this.zza.read(zzacvVar)).longValue()));
        }
        zzacvVar.zzl();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        zzacxVar.zza();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.zza.write(zzacxVar, Long.valueOf(atomicLongArray.get(i)));
        }
        zzacxVar.zzc();
    }
}
