package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;
import com.nytimes.android.sectionfront.layoutmanager.SpannableGridLayoutManager;
import com.nytimes.android.sectionfront.layoutmanager.b;
import com.nytimes.android.utils.NetworkStatus;

/* loaded from: classes4.dex */
public abstract class dh7 extends gf7 implements b {
    private qf7 o;
    private final boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh7(Activity activity, NetworkStatus networkStatus, qf7 qf7Var, cb2 cb2Var, boolean z, LayoutInflater layoutInflater) {
        super(activity, networkStatus, null, cb2Var, layoutInflater);
        zq3.h(activity, "activity");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(qf7Var, "config");
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(layoutInflater, "inflater");
        this.o = qf7Var;
        this.p = z;
    }

    private final int f0(int i) {
        SectionAdapterItemType sectionAdapterItemType = SectionAdapterItemType.values()[i];
        int a = this.o.a(sectionAdapterItemType);
        if (a == 0 && this.p) {
            zm8.a(L(), "Unknown view type was ignored: " + sectionAdapterItemType);
        }
        return a;
    }

    @Override // com.nytimes.android.sectionfront.layoutmanager.b
    public void c(int i, SpannableGridLayoutManager.e eVar) {
        zq3.h(eVar, "param");
        eVar.a = f0(o(i));
    }

    public final ViewGroup.LayoutParams e0(int i) {
        return new SpannableGridLayoutManager.c(-1, -2, f0(i));
    }

    @Override // com.nytimes.android.sectionfront.layoutmanager.b
    public int g() {
        return this.o.a(SectionAdapterItemType.ARTICLE);
    }

    protected final void g0(qf7 qf7Var) {
        zq3.h(qf7Var, "<set-?>");
        this.o = qf7Var;
    }

    @Override // com.nytimes.android.sectionfront.layoutmanager.b
    public int getColumnCount() {
        return this.o.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int o(int i) {
        re7 P = P(i);
        zq3.e(P);
        return P.a.ordinal();
    }
}
