package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.ik2;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class r64 {
    private final vl0 a;
    private final r63 b;
    private final b c;
    private final CopyOnWriteArraySet d;
    private final ArrayDeque e;
    private final ArrayDeque f;
    private final Object g;
    private boolean h;
    private boolean i;

    public interface a {
        void invoke(Object obj);
    }

    public interface b {
        void a(Object obj, ik2 ik2Var);
    }

    private static final class c {
        public final Object a;
        private ik2.b b = new ik2.b();
        private boolean c;
        private boolean d;

        public c(Object obj) {
            this.a = obj;
        }

        public void a(int i, a aVar) {
            if (this.d) {
                return;
            }
            if (i != -1) {
                this.b.a(i);
            }
            this.c = true;
            aVar.invoke(this.a);
        }

        public void b(b bVar) {
            if (this.d || !this.c) {
                return;
            }
            ik2 e = this.b.e();
            this.b = new ik2.b();
            this.c = false;
            bVar.a(this.a, e);
        }

        public void c(b bVar) {
            this.d = true;
            if (this.c) {
                this.c = false;
                bVar.a(this.a, this.b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public r64(Looper looper, vl0 vl0Var, b bVar) {
        this(new CopyOnWriteArraySet(), looper, vl0Var, bVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).b(this.c);
            if (this.b.b(0)) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i, a aVar) {
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).a(i, aVar);
        }
    }

    private void m() {
        if (this.i) {
            ur.g(Thread.currentThread() == this.b.e().getThread());
        }
    }

    public void c(Object obj) {
        ur.e(obj);
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new c(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public r64 d(Looper looper, vl0 vl0Var, b bVar) {
        return new r64(this.d, looper, vl0Var, bVar, this.i);
    }

    public r64 e(Looper looper, b bVar) {
        return d(looper, this.a, bVar);
    }

    public void f() {
        m();
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.b(0)) {
            r63 r63Var = this.b;
            r63Var.g(r63Var.a(0));
        }
        boolean isEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (isEmpty) {
            while (!this.e.isEmpty()) {
                ((Runnable) this.e.peekFirst()).run();
                this.e.removeFirst();
            }
        }
    }

    public void i(final int i, final a aVar) {
        m();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: q64
            @Override // java.lang.Runnable
            public final void run() {
                r64.h(copyOnWriteArraySet, i, aVar);
            }
        });
    }

    public void j() {
        m();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).c(this.c);
        }
        this.d.clear();
    }

    public void k(Object obj) {
        m();
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            if (cVar.a.equals(obj)) {
                cVar.c(this.c);
                this.d.remove(cVar);
            }
        }
    }

    public void l(int i, a aVar) {
        i(i, aVar);
        f();
    }

    private r64(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, vl0 vl0Var, b bVar, boolean z) {
        this.a = vl0Var;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = vl0Var.b(looper, new Handler.Callback() { // from class: p64
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean g;
                g = r64.this.g(message);
                return g;
            }
        });
        this.i = z;
    }
}
