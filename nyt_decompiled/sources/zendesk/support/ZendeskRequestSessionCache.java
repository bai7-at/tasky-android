package zendesk.support;

import defpackage.mn0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
class ZendeskRequestSessionCache implements RequestSessionCache {
    private final Map<Long, TicketForm> cachedTicketForms = new HashMap();

    ZendeskRequestSessionCache() {
    }

    @Override // zendesk.support.RequestSessionCache
    public boolean containsAllTicketForms(List<Long> list) {
        boolean z;
        List d = mn0.d(list);
        synchronized (this.cachedTicketForms) {
            try {
                Iterator it2 = d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    if (!this.cachedTicketForms.containsKey((Long) it2.next())) {
                        z = false;
                        break;
                    }
                }
            } finally {
            }
        }
        return z;
    }

    @Override // zendesk.support.RequestSessionCache
    public synchronized List<TicketForm> getTicketFormsById(List<Long> list) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List d = mn0.d(list);
        synchronized (this.cachedTicketForms) {
            try {
                Iterator it2 = d.iterator();
                while (it2.hasNext()) {
                    arrayList.add(this.cachedTicketForms.get((Long) it2.next()));
                }
            } finally {
            }
        }
        return arrayList;
    }
}
