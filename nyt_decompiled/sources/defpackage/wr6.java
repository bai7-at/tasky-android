package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagedList;
import androidx.paging.PagedListAdapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.sectionfront.layoutmanager.SpannableGridLayoutManager;
import com.nytimes.android.sectionfront.layoutmanager.b;

/* loaded from: classes4.dex */
public final class wr6 extends PagedListAdapter implements b {
    private final hf5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr6(hf5 hf5Var) {
        super(a28.a);
        zq3.h(hf5Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f = hf5Var;
    }

    public final int P(z18 z18Var) {
        zq3.h(z18Var, "asset");
        PagedList K = K();
        if (K != null) {
            return K.indexOf(z18Var);
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void z(ct6 ct6Var, int i) {
        zq3.h(ct6Var, "holder");
        z18 z18Var = (z18) L(i);
        if (z18Var != null) {
            ct6Var.b0(z18Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public ct6 B(ViewGroup viewGroup, int i) {
        zq3.h(viewGroup, "parent");
        View l = ViewExtensions.l(viewGroup, wh6.row_recently_viewed);
        zq3.g(l, "inflate(...)");
        return new ct6(l, this.f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void G(ct6 ct6Var) {
        zq3.h(ct6Var, "holder");
        super.G(ct6Var);
        ct6Var.j0();
    }

    @Override // com.nytimes.android.sectionfront.layoutmanager.b
    public void c(int i, SpannableGridLayoutManager.e eVar) {
        zq3.h(eVar, "param");
        eVar.a = 1;
    }

    @Override // com.nytimes.android.sectionfront.layoutmanager.b
    public int g() {
        return 1;
    }

    @Override // com.nytimes.android.sectionfront.layoutmanager.b
    public int getColumnCount() {
        return 1;
    }
}
