package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class so7 {
    private final List a;
    private PointF b;
    private boolean c;

    public so7(PointF pointF, boolean z, List list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public List a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(so7 so7Var, so7 so7Var2, float f) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.c = so7Var.d() || so7Var2.d();
        if (so7Var.a().size() != so7Var2.a().size()) {
            j94.c("Curves must have the same number of control points. Shape 1: " + so7Var.a().size() + "\tShape 2: " + so7Var2.a().size());
        }
        int min = Math.min(so7Var.a().size(), so7Var2.a().size());
        if (this.a.size() < min) {
            for (int size = this.a.size(); size < min; size++) {
                this.a.add(new w31());
            }
        } else if (this.a.size() > min) {
            for (int size2 = this.a.size() - 1; size2 >= min; size2--) {
                List list = this.a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = so7Var.b();
        PointF b2 = so7Var2.b();
        f(nu4.i(b.x, b2.x, f), nu4.i(b.y, b2.y, f));
        for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
            w31 w31Var = (w31) so7Var.a().get(size3);
            w31 w31Var2 = (w31) so7Var2.a().get(size3);
            PointF a = w31Var.a();
            PointF b3 = w31Var.b();
            PointF c = w31Var.c();
            PointF a2 = w31Var2.a();
            PointF b4 = w31Var2.b();
            PointF c2 = w31Var2.c();
            ((w31) this.a.get(size3)).d(nu4.i(a.x, a2.x, f), nu4.i(a.y, a2.y, f));
            ((w31) this.a.get(size3)).e(nu4.i(b3.x, b4.x, f), nu4.i(b3.y, b4.y, f));
            ((w31) this.a.get(size3)).f(nu4.i(c.x, c2.x, f), nu4.i(c.y, c2.y, f));
        }
    }

    public boolean d() {
        return this.c;
    }

    public void e(boolean z) {
        this.c = z;
    }

    public void f(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.c + '}';
    }

    public so7() {
        this.a = new ArrayList();
    }
}
