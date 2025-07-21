package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class pj3 extends RecyclerView.t {
    final a a;
    private int b = -1;

    public interface a {
        void R();

        boolean b();
    }

    public pj3(a aVar) {
        this.a = aVar;
    }

    private boolean c(int i, int i2, int i3) {
        return i == 0 && !this.a.b() && i2 == i3 - 1 && this.b != i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, int i) {
        super.a(recyclerView, i);
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int g2 = linearLayoutManager.g2();
            if (c(i, g2, linearLayoutManager.a())) {
                this.a.R();
            }
            this.b = g2;
        }
    }
}
