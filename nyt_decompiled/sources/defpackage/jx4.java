package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
final class jx4 implements u84 {
    private final List a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    private jx4(List list) {
        this.a = list;
    }

    static u84 a(List list) {
        Objects.requireNonNull(list, "logRecordProcessorsList");
        return new jx4(new ArrayList(list));
    }

    @Override // defpackage.u84
    public gq0 forceFlush() {
        ArrayList arrayList = new ArrayList(this.a.size());
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            arrayList.add(((u84) it2.next()).forceFlush());
        }
        return gq0.g(arrayList);
    }

    @Override // defpackage.u84
    public void onEmit(hx0 hx0Var, kp6 kp6Var) {
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((u84) it2.next()).onEmit(hx0Var, kp6Var);
        }
    }

    @Override // defpackage.u84
    public gq0 shutdown() {
        if (this.b.getAndSet(true)) {
            return gq0.i();
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            arrayList.add(((u84) it2.next()).shutdown());
        }
        return gq0.g(arrayList);
    }
}
