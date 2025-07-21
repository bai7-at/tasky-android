package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class vs0 implements gb8 {
    private Set a;
    private volatile boolean b;

    private static void c(Collection collection) {
        if (collection == null) {
            return;
        }
        Iterator it2 = collection.iterator();
        ArrayList arrayList = null;
        while (it2.hasNext()) {
            try {
                ((gb8) it2.next()).unsubscribe();
            } catch (Throwable th) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        e62.c(arrayList);
    }

    public void a(gb8 gb8Var) {
        if (gb8Var.isUnsubscribed()) {
            return;
        }
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        if (this.a == null) {
                            this.a = new HashSet(4);
                        }
                        this.a.add(gb8Var);
                        return;
                    }
                } finally {
                }
            }
        }
        gb8Var.unsubscribe();
    }

    public void b(gb8 gb8Var) {
        Set set;
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b && (set = this.a) != null) {
                boolean remove = set.remove(gb8Var);
                if (remove) {
                    gb8Var.unsubscribe();
                }
            }
        }
    }

    @Override // defpackage.gb8
    public boolean isUnsubscribed() {
        return this.b;
    }

    @Override // defpackage.gb8
    public void unsubscribe() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                Set set = this.a;
                this.a = null;
                c(set);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
