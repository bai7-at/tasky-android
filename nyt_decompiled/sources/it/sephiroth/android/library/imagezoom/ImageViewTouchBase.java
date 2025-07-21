package it.sephiroth.android.library.imagezoom;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import defpackage.ia2;

/* loaded from: classes5.dex */
public abstract class ImageViewTouchBase extends ImageView {
    protected static boolean N;
    protected PointF B;
    protected RectF H;
    protected RectF L;
    private Animator M;
    protected Matrix a;
    protected Matrix b;
    protected Matrix c;
    protected Runnable d;
    protected boolean e;
    protected float f;
    protected float g;
    protected boolean h;
    protected boolean i;
    protected final Matrix j;
    protected final float[] k;
    protected DisplayType l;
    protected boolean m;
    protected boolean n;
    protected int r;
    protected int s;
    protected int t;
    protected PointF u;
    protected RectF w;
    protected RectF x;
    protected RectF y;

    public enum DisplayType {
        NONE,
        FIT_TO_SCREEN,
        FIT_IF_BIGGER,
        FIT_HEIGHT,
        FIT_WIDTH
    }

    class a implements Runnable {
        final /* synthetic */ Drawable a;
        final /* synthetic */ Matrix b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;

        a(Drawable drawable, Matrix matrix, float f, float f2) {
            this.a = drawable;
            this.b = matrix;
            this.c = f;
            this.d = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageViewTouchBase.this.B(this.a, this.b, this.c, this.d);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        float a = 0.0f;
        float b = 0.0f;
        final /* synthetic */ ValueAnimator c;
        final /* synthetic */ ValueAnimator d;

        b(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
            this.c = valueAnimator;
            this.d = valueAnimator2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) this.c.getAnimatedValue()).floatValue();
            float floatValue2 = ((Float) this.d.getAnimatedValue()).floatValue();
            ImageViewTouchBase.this.u(floatValue - this.a, floatValue2 - this.b);
            this.a = floatValue;
            this.b = floatValue2;
            ImageViewTouchBase.this.postInvalidateOnAnimation();
        }
    }

    class c implements Animator.AnimatorListener {
        c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ImageViewTouchBase imageViewTouchBase = ImageViewTouchBase.this;
            RectF g = imageViewTouchBase.g(imageViewTouchBase.b, true, true);
            float f = g.left;
            if (f == 0.0f && g.top == 0.0f) {
                return;
            }
            ImageViewTouchBase.this.y(f, g.top);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ float a;
        final /* synthetic */ float b;

        d(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageViewTouchBase.this.H(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a, this.b);
            ImageViewTouchBase.this.postInvalidateOnAnimation();
        }
    }

    public interface e {
    }

    public interface f {
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void A(Bitmap bitmap, Matrix matrix, float f2, float f3) {
        if (bitmap != null) {
            B(new ia2(bitmap), matrix, f2, f3);
        } else {
            B(null, matrix, f2, f3);
        }
    }

    public void B(Drawable drawable, Matrix matrix, float f2, float f3) {
        if (getWidth() <= 0) {
            this.d = new a(drawable, matrix, f2, f3);
        } else {
            C(drawable, matrix, f2, f3);
        }
    }

    protected void C(Drawable drawable, Matrix matrix, float f2, float f3) {
        this.a.reset();
        super.setImageDrawable(drawable);
        if (f2 == -1.0f || f3 == -1.0f) {
            this.g = -1.0f;
            this.f = -1.0f;
            this.i = false;
            this.h = false;
        } else {
            float min = Math.min(f2, f3);
            float max = Math.max(min, f3);
            this.g = min;
            this.f = max;
            this.i = true;
            this.h = true;
            if (getDisplayType() == DisplayType.FIT_TO_SCREEN || getDisplayType() == DisplayType.FIT_IF_BIGGER) {
                if (this.g >= 1.0f) {
                    this.i = false;
                    this.g = -1.0f;
                }
                if (this.f <= 1.0f) {
                    this.h = true;
                    this.f = -1.0f;
                }
            }
        }
        if (matrix != null) {
            this.c = new Matrix(matrix);
        }
        if (N) {
            Log.v("ImageViewTouchBase", "mMinZoom: " + this.g + ", mMaxZoom: " + this.f);
        }
        this.n = true;
        E(drawable);
        requestLayout();
    }

    protected void D() {
        Animator animator = this.M;
        if (animator != null) {
            animator.cancel();
            this.M = null;
        }
    }

    protected void E(Drawable drawable) {
        if (drawable != null) {
            this.w.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            this.w.setEmpty();
        }
    }

    protected void F(RectF rectF, PointF pointF) {
    }

    protected void G(float f2) {
        if (N) {
            Log.i("ImageViewTouchBase", "zoomTo: " + f2);
        }
        if (f2 > getMaxScale()) {
            f2 = getMaxScale();
        }
        if (f2 < getMinScale()) {
            f2 = getMinScale();
        }
        if (N) {
            Log.d("ImageViewTouchBase", "sanitized scale: " + f2);
        }
        PointF center = getCenter();
        H(f2, center.x, center.y);
    }

    protected void H(float f2, float f3, float f4) {
        if (f2 > getMaxScale()) {
            f2 = getMaxScale();
        }
        v(f2 / getScale(), f3, f4);
        t(getScale());
        a(true, true);
    }

    protected void I(float f2, float f3, float f4, long j) {
        if (f2 > getMaxScale()) {
            f2 = getMaxScale();
        }
        float scale = getScale();
        Matrix matrix = new Matrix(this.b);
        matrix.postScale(f2, f2, f3, f4);
        RectF g = g(matrix, true, true);
        float f5 = f3 + (g.left * f2);
        float f6 = f4 + (g.top * f2);
        D();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(scale, f2);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new d(f5, f6));
        ofFloat.start();
    }

    public void J(float f2, long j) {
        PointF center = getCenter();
        I(f2, center.x, center.y, j);
    }

    protected void a(boolean z, boolean z2) {
        if (getDrawable() == null) {
            return;
        }
        RectF g = g(this.b, z, z2);
        float f2 = g.left;
        if (f2 == 0.0f && g.top == 0.0f) {
            return;
        }
        w(f2, g.top);
    }

    protected float b() {
        if (getDrawable() == null) {
            return 1.0f;
        }
        float max = Math.max(this.w.width() / this.H.width(), this.w.height() / this.H.height()) * 4.0f;
        if (N) {
            Log.i("ImageViewTouchBase", "computeMaxZoom: " + max);
        }
        return max;
    }

    protected float c() {
        if (N) {
            Log.i("ImageViewTouchBase", "computeMinZoom");
        }
        if (getDrawable() == null) {
            return 1.0f;
        }
        float min = Math.min(1.0f, 1.0f / k(this.a));
        if (N) {
            Log.i("ImageViewTouchBase", "computeMinZoom: " + min);
        }
        return min;
    }

    protected void d(Drawable drawable) {
    }

    protected void e(int i, int i2, int i3, int i4) {
    }

    protected RectF f(Matrix matrix) {
        i(matrix).mapRect(this.x, this.w);
        return this.x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r7 < r8) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected android.graphics.RectF g(android.graphics.Matrix r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            r1 = 0
            if (r0 != 0) goto Ld
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r1, r1, r1, r1)
            return r6
        Ld:
            android.graphics.RectF r0 = r6.y
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r7 = r6.f(r7)
            float r0 = r7.height()
            float r2 = r7.width()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r9 == 0) goto L55
            android.graphics.RectF r9 = r6.H
            float r9 = r9.height()
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 >= 0) goto L3d
            android.graphics.RectF r9 = r6.H
            float r9 = r9.height()
            float r9 = r9 - r0
            float r9 = r9 / r3
            float r0 = r7.top
            android.graphics.RectF r4 = r6.H
            float r4 = r4.top
            float r0 = r0 - r4
            float r9 = r9 - r0
            goto L56
        L3d:
            float r9 = r7.top
            android.graphics.RectF r0 = r6.H
            float r4 = r0.top
            int r5 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r5 <= 0) goto L4a
            float r9 = r9 - r4
            float r9 = -r9
            goto L56
        L4a:
            float r9 = r7.bottom
            float r0 = r0.bottom
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 >= 0) goto L55
            float r9 = r0 - r9
            goto L56
        L55:
            r9 = r1
        L56:
            if (r8 == 0) goto L89
            android.graphics.RectF r8 = r6.H
            float r8 = r8.width()
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 >= 0) goto L73
            android.graphics.RectF r8 = r6.H
            float r8 = r8.width()
            float r8 = r8 - r2
            float r8 = r8 / r3
            float r7 = r7.left
            android.graphics.RectF r0 = r6.H
            float r0 = r0.left
            float r7 = r7 - r0
        L71:
            float r8 = r8 - r7
            goto L8a
        L73:
            float r8 = r7.left
            android.graphics.RectF r0 = r6.H
            float r2 = r0.left
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L80
            float r8 = r8 - r2
            float r8 = -r8
            goto L8a
        L80:
            float r7 = r7.right
            float r8 = r0.right
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 >= 0) goto L89
            goto L71
        L89:
            r8 = r1
        L8a:
            android.graphics.RectF r7 = r6.y
            r7.set(r8, r9, r1, r1)
            android.graphics.RectF r6 = r6.y
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.imagezoom.ImageViewTouchBase.g(android.graphics.Matrix, boolean, boolean):android.graphics.RectF");
    }

    public float getBaseScale() {
        return k(this.a);
    }

    public boolean getBitmapChanged() {
        return this.n;
    }

    public RectF getBitmapRect() {
        return f(this.b);
    }

    protected PointF getCenter() {
        return this.u;
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.b);
    }

    public DisplayType getDisplayType() {
        return this.l;
    }

    public Matrix getImageViewMatrix() {
        return i(this.b);
    }

    public float getMaxScale() {
        if (this.f == -1.0f) {
            this.f = b();
        }
        return this.f;
    }

    public float getMinScale() {
        if (N) {
            Log.i("ImageViewTouchBase", "getMinScale, mMinZoom: " + this.g);
        }
        if (this.g == -1.0f) {
            this.g = c();
        }
        if (N) {
            Log.v("ImageViewTouchBase", "mMinZoom: " + this.g);
        }
        return this.g;
    }

    @Override // android.view.View
    @SuppressLint({"Override"})
    public float getRotation() {
        return 0.0f;
    }

    public float getScale() {
        return k(this.b);
    }

    protected float h(DisplayType displayType) {
        float width;
        float m;
        float width2;
        if (displayType == DisplayType.FIT_TO_SCREEN) {
            return 1.0f;
        }
        if (displayType == DisplayType.FIT_IF_BIGGER) {
            return Math.min(1.0f, 1.0f / k(this.a));
        }
        if (displayType == DisplayType.FIT_HEIGHT) {
            width = getHeight();
            m = n(this.a);
            width2 = this.w.height();
        } else {
            if (displayType != DisplayType.FIT_WIDTH) {
                return 1.0f / k(this.a);
            }
            width = getWidth();
            m = m(this.a);
            width2 = this.w.width();
        }
        return width / (m * width2);
    }

    public Matrix i(Matrix matrix) {
        this.j.set(this.a);
        this.j.postConcat(matrix);
        return this.j;
    }

    protected void j(Drawable drawable, Matrix matrix, RectF rectF) {
        float width = this.w.width();
        float height = this.w.height();
        matrix.reset();
        float min = Math.min(rectF.width() / width, rectF.height() / height);
        matrix.postScale(min, min);
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.postTranslate((rectF.width() - (width * min)) / 2.0f, (rectF.height() - (height * min)) / 2.0f);
        x(matrix);
    }

    protected float k(Matrix matrix) {
        return l(matrix, 0);
    }

    protected float l(Matrix matrix, int i) {
        matrix.getValues(this.k);
        return this.k[i];
    }

    protected float m(Matrix matrix) {
        return l(matrix, 0);
    }

    protected float n(Matrix matrix) {
        return l(matrix, 4);
    }

    protected void o(Context context, AttributeSet attributeSet, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.t = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r = getResources().getInteger(R.integer.config_shortAnimTime);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (N) {
            Log.i("ImageViewTouchBase", "onConfigurationChanged. scale: " + getScale() + ", minScale: " + getMinScale() + ", mUserScaled: " + this.e);
        }
        if (this.e) {
            this.e = Math.abs(getScale() - getMinScale()) > 0.1f;
        }
        if (N) {
            Log.v("ImageViewTouchBase", "mUserScaled: " + this.e);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (getScaleType() != ImageView.ScaleType.FIT_XY) {
            super.onDraw(canvas);
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        boolean z2;
        float h;
        float f4;
        boolean z3;
        float f5;
        if (N) {
            Log.e("ImageViewTouchBase", "onLayout: " + z + ", bitmapChanged: " + this.n + ", scaleChanged: " + this.m);
        }
        if (z) {
            this.L.set(this.H);
            s(i, i2, i3, i4);
            f2 = this.H.width() - this.L.width();
            f3 = this.H.height() - this.L.height();
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.d;
        if (runnable != null) {
            this.d = null;
            runnable.run();
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            if (this.n) {
                p(drawable);
            }
            if (z || this.n || this.m) {
                r(i, i2, i3, i4);
            }
            if (this.n) {
                z2 = false;
                this.n = false;
            } else {
                z2 = false;
            }
            if (this.m) {
                this.m = z2;
                return;
            }
            return;
        }
        if (z || this.m || this.n) {
            if (this.n) {
                this.e = false;
                this.a.reset();
                if (!this.i) {
                    this.g = -1.0f;
                }
                if (!this.h) {
                    this.f = -1.0f;
                }
            }
            float h2 = h(getDisplayType());
            float k = k(this.a);
            float scale = getScale();
            float min = Math.min(1.0f, 1.0f / k);
            j(drawable, this.a, this.H);
            float k2 = k(this.a);
            if (N) {
                Log.d("ImageViewTouchBase", "old matrix scale: " + k);
                Log.d("ImageViewTouchBase", "new matrix scale: " + k2);
                Log.d("ImageViewTouchBase", "old min scale: " + min);
                Log.d("ImageViewTouchBase", "old scale: " + scale);
            }
            if (this.n || this.m) {
                if (N) {
                    Log.d("ImageViewTouchBase", "display type: " + getDisplayType());
                    Log.d("ImageViewTouchBase", "newMatrix: " + this.c);
                }
                Matrix matrix = this.c;
                if (matrix != null) {
                    this.b.set(matrix);
                    this.c = null;
                    h = getScale();
                } else {
                    this.b.reset();
                    h = h(getDisplayType());
                }
                f4 = h;
                setImageMatrix(getImageViewMatrix());
                if (f4 != getScale()) {
                    if (N) {
                        Log.v("ImageViewTouchBase", "scale != getScale: " + f4 + " != " + getScale());
                    }
                    G(f4);
                }
            } else if (z) {
                if (this.i) {
                    f5 = -1.0f;
                } else {
                    f5 = -1.0f;
                    this.g = -1.0f;
                }
                if (!this.h) {
                    this.f = f5;
                }
                setImageMatrix(getImageViewMatrix());
                w(-f2, -f3);
                if (this.e) {
                    f4 = Math.abs(scale - min) > 0.1f ? (k / k2) * scale : 1.0f;
                    if (N) {
                        Log.v("ImageViewTouchBase", "userScaled. scale=" + f4);
                    }
                    G(f4);
                } else {
                    float h3 = h(getDisplayType());
                    if (N) {
                        Log.v("ImageViewTouchBase", "!userScaled. scale=" + h3);
                    }
                    G(h3);
                    f4 = h3;
                }
                if (N) {
                    Log.d("ImageViewTouchBase", "old min scale: " + h2);
                    Log.d("ImageViewTouchBase", "old scale: " + scale);
                    Log.d("ImageViewTouchBase", "new scale: " + f4);
                }
            } else {
                f4 = 1.0f;
            }
            if (f4 > getMaxScale() || f4 < getMinScale()) {
                G(f4);
            }
            a(true, true);
            if (this.n) {
                p(drawable);
            }
            if (z || this.n || this.m) {
                r(i, i2, i3, i4);
            }
            if (this.m) {
                z3 = false;
                this.m = false;
            } else {
                z3 = false;
            }
            if (this.n) {
                this.n = z3;
            }
            if (N) {
                Log.d("ImageViewTouchBase", "scale: " + getScale() + ", minScale: " + getMinScale() + ", maxScale: " + getMaxScale());
            }
        }
    }

    protected void p(Drawable drawable) {
        if (N) {
            Log.i("ImageViewTouchBase", "onDrawableChanged");
            Log.v("ImageViewTouchBase", "scale: " + getScale() + ", minScale: " + getMinScale());
        }
        d(drawable);
    }

    protected void q() {
    }

    protected void r(int i, int i2, int i3, int i4) {
        if (N) {
            Log.i("ImageViewTouchBase", "onLayoutChanged");
        }
        e(i, i2, i3, i4);
    }

    protected void s(float f2, float f3, float f4, float f5) {
        this.H.set(f2, f3, f4, f5);
        this.u.x = this.H.centerX();
        this.u.y = this.H.centerY();
    }

    public void setDisplayType(DisplayType displayType) {
        if (displayType != this.l) {
            if (N) {
                Log.i("ImageViewTouchBase", "setDisplayType: " + displayType);
            }
            this.e = false;
            this.l = displayType;
            this.m = true;
            requestLayout();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        A(bitmap, null, -1.0f, -1.0f);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        B(drawable, null, -1.0f, -1.0f);
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        boolean z = (matrix == null && !imageMatrix.isIdentity()) || !(matrix == null || imageMatrix.equals(matrix));
        super.setImageMatrix(matrix);
        if (z) {
            q();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    protected void setMaxScale(float f2) {
        if (N) {
            Log.d("ImageViewTouchBase", "setMaxZoom: " + f2);
        }
        this.f = f2;
    }

    protected void setMinScale(float f2) {
        if (N) {
            Log.d("ImageViewTouchBase", "setMinZoom: " + f2);
        }
        this.g = f2;
    }

    public void setOnDrawableChangedListener(e eVar) {
    }

    public void setOnLayoutChangeListener(f fVar) {
    }

    protected void t(float f2) {
    }

    protected void u(double d2, double d3) {
        RectF bitmapRect = getBitmapRect();
        this.B.set((float) d2, (float) d3);
        F(bitmapRect, this.B);
        PointF pointF = this.B;
        float f2 = pointF.x;
        if (f2 == 0.0f && pointF.y == 0.0f) {
            return;
        }
        w(f2, pointF.y);
        a(true, true);
    }

    protected void v(float f2, float f3, float f4) {
        this.b.postScale(f2, f2, f3, f4);
        setImageMatrix(getImageViewMatrix());
    }

    protected void w(float f2, float f3) {
        if (f2 == 0.0f && f3 == 0.0f) {
            return;
        }
        this.b.postTranslate(f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    public void x(Matrix matrix) {
        float l = l(matrix, 0);
        float l2 = l(matrix, 4);
        Log.d("ImageViewTouchBase", "matrix: { x: " + l(matrix, 2) + ", y: " + l(matrix, 5) + ", scalex: " + l + ", scaley: " + l2 + " }");
    }

    public void y(float f2, float f3) {
        u(f2, f3);
    }

    protected void z(float f2, float f3, long j) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, f2).setDuration(j);
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, f3).setDuration(j);
        D();
        AnimatorSet animatorSet = new AnimatorSet();
        this.M = animatorSet;
        animatorSet.playTogether(duration, duration2);
        this.M.setDuration(j);
        this.M.setInterpolator(new DecelerateInterpolator());
        this.M.start();
        duration2.addUpdateListener(new b(duration, duration2));
        this.M.addListener(new c());
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Matrix();
        this.b = new Matrix();
        this.d = null;
        this.e = false;
        this.f = -1.0f;
        this.g = -1.0f;
        this.j = new Matrix();
        this.k = new float[9];
        this.l = DisplayType.FIT_IF_BIGGER;
        this.u = new PointF();
        this.w = new RectF();
        this.x = new RectF();
        this.y = new RectF();
        this.B = new PointF();
        this.H = new RectF();
        this.L = new RectF();
        o(context, attributeSet, i);
    }
}
