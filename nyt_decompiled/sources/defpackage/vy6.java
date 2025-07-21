package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class vy6 {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private final List b = new ArrayList();
    private boolean c;

    public boolean a(ey6 ey6Var) {
        boolean z = true;
        if (ey6Var == null) {
            return true;
        }
        boolean remove = this.a.remove(ey6Var);
        if (!this.b.remove(ey6Var) && !remove) {
            z = false;
        }
        if (z) {
            ey6Var.clear();
        }
        return z;
    }

    public void b() {
        Iterator it2 = x19.i(this.a).iterator();
        while (it2.hasNext()) {
            a((ey6) it2.next());
        }
        this.b.clear();
    }

    public void c() {
        this.c = true;
        for (ey6 ey6Var : x19.i(this.a)) {
            if (ey6Var.isRunning() || ey6Var.g()) {
                ey6Var.clear();
                this.b.add(ey6Var);
            }
        }
    }

    public void d() {
        this.c = true;
        for (ey6 ey6Var : x19.i(this.a)) {
            if (ey6Var.isRunning()) {
                ey6Var.pause();
                this.b.add(ey6Var);
            }
        }
    }

    public void e() {
        for (ey6 ey6Var : x19.i(this.a)) {
            if (!ey6Var.g() && !ey6Var.e()) {
                ey6Var.clear();
                if (this.c) {
                    this.b.add(ey6Var);
                } else {
                    ey6Var.j();
                }
            }
        }
    }

    public void f() {
        this.c = false;
        for (ey6 ey6Var : x19.i(this.a)) {
            if (!ey6Var.g() && !ey6Var.isRunning()) {
                ey6Var.j();
            }
        }
        this.b.clear();
    }

    public void g(ey6 ey6Var) {
        this.a.add(ey6Var);
        if (!this.c) {
            ey6Var.j();
            return;
        }
        ey6Var.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.b.add(ey6Var);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}
