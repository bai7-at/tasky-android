package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzb extends LinkedHashMap {
    final /* synthetic */ b zza;

    zzb(b bVar) {
        this.zza = bVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int i;
        ArrayDeque arrayDeque;
        int i2;
        synchronized (this.zza) {
            try {
                int size = size();
                b bVar = this.zza;
                i = bVar.a;
                if (size <= i) {
                    return false;
                }
                arrayDeque = bVar.f;
                arrayDeque.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                int size2 = size();
                i2 = this.zza.a;
                return size2 > i2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
