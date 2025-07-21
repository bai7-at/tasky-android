package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import defpackage.wp5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class zf implements ip5 {
    private final Path b;
    private RectF c;
    private float[] d;
    private Matrix e;

    public zf(Path path) {
        this.b = path;
    }

    private final boolean b(kt6 kt6Var) {
        if (Float.isNaN(kt6Var.i())) {
            throw new IllegalStateException("Rect.left is NaN");
        }
        if (Float.isNaN(kt6Var.l())) {
            throw new IllegalStateException("Rect.top is NaN");
        }
        if (Float.isNaN(kt6Var.j())) {
            throw new IllegalStateException("Rect.right is NaN");
        }
        if (Float.isNaN(kt6Var.e())) {
            throw new IllegalStateException("Rect.bottom is NaN");
        }
        return true;
    }

    @Override // defpackage.ip5
    public void A(int i) {
        this.b.setFillType(np5.d(i, np5.a.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // defpackage.ip5
    public void C(long j) {
        Matrix matrix = this.e;
        if (matrix == null) {
            this.e = new Matrix();
        } else {
            zq3.e(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.e;
        zq3.e(matrix2);
        matrix2.setTranslate(fd5.o(j), fd5.p(j));
        Path path = this.b;
        Matrix matrix3 = this.e;
        zq3.e(matrix3);
        path.transform(matrix3);
    }

    @Override // defpackage.ip5
    public void D(a37 a37Var) {
        if (this.c == null) {
            this.c = new RectF();
        }
        RectF rectF = this.c;
        zq3.e(rectF);
        rectF.set(a37Var.e(), a37Var.g(), a37Var.f(), a37Var.a());
        if (this.d == null) {
            this.d = new float[8];
        }
        float[] fArr = this.d;
        zq3.e(fArr);
        fArr[0] = f01.d(a37Var.h());
        fArr[1] = f01.e(a37Var.h());
        fArr[2] = f01.d(a37Var.i());
        fArr[3] = f01.e(a37Var.i());
        fArr[4] = f01.d(a37Var.c());
        fArr[5] = f01.e(a37Var.c());
        fArr[6] = f01.d(a37Var.b());
        fArr[7] = f01.e(a37Var.b());
        Path path = this.b;
        RectF rectF2 = this.c;
        zq3.e(rectF2);
        float[] fArr2 = this.d;
        zq3.e(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    @Override // defpackage.ip5
    public void E(kt6 kt6Var) {
        if (!b(kt6Var)) {
            throw new IllegalStateException("invalid rect");
        }
        if (this.c == null) {
            this.c = new RectF();
        }
        RectF rectF = this.c;
        zq3.e(rectF);
        rectF.set(kt6Var.i(), kt6Var.l(), kt6Var.j(), kt6Var.e());
        Path path = this.b;
        RectF rectF2 = this.c;
        zq3.e(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
    }

    @Override // defpackage.ip5
    public int F() {
        return this.b.getFillType() == Path.FillType.EVEN_ODD ? np5.a.a() : np5.a.b();
    }

    @Override // defpackage.ip5
    public boolean G(ip5 ip5Var, ip5 ip5Var2, int i) {
        wp5.a aVar = wp5.a;
        Path.Op op = wp5.f(i, aVar.a()) ? Path.Op.DIFFERENCE : wp5.f(i, aVar.b()) ? Path.Op.INTERSECT : wp5.f(i, aVar.c()) ? Path.Op.REVERSE_DIFFERENCE : wp5.f(i, aVar.d()) ? Path.Op.UNION : Path.Op.XOR;
        Path path = this.b;
        if (!(ip5Var instanceof zf)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path c = ((zf) ip5Var).c();
        if (ip5Var2 instanceof zf) {
            return path.op(c, ((zf) ip5Var2).c(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.ip5
    public void H(float f, float f2) {
        this.b.rLineTo(f, f2);
    }

    @Override // defpackage.ip5
    public void a() {
        this.b.reset();
    }

    public final Path c() {
        return this.b;
    }

    @Override // defpackage.ip5
    public void close() {
        this.b.close();
    }

    @Override // defpackage.ip5
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // defpackage.ip5
    public void q() {
        this.b.rewind();
    }

    @Override // defpackage.ip5
    public void r(float f, float f2) {
        this.b.moveTo(f, f2);
    }

    @Override // defpackage.ip5
    public void s(float f, float f2, float f3, float f4, float f5, float f6) {
        this.b.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.ip5
    public void t(float f, float f2) {
        this.b.lineTo(f, f2);
    }

    @Override // defpackage.ip5
    public kt6 u() {
        if (this.c == null) {
            this.c = new RectF();
        }
        RectF rectF = this.c;
        zq3.e(rectF);
        this.b.computeBounds(rectF, true);
        return new kt6(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // defpackage.ip5
    public void v(float f, float f2) {
        this.b.rMoveTo(f, f2);
    }

    @Override // defpackage.ip5
    public void w(float f, float f2, float f3, float f4, float f5, float f6) {
        this.b.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.ip5
    public void x(float f, float f2, float f3, float f4) {
        this.b.quadTo(f, f2, f3, f4);
    }

    @Override // defpackage.ip5
    public void y(ip5 ip5Var, long j) {
        Path path = this.b;
        if (!(ip5Var instanceof zf)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(((zf) ip5Var).c(), fd5.o(j), fd5.p(j));
    }

    @Override // defpackage.ip5
    public void z(float f, float f2, float f3, float f4) {
        this.b.rQuadTo(f, f2, f3, f4);
    }

    public /* synthetic */ zf(Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Path() : path);
    }
}
