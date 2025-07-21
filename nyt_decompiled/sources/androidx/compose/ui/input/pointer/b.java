package androidx.compose.ui.input.pointer;

import defpackage.cz3;
import defpackage.lb4;
import defpackage.pq3;
import defpackage.vy4;

/* loaded from: classes.dex */
public class b {
    public static final int b = vy4.d;
    private final vy4 a = new vy4(new a[16], 0);

    public boolean a(lb4 lb4Var, cz3 cz3Var, pq3 pq3Var, boolean z) {
        vy4 vy4Var = this.a;
        int q = vy4Var.q();
        if (q <= 0) {
            return false;
        }
        Object[] p = vy4Var.p();
        int i = 0;
        boolean z2 = false;
        do {
            z2 = ((a) p[i]).a(lb4Var, cz3Var, pq3Var, z) || z2;
            i++;
        } while (i < q);
        return z2;
    }

    public void b(pq3 pq3Var) {
        int q = this.a.q();
        while (true) {
            q--;
            if (-1 >= q) {
                return;
            }
            if (((a) this.a.p()[q]).k().g()) {
                this.a.y(q);
            }
        }
    }

    public final void c() {
        this.a.h();
    }

    public void d() {
        vy4 vy4Var = this.a;
        int q = vy4Var.q();
        if (q > 0) {
            Object[] p = vy4Var.p();
            int i = 0;
            do {
                ((a) p[i]).d();
                i++;
            } while (i < q);
        }
    }

    public boolean e(pq3 pq3Var) {
        vy4 vy4Var = this.a;
        int q = vy4Var.q();
        boolean z = false;
        if (q > 0) {
            Object[] p = vy4Var.p();
            int i = 0;
            boolean z2 = false;
            do {
                z2 = ((a) p[i]).e(pq3Var) || z2;
                i++;
            } while (i < q);
            z = z2;
        }
        b(pq3Var);
        return z;
    }

    public boolean f(lb4 lb4Var, cz3 cz3Var, pq3 pq3Var, boolean z) {
        vy4 vy4Var = this.a;
        int q = vy4Var.q();
        if (q <= 0) {
            return false;
        }
        Object[] p = vy4Var.p();
        int i = 0;
        boolean z2 = false;
        do {
            z2 = ((a) p[i]).f(lb4Var, cz3Var, pq3Var, z) || z2;
            i++;
        } while (i < q);
        return z2;
    }

    public final vy4 g() {
        return this.a;
    }

    public final void h() {
        int i = 0;
        while (i < this.a.q()) {
            a aVar = (a) this.a.p()[i];
            if (aVar.j().L1()) {
                i++;
                aVar.h();
            } else {
                this.a.y(i);
                aVar.d();
            }
        }
    }
}
