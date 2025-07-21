package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.a;
import defpackage.be5;
import defpackage.bg4;
import defpackage.ch9;
import defpackage.gx0;
import defpackage.h3;
import defpackage.hi;
import defpackage.hw4;
import defpackage.k99;
import defpackage.kv1;
import defpackage.lc6;
import defpackage.lh4;
import defpackage.nn6;
import defpackage.oo7;
import defpackage.pb9;
import defpackage.qf4;
import defpackage.sk8;
import defpackage.tf4;
import defpackage.uf4;
import defpackage.w2;
import defpackage.xi6;
import defpackage.yh9;
import defpackage.zd6;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseTransientBottomBar {
    private final int a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator e;
    private final TimeInterpolator f;
    private final ViewGroup g;
    private final Context h;
    protected final s i;
    private final gx0 j;
    private int k;
    private boolean l;
    private q m;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private List w;
    private Behavior x;
    private final AccessibilityManager y;
    private static final TimeInterpolator A = hi.b;
    private static final TimeInterpolator B = hi.a;
    private static final TimeInterpolator C = hi.d;
    private static final boolean E = false;
    private static final int[] F = {lc6.snackbarStyle};
    private static final String G = BaseTransientBottomBar.class.getSimpleName();
    static final Handler D = new Handler(Looper.getMainLooper(), new h());
    private boolean n = false;
    private final Runnable o = new i();
    a.b z = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {
        private final r l = new r(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void q(BaseTransientBottomBar baseTransientBottomBar) {
            this.l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean f(View view) {
            return this.l.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.l.b(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R(this.a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.i.setScaleX(floatValue);
            BaseTransientBottomBar.this.i.setScaleY(floatValue);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.j.a(BaseTransientBottomBar.this.c - BaseTransientBottomBar.this.a, BaseTransientBottomBar.this.a);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {
        private int a;
        final /* synthetic */ int b;

        e(int i) {
            this.b = i;
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.E) {
                k99.W(BaseTransientBottomBar.this.i, intValue - this.a);
            } else {
                BaseTransientBottomBar.this.i.setTranslationY(intValue);
            }
            this.a = intValue;
        }
    }

    class f extends AnimatorListenerAdapter {
        final /* synthetic */ int a;

        f(int i) {
            this.a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R(this.a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.j.b(0, BaseTransientBottomBar.this.b);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {
        private int a = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.E) {
                k99.W(BaseTransientBottomBar.this.i, intValue - this.a);
            } else {
                BaseTransientBottomBar.this.i.setTranslationY(intValue);
            }
            this.a = intValue;
        }
    }

    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).a0();
                return true;
            }
            if (i != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).L(message.arg1);
            return true;
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.i == null || baseTransientBottomBar.h == null) {
                return;
            }
            int height = (yh9.a(BaseTransientBottomBar.this.h).height() - BaseTransientBottomBar.this.J()) + ((int) BaseTransientBottomBar.this.i.getTranslationY());
            if (height >= BaseTransientBottomBar.this.t) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.u = baseTransientBottomBar2.t;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.G, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.u = baseTransientBottomBar3.t;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.t - height;
            BaseTransientBottomBar.this.i.requestLayout();
        }
    }

    class j implements be5 {
        j() {
        }

        @Override // defpackage.be5
        public ch9 a(View view, ch9 ch9Var) {
            BaseTransientBottomBar.this.p = ch9Var.i();
            BaseTransientBottomBar.this.q = ch9Var.j();
            BaseTransientBottomBar.this.r = ch9Var.k();
            BaseTransientBottomBar.this.g0();
            return ch9Var;
        }
    }

    class k extends w2 {
        k() {
        }

        @Override // defpackage.w2
        public void g(View view, h3 h3Var) {
            super.g(view, h3Var);
            h3Var.a(Constants.MB);
            h3Var.k0(true);
        }

        @Override // defpackage.w2
        public boolean k(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.k(view, i, bundle);
            }
            BaseTransientBottomBar.this.z();
            return true;
        }
    }

    class l implements a.b {
        l() {
        }

        @Override // com.google.android.material.snackbar.a.b
        public void a() {
            Handler handler = BaseTransientBottomBar.D;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.a.b
        public void b(int i) {
            Handler handler = BaseTransientBottomBar.D;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.R(3);
        }
    }

    class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.A(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i) {
            if (i == 0) {
                com.google.android.material.snackbar.a.c().k(BaseTransientBottomBar.this.z);
            } else if (i == 1 || i == 2) {
                com.google.android.material.snackbar.a.c().j(BaseTransientBottomBar.this.z);
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s sVar = BaseTransientBottomBar.this.i;
            if (sVar == null) {
                return;
            }
            if (sVar.getParent() != null) {
                BaseTransientBottomBar.this.i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.c0();
            } else {
                BaseTransientBottomBar.this.e0();
            }
        }
    }

    class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S();
        }
    }

    static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        private final WeakReference a;
        private final WeakReference b;

        private q(BaseTransientBottomBar baseTransientBottomBar, View view) {
            this.a = new WeakReference(baseTransientBottomBar);
            this.b = new WeakReference(view);
        }

        static q a(BaseTransientBottomBar baseTransientBottomBar, View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (k99.O(view)) {
                pb9.b(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        private boolean d() {
            if (this.a.get() != null) {
                return false;
            }
            c();
            return true;
        }

        View b() {
            return (View) this.b.get();
        }

        void c() {
            if (this.b.get() != null) {
                ((View) this.b.get()).removeOnAttachStateChangeListener(this);
                pb9.l((View) this.b.get(), this);
            }
            this.b.clear();
            this.a.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d() || !((BaseTransientBottomBar) this.a.get()).n) {
                return;
            }
            ((BaseTransientBottomBar) this.a.get()).T();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            pb9.b(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            pb9.l(view, this);
        }
    }

    public static class r {
        private a.b a;

        public r(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.m(0.1f);
            swipeDismissBehavior.k(0.6f);
            swipeDismissBehavior.n(0);
        }

        public boolean a(View view) {
            return view instanceof s;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.c().j(this.a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.c().k(this.a);
            }
        }

        public void c(BaseTransientBottomBar baseTransientBottomBar) {
            this.a = baseTransientBottomBar.z;
        }
    }

    protected static class s extends FrameLayout {
        private static final View.OnTouchListener l = new a();
        private BaseTransientBottomBar a;
        oo7 b;
        private int c;
        private final float d;
        private final float e;
        private final int f;
        private final int g;
        private ColorStateList h;
        private PorterDuff.Mode i;
        private Rect j;
        private boolean k;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected s(Context context, AttributeSet attributeSet) {
            super(bg4.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, nn6.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(nn6.SnackbarLayout_elevation)) {
                k99.t0(this, obtainStyledAttributes.getDimensionPixelSize(nn6.SnackbarLayout_elevation, 0));
            }
            this.c = obtainStyledAttributes.getInt(nn6.SnackbarLayout_animationMode, 0);
            if (obtainStyledAttributes.hasValue(nn6.SnackbarLayout_shapeAppearance) || obtainStyledAttributes.hasValue(nn6.SnackbarLayout_shapeAppearanceOverlay)) {
                this.b = oo7.e(context2, attributeSet, 0, 0).m();
            }
            this.d = obtainStyledAttributes.getFloat(nn6.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(tf4.a(context2, obtainStyledAttributes, nn6.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(pb9.k(obtainStyledAttributes.getInt(nn6.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.e = obtainStyledAttributes.getFloat(nn6.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f = obtainStyledAttributes.getDimensionPixelSize(nn6.SnackbarLayout_android_maxWidth, -1);
            this.g = obtainStyledAttributes.getDimensionPixelSize(nn6.SnackbarLayout_maxActionInlineWidth, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(l);
            setFocusable(true);
            if (getBackground() == null) {
                k99.p0(this, d());
            }
        }

        private Drawable d() {
            int k = qf4.k(this, lc6.colorSurface, lc6.colorOnSurface, getBackgroundOverlayColorAlpha());
            oo7 oo7Var = this.b;
            Drawable y = oo7Var != null ? BaseTransientBottomBar.y(k, oo7Var) : BaseTransientBottomBar.x(k, getResources());
            if (this.h == null) {
                return kv1.r(y);
            }
            Drawable r = kv1.r(y);
            kv1.o(r, this.h);
            return r;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.a = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.k = true;
            viewGroup.addView(this);
            this.k = false;
        }

        float getActionTextColorAlpha() {
            return this.e;
        }

        int getAnimationMode() {
            return this.c;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.d;
        }

        int getMaxInlineActionWidth() {
            return this.g;
        }

        int getMaxWidth() {
            return this.f;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.O();
            }
            k99.i0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.P();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.Q();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        void setAnimationMode(int i) {
            this.c = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.h != null) {
                drawable = kv1.r(drawable.mutate());
                kv1.o(drawable, this.h);
                kv1.p(drawable, this.i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.h = colorStateList;
            if (getBackground() != null) {
                Drawable r = kv1.r(getBackground().mutate());
                kv1.o(r, colorStateList);
                kv1.p(r, this.i);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.i = mode;
            if (getBackground() != null) {
                Drawable r = kv1.r(getBackground().mutate());
                kv1.p(r, mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.g0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : l);
            super.setOnClickListener(onClickListener);
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, gx0 gx0Var) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (gx0Var == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.g = viewGroup;
        this.j = gx0Var;
        this.h = context;
        sk8.a(context);
        s sVar = (s) LayoutInflater.from(context).inflate(G(), viewGroup, false);
        this.i = sVar;
        sVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(sVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(sVar.getMaxInlineActionWidth());
        }
        sVar.addView(view);
        k99.n0(sVar, 1);
        k99.v0(sVar, 1);
        k99.u0(sVar, true);
        k99.A0(sVar, new j());
        k99.l0(sVar, new k());
        this.y = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = hw4.f(context, lc6.motionDurationLong2, 250);
        this.a = hw4.f(context, lc6.motionDurationLong2, 150);
        this.b = hw4.f(context, lc6.motionDurationMedium1, 75);
        this.d = hw4.g(context, lc6.motionEasingEmphasizedInterpolator, B);
        this.f = hw4.g(context, lc6.motionEasingEmphasizedInterpolator, C);
        this.e = hw4.g(context, lc6.motionEasingEmphasizedInterpolator, A);
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.d);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private ValueAnimator F(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    private int H() {
        int height = this.i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int J() {
        int[] iArr = new int[2];
        this.i.getLocationInWindow(iArr);
        return iArr[1] + this.i.getHeight();
    }

    private boolean N() {
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).e() instanceof SwipeDismissBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        this.s = w();
        g0();
    }

    private void W(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.x;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = E();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).q(this);
        }
        swipeDismissBehavior.l(new n());
        fVar.n(swipeDismissBehavior);
        if (C() == null) {
            fVar.g = 80;
        }
    }

    private boolean Y() {
        return this.t > 0 && !this.l && N();
    }

    private void b0() {
        if (X()) {
            u();
            return;
        }
        if (this.i.getParent() != null) {
            this.i.setVisibility(0);
        }
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        ValueAnimator B2 = B(0.0f, 1.0f);
        ValueAnimator F2 = F(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(B2, F2);
        animatorSet.setDuration(this.a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void d0(int i2) {
        ValueAnimator B2 = B(1.0f, 0.0f);
        B2.setDuration(this.b);
        B2.addListener(new a(i2));
        B2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        int H = H();
        if (E) {
            k99.W(this.i, H);
        } else {
            this.i.setTranslationY(H);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(H, 0);
        valueAnimator.setInterpolator(this.e);
        valueAnimator.setDuration(this.c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(H));
        valueAnimator.start();
    }

    private void f0(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, H());
        valueAnimator.setInterpolator(this.e);
        valueAnimator.setDuration(this.c);
        valueAnimator.addListener(new f(i2));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(G, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.i.j == null) {
            Log.w(G, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = this.i.j.bottom + (C() != null ? this.s : this.p);
        int i3 = this.i.j.left + this.q;
        int i4 = this.i.j.right + this.r;
        int i5 = this.i.j.top;
        boolean z = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            this.i.requestLayout();
        }
        if ((z || this.u != this.t) && Y()) {
            this.i.removeCallbacks(this.o);
            this.i.post(this.o);
        }
    }

    private void v(int i2) {
        if (this.i.getAnimationMode() == 1) {
            d0(i2);
        } else {
            f0(i2);
        }
    }

    private int w() {
        if (C() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        C().getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.g.getHeight()) - i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable x(int i2, Resources resources) {
        float dimension = resources.getDimension(zd6.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static uf4 y(int i2, oo7 oo7Var) {
        uf4 uf4Var = new uf4(oo7Var);
        uf4Var.W(ColorStateList.valueOf(i2));
        return uf4Var;
    }

    protected void A(int i2) {
        com.google.android.material.snackbar.a.c().b(this.z, i2);
    }

    public View C() {
        q qVar = this.m;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int D() {
        return this.k;
    }

    protected SwipeDismissBehavior E() {
        return new Behavior();
    }

    protected int G() {
        return K() ? xi6.mtrl_layout_snackbar : xi6.design_layout_snackbar;
    }

    public View I() {
        return this.i;
    }

    protected boolean K() {
        TypedArray obtainStyledAttributes = this.h.obtainStyledAttributes(F);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void L(int i2) {
        if (X() && this.i.getVisibility() == 0) {
            v(i2);
        } else {
            R(i2);
        }
    }

    public boolean M() {
        return com.google.android.material.snackbar.a.c().e(this.z);
    }

    void O() {
        WindowInsets rootWindowInsets = this.i.getRootWindowInsets();
        if (rootWindowInsets != null) {
            this.t = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            g0();
        }
    }

    void P() {
        if (M()) {
            D.post(new m());
        }
    }

    void Q() {
        if (this.v) {
            b0();
            this.v = false;
        }
    }

    void R(int i2) {
        int size;
        com.google.android.material.snackbar.a.c().h(this.z);
        if (this.w != null && r2.size() - 1 >= 0) {
            lh4.a(this.w.get(size));
            throw null;
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    void S() {
        int size;
        com.google.android.material.snackbar.a.c().i(this.z);
        if (this.w == null || r0.size() - 1 < 0) {
            return;
        }
        lh4.a(this.w.get(size));
        throw null;
    }

    public BaseTransientBottomBar U(View view) {
        q qVar = this.m;
        if (qVar != null) {
            qVar.c();
        }
        this.m = view == null ? null : q.a(this, view);
        return this;
    }

    public BaseTransientBottomBar V(int i2) {
        this.k = i2;
        return this;
    }

    boolean X() {
        AccessibilityManager accessibilityManager = this.y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void Z() {
        com.google.android.material.snackbar.a.c().m(D(), this.z);
    }

    final void a0() {
        if (this.i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                W((CoordinatorLayout.f) layoutParams);
            }
            this.i.c(this.g);
            T();
            this.i.setVisibility(4);
        }
        if (k99.P(this.i)) {
            b0();
        } else {
            this.v = true;
        }
    }

    void u() {
        this.i.post(new o());
    }

    public void z() {
        A(3);
    }
}
