package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class q extends RecyclerView.r {
    RecyclerView a;
    private Scroller b;
    private final RecyclerView.t c = new a();

    class a extends RecyclerView.t {
        boolean a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i == 0 && this.a) {
                this.a = false;
                q.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    }

    private void e() {
        this.a.removeOnScrollListener(this.c);
        this.a.setOnFlingListener(null);
    }

    private void h() {
        if (this.a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.a.addOnScrollListener(this.c);
        this.a.setOnFlingListener(this);
    }

    private boolean i(RecyclerView.o oVar, int i, int i2) {
        RecyclerView.y d;
        int g;
        if (!(oVar instanceof RecyclerView.y.b) || (d = d(oVar)) == null || (g = g(oVar, i, i2)) == -1) {
            return false;
        }
        d.p(g);
        oVar.P1(d);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i, int i2) {
        RecyclerView.o layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && i(layoutManager, i, i2);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            h();
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    protected abstract RecyclerView.y d(RecyclerView.o oVar);

    public abstract View f(RecyclerView.o oVar);

    public abstract int g(RecyclerView.o oVar, int i, int i2);

    void j() {
        RecyclerView.o layoutManager;
        View f;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f = f(layoutManager)) == null) {
            return;
        }
        int[] c = c(layoutManager, f);
        int i = c[0];
        if (i == 0 && c[1] == 0) {
            return;
        }
        this.a.smoothScrollBy(i, c[1]);
    }
}
