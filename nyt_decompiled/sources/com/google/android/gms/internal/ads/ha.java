package com.google.android.gms.internal.ads;

import defpackage.lhe;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
final class ha extends lhe {
    final Iterator c;
    final /* synthetic */ ia d;

    ha(ia iaVar) {
        this.d = iaVar;
        this.c = iaVar.a.iterator();
    }

    @Override // defpackage.lhe
    protected final Object b() {
        while (this.c.hasNext()) {
            Iterator it2 = this.c;
            Set set = this.d.b;
            Object next = it2.next();
            if (set.contains(next)) {
                return next;
            }
        }
        c();
        return null;
    }
}
