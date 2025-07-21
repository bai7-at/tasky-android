package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.al;
import defpackage.be5;
import defpackage.ch9;
import defpackage.fn6;
import defpackage.h3;
import defpackage.h35;
import defpackage.hg4;
import defpackage.hi;
import defpackage.ic5;
import defpackage.k99;
import defpackage.kv1;
import defpackage.lc6;
import defpackage.lh4;
import defpackage.nn6;
import defpackage.qf4;
import defpackage.tv1;
import defpackage.uf4;
import defpackage.vf4;
import defpackage.w2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int N = fn6.Widget_Design_AppBarLayout;
    private Drawable B;
    private Integer H;
    private final float L;
    private Behavior M;
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private ch9 g;
    private List h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private WeakReference n;
    private final boolean r;
    private ValueAnimator s;
    private ValueAnimator.AnimatorUpdateListener t;
    private final List u;
    private final long w;
    private final TimeInterpolator x;
    private int[] y;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a {
        private int k;
        private int l;
        private ValueAnimator m;
        private SavedState n;
        private WeakReference r;

        class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ CoordinatorLayout a;
            final /* synthetic */ AppBarLayout b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.a = coordinatorLayout;
                this.b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.p(this.a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends w2 {
            final /* synthetic */ AppBarLayout d;
            final /* synthetic */ CoordinatorLayout e;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.d = appBarLayout;
                this.e = coordinatorLayout;
            }

            @Override // defpackage.w2
            public void g(View view, h3 h3Var) {
                View F;
                super.g(view, h3Var);
                h3Var.e0(ScrollView.class.getName());
                if (this.d.getTotalScrollRange() == 0 || (F = BaseBehavior.this.F(this.e)) == null || !BaseBehavior.this.B(this.d)) {
                    return;
                }
                if (BaseBehavior.this.m() != (-this.d.getTotalScrollRange())) {
                    h3Var.b(h3.a.q);
                    h3Var.G0(true);
                }
                if (BaseBehavior.this.m() != 0) {
                    if (!F.canScrollVertically(-1)) {
                        h3Var.b(h3.a.r);
                        h3Var.G0(true);
                    } else if ((-this.d.getDownNestedPreScrollRange()) != 0) {
                        h3Var.b(h3.a.r);
                        h3Var.G0(true);
                    }
                }
            }

            @Override // defpackage.w2
            public boolean k(View view, int i, Bundle bundle) {
                if (i == 4096) {
                    this.d.setExpanded(false);
                    return true;
                }
                if (i != 8192) {
                    return super.k(view, i, bundle);
                }
                if (BaseBehavior.this.m() != 0) {
                    View F = BaseBehavior.this.F(this.e);
                    if (!F.canScrollVertically(-1)) {
                        this.d.setExpanded(true);
                        return true;
                    }
                    int i2 = -this.d.getDownNestedPreScrollRange();
                    if (i2 != 0) {
                        BaseBehavior.this.onNestedPreScroll(this.e, this.d, F, 0, i2, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        private static boolean A(int i, int i2) {
            return (i & i2) == i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean B(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((e) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View C(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof h35) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View D(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int E(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (A(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View F(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).e() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int I(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator d = eVar.d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (d != null) {
                    int c = eVar.c();
                    if ((c & 1) != 0) {
                        i2 = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                        if ((c & 2) != 0) {
                            i2 -= k99.y(childAt);
                        }
                    }
                    if (k99.u(childAt)) {
                        i2 -= appBarLayout.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * d.getInterpolation((abs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        private boolean V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List m = coordinatorLayout.m(appBarLayout);
            int size = m.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.c e = ((CoordinatorLayout.f) ((View) m.get(i)).getLayoutParams()).e();
                if (e instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) e).k() != 0;
                }
            }
            return false;
        }

        private void W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int m = m() - topInset;
            int E = E(appBarLayout, m);
            if (E >= 0) {
                View childAt = appBarLayout.getChildAt(E);
                e eVar = (e) childAt.getLayoutParams();
                int c = eVar.c();
                if ((c & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (E == 0 && k99.u(appBarLayout) && k99.u(childAt)) {
                        i -= appBarLayout.getTopInset();
                    }
                    if (A(c, 2)) {
                        i2 += k99.y(childAt);
                    } else if (A(c, 5)) {
                        int y = k99.y(childAt) + i2;
                        if (m < y) {
                            i = y;
                        } else {
                            i2 = y;
                        }
                    }
                    if (A(c, 32)) {
                        i += ((LinearLayout.LayoutParams) eVar).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    v(coordinatorLayout, appBarLayout, hg4.b(x(m, i2, i) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View D = D(appBarLayout, i);
            boolean z2 = false;
            if (D != null) {
                int c = ((e) D.getLayoutParams()).c();
                if ((c & 1) != 0) {
                    int y = k99.y(D);
                    if (i2 <= 0 || (c & 12) == 0 ? !((c & 2) == 0 || (-i) < (D.getBottom() - y) - appBarLayout.getTopInset()) : (-i) >= (D.getBottom() - y) - appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (appBarLayout.q()) {
                z2 = appBarLayout.F(C(coordinatorLayout));
            }
            boolean C = appBarLayout.C(z2);
            if (z || (C && V(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (k99.K(coordinatorLayout)) {
                return;
            }
            k99.l0(coordinatorLayout, new b(appBarLayout, coordinatorLayout));
        }

        private void v(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int abs = Math.abs(m() - i);
            float abs2 = Math.abs(f);
            w(coordinatorLayout, appBarLayout, i, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private void w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2) {
            int m = m();
            if (m == i) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.m = valueAnimator3;
                valueAnimator3.setInterpolator(hi.e);
                this.m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration(Math.min(i2, 600));
            this.m.setIntValues(m, i);
            this.m.start();
        }

        private int x(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        private boolean z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.m() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public int k(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public int l(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public void n(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            W(coordinatorLayout, appBarLayout);
            if (appBarLayout.q()) {
                appBarLayout.C(appBarLayout.F(C(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            v(coordinatorLayout, appBarLayout, i2, 0.0f);
                        } else {
                            p(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            v(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            p(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.fullyScrolled) {
                p(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.fullyExpanded) {
                p(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.firstVisibleChildIndex);
                p(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.n.firstVisibleChildAtMinimumHeight ? k99.y(childAt) + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.n.firstVisibleChildPercentageShown)));
            }
            appBarLayout.y();
            this.n = null;
            g(hg4.b(e(), -appBarLayout.getTotalScrollRange(), 0));
            X(coordinatorLayout, appBarLayout, e(), 0, true);
            appBarLayout.u(e());
            u(coordinatorLayout, appBarLayout);
            return onLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.D(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -appBarLayout.getTotalScrollRange();
                    i5 = appBarLayout.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -appBarLayout.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                int i6 = i4;
                int i7 = i5;
                if (i6 != i7) {
                    iArr[1] = o(coordinatorLayout, appBarLayout, i2, i6, i7);
                }
            }
            if (appBarLayout.q()) {
                appBarLayout.C(appBarLayout.F(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = o(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                u(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                S((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, this.n.a());
            } else {
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
                this.n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            SavedState T = T(onSaveInstanceState, appBarLayout);
            return T == null ? onSaveInstanceState : T;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (appBarLayout.q() || z(coordinatorLayout, appBarLayout, view));
            if (z && (valueAnimator = this.m) != null) {
                valueAnimator.cancel();
            }
            this.r = null;
            this.l = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (this.l == 0 || i == 1) {
                W(coordinatorLayout, appBarLayout);
                if (appBarLayout.q()) {
                    appBarLayout.C(appBarLayout.F(view));
                }
            }
            this.r = new WeakReference(view);
        }

        void S(SavedState savedState, boolean z) {
            if (this.n == null || z) {
                this.n = savedState;
            }
        }

        SavedState T(Parcelable parcelable, AppBarLayout appBarLayout) {
            int e = e();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + e;
                if (childAt.getTop() + e <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = e == 0;
                    savedState.fullyExpanded = z;
                    savedState.fullyScrolled = !z && (-e) >= appBarLayout.getTotalScrollRange();
                    savedState.firstVisibleChildIndex = i;
                    savedState.firstVisibleChildAtMinimumHeight = bottom == k99.y(childAt) + appBarLayout.getTopInset();
                    savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public int q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int m = m();
            int i4 = 0;
            if (i2 == 0 || m < i2 || m > i3) {
                this.k = 0;
            } else {
                int b2 = hg4.b(i, i2, i3);
                if (m != b2) {
                    int I = appBarLayout.k() ? I(appBarLayout, b2) : b2;
                    boolean g = g(I);
                    int i5 = m - b2;
                    this.k = b2 - I;
                    if (g) {
                        while (i4 < appBarLayout.getChildCount()) {
                            e eVar = (e) appBarLayout.getChildAt(i4).getLayoutParams();
                            c b3 = eVar.b();
                            if (b3 != null && (eVar.c() & 1) != 0) {
                                b3.a(appBarLayout, appBarLayout.getChildAt(i4), e());
                            }
                            i4++;
                        }
                    }
                    if (!g && appBarLayout.k()) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.u(e());
                    X(coordinatorLayout, appBarLayout, b2, b2 < m ? -1 : 1, false);
                    i4 = i5;
                }
            }
            u(coordinatorLayout, appBarLayout);
            return i4;
        }

        @Override // com.google.android.material.appbar.a
        int m() {
            return e() + this.k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public boolean h(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.r;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;
            boolean fullyExpanded;
            boolean fullyScrolled;

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

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.fullyScrolled = parcel.readByte() != 0;
                this.fullyExpanded = parcel.readByte() != 0;
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.fullyScrolled ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.fullyExpanded ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: K */
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: L */
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: M */
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: N */
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: O */
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: P */
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: Q */
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: R */
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ int e() {
            return super.e();
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean g(int i) {
            return super.g(i);
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.b {
        public ScrollingViewBehavior() {
        }

        private static int r(AppBarLayout appBarLayout) {
            CoordinatorLayout.c e = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).e();
            if (e instanceof BaseBehavior) {
                return ((BaseBehavior) e).m();
            }
            return 0;
        }

        private void s(View view, View view2) {
            CoordinatorLayout.c e = ((CoordinatorLayout.f) view2.getLayoutParams()).e();
            if (e instanceof BaseBehavior) {
                k99.W(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) e).k) + m()) - i(view2));
            }
        }

        private void t(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.q()) {
                    appBarLayout.C(appBarLayout.F(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.b
        float j(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int r = r(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + r > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (r / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.b
        int l(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.l(view);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            s(view, view2);
            t(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                k99.l0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout h = h(coordinatorLayout.l(view));
            if (h != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    h.z(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public AppBarLayout h(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nn6.ScrollingViewBehavior_Layout);
            o(obtainStyledAttributes.getDimensionPixelSize(nn6.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }
    }

    class a implements be5 {
        a() {
        }

        @Override // defpackage.be5
        public ch9 a(View view, ch9 ch9Var) {
            return AppBarLayout.this.v(ch9Var);
        }
    }

    public interface b {
        void a(AppBarLayout appBarLayout, int i);
    }

    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f);
    }

    public static class d extends c {
        private final Rect a = new Rect();
        private final Rect b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, View view, float f) {
            b(this.a, appBarLayout, view);
            float abs = this.a.top - Math.abs(f);
            if (abs > 0.0f) {
                k99.s0(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float a = 1.0f - hg4.a(Math.abs(abs / this.a.height()), 0.0f, 1.0f);
            float height = (-abs) - ((this.a.height() * 0.3f) * (1.0f - (a * a)));
            view.setTranslationY(height);
            view.getDrawingRect(this.b);
            this.b.offset(0, (int) (-height));
            if (height >= this.b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            k99.s0(view, this.b);
        }
    }

    public interface f extends b {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lc6.appBarLayoutStyle);
    }

    private void A(boolean z, boolean z2, boolean z3) {
        this.f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    private boolean B(boolean z) {
        if (this.j == z) {
            return false;
        }
        this.j = z;
        refreshDrawableState();
        return true;
    }

    private boolean E() {
        return this.B != null && getTopInset() > 0;
    }

    private boolean G() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || k99.u(childAt)) ? false : true;
    }

    private void H(float f2, float f3) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.s = ofFloat;
        ofFloat.setDuration(this.w);
        this.s.setInterpolator(this.x);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.t;
        if (animatorUpdateListener != null) {
            this.s.addUpdateListener(animatorUpdateListener);
        }
        this.s.start();
    }

    private void I() {
        setWillNotDraw(!E());
    }

    private void e() {
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    private Integer f() {
        Drawable drawable = this.B;
        if (drawable instanceof uf4) {
            return Integer.valueOf(((uf4) drawable).y());
        }
        ColorStateList f2 = tv1.f(drawable);
        if (f2 != null) {
            return Integer.valueOf(f2.getDefaultColor());
        }
        return null;
    }

    private View g(View view) {
        int i;
        if (this.n == null && (i = this.m) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.m);
            }
            if (findViewById != null) {
                this.n = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean l() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((e) getChildAt(i).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void n(final uf4 uf4Var, final ColorStateList colorStateList, final ColorStateList colorStateList2) {
        final Integer f2 = qf4.f(getContext(), lc6.colorSurface);
        this.t = new ValueAnimator.AnimatorUpdateListener() { // from class: gk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.s(colorStateList, colorStateList2, uf4Var, f2, valueAnimator);
            }
        };
        k99.p0(this, uf4Var);
    }

    private void o(Context context, final uf4 uf4Var) {
        uf4Var.M(context);
        this.t = new ValueAnimator.AnimatorUpdateListener() { // from class: hk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.t(uf4Var, valueAnimator);
            }
        };
        k99.p0(this, uf4Var);
    }

    private void p() {
        Behavior behavior = this.M;
        BaseBehavior.SavedState T = (behavior == null || this.b == -1 || this.f != 0) ? null : behavior.T(AbsSavedState.EMPTY_STATE, this);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if (T != null) {
            this.M.S(T, false);
        }
    }

    private boolean r() {
        return getBackground() instanceof uf4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(ColorStateList colorStateList, ColorStateList colorStateList2, uf4 uf4Var, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        int j = qf4.j(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        uf4Var.W(ColorStateList.valueOf(j));
        if (this.B != null && (num2 = this.H) != null && num2.equals(num)) {
            kv1.n(this.B, j);
        }
        if (this.u.isEmpty()) {
            return;
        }
        Iterator it2 = this.u.iterator();
        while (it2.hasNext()) {
            lh4.a(it2.next());
            if (uf4Var.v() != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(uf4 uf4Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        uf4Var.V(floatValue);
        Drawable drawable = this.B;
        if (drawable instanceof uf4) {
            ((uf4) drawable).V(floatValue);
        }
        Iterator it2 = this.u.iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            uf4Var.y();
            throw null;
        }
    }

    boolean C(boolean z) {
        return D(z, !this.i);
    }

    boolean D(boolean z, boolean z2) {
        if (!z2 || this.k == z) {
            return false;
        }
        this.k = z;
        refreshDrawableState();
        if (!r()) {
            return true;
        }
        if (this.r) {
            H(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.l) {
            return true;
        }
        H(z ? 0.0f : this.L, z ? this.L : 0.0f);
        return true;
    }

    boolean F(View view) {
        View g = g(view);
        if (g != null) {
            view = g;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void c(b bVar) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        if (bVar == null || this.h.contains(bVar)) {
            return;
        }
        this.h.add(bVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d(f fVar) {
        c(fVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (E()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.a);
            this.B.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.B;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.M = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i;
        int y;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = eVar.a;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    if ((i4 & 8) != 0) {
                        y = k99.y(childAt);
                    } else if ((i4 & 2) != 0) {
                        y = measuredHeight - k99.y(childAt);
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && k99.u(childAt)) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = i5 + y;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
            }
        }
        int max = Math.max(0, i3);
        this.c = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                int i4 = eVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= k99.y(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.m;
    }

    public uf4 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof uf4) {
            return (uf4) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int y = k99.y(this);
        if (y == 0) {
            int childCount = getChildCount();
            y = childCount >= 1 ? k99.y(getChildAt(childCount - 1)) : 0;
            if (y == 0) {
                return getHeight() / 3;
            }
        }
        return (y * 2) + topInset;
    }

    int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.B;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        ch9 ch9Var = this.g;
        if (ch9Var != null) {
            return ch9Var.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = eVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if (i2 == 0 && k99.u(childAt)) {
                    i3 -= getTopInset();
                }
                if ((i4 & 2) != 0) {
                    i3 -= k99.y(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.b = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new e((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    boolean k() {
        return this.e;
    }

    boolean m() {
        return getTotalScrollRange() != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        vf4.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.y == null) {
            this.y = new int[4];
        }
        int[] iArr = this.y;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.j;
        int i2 = lc6.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.k) ? lc6.state_lifted : -lc6.state_lifted;
        int i3 = lc6.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.k) ? lc6.state_collapsed : -lc6.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (k99.u(this) && G()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                k99.W(getChildAt(childCount), topInset);
            }
        }
        p();
        this.e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((e) getChildAt(i5).getLayoutParams()).d() != null) {
                this.e = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.i) {
            return;
        }
        if (!this.l && !l()) {
            z2 = false;
        }
        B(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && k99.u(this) && G()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = hg4.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        p();
    }

    public boolean q() {
        return this.l;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        vf4.d(this, f2);
    }

    public void setExpanded(boolean z) {
        z(z, k99.P(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.m = -1;
        if (view == null) {
            e();
        } else {
            this.n = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.m = i;
        e();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.i = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.B = drawable != null ? drawable.mutate() : null;
            this.H = f();
            Drawable drawable3 = this.B;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.B.setState(getDrawableState());
                }
                kv1.m(this.B, k99.x(this));
                this.B.setVisible(getVisibility() == 0, false);
                this.B.setCallback(this);
            }
            I();
            k99.c0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(al.b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        com.google.android.material.appbar.e.b(this, f2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    void u(int i) {
        this.a = i;
        if (!willNotDraw()) {
            k99.c0(this);
        }
        List list = this.h;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) this.h.get(i2);
                if (bVar != null) {
                    bVar.a(this, i);
                }
            }
        }
    }

    ch9 v(ch9 ch9Var) {
        ch9 ch9Var2 = k99.u(this) ? ch9Var : null;
        if (!ic5.a(this.g, ch9Var2)) {
            this.g = ch9Var2;
            I();
            requestLayout();
        }
        return ch9Var;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B;
    }

    public void w(b bVar) {
        List list = this.h;
        if (list == null || bVar == null) {
            return;
        }
        list.remove(bVar);
    }

    public void x(f fVar) {
        w(fVar);
    }

    void y() {
        this.f = 0;
    }

    public void z(boolean z, boolean z2) {
        A(z, z2, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.N
            android.content.Context r10 = defpackage.bg4.c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.b = r10
            r9.c = r10
            r9.d = r10
            r6 = 0
            r9.f = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.u = r0
            android.content.Context r7 = r9.getContext()
            r8 = 1
            r9.setOrientation(r8)
            android.view.ViewOutlineProvider r0 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L2d
            com.google.android.material.appbar.e.a(r9)
        L2d:
            com.google.android.material.appbar.e.c(r9, r11, r12, r4)
            int[] r2 = defpackage.nn6.AppBarLayout
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = defpackage.sk8.i(r0, r1, r2, r3, r4, r5)
            int r12 = defpackage.nn6.AppBarLayout_android_background
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            defpackage.k99.p0(r9, r12)
            int r12 = defpackage.nn6.AppBarLayout_liftOnScrollColor
            android.content.res.ColorStateList r12 = defpackage.tf4.a(r7, r11, r12)
            if (r12 == 0) goto L4d
            goto L4e
        L4d:
            r8 = r6
        L4e:
            r9.r = r8
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            android.content.res.ColorStateList r0 = defpackage.tv1.f(r0)
            if (r0 == 0) goto L6b
            uf4 r1 = new uf4
            r1.<init>()
            r1.W(r0)
            if (r12 == 0) goto L68
            r9.n(r1, r0, r12)
            goto L6b
        L68:
            r9.o(r7, r1)
        L6b:
            int r12 = defpackage.lc6.motionDurationMedium2
            android.content.res.Resources r0 = r9.getResources()
            int r1 = defpackage.kh6.app_bar_elevation_anim_duration
            int r0 = r0.getInteger(r1)
            int r12 = defpackage.hw4.f(r7, r12, r0)
            long r0 = (long) r12
            r9.w = r0
            int r12 = defpackage.lc6.motionEasingStandardInterpolator
            android.animation.TimeInterpolator r0 = defpackage.hi.a
            android.animation.TimeInterpolator r12 = defpackage.hw4.g(r7, r12, r0)
            r9.x = r12
            int r12 = defpackage.nn6.AppBarLayout_expanded
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L99
            int r12 = defpackage.nn6.AppBarLayout_expanded
            boolean r12 = r11.getBoolean(r12, r6)
            r9.A(r12, r6, r6)
        L99:
            int r12 = defpackage.nn6.AppBarLayout_elevation
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto Lab
            int r12 = defpackage.nn6.AppBarLayout_elevation
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.e.b(r9, r12)
        Lab:
            int r12 = defpackage.nn6.AppBarLayout_android_keyboardNavigationCluster
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto Lbc
            int r12 = defpackage.nn6.AppBarLayout_android_keyboardNavigationCluster
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setKeyboardNavigationCluster(r12)
        Lbc:
            int r12 = defpackage.nn6.AppBarLayout_android_touchscreenBlocksFocus
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto Lcd
            int r12 = defpackage.nn6.AppBarLayout_android_touchscreenBlocksFocus
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        Lcd:
            android.content.res.Resources r12 = r9.getResources()
            int r0 = defpackage.zd6.design_appbar_elevation
            float r12 = r12.getDimension(r0)
            r9.L = r12
            int r12 = defpackage.nn6.AppBarLayout_liftOnScroll
            boolean r12 = r11.getBoolean(r12, r6)
            r9.l = r12
            int r12 = defpackage.nn6.AppBarLayout_liftOnScrollTargetViewId
            int r10 = r11.getResourceId(r12, r10)
            r9.m = r10
            int r10 = defpackage.nn6.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            defpackage.k99.A0(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static class e extends LinearLayout.LayoutParams {
        int a;
        private c b;
        Interpolator c;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nn6.AppBarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(nn6.AppBarLayout_Layout_layout_scrollFlags, 0);
            f(obtainStyledAttributes.getInt(nn6.AppBarLayout_Layout_layout_scrollEffect, 0));
            if (obtainStyledAttributes.hasValue(nn6.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(nn6.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        private c a(int i) {
            if (i != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }

        public Interpolator d() {
            return this.c;
        }

        boolean e() {
            int i = this.a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public void f(int i) {
            this.b = a(i);
        }

        public void g(int i) {
            this.a = i;
        }

        public e(int i, int i2) {
            super(i, i2);
            this.a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }
    }
}
