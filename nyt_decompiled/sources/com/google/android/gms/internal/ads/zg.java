package com.google.android.gms.internal.ads;

import defpackage.zze;
import java.util.Comparator;

/* loaded from: classes3.dex */
final class zg implements Comparator {
    zg() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgyl zzgylVar = (zzgyl) obj;
        zzgyl zzgylVar2 = (zzgyl) obj2;
        zze it2 = zzgylVar.iterator();
        zze it3 = zzgylVar2.iterator();
        while (it2.hasNext() && it3.hasNext()) {
            int compareTo = Integer.valueOf(it2.zza() & 255).compareTo(Integer.valueOf(it3.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgylVar.g()).compareTo(Integer.valueOf(zzgylVar2.g()));
    }
}
