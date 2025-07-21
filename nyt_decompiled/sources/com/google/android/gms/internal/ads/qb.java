package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class qb extends sb {
    qb(zzfzv zzfzvVar, boolean z) {
        super(zzfzvVar, z);
        R();
    }

    @Override // com.google.android.gms.internal.ads.sb
    public final /* bridge */ /* synthetic */ Object V(List list) {
        ArrayList a = s9.a(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            rb rbVar = (rb) it2.next();
            a.add(rbVar != null ? rbVar.a : null);
        }
        return Collections.unmodifiableList(a);
    }
}
