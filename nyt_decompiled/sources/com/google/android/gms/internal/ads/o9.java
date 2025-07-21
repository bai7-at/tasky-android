package com.google.android.gms.internal.ads;

import defpackage.lhe;
import defpackage.uge;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class o9 extends lhe {
    final /* synthetic */ Iterator c;
    final /* synthetic */ uge d;

    o9(Iterator it2, uge ugeVar) {
        this.c = it2;
        this.d = ugeVar;
    }

    @Override // defpackage.lhe
    protected final Object b() {
        while (this.c.hasNext()) {
            Iterator it2 = this.c;
            uge ugeVar = this.d;
            Object next = it2.next();
            if (ugeVar.zza(next)) {
                return next;
            }
        }
        c();
        return null;
    }
}
