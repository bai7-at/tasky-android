package com.google.android.gms.internal.icing;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class j implements Comparator {
    j() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzcf zzcfVar = (zzcf) obj;
        zzcf zzcfVar2 = (zzcf) obj2;
        i iVar = new i(zzcfVar);
        i iVar2 = new i(zzcfVar2);
        while (iVar.hasNext() && iVar2.hasNext()) {
            int compare = Integer.compare(iVar.zza() & 255, iVar2.zza() & 255);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzcfVar.e(), zzcfVar2.e());
    }
}
