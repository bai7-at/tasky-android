package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import defpackage.al;
import defpackage.bg6;
import defpackage.fn6;
import defpackage.h3;
import defpackage.k99;
import defpackage.lc6;
import defpackage.ld6;
import defpackage.nn6;
import defpackage.tf4;
import defpackage.w2;
import defpackage.xi6;
import defpackage.zd6;
import java.util.Arrays;

/* loaded from: classes3.dex */
class ClockFaceView extends d implements ClockHandView.b {
    private final ClockHandView d;
    private final Rect e;
    private final RectF f;
    private final Rect g;
    private final SparseArray h;
    private final w2 i;
    private final int[] j;
    private final float[] k;
    private final int l;
    private final int m;
    private final int n;
    private final int r;
    private String[] s;
    private float t;
    private final ColorStateList u;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.R(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.d.i()) - ClockFaceView.this.l);
            return true;
        }
    }

    class b extends w2 {
        b() {
        }

        @Override // defpackage.w2
        public void g(View view, h3 h3Var) {
            super.g(view, h3Var);
            int intValue = ((Integer) view.getTag(bg6.material_value_index)).intValue();
            if (intValue > 0) {
                h3Var.N0((View) ClockFaceView.this.h.get(intValue - 1));
            }
            h3Var.h0(h3.f.a(0, 1, intValue, 1, false, view.isSelected()));
            h3Var.f0(true);
            h3Var.b(h3.a.i);
        }

        @Override // defpackage.w2
        public boolean k(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.k(view, i, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.e);
            float centerX = ClockFaceView.this.e.centerX();
            float centerY = ClockFaceView.this.e.centerY();
            ClockFaceView.this.d.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            ClockFaceView.this.d.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lc6.materialClockStyle);
    }

    private void m0() {
        RectF e = this.d.e();
        TextView o0 = o0(e);
        for (int i = 0; i < this.h.size(); i++) {
            TextView textView = (TextView) this.h.get(i);
            if (textView != null) {
                textView.setSelected(textView == o0);
                textView.getPaint().setShader(n0(e, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient n0(RectF rectF, TextView textView) {
        textView.getHitRect(this.e);
        this.f.set(this.e);
        textView.getLineBounds(0, this.g);
        RectF rectF2 = this.f;
        Rect rect = this.g;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f)) {
            return new RadialGradient(rectF.centerX() - this.f.left, rectF.centerY() - this.f.top, rectF.width() * 0.5f, this.j, this.k, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView o0(RectF rectF) {
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.h.size(); i++) {
            TextView textView2 = (TextView) this.h.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.e);
                this.f.set(this.e);
                this.f.union(rectF);
                float width = this.f.width() * this.f.height();
                if (width < f) {
                    textView = textView2;
                    f = width;
                }
            }
        }
        return textView;
    }

    private static float p0(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    private void s0(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.h.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.s.length, size); i2++) {
            TextView textView = (TextView) this.h.get(i2);
            if (i2 >= this.s.length) {
                removeView(textView);
                this.h.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(xi6.material_clockface_textview, (ViewGroup) this, false);
                    this.h.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.s[i2]);
                textView.setTag(bg6.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(bg6.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                k99.l0(textView, this.i);
                textView.setTextColor(this.u);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.s[i2]));
                }
            }
        }
        this.d.q(z);
    }

    @Override // com.google.android.material.timepicker.d
    public void R(int i) {
        if (i != O()) {
            super.R(i);
            this.d.m(O());
        }
    }

    @Override // com.google.android.material.timepicker.d
    protected void W() {
        super.W();
        for (int i = 0; i < this.h.size(); i++) {
            ((TextView) this.h.get(i)).setVisibility(0);
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void n(float f, boolean z) {
        if (Math.abs(this.t - f) > 0.001f) {
            this.t = f;
            m0();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h3.U0(accessibilityNodeInfo).g0(h3.e.a(1, this.s.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int p0 = (int) (this.r / p0(this.m / displayMetrics.heightPixels, this.n / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(p0, 1073741824);
        setMeasuredDimension(p0, p0);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void r0(String[] strArr, int i) {
        this.s = strArr;
        s0(i);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Rect();
        this.f = new RectF();
        this.g = new Rect();
        this.h = new SparseArray();
        this.k = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nn6.ClockFaceView, i, fn6.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a2 = tf4.a(context, obtainStyledAttributes, nn6.ClockFaceView_clockNumberTextColor);
        this.u = a2;
        LayoutInflater.from(context).inflate(xi6.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(bg6.material_clock_hand);
        this.d = clockHandView;
        this.l = resources.getDimensionPixelSize(zd6.material_clock_hand_padding);
        int colorForState = a2.getColorForState(new int[]{R.attr.state_selected}, a2.getDefaultColor());
        this.j = new int[]{colorForState, colorForState, a2.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = al.a(context, ld6.material_timepicker_clockface).getDefaultColor();
        ColorStateList a3 = tf4.a(context, obtainStyledAttributes, nn6.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(a3 != null ? a3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.i = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        r0(strArr, 0);
        this.m = resources.getDimensionPixelSize(zd6.material_time_picker_minimum_screen_height);
        this.n = resources.getDimensionPixelSize(zd6.material_time_picker_minimum_screen_width);
        this.r = resources.getDimensionPixelSize(zd6.material_clock_size);
    }
}
