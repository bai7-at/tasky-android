package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import defpackage.hy5;
import defpackage.lx5;
import defpackage.nx5;
import defpackage.pq3;
import defpackage.vx5;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    private final List a;
    private final pq3 b;
    private final int c;
    private final int d;
    private int e;

    public c(List list, pq3 pq3Var) {
        this.a = list;
        this.b = pq3Var;
        MotionEvent e = e();
        this.c = lx5.a(e != null ? e.getButtonState() : 0);
        MotionEvent e2 = e();
        this.d = hy5.b(e2 != null ? e2.getMetaState() : 0);
        this.e = a();
    }

    private final int a() {
        MotionEvent e = e();
        if (e != null) {
            int actionMasked = e.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                        }
                        return d.a.d();
                    }
                    return d.a.c();
                }
                return d.a.e();
            }
            return d.a.d();
        }
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vx5 vx5Var = (vx5) list.get(i);
            if (nx5.d(vx5Var)) {
                return d.a.e();
            }
            if (nx5.b(vx5Var)) {
                return d.a.d();
            }
        }
        return d.a.c();
    }

    public final int b() {
        return this.c;
    }

    public final List c() {
        return this.a;
    }

    public final pq3 d() {
        return this.b;
    }

    public final MotionEvent e() {
        pq3 pq3Var = this.b;
        if (pq3Var != null) {
            return pq3Var.b();
        }
        return null;
    }

    public final int f() {
        return this.e;
    }

    public final void g(int i) {
        this.e = i;
    }

    public c(List list) {
        this(list, null);
    }
}
