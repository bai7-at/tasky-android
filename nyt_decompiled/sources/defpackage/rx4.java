package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
final class rx4 implements iy7 {
    private final List a;
    private final List b;
    private final List c;
    private final AtomicBoolean d = new AtomicBoolean(false);

    private rx4(List list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iy7 iy7Var = (iy7) it2.next();
            if (iy7Var.isStartRequired()) {
                this.a.add(iy7Var);
            }
            if (iy7Var.isEndRequired()) {
                this.b.add(iy7Var);
            }
        }
    }

    static iy7 a(List list) {
        Objects.requireNonNull(list, "spanProcessorList");
        return new rx4(new ArrayList(list));
    }

    @Override // defpackage.iy7
    public gq0 forceFlush() {
        ArrayList arrayList = new ArrayList(this.c.size());
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            arrayList.add(((iy7) it2.next()).forceFlush());
        }
        return gq0.g(arrayList);
    }

    @Override // defpackage.iy7
    public boolean isEndRequired() {
        return !this.b.isEmpty();
    }

    @Override // defpackage.iy7
    public boolean isStartRequired() {
        return !this.a.isEmpty();
    }

    @Override // defpackage.iy7
    public void onEnd(np6 np6Var) {
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((iy7) it2.next()).onEnd(np6Var);
        }
    }

    @Override // defpackage.iy7
    public void onStart(hx0 hx0Var, mp6 mp6Var) {
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((iy7) it2.next()).onStart(hx0Var, mp6Var);
        }
    }

    @Override // defpackage.iy7
    public gq0 shutdown() {
        if (this.d.getAndSet(true)) {
            return gq0.i();
        }
        ArrayList arrayList = new ArrayList(this.c.size());
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            arrayList.add(((iy7) it2.next()).shutdown());
        }
        return gq0.g(arrayList);
    }

    public String toString() {
        return "MultiSpanProcessor{spanProcessorsStart=" + this.a + ", spanProcessorsEnd=" + this.b + ", spanProcessorsAll=" + this.c + '}';
    }
}
