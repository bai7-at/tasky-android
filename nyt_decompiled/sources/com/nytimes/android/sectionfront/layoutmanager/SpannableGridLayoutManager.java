package com.nytimes.android.sectionfront.layoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.nytimes.android.sectionfront.adapter.viewholder.m;
import com.nytimes.android.sectionfront.layoutmanager.a;
import com.nytimes.android.widget.SectionFrontRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class SpannableGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    private static final int x = View.MeasureSpec.makeMeasureSpec(0, 0);
    private final SectionFrontRecyclerView s;
    private final RecyclerView.y v;
    private final b u = new b();
    private SaveState w = null;
    private final com.nytimes.android.sectionfront.layoutmanager.a t = new com.nytimes.android.sectionfront.layoutmanager.a();

    class a extends j {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.j
        protected int B() {
            return -1;
        }
    }

    private static class b {
        int a;
        int b;

        void a() {
            this.a = -1;
            this.b = 0;
        }

        public String toString() {
            return "AnchorInfo{position=" + this.a + ", offset=" + this.b + '}';
        }

        private b() {
        }
    }

    public static class c extends RecyclerView.p {
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;

        public c(int i, int i2) {
            super(i, i2);
        }

        public static c e(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof c) {
                return (c) layoutParams;
            }
            return null;
        }

        public c(int i, int i2, int i3) {
            super(i, i2);
            this.e = i3;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    static class d {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f = 0;
        int g;
        int h;
        int i;
        int j;
        int k;

        d() {
        }

        private void b(SpannableGridLayoutManager spannableGridLayoutManager) {
            this.i = this.d == 1 ? spannableGridLayoutManager.k0() : spannableGridLayoutManager.b0() - spannableGridLayoutManager.h0();
            this.j = this.d == 1 ? spannableGridLayoutManager.b0() - spannableGridLayoutManager.h0() : spannableGridLayoutManager.k0();
            this.g = spannableGridLayoutManager.i0();
            this.h = spannableGridLayoutManager.s0() - spannableGridLayoutManager.j0();
            this.k = this.i;
            this.e = this.d == 1 ? spannableGridLayoutManager.b0() - spannableGridLayoutManager.h0() : spannableGridLayoutManager.k0();
        }

        boolean a(RecyclerView.z zVar) {
            int i = this.b;
            return i >= 0 && i < zVar.b();
        }

        void c(View view, SpannableGridLayoutManager spannableGridLayoutManager, Rect rect, a.C0404a c0404a) {
            int i;
            int i2;
            c e = c.e(view);
            int c2 = this.g + spannableGridLayoutManager.c2(c0404a.f) + rect.left;
            int X = spannableGridLayoutManager.X(view) + c2 + rect.left;
            if (this.d == 1) {
                int i3 = this.k;
                i2 = rect.top + i3;
                i = i3 + spannableGridLayoutManager.W(view) + rect.top;
            } else {
                int W = this.k - spannableGridLayoutManager.W(view);
                int i4 = rect.bottom;
                int i5 = W - i4;
                i = this.k - i4;
                i2 = i5;
            }
            int i6 = ((ViewGroup.MarginLayoutParams) e).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) e).rightMargin;
            int i8 = ((ViewGroup.MarginLayoutParams) e).topMargin;
            int i9 = ((ViewGroup.MarginLayoutParams) e).bottomMargin;
            spannableGridLayoutManager.D0(view, (c2 + i6) - i7, (i2 + i8) - i9, (X + i6) - i7, (i8 + i) - i9);
            if (c0404a.f(1)) {
                this.k = this.d == 1 ? i + rect.bottom : i2 - rect.top;
            }
        }

        View d(RecyclerView.v vVar) {
            View o = vVar.o(this.b);
            this.b += this.c;
            return o;
        }

        void e(SpannableGridLayoutManager spannableGridLayoutManager, b bVar, com.nytimes.android.sectionfront.layoutmanager.a aVar) {
            b(spannableGridLayoutManager);
            int i = bVar.a;
            this.b = i;
            a.C0404a c = aVar.c(i);
            if (c != null && !c.e(this.c)) {
                this.b = c.b.d(this.c).a;
            }
            int i2 = this.i + bVar.b;
            this.i = i2;
            this.k = i2;
        }

        void f(SpannableGridLayoutManager spannableGridLayoutManager, View view, int i) {
            b(spannableGridLayoutManager);
            if (view == null) {
                return;
            }
            this.b = spannableGridLayoutManager.l0(view) + this.c;
            c e = c.e(view);
            this.a = i;
            if (this.d == 1) {
                this.i = spannableGridLayoutManager.T(view) + ((ViewGroup.MarginLayoutParams) e).bottomMargin;
            } else {
                this.i = spannableGridLayoutManager.Z(view) - ((ViewGroup.MarginLayoutParams) e).topMargin;
            }
            int i2 = this.e;
            int i3 = this.a;
            int i4 = this.d;
            this.e = i2 + (i3 * i4);
            this.j += i4 * i;
            this.k = this.i;
        }

        int g() {
            return this.d == 1 ? Math.min(this.e, this.k) : Math.max(this.e, this.k);
        }

        int h() {
            int i;
            int i2;
            if (this.d == 1) {
                i = this.j;
                i2 = this.k;
            } else {
                i = this.k;
                i2 = this.j;
            }
            return i - i2;
        }
    }

    public static class e {
        public int a;
        private final int b;

        e(int i) {
            this.b = i;
            this.a = i;
        }

        void a() {
            this.a = this.b;
        }
    }

    public SpannableGridLayoutManager(SectionFrontRecyclerView sectionFrontRecyclerView) {
        this.s = sectionFrontRecyclerView;
        this.v = new a(sectionFrontRecyclerView.getContext());
    }

    private void U1(a.b bVar) {
        if (bVar.c().size() <= 1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = bVar.c().iterator();
        while (it2.hasNext()) {
            Object childViewHolder = this.s.getChildViewHolder(((a.C0404a) it2.next()).d);
            if (childViewHolder instanceof m) {
                m mVar = (m) childViewHolder;
                if (mVar.e()) {
                    arrayList.add(mVar);
                }
            }
        }
        if (arrayList.size() <= 1) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        int i = RecyclerView.UNDEFINED_DURATION;
        while (it3.hasNext()) {
            int b2 = ((m) it3.next()).b();
            i = Math.max(i, b2);
            arrayList2.add(Integer.valueOf(b2));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            m mVar2 = (m) arrayList.get(i2);
            int intValue = i - ((Integer) arrayList2.get(i2)).intValue();
            if (intValue > 0) {
                mVar2.c(intValue);
            }
        }
    }

    private void V1(a.C0404a c0404a, View view) {
        RecyclerView.d0 childViewHolder = this.s.getChildViewHolder(view);
        if (childViewHolder instanceof com.nytimes.android.sectionfront.adapter.viewholder.b) {
            com.nytimes.android.sectionfront.adapter.viewholder.b bVar = (com.nytimes.android.sectionfront.adapter.viewholder.b) childViewHolder;
            if (c0404a.h) {
                bVar.j0();
            } else {
                bVar.s0();
            }
        }
    }

    private int W1(d dVar, RecyclerView.v vVar, RecyclerView.z zVar) {
        while (dVar.a(zVar) && dVar.h() > 0) {
            a.C0404a c2 = this.t.c(dVar.b);
            View d2 = dVar.d(vVar);
            c e2 = c.e(d2);
            c2.d = d2;
            c2.g(e2);
            f2(d2);
            V1(c2, d2);
            if (dVar.d == 1) {
                i(d2);
            } else {
                j(d2, 0);
            }
            Rect itemDecorInsetsForChild = this.s.getItemDecorInsetsForChild(d2, zVar);
            c2.e = new Rect(itemDecorInsetsForChild);
            n2(c2, d2, e2, itemDecorInsetsForChild);
            if (c2.f(dVar.d)) {
                e2(dVar, c2.b);
                h2(vVar, dVar);
            }
        }
        h2(vVar, dVar);
        return Math.max(0, dVar.a - dVar.h());
    }

    private View a2() {
        if (O() == 0) {
            return null;
        }
        return N(0);
    }

    private View b2() {
        int O = O();
        if (O == 0) {
            return null;
        }
        return N(O - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c2(float f) {
        return (int) ((f * ((s0() - i0()) - j0())) / this.t.a);
    }

    private int d2(a.C0404a c0404a, c cVar, Rect rect) {
        return View.MeasureSpec.makeMeasureSpec((((c2(c0404a.g) - ((ViewGroup.MarginLayoutParams) cVar).leftMargin) - rect.left) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin) - rect.right, 1073741824);
    }

    private void e2(d dVar, a.b bVar) {
        U1(bVar);
        int e2 = bVar.e();
        int i = 0;
        int i2 = 0;
        for (a.C0404a c0404a : bVar.c()) {
            c e3 = c.e(c0404a.d);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(e2, 1073741824);
            int d2 = d2(c0404a, e3, c0404a.e);
            i = Math.max(i, c0404a.e.top);
            i2 = Math.max(i2, c0404a.e.bottom);
            c0404a.d.measure(d2, makeMeasureSpec);
        }
        for (a.C0404a c0404a2 : bVar.c()) {
            Rect rect = c0404a2.e;
            rect.top = i;
            rect.bottom = i2;
            dVar.c(c0404a2.d, this, rect, c0404a2);
            c0404a2.e = null;
            c0404a2.d = null;
        }
    }

    private void f2(View view) {
        Object childViewHolder = this.s.getChildViewHolder(view);
        if (childViewHolder instanceof m) {
            ((m) childViewHolder).d();
        }
    }

    private void g2(RecyclerView.z zVar) {
        if (this.t.f()) {
            try {
                com.nytimes.android.sectionfront.layoutmanager.b bVar = (com.nytimes.android.sectionfront.layoutmanager.b) this.s.getAdapter();
                int g = bVar.g();
                this.t.g(bVar.getColumnCount(), g);
                e eVar = new e(g);
                int b2 = zVar.b();
                for (int i = 0; i < b2; i++) {
                    bVar.c(i, eVar);
                    this.t.a(i, eVar.a);
                    eVar.a();
                }
                this.t.b();
            } catch (ClassCastException e2) {
                throw new RuntimeException("Adapter for " + SpannableGridLayoutManager.class + " should be of type " + com.nytimes.android.sectionfront.layoutmanager.b.class, e2);
            }
        }
    }

    private void h2(RecyclerView.v vVar, d dVar) {
        int b0 = b0() - k0();
        int g = dVar.g();
        if (dVar.d == -1) {
            i2(vVar, g + b0);
        } else {
            j2(vVar, g - b0);
        }
    }

    private void i2(RecyclerView.v vVar, int i) {
        for (int O = O() - 1; O >= 0; O--) {
            View N = N(O);
            if (Z(N) - ((ViewGroup.MarginLayoutParams) c.e(N)).topMargin <= i) {
                return;
            }
            r1(N, vVar);
        }
    }

    private void j2(RecyclerView.v vVar, int i) {
        while (O() > 0) {
            View N = N(0);
            if (T(N) + ((ViewGroup.MarginLayoutParams) c.e(N)).bottomMargin >= i) {
                return;
            } else {
                r1(N, vVar);
            }
        }
    }

    private void k2(RecyclerView.z zVar, b bVar) {
        if (m2(bVar)) {
            return;
        }
        l2(zVar, bVar);
    }

    private boolean l2(RecyclerView.z zVar, b bVar) {
        View a2 = a2();
        if (a2 == null) {
            bVar.a = 0;
            bVar.b = 0;
            return true;
        }
        Rect itemDecorInsetsForChild = this.s.getItemDecorInsetsForChild(a2, zVar);
        bVar.a = l0(a2);
        bVar.b = Z(a2) - itemDecorInsetsForChild.top;
        return true;
    }

    private boolean m2(b bVar) {
        SaveState saveState = this.w;
        if (saveState == null) {
            return false;
        }
        bVar.a = saveState.anchorPosition;
        bVar.b = saveState.anchorOffset;
        this.w = null;
        return true;
    }

    private void n2(a.C0404a c0404a, View view, c cVar, Rect rect) {
        view.measure(d2(c0404a, cVar, rect), x);
        c0404a.c = view.getMeasuredHeight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(int i) {
        SaveState saveState = new SaveState(this);
        saveState.anchorPosition = i;
        saveState.anchorOffset = 0;
        this.w = saveState;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int D1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        View a2;
        int O = O();
        if (a() == 0 || O == 0) {
            return 0;
        }
        int abs = Math.abs(i);
        d dVar = new d();
        if (i > 0) {
            dVar.d = 1;
            dVar.c = 1;
            a2 = b2();
        } else {
            dVar.d = -1;
            dVar.c = -1;
            a2 = a2();
        }
        dVar.f(this, a2, abs);
        int W1 = W1(dVar, vVar, zVar);
        if (abs >= W1) {
            i = i < 0 ? -W1 : W1;
        }
        I0(-i);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        this.v.p(i);
        P1(this.v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView recyclerView) {
        this.t.e();
        y1();
    }

    public int X1() {
        View a2 = a2();
        if (a2 == null) {
            return 0;
        }
        return l0(a2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    /* renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public c I() {
        c cVar = new c(-1, -2);
        cVar.e = this.t.b;
        return cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    /* renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public c K(ViewGroup.LayoutParams layoutParams) {
        c cVar = layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
        cVar.e = this.t.b;
        return cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.v vVar, RecyclerView.z zVar) {
        d dVar = new d();
        g2(zVar);
        this.u.a();
        k2(zVar, this.u);
        B(vVar);
        dVar.a = 0;
        dVar.d = 1;
        dVar.c = 1;
        dVar.e(this, this.u, this.t);
        W1(dVar, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF d(int i) {
        if (O() == 0) {
            return null;
        }
        return new PointF(0.0f, i < l0(N(0)) ? -1 : 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof SaveState) {
            this.w = (SaveState) parcelable;
            y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable i1() {
        SaveState saveState = this.w;
        return saveState != null ? saveState : new SaveState(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean r(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    private static class SaveState implements Parcelable {
        public static final Parcelable.Creator<SaveState> CREATOR = new a();
        int anchorOffset;
        int anchorPosition;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SaveState createFromParcel(Parcel parcel) {
                return new SaveState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SaveState[] newArray(int i) {
                return new SaveState[i];
            }
        }

        public SaveState(SpannableGridLayoutManager spannableGridLayoutManager) {
            this.anchorOffset = spannableGridLayoutManager.u.b;
            this.anchorPosition = spannableGridLayoutManager.u.a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SaveState{anchorPosition=" + this.anchorPosition + ", anchorOffset=" + this.anchorOffset + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.anchorPosition);
            parcel.writeInt(this.anchorOffset);
        }

        SaveState(Parcel parcel) {
            this.anchorPosition = parcel.readInt();
            this.anchorOffset = parcel.readInt();
        }
    }
}
