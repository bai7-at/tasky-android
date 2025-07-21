package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class ldc {
    protected final Map a = new HashMap();

    protected ldc(Set set) {
        E0(set);
    }

    public final synchronized void C0(Object obj, Executor executor) {
        this.a.put(obj, executor);
    }

    public final synchronized void E0(Set set) {
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            z0((tfc) it2.next());
        }
    }

    protected final synchronized void G0(final kdc kdcVar) {
        for (Map.Entry entry : this.a.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: jdc
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        kdc.this.zza(key);
                    } catch (Throwable th) {
                        dyf.q().v(th, "EventEmitter.notify");
                        pzc.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }

    public final synchronized void z0(tfc tfcVar) {
        C0(tfcVar.a, tfcVar.b);
    }
}
