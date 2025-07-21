package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    private BitSet B;
    private boolean G;
    private boolean H;
    private SavedState I;
    private int J;
    private int[] O;
    d[] t;
    l u;
    l v;
    private int w;
    private int x;
    private final i y;
    private int s = -1;
    boolean z = false;
    boolean A = false;
    int C = -1;
    int D = RecyclerView.UNDEFINED_DURATION;
    LazySpanLookup E = new LazySpanLookup();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean mAnchorLayoutFromEnd;
        int mAnchorPosition;
        List<LazySpanLookup.FullSpanItem> mFullSpanItems;
        boolean mLastLayoutRTL;
        boolean mReverseLayout;
        int[] mSpanLookup;
        int mSpanLookupSize;
        int[] mSpanOffsets;
        int mSpanOffsetsSize;
        int mVisibleAnchorPosition;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        void a() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        void b() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mSpanLookupSize = 0;
            this.mSpanLookup = null;
            this.mFullSpanItems = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mVisibleAnchorPosition);
            parcel.writeInt(this.mSpanOffsetsSize);
            if (this.mSpanOffsetsSize > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.mSpanLookupSize);
            if (this.mSpanLookupSize > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.mReverseLayout ? 1 : 0);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
            parcel.writeInt(this.mLastLayoutRTL ? 1 : 0);
            parcel.writeList(this.mFullSpanItems);
        }

        SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mVisibleAnchorPosition = parcel.readInt();
            int readInt = parcel.readInt();
            this.mSpanOffsetsSize = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.mSpanOffsets = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.mSpanLookupSize = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.mSpanLookup = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.mReverseLayout = parcel.readInt() == 1;
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
            this.mLastLayoutRTL = parcel.readInt() == 1;
            this.mFullSpanItems = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.mSpanOffsetsSize = savedState.mSpanOffsetsSize;
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mVisibleAnchorPosition = savedState.mVisibleAnchorPosition;
            this.mSpanOffsets = savedState.mSpanOffsets;
            this.mSpanLookupSize = savedState.mSpanLookupSize;
            this.mSpanLookup = savedState.mSpanLookup;
            this.mReverseLayout = savedState.mReverseLayout;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
            this.mLastLayoutRTL = savedState.mLastLayoutRTL;
            this.mFullSpanItems = savedState.mFullSpanItems;
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.Y1();
        }
    }

    class b {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        int[] f;

        b() {
            c();
        }

        void a() {
            this.b = this.c ? StaggeredGridLayoutManager.this.u.i() : StaggeredGridLayoutManager.this.u.m();
        }

        void b(int i) {
            if (this.c) {
                this.b = StaggeredGridLayoutManager.this.u.i() - i;
            } else {
                this.b = StaggeredGridLayoutManager.this.u.m() + i;
            }
        }

        void c() {
            this.a = -1;
            this.b = RecyclerView.UNDEFINED_DURATION;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = dVarArr[i].p(RecyclerView.UNDEFINED_DURATION);
            }
        }
    }

    public static class c extends RecyclerView.p {
        d e;
        boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f;
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class d {
        ArrayList a = new ArrayList();
        int b = RecyclerView.UNDEFINED_DURATION;
        int c = RecyclerView.UNDEFINED_DURATION;
        int d = 0;
        final int e;

        d(int i) {
            this.e = i;
        }

        void a(View view) {
            c n = n(view);
            n.e = this;
            this.a.add(view);
            this.c = RecyclerView.UNDEFINED_DURATION;
            if (this.a.size() == 1) {
                this.b = RecyclerView.UNDEFINED_DURATION;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        void b(boolean z, int i) {
            int l = z ? l(RecyclerView.UNDEFINED_DURATION) : p(RecyclerView.UNDEFINED_DURATION);
            e();
            if (l == Integer.MIN_VALUE) {
                return;
            }
            if (!z || l >= StaggeredGridLayoutManager.this.u.i()) {
                if (z || l <= StaggeredGridLayoutManager.this.u.m()) {
                    if (i != Integer.MIN_VALUE) {
                        l += i;
                    }
                    this.c = l;
                    this.b = l;
                }
            }
        }

        void c() {
            LazySpanLookup.FullSpanItem f;
            ArrayList arrayList = this.a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c n = n(view);
            this.c = StaggeredGridLayoutManager.this.u.d(view);
            if (n.f && (f = StaggeredGridLayoutManager.this.E.f(n.a())) != null && f.mGapDir == 1) {
                this.c += f.a(this.e);
            }
        }

        void d() {
            LazySpanLookup.FullSpanItem f;
            View view = (View) this.a.get(0);
            c n = n(view);
            this.b = StaggeredGridLayoutManager.this.u.g(view);
            if (n.f && (f = StaggeredGridLayoutManager.this.E.f(n.a())) != null && f.mGapDir == -1) {
                this.b -= f.a(this.e);
            }
        }

        void e() {
            this.a.clear();
            q();
            this.d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.z ? i(this.a.size() - 1, -1, true) : i(0, this.a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.z ? i(0, this.a.size(), true) : i(this.a.size() - 1, -1, true);
        }

        int h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.u.m();
            int i3 = StaggeredGridLayoutManager.this.u.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.a.get(i);
                int g = StaggeredGridLayoutManager.this.u.g(view);
                int d = StaggeredGridLayoutManager.this.u.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g >= i3 : g > i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (g >= m && d <= i3) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                        if (g < m || d > i3) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    }
                }
                i += i4;
            }
            return -1;
        }

        int i(int i, int i2, boolean z) {
            return h(i, i2, false, false, z);
        }

        public int j() {
            return this.d;
        }

        int k() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.c;
        }

        int l(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.c;
        }

        public View m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.l0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.l0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.l0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.l0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i = this.b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.b;
        }

        int p(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            d();
            return this.b;
        }

        void q() {
            this.b = RecyclerView.UNDEFINED_DURATION;
            this.c = RecyclerView.UNDEFINED_DURATION;
        }

        void r(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        void s() {
            int size = this.a.size();
            View view = (View) this.a.remove(size - 1);
            c n = n(view);
            n.e = null;
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(view);
            }
            if (size == 1) {
                this.b = RecyclerView.UNDEFINED_DURATION;
            }
            this.c = RecyclerView.UNDEFINED_DURATION;
        }

        void t() {
            View view = (View) this.a.remove(0);
            c n = n(view);
            n.e = null;
            if (this.a.size() == 0) {
                this.c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(view);
            }
            this.b = RecyclerView.UNDEFINED_DURATION;
        }

        void u(View view) {
            c n = n(view);
            n.e = this;
            this.a.add(0, view);
            this.b = RecyclerView.UNDEFINED_DURATION;
            if (this.a.size() == 1) {
                this.c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        void v(int i) {
            this.b = i;
            this.c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.d m0 = RecyclerView.o.m0(context, attributeSet, i, i2);
        N2(m0.a);
        P2(m0.b);
        O2(m0.c);
        this.y = new i();
        g2();
    }

    private void A2(View view, int i, int i2, boolean z) {
        o(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int X2 = X2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int X22 = X2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z ? N1(view, X2, X22, cVar) : L1(view, X2, X22, cVar)) {
            view.measure(X2, X22);
        }
    }

    private void B2(View view, c cVar, boolean z) {
        if (cVar.f) {
            if (this.w == 1) {
                A2(view, this.J, RecyclerView.o.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
                return;
            } else {
                A2(view, RecyclerView.o.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z);
                return;
            }
        }
        if (this.w == 1) {
            A2(view, RecyclerView.o.P(this.x, t0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.o.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
        } else {
            A2(view, RecyclerView.o.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.o.P(this.x, c0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        if (Y1() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void C2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.z r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.C2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    private boolean D2(int i) {
        if (this.w == 0) {
            return (i == -1) != this.A;
        }
        return ((i == -1) == this.A) == z2();
    }

    private void F2(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].u(view);
        }
    }

    private void G2(RecyclerView.v vVar, i iVar) {
        if (!iVar.a || iVar.i) {
            return;
        }
        if (iVar.b == 0) {
            if (iVar.e == -1) {
                H2(vVar, iVar.g);
                return;
            } else {
                I2(vVar, iVar.f);
                return;
            }
        }
        if (iVar.e != -1) {
            int t2 = t2(iVar.g) - iVar.g;
            I2(vVar, t2 < 0 ? iVar.f : Math.min(t2, iVar.b) + iVar.f);
        } else {
            int i = iVar.f;
            int s2 = i - s2(i);
            H2(vVar, s2 < 0 ? iVar.g : iVar.g - Math.min(s2, iVar.b));
        }
    }

    private void H2(RecyclerView.v vVar, int i) {
        for (int O = O() - 1; O >= 0; O--) {
            View N = N(O);
            if (this.u.g(N) < i || this.u.q(N) < i) {
                return;
            }
            c cVar = (c) N.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].s();
                }
            } else if (cVar.e.a.size() == 1) {
                return;
            } else {
                cVar.e.s();
            }
            r1(N, vVar);
        }
    }

    private void I2(RecyclerView.v vVar, int i) {
        while (O() > 0) {
            View N = N(0);
            if (this.u.d(N) > i || this.u.p(N) > i) {
                return;
            }
            c cVar = (c) N.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].t();
                }
            } else if (cVar.e.a.size() == 1) {
                return;
            } else {
                cVar.e.t();
            }
            r1(N, vVar);
        }
    }

    private void J2() {
        if (this.v.k() == 1073741824) {
            return;
        }
        int O = O();
        float f = 0.0f;
        for (int i = 0; i < O; i++) {
            View N = N(i);
            float e = this.v.e(N);
            if (e >= f) {
                if (((c) N.getLayoutParams()).e()) {
                    e = (e * 1.0f) / this.s;
                }
                f = Math.max(f, e);
            }
        }
        int i2 = this.x;
        int round = Math.round(f * this.s);
        if (this.v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.v.n());
        }
        V2(round);
        if (this.x == i2) {
            return;
        }
        for (int i3 = 0; i3 < O; i3++) {
            View N2 = N(i3);
            c cVar = (c) N2.getLayoutParams();
            if (!cVar.f) {
                if (z2() && this.w == 1) {
                    int i4 = this.s;
                    int i5 = cVar.e.e;
                    N2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.x) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = cVar.e.e;
                    int i7 = this.x * i6;
                    int i8 = i6 * i2;
                    if (this.w == 1) {
                        N2.offsetLeftAndRight(i7 - i8);
                    } else {
                        N2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    private void K2() {
        if (this.w == 1 || !z2()) {
            this.A = this.z;
        } else {
            this.A = !this.z;
        }
    }

    private void M2(int i) {
        i iVar = this.y;
        iVar.e = i;
        iVar.d = this.A != (i == -1) ? -1 : 1;
    }

    private void Q2(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].a.isEmpty()) {
                W2(this.t[i3], i, i2);
            }
        }
    }

    private boolean R2(RecyclerView.z zVar, b bVar) {
        bVar.a = this.G ? m2(zVar.b()) : i2(zVar.b());
        bVar.b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    private void S1(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    private void T1(b bVar) {
        SavedState savedState = this.I;
        int i = savedState.mSpanOffsetsSize;
        if (i > 0) {
            if (i == this.s) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    this.t[i2].e();
                    SavedState savedState2 = this.I;
                    int i3 = savedState2.mSpanOffsets[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += savedState2.mAnchorLayoutFromEnd ? this.u.i() : this.u.m();
                    }
                    this.t[i2].v(i3);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.I;
                savedState3.mAnchorPosition = savedState3.mVisibleAnchorPosition;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.mLastLayoutRTL;
        O2(savedState4.mReverseLayout);
        K2();
        SavedState savedState5 = this.I;
        int i4 = savedState5.mAnchorPosition;
        if (i4 != -1) {
            this.C = i4;
            bVar.c = savedState5.mAnchorLayoutFromEnd;
        } else {
            bVar.c = this.A;
        }
        if (savedState5.mSpanLookupSize > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.a = savedState5.mSpanLookup;
            lazySpanLookup.b = savedState5.mFullSpanItems;
        }
    }

    private void U2(int i, RecyclerView.z zVar) {
        int i2;
        int i3;
        int c2;
        i iVar = this.y;
        boolean z = false;
        iVar.b = 0;
        iVar.c = i;
        if (!B0() || (c2 = zVar.c()) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.A == (c2 < i)) {
                i2 = this.u.n();
                i3 = 0;
            } else {
                i3 = this.u.n();
                i2 = 0;
            }
        }
        if (R()) {
            this.y.f = this.u.m() - i3;
            this.y.g = this.u.i() + i2;
        } else {
            this.y.g = this.u.h() + i2;
            this.y.f = -i3;
        }
        i iVar2 = this.y;
        iVar2.h = false;
        iVar2.a = true;
        if (this.u.k() == 0 && this.u.h() == 0) {
            z = true;
        }
        iVar2.i = z;
    }

    private void W1(View view, c cVar, i iVar) {
        if (iVar.e == 1) {
            if (cVar.f) {
                S1(view);
                return;
            } else {
                cVar.e.a(view);
                return;
            }
        }
        if (cVar.f) {
            F2(view);
        } else {
            cVar.e.u(view);
        }
    }

    private void W2(d dVar, int i, int i2) {
        int j = dVar.j();
        if (i == -1) {
            if (dVar.o() + j <= i2) {
                this.B.set(dVar.e, false);
            }
        } else if (dVar.k() - j >= i2) {
            this.B.set(dVar.e, false);
        }
    }

    private int X1(int i) {
        if (O() == 0) {
            return this.A ? 1 : -1;
        }
        return (i < p2()) != this.A ? -1 : 1;
    }

    private int X2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    private boolean Z1(d dVar) {
        if (this.A) {
            if (dVar.k() < this.u.i()) {
                ArrayList arrayList = dVar.a;
                return !dVar.n((View) arrayList.get(arrayList.size() - 1)).f;
            }
        } else if (dVar.o() > this.u.m()) {
            return !dVar.n((View) dVar.a.get(0)).f;
        }
        return false;
    }

    private int a2(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        return o.a(zVar, this.u, k2(!this.N), j2(!this.N), this, this.N);
    }

    private int b2(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        return o.b(zVar, this.u, k2(!this.N), j2(!this.N), this, this.N, this.A);
    }

    private int c2(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        return o.c(zVar, this.u, k2(!this.N), j2(!this.N), this, this.N);
    }

    private int d2(int i) {
        if (i == 1) {
            return (this.w != 1 && z2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.w != 1 && z2()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.w == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 33) {
            if (this.w == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 66) {
            if (this.w == 0) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 130 && this.w == 1) {
            return 1;
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    private LazySpanLookup.FullSpanItem e2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.mGapPerSpan[i2] = i - this.t[i2].l(i);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem f2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.mGapPerSpan[i2] = this.t[i2].p(i) - i;
        }
        return fullSpanItem;
    }

    private void g2() {
        this.u = l.b(this, this.w);
        this.v = l.b(this, 1 - this.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int h2(RecyclerView.v vVar, i iVar, RecyclerView.z zVar) {
        d dVar;
        int e;
        int i;
        int i2;
        int e2;
        boolean z;
        ?? r9 = 0;
        this.B.set(0, this.s, true);
        int i3 = this.y.i ? iVar.e == 1 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION : iVar.e == 1 ? iVar.g + iVar.b : iVar.f - iVar.b;
        Q2(iVar.e, i3);
        int i4 = this.A ? this.u.i() : this.u.m();
        boolean z2 = false;
        while (iVar.a(zVar) && (this.y.i || !this.B.isEmpty())) {
            View b2 = iVar.b(vVar);
            c cVar = (c) b2.getLayoutParams();
            int a2 = cVar.a();
            int g = this.E.g(a2);
            boolean z3 = g == -1 ? true : r9;
            if (z3) {
                dVar = cVar.f ? this.t[r9] : v2(iVar);
                this.E.n(a2, dVar);
            } else {
                dVar = this.t[g];
            }
            d dVar2 = dVar;
            cVar.e = dVar2;
            if (iVar.e == 1) {
                i(b2);
            } else {
                j(b2, r9);
            }
            B2(b2, cVar, r9);
            if (iVar.e == 1) {
                int r2 = cVar.f ? r2(i4) : dVar2.l(i4);
                int e3 = this.u.e(b2) + r2;
                if (z3 && cVar.f) {
                    LazySpanLookup.FullSpanItem e22 = e2(r2);
                    e22.mGapDir = -1;
                    e22.mPosition = a2;
                    this.E.a(e22);
                }
                i = e3;
                e = r2;
            } else {
                int u2 = cVar.f ? u2(i4) : dVar2.p(i4);
                e = u2 - this.u.e(b2);
                if (z3 && cVar.f) {
                    LazySpanLookup.FullSpanItem f2 = f2(u2);
                    f2.mGapDir = 1;
                    f2.mPosition = a2;
                    this.E.a(f2);
                }
                i = u2;
            }
            if (cVar.f && iVar.d == -1) {
                if (z3) {
                    this.M = true;
                } else {
                    if (!(iVar.e == 1 ? U1() : V1())) {
                        LazySpanLookup.FullSpanItem f = this.E.f(a2);
                        if (f != null) {
                            f.mHasUnwantedGapAfter = true;
                        }
                        this.M = true;
                    }
                }
            }
            W1(b2, cVar, iVar);
            if (z2() && this.w == 1) {
                int i5 = cVar.f ? this.v.i() : this.v.i() - (((this.s - 1) - dVar2.e) * this.x);
                e2 = i5;
                i2 = i5 - this.v.e(b2);
            } else {
                int m = cVar.f ? this.v.m() : (dVar2.e * this.x) + this.v.m();
                i2 = m;
                e2 = this.v.e(b2) + m;
            }
            if (this.w == 1) {
                E0(b2, i2, e, e2, i);
            } else {
                E0(b2, e, i2, i, e2);
            }
            if (cVar.f) {
                Q2(this.y.e, i3);
            } else {
                W2(dVar2, this.y.e, i3);
            }
            G2(vVar, this.y);
            if (this.y.h && b2.hasFocusable()) {
                if (cVar.f) {
                    this.B.clear();
                } else {
                    z = false;
                    this.B.set(dVar2.e, false);
                    r9 = z;
                    z2 = true;
                }
            }
            z = false;
            r9 = z;
            z2 = true;
        }
        int i6 = r9;
        if (!z2) {
            G2(vVar, this.y);
        }
        int m2 = this.y.e == -1 ? this.u.m() - u2(this.u.m()) : r2(this.u.i()) - this.u.i();
        return m2 > 0 ? Math.min(iVar.b, m2) : i6;
    }

    private int i2(int i) {
        int O = O();
        for (int i2 = 0; i2 < O; i2++) {
            int l0 = l0(N(i2));
            if (l0 >= 0 && l0 < i) {
                return l0;
            }
        }
        return 0;
    }

    private int m2(int i) {
        for (int O = O() - 1; O >= 0; O--) {
            int l0 = l0(N(O));
            if (l0 >= 0 && l0 < i) {
                return l0;
            }
        }
        return 0;
    }

    private void n2(RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int i;
        int r2 = r2(RecyclerView.UNDEFINED_DURATION);
        if (r2 != Integer.MIN_VALUE && (i = this.u.i() - r2) > 0) {
            int i2 = i - (-L2(-i, vVar, zVar));
            if (!z || i2 <= 0) {
                return;
            }
            this.u.r(i2);
        }
    }

    private void o2(RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int m;
        int u2 = u2(Integer.MAX_VALUE);
        if (u2 != Integer.MAX_VALUE && (m = u2 - this.u.m()) > 0) {
            int L2 = m - L2(m, vVar, zVar);
            if (!z || L2 <= 0) {
                return;
            }
            this.u.r(-L2);
        }
    }

    private int r2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    private int s2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    private int t2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    private int u2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    private d v2(i iVar) {
        int i;
        int i2;
        int i3;
        if (D2(iVar.e)) {
            i2 = this.s - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.s;
            i2 = 0;
            i3 = 1;
        }
        d dVar = null;
        if (iVar.e == 1) {
            int m = this.u.m();
            int i4 = Integer.MAX_VALUE;
            while (i2 != i) {
                d dVar2 = this.t[i2];
                int l = dVar2.l(m);
                if (l < i4) {
                    dVar = dVar2;
                    i4 = l;
                }
                i2 += i3;
            }
            return dVar;
        }
        int i5 = this.u.i();
        int i6 = RecyclerView.UNDEFINED_DURATION;
        while (i2 != i) {
            d dVar3 = this.t[i2];
            int p = dVar3.p(i5);
            if (p > i6) {
                dVar = dVar3;
                i6 = p;
            }
            i2 += i3;
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.q2()
            goto Ld
        L9:
            int r0 = r6.p2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.A
            if (r7 == 0) goto L4e
            int r7 = r6.p2()
            goto L52
        L4e:
            int r7 = r6.q2()
        L52:
            if (r3 > r7) goto L57
            r6.y1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return c2(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int B1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        return L2(i, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(int i) {
        SavedState savedState = this.I;
        if (savedState != null && savedState.mAnchorPosition != i) {
            savedState.a();
        }
        this.C = i;
        this.D = RecyclerView.UNDEFINED_DURATION;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int D1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        return L2(i, vVar, zVar);
    }

    void E2(int i, RecyclerView.z zVar) {
        int p2;
        int i2;
        if (i > 0) {
            p2 = q2();
            i2 = 1;
        } else {
            p2 = p2();
            i2 = -1;
        }
        this.y.a = true;
        U2(p2, zVar);
        M2(i2);
        i iVar = this.y;
        iVar.c = p2 + iVar.d;
        iVar.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void H0(int i) {
        super.H0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return this.w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(int i) {
        super.I0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I1(Rect rect, int i, int i2) {
        int s;
        int s2;
        int i0 = i0() + j0();
        int k0 = k0() + h0();
        if (this.w == 1) {
            s2 = RecyclerView.o.s(i2, rect.height() + k0, f0());
            s = RecyclerView.o.s(i, (this.x * this.s) + i0, g0());
        } else {
            s = RecyclerView.o.s(i, rect.width() + i0, g0());
            s2 = RecyclerView.o.s(i2, (this.x * this.s) + k0, f0());
        }
        H1(s, s2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void J0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.E.b();
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    int L2(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (O() == 0 || i == 0) {
            return 0;
        }
        E2(i, zVar);
        int h2 = h2(vVar, this.y, zVar);
        if (this.y.b >= h2) {
            i = i < 0 ? -h2 : h2;
        }
        this.u.r(-i);
        this.G = this.A;
        i iVar = this.y;
        iVar.b = 0;
        G2(vVar, iVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void N0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.N0(recyclerView, vVar);
        t1(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
        recyclerView.requestLayout();
    }

    public void N2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        l(null);
        if (i == this.w) {
            return;
        }
        this.w = i;
        l lVar = this.u;
        this.u = this.v;
        this.v = lVar;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View O0(View view, int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        View G;
        View m;
        if (O() == 0 || (G = G(view)) == null) {
            return null;
        }
        K2();
        int d2 = d2(i);
        if (d2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) G.getLayoutParams();
        boolean z = cVar.f;
        d dVar = cVar.e;
        int q2 = d2 == 1 ? q2() : p2();
        U2(q2, zVar);
        M2(d2);
        i iVar = this.y;
        iVar.c = iVar.d + q2;
        iVar.b = (int) (this.u.n() * 0.33333334f);
        i iVar2 = this.y;
        iVar2.h = true;
        iVar2.a = false;
        h2(vVar, iVar2, zVar);
        this.G = this.A;
        if (!z && (m = dVar.m(q2, d2)) != null && m != G) {
            return m;
        }
        if (D2(d2)) {
            for (int i2 = this.s - 1; i2 >= 0; i2--) {
                View m2 = this.t[i2].m(q2, d2);
                if (m2 != null && m2 != G) {
                    return m2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.s; i3++) {
                View m3 = this.t[i3].m(q2, d2);
                if (m3 != null && m3 != G) {
                    return m3;
                }
            }
        }
        boolean z2 = (this.z ^ true) == (d2 == -1);
        if (!z) {
            View H = H(z2 ? dVar.f() : dVar.g());
            if (H != null && H != G) {
                return H;
            }
        }
        if (D2(d2)) {
            for (int i4 = this.s - 1; i4 >= 0; i4--) {
                if (i4 != dVar.e) {
                    View H2 = H(z2 ? this.t[i4].f() : this.t[i4].g());
                    if (H2 != null && H2 != G) {
                        return H2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.s; i5++) {
                View H3 = H(z2 ? this.t[i5].f() : this.t[i5].g());
                if (H3 != null && H3 != G) {
                    return H3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i);
        P1(jVar);
    }

    public void O2(boolean z) {
        l(null);
        SavedState savedState = this.I;
        if (savedState != null && savedState.mReverseLayout != z) {
            savedState.mReverseLayout = z;
        }
        this.z = z;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            View k2 = k2(false);
            View j2 = j2(false);
            if (k2 == null || j2 == null) {
                return;
            }
            int l0 = l0(k2);
            int l02 = l0(j2);
            if (l0 < l02) {
                accessibilityEvent.setFromIndex(l0);
                accessibilityEvent.setToIndex(l02);
            } else {
                accessibilityEvent.setFromIndex(l02);
                accessibilityEvent.setToIndex(l0);
            }
        }
    }

    public void P2(int i) {
        l(null);
        if (i != this.s) {
            y2();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new d[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new d(i2);
            }
            y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean R1() {
        return this.I == null;
    }

    boolean S2(RecyclerView.z zVar, b bVar) {
        int i;
        if (!zVar.e() && (i = this.C) != -1) {
            if (i >= 0 && i < zVar.b()) {
                SavedState savedState = this.I;
                if (savedState == null || savedState.mAnchorPosition == -1 || savedState.mSpanOffsetsSize < 1) {
                    View H = H(this.C);
                    if (H != null) {
                        bVar.a = this.A ? q2() : p2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (this.u.i() - this.D) - this.u.d(H);
                            } else {
                                bVar.b = (this.u.m() + this.D) - this.u.g(H);
                            }
                            return true;
                        }
                        if (this.u.e(H) > this.u.n()) {
                            bVar.b = bVar.c ? this.u.i() : this.u.m();
                            return true;
                        }
                        int g = this.u.g(H) - this.u.m();
                        if (g < 0) {
                            bVar.b = -g;
                            return true;
                        }
                        int i2 = this.u.i() - this.u.d(H);
                        if (i2 < 0) {
                            bVar.b = i2;
                            return true;
                        }
                        bVar.b = RecyclerView.UNDEFINED_DURATION;
                    } else {
                        int i3 = this.C;
                        bVar.a = i3;
                        int i4 = this.D;
                        if (i4 == Integer.MIN_VALUE) {
                            bVar.c = X1(i3) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i4);
                        }
                        bVar.d = true;
                    }
                } else {
                    bVar.b = RecyclerView.UNDEFINED_DURATION;
                    bVar.a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    void T2(RecyclerView.z zVar, b bVar) {
        if (S2(zVar, bVar) || R2(zVar, bVar)) {
            return;
        }
        bVar.a();
        bVar.a = 0;
    }

    boolean U1() {
        int l = this.t[0].l(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].l(RecyclerView.UNDEFINED_DURATION) != l) {
                return false;
            }
        }
        return true;
    }

    boolean V1() {
        int p = this.t[0].p(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].p(RecyclerView.UNDEFINED_DURATION) != p) {
                return false;
            }
        }
        return true;
    }

    void V2(int i) {
        this.x = i / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i, this.v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView, int i, int i2) {
        w2(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView recyclerView) {
        this.E.b();
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView recyclerView, int i, int i2, int i3) {
        w2(i, i2, 8);
    }

    boolean Y1() {
        int p2;
        int q2;
        if (O() == 0 || this.F == 0 || !v0()) {
            return false;
        }
        if (this.A) {
            p2 = q2();
            q2 = p2();
        } else {
            p2 = p2();
            q2 = q2();
        }
        if (p2 == 0 && x2() != null) {
            this.E.b();
            z1();
            y1();
            return true;
        }
        if (!this.M) {
            return false;
        }
        int i = this.A ? -1 : 1;
        int i2 = q2 + 1;
        LazySpanLookup.FullSpanItem e = this.E.e(p2, i2, i, true);
        if (e == null) {
            this.M = false;
            this.E.d(i2);
            return false;
        }
        LazySpanLookup.FullSpanItem e2 = this.E.e(p2, e.mPosition, i * (-1), true);
        if (e2 == null) {
            this.E.d(e.mPosition);
        } else {
            this.E.d(e2.mPosition + 1);
        }
        z1();
        y1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Z0(RecyclerView recyclerView, int i, int i2) {
        w2(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView recyclerView, int i, int i2, Object obj) {
        w2(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.v vVar, RecyclerView.z zVar) {
        C2(vVar, zVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF d(int i) {
        int X1 = X1(i);
        PointF pointF = new PointF();
        if (X1 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = X1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = X1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d1(RecyclerView.z zVar) {
        super.d1(zVar);
        this.C = -1;
        this.D = RecyclerView.UNDEFINED_DURATION;
        this.I = null;
        this.L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.I = savedState;
            if (this.C != -1) {
                savedState.a();
                this.I.b();
            }
            y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable i1() {
        int p;
        int m;
        int[] iArr;
        if (this.I != null) {
            return new SavedState(this.I);
        }
        SavedState savedState = new SavedState();
        savedState.mReverseLayout = this.z;
        savedState.mAnchorLayoutFromEnd = this.G;
        savedState.mLastLayoutRTL = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.a) == null) {
            savedState.mSpanLookupSize = 0;
        } else {
            savedState.mSpanLookup = iArr;
            savedState.mSpanLookupSize = iArr.length;
            savedState.mFullSpanItems = lazySpanLookup.b;
        }
        if (O() > 0) {
            savedState.mAnchorPosition = this.G ? q2() : p2();
            savedState.mVisibleAnchorPosition = l2();
            int i = this.s;
            savedState.mSpanOffsetsSize = i;
            savedState.mSpanOffsets = new int[i];
            for (int i2 = 0; i2 < this.s; i2++) {
                if (this.G) {
                    p = this.t[i2].l(RecyclerView.UNDEFINED_DURATION);
                    if (p != Integer.MIN_VALUE) {
                        m = this.u.i();
                        p -= m;
                        savedState.mSpanOffsets[i2] = p;
                    } else {
                        savedState.mSpanOffsets[i2] = p;
                    }
                } else {
                    p = this.t[i2].p(RecyclerView.UNDEFINED_DURATION);
                    if (p != Integer.MIN_VALUE) {
                        m = this.u.m();
                        p -= m;
                        savedState.mSpanOffsets[i2] = p;
                    } else {
                        savedState.mSpanOffsets[i2] = p;
                    }
                }
            }
        } else {
            savedState.mAnchorPosition = -1;
            savedState.mVisibleAnchorPosition = -1;
            savedState.mSpanOffsetsSize = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void j1(int i) {
        if (i == 0) {
            Y1();
        }
    }

    View j2(boolean z) {
        int m = this.u.m();
        int i = this.u.i();
        View view = null;
        for (int O = O() - 1; O >= 0; O--) {
            View N = N(O);
            int g = this.u.g(N);
            int d2 = this.u.d(N);
            if (d2 > m && g < i) {
                if (d2 <= i || !z) {
                    return N;
                }
                if (view == null) {
                    view = N;
                }
            }
        }
        return view;
    }

    View k2(boolean z) {
        int m = this.u.m();
        int i = this.u.i();
        int O = O();
        View view = null;
        for (int i2 = 0; i2 < O; i2++) {
            View N = N(i2);
            int g = this.u.g(N);
            if (this.u.d(N) > m && g < i) {
                if (g >= m || !z) {
                    return N;
                }
                if (view == null) {
                    view = N;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l(String str) {
        if (this.I == null) {
            super.l(str);
        }
    }

    int l2() {
        View j2 = this.A ? j2(true) : k2(true);
        if (j2 == null) {
            return -1;
        }
        return l0(j2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p() {
        return this.w == 0;
    }

    int p2() {
        if (O() == 0) {
            return 0;
        }
        return l0(N(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return this.w == 1;
    }

    int q2() {
        int O = O();
        if (O == 0) {
            return 0;
        }
        return l0(N(O - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean r(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t(int i, int i2, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int l;
        int i3;
        if (this.w != 0) {
            i = i2;
        }
        if (O() == 0 || i == 0) {
            return;
        }
        E2(i, zVar);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.s) {
            this.O = new int[this.s];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.s; i5++) {
            i iVar = this.y;
            if (iVar.d == -1) {
                l = iVar.f;
                i3 = this.t[i5].p(l);
            } else {
                l = this.t[i5].l(iVar.g);
                i3 = this.y.g;
            }
            int i6 = l - i3;
            if (i6 >= 0) {
                this.O[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.O, 0, i4);
        for (int i7 = 0; i7 < i4 && this.y.a(zVar); i7++) {
            cVar.a(this.y.c, this.O[i7]);
            i iVar2 = this.y;
            iVar2.c += iVar2.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return a2(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return b2(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w0() {
        return this.F != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return c2(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View x2() {
        /*
            r12 = this;
            int r0 = r12.O()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.z2()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.A
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.N(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            boolean r9 = r12.Z1(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.N(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.l r10 = r12.u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.l r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.l r10 = r12.u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.l r11 = r12.u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.e
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.x2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.z zVar) {
        return a2(zVar);
    }

    public void y2() {
        this.E.b();
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return b2(zVar);
    }

    boolean z2() {
        return d0() == 1;
    }

    static class LazySpanLookup {
        int[] a;
        List b;

        LazySpanLookup() {
        }

        private int i(int i) {
            if (this.b == null) {
                return -1;
            }
            FullSpanItem f = f(i);
            if (f != null) {
                this.b.remove(f);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (((FullSpanItem) this.b.get(i2)).mPosition >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(i2);
            this.b.remove(i2);
            return fullSpanItem.mPosition;
        }

        private void l(int i, int i2) {
            List list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                int i3 = fullSpanItem.mPosition;
                if (i3 >= i) {
                    fullSpanItem.mPosition = i3 + i2;
                }
            }
        }

        private void m(int i, int i2) {
            List list = this.b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                int i4 = fullSpanItem.mPosition;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        fullSpanItem.mPosition = i4 - i2;
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.b.get(i);
                if (fullSpanItem2.mPosition == fullSpanItem.mPosition) {
                    this.b.remove(i);
                }
                if (fullSpanItem2.mPosition >= fullSpanItem.mPosition) {
                    this.b.add(i, fullSpanItem);
                    return;
                }
            }
            this.b.add(fullSpanItem);
        }

        void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i) {
            List list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.b.get(size)).mPosition >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public FullSpanItem e(int i, int i2, int i3, boolean z) {
            List list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(i4);
                int i5 = fullSpanItem.mPosition;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.mGapDir == i3 || (z && fullSpanItem.mHasUnwantedGapAfter))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i) {
            List list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                if (fullSpanItem.mPosition == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int g(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        int h(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = i(i);
            if (i2 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int min = Math.min(i2 + 1, this.a.length);
            Arrays.fill(this.a, i, min, -1);
            return min;
        }

        void j(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            l(i, i2);
        }

        void k(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m(i, i2);
        }

        void n(int i, d dVar) {
            c(i);
            this.a[i] = dVar.e;
        }

        int o(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();
            int mGapDir;
            int[] mGapPerSpan;
            boolean mHasUnwantedGapAfter;
            int mPosition;

            class a implements Parcelable.Creator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.mPosition = parcel.readInt();
                this.mGapDir = parcel.readInt();
                this.mHasUnwantedGapAfter = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.mGapPerSpan = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i) {
                int[] iArr = this.mGapPerSpan;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.mPosition + ", mGapDir=" + this.mGapDir + ", mHasUnwantedGapAfter=" + this.mHasUnwantedGapAfter + ", mGapPerSpan=" + Arrays.toString(this.mGapPerSpan) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.mPosition);
                parcel.writeInt(this.mGapDir);
                parcel.writeInt(this.mHasUnwantedGapAfter ? 1 : 0);
                int[] iArr = this.mGapPerSpan;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.mGapPerSpan);
                }
            }

            FullSpanItem() {
            }
        }
    }
}
