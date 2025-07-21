package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public abstract class nu4 {
    private static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static boolean d(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    private static int e(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    static int f(float f, float f2) {
        return g((int) f, (int) f2);
    }

    private static int g(int i, int i2) {
        return i - (i2 * e(i, i2));
    }

    public static void h(so7 so7Var, Path path) {
        path.reset();
        PointF b = so7Var.b();
        path.moveTo(b.x, b.y);
        a.set(b.x, b.y);
        for (int i = 0; i < so7Var.a().size(); i++) {
            w31 w31Var = (w31) so7Var.a().get(i);
            PointF a2 = w31Var.a();
            PointF b2 = w31Var.b();
            PointF c = w31Var.c();
            PointF pointF = a;
            if (a2.equals(pointF) && b2.equals(c)) {
                path.lineTo(c.x, c.y);
            } else {
                path.cubicTo(a2.x, a2.y, b2.x, b2.y, c.x, c.y);
            }
            pointF.set(c.x, c.y);
        }
        if (so7Var.d()) {
            path.close();
        }
    }

    public static float i(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int j(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static void k(gw3 gw3Var, int i, List list, gw3 gw3Var2, iw3 iw3Var) {
        if (gw3Var.c(iw3Var.getName(), i)) {
            list.add(gw3Var2.a(iw3Var.getName()).i(iw3Var));
        }
    }
}
