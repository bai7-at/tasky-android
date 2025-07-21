package defpackage;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class rof extends s8f {
    final /* synthetic */ IBinder b;
    final /* synthetic */ mwf c;

    rof(mwf mwfVar, IBinder iBinder) {
        this.c = mwfVar;
        this.b = iBinder;
    }

    @Override // defpackage.s8f
    public final void a() {
        List list;
        List list2;
        this.c.a.m = mzc.Q1(this.b);
        txf.n(this.c.a);
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
