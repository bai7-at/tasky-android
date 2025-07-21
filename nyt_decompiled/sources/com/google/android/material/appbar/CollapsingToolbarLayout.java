package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.az1;
import defpackage.be5;
import defpackage.bg6;
import defpackage.c18;
import defpackage.ch9;
import defpackage.fn6;
import defpackage.hg4;
import defpackage.ic5;
import defpackage.k99;
import defpackage.kv1;
import defpackage.lc6;
import defpackage.mx0;
import defpackage.nn6;
import defpackage.qf4;
import defpackage.wm1;
import defpackage.zd6;

/* loaded from: classes3.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int h0 = fn6.Widget_Design_CollapsingToolbar;
    private final TimeInterpolator B;
    private int H;
    private AppBarLayout.f L;
    int M;
    private int N;
    ch9 Q;
    private int S;
    private boolean a;
    private int b;
    private ViewGroup c;
    private View d;
    private View e;
    private boolean e0;
    private int f;
    private int f0;
    private int g;
    private boolean g0;
    private int h;
    private int i;
    private final Rect j;
    final com.google.android.material.internal.a k;
    final az1 l;
    private boolean m;
    private boolean n;
    private Drawable r;
    Drawable s;
    private int t;
    private boolean u;
    private ValueAnimator w;
    private long x;
    private final TimeInterpolator y;

    class a implements be5 {
        a() {
        }

        @Override // defpackage.be5
        public ch9 a(View view, ch9 ch9Var) {
            return CollapsingToolbarLayout.this.o(ch9Var);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    private class d implements AppBarLayout.f {
        d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.M = i;
            ch9 ch9Var = collapsingToolbarLayout.Q;
            int l = ch9Var != null ? ch9Var.l() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                c cVar = (c) childAt.getLayoutParams();
                com.google.android.material.appbar.d k = CollapsingToolbarLayout.k(childAt);
                int i3 = cVar.a;
                if (i3 == 1) {
                    k.f(hg4.b(-i, 0, CollapsingToolbarLayout.this.i(childAt)));
                } else if (i3 == 2) {
                    k.f(Math.round((-i) * cVar.b));
                }
            }
            CollapsingToolbarLayout.this.v();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.s != null && l > 0) {
                k99.c0(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - k99.y(CollapsingToolbarLayout.this)) - l;
            float f = height;
            CollapsingToolbarLayout.this.k.A0(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.k.n0(collapsingToolbarLayout3.M + height);
            CollapsingToolbarLayout.this.k.y0(Math.abs(i) / f);
        }
    }

    public interface e extends c18 {
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lc6.collapsingToolbarLayoutStyle);
    }

    private void a(int i) {
        d();
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.w = valueAnimator2;
            valueAnimator2.setInterpolator(i > this.t ? this.y : this.B);
            this.w.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.w.cancel();
        }
        this.w.setDuration(this.x);
        this.w.setIntValues(this.t, i);
        this.w.start();
    }

    private TextUtils.TruncateAt b(int i) {
        return i != 0 ? i != 1 ? i != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    private void c(AppBarLayout appBarLayout) {
        if (l()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void d() {
        if (this.a) {
            ViewGroup viewGroup = null;
            this.c = null;
            this.d = null;
            int i = this.b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.c = viewGroup2;
                if (viewGroup2 != null) {
                    this.d = e(viewGroup2);
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (m(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i2++;
                }
                this.c = viewGroup;
            }
            u();
            this.a = false;
        }
    }

    private View e(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList g = qf4.g(getContext(), lc6.colorSurfaceContainer);
        if (g != null) {
            return g.getDefaultColor();
        }
        return this.l.d(getResources().getDimension(zd6.design_appbar_elevation));
    }

    private static int h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static CharSequence j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    static com.google.android.material.appbar.d k(View view) {
        com.google.android.material.appbar.d dVar = (com.google.android.material.appbar.d) view.getTag(bg6.view_offset_helper);
        if (dVar != null) {
            return dVar;
        }
        com.google.android.material.appbar.d dVar2 = new com.google.android.material.appbar.d(view);
        view.setTag(bg6.view_offset_helper, dVar2);
        return dVar2;
    }

    private boolean l() {
        return this.N == 1;
    }

    private static boolean m(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean n(View view) {
        View view2 = this.d;
        if (view2 == null || view2 == this) {
            if (view != this.c) {
                return false;
            }
        } else if (view != view2) {
            return false;
        }
        return true;
    }

    private void q(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        View view = this.d;
        if (view == null) {
            view = this.c;
        }
        int i5 = i(view);
        wm1.a(this, this.e, this.j);
        ViewGroup viewGroup = this.c;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i = toolbar.getTitleMarginStart();
            i3 = toolbar.getTitleMarginEnd();
            i4 = toolbar.getTitleMarginTop();
            i2 = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i = toolbar2.getTitleMarginStart();
            i3 = toolbar2.getTitleMarginEnd();
            i4 = toolbar2.getTitleMarginTop();
            i2 = toolbar2.getTitleMarginBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        com.google.android.material.internal.a aVar = this.k;
        Rect rect = this.j;
        int i6 = rect.left + (z ? i3 : i);
        int i7 = rect.top + i5 + i4;
        int i8 = rect.right;
        if (!z) {
            i = i3;
        }
        aVar.e0(i6, i7, i8 - i, (rect.bottom + i5) - i2);
    }

    private void r() {
        setContentDescription(getTitle());
    }

    private void s(Drawable drawable, int i, int i2) {
        t(drawable, this.c, i, i2);
    }

    private void t(Drawable drawable, View view, int i, int i2) {
        if (l() && view != null && this.m) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private void u() {
        View view;
        if (!this.m && (view = this.e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.e);
            }
        }
        if (!this.m || this.c == null) {
            return;
        }
        if (this.e == null) {
            this.e = new View(getContext());
        }
        if (this.e.getParent() == null) {
            this.c.addView(this.e, -1, -1);
        }
    }

    private void w(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (!this.m || (view = this.e) == null) {
            return;
        }
        boolean z2 = k99.O(view) && this.e.getVisibility() == 0;
        this.n = z2;
        if (z2 || z) {
            boolean z3 = k99.x(this) == 1;
            q(z3);
            this.k.o0(z3 ? this.h : this.f, this.j.top + this.g, (i3 - i) - (z3 ? this.f : this.h), (i4 - i2) - this.i);
            this.k.b0(z);
        }
    }

    private void x() {
        if (this.c != null && this.m && TextUtils.isEmpty(this.k.O())) {
            setTitle(j(this.c));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        d();
        if (this.c == null && (drawable = this.r) != null && this.t > 0) {
            drawable.mutate().setAlpha(this.t);
            this.r.draw(canvas);
        }
        if (this.m && this.n) {
            if (this.c == null || this.r == null || this.t <= 0 || !l() || this.k.F() >= this.k.G()) {
                this.k.l(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.r.getBounds(), Region.Op.DIFFERENCE);
                this.k.l(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.s == null || this.t <= 0) {
            return;
        }
        ch9 ch9Var = this.Q;
        int l = ch9Var != null ? ch9Var.l() : 0;
        if (l > 0) {
            this.s.setBounds(0, -this.M, getWidth(), l - this.M);
            this.s.mutate().setAlpha(this.t);
            this.s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.r == null || this.t <= 0 || !n(view)) {
            z = false;
        } else {
            t(this.r, view, getWidth(), getHeight());
            this.r.mutate().setAlpha(this.t);
            this.r.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.s;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.r;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.k;
        if (aVar != null) {
            state |= aVar.I0(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.k.q();
    }

    public float getCollapsedTitleTextSize() {
        return this.k.u();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.k.v();
    }

    public Drawable getContentScrim() {
        return this.r;
    }

    public int getExpandedTitleGravity() {
        return this.k.B();
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.g;
    }

    public float getExpandedTitleTextSize() {
        return this.k.D();
    }

    public Typeface getExpandedTitleTypeface() {
        return this.k.E();
    }

    public int getHyphenationFrequency() {
        return this.k.H();
    }

    public int getLineCount() {
        return this.k.I();
    }

    public float getLineSpacingAdd() {
        return this.k.J();
    }

    public float getLineSpacingMultiplier() {
        return this.k.K();
    }

    public int getMaxLines() {
        return this.k.L();
    }

    int getScrimAlpha() {
        return this.t;
    }

    public long getScrimAnimationDuration() {
        return this.x;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.H;
        if (i >= 0) {
            return i + this.S + this.f0;
        }
        ch9 ch9Var = this.Q;
        int l = ch9Var != null ? ch9Var.l() : 0;
        int y = k99.y(this);
        return y > 0 ? Math.min((y * 2) + l, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.s;
    }

    public CharSequence getTitle() {
        if (this.m) {
            return this.k.O();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.N;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.k.N();
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.k.R();
    }

    final int i(View view) {
        return ((getHeight() - k(view).b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    ch9 o(ch9 ch9Var) {
        ch9 ch9Var2 = k99.u(this) ? ch9Var : null;
        if (!ic5.a(this.Q, ch9Var2)) {
            this.Q = ch9Var2;
            requestLayout();
        }
        return ch9Var.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            c(appBarLayout);
            k99.u0(this, k99.u(appBarLayout));
            if (this.L == null) {
                this.L = new d();
            }
            appBarLayout.d(this.L);
            k99.i0(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k.Y(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.f fVar = this.L;
        if (fVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).x(fVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ch9 ch9Var = this.Q;
        if (ch9Var != null) {
            int l = ch9Var.l();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!k99.u(childAt) && childAt.getTop() < l) {
                    k99.W(childAt, l);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            k(getChildAt(i6)).d();
        }
        w(i, i2, i3, i4, false);
        x();
        v();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            k(getChildAt(i7)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        d();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        ch9 ch9Var = this.Q;
        int l = ch9Var != null ? ch9Var.l() : 0;
        if ((mode == 0 || this.e0) && l > 0) {
            this.S = l;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + l, 1073741824));
        }
        if (this.g0 && this.k.L() > 1) {
            x();
            w(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int z = this.k.z();
            if (z > 1) {
                this.f0 = Math.round(this.k.A()) * (z - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f0, 1073741824));
            }
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            View view = this.d;
            if (view == null || view == this) {
                setMinimumHeight(h(viewGroup));
            } else {
                setMinimumHeight(h(view));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.r;
        if (drawable != null) {
            s(drawable, i, i2);
        }
    }

    public void p(boolean z, boolean z2) {
        if (this.u != z) {
            if (z2) {
                a(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.u = z;
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.k.j0(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.k.g0(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f) {
        this.k.k0(f);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.k.l0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.r = mutate;
            if (mutate != null) {
                s(mutate, getWidth(), getHeight());
                this.r.setCallback(this);
                this.r.setAlpha(this.t);
            }
            k99.c0(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(mx0.e(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.k.u0(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.g = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.k.r0(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.k.t0(colorStateList);
    }

    public void setExpandedTitleTextSize(float f) {
        this.k.v0(f);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.k.w0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.g0 = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.e0 = z;
    }

    public void setHyphenationFrequency(int i) {
        this.k.B0(i);
    }

    public void setLineSpacingAdd(float f) {
        this.k.D0(f);
    }

    public void setLineSpacingMultiplier(float f) {
        this.k.E0(f);
    }

    public void setMaxLines(int i) {
        this.k.F0(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.k.H0(z);
    }

    void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.t) {
            if (this.r != null && (viewGroup = this.c) != null) {
                k99.c0(viewGroup);
            }
            this.t = i;
            k99.c0(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.x = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.H != i) {
            this.H = i;
            v();
        }
    }

    public void setScrimsShown(boolean z) {
        p(z, k99.P(this) && !isInEditMode());
    }

    public void setStaticLayoutBuilderConfigurer(e eVar) {
        this.k.J0(eVar);
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.s = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.s.setState(getDrawableState());
                }
                kv1.m(this.s, k99.x(this));
                this.s.setVisible(getVisibility() == 0, false);
                this.s.setCallback(this);
                this.s.setAlpha(this.t);
            }
            k99.c0(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(mx0.e(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.k.K0(charSequence);
        r();
    }

    public void setTitleCollapseMode(int i) {
        this.N = i;
        boolean l = l();
        this.k.z0(l);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            c((AppBarLayout) parent);
        }
        if (l && this.r == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        this.k.M0(truncateAt);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.m) {
            this.m = z;
            r();
            u();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.k.G0(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.s;
        if (drawable != null && drawable.isVisible() != z) {
            this.s.setVisible(z, false);
        }
        Drawable drawable2 = this.r;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.r.setVisible(z, false);
    }

    final void v() {
        if (this.r == null && this.s == null) {
            return;
        }
        setScrimsShown(getHeight() + this.M < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r || drawable == this.s;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CollapsingToolbarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.k.i0(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public static class c extends FrameLayout.LayoutParams {
        int a;
        float b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            this.b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nn6.CollapsingToolbarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(nn6.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            a(obtainStyledAttributes.getFloat(nn6.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public void a(float f) {
            this.b = f;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.a = 0;
            this.b = 0.5f;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
            this.b = 0.5f;
        }
    }
}
