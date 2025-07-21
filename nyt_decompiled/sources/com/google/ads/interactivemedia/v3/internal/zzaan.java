package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes2.dex */
final class zzaan extends zzxi {
    zzaan() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        zzacvVar.zzj();
        while (zzacvVar.zzq()) {
            try {
                arrayList.add(Integer.valueOf(zzacvVar.zzc()));
            } catch (NumberFormatException e) {
                throw new zzwz(e);
            }
        }
        zzacvVar.zzl();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        zzacxVar.zza();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            zzacxVar.zzh(r5.get(i));
        }
        zzacxVar.zzc();
    }
}
