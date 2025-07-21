package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.comscore.streaming.ContentType;
import defpackage.be5;
import defpackage.ch9;
import defpackage.h3;
import defpackage.k99;
import defpackage.lh4;
import defpackage.mx0;
import defpackage.w2;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    static final int[] E0 = {R.attr.layout_gravity};
    private static final Comparator F0 = new a();
    private static final Interpolator G0 = new b();
    private static final k H0 = new k();
    private int A0;
    private boolean B;
    private ArrayList B0;
    private final Runnable C0;
    private int D0;
    private boolean H;
    private int L;
    private boolean M;
    private boolean N;
    private int Q;
    private int S;
    private int a;
    private final ArrayList b;
    private final f c;
    private final Rect d;
    androidx.viewpager.widget.a e;
    private int e0;
    int f;
    private float f0;
    private int g;
    private float g0;
    private Parcelable h;
    private float h0;
    private ClassLoader i;
    private float i0;
    private Scroller j;
    private int j0;
    private boolean k;
    private VelocityTracker k0;
    private j l;
    private int l0;
    private int m;
    private int m0;
    private Drawable n;
    private int n0;
    private int o0;
    private boolean p0;
    private EdgeEffect q0;
    private int r;
    private EdgeEffect r0;
    private int s;
    private boolean s0;
    private float t;
    private boolean t0;
    private float u;
    private boolean u0;
    private int v0;
    private int w;
    private List w0;
    private int x;
    private i x0;
    private boolean y;
    private i y0;
    private List z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        static class a implements Parcelable.ClassLoaderCreator {
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

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }
    }

    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.b - fVar2.b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.D();
        }
    }

    class d implements be5 {
        private final Rect a = new Rect();

        d() {
        }

        @Override // defpackage.be5
        public ch9 a(View view, ch9 ch9Var) {
            ch9 X = k99.X(view, ch9Var);
            if (X.o()) {
                return X;
            }
            Rect rect = this.a;
            rect.left = X.j();
            rect.top = X.l();
            rect.right = X.k();
            rect.bottom = X.i();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ch9 g = k99.g(ViewPager.this.getChildAt(i), X);
                rect.left = Math.min(g.j(), rect.left);
                rect.top = Math.min(g.l(), rect.top);
                rect.right = Math.min(g.k(), rect.right);
                rect.bottom = Math.min(g.i(), rect.bottom);
            }
            return X.q(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {
        Object a;
        int b;
        boolean c;
        float d;
        float e;

        f() {
        }
    }

    class h extends w2 {
        h() {
        }

        private boolean o() {
            androidx.viewpager.widget.a aVar = ViewPager.this.e;
            return aVar != null && aVar.c() > 1;
        }

        @Override // defpackage.w2
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(o());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.c());
            accessibilityEvent.setFromIndex(ViewPager.this.f);
            accessibilityEvent.setToIndex(ViewPager.this.f);
        }

        @Override // defpackage.w2
        public void g(View view, h3 h3Var) {
            super.g(view, h3Var);
            h3Var.e0(ViewPager.class.getName());
            h3Var.G0(o());
            if (ViewPager.this.canScrollHorizontally(1)) {
                h3Var.a(ProgressEvent.PART_FAILED_EVENT_CODE);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                h3Var.a(8192);
            }
        }

        @Override // defpackage.w2
        public boolean k(View view, int i, Bundle bundle) {
            if (super.k(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f + 1);
                return true;
            }
            if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f - 1);
            return true;
        }
    }

    public interface i {
        void U(int i, float f, int i2);

        void t0(int i);

        void v0(int i);
    }

    private class j extends DataSetObserver {
        j() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.h();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.h();
        }
    }

    static class k implements Comparator {
        k() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.a;
            return z != gVar2.a ? z ? 1 : -1 : gVar.e - gVar2.e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
        this.c = new f();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.L = 1;
        this.j0 = -1;
        this.s0 = true;
        this.t0 = false;
        this.C0 = new c();
        this.D0 = 0;
        u();
    }

    private boolean B(int i2) {
        if (this.b.size() == 0) {
            if (this.s0) {
                return false;
            }
            this.u0 = false;
            x(0, 0.0f, 0);
            if (this.u0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f s = s();
        int clientWidth = getClientWidth();
        int i3 = this.m;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = s.b;
        float f3 = ((i2 / f2) - s.e) / (s.d + (i3 / f2));
        this.u0 = false;
        x(i5, f3, (int) (i4 * f3));
        if (this.u0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean C(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.f0 - f2;
        this.f0 = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.t * clientWidth;
        float f5 = this.u * clientWidth;
        boolean z3 = false;
        f fVar = (f) this.b.get(0);
        ArrayList arrayList = this.b;
        f fVar2 = (f) arrayList.get(arrayList.size() - 1);
        if (fVar.b != 0) {
            f4 = fVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.b != this.e.c() - 1) {
            f5 = fVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.q0.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.r0.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.f0 += scrollX - i2;
        scrollTo(i2, getScrollY());
        B(i2);
        return z3;
    }

    private void F(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.b.isEmpty()) {
            if (!this.j.isFinished()) {
                this.j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        f t = t(this.f);
        int min = (int) ((t != null ? Math.min(t.e, this.u) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            g(false);
            scrollTo(min, getScrollY());
        }
    }

    private void G() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private void H(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean I() {
        this.j0 = -1;
        n();
        this.q0.onRelease();
        this.r0.onRelease();
        return this.q0.isFinished() || this.r0.isFinished();
    }

    private void J(int i2, boolean z, int i3, boolean z2) {
        f t = t(i2);
        int clientWidth = t != null ? (int) (getClientWidth() * Math.max(this.t, Math.min(t.e, this.u))) : 0;
        if (z) {
            N(clientWidth, 0, i3);
            if (z2) {
                k(i2);
                return;
            }
            return;
        }
        if (z2) {
            k(i2);
        }
        g(false);
        scrollTo(clientWidth, 0);
        B(clientWidth);
    }

    private void O() {
        if (this.A0 != 0) {
            ArrayList arrayList = this.B0;
            if (arrayList == null) {
                this.B0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.B0.add(getChildAt(i2));
            }
            Collections.sort(this.B0, H0);
        }
    }

    private void d(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int c2 = this.e.c();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.m / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.b;
            int i6 = fVar.b;
            if (i5 < i6) {
                float f3 = fVar2.e + fVar2.d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= fVar.b && i8 < this.b.size()) {
                    Object obj = this.b.get(i8);
                    while (true) {
                        fVar4 = (f) obj;
                        if (i7 <= fVar4.b || i8 >= this.b.size() - 1) {
                            break;
                        }
                        i8++;
                        obj = this.b.get(i8);
                    }
                    while (i7 < fVar4.b) {
                        f3 += this.e.e(i7) + f2;
                        i7++;
                    }
                    fVar4.e = f3;
                    f3 += fVar4.d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.b.size() - 1;
                float f4 = fVar2.e;
                while (true) {
                    i5--;
                    if (i5 < fVar.b || size < 0) {
                        break;
                    }
                    Object obj2 = this.b.get(size);
                    while (true) {
                        fVar3 = (f) obj2;
                        if (i5 >= fVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.b.get(size);
                    }
                    while (i5 > fVar3.b) {
                        f4 -= this.e.e(i5) + f2;
                        i5--;
                    }
                    f4 -= fVar3.d + f2;
                    fVar3.e = f4;
                }
            }
        }
        int size2 = this.b.size();
        float f5 = fVar.e;
        int i9 = fVar.b;
        int i10 = i9 - 1;
        this.t = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = c2 - 1;
        this.u = i9 == i11 ? (fVar.d + f5) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar5 = (f) this.b.get(i12);
            while (true) {
                i4 = fVar5.b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.e.e(i10) + f2;
                i10--;
            }
            f5 -= fVar5.d + f2;
            fVar5.e = f5;
            if (i4 == 0) {
                this.t = f5;
            }
            i12--;
            i10--;
        }
        float f6 = fVar.e + fVar.d + f2;
        int i13 = fVar.b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar6 = (f) this.b.get(i14);
            while (true) {
                i3 = fVar6.b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.e.e(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.u = (fVar6.d + f6) - 1.0f;
            }
            fVar6.e = f6;
            f6 += fVar6.d + f2;
            i14++;
            i13++;
        }
        this.t0 = false;
    }

    private void g(boolean z) {
        boolean z2 = this.D0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.j.isFinished()) {
                this.j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.j.getCurrX();
                int currY = this.j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        B(currX);
                    }
                }
            }
        }
        this.H = false;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            f fVar = (f) this.b.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                k99.d0(this, this.C0);
            } else {
                this.C0.run();
            }
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private int i(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.n0 || Math.abs(i3) <= this.l0) {
            i2 += (int) (f2 + (i2 >= this.f ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.b.size() <= 0) {
            return i2;
        }
        return Math.max(((f) this.b.get(0)).b, Math.min(i2, ((f) this.b.get(r1.size() - 1)).b));
    }

    private void j(int i2, float f2, int i3) {
        i iVar = this.x0;
        if (iVar != null) {
            iVar.U(i2, f2, i3);
        }
        List list = this.w0;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                i iVar2 = (i) this.w0.get(i4);
                if (iVar2 != null) {
                    iVar2.U(i2, f2, i3);
                }
            }
        }
        i iVar3 = this.y0;
        if (iVar3 != null) {
            iVar3.U(i2, f2, i3);
        }
    }

    private void k(int i2) {
        i iVar = this.x0;
        if (iVar != null) {
            iVar.v0(i2);
        }
        List list = this.w0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = (i) this.w0.get(i3);
                if (iVar2 != null) {
                    iVar2.v0(i2);
                }
            }
        }
        i iVar3 = this.y0;
        if (iVar3 != null) {
            iVar3.v0(i2);
        }
    }

    private void l(int i2) {
        i iVar = this.x0;
        if (iVar != null) {
            iVar.t0(i2);
        }
        List list = this.w0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = (i) this.w0.get(i3);
                if (iVar2 != null) {
                    iVar2.t0(i2);
                }
            }
        }
        i iVar3 = this.y0;
        if (iVar3 != null) {
            iVar3.t0(i2);
        }
    }

    private void n() {
        this.M = false;
        this.N = false;
        VelocityTracker velocityTracker = this.k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.k0 = null;
        }
    }

    private Rect p(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f s() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.m / clientWidth : 0.0f;
        int i3 = 0;
        boolean z = true;
        f fVar = null;
        int i4 = -1;
        float f4 = 0.0f;
        while (i3 < this.b.size()) {
            f fVar2 = (f) this.b.get(i3);
            if (!z && fVar2.b != (i2 = i4 + 1)) {
                fVar2 = this.c;
                fVar2.e = f2 + f4 + f3;
                fVar2.b = i2;
                fVar2.d = this.e.e(i2);
                i3--;
            }
            f fVar3 = fVar2;
            f2 = fVar3.e;
            float f5 = fVar3.d + f2 + f3;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i3 == this.b.size() - 1) {
                return fVar3;
            }
            int i5 = fVar3.b;
            float f6 = fVar3.d;
            i3++;
            z = false;
            i4 = i5;
            f4 = f6;
            fVar = fVar3;
        }
        return fVar;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.B != z) {
            this.B = z;
        }
    }

    private static boolean v(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean w(float f2, float f3) {
        return (f2 < ((float) this.S) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.S)) && f3 < 0.0f);
    }

    private void y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.j0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f0 = motionEvent.getX(i2);
            this.j0 = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.k0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    boolean A() {
        androidx.viewpager.widget.a aVar = this.e;
        if (aVar == null || this.f >= aVar.c() - 1) {
            return false;
        }
        K(this.f + 1, true);
        return true;
    }

    void D() {
        E(this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void E(int r18) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.E(int):void");
    }

    public void K(int i2, boolean z) {
        this.H = false;
        L(i2, z, false);
    }

    void L(int i2, boolean z, boolean z2) {
        M(i2, z, z2, 0);
    }

    void M(int i2, boolean z, boolean z2, int i3) {
        androidx.viewpager.widget.a aVar = this.e;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f == i2 && this.b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.e.c()) {
            i2 = this.e.c() - 1;
        }
        int i4 = this.L;
        int i5 = this.f;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.b.size(); i6++) {
                ((f) this.b.get(i6)).c = true;
            }
        }
        boolean z3 = this.f != i2;
        if (!this.s0) {
            E(i2);
            J(i2, z, i3, z3);
        } else {
            this.f = i2;
            if (z3) {
                k(i2);
            }
            requestLayout();
        }
    }

    void N(int i2, int i3, int i4) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.j;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.k ? this.j.getCurrX() : this.j.getStartX();
            this.j.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            g(false);
            D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float m = f3 + (m(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3);
        int abs = Math.abs(i4);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(m / abs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / ((f2 * this.e.e(this.f)) + this.m)) + 1.0f) * 100.0f), 600);
        this.k = false;
        this.j.startScroll(i5, scrollY, i6, i7, min);
        k99.c0(this);
    }

    f a(int i2, int i3) {
        f fVar = new f();
        fVar.b = i2;
        fVar.a = this.e.f(this, i2);
        fVar.d = this.e.e(i2);
        if (i3 < 0 || i3 >= this.b.size()) {
            this.b.add(fVar);
        } else {
            this.b.add(i3, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        f r;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (r = r(childAt)) != null && r.b == this.f) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        f r;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (r = r(childAt)) != null && r.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean v = gVar.a | v(view);
        gVar.a = v;
        if (!this.y) {
            super.addView(view, i2, layoutParams);
        } else {
            if (v) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public void b(i iVar) {
        if (this.w0 == null) {
            this.w0 = new ArrayList();
        }
        this.w0.add(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L63
        L9:
            if (r0 == 0) goto L63
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L63
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L63:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            if (r5 != r3) goto L93
            android.graphics.Rect r2 = r4.d
            android.graphics.Rect r2 = r4.p(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.d
            android.graphics.Rect r3 = r4.p(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8e
            if (r2 < r3) goto L8e
            boolean r0 = r4.z()
            goto Lca
        L8e:
            boolean r0 = r1.requestFocus()
            goto Lca
        L93:
            if (r5 != r2) goto Lbf
            android.graphics.Rect r2 = r4.d
            android.graphics.Rect r2 = r4.p(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.d
            android.graphics.Rect r3 = r4.p(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r4.A()
            goto Lca
        Lae:
            boolean r0 = r1.requestFocus()
            goto Lca
        Lb3:
            if (r5 == r3) goto Lc6
            r0 = 1
            if (r5 != r0) goto Lb9
            goto Lc6
        Lb9:
            if (r5 == r2) goto Lc1
            r0 = 2
            if (r5 != r0) goto Lbf
            goto Lc1
        Lbf:
            r0 = 0
            goto Lca
        Lc1:
            boolean r0 = r4.A()
            goto Lca
        Lc6:
            boolean r0 = r4.z()
        Lca:
            if (r0 == 0) goto Ld3
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Ld3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.t)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.u));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.k = true;
        if (this.j.isFinished() || !this.j.computeScrollOffset()) {
            g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.j.getCurrX();
        int currY = this.j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!B(currX)) {
                this.j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        k99.c0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f r;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (r = r(childAt)) != null && r.b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.e) != null && aVar.c() > 1)) {
            if (!this.q0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.t * width);
                this.q0.setSize(height, width);
                z = this.q0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.r0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.u + 1.0f)) * width2);
                this.r0.setSize(height2, width2);
                z |= this.r0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.q0.finish();
            this.r0.finish();
        }
        if (z) {
            k99.c0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    protected boolean e(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && e(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    public void f() {
        List list = this.w0;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.A0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) ((View) this.B0.get(i3)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.L;
    }

    public int getPageMargin() {
        return this.m;
    }

    void h() {
        int c2 = this.e.c();
        this.a = c2;
        boolean z = this.b.size() < (this.L * 2) + 1 && this.b.size() < c2;
        int i2 = this.f;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < this.b.size()) {
            f fVar = (f) this.b.get(i3);
            int d2 = this.e.d(fVar.a);
            if (d2 != -1) {
                if (d2 == -2) {
                    this.b.remove(i3);
                    i3--;
                    if (!z2) {
                        this.e.l(this);
                        z2 = true;
                    }
                    this.e.a(this, fVar.b, fVar.a);
                    int i4 = this.f;
                    if (i4 == fVar.b) {
                        i2 = Math.max(0, Math.min(i4, c2 - 1));
                    }
                } else {
                    int i5 = fVar.b;
                    if (i5 != d2) {
                        if (i5 == this.f) {
                            i2 = d2;
                        }
                        fVar.b = d2;
                    }
                }
                z = true;
            }
            i3++;
        }
        if (z2) {
            this.e.b(this);
        }
        Collections.sort(this.b, F0);
        if (z) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                g gVar = (g) getChildAt(i6).getLayoutParams();
                if (!gVar.a) {
                    gVar.c = 0.0f;
                }
            }
            L(i2, false, true);
            requestLayout();
        }
    }

    float m(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? z() : c(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? A() : c(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return c(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return c(1);
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.C0);
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.m <= 0 || this.n == null || this.b.size() <= 0 || this.e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.m / width;
        int i3 = 0;
        f fVar = (f) this.b.get(0);
        float f5 = fVar.e;
        int size = this.b.size();
        int i4 = fVar.b;
        int i5 = ((f) this.b.get(size - 1)).b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = (f) this.b.get(i3);
            }
            if (i4 == i2) {
                float f6 = fVar.e;
                float f7 = fVar.d;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float e2 = this.e.e(i4);
                f2 = (f5 + e2) * width;
                f5 += e2 + f4;
            }
            if (this.m + f2 > scrollX) {
                f3 = f4;
                this.n.setBounds(Math.round(f2), this.r, Math.round(this.m + f2), this.s);
                this.n.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i4++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            I();
            return false;
        }
        if (action != 0) {
            if (this.M) {
                return true;
            }
            if (this.N) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.h0 = x;
            this.f0 = x;
            float y = motionEvent.getY();
            this.i0 = y;
            this.g0 = y;
            this.j0 = motionEvent.getPointerId(0);
            this.N = false;
            this.k = true;
            this.j.computeScrollOffset();
            if (this.D0 != 2 || Math.abs(this.j.getFinalX() - this.j.getCurrX()) <= this.o0) {
                g(false);
                this.M = false;
            } else {
                this.j.abortAnimation();
                this.H = false;
                D();
                this.M = true;
                H(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.j0;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.f0;
                float abs = Math.abs(f2);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.i0);
                if (f2 != 0.0f && !w(this.f0, f2) && e(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.f0 = x2;
                    this.g0 = y2;
                    this.N = true;
                    return false;
                }
                int i3 = this.e0;
                if (abs > i3 && abs * 0.5f > abs2) {
                    this.M = true;
                    H(true);
                    setScrollState(1);
                    float f3 = this.h0;
                    float f4 = this.e0;
                    this.f0 = f2 > 0.0f ? f3 + f4 : f3 - f4;
                    this.g0 = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i3) {
                    this.N = true;
                }
                if (this.M && C(x2)) {
                    k99.c0(this);
                }
            }
        } else if (action == 6) {
            y(motionEvent);
        }
        if (this.k0 == null) {
            this.k0 = VelocityTracker.obtain();
        }
        this.k0.addMovement(motionEvent);
        return this.M;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        g gVar;
        g gVar2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.S = Math.min(measuredWidth / 10, this.Q);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z = true;
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.a) {
                int i7 = gVar2.b;
                int i8 = i7 & 7;
                int i9 = i7 & ContentType.LONG_FORM_ON_DEMAND;
                boolean z2 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z = false;
                }
                int i10 = RecyclerView.UNDEFINED_DURATION;
                if (z2) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        this.w = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.x = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.y = true;
        D();
        this.y = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.c), 1073741824), this.x);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        f r;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i5 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (r = r(childAt)) != null && r.b == this.f && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i5;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        androidx.viewpager.widget.a aVar = this.e;
        if (aVar != null) {
            aVar.h(savedState.adapterState, savedState.loader);
            L(savedState.position, false, true);
        } else {
            this.g = savedState.position;
            this.h = savedState.adapterState;
            this.i = savedState.loader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.f;
        androidx.viewpager.widget.a aVar = this.e;
        if (aVar != null) {
            savedState.adapterState = aVar.i();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.m;
            F(i2, i4, i6, i6);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        if (this.p0) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.e) == null || aVar.c() == 0) {
            return false;
        }
        if (this.k0 == null) {
            this.k0 = VelocityTracker.obtain();
        }
        this.k0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.j.abortAnimation();
            this.H = false;
            D();
            float x = motionEvent.getX();
            this.h0 = x;
            this.f0 = x;
            float y = motionEvent.getY();
            this.i0 = y;
            this.g0 = y;
            this.j0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.M) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.j0);
                    if (findPointerIndex == -1) {
                        z = I();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f0);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.g0);
                        if (abs > this.e0 && abs > abs2) {
                            this.M = true;
                            H(true);
                            float f2 = this.h0;
                            this.f0 = x2 - f2 > 0.0f ? f2 + this.e0 : f2 - this.e0;
                            this.g0 = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.M) {
                    z = C(motionEvent.getX(motionEvent.findPointerIndex(this.j0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f0 = motionEvent.getX(actionIndex);
                    this.j0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    y(motionEvent);
                    this.f0 = motionEvent.getX(motionEvent.findPointerIndex(this.j0));
                }
            } else if (this.M) {
                J(this.f, true, 0, false);
                z = I();
            }
        } else if (this.M) {
            VelocityTracker velocityTracker = this.k0;
            velocityTracker.computeCurrentVelocity(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, this.m0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.j0);
            this.H = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f s = s();
            float f3 = clientWidth;
            M(i(s.b, ((scrollX / f3) - s.e) / (s.d + (this.m / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.j0)) - this.h0)), true, true, xVelocity);
            z = I();
        }
        if (z) {
            k99.c0(this);
        }
        return true;
    }

    f q(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return r(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    f r(View view) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            f fVar = (f) this.b.get(i2);
            if (this.e.g(view, fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.k(null);
            this.e.l(this);
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                f fVar = (f) this.b.get(i2);
                this.e.a(this, fVar.b, fVar.a);
            }
            this.e.b(this);
            this.b.clear();
            G();
            this.f = 0;
            scrollTo(0, 0);
        }
        this.e = aVar;
        this.a = 0;
        if (aVar != null) {
            if (this.l == null) {
                this.l = new j();
            }
            this.e.k(this.l);
            this.H = false;
            boolean z = this.s0;
            this.s0 = true;
            this.a = this.e.c();
            if (this.g >= 0) {
                this.e.h(this.h, this.i);
                L(this.g, false, true);
                this.g = -1;
                this.h = null;
                this.i = null;
            } else if (z) {
                requestLayout();
            } else {
                D();
            }
        }
        List list = this.z0;
        if (list == null || list.isEmpty() || this.z0.size() <= 0) {
            return;
        }
        lh4.a(this.z0.get(0));
        throw null;
    }

    public void setCurrentItem(int i2) {
        this.H = false;
        L(i2, !this.s0, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.L) {
            this.L = i2;
            D();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.x0 = iVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.m;
        this.m = i2;
        int width = getWidth();
        F(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i2) {
        if (this.D0 == i2) {
            return;
        }
        this.D0 = i2;
        l(i2);
    }

    f t(int i2) {
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            f fVar = (f) this.b.get(i3);
            if (fVar.b == i2) {
                return fVar;
            }
        }
        return null;
    }

    void u() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.j = new Scroller(context, G0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.e0 = viewConfiguration.getScaledPagingTouchSlop();
        this.l0 = (int) (400.0f * f2);
        this.m0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.q0 = new EdgeEffect(context);
        this.r0 = new EdgeEffect(context);
        this.n0 = (int) (25.0f * f2);
        this.o0 = (int) (2.0f * f2);
        this.Q = (int) (f2 * 16.0f);
        k99.l0(this, new h());
        if (k99.v(this) == 0) {
            k99.v0(this, 1);
        }
        k99.A0(this, new d());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void x(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.v0
            r1 = 1
            if (r0 <= 0) goto L6b
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1a:
            if (r6 >= r5) goto L6b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r8 = (androidx.viewpager.widget.ViewPager.g) r8
            boolean r9 = r8.a
            if (r9 != 0) goto L2b
            goto L68
        L2b:
            int r8 = r8.b
            r8 = r8 & 7
            if (r8 == r1) goto L4f
            r9 = 3
            if (r8 == r9) goto L49
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5c
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L45:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5c
        L49:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5c
        L4f:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L45
        L5c:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L67
            r7.offsetLeftAndRight(r2)
        L67:
            r2 = r8
        L68:
            int r6 = r6 + 1
            goto L1a
        L6b:
            r11.j(r12, r13, r14)
            r11.u0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.x(int, float, int):void");
    }

    boolean z() {
        int i2 = this.f;
        if (i2 <= 0) {
            return false;
        }
        K(i2 - 1, true);
        return true;
    }

    public static class g extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
        int f;

        public g() {
            super(-1, -1);
            this.c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.E0);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(mx0.e(getContext(), i2));
    }
}
