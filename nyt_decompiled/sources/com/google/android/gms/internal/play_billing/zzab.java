package com.google.android.gms.internal.play_billing;

import defpackage.aff;
import java.util.AbstractMap;

/* loaded from: classes3.dex */
final class zzab extends zzu {
    final /* synthetic */ zzac zza;

    zzab(zzac zzacVar) {
        this.zza = zzacVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.e;
        aff.a(i, i2, "index");
        zzac zzacVar = this.zza;
        objArr = zzacVar.d;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzacVar.d;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.e;
        return i;
    }
}
