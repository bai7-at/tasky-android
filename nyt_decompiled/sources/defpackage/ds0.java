package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.rh0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ds0 extends View.DragShadowBuilder {
    private final fm1 a;
    private final long b;
    private final ss2 c;

    public /* synthetic */ ds0(fm1 fm1Var, long j, ss2 ss2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(fm1Var, j, ss2Var);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        rh0 rh0Var = new rh0();
        fm1 fm1Var = this.a;
        long j = this.b;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        ph0 b = wd.b(canvas);
        ss2 ss2Var = this.c;
        rh0.a u = rh0Var.u();
        fm1 a = u.a();
        LayoutDirection b2 = u.b();
        ph0 c = u.c();
        long d = u.d();
        rh0.a u2 = rh0Var.u();
        u2.j(fm1Var);
        u2.k(layoutDirection);
        u2.i(b);
        u2.l(j);
        b.t();
        ss2Var.invoke(rh0Var);
        b.k();
        rh0.a u3 = rh0Var.u();
        u3.j(a);
        u3.k(b2);
        u3.i(c);
        u3.l(d);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point point, Point point2) {
        fm1 fm1Var = this.a;
        point.set(fm1Var.l0(fm1Var.X0(zt7.i(this.b))), fm1Var.l0(fm1Var.X0(zt7.g(this.b))));
        point2.set(point.x / 2, point.y / 2);
    }

    private ds0(fm1 fm1Var, long j, ss2 ss2Var) {
        this.a = fm1Var;
        this.b = j;
        this.c = ss2Var;
    }
}
