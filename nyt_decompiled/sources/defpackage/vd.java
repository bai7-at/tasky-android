package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* loaded from: classes.dex */
public final class vd implements ph0 {
    private Canvas a;
    private Rect b;
    private Rect c;

    public vd() {
        Canvas canvas;
        canvas = wd.a;
        this.a = canvas;
    }

    public final Region.Op A(int i) {
        return ql0.d(i, ql0.a.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    public final Canvas a() {
        return this.a;
    }

    @Override // defpackage.ph0
    public void b(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, A(i));
    }

    @Override // defpackage.ph0
    public void c(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.ph0
    public void d(ip5 ip5Var, int i) {
        Canvas canvas = this.a;
        if (!(ip5Var instanceof zf)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((zf) ip5Var).c(), A(i));
    }

    @Override // defpackage.ph0
    public void e(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.ph0
    public void g(sf3 sf3Var, long j, long j2, long j3, long j4, ao5 ao5Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap b = AbstractC0565if.b(sf3Var);
        Rect rect = this.b;
        zq3.e(rect);
        rect.left = vm3.j(j);
        rect.top = vm3.k(j);
        rect.right = vm3.j(j) + hn3.g(j2);
        rect.bottom = vm3.k(j) + hn3.f(j2);
        ww8 ww8Var = ww8.a;
        Rect rect2 = this.c;
        zq3.e(rect2);
        rect2.left = vm3.j(j3);
        rect2.top = vm3.k(j3);
        rect2.right = vm3.j(j3) + hn3.g(j4);
        rect2.bottom = vm3.k(j3) + hn3.f(j4);
        canvas.drawBitmap(b, rect, rect2, ao5Var.p());
    }

    @Override // defpackage.ph0
    public void j(float f, float f2, float f3, float f4, float f5, float f6, boolean z, ao5 ao5Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, z, ao5Var.p());
    }

    @Override // defpackage.ph0
    public void k() {
        this.a.restore();
    }

    @Override // defpackage.ph0
    public void l(sf3 sf3Var, long j, ao5 ao5Var) {
        this.a.drawBitmap(AbstractC0565if.b(sf3Var), fd5.o(j), fd5.p(j), ao5Var.p());
    }

    @Override // defpackage.ph0
    public void n() {
        vh0.a.a(this.a, true);
    }

    @Override // defpackage.ph0
    public void p(long j, long j2, ao5 ao5Var) {
        this.a.drawLine(fd5.o(j), fd5.p(j), fd5.o(j2), fd5.p(j2), ao5Var.p());
    }

    @Override // defpackage.ph0
    public void q(float f, float f2, float f3, float f4, float f5, float f6, ao5 ao5Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, ao5Var.p());
    }

    @Override // defpackage.ph0
    public void r(ip5 ip5Var, ao5 ao5Var) {
        Canvas canvas = this.a;
        if (!(ip5Var instanceof zf)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((zf) ip5Var).c(), ao5Var.p());
    }

    @Override // defpackage.ph0
    public void s(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.ph0
    public void t() {
        this.a.save();
    }

    @Override // defpackage.ph0
    public void u() {
        vh0.a.a(this.a, false);
    }

    @Override // defpackage.ph0
    public void v(float[] fArr) {
        if (lg4.c(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        rf.a(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.ph0
    public void w(kt6 kt6Var, ao5 ao5Var) {
        this.a.saveLayer(kt6Var.i(), kt6Var.l(), kt6Var.j(), kt6Var.e(), ao5Var.p(), 31);
    }

    @Override // defpackage.ph0
    public void x(long j, float f, ao5 ao5Var) {
        this.a.drawCircle(fd5.o(j), fd5.p(j), f, ao5Var.p());
    }

    @Override // defpackage.ph0
    public void y(float f, float f2, float f3, float f4, ao5 ao5Var) {
        this.a.drawRect(f, f2, f3, f4, ao5Var.p());
    }

    public final void z(Canvas canvas) {
        this.a = canvas;
    }
}
