package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import defpackage.cp7;
import defpackage.oo7;
import defpackage.po7;
import java.util.BitSet;

/* loaded from: classes3.dex */
public class uf4 extends Drawable implements ip7 {
    private static final String L = "uf4";
    private static final Paint M;
    private final RectF B;
    private boolean H;
    private c a;
    private final cp7.g[] b;
    private final cp7.g[] c;
    private final BitSet d;
    private boolean e;
    private final Matrix f;
    private final Path g;
    private final Path h;
    private final RectF i;
    private final RectF j;
    private final Region k;
    private final Region l;
    private oo7 m;
    private final Paint n;
    private final Paint r;
    private final lo7 s;
    private final po7.b t;
    private final po7 u;
    private PorterDuffColorFilter w;
    private PorterDuffColorFilter x;
    private int y;

    class a implements po7.b {
        a() {
        }

        @Override // po7.b
        public void a(cp7 cp7Var, Matrix matrix, int i) {
            uf4.this.d.set(i + 4, cp7Var.e());
            uf4.this.c[i] = cp7Var.f(matrix);
        }

        @Override // po7.b
        public void b(cp7 cp7Var, Matrix matrix, int i) {
            uf4.this.d.set(i, cp7Var.e());
            uf4.this.b[i] = cp7Var.f(matrix);
        }
    }

    class b implements oo7.c {
        final /* synthetic */ float a;

        b(float f) {
            this.a = f;
        }

        @Override // oo7.c
        public h01 a(h01 h01Var) {
            return h01Var instanceof hv6 ? h01Var : new f9(this.a, h01Var);
        }
    }

    static {
        Paint paint = new Paint(1);
        M = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public uf4() {
        this(new oo7());
    }

    private float D() {
        if (L()) {
            return this.r.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean J() {
        c cVar = this.a;
        int i = cVar.q;
        return i != 1 && cVar.r > 0 && (i == 2 || T());
    }

    private boolean K() {
        Paint.Style style = this.a.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean L() {
        Paint.Style style = this.a.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.r.getStrokeWidth() > 0.0f;
    }

    private void N() {
        super.invalidateSelf();
    }

    private void Q(Canvas canvas) {
        if (J()) {
            canvas.save();
            S(canvas);
            if (!this.H) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.B.width() - getBounds().width());
            int height = (int) (this.B.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.B.width()) + (this.a.r * 2) + width, ((int) this.B.height()) + (this.a.r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.a.r) - width;
            float f2 = (getBounds().top - this.a.r) - height;
            canvas2.translate(-f, -f2);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    private static int R(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private void S(Canvas canvas) {
        canvas.translate(z(), A());
    }

    private PorterDuffColorFilter f(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int l = l(color);
        this.y = l;
        if (l != color) {
            return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.a.j != 1.0f) {
            this.f.reset();
            Matrix matrix = this.f;
            float f = this.a.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f);
        }
        path.computeBounds(this.B, true);
    }

    private boolean g0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.a.d == null || color2 == (colorForState2 = this.a.d.getColorForState(iArr, (color2 = this.n.getColor())))) {
            z = false;
        } else {
            this.n.setColor(colorForState2);
            z = true;
        }
        if (this.a.e == null || color == (colorForState = this.a.e.getColorForState(iArr, (color = this.r.getColor())))) {
            return z;
        }
        this.r.setColor(colorForState);
        return true;
    }

    private boolean h0() {
        PorterDuffColorFilter porterDuffColorFilter = this.w;
        PorterDuffColorFilter porterDuffColorFilter2 = this.x;
        c cVar = this.a;
        this.w = k(cVar.g, cVar.h, this.n, true);
        c cVar2 = this.a;
        this.x = k(cVar2.f, cVar2.h, this.r, false);
        c cVar3 = this.a;
        if (cVar3.u) {
            this.s.d(cVar3.g.getColorForState(getState(), 0));
        }
        return (ic5.a(porterDuffColorFilter, this.w) && ic5.a(porterDuffColorFilter2, this.x)) ? false : true;
    }

    private void i() {
        oo7 y = C().y(new b(-D()));
        this.m = y;
        this.u.e(y, this.a.k, t(), this.h);
    }

    private void i0() {
        float I = I();
        this.a.r = (int) Math.ceil(0.75f * I);
        this.a.s = (int) Math.ceil(I * 0.25f);
        h0();
        N();
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        this.y = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? f(paint, z) : j(colorStateList, mode, z);
    }

    public static uf4 m(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(qf4.c(context, lc6.colorSurface, uf4.class.getSimpleName()));
        }
        uf4 uf4Var = new uf4();
        uf4Var.M(context);
        uf4Var.W(colorStateList);
        uf4Var.V(f);
        return uf4Var;
    }

    private void n(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w(L, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.a.s != 0) {
            canvas.drawPath(this.g, this.s.c());
        }
        for (int i = 0; i < 4; i++) {
            this.b[i].a(this.s, this.a.r, canvas);
            this.c[i].a(this.s, this.a.r, canvas);
        }
        if (this.H) {
            int z = z();
            int A = A();
            canvas.translate(-z, -A);
            canvas.drawPath(this.g, M);
            canvas.translate(z, A);
        }
    }

    private void o(Canvas canvas) {
        p(canvas, this.n, this.g, this.a.a, s());
    }

    private void p(Canvas canvas, Paint paint, Path path, oo7 oo7Var, RectF rectF) {
        if (!oo7Var.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = oo7Var.t().a(rectF) * this.a.k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    private RectF t() {
        this.j.set(s());
        float D = D();
        this.j.inset(D, D);
        return this.j;
    }

    public int A() {
        c cVar = this.a;
        return (int) (cVar.s * Math.cos(Math.toRadians(cVar.t)));
    }

    public int B() {
        return this.a.r;
    }

    public oo7 C() {
        return this.a.a;
    }

    public ColorStateList E() {
        return this.a.g;
    }

    public float F() {
        return this.a.a.r().a(s());
    }

    public float G() {
        return this.a.a.t().a(s());
    }

    public float H() {
        return this.a.p;
    }

    public float I() {
        return u() + H();
    }

    public void M(Context context) {
        this.a.b = new az1(context);
        i0();
    }

    public boolean O() {
        az1 az1Var = this.a.b;
        return az1Var != null && az1Var.e();
    }

    public boolean P() {
        return this.a.a.u(s());
    }

    public boolean T() {
        if (P()) {
            return false;
        }
        this.g.isConvex();
        return false;
    }

    public void U(h01 h01Var) {
        setShapeAppearanceModel(this.a.a.x(h01Var));
    }

    public void V(float f) {
        c cVar = this.a;
        if (cVar.o != f) {
            cVar.o = f;
            i0();
        }
    }

    public void W(ColorStateList colorStateList) {
        c cVar = this.a;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void X(float f) {
        c cVar = this.a;
        if (cVar.k != f) {
            cVar.k = f;
            this.e = true;
            invalidateSelf();
        }
    }

    public void Y(int i, int i2, int i3, int i4) {
        c cVar = this.a;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.a.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void Z(Paint.Style style) {
        this.a.v = style;
        N();
    }

    public void a0(float f) {
        c cVar = this.a;
        if (cVar.n != f) {
            cVar.n = f;
            i0();
        }
    }

    public void b0(int i) {
        c cVar = this.a;
        if (cVar.q != i) {
            cVar.q = i;
            N();
        }
    }

    public void c0(float f, int i) {
        f0(f);
        e0(ColorStateList.valueOf(i));
    }

    public void d0(float f, ColorStateList colorStateList) {
        f0(f);
        e0(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.n.setColorFilter(this.w);
        int alpha = this.n.getAlpha();
        this.n.setAlpha(R(alpha, this.a.m));
        this.r.setColorFilter(this.x);
        this.r.setStrokeWidth(this.a.l);
        int alpha2 = this.r.getAlpha();
        this.r.setAlpha(R(alpha2, this.a.m));
        if (this.e) {
            i();
            g(s(), this.g);
            this.e = false;
        }
        Q(canvas);
        if (K()) {
            o(canvas);
        }
        if (L()) {
            r(canvas);
        }
        this.n.setAlpha(alpha);
        this.r.setAlpha(alpha2);
    }

    public void e0(ColorStateList colorStateList) {
        c cVar = this.a;
        if (cVar.e != colorStateList) {
            cVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public void f0(float f) {
        this.a.l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.a.q == 2) {
            return;
        }
        if (P()) {
            outline.setRoundRect(getBounds(), F() * this.a.k);
        } else {
            g(s(), this.g);
            tv1.i(outline, this.g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.a.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.k.set(getBounds());
        g(s(), this.g);
        this.l.setPath(this.g, this.k);
        this.k.op(this.l, Region.Op.DIFFERENCE);
        return this.k;
    }

    protected final void h(RectF rectF, Path path) {
        po7 po7Var = this.u;
        c cVar = this.a;
        po7Var.d(cVar.a, cVar.k, rectF, this.t, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.a.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.a.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.a.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.a.d) != null && colorStateList4.isStateful())));
    }

    protected int l(int i) {
        float I = I() + x();
        az1 az1Var = this.a.b;
        return az1Var != null ? az1Var.c(i, I) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.a = new c(this.a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, zh8.b
    protected boolean onStateChange(int[] iArr) {
        boolean z = g0(iArr) || h0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    protected void q(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.a.a, rectF);
    }

    protected void r(Canvas canvas) {
        p(canvas, this.r, this.h, this.m, t());
    }

    protected RectF s() {
        this.i.set(getBounds());
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.a;
        if (cVar.m != i) {
            cVar.m = i;
            N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.c = colorFilter;
        N();
    }

    @Override // defpackage.ip7
    public void setShapeAppearanceModel(oo7 oo7Var) {
        this.a.a = oo7Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.g = colorStateList;
        h0();
        N();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.a;
        if (cVar.h != mode) {
            cVar.h = mode;
            h0();
            N();
        }
    }

    public float u() {
        return this.a.o;
    }

    public ColorStateList v() {
        return this.a.d;
    }

    public float w() {
        return this.a.k;
    }

    public float x() {
        return this.a.n;
    }

    public int y() {
        return this.y;
    }

    public int z() {
        c cVar = this.a;
        return (int) (cVar.s * Math.sin(Math.toRadians(cVar.t)));
    }

    public uf4(Context context, AttributeSet attributeSet, int i, int i2) {
        this(oo7.e(context, attributeSet, i, i2).m());
    }

    public uf4(oo7 oo7Var) {
        this(new c(oo7Var, null));
    }

    protected uf4(c cVar) {
        po7 po7Var;
        this.b = new cp7.g[4];
        this.c = new cp7.g[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = new lo7();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            po7Var = po7.k();
        } else {
            po7Var = new po7();
        }
        this.u = po7Var;
        this.B = new RectF();
        this.H = true;
        this.a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        h0();
        g0(getState());
        this.t = new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class c extends Drawable.ConstantState {
        oo7 a;
        az1 b;
        ColorFilter c;
        ColorStateList d;
        ColorStateList e;
        ColorStateList f;
        ColorStateList g;
        PorterDuff.Mode h;
        Rect i;
        float j;
        float k;
        float l;
        int m;
        float n;
        float o;
        float p;
        int q;
        int r;
        int s;
        int t;
        boolean u;
        Paint.Style v;

        public c(oo7 oo7Var, az1 az1Var) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = oo7Var;
            this.b = az1Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            uf4 uf4Var = new uf4(this);
            uf4Var.e = true;
            return uf4Var;
        }

        public c(c cVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = cVar.a;
            this.b = cVar.b;
            this.l = cVar.l;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.h = cVar.h;
            this.g = cVar.g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.k = cVar.k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f = cVar.f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }
    }
}
