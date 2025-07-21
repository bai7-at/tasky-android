package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.fn6;
import defpackage.hi;
import defpackage.hw4;
import defpackage.ig4;
import defpackage.k99;
import defpackage.lc6;
import defpackage.nn6;
import defpackage.pb9;
import defpackage.zd6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class ClockHandView extends View {
    private final int a;
    private final TimeInterpolator b;
    private final ValueAnimator c;
    private boolean d;
    private float e;
    private float f;
    private boolean g;
    private final int h;
    private boolean i;
    private final List j;
    private final int k;
    private final float l;
    private final Paint m;
    private final RectF n;
    private final int r;
    private float s;
    private boolean t;
    private double u;
    private int w;
    private int x;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void n(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lc6.materialClockStyle);
    }

    private void c(float f, float f2) {
        this.x = ig4.a((float) (getWidth() / 2), (float) (getHeight() / 2), f, f2) > ((float) h(2)) + pb9.e(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float h = h(this.x);
        float cos = (((float) Math.cos(this.u)) * h) + f;
        float f2 = height;
        float sin = (h * ((float) Math.sin(this.u))) + f2;
        this.m.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.k, this.m);
        double sin2 = Math.sin(this.u);
        double cos2 = Math.cos(this.u);
        this.m.setStrokeWidth(this.r);
        canvas.drawLine(f, f2, width + ((int) (cos2 * r7)), height + ((int) (r7 * sin2)), this.m);
        canvas.drawCircle(f, f2, this.l, this.m);
    }

    private int f(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    private int h(int i) {
        int i2 = this.w;
        return i == 2 ? Math.round(i2 * 0.66f) : i2;
    }

    private Pair j(float f) {
        float g = g();
        if (Math.abs(g - f) > 180.0f) {
            if (g > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (g < 180.0f && f > 180.0f) {
                g += 360.0f;
            }
        }
        return new Pair(Float.valueOf(g), Float.valueOf(f));
    }

    private boolean k(float f, float f2, boolean z, boolean z2, boolean z3) {
        float f3 = f(f, f2);
        boolean z4 = false;
        boolean z5 = g() != f3;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.d) {
            z4 = true;
        }
        o(f3, z4);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void p(float f, boolean z) {
        float f2 = f % 360.0f;
        this.s = f2;
        this.u = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float h = h(this.x);
        float cos = width + (((float) Math.cos(this.u)) * h);
        float sin = height + (h * ((float) Math.sin(this.u)));
        RectF rectF = this.n;
        int i = this.k;
        rectF.set(cos - i, sin - i, cos + i, sin + i);
        Iterator it2 = this.j.iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).n(f2, z);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.j.add(bVar);
    }

    public RectF e() {
        return this.n;
    }

    public float g() {
        return this.s;
    }

    public int i() {
        return this.k;
    }

    public void m(int i) {
        this.w = i;
        invalidate();
    }

    public void n(float f) {
        o(f, false);
    }

    public void o(float f, boolean z) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            p(f, false);
            return;
        }
        Pair j = j(f);
        this.c.setFloatValues(((Float) j.first).floatValue(), ((Float) j.second).floatValue());
        this.c.setDuration(this.a);
        this.c.setInterpolator(this.b);
        this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.this.l(valueAnimator2);
            }
        });
        this.c.addListener(new a());
        this.c.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.c.isRunning()) {
            return;
        }
        n(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.e = x;
            this.f = y;
            this.g = true;
            this.t = false;
            z = true;
            z2 = false;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.e);
            int i2 = (int) (y - this.f);
            this.g = (i * i) + (i2 * i2) > this.h;
            z2 = this.t;
            boolean z4 = actionMasked == 1;
            if (this.i) {
                c(x, y);
            }
            z3 = z4;
            z = false;
        } else {
            z2 = false;
            z = false;
            z3 = false;
        }
        this.t |= k(x, y, z2, z, z3);
        return true;
    }

    void q(boolean z) {
        if (this.i && !z) {
            this.x = 1;
        }
        this.i = z;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ValueAnimator();
        this.j = new ArrayList();
        Paint paint = new Paint();
        this.m = paint;
        this.n = new RectF();
        this.x = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nn6.ClockHandView, i, fn6.Widget_MaterialComponents_TimePicker_Clock);
        this.a = hw4.f(context, lc6.motionDurationLong2, 200);
        this.b = hw4.g(context, lc6.motionEasingEmphasizedInterpolator, hi.b);
        this.w = obtainStyledAttributes.getDimensionPixelSize(nn6.ClockHandView_materialCircleRadius, 0);
        this.k = obtainStyledAttributes.getDimensionPixelSize(nn6.ClockHandView_selectorSize, 0);
        this.r = getResources().getDimensionPixelSize(zd6.material_clock_hand_stroke_width);
        this.l = r7.getDimensionPixelSize(zd6.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(nn6.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        k99.v0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
