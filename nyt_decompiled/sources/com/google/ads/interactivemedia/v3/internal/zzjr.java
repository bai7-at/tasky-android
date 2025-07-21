package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzjr extends zzjq {
    protected zzjr(Context context, String str, boolean z) {
        super(context, str, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjq
    protected final List zzo(zzkt zzktVar, Context context, zzaf zzafVar, zzy zzyVar) {
        if (zzktVar.zzk() == null || !((zzjq) this).zzu) {
            return super.zzo(zzktVar, context, zzafVar, null);
        }
        int zza = zzktVar.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzo(zzktVar, context, zzafVar, null));
        arrayList.add(new zzll(zzktVar, "uJXK1isksbASyPiwtOvcbiJ9wKYHFm9MTmlJpAy0avewuNp1ihkySWK6uNDbUQhs", "WSMexOPcW8gihMBLWKRkvKiI89M8OtU49pyTbH1A0ec=", zzafVar, zza, 24));
        return arrayList;
    }
}
