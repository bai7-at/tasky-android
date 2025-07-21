package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
class q14 implements q76 {
    private volatile Set b = null;
    private volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    q14(Collection collection) {
        this.a.addAll(collection);
    }

    static q14 b(Collection collection) {
        return new q14((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                this.b.add(((q76) it2.next()).get());
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(q76 q76Var) {
        try {
            if (this.b == null) {
                this.a.add(q76Var);
            } else {
                this.b.add(q76Var.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.q76
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
