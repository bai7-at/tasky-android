package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class i32 implements xa8, h86 {
    private final Map a = new HashMap();
    private Queue b = new ArrayDeque();
    private final Executor c;

    i32(Executor executor) {
        this.c = executor;
    }

    private synchronized Set e(c32 c32Var) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Map.Entry entry, c32 c32Var) {
        ((a42) entry.getKey()).a(c32Var);
    }

    @Override // defpackage.xa8
    public synchronized void a(Class cls, Executor executor, a42 a42Var) {
        try {
            c16.b(cls);
            c16.b(a42Var);
            c16.b(executor);
            if (!this.a.containsKey(cls)) {
                this.a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(cls)).put(a42Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.xa8
    public void b(Class cls, a42 a42Var) {
        a(cls, this.c, a42Var);
    }

    void d() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.b;
                if (queue != null) {
                    this.b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it2 = queue.iterator();
            while (it2.hasNext()) {
                lh4.a(it2.next());
                g(null);
            }
        }
    }

    public void g(final c32 c32Var) {
        c16.b(c32Var);
        synchronized (this) {
            try {
                Queue queue = this.b;
                if (queue != null) {
                    queue.add(c32Var);
                    return;
                }
                for (final Map.Entry entry : e(c32Var)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, c32Var) { // from class: h32
                        public final /* synthetic */ Map.Entry a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            i32.f(this.a, null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
