package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.ads.sectionfront.SectionFrontAdsViewModel;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.sectionfront.adapter.viewholder.e;
import com.nytimes.android.sectionfront.adapter.viewholder.h;
import com.nytimes.android.utils.NetworkStatus;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class gf7 extends RecyclerView.Adapter implements hf7 {
    public static final a Companion = new a(null);
    public static final int n = 8;
    private Activity d;
    private NetworkStatus e;
    protected s57 f;
    private cb2 g;
    private final LayoutInflater h;
    private if5 i;
    private SectionFrontAdsViewModel j;
    private List k;
    private final Set l;
    private final List m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    protected gf7(Activity activity, NetworkStatus networkStatus, s57 s57Var, cb2 cb2Var, LayoutInflater layoutInflater) {
        zq3.h(activity, "activity");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(layoutInflater, "inflater");
        this.d = activity;
        this.e = networkStatus;
        this.f = s57Var;
        this.g = cb2Var;
        this.h = layoutInflater;
        this.k = new ArrayList();
        this.l = new HashSet();
        this.m = new ArrayList();
    }

    private final void R(List list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof nk2) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        SectionFrontAdsViewModel sectionFrontAdsViewModel = this.j;
        if (sectionFrontAdsViewModel != null) {
            sectionFrontAdsViewModel.k(size);
        }
    }

    public void K() {
        Iterator it2 = this.l.iterator();
        while (it2.hasNext()) {
            ((com.nytimes.android.sectionfront.adapter.viewholder.a) it2.next()).c0();
        }
        this.l.clear();
        this.k.clear();
    }

    protected final Activity L() {
        return this.d;
    }

    public final SectionFrontAdsViewModel M() {
        return this.j;
    }

    protected final Configuration N() {
        return new Configuration(this.d.getResources().getConfiguration());
    }

    protected final LayoutInflater O() {
        return this.h;
    }

    public final re7 P(int i) {
        if (i >= 0 && i < this.k.size()) {
            return (re7) this.k.get(i);
        }
        NYTLogger.A("can't find item at index " + i + " from a list of size " + this.k.size(), new Object[0]);
        return null;
    }

    protected final NetworkStatus Q() {
        return this.e;
    }

    public final void S(re7 re7Var, Object obj) {
        String str;
        zq3.h(re7Var, "item");
        if (this.k.contains(re7Var)) {
            t(this.k.indexOf(re7Var), obj);
            return;
        }
        if (obj == null || (str = obj.toString()) == null) {
            str = "";
        }
        NYTLogger.d("Item no longer in list; discarding payload " + str, new Object[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public void z(com.nytimes.android.sectionfront.adapter.viewholder.a aVar, int i) {
        zq3.h(aVar, "viewHolder");
        re7 P = P(i);
        if (P != null) {
            P.c = i;
        }
        aVar.X(P, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void A(com.nytimes.android.sectionfront.adapter.viewholder.a aVar, int i, List list) {
        zq3.h(aVar, "holder");
        zq3.h(list, "payloads");
        if (list.contains("commentCountChanged") && (aVar instanceof qn2)) {
            ((qn2) aVar).a((mn2) P(i));
        }
        if (list.isEmpty()) {
            z(aVar, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void E(com.nytimes.android.sectionfront.adapter.viewholder.a aVar) {
        zq3.h(aVar, "holder");
        super.E(aVar);
        aVar.b0(this.i, null);
        this.l.add(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void F(com.nytimes.android.sectionfront.adapter.viewholder.a aVar) {
        zq3.h(aVar, "holder");
        super.F(aVar);
        s57 s57Var = this.f;
        if (s57Var != null) {
            s57Var.c();
        }
        aVar.a0();
        aVar.c0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void G(com.nytimes.android.sectionfront.adapter.viewholder.a aVar) {
        zq3.h(aVar, "holder");
        super.G(aVar);
        aVar.d0();
    }

    protected final void Y(Configuration configuration) {
        if (configuration != null) {
            this.d.getResources().updateConfiguration(configuration, null);
        }
    }

    public final void Z(SectionFrontAdsViewModel sectionFrontAdsViewModel) {
        this.j = sectionFrontAdsViewModel;
    }

    @Override // defpackage.hf7
    public gf7 a() {
        return this;
    }

    public final void a0(List list) {
        zq3.h(list, "items");
        List a1 = i.a1(list);
        this.k = a1;
        R(a1);
        r();
    }

    public final void b0(if5 if5Var) {
        this.i = if5Var;
    }

    public final void c0(jf5 jf5Var) {
    }

    public final void d0() {
        for (com.nytimes.android.sectionfront.adapter.viewholder.a aVar : this.l) {
            if ((aVar instanceof h) || (aVar instanceof e)) {
                aVar.a0();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int m() {
        return this.k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long n(int i) {
        re7 P = P(i);
        zq3.e(P);
        return ((P.b % 92233720368547758L) * 100) + P.a.ordinal();
    }
}
