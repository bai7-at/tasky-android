package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class m extends q {
    private l d;
    private l e;

    class a extends j {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.RecyclerView.y
        protected void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            m mVar = m.this;
            int[] c = mVar.c(mVar.a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int w = w(Math.max(Math.abs(i), Math.abs(i2)));
            if (w > 0) {
                aVar.d(i, i2, w, this.j);
            }
        }

        @Override // androidx.recyclerview.widget.j
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.j
        protected int x(int i) {
            return Math.min(100, super.x(i));
        }
    }

    private int k(View view, l lVar) {
        return (lVar.g(view) + (lVar.e(view) / 2)) - (lVar.m() + (lVar.n() / 2));
    }

    private View l(RecyclerView.o oVar, l lVar) {
        int O = oVar.O();
        View view = null;
        if (O == 0) {
            return null;
        }
        int m = lVar.m() + (lVar.n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < O; i2++) {
            View N = oVar.N(i2);
            int abs = Math.abs((lVar.g(N) + (lVar.e(N) / 2)) - m);
            if (abs < i) {
                view = N;
                i = abs;
            }
        }
        return view;
    }

    private l m(RecyclerView.o oVar) {
        l lVar = this.e;
        if (lVar == null || lVar.a != oVar) {
            this.e = l.a(oVar);
        }
        return this.e;
    }

    private l n(RecyclerView.o oVar) {
        if (oVar.q()) {
            return o(oVar);
        }
        if (oVar.p()) {
            return m(oVar);
        }
        return null;
    }

    private l o(RecyclerView.o oVar) {
        l lVar = this.d;
        if (lVar == null || lVar.a != oVar) {
            this.d = l.c(oVar);
        }
        return this.d;
    }

    private boolean p(RecyclerView.o oVar, int i, int i2) {
        return oVar.p() ? i > 0 : i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean q(RecyclerView.o oVar) {
        PointF d;
        int a2 = oVar.a();
        if (!(oVar instanceof RecyclerView.y.b) || (d = ((RecyclerView.y.b) oVar).d(a2 - 1)) == null) {
            return false;
        }
        return d.x < 0.0f || d.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.q
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.p()) {
            iArr[0] = k(view, m(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.q()) {
            iArr[1] = k(view, o(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.q
    protected RecyclerView.y d(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.y.b) {
            return new a(this.a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.q
    public View f(RecyclerView.o oVar) {
        if (oVar.q()) {
            return l(oVar, o(oVar));
        }
        if (oVar.p()) {
            return l(oVar, m(oVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.q
    public int g(RecyclerView.o oVar, int i, int i2) {
        l n;
        int a2 = oVar.a();
        if (a2 == 0 || (n = n(oVar)) == null) {
            return -1;
        }
        int O = oVar.O();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < O; i5++) {
            View N = oVar.N(i5);
            if (N != null) {
                int k = k(N, n);
                if (k <= 0 && k > i4) {
                    view2 = N;
                    i4 = k;
                }
                if (k >= 0 && k < i3) {
                    view = N;
                    i3 = k;
                }
            }
        }
        boolean p = p(oVar, i, i2);
        if (p && view != null) {
            return oVar.l0(view);
        }
        if (!p && view2 != null) {
            return oVar.l0(view2);
        }
        if (p) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int l0 = oVar.l0(view) + (q(oVar) == p ? -1 : 1);
        if (l0 < 0 || l0 >= a2) {
            return -1;
        }
        return l0;
    }
}
