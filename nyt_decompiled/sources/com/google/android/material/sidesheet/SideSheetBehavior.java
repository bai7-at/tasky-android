package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.material.sidesheet.SideSheetBehavior;
import defpackage.fn6;
import defpackage.h3;
import defpackage.h30;
import defpackage.hg4;
import defpackage.hi;
import defpackage.k3;
import defpackage.k99;
import defpackage.kf4;
import defpackage.lh4;
import defpackage.nn6;
import defpackage.oo7;
import defpackage.p23;
import defpackage.tf4;
import defpackage.uf4;
import defpackage.v99;
import defpackage.vj6;
import defpackage.wf4;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c implements kf4 {
    private static final int N = vj6.side_sheet_accessibility_pane_title;
    private static final int Q = fn6.Widget_Material3_SideSheet;
    private wf4 B;
    private int H;
    private final Set L;
    private final v99.c M;
    private com.google.android.material.sidesheet.c a;
    private float b;
    private uf4 c;
    private ColorStateList d;
    private oo7 e;
    private final c f;
    private float g;
    private boolean h;
    private int i;
    private int j;
    private v99 k;
    private boolean l;
    private float m;
    private int n;
    private int r;
    private int s;
    private int t;
    private WeakReference u;
    private WeakReference w;
    private int x;
    private VelocityTracker y;

    class a extends v99.c {
        a() {
        }

        @Override // v99.c
        public int a(View view, int i, int i2) {
            return hg4.b(i, SideSheetBehavior.this.a.g(), SideSheetBehavior.this.a.f());
        }

        @Override // v99.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // v99.c
        public int d(View view) {
            return SideSheetBehavior.this.n + SideSheetBehavior.this.G();
        }

        @Override // v99.c
        public void j(int i) {
            if (i == 1 && SideSheetBehavior.this.h) {
                SideSheetBehavior.this.f0(1);
            }
        }

        @Override // v99.c
        public void k(View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View B = SideSheetBehavior.this.B();
            if (B != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) B.getLayoutParams()) != null) {
                SideSheetBehavior.this.a.p(marginLayoutParams, view.getLeft(), view.getRight());
                B.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.w(view, i);
        }

        @Override // v99.c
        public void l(View view, float f, float f2) {
            int s = SideSheetBehavior.this.s(view, f, f2);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.k0(view, s, sideSheetBehavior.j0());
        }

        @Override // v99.c
        public boolean m(View view, int i) {
            return (SideSheetBehavior.this.i == 1 || SideSheetBehavior.this.u == null || SideSheetBehavior.this.u.get() != view) ? false : true;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.f0(5);
            if (SideSheetBehavior.this.u == null || SideSheetBehavior.this.u.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.u.get()).requestLayout();
        }
    }

    class c {
        private int a;
        private boolean b;
        private final Runnable c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.this.c();
            }
        };

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.b = false;
            if (SideSheetBehavior.this.k != null && SideSheetBehavior.this.k.k(true)) {
                b(this.a);
            } else if (SideSheetBehavior.this.i == 2) {
                SideSheetBehavior.this.f0(this.a);
            }
        }

        void b(int i) {
            if (SideSheetBehavior.this.u == null || SideSheetBehavior.this.u.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            k99.d0((View) SideSheetBehavior.this.u.get(), this.c);
            this.b = true;
        }
    }

    public SideSheetBehavior() {
        this.f = new c();
        this.h = true;
        this.i = 5;
        this.j = 5;
        this.m = 0.1f;
        this.x = -1;
        this.L = new LinkedHashSet();
        this.M = new a();
    }

    private ValueAnimator.AnimatorUpdateListener A() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View B = B();
        if (B == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) B.getLayoutParams()) == null) {
            return null;
        }
        final int c2 = this.a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: xr7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.this.U(marginLayoutParams, c2, B, valueAnimator);
            }
        };
    }

    private int D() {
        com.google.android.material.sidesheet.c cVar = this.a;
        return (cVar == null || cVar.j() == 0) ? 5 : 3;
    }

    private CoordinatorLayout.f M() {
        View view;
        WeakReference weakReference = this.u;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) view.getLayoutParams();
    }

    private boolean N() {
        CoordinatorLayout.f M = M();
        return M != null && ((ViewGroup.MarginLayoutParams) M).leftMargin > 0;
    }

    private boolean O() {
        CoordinatorLayout.f M = M();
        return M != null && ((ViewGroup.MarginLayoutParams) M).rightMargin > 0;
    }

    private boolean P(MotionEvent motionEvent) {
        return g0() && r((float) this.H, motionEvent.getX()) > ((float) this.k.u());
    }

    private boolean Q(float f) {
        return this.a.k(f);
    }

    private boolean R(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && k99.O(view);
    }

    private boolean S(View view, int i, boolean z) {
        int H = H(i);
        v99 L = L();
        return L != null && (!z ? !L.H(view, H, view.getTop()) : !L.F(H, view.getTop()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean T(int i, View view, k3.a aVar) {
        e0(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view, ValueAnimator valueAnimator) {
        this.a.o(marginLayoutParams, hi.c(i, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(int i) {
        View view = (View) this.u.get();
        if (view != null) {
            k0(view, i, false);
        }
    }

    private void W(CoordinatorLayout coordinatorLayout) {
        int i;
        View findViewById;
        if (this.w != null || (i = this.x) == -1 || (findViewById = coordinatorLayout.findViewById(i)) == null) {
            return;
        }
        this.w = new WeakReference(findViewById);
    }

    private void X(View view, h3.a aVar, int i) {
        k99.h0(view, aVar, null, u(i));
    }

    private void Y() {
        VelocityTracker velocityTracker = this.y;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.y = null;
        }
    }

    private void Z(View view, Runnable runnable) {
        if (R(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void c0(int i) {
        com.google.android.material.sidesheet.c cVar = this.a;
        if (cVar == null || cVar.j() != i) {
            if (i == 0) {
                this.a = new com.google.android.material.sidesheet.b(this);
                if (this.e == null || O()) {
                    return;
                }
                oo7.b v = this.e.v();
                v.F(0.0f).w(0.0f);
                n0(v.m());
                return;
            }
            if (i == 1) {
                this.a = new com.google.android.material.sidesheet.a(this);
                if (this.e == null || N()) {
                    return;
                }
                oo7.b v2 = this.e.v();
                v2.B(0.0f).s(0.0f);
                n0(v2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i + ". Must be 0 or 1" + InstructionFileId.DOT);
        }
    }

    private void d0(View view, int i) {
        c0(p23.b(((CoordinatorLayout.f) view.getLayoutParams()).c, i) == 3 ? 1 : 0);
    }

    private boolean g0() {
        return this.k != null && (this.h || this.i == 1);
    }

    private boolean i0(View view) {
        return (view.isShown() || k99.m(view) != null) && this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(View view, int i, boolean z) {
        if (!S(view, i, z)) {
            f0(i);
        } else {
            f0(2);
            this.f.b(i);
        }
    }

    private void l0() {
        View view;
        WeakReference weakReference = this.u;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        k99.f0(view, 262144);
        k99.f0(view, Constants.MB);
        if (this.i != 5) {
            X(view, h3.a.y, 5);
        }
        if (this.i != 3) {
            X(view, h3.a.w, 3);
        }
    }

    private void m0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.u;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.u.get();
        View B = B();
        if (B == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) B.getLayoutParams()) == null) {
            return;
        }
        this.a.o(marginLayoutParams, (int) ((this.n * view.getScaleX()) + this.t));
        B.requestLayout();
    }

    private void n0(oo7 oo7Var) {
        uf4 uf4Var = this.c;
        if (uf4Var != null) {
            uf4Var.setShapeAppearanceModel(oo7Var);
        }
    }

    private void o0(View view) {
        int i = this.i == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    private int q(int i, View view) {
        int i2 = this.i;
        if (i2 == 1 || i2 == 2) {
            return i - this.a.h(view);
        }
        if (i2 == 3) {
            return 0;
        }
        if (i2 == 5) {
            return this.a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.i);
    }

    private float r(float f, float f2) {
        return Math.abs(f - f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int s(View view, float f, float f2) {
        if (Q(f)) {
            return 3;
        }
        if (h0(view, f)) {
            if (!this.a.m(f, f2) && !this.a.l(view)) {
                return 3;
            }
        } else if (f == 0.0f || !d.a(f, f2)) {
            int left = view.getLeft();
            if (Math.abs(left - C()) < Math.abs(left - this.a.e())) {
                return 3;
            }
        }
        return 5;
    }

    private void t() {
        WeakReference weakReference = this.w;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.w = null;
    }

    private k3 u(final int i) {
        return new k3() { // from class: vr7
            @Override // defpackage.k3
            public final boolean a(View view, k3.a aVar) {
                boolean T;
                T = SideSheetBehavior.this.T(i, view, aVar);
                return T;
            }
        };
    }

    private void v(Context context) {
        if (this.e == null) {
            return;
        }
        uf4 uf4Var = new uf4(this.e);
        this.c = uf4Var;
        uf4Var.M(context);
        ColorStateList colorStateList = this.d;
        if (colorStateList != null) {
            this.c.W(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(View view, int i) {
        if (this.L.isEmpty()) {
            return;
        }
        this.a.b(i);
        Iterator it2 = this.L.iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
    }

    private void x(View view) {
        if (k99.m(view) == null) {
            k99.o0(view, view.getResources().getString(N));
        }
    }

    private int y(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, RecyclerView.UNDEFINED_DURATION);
    }

    public View B() {
        WeakReference weakReference = this.w;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int C() {
        return this.a.d();
    }

    public float E() {
        return this.m;
    }

    float F() {
        return 0.5f;
    }

    int G() {
        return this.t;
    }

    int H(int i) {
        if (i == 3) {
            return C();
        }
        if (i == 5) {
            return this.a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i);
    }

    int I() {
        return this.s;
    }

    int J() {
        return this.r;
    }

    int K() {
        return 500;
    }

    v99 L() {
        return this.k;
    }

    @Override // defpackage.kf4
    public void a(h30 h30Var) {
        wf4 wf4Var = this.B;
        if (wf4Var == null) {
            return;
        }
        wf4Var.j(h30Var);
    }

    public void a0(int i) {
        this.x = i;
        t();
        WeakReference weakReference = this.u;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i == -1 || !k99.P(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.kf4
    public void b() {
        wf4 wf4Var = this.B;
        if (wf4Var == null) {
            return;
        }
        wf4Var.f();
    }

    public void b0(boolean z) {
        this.h = z;
    }

    @Override // defpackage.kf4
    public void c() {
        wf4 wf4Var = this.B;
        if (wf4Var == null) {
            return;
        }
        h30 c2 = wf4Var.c();
        if (c2 == null || Build.VERSION.SDK_INT < 34) {
            e0(5);
        } else {
            this.B.h(c2, D(), new b(), A());
        }
    }

    @Override // defpackage.kf4
    public void d(h30 h30Var) {
        wf4 wf4Var = this.B;
        if (wf4Var == null) {
            return;
        }
        wf4Var.l(h30Var, D());
        m0();
    }

    public void e0(final int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.u;
        if (weakReference == null || weakReference.get() == null) {
            f0(i);
        } else {
            Z((View) this.u.get(), new Runnable() { // from class: wr7
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.this.V(i);
                }
            });
        }
    }

    void f0(int i) {
        View view;
        if (this.i == i) {
            return;
        }
        this.i = i;
        if (i == 3 || i == 5) {
            this.j = i;
        }
        WeakReference weakReference = this.u;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        o0(view);
        Iterator it2 = this.L.iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
        l0();
    }

    boolean h0(View view, float f) {
        return this.a.n(view, f);
    }

    public boolean j0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.u = null;
        this.k = null;
        this.B = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.u = null;
        this.k = null;
        this.B = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        v99 v99Var;
        if (!i0(view)) {
            this.l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Y();
        }
        if (this.y == null) {
            this.y = VelocityTracker.obtain();
        }
        this.y.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.H = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.l) {
            this.l = false;
            return false;
        }
        return (this.l || (v99Var = this.k) == null || !v99Var.G(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (k99.u(coordinatorLayout) && !k99.u(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.u == null) {
            this.u = new WeakReference(view);
            this.B = new wf4(view);
            uf4 uf4Var = this.c;
            if (uf4Var != null) {
                k99.p0(view, uf4Var);
                uf4 uf4Var2 = this.c;
                float f = this.g;
                if (f == -1.0f) {
                    f = k99.s(view);
                }
                uf4Var2.V(f);
            } else {
                ColorStateList colorStateList = this.d;
                if (colorStateList != null) {
                    k99.q0(view, colorStateList);
                }
            }
            o0(view);
            l0();
            if (k99.v(view) == 0) {
                k99.v0(view, 1);
            }
            x(view);
        }
        d0(view, i);
        if (this.k == null) {
            this.k = v99.m(coordinatorLayout, this.M);
        }
        int h = this.a.h(view);
        coordinatorLayout.C(view, i);
        this.r = coordinatorLayout.getWidth();
        this.s = this.a.i(coordinatorLayout);
        this.n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.t = marginLayoutParams != null ? this.a.a(marginLayoutParams) : 0;
        k99.V(view, q(h, view));
        W(coordinatorLayout);
        Iterator it2 = this.L.iterator();
        while (it2.hasNext()) {
            lh4.a(it2.next());
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(y(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), y(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.a() != null) {
            super.onRestoreInstanceState(coordinatorLayout, view, savedState.a());
        }
        int i = savedState.state;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.i = i;
        this.j = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, view), this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.i == 1 && actionMasked == 0) {
            return true;
        }
        if (g0()) {
            this.k.z(motionEvent);
        }
        if (actionMasked == 0) {
            Y();
        }
        if (this.y == null) {
            this.y = VelocityTracker.obtain();
        }
        this.y.addMovement(motionEvent);
        if (g0() && actionMasked == 2 && !this.l && P(motionEvent)) {
            this.k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.l;
    }

    int z() {
        return this.n;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        final int state;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.state = sideSheetBehavior.i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new c();
        this.h = true;
        this.i = 5;
        this.j = 5;
        this.m = 0.1f;
        this.x = -1;
        this.L = new LinkedHashSet();
        this.M = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nn6.SideSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(nn6.SideSheetBehavior_Layout_backgroundTint)) {
            this.d = tf4.a(context, obtainStyledAttributes, nn6.SideSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(nn6.SideSheetBehavior_Layout_shapeAppearance)) {
            this.e = oo7.e(context, attributeSet, 0, Q).m();
        }
        if (obtainStyledAttributes.hasValue(nn6.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            a0(obtainStyledAttributes.getResourceId(nn6.SideSheetBehavior_Layout_coplanarSiblingViewId, -1));
        }
        v(context);
        this.g = obtainStyledAttributes.getDimension(nn6.SideSheetBehavior_Layout_android_elevation, -1.0f);
        b0(obtainStyledAttributes.getBoolean(nn6.SideSheetBehavior_Layout_behavior_draggable, true));
        obtainStyledAttributes.recycle();
        this.b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
