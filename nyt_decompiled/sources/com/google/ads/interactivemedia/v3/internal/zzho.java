package com.google.ads.interactivemedia.v3.internal;

import defpackage.cy0;
import defpackage.og8;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzho implements cy0 {
    public final /* synthetic */ zzhu zza;

    @Override // defpackage.cy0
    public final Object then(og8 og8Var) {
        List<og8> list = (List) og8Var.m();
        ArrayList arrayList = new ArrayList(list.size());
        for (og8 og8Var2 : list) {
            if (og8Var2.q()) {
                arrayList.add(og8Var2.m());
            }
        }
        return arrayList;
    }
}
