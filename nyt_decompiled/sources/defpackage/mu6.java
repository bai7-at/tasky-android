package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.abtests.GrowthUIRegibundleVariants;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.growthui.regibundle.RegibundleDialogFragment;
import com.nytimes.android.messaging.regibundle.RegibundleFragment;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public class mu6 extends RecyclerView.t {
    private final ET2Scope a;
    private final ku6 b;
    private final FragmentManager c;
    private final AbraManager d;
    private int e;

    public mu6(ET2Scope eT2Scope, ku6 ku6Var, FragmentManager fragmentManager, AbraManager abraManager) {
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(ku6Var, "regibundleOfferController");
        zq3.h(fragmentManager, "childFragmentManager");
        zq3.h(abraManager, "abraManager");
        this.a = eT2Scope;
        this.b = ku6Var;
        this.c = fragmentManager;
        this.d = abraManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, int i) {
        PageContext pageContext;
        zq3.h(recyclerView, "recyclerView");
        if (i == 0 && this.b.a(this.e)) {
            tx1 c = this.a.c();
            if (c == null || (pageContext = c.i()) == null) {
                pageContext = new PageContext(null, null, null, null, 0, 31, null);
            }
            AbraManager abraManager = this.d;
            GrowthUIRegibundleVariants.a aVar = GrowthUIRegibundleVariants.Companion;
            abraManager.exposeTest(aVar.a().getTestName(), t.f(du8.a("pageContext", pageContext)));
            if (aVar.b(this.d)) {
                RegibundleDialogFragment.Companion.a(this.c);
            } else {
                new RegibundleFragment().show(this.c, "SubscriptionMessagingFragment");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, int i, int i2) {
        zq3.h(recyclerView, "recyclerView");
        this.e += i2;
    }
}
