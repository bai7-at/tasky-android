package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class l {
    protected final RecyclerView.o a;
    private int b;
    final Rect c;

    class a extends l {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.l
        public int d(View view) {
            return this.a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.X(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.W(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int g(View view) {
            return this.a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int h() {
            return this.a.s0();
        }

        @Override // androidx.recyclerview.widget.l
        public int i() {
            return this.a.s0() - this.a.j0();
        }

        @Override // androidx.recyclerview.widget.l
        public int j() {
            return this.a.j0();
        }

        @Override // androidx.recyclerview.widget.l
        public int k() {
            return this.a.t0();
        }

        @Override // androidx.recyclerview.widget.l
        public int l() {
            return this.a.c0();
        }

        @Override // androidx.recyclerview.widget.l
        public int m() {
            return this.a.i0();
        }

        @Override // androidx.recyclerview.widget.l
        public int n() {
            return (this.a.s0() - this.a.i0()) - this.a.j0();
        }

        @Override // androidx.recyclerview.widget.l
        public int p(View view) {
            this.a.r0(view, true, this.c);
            return this.c.right;
        }

        @Override // androidx.recyclerview.widget.l
        public int q(View view) {
            this.a.r0(view, true, this.c);
            return this.c.left;
        }

        @Override // androidx.recyclerview.widget.l
        public void r(int i) {
            this.a.H0(i);
        }
    }

    class b extends l {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.l
        public int d(View view) {
            return this.a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.W(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.X(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int g(View view) {
            return this.a.Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int h() {
            return this.a.b0();
        }

        @Override // androidx.recyclerview.widget.l
        public int i() {
            return this.a.b0() - this.a.h0();
        }

        @Override // androidx.recyclerview.widget.l
        public int j() {
            return this.a.h0();
        }

        @Override // androidx.recyclerview.widget.l
        public int k() {
            return this.a.c0();
        }

        @Override // androidx.recyclerview.widget.l
        public int l() {
            return this.a.t0();
        }

        @Override // androidx.recyclerview.widget.l
        public int m() {
            return this.a.k0();
        }

        @Override // androidx.recyclerview.widget.l
        public int n() {
            return (this.a.b0() - this.a.k0()) - this.a.h0();
        }

        @Override // androidx.recyclerview.widget.l
        public int p(View view) {
            this.a.r0(view, true, this.c);
            return this.c.bottom;
        }

        @Override // androidx.recyclerview.widget.l
        public int q(View view) {
            this.a.r0(view, true, this.c);
            return this.c.top;
        }

        @Override // androidx.recyclerview.widget.l
        public void r(int i) {
            this.a.I0(i);
        }
    }

    /* synthetic */ l(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static l a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static l b(RecyclerView.o oVar, int i) {
        if (i == 0) {
            return a(oVar);
        }
        if (i == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static l c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return n() - this.b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.b = n();
    }

    private l(RecyclerView.o oVar) {
        this.b = RecyclerView.UNDEFINED_DURATION;
        this.c = new Rect();
        this.a = oVar;
    }
}
