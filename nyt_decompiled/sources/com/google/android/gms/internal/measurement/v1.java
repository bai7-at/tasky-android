package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class v1 implements Comparator {
    v1() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzjb zzjbVar = (zzjb) obj;
        zzjb zzjbVar2 = (zzjb) obj2;
        u1 u1Var = new u1(zzjbVar);
        u1 u1Var2 = new u1(zzjbVar2);
        while (u1Var.hasNext() && u1Var2.hasNext()) {
            int compareTo = Integer.valueOf(u1Var.zza() & 255).compareTo(Integer.valueOf(u1Var2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzjbVar.e()).compareTo(Integer.valueOf(zzjbVar2.e()));
    }
}
