package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.comscore.streaming.ContentFeedType;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.ch9;
import defpackage.fn6;
import defpackage.hi;
import defpackage.hw4;
import defpackage.k99;
import defpackage.kv1;
import defpackage.lc6;
import defpackage.lh4;
import defpackage.pb9;
import defpackage.uf4;
import defpackage.vf4;
import defpackage.yq8;
import defpackage.zd6;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int Q = fn6.Widget_MaterialComponents_BottomAppBar;
    private static final int S = lc6.motionDurationLong2;
    private static final int e0 = lc6.motionEasingEmphasizedInterpolator;
    private int B;
    private int H;
    private int L;
    AnimatorListenerAdapter M;
    yq8 N;
    private Integer a;
    private final uf4 b;
    private Animator c;
    private Animator d;
    private int e;
    private int f;
    private int g;
    private final int h;
    private int i;
    private int j;
    private final boolean k;
    private boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean r;
    private int s;
    private ArrayList t;
    private int u;
    private boolean w;
    private boolean x;
    private Behavior y;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int fabAlignmentMode;
        boolean fabAttached;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.fabAlignmentMode);
            parcel.writeInt(this.fabAttached ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.fabAlignmentMode = parcel.readInt();
            this.fabAttached = parcel.readInt() != 0;
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.w) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.h0(bottomAppBar.e, BottomAppBar.this.x);
        }
    }

    class b implements yq8 {
        b() {
        }
    }

    class c implements pb9.d {
        c() {
        }

        @Override // pb9.d
        public ch9 a(View view, ch9 ch9Var, pb9.e eVar) {
            boolean z;
            if (BottomAppBar.this.m) {
                BottomAppBar.this.B = ch9Var.i();
            }
            boolean z2 = false;
            if (BottomAppBar.this.n) {
                z = BottomAppBar.this.L != ch9Var.j();
                BottomAppBar.this.L = ch9Var.j();
            } else {
                z = false;
            }
            if (BottomAppBar.this.r) {
                boolean z3 = BottomAppBar.this.H != ch9Var.k();
                BottomAppBar.this.H = ch9Var.k();
                z2 = z3;
            }
            if (z || z2) {
                BottomAppBar.this.V();
                BottomAppBar.this.q0();
                BottomAppBar.this.p0();
            }
            return ch9Var;
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.Z();
            BottomAppBar.this.c = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.a0();
        }
    }

    class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.Z();
            BottomAppBar.this.w = false;
            BottomAppBar.this.d = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.a0();
        }
    }

    class f extends AnimatorListenerAdapter {
        public boolean a;
        final /* synthetic */ ActionMenuView b;
        final /* synthetic */ int c;
        final /* synthetic */ boolean d;

        f(ActionMenuView actionMenuView, int i, boolean z) {
            this.b = actionMenuView;
            this.c = i;
            this.d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            boolean z = BottomAppBar.this.u != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.o0(bottomAppBar.u);
            BottomAppBar.this.t0(this.b, this.c, this.d, z);
        }
    }

    class g implements Runnable {
        final /* synthetic */ ActionMenuView a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;

        g(ActionMenuView actionMenuView, int i, boolean z) {
            this.a = actionMenuView;
            this.b = i;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setTranslationX(BottomAppBar.this.d0(r0, this.b, this.c));
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lc6.bottomAppBarStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        Animator animator = this.d;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.c;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void X(int i, List list) {
        b0();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, "translationX", e0(i));
        ofFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(ofFloat);
    }

    private void Y(int i, boolean z, List list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        ofFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - d0(actionMenuView, i, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        } else {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            ofFloat2.addListener(new f(actionMenuView, i, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        ArrayList arrayList;
        int i = this.s - 1;
        this.s = i;
        if (i != 0 || (arrayList = this.t) == null) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        ArrayList arrayList;
        int i = this.s;
        this.s = i + 1;
        if (i != 0 || (arrayList = this.t) == null) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
    }

    private FloatingActionButton b0() {
        c0();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View c0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m(this)) {
        }
        return null;
    }

    private float e0(int i) {
        boolean i2 = pb9.i(this);
        if (i != 1) {
            return 0.0f;
        }
        return ((getMeasuredWidth() / 2) - ((i2 ? this.L : this.H) + ((this.i == -1 || c0() == null) ? this.h : (r6.getMeasuredWidth() / 2) + this.i))) * (i2 ? -1 : 1);
    }

    private boolean f0() {
        b0();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g0(View view) {
        ViewSwazzledHooks.OnClickListener._preOnClick(null, view);
        view.requestLayout();
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return this.B;
    }

    private int getFabAlignmentAnimationDuration() {
        return hw4.f(getContext(), S, ContentFeedType.OTHER);
    }

    private float getFabTranslationX() {
        return e0(this.e);
    }

    private float getFabTranslationY() {
        if (this.g == 1) {
            return -getTopEdgeTreatment().c();
        }
        return c0() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    private int getLeftInset() {
        return this.L;
    }

    private int getRightInset() {
        return this.H;
    }

    private com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a) this.b.C().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(int i, boolean z) {
        if (!k99.P(this)) {
            this.w = false;
            o0(this.u);
            return;
        }
        Animator animator = this.d;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!f0()) {
            i = 0;
            z = false;
        }
        Y(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.d = animatorSet;
        animatorSet.addListener(new e());
        this.d.start();
    }

    private void i0(int i) {
        if (this.e == i || !k99.P(this)) {
            return;
        }
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f == 1) {
            X(i, arrayList);
        } else {
            W(i, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(hw4.g(getContext(), e0, hi.a));
        this.c = animatorSet;
        animatorSet.addListener(new d());
        this.c.start();
    }

    private Drawable j0(Drawable drawable) {
        if (drawable == null || this.a == null) {
            return drawable;
        }
        Drawable r = kv1.r(drawable.mutate());
        kv1.n(r, this.a.intValue());
        return r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.d != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (f0()) {
            s0(actionMenuView, this.e, this.x);
        } else {
            s0(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        getTopEdgeTreatment().l(getFabTranslationX());
        this.b.X((this.x && f0() && this.g == 1) ? 1.0f : 0.0f);
        View c0 = c0();
        if (c0 != null) {
            c0.setTranslationY(getFabTranslationY());
            c0.setTranslationX(getFabTranslationX());
        }
    }

    private void s0(ActionMenuView actionMenuView, int i, boolean z) {
        t0(actionMenuView, i, z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        g gVar = new g(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(gVar);
        } else {
            gVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        fVar.d = 17;
        int i = bottomAppBar.g;
        if (i == 1) {
            fVar.d = 17 | 48;
        }
        if (i == 0) {
            fVar.d |= 80;
        }
    }

    protected void W(int i, List list) {
        b0();
    }

    protected int d0(ActionMenuView actionMenuView, int i, boolean z) {
        int i2 = 0;
        if (this.j != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean i3 = pb9.i(this);
        int measuredWidth = i3 ? getMeasuredWidth() : 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = i3 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = i3 ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i5 = i3 ? this.H : -this.L;
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(zd6.m3_bottomappbar_horizontal_padding);
            if (!i3) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
            i2 = dimensionPixelOffset;
        }
        return measuredWidth - ((right + i5) + i2);
    }

    public ColorStateList getBackgroundTint() {
        return this.b.E();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public int getFabAlignmentMode() {
        return this.e;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.i;
    }

    public int getFabAnchorMode() {
        return this.g;
    }

    public int getFabAnimationMode() {
        return this.f;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f();
    }

    public boolean getHideOnScroll() {
        return this.l;
    }

    public int getMenuAlignmentMode() {
        return this.j;
    }

    public void k0() {
        l0(true);
    }

    public void l0(boolean z) {
        getBehavior().k(this, z);
    }

    public void m0() {
        n0(true);
    }

    public void n0(boolean z) {
        getBehavior().m(this, z);
    }

    public void o0(int i) {
        if (i != 0) {
            this.u = 0;
            getMenu().clear();
            inflateMenu(i);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        vf4.f(this, this.b);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            V();
            q0();
            final View c0 = c0();
            if (c0 != null && k99.P(c0)) {
                c0.post(new Runnable() { // from class: mb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BottomAppBar.g0(c0);
                    }
                });
            }
        }
        p0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.e = savedState.fabAlignmentMode;
        this.x = savedState.fabAttached;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.fabAlignmentMode = this.e;
        savedState.fabAttached = this.x;
        return savedState;
    }

    public void r0(int i, int i2) {
        this.u = i2;
        this.w = true;
        h0(i, this.x);
        i0(i);
        this.e = i;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        kv1.o(this.b, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().g(f2);
            this.b.invalidateSelf();
            q0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.b.V(f2);
        getBehavior().i(this, this.b.B() - this.b.A());
    }

    public void setFabAlignmentMode(int i) {
        r0(i, 0);
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.i != i) {
            this.i = i;
            q0();
        }
    }

    public void setFabAnchorMode(int i) {
        this.g = i;
        q0();
        View c0 = c0();
        if (c0 != null) {
            u0(this, c0);
            c0.requestLayout();
            this.b.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.f = i;
    }

    void setFabCornerSize(float f2) {
        if (f2 != getTopEdgeTreatment().d()) {
            getTopEdgeTreatment().h(f2);
            this.b.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().i(f2);
            this.b.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().k(f2);
            this.b.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.l = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.j != i) {
            this.j = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                s0(actionMenuView, this.e, f0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(j0(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.a = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BottomAppBar(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.y == null) {
            this.y = new Behavior();
        }
        return this.y;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final Rect m;
        private WeakReference n;
        private int r;
        private final View.OnLayoutChangeListener s;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.s = new a();
            this.m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.n = new WeakReference(bottomAppBar);
            View c0 = bottomAppBar.c0();
            if (c0 != null && !k99.P(c0)) {
                BottomAppBar.u0(bottomAppBar, c0);
                this.r = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) c0.getLayoutParams())).bottomMargin;
                c0.addOnLayoutChangeListener(this.s);
                bottomAppBar.q0();
            }
            coordinatorLayout.C(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.s = new a();
            this.m = new Rect();
        }
    }
}
