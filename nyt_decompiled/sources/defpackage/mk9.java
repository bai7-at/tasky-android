package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class mk9 {
    private static final String e = h94.i("WorkTimer");
    final i47 a;
    final Map b = new HashMap();
    final Map c = new HashMap();
    final Object d = new Object();

    public interface a {
        void a(ej9 ej9Var);
    }

    public static class b implements Runnable {
        private final mk9 a;
        private final ej9 b;

        b(mk9 mk9Var, ej9 ej9Var) {
            this.a = mk9Var;
            this.b = ej9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.a.d) {
                try {
                    if (((b) this.a.b.remove(this.b)) != null) {
                        a aVar = (a) this.a.c.remove(this.b);
                        if (aVar != null) {
                            aVar.a(this.b);
                        }
                    } else {
                        h94.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.b));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public mk9(i47 i47Var) {
        this.a = i47Var;
    }

    public void a(ej9 ej9Var, long j, a aVar) {
        synchronized (this.d) {
            h94.e().a(e, "Starting timer for " + ej9Var);
            b(ej9Var);
            b bVar = new b(this, ej9Var);
            this.b.put(ej9Var, bVar);
            this.c.put(ej9Var, aVar);
            this.a.b(j, bVar);
        }
    }

    public void b(ej9 ej9Var) {
        synchronized (this.d) {
            try {
                if (((b) this.b.remove(ej9Var)) != null) {
                    h94.e().a(e, "Stopping timer for " + ej9Var);
                    this.c.remove(ej9Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
