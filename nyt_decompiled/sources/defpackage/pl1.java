package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class pl1 {
    static final String e = h94.i("DelayedWorkTracker");
    final gb7 a;
    private final i47 b;
    private final zl0 c;
    private final Map d = new HashMap();

    class a implements Runnable {
        final /* synthetic */ dk9 a;

        a(dk9 dk9Var) {
            this.a = dk9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            h94.e().a(pl1.e, "Scheduling work " + this.a.a);
            pl1.this.a.c(this.a);
        }
    }

    public pl1(gb7 gb7Var, i47 i47Var, zl0 zl0Var) {
        this.a = gb7Var;
        this.b = i47Var;
        this.c = zl0Var;
    }

    public void a(dk9 dk9Var, long j) {
        Runnable runnable = (Runnable) this.d.remove(dk9Var.a);
        if (runnable != null) {
            this.b.a(runnable);
        }
        a aVar = new a(dk9Var);
        this.d.put(dk9Var.a, aVar);
        this.b.b(j - this.c.currentTimeMillis(), aVar);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.d.remove(str);
        if (runnable != null) {
            this.b.a(runnable);
        }
    }
}
