package com.google.android.material.bottomsheet;

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
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.s3.internal.Constants;
import defpackage.fn6;
import defpackage.h3;
import defpackage.h30;
import defpackage.hg4;
import defpackage.k3;
import defpackage.k99;
import defpackage.kf4;
import defpackage.lc6;
import defpackage.nn6;
import defpackage.of4;
import defpackage.oo7;
import defpackage.pb9;
import defpackage.tf4;
import defpackage.uf4;
import defpackage.v99;
import defpackage.vj6;
import defpackage.zd6;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c implements kf4 {
    private static final int H0 = fn6.Widget_Design_BottomSheet_Modal;
    of4 A0;
    private boolean B;
    int B0;
    private int C0;
    boolean D0;
    private Map E0;
    final SparseIntArray F0;
    private final v99.c G0;
    private int H;
    private int L;
    private boolean M;
    private oo7 N;
    private boolean Q;
    private final h S;
    private ValueAnimator X;
    int Y;
    int Z;
    private int a;
    private boolean b;
    private boolean c;
    private float d;
    private int e;
    int e0;
    private int f;
    float f0;
    private boolean g;
    int g0;
    private int h;
    float h0;
    private int i;
    boolean i0;
    private uf4 j;
    private boolean j0;
    private ColorStateList k;
    private boolean k0;
    private int l;
    int l0;
    private int m;
    int m0;
    private int n;
    v99 n0;
    private boolean o0;
    private int p0;
    private boolean q0;
    private boolean r;
    private float r0;
    private boolean s;
    private int s0;
    private boolean t;
    int t0;
    private boolean u;
    int u0;
    WeakReference v0;
    private boolean w;
    WeakReference w0;
    private boolean x;
    WeakReference x0;
    private boolean y;
    private final ArrayList y0;
    private VelocityTracker z0;

    class a implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ int b;

        a(View view, int i) {
            this.a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.B0(this.a, this.b, false);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.u0(5);
            WeakReference weakReference = BottomSheetBehavior.this.v0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ((View) BottomSheetBehavior.this.v0.get()).requestLayout();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.j != null) {
                BottomSheetBehavior.this.j.X(floatValue);
            }
        }
    }

    class d implements pb9.d {
        final /* synthetic */ boolean a;

        d(boolean z) {
            this.a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
        @Override // pb9.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public defpackage.ch9 a(android.view.View r11, defpackage.ch9 r12, pb9.e r13) {
            /*
                r10 = this;
                int r0 = ch9.l.h()
                jl3 r0 = r12.f(r0)
                int r1 = ch9.l.e()
                jl3 r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.b
                com.google.android.material.bottomsheet.BottomSheetBehavior.p(r2, r3)
                boolean r2 = defpackage.pb9.i(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.q(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.i()
                com.google.android.material.bottomsheet.BottomSheetBehavior.s(r3, r6)
                int r3 = r13.d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.r(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.t(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.c
                goto L50
            L4e:
                int r4 = r13.a
            L50:
                int r6 = r0.a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.u(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.a
                goto L62
            L60:
                int r13 = r13.c
            L62:
                int r2 = r0.c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.v(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.w(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.f(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.d
                com.google.android.material.bottomsheet.BottomSheetBehavior.g(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.q(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.h(r10, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.a(android.view.View, ch9, pb9$e):ch9");
        }
    }

    class e extends v99.c {
        private long a;

        e() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.u0 + bottomSheetBehavior.O()) / 2;
        }

        @Override // v99.c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // v99.c
        public int b(View view, int i, int i2) {
            return hg4.b(i, BottomSheetBehavior.this.O(), e(view));
        }

        @Override // v99.c
        public int e(View view) {
            return BottomSheetBehavior.this.F() ? BottomSheetBehavior.this.u0 : BottomSheetBehavior.this.g0;
        }

        @Override // v99.c
        public void j(int i) {
            if (i == 1 && BottomSheetBehavior.this.k0) {
                BottomSheetBehavior.this.u0(1);
            }
        }

        @Override // v99.c
        public void k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.K(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            if (r7.b.w0(r0, (r9 * 100.0f) / r10.u0) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        
            if (r9 > r7.b.e0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.b.O()) < java.lang.Math.abs(r8.getTop() - r7.b.e0)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
        
            if (r7.b.z0() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
        
            if (java.lang.Math.abs(r9 - r7.b.Z) < java.lang.Math.abs(r9 - r7.b.g0)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010d, code lost:
        
            if (r7.b.z0() != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
        
            if (r7.b.z0() == false) goto L63;
         */
        @Override // v99.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e.l(android.view.View, float, float):void");
        }

        @Override // v99.c
        public boolean m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.l0;
            if (i2 == 1 || bottomSheetBehavior.D0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.B0 == i) {
                WeakReference weakReference = bottomSheetBehavior.x0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.v0;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class f implements k3 {
        final /* synthetic */ int a;

        f(int i) {
            this.a = i;
        }

        @Override // defpackage.k3
        public boolean a(View view, k3.a aVar) {
            BottomSheetBehavior.this.t0(this.a);
            return true;
        }
    }

    public static abstract class g {
        void a(View view) {
        }

        public abstract void b(View view, float f);

        public abstract void c(View view, int i);
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.S = new h(this, null);
        this.f0 = 0.5f;
        this.h0 = -1.0f;
        this.k0 = true;
        this.l0 = 4;
        this.m0 = 4;
        this.r0 = 0.1f;
        this.y0 = new ArrayList();
        this.C0 = -1;
        this.F0 = new SparseIntArray();
        this.G0 = new e();
    }

    private float A(float f2, RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f3 = radius;
            if (f3 > 0.0f && f2 > 0.0f) {
                return f3 / f2;
            }
        }
        return 0.0f;
    }

    private void B() {
        this.e0 = (int) (this.u0 * (1.0f - this.f0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(View view, int i, boolean z) {
        int R = R(i);
        v99 v99Var = this.n0;
        if (v99Var == null || (!z ? v99Var.H(view, view.getLeft(), R) : v99Var.F(view.getLeft(), R))) {
            u0(i);
            return;
        }
        u0(2);
        E0(i, true);
        this.S.c(i);
    }

    private float C() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        if (this.j == null || (weakReference = this.v0) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.v0.get();
        if (!T() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        float F = this.j.F();
        roundedCorner = rootWindowInsets.getRoundedCorner(0);
        float A = A(F, roundedCorner);
        float G = this.j.G();
        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
        return Math.max(A, A(G, roundedCorner2));
    }

    private void C0() {
        WeakReference weakReference = this.v0;
        if (weakReference != null) {
            D0((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.w0;
        if (weakReference2 != null) {
            D0((View) weakReference2.get(), 1);
        }
    }

    private int D() {
        int i;
        int i2;
        int i3;
        if (this.g) {
            i = Math.min(Math.max(this.h, this.u0 - ((this.t0 * 9) / 16)), this.s0);
            i2 = this.H;
        } else {
            if (!this.r && !this.s && (i3 = this.n) > 0) {
                return Math.max(this.f, i3 + this.i);
            }
            i = this.f;
            i2 = this.H;
        }
        return i + i2;
    }

    private void D0(View view, int i) {
        if (view == null) {
            return;
        }
        G(view, i);
        if (!this.b && this.l0 != 6) {
            this.F0.put(i, x(view, vj6.bottomsheet_action_expand_halfway, 6));
        }
        if (this.i0 && X() && this.l0 != 5) {
            b0(view, h3.a.y, 5);
        }
        int i2 = this.l0;
        if (i2 == 3) {
            b0(view, h3.a.x, this.b ? 4 : 6);
            return;
        }
        if (i2 == 4) {
            b0(view, h3.a.w, this.b ? 3 : 6);
        } else {
            if (i2 != 6) {
                return;
            }
            b0(view, h3.a.x, 4);
            b0(view, h3.a.w, 3);
        }
    }

    private float E(int i) {
        float f2;
        float f3;
        int i2 = this.g0;
        if (i > i2 || i2 == O()) {
            int i3 = this.g0;
            f2 = i3 - i;
            f3 = this.u0 - i3;
        } else {
            int i4 = this.g0;
            f2 = i4 - i;
            f3 = i4 - O();
        }
        return f2 / f3;
    }

    private void E0(int i, boolean z) {
        boolean U;
        ValueAnimator valueAnimator;
        if (i == 2 || this.Q == (U = U()) || this.j == null) {
            return;
        }
        this.Q = U;
        if (!z || (valueAnimator = this.X) == null) {
            ValueAnimator valueAnimator2 = this.X;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.X.cancel();
            }
            this.j.X(this.Q ? C() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.X.reverse();
        } else {
            this.X.setFloatValues(this.j.w(), U ? C() : 1.0f);
            this.X.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F() {
        return W() && X();
    }

    private void F0(boolean z) {
        Map map;
        WeakReference weakReference = this.v0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.E0 != null) {
                    return;
                } else {
                    this.E0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.v0.get()) {
                    if (z) {
                        this.E0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.c) {
                            k99.v0(childAt, 4);
                        }
                    } else if (this.c && (map = this.E0) != null && map.containsKey(childAt)) {
                        k99.v0(childAt, ((Integer) this.E0.get(childAt)).intValue());
                    }
                }
            }
            if (!z) {
                this.E0 = null;
            } else if (this.c) {
                ((View) this.v0.get()).sendAccessibilityEvent(8);
            }
        }
    }

    private void G(View view, int i) {
        if (view == null) {
            return;
        }
        k99.f0(view, 524288);
        k99.f0(view, 262144);
        k99.f0(view, Constants.MB);
        int i2 = this.F0.get(i, -1);
        if (i2 != -1) {
            k99.f0(view, i2);
            this.F0.delete(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(boolean z) {
        View view;
        if (this.v0 != null) {
            z();
            if (this.l0 != 4 || (view = (View) this.v0.get()) == null) {
                return;
            }
            if (z) {
                t0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private k3 H(int i) {
        return new f(i);
    }

    private void I(Context context) {
        if (this.N == null) {
            return;
        }
        uf4 uf4Var = new uf4(this.N);
        this.j = uf4Var;
        uf4Var.M(context);
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            this.j.W(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.j.setTint(typedValue.data);
    }

    private void J() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(C(), 1.0f);
        this.X = ofFloat;
        ofFloat.setDuration(500L);
        this.X.addUpdateListener(new c());
    }

    public static BottomSheetBehavior M(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c e2 = ((CoordinatorLayout.f) layoutParams).e();
        if (e2 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) e2;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int N(int i, int i2, int i3, int i4) {
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

    private int R(int i) {
        if (i == 3) {
            return O();
        }
        if (i == 4) {
            return this.g0;
        }
        if (i == 5) {
            return this.u0;
        }
        if (i == 6) {
            return this.e0;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    private float S() {
        VelocityTracker velocityTracker = this.z0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, this.d);
        return this.z0.getYVelocity(this.B0);
    }

    private boolean T() {
        WeakReference weakReference = this.v0;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.v0.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean U() {
        return this.l0 == 3 && (this.M || T());
    }

    private boolean Y(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && k99.O(view);
    }

    private void b0(View view, h3.a aVar, int i) {
        k99.h0(view, aVar, null, H(i));
    }

    private void c0() {
        this.B0 = -1;
        this.C0 = -1;
        VelocityTracker velocityTracker = this.z0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.z0 = null;
        }
    }

    private void d0(SavedState savedState) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f = savedState.peekHeight;
        }
        if (i == -1 || (i & 2) == 2) {
            this.b = savedState.fitToContents;
        }
        if (i == -1 || (i & 4) == 4) {
            this.i0 = savedState.hideable;
        }
        if (i == -1 || (i & 8) == 8) {
            this.j0 = savedState.skipCollapsed;
        }
    }

    private void e0(View view, Runnable runnable) {
        if (Y(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void v0(View view) {
        boolean z = (V() || this.g) ? false : true;
        if (this.s || this.t || this.u || this.x || this.y || this.B || z) {
            pb9.c(view, new d(z));
        }
    }

    private int x(View view, int i, int i2) {
        return k99.c(view, view.getResources().getString(i), H(i2));
    }

    private boolean x0() {
        return this.n0 != null && (this.k0 || this.l0 == 1);
    }

    private void z() {
        int D = D();
        if (this.b) {
            this.g0 = Math.max(this.u0 - D, this.Z);
        } else {
            this.g0 = this.u0 - D;
        }
    }

    public boolean A0() {
        return true;
    }

    void K(int i) {
        View view = (View) this.v0.get();
        if (view == null || this.y0.isEmpty()) {
            return;
        }
        float E = E(i);
        for (int i2 = 0; i2 < this.y0.size(); i2++) {
            ((g) this.y0.get(i2)).b(view, E);
        }
    }

    View L(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (k99.Q(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View L = L(viewGroup.getChildAt(i));
                if (L != null) {
                    return L;
                }
            }
        }
        return null;
    }

    public int O() {
        if (this.b) {
            return this.Z;
        }
        return Math.max(this.Y, this.w ? 0 : this.L);
    }

    uf4 P() {
        return this.j;
    }

    public int Q() {
        return this.l0;
    }

    public boolean V() {
        return this.r;
    }

    public boolean W() {
        return this.i0;
    }

    public boolean X() {
        return true;
    }

    public boolean Z() {
        return true;
    }

    @Override // defpackage.kf4
    public void a(h30 h30Var) {
        of4 of4Var = this.A0;
        if (of4Var == null) {
            return;
        }
        of4Var.j(h30Var);
    }

    public void a0(g gVar) {
        this.y0.remove(gVar);
    }

    @Override // defpackage.kf4
    public void b() {
        of4 of4Var = this.A0;
        if (of4Var == null) {
            return;
        }
        of4Var.f();
    }

    @Override // defpackage.kf4
    public void c() {
        of4 of4Var = this.A0;
        if (of4Var == null) {
            return;
        }
        h30 c2 = of4Var.c();
        if (c2 == null || Build.VERSION.SDK_INT < 34) {
            t0(this.i0 ? 5 : 4);
        } else if (this.i0) {
            this.A0.h(c2, new b());
        } else {
            this.A0.i(c2, null);
            t0(4);
        }
    }

    @Override // defpackage.kf4
    public void d(h30 h30Var) {
        of4 of4Var = this.A0;
        if (of4Var == null) {
            return;
        }
        of4Var.l(h30Var);
    }

    public void f0(g gVar) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.y0.clear();
        if (gVar != null) {
            this.y0.add(gVar);
        }
    }

    public void g0(boolean z) {
        this.k0 = z;
    }

    public void h0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.Y = i;
        E0(this.l0, true);
    }

    public void i0(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.v0 != null) {
            z();
        }
        u0((this.b && this.l0 == 6) ? 3 : this.l0);
        E0(this.l0, true);
        C0();
    }

    public void j0(boolean z) {
        this.r = z;
    }

    public void k0(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f0 = f2;
        if (this.v0 != null) {
            B();
        }
    }

    public void l0(boolean z) {
        if (this.i0 != z) {
            this.i0 = z;
            if (!z && this.l0 == 5) {
                t0(4);
            }
            C0();
        }
    }

    public void m0(int i) {
        this.m = i;
    }

    public void n0(int i) {
        this.l = i;
    }

    public void o0(int i) {
        p0(i, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.v0 = null;
        this.n0 = null;
        this.A0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.v0 = null;
        this.n0 = null;
        this.A0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        v99 v99Var;
        if (!view.isShown() || !this.k0) {
            this.o0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c0();
        }
        if (this.z0 == null) {
            this.z0 = VelocityTracker.obtain();
        }
        this.z0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.C0 = (int) motionEvent.getY();
            if (this.l0 != 2) {
                WeakReference weakReference = this.x0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.v(view2, x, this.C0)) {
                    this.B0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.D0 = true;
                }
            }
            this.o0 = this.B0 == -1 && !coordinatorLayout.v(view, x, this.C0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.D0 = false;
            this.B0 = -1;
            if (this.o0) {
                this.o0 = false;
                return false;
            }
        }
        if (!this.o0 && (v99Var = this.n0) != null && v99Var.G(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.x0;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.o0 || this.l0 == 1 || coordinatorLayout.v(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.n0 == null || (i = this.C0) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.n0.u())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (k99.u(coordinatorLayout) && !k99.u(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.v0 == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(zd6.design_bottom_sheet_peek_height_min);
            v0(view);
            k99.F0(view, new com.google.android.material.bottomsheet.c(view));
            this.v0 = new WeakReference(view);
            this.A0 = new of4(view);
            uf4 uf4Var = this.j;
            if (uf4Var != null) {
                k99.p0(view, uf4Var);
                uf4 uf4Var2 = this.j;
                float f2 = this.h0;
                if (f2 == -1.0f) {
                    f2 = k99.s(view);
                }
                uf4Var2.V(f2);
            } else {
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    k99.q0(view, colorStateList);
                }
            }
            C0();
            if (k99.v(view) == 0) {
                k99.v0(view, 1);
            }
        }
        if (this.n0 == null) {
            this.n0 = v99.m(coordinatorLayout, this.G0);
        }
        int top = view.getTop();
        coordinatorLayout.C(view, i);
        this.t0 = coordinatorLayout.getWidth();
        this.u0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.s0 = height;
        int i2 = this.u0;
        int i3 = i2 - height;
        int i4 = this.L;
        if (i3 < i4) {
            if (this.w) {
                int i5 = this.m;
                if (i5 != -1) {
                    i2 = Math.min(i2, i5);
                }
                this.s0 = i2;
            } else {
                int i6 = i2 - i4;
                int i7 = this.m;
                if (i7 != -1) {
                    i6 = Math.min(i6, i7);
                }
                this.s0 = i6;
            }
        }
        this.Z = Math.max(0, this.u0 - this.s0);
        B();
        z();
        int i8 = this.l0;
        if (i8 == 3) {
            k99.W(view, O());
        } else if (i8 == 6) {
            k99.W(view, this.e0);
        } else if (this.i0 && i8 == 5) {
            k99.W(view, this.u0);
        } else if (i8 == 4) {
            k99.W(view, this.g0);
        } else if (i8 == 1 || i8 == 2) {
            k99.W(view, top - view.getTop());
        }
        E0(this.l0, false);
        this.x0 = new WeakReference(L(view));
        for (int i9 = 0; i9 < this.y0.size(); i9++) {
            ((g) this.y0.get(i9)).a(view);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(N(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.l, marginLayoutParams.width), N(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.m, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f2, float f3) {
        WeakReference weakReference;
        if (Z() && (weakReference = this.x0) != null && view2 == weakReference.get()) {
            return this.l0 != 3 || super.onNestedPreFling(coordinatorLayout, view, view2, f2, f3);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.x0;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!Z() || view2 == view3) {
            int top = view.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < O()) {
                    int O = top - O();
                    iArr[1] = O;
                    k99.W(view, -O);
                    u0(3);
                } else {
                    if (!this.k0) {
                        return;
                    }
                    iArr[1] = i2;
                    k99.W(view, -i2);
                    u0(1);
                }
            } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                if (i4 > this.g0 && !F()) {
                    int i5 = top - this.g0;
                    iArr[1] = i5;
                    k99.W(view, -i5);
                    u0(4);
                } else {
                    if (!this.k0) {
                        return;
                    }
                    iArr[1] = i2;
                    k99.W(view, -i2);
                    u0(1);
                }
            }
            K(view.getTop());
            this.p0 = i2;
            this.q0 = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, view, savedState.a());
        d0(savedState);
        int i = savedState.state;
        if (i == 1 || i == 2) {
            this.l0 = 4;
            this.m0 = 4;
        } else {
            this.l0 = i;
            this.m0 = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, view), this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.p0 = 0;
        this.q0 = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r4.getTop() <= r2.e0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.Z) < java.lang.Math.abs(r3 - r2.g0)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (z0() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.g0)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.e0) < java.lang.Math.abs(r3 - r2.g0)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.O()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.u0(r0)
            return
        Lf:
            boolean r3 = r2.Z()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.x0
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.q0
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.p0
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.e0
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.i0
            if (r3 == 0) goto L49
            float r3 = r2.S()
            boolean r3 = r2.y0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.p0
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L68
            int r5 = r2.Z
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.g0
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.e0
            if (r3 >= r1) goto L7e
            int r1 = r2.g0
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.z0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.g0
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.e0
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.g0
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.B0(r4, r0, r3)
            r2.q0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.l0 == 1 && actionMasked == 0) {
            return true;
        }
        if (x0()) {
            this.n0.z(motionEvent);
        }
        if (actionMasked == 0) {
            c0();
        }
        if (this.z0 == null) {
            this.z0 = VelocityTracker.obtain();
        }
        this.z0.addMovement(motionEvent);
        if (x0() && actionMasked == 2 && !this.o0 && Math.abs(this.C0 - motionEvent.getY()) > this.n0.u()) {
            this.n0.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.o0;
    }

    public final void p0(int i, boolean z) {
        if (i == -1) {
            if (this.g) {
                return;
            } else {
                this.g = true;
            }
        } else {
            if (!this.g && this.f == i) {
                return;
            }
            this.g = false;
            this.f = Math.max(0, i);
        }
        G0(z);
    }

    public void q0(int i) {
        this.a = i;
    }

    public void r0(int i) {
        this.e = i;
    }

    public void s0(boolean z) {
        this.j0 = z;
    }

    public void t0(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.i0 && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.b && R(i) <= this.Z) ? 3 : i;
        WeakReference weakReference = this.v0;
        if (weakReference == null || weakReference.get() == null) {
            u0(i);
        } else {
            View view = (View) this.v0.get();
            e0(view, new a(view, i2));
        }
    }

    void u0(int i) {
        View view;
        if (this.l0 == i) {
            return;
        }
        this.l0 = i;
        if (i == 4 || i == 3 || i == 6 || (this.i0 && i == 5)) {
            this.m0 = i;
        }
        WeakReference weakReference = this.v0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            F0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            F0(false);
        }
        E0(i, true);
        for (int i2 = 0; i2 < this.y0.size(); i2++) {
            ((g) this.y0.get(i2)).c(view, i);
        }
        C0();
    }

    public boolean w0(long j, float f2) {
        return false;
    }

    public void y(g gVar) {
        if (this.y0.contains(gVar)) {
            return;
        }
        this.y0.add(gVar);
    }

    boolean y0(View view, float f2) {
        if (this.j0) {
            return true;
        }
        if (X() && view.getTop() >= this.g0) {
            return Math.abs((((float) view.getTop()) + (f2 * this.r0)) - ((float) this.g0)) / ((float) D()) > 0.5f;
        }
        return false;
    }

    public boolean z0() {
        return false;
    }

    private class h {
        private int a;
        private boolean b;
        private final Runnable c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.b = false;
                v99 v99Var = BottomSheetBehavior.this.n0;
                if (v99Var != null && v99Var.k(true)) {
                    h hVar = h.this;
                    hVar.c(hVar.a);
                    return;
                }
                h hVar2 = h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.l0 == 2) {
                    bottomSheetBehavior.u0(hVar2.a);
                }
            }
        }

        private h() {
            this.c = new a();
        }

        void c(int i) {
            WeakReference weakReference = BottomSheetBehavior.this.v0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            k99.d0((View) BottomSheetBehavior.this.v0.get(), this.c);
            this.b = true;
        }

        /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
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
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.l0;
            this.peekHeight = bottomSheetBehavior.f;
            this.fitToContents = bottomSheetBehavior.b;
            this.hideable = bottomSheetBehavior.i0;
            this.skipCollapsed = bottomSheetBehavior.j0;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.S = new h(this, null);
        this.f0 = 0.5f;
        this.h0 = -1.0f;
        this.k0 = true;
        this.l0 = 4;
        this.m0 = 4;
        this.r0 = 0.1f;
        this.y0 = new ArrayList();
        this.C0 = -1;
        this.F0 = new SparseIntArray();
        this.G0 = new e();
        this.i = context.getResources().getDimensionPixelSize(zd6.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nn6.BottomSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(nn6.BottomSheetBehavior_Layout_backgroundTint)) {
            this.k = tf4.a(context, obtainStyledAttributes, nn6.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(nn6.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.N = oo7.e(context, attributeSet, lc6.bottomSheetStyle, H0).m();
        }
        I(context);
        J();
        this.h0 = obtainStyledAttributes.getDimension(nn6.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (obtainStyledAttributes.hasValue(nn6.BottomSheetBehavior_Layout_android_maxWidth)) {
            n0(obtainStyledAttributes.getDimensionPixelSize(nn6.BottomSheetBehavior_Layout_android_maxWidth, -1));
        }
        if (obtainStyledAttributes.hasValue(nn6.BottomSheetBehavior_Layout_android_maxHeight)) {
            m0(obtainStyledAttributes.getDimensionPixelSize(nn6.BottomSheetBehavior_Layout_android_maxHeight, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(nn6.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && (i = peekValue.data) == -1) {
            o0(i);
        } else {
            o0(obtainStyledAttributes.getDimensionPixelSize(nn6.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        l0(obtainStyledAttributes.getBoolean(nn6.BottomSheetBehavior_Layout_behavior_hideable, false));
        j0(obtainStyledAttributes.getBoolean(nn6.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        i0(obtainStyledAttributes.getBoolean(nn6.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        s0(obtainStyledAttributes.getBoolean(nn6.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        g0(obtainStyledAttributes.getBoolean(nn6.BottomSheetBehavior_Layout_behavior_draggable, true));
        q0(obtainStyledAttributes.getInt(nn6.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        k0(obtainStyledAttributes.getFloat(nn6.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(nn6.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 != null && peekValue2.type == 16) {
            h0(peekValue2.data);
        } else {
            h0(obtainStyledAttributes.getDimensionPixelOffset(nn6.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        r0(obtainStyledAttributes.getInt(nn6.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.s = obtainStyledAttributes.getBoolean(nn6.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.t = obtainStyledAttributes.getBoolean(nn6.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.u = obtainStyledAttributes.getBoolean(nn6.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.w = obtainStyledAttributes.getBoolean(nn6.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.x = obtainStyledAttributes.getBoolean(nn6.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.y = obtainStyledAttributes.getBoolean(nn6.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.B = obtainStyledAttributes.getBoolean(nn6.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.M = obtainStyledAttributes.getBoolean(nn6.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
