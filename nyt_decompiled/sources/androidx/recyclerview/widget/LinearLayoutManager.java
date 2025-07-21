package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    int A;
    int B;
    private boolean C;
    SavedState D;
    final a E;
    private final b F;
    private int G;
    private int[] H;
    int s;
    private c t;
    l u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

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

        boolean a() {
            return this.mAnchorPosition >= 0;
        }

        void b() {
            this.mAnchorPosition = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
        }
    }

    static class a {
        l a;
        int b;
        int c;
        boolean d;
        boolean e;

        a() {
            e();
        }

        void a() {
            this.c = this.d ? this.a.i() : this.a.m();
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.a.d(view) + this.a.o();
            } else {
                this.c = this.a.g(view);
            }
            this.b = i;
        }

        public void c(View view, int i) {
            int o = this.a.o();
            if (o >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - o) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int e = this.c - this.a.e(view);
                    int m = this.a.m();
                    int min = e - (m + Math.min(this.a.g(view) - m, 0));
                    if (min < 0) {
                        this.c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.a.g(view);
            int m2 = g - this.a.m();
            this.c = g;
            if (m2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - o) - this.a.d(view))) - (g + this.a.e(view));
                if (i3 < 0) {
                    this.c -= Math.min(m2, -i3);
                }
            }
        }

        boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < zVar.b();
        }

        void e() {
            this.b = -1;
            this.c = RecyclerView.UNDEFINED_DURATION;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    protected static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        protected b() {
        }

        void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    static class c {
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int k;
        boolean m;
        boolean a = true;
        int h = 0;
        int i = 0;
        boolean j = false;
        List l = null;

        c() {
        }

        private View e() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = ((RecyclerView.d0) this.l.get(i)).a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f = f(view);
            if (f == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.p) f.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.z zVar) {
            int i = this.d;
            return i >= 0 && i < zVar.b();
        }

        View d(RecyclerView.v vVar) {
            if (this.l != null) {
                return e();
            }
            View o = vVar.o(this.d);
            this.d += this.e;
            return o;
        }

        public View f(View view) {
            int a;
            int size = this.l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((RecyclerView.d0) this.l.get(i2)).a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a = (pVar.a() - this.d) * this.e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void A2(RecyclerView.v vVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int O = O();
        if (!this.x) {
            for (int i4 = 0; i4 < O; i4++) {
                View N = N(i4);
                if (this.u.d(N) > i3 || this.u.p(N) > i3) {
                    y2(vVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = O - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View N2 = N(i6);
            if (this.u.d(N2) > i3 || this.u.p(N2) > i3) {
                y2(vVar, i5, i6);
                return;
            }
        }
    }

    private void C2() {
        if (this.s == 1 || !s2()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    private boolean H2(RecyclerView.v vVar, RecyclerView.z zVar, a aVar) {
        View l2;
        boolean z = false;
        if (O() == 0) {
            return false;
        }
        View a0 = a0();
        if (a0 != null && aVar.d(a0, zVar)) {
            aVar.c(a0, l0(a0));
            return true;
        }
        boolean z2 = this.v;
        boolean z3 = this.y;
        if (z2 != z3 || (l2 = l2(vVar, zVar, aVar.d, z3)) == null) {
            return false;
        }
        aVar.b(l2, l0(l2));
        if (!zVar.e() && R1()) {
            int g = this.u.g(l2);
            int d = this.u.d(l2);
            int m = this.u.m();
            int i = this.u.i();
            boolean z4 = d <= m && g < m;
            if (g >= i && d > i) {
                z = true;
            }
            if (z4 || z) {
                if (aVar.d) {
                    m = i;
                }
                aVar.c = m;
            }
        }
        return true;
    }

    private boolean I2(RecyclerView.z zVar, a aVar) {
        int i;
        if (!zVar.e() && (i = this.A) != -1) {
            if (i >= 0 && i < zVar.b()) {
                aVar.b = this.A;
                SavedState savedState = this.D;
                if (savedState != null && savedState.a()) {
                    boolean z = this.D.mAnchorLayoutFromEnd;
                    aVar.d = z;
                    if (z) {
                        aVar.c = this.u.i() - this.D.mAnchorOffset;
                    } else {
                        aVar.c = this.u.m() + this.D.mAnchorOffset;
                    }
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z2 = this.x;
                    aVar.d = z2;
                    if (z2) {
                        aVar.c = this.u.i() - this.B;
                    } else {
                        aVar.c = this.u.m() + this.B;
                    }
                    return true;
                }
                View H = H(this.A);
                if (H == null) {
                    if (O() > 0) {
                        aVar.d = (this.A < l0(N(0))) == this.x;
                    }
                    aVar.a();
                } else {
                    if (this.u.e(H) > this.u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.u.g(H) - this.u.m() < 0) {
                        aVar.c = this.u.m();
                        aVar.d = false;
                        return true;
                    }
                    if (this.u.i() - this.u.d(H) < 0) {
                        aVar.c = this.u.i();
                        aVar.d = true;
                        return true;
                    }
                    aVar.c = aVar.d ? this.u.d(H) + this.u.o() : this.u.g(H);
                }
                return true;
            }
            this.A = -1;
            this.B = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    private void J2(RecyclerView.v vVar, RecyclerView.z zVar, a aVar) {
        if (I2(zVar, aVar) || H2(vVar, zVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.b = this.y ? zVar.b() - 1 : 0;
    }

    private void K2(int i, int i2, boolean z, RecyclerView.z zVar) {
        int m;
        this.t.m = B2();
        this.t.f = i;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        S1(zVar, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        boolean z2 = i == 1;
        c cVar = this.t;
        int i3 = z2 ? max2 : max;
        cVar.h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        if (z2) {
            cVar.h = i3 + this.u.j();
            View o2 = o2();
            c cVar2 = this.t;
            cVar2.e = this.x ? -1 : 1;
            int l0 = l0(o2);
            c cVar3 = this.t;
            cVar2.d = l0 + cVar3.e;
            cVar3.b = this.u.d(o2);
            m = this.u.d(o2) - this.u.i();
        } else {
            View p2 = p2();
            this.t.h += this.u.m();
            c cVar4 = this.t;
            cVar4.e = this.x ? 1 : -1;
            int l02 = l0(p2);
            c cVar5 = this.t;
            cVar4.d = l02 + cVar5.e;
            cVar5.b = this.u.g(p2);
            m = (-this.u.g(p2)) + this.u.m();
        }
        c cVar6 = this.t;
        cVar6.c = i2;
        if (z) {
            cVar6.c = i2 - m;
        }
        cVar6.g = m;
    }

    private void L2(int i, int i2) {
        this.t.c = this.u.i() - i2;
        c cVar = this.t;
        cVar.e = this.x ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = RecyclerView.UNDEFINED_DURATION;
    }

    private void M2(a aVar) {
        L2(aVar.b, aVar.c);
    }

    private void N2(int i, int i2) {
        this.t.c = i2 - this.u.m();
        c cVar = this.t;
        cVar.d = i;
        cVar.e = this.x ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = RecyclerView.UNDEFINED_DURATION;
    }

    private void O2(a aVar) {
        N2(aVar.b, aVar.c);
    }

    private int U1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        Z1();
        return o.a(zVar, this.u, d2(!this.z, true), c2(!this.z, true), this, this.z);
    }

    private int V1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        Z1();
        return o.b(zVar, this.u, d2(!this.z, true), c2(!this.z, true), this, this.z, this.x);
    }

    private int W1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        Z1();
        return o.c(zVar, this.u, d2(!this.z, true), c2(!this.z, true), this, this.z);
    }

    private View b2() {
        return h2(0, O());
    }

    private View f2() {
        return h2(O() - 1, -1);
    }

    private View j2() {
        return this.x ? b2() : f2();
    }

    private View k2() {
        return this.x ? f2() : b2();
    }

    private int m2(int i, RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int i2;
        int i3 = this.u.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -D2(-i3, vVar, zVar);
        int i5 = i + i4;
        if (!z || (i2 = this.u.i() - i5) <= 0) {
            return i4;
        }
        this.u.r(i2);
        return i2 + i4;
    }

    private int n2(int i, RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int m;
        int m2 = i - this.u.m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -D2(m2, vVar, zVar);
        int i3 = i + i2;
        if (!z || (m = i3 - this.u.m()) <= 0) {
            return i2;
        }
        this.u.r(-m);
        return i2 - m;
    }

    private View o2() {
        return N(this.x ? 0 : O() - 1);
    }

    private View p2() {
        return N(this.x ? O() - 1 : 0);
    }

    private void v2(RecyclerView.v vVar, RecyclerView.z zVar, int i, int i2) {
        if (!zVar.g() || O() == 0 || zVar.e() || !R1()) {
            return;
        }
        List k = vVar.k();
        int size = k.size();
        int l0 = l0(N(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.d0 d0Var = (RecyclerView.d0) k.get(i5);
            if (!d0Var.E()) {
                if ((d0Var.u() < l0) != this.x) {
                    i3 += this.u.e(d0Var.a);
                } else {
                    i4 += this.u.e(d0Var.a);
                }
            }
        }
        this.t.l = k;
        if (i3 > 0) {
            N2(l0(p2()), i);
            c cVar = this.t;
            cVar.h = i3;
            cVar.c = 0;
            cVar.a();
            a2(vVar, this.t, zVar, false);
        }
        if (i4 > 0) {
            L2(l0(o2()), i2);
            c cVar2 = this.t;
            cVar2.h = i4;
            cVar2.c = 0;
            cVar2.a();
            a2(vVar, this.t, zVar, false);
        }
        this.t.l = null;
    }

    private void x2(RecyclerView.v vVar, c cVar) {
        if (!cVar.a || cVar.m) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            z2(vVar, i, i2);
        } else {
            A2(vVar, i, i2);
        }
    }

    private void y2(RecyclerView.v vVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                s1(i, vVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                s1(i3, vVar);
            }
        }
    }

    private void z2(RecyclerView.v vVar, int i, int i2) {
        int O = O();
        if (i < 0) {
            return;
        }
        int h = (this.u.h() - i) + i2;
        if (this.x) {
            for (int i3 = 0; i3 < O; i3++) {
                View N = N(i3);
                if (this.u.g(N) < h || this.u.q(N) < h) {
                    y2(vVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = O - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View N2 = N(i5);
            if (this.u.g(N2) < h || this.u.q(N2) < h) {
                y2(vVar, i4, i5);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return W1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int B1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.s == 1) {
            return 0;
        }
        return D2(i, vVar, zVar);
    }

    boolean B2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(int i) {
        this.A = i;
        this.B = RecyclerView.UNDEFINED_DURATION;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int D1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.s == 0) {
            return 0;
        }
        return D2(i, vVar, zVar);
    }

    int D2(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (O() == 0 || i == 0) {
            return 0;
        }
        Z1();
        this.t.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        K2(i2, abs, true, zVar);
        c cVar = this.t;
        int a2 = cVar.g + a2(vVar, cVar, zVar, false);
        if (a2 < 0) {
            return 0;
        }
        if (abs > a2) {
            i = i2 * a2;
        }
        this.u.r(-i);
        this.t.k = i;
        return i;
    }

    public void E2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        l(null);
        if (i != this.s || this.u == null) {
            l b2 = l.b(this, i);
            this.u = b2;
            this.E.a = b2;
            this.s = i;
            y1();
        }
    }

    public void F2(boolean z) {
        l(null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        y1();
    }

    public void G2(boolean z) {
        l(null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View H(int i) {
        int O = O();
        if (O == 0) {
            return null;
        }
        int l0 = i - l0(N(0));
        if (l0 >= 0 && l0 < O) {
            View N = N(l0);
            if (l0(N) == i) {
                return N;
            }
        }
        return super.H(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean M1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void N0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.N0(recyclerView, vVar);
        if (this.C) {
            p1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View O0(View view, int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int X1;
        C2();
        if (O() == 0 || (X1 = X1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        Z1();
        K2(X1, (int) (this.u.n() * 0.33333334f), false, zVar);
        c cVar = this.t;
        cVar.g = RecyclerView.UNDEFINED_DURATION;
        cVar.a = false;
        a2(vVar, cVar, zVar, true);
        View k2 = X1 == -1 ? k2() : j2();
        View p2 = X1 == -1 ? p2() : o2();
        if (!p2.hasFocusable()) {
            return k2;
        }
        if (k2 == null) {
            return null;
        }
        return p2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i);
        P1(jVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(e2());
            accessibilityEvent.setToIndex(g2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean R1() {
        return this.D == null && this.v == this.y;
    }

    protected void S1(RecyclerView.z zVar, int[] iArr) {
        int i;
        int q2 = q2(zVar);
        if (this.t.f == -1) {
            i = 0;
        } else {
            i = q2;
            q2 = 0;
        }
        iArr[0] = q2;
        iArr[1] = i;
    }

    void T1(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i = cVar.d;
        if (i < 0 || i >= zVar.b()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.g));
    }

    int X1(int i) {
        if (i == 1) {
            return (this.s != 1 && s2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.s != 1 && s2()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.s == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 33) {
            if (this.s == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 66) {
            if (this.s == 0) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 130 && this.s == 1) {
            return 1;
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    c Y1() {
        return new c();
    }

    void Z1() {
        if (this.t == null) {
            this.t = Y1();
        }
    }

    int a2(RecyclerView.v vVar, c cVar, RecyclerView.z zVar, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            x2(vVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            u2(vVar, zVar, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || cVar.l != null || !zVar.e()) {
                    int i4 = cVar.c;
                    int i5 = bVar.a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.a;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    x2(vVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.v vVar, RecyclerView.z zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int m2;
        int i5;
        View H;
        int g;
        int i6;
        int i7 = -1;
        if (!(this.D == null && this.A == -1) && zVar.b() == 0) {
            p1(vVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            this.A = this.D.mAnchorPosition;
        }
        Z1();
        this.t.a = false;
        C2();
        View a0 = a0();
        a aVar = this.E;
        if (!aVar.e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.d = this.x ^ this.y;
            J2(vVar, zVar, aVar2);
            this.E.e = true;
        } else if (a0 != null && (this.u.g(a0) >= this.u.i() || this.u.d(a0) <= this.u.m())) {
            this.E.c(a0, l0(a0));
        }
        c cVar = this.t;
        cVar.f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        S1(zVar, iArr);
        int max = Math.max(0, this.H[0]) + this.u.m();
        int max2 = Math.max(0, this.H[1]) + this.u.j();
        if (zVar.e() && (i5 = this.A) != -1 && this.B != Integer.MIN_VALUE && (H = H(i5)) != null) {
            if (this.x) {
                i6 = this.u.i() - this.u.d(H);
                g = this.B;
            } else {
                g = this.u.g(H) - this.u.m();
                i6 = this.B;
            }
            int i8 = i6 - g;
            if (i8 > 0) {
                max += i8;
            } else {
                max2 -= i8;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.d ? !this.x : this.x) {
            i7 = 1;
        }
        w2(vVar, zVar, aVar3, i7);
        B(vVar);
        this.t.m = B2();
        this.t.j = zVar.e();
        this.t.i = 0;
        a aVar4 = this.E;
        if (aVar4.d) {
            O2(aVar4);
            c cVar2 = this.t;
            cVar2.h = max;
            a2(vVar, cVar2, zVar, false);
            c cVar3 = this.t;
            i2 = cVar3.b;
            int i9 = cVar3.d;
            int i10 = cVar3.c;
            if (i10 > 0) {
                max2 += i10;
            }
            M2(this.E);
            c cVar4 = this.t;
            cVar4.h = max2;
            cVar4.d += cVar4.e;
            a2(vVar, cVar4, zVar, false);
            c cVar5 = this.t;
            i = cVar5.b;
            int i11 = cVar5.c;
            if (i11 > 0) {
                N2(i9, i2);
                c cVar6 = this.t;
                cVar6.h = i11;
                a2(vVar, cVar6, zVar, false);
                i2 = this.t.b;
            }
        } else {
            M2(aVar4);
            c cVar7 = this.t;
            cVar7.h = max2;
            a2(vVar, cVar7, zVar, false);
            c cVar8 = this.t;
            i = cVar8.b;
            int i12 = cVar8.d;
            int i13 = cVar8.c;
            if (i13 > 0) {
                max += i13;
            }
            O2(this.E);
            c cVar9 = this.t;
            cVar9.h = max;
            cVar9.d += cVar9.e;
            a2(vVar, cVar9, zVar, false);
            c cVar10 = this.t;
            i2 = cVar10.b;
            int i14 = cVar10.c;
            if (i14 > 0) {
                L2(i12, i);
                c cVar11 = this.t;
                cVar11.h = i14;
                a2(vVar, cVar11, zVar, false);
                i = this.t.b;
            }
        }
        if (O() > 0) {
            if (this.x ^ this.y) {
                int m22 = m2(i, vVar, zVar, true);
                i3 = i2 + m22;
                i4 = i + m22;
                m2 = n2(i3, vVar, zVar, false);
            } else {
                int n2 = n2(i2, vVar, zVar, true);
                i3 = i2 + n2;
                i4 = i + n2;
                m2 = m2(i4, vVar, zVar, false);
            }
            i2 = i3 + m2;
            i = i4 + m2;
        }
        v2(vVar, zVar, i2, i);
        if (zVar.e()) {
            this.E.e();
        } else {
            this.u.s();
        }
        this.v = this.y;
    }

    View c2(boolean z, boolean z2) {
        return this.x ? i2(0, O(), z, z2) : i2(O() - 1, -1, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF d(int i) {
        if (O() == 0) {
            return null;
        }
        int i2 = (i < l0(N(0))) != this.x ? -1 : 1;
        return this.s == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d1(RecyclerView.z zVar) {
        super.d1(zVar);
        this.D = null;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.E.e();
    }

    View d2(boolean z, boolean z2) {
        return this.x ? i2(O() - 1, -1, z, z2) : i2(0, O(), z, z2);
    }

    public int e2() {
        View i2 = i2(0, O(), false, true);
        if (i2 == null) {
            return -1;
        }
        return l0(i2);
    }

    public int g2() {
        View i2 = i2(O() - 1, -1, false, true);
        if (i2 == null) {
            return -1;
        }
        return l0(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.D = savedState;
            if (this.A != -1) {
                savedState.b();
            }
            y1();
        }
    }

    View h2(int i, int i2) {
        int i3;
        int i4;
        Z1();
        if (i2 <= i && i2 >= i) {
            return N(i);
        }
        if (this.u.g(N(i)) < this.u.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.s == 0 ? this.e.a(i, i2, i3, i4) : this.f.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable i1() {
        if (this.D != null) {
            return new SavedState(this.D);
        }
        SavedState savedState = new SavedState();
        if (O() > 0) {
            Z1();
            boolean z = this.v ^ this.x;
            savedState.mAnchorLayoutFromEnd = z;
            if (z) {
                View o2 = o2();
                savedState.mAnchorOffset = this.u.i() - this.u.d(o2);
                savedState.mAnchorPosition = l0(o2);
            } else {
                View p2 = p2();
                savedState.mAnchorPosition = l0(p2);
                savedState.mAnchorOffset = this.u.g(p2) - this.u.m();
            }
        } else {
            savedState.b();
        }
        return savedState;
    }

    View i2(int i, int i2, boolean z, boolean z2) {
        Z1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.s == 0 ? this.e.a(i, i2, i3, i4) : this.f.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l(String str) {
        if (this.D == null) {
            super.l(str);
        }
    }

    View l2(RecyclerView.v vVar, RecyclerView.z zVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        Z1();
        int O = O();
        if (z2) {
            i2 = O() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = O;
            i2 = 0;
            i3 = 1;
        }
        int b2 = zVar.b();
        int m = this.u.m();
        int i4 = this.u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View N = N(i2);
            int l0 = l0(N);
            int g = this.u.g(N);
            int d = this.u.d(N);
            if (l0 >= 0 && l0 < b2) {
                if (!((RecyclerView.p) N.getLayoutParams()).c()) {
                    boolean z3 = d <= m && g < m;
                    boolean z4 = g >= i4 && d > i4;
                    if (!z3 && !z4) {
                        return N;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = N;
                        }
                        view2 = N;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = N;
                        }
                        view2 = N;
                    }
                } else if (view3 == null) {
                    view3 = N;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p() {
        return this.s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return this.s == 1;
    }

    protected int q2(RecyclerView.z zVar) {
        if (zVar.d()) {
            return this.u.n();
        }
        return 0;
    }

    public int r2() {
        return this.s;
    }

    protected boolean s2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t(int i, int i2, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (O() == 0 || i == 0) {
            return;
        }
        Z1();
        K2(i > 0 ? 1 : -1, Math.abs(i), true, zVar);
        T1(zVar, this.t, cVar);
    }

    public boolean t2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void u(int i, RecyclerView.o.c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.D;
        if (savedState == null || !savedState.a()) {
            C2();
            z = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.D;
            z = savedState2.mAnchorLayoutFromEnd;
            i2 = savedState2.mAnchorPosition;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.G && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    void u2(RecyclerView.v vVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int f;
        View d = cVar.d(vVar);
        if (d == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f == -1)) {
                i(d);
            } else {
                j(d, 0);
            }
        } else {
            if (this.x == (cVar.f == -1)) {
                g(d);
            } else {
                h(d, 0);
            }
        }
        F0(d, 0, 0);
        bVar.a = this.u.e(d);
        if (this.s == 1) {
            if (s2()) {
                f = s0() - j0();
                i4 = f - this.u.f(d);
            } else {
                i4 = i0();
                f = this.u.f(d) + i4;
            }
            if (cVar.f == -1) {
                int i5 = cVar.b;
                i3 = i5;
                i2 = f;
                i = i5 - bVar.a;
            } else {
                int i6 = cVar.b;
                i = i6;
                i2 = f;
                i3 = bVar.a + i6;
            }
        } else {
            int k0 = k0();
            int f2 = this.u.f(d) + k0;
            if (cVar.f == -1) {
                int i7 = cVar.b;
                i2 = i7;
                i = k0;
                i3 = f2;
                i4 = i7 - bVar.a;
            } else {
                int i8 = cVar.b;
                i = k0;
                i2 = bVar.a + i8;
                i3 = f2;
                i4 = i8;
            }
        }
        E0(d, i4, i, i2, i3);
        if (pVar.c() || pVar.b()) {
            bVar.c = true;
        }
        bVar.d = d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return U1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return V1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w0() {
        return true;
    }

    void w2(RecyclerView.v vVar, RecyclerView.z zVar, a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return W1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.z zVar) {
        return U1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return V1(zVar);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        E2(i);
        F2(z);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d m0 = RecyclerView.o.m0(context, attributeSet, i, i2);
        E2(m0.a);
        F2(m0.c);
        G2(m0.d);
    }
}
