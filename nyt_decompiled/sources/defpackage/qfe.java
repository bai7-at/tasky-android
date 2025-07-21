package defpackage;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class qfe extends hfe {
    final /* synthetic */ IBinder b;
    final /* synthetic */ tfe c;

    qfe(tfe tfeVar, IBinder iBinder) {
        this.b = iBinder;
        this.c = tfeVar;
    }

    @Override // defpackage.hfe
    public final void a() {
        List list;
        List list2;
        this.c.a.m = wde.w6(this.b);
        ufe.q(this.c.a);
        this.c.a.g = false;
        list = this.c.a.d;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        list2 = this.c.a.d;
        list2.clear();
    }
}
