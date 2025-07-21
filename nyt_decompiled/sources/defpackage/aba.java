package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class aba {
    private final AtomicInteger a;
    private final Set b;
    private final PriorityBlockingQueue c;
    private final PriorityBlockingQueue d;
    private final gaa e;
    private final oaa f;
    private final paa[] g;
    private iaa h;
    private final List i;
    private final List j;
    private final maa k;

    public aba(gaa gaaVar, oaa oaaVar, int i) {
        maa maaVar = new maa(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.e = gaaVar;
        this.f = oaaVar;
        this.g = new paa[4];
        this.k = maaVar;
    }

    public final zaa a(zaa zaaVar) {
        zaaVar.e(this);
        synchronized (this.b) {
            this.b.add(zaaVar);
        }
        zaaVar.f(this.a.incrementAndGet());
        zaaVar.n("add-to-queue");
        c(zaaVar, 0);
        this.c.add(zaaVar);
        return zaaVar;
    }

    final void b(zaa zaaVar) {
        synchronized (this.b) {
            this.b.remove(zaaVar);
        }
        synchronized (this.i) {
            Iterator it2 = this.i.iterator();
            if (it2.hasNext()) {
                lh4.a(it2.next());
                throw null;
            }
        }
        c(zaaVar, 5);
    }

    final void c(zaa zaaVar, int i) {
        synchronized (this.j) {
            try {
                Iterator it2 = this.j.iterator();
                if (it2.hasNext()) {
                    lh4.a(it2.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        iaa iaaVar = this.h;
        if (iaaVar != null) {
            iaaVar.b();
        }
        paa[] paaVarArr = this.g;
        for (int i = 0; i < 4; i++) {
            paa paaVar = paaVarArr[i];
            if (paaVar != null) {
                paaVar.a();
            }
        }
        iaa iaaVar2 = new iaa(this.c, this.d, this.e, this.k);
        this.h = iaaVar2;
        iaaVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            paa paaVar2 = new paa(this.d, this.f, this.e, this.k);
            this.g[i2] = paaVar2;
            paaVar2.start();
        }
    }
}
