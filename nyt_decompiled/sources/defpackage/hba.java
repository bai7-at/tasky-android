package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
final class hba implements saa {
    private final Map a = new HashMap();
    private final iaa b;
    private final BlockingQueue c;
    private final maa d;

    hba(iaa iaaVar, BlockingQueue blockingQueue, maa maaVar) {
        this.d = maaVar;
        this.b = iaaVar;
        this.c = blockingQueue;
    }

    @Override // defpackage.saa
    public final synchronized void a(zaa zaaVar) {
        try {
            Map map = this.a;
            String j = zaaVar.j();
            List list = (List) map.remove(j);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (gba.b) {
                gba.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), j);
            }
            zaa zaaVar2 = (zaa) list.remove(0);
            this.a.put(j, list);
            zaaVar2.w(this);
            try {
                this.c.put(zaaVar2);
            } catch (InterruptedException e) {
                gba.b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.b.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.saa
    public final void b(zaa zaaVar, dba dbaVar) {
        List list;
        faa faaVar = dbaVar.b;
        if (faaVar == null || faaVar.a(System.currentTimeMillis())) {
            a(zaaVar);
            return;
        }
        String j = zaaVar.j();
        synchronized (this) {
            list = (List) this.a.remove(j);
        }
        if (list != null) {
            if (gba.b) {
                gba.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), j);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                this.d.b((zaa) it2.next(), dbaVar, null);
            }
        }
    }

    final synchronized boolean c(zaa zaaVar) {
        try {
            Map map = this.a;
            String j = zaaVar.j();
            if (!map.containsKey(j)) {
                this.a.put(j, null);
                zaaVar.w(this);
                if (gba.b) {
                    gba.a("new request, sending to network %s", j);
                }
                return false;
            }
            List list = (List) this.a.get(j);
            if (list == null) {
                list = new ArrayList();
            }
            zaaVar.n("waiting-for-response");
            list.add(zaaVar);
            this.a.put(j, list);
            if (gba.b) {
                gba.a("Request for cacheKey=%s is in flight, putting on hold.", j);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
