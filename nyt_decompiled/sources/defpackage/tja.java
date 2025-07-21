package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class tja implements Runnable {
    final /* synthetic */ uja a;

    tja(uja ujaVar) {
        this.a = ujaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List list;
        obj = this.a.c;
        synchronized (obj) {
            uja ujaVar = this.a;
            z = ujaVar.d;
            if (z) {
                z2 = ujaVar.e;
                if (z2) {
                    ujaVar.d = false;
                    fgb.b("App went background");
                    list = this.a.f;
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((vja) it2.next()).a(false);
                        } catch (Exception e) {
                            fgb.e("", e);
                        }
                    }
                }
            }
            fgb.b("App is still foreground");
        }
    }
}
