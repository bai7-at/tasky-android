package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class fi3 extends RecyclerView.t {
    private final Set a = new LinkedHashSet();
    private final Rect b = new Rect();

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, int i, int i2) {
        zq3.h(recyclerView, "recyclerView");
        e(recyclerView);
    }

    public final void e(RecyclerView recyclerView) {
        zq3.h(recyclerView, "recyclerView");
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        zq3.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        Iterator it2 = new an3(linearLayoutManager.e2(), linearLayoutManager.g2()).iterator();
        while (it2.hasNext()) {
            RecyclerView.d0 findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(((qm3) it2).c());
            if (findViewHolderForLayoutPosition != null) {
                zq3.e(findViewHolderForLayoutPosition);
                f(findViewHolderForLayoutPosition);
            }
        }
    }

    public abstract void f(RecyclerView.d0 d0Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g(View view) {
        zq3.h(view, "view");
        return view.getLocalVisibleRect(this.b) && this.b.height() > view.getMeasuredHeight() / 2 && this.b.width() > view.getMeasuredWidth() / 2;
    }

    public final void h() {
        this.a.clear();
    }
}
