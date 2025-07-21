package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.bestsellers.vo.BookCategory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class bl5 extends RecyclerView.Adapter {
    private List d;

    public bl5(List list) {
        this.d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void z(cl5 cl5Var, int i) {
        cl5Var.X((BookCategory) this.d.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public cl5 B(ViewGroup viewGroup, int i) {
        return new cl5(LayoutInflater.from(viewGroup.getContext()).inflate(zh6.row_books_other_lists, viewGroup, false));
    }

    public void M(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.d = list;
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int m() {
        return this.d.size();
    }
}
