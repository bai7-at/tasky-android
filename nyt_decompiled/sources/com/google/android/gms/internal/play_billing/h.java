package com.google.android.gms.internal.play_billing;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class h implements Comparator {
    h() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzba zzbaVar = (zzba) obj;
        zzba zzbaVar2 = (zzba) obj2;
        g gVar = new g(zzbaVar);
        g gVar2 = new g(zzbaVar2);
        while (gVar.hasNext() && gVar2.hasNext()) {
            int compareTo = Integer.valueOf(gVar.zza() & 255).compareTo(Integer.valueOf(gVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzbaVar.e()).compareTo(Integer.valueOf(zzbaVar2.e()));
    }
}
