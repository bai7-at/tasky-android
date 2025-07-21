package defpackage;

import com.datadog.opentracing.a;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class zx0 implements ac7 {
    static final ThreadLocal e = new ThreadLocal();
    final Deque a = new LinkedList();
    final List b = new CopyOnWriteArrayList();
    private final int c;
    private final x51 d;

    public zx0(int i, x51 x51Var) {
        this.c = i;
        this.d = x51Var;
    }

    public yb7 a(tx7 tx7Var, boolean z) {
        yb7 b = b();
        if (b instanceof v51) {
            if (this.c <= ((v51) b).d0()) {
                return m85.C;
            }
        }
        synchronized (this.a) {
            Iterator it2 = this.a.iterator();
            if (it2.hasNext()) {
                lh4.a(it2.next());
                throw null;
            }
        }
        return tx7Var instanceof a ? new ay0(this, (a) tx7Var, z, this.d) : new qs7(this, tx7Var, z);
    }

    public yb7 b() {
        synchronized (this.a) {
            Iterator it2 = this.a.iterator();
            if (it2.hasNext()) {
                lh4.a(it2.next());
                throw null;
            }
        }
        return (yb7) e.get();
    }

    public void c(zb7 zb7Var) {
        this.b.add(zb7Var);
    }

    @Override // defpackage.ac7
    public tx7 n() {
        synchronized (this.a) {
            Iterator it2 = this.a.iterator();
            if (it2.hasNext()) {
                lh4.a(it2.next());
                throw null;
            }
        }
        v51 v51Var = (v51) e.get();
        if (v51Var == null) {
            return null;
        }
        return v51Var.b1();
    }

    @Override // defpackage.ac7
    public yb7 o(tx7 tx7Var) {
        return a(tx7Var, false);
    }
}
