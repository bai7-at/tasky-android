package com.google.android.gms.internal.pal;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class k implements Comparator {
    k() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzaby zzabyVar = (zzaby) obj;
        zzaby zzabyVar2 = (zzaby) obj2;
        j jVar = new j(zzabyVar);
        j jVar2 = new j(zzabyVar2);
        while (jVar.hasNext() && jVar2.hasNext()) {
            int compareTo = Integer.valueOf(jVar.zza() & 255).compareTo(Integer.valueOf(jVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzabyVar.e()).compareTo(Integer.valueOf(zzabyVar2.e()));
    }
}
