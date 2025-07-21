package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.graphics.vector.GroupComponent;
import androidx.compose.ui.graphics.vector.PathComponent;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* loaded from: classes.dex */
public abstract class e49 {
    public static final VectorPainter a(VectorPainter vectorPainter, long j, long j2, String str, qn0 qn0Var, boolean z) {
        vectorPainter.x(j);
        vectorPainter.t(z);
        vectorPainter.u(qn0Var);
        vectorPainter.y(j2);
        vectorPainter.w(str);
        return vectorPainter;
    }

    private static final qn0 b(long j, int i) {
        if (j != nn0.b.g()) {
            return qn0.b.a(j, i);
        }
        return null;
    }

    public static final GroupComponent c(GroupComponent groupComponent, b49 b49Var) {
        int t = b49Var.t();
        for (int i = 0; i < t; i++) {
            d49 c = b49Var.c(i);
            if (c instanceof f49) {
                PathComponent pathComponent = new PathComponent();
                f49 f49Var = (f49) c;
                pathComponent.k(f49Var.g());
                pathComponent.l(f49Var.j());
                pathComponent.j(f49Var.f());
                pathComponent.h(f49Var.a());
                pathComponent.i(f49Var.c());
                pathComponent.m(f49Var.n());
                pathComponent.n(f49Var.o());
                pathComponent.r(f49Var.u());
                pathComponent.o(f49Var.p());
                pathComponent.p(f49Var.q());
                pathComponent.q(f49Var.t());
                pathComponent.u(f49Var.x());
                pathComponent.s(f49Var.v());
                pathComponent.t(f49Var.w());
                groupComponent.i(i, pathComponent);
            } else if (c instanceof b49) {
                GroupComponent groupComponent2 = new GroupComponent();
                b49 b49Var2 = (b49) c;
                groupComponent2.p(b49Var2.g());
                groupComponent2.s(b49Var2.o());
                groupComponent2.t(b49Var2.p());
                groupComponent2.u(b49Var2.q());
                groupComponent2.v(b49Var2.u());
                groupComponent2.w(b49Var2.v());
                groupComponent2.q(b49Var2.j());
                groupComponent2.r(b49Var2.n());
                groupComponent2.o(b49Var2.f());
                c(groupComponent2, b49Var2);
                groupComponent.i(i, groupComponent2);
            }
        }
        return groupComponent;
    }

    public static final VectorPainter d(fm1 fm1Var, ch3 ch3Var, GroupComponent groupComponent) {
        long e = e(fm1Var, ch3Var.e(), ch3Var.d());
        return a(new VectorPainter(groupComponent), e, f(e, ch3Var.l(), ch3Var.k()), ch3Var.g(), b(ch3Var.j(), ch3Var.i()), ch3Var.c());
    }

    private static final long e(fm1 fm1Var, float f, float f2) {
        return du7.a(fm1Var.f1(f), fm1Var.f1(f2));
    }

    private static final long f(long j, float f, float f2) {
        if (Float.isNaN(f)) {
            f = zt7.i(j);
        }
        if (Float.isNaN(f2)) {
            f2 = zt7.g(j);
        }
        return du7.a(f, f2);
    }

    public static final VectorPainter g(ch3 ch3Var, Composer composer, int i) {
        composer.z(1413834416);
        if (b.G()) {
            b.S(1413834416, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:168)");
        }
        fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
        Object valueOf = Integer.valueOf(ch3Var.f());
        composer.z(511388516);
        boolean S = composer.S(valueOf) | composer.S(fm1Var);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            GroupComponent groupComponent = new GroupComponent();
            c(groupComponent, ch3Var.h());
            ww8 ww8Var = ww8.a;
            A = d(fm1Var, ch3Var, groupComponent);
            composer.q(A);
        }
        composer.R();
        VectorPainter vectorPainter = (VectorPainter) A;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return vectorPainter;
    }
}
