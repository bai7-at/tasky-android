package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzadj implements Comparator {
    zzadj() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzadr zzadrVar = (zzadr) obj;
        zzadr zzadrVar2 = (zzadr) obj2;
        zzadm it2 = zzadrVar.iterator();
        zzadm it3 = zzadrVar2.iterator();
        while (it2.hasNext() && it3.hasNext()) {
            int compareTo = Integer.valueOf(it2.zza() & 255).compareTo(Integer.valueOf(it3.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzadrVar.zzd()).compareTo(Integer.valueOf(zzadrVar2.zzd()));
    }
}
