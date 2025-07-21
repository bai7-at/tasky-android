package com.nytimes.android.sectionfront;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.f;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.google.common.base.Optional;
import com.nytimes.android.SectionActivity;
import com.nytimes.android.ads.sectionfront.SectionFrontAdsViewModel;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.PromoAsset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.navigation.NavigationSource;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.SectionFrontFragment;
import com.nytimes.android.sectionfront.layoutmanager.SpannableGridLayoutManager;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import com.nytimes.android.video.VideoAutoPlayScrollListener;
import com.nytimes.android.widget.SectionFrontRecyclerView;
import defpackage.a35;
import defpackage.c97;
import defpackage.cb2;
import defpackage.dc7;
import defpackage.dx4;
import defpackage.eh5;
import defpackage.gf7;
import defpackage.hb5;
import defpackage.hf7;
import defpackage.hi6;
import defpackage.if5;
import defpackage.ip6;
import defpackage.k57;
import defpackage.l33;
import defpackage.lu6;
import defpackage.mn2;
import defpackage.mu6;
import defpackage.oz4;
import defpackage.p76;
import defpackage.pg6;
import defpackage.qf7;
import defpackage.r57;
import defpackage.re7;
import defpackage.s57;
import defpackage.tr3;
import defpackage.uc7;
import defpackage.vb2;
import defpackage.vg7;
import defpackage.wg7;
import defpackage.x3;
import defpackage.z4;
import defpackage.zh7;
import defpackage.zm8;
import io.reactivex.disposables.CompositeDisposable;
import java.util.List;

/* loaded from: classes4.dex */
public class SectionFrontFragment extends b implements if5, zh7, dc7 {
    ET2Scope et2Scope;
    cb2 featureFlagUtil;
    vb2 feedPerformanceTracker;
    protected SectionFrontRecyclerView h;
    protected SectionFront i;
    protected gf7 j;
    hb5 mediaControl;
    z4 mediaManager;
    p76 multiColumnSectionFrontAdapterProvider;
    private SectionFrontAdsViewModel n;
    tr3 navigator;
    NetworkStatus networkStatus;
    p76 oneColumnSectionFrontAdapterProvider;
    p76 photoVidAdapterProvider;
    vg7 presenter;
    SectionFrontPageEventSender r;
    RecentlyViewedManager recentlyViewedManager;
    lu6 regibundleOfferEventSender;
    mu6 regibundleScrollListener;
    r57 sfRefresher;
    SnackbarUtil snackbarUtil;
    private wg7 t;
    private View u;
    VideoAutoPlayScrollListener videoAutoPlayScrollListener;
    private qf7 w;
    protected String f = DatasetUtils.UNKNOWN_IDENTITY_ID;
    protected String g = DatasetUtils.UNKNOWN_IDENTITY_ID;
    protected int k = 0;
    protected final s57 l = new s57();
    CompositeDisposable m = new CompositeDisposable();
    private final String s = "Browse Sections Tab";

    private void f1(qf7 qf7Var) {
        if (qf7Var.a != 1) {
            this.mediaManager.j(new oz4() { // from class: mf7
                @Override // defpackage.oz4
                public final void call() {
                    SectionFrontFragment.this.n1();
                }
            });
        }
        l1(this.h, qf7Var);
        gf7 a = ((hf7) this.h.getAdapter()).a();
        this.j = a;
        if (a != null && j1() != null) {
            this.j.a0(j1().s0());
        }
        u1();
        y1(this.j);
        y();
    }

    private dx4 g1(qf7 qf7Var, boolean z) {
        dx4 dx4Var = (dx4) this.multiColumnSectionFrontAdapterProvider.get();
        dx4Var.j0(qf7Var, this.n, this.l, z);
        return dx4Var;
    }

    private eh5 h1() {
        eh5 eh5Var = (eh5) this.oneColumnSectionFrontAdapterProvider.get();
        eh5Var.h0(this.n, this.l);
        return eh5Var;
    }

    private void i1() {
        this.i = null;
        this.h.removeAllViews();
        this.h.setAdapter(null);
        this.h = null;
        this.u = null;
        this.t = null;
        this.j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void k1(RecyclerView.d0 d0Var, k57 k57Var, Asset asset) {
        if (((d0Var instanceof ip6) && this.recentlyViewedManager.u(asset.getSafeUri())) || (d0Var instanceof com.nytimes.android.sectionfront.adapter.viewholder.e)) {
            ((ip6) d0Var).f(k57Var, this.i);
            this.j.t(d0Var.q(), "fontSizeChanged");
        }
        NavigationSource navigationSource = NavigationSource.SECTION_FRONT;
        if (c97.c(this.i.getName())) {
            navigationSource = NavigationSource.SAVED_SECTION_FRONT;
        }
        this.navigator.b(a35.a(asset, navigationSource), requireActivity(), this);
    }

    private boolean m1(Asset asset) {
        if (asset instanceof PromoAsset) {
            return ((PromoAsset) asset).isEmbedded();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n1() {
        this.mediaControl.C();
    }

    private boolean o1(re7 re7Var, k57 k57Var) {
        return re7Var.i() || !re7Var.j() || k57Var == null || m1(re7Var.d());
    }

    private void q1() {
        if (j1() != null) {
            qf7 e0 = j1().e0();
            this.w = e0;
            p1(e0);
        }
    }

    private void r1(qf7 qf7Var) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.h.saveHierarchyState(sparseArray);
        S();
        f1(qf7Var);
        this.h.restoreHierarchyState(sparseArray);
    }

    @Override // defpackage.zh7
    public void B(boolean z, Optional optional) {
        if (optional.d()) {
            this.w = (qf7) optional.c();
        } else {
            q1();
        }
        if (j1() != null) {
            j1().C0(this.w);
        }
        if (z) {
            f1(this.w);
        } else {
            r1(this.w);
        }
    }

    @Override // defpackage.zh7
    public boolean G0() {
        return getContext() != null;
    }

    @Override // defpackage.zh7
    public void J0() {
        this.snackbarUtil.n();
    }

    @Override // defpackage.zh7
    public boolean K() {
        gf7 gf7Var = this.j;
        return gf7Var == null || gf7Var.m() == 0;
    }

    public void L0(List list) {
        if (this.j != null) {
            w1();
            this.j.a0(list);
            u1();
        }
        this.feedPerformanceTracker.l("Browse Sections Tab");
    }

    public void N(RecyclerView.d0 d0Var) {
        re7 P;
        int q = d0Var.q();
        gf7 gf7Var = this.j;
        if (gf7Var == null || (P = gf7Var.P(q)) == null) {
            return;
        }
        k57 e = P.e();
        if (o1(P, e)) {
            return;
        }
        k1(d0Var, e, e != null ? e.a() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zh7
    public void Q0(re7 re7Var, int i) {
        if (this.j != null) {
            ((mn2) re7Var).a(i);
            this.j.S(re7Var, "commentCountChanged");
        }
    }

    @Override // defpackage.zh7
    public void S() {
        gf7 gf7Var = this.j;
        if (gf7Var != null) {
            gf7Var.K();
            this.j.b0(null);
            this.j.c0(null);
        }
    }

    @Override // defpackage.zh7
    public boolean Y() {
        return getActivity() instanceof SectionActivity;
    }

    @Override // defpackage.ff7
    public void b1() {
        gf7 gf7Var = this.j;
        if (gf7Var != null) {
            gf7Var.r();
        }
    }

    @Override // com.nytimes.android.widget.CustomSwipeRefreshLayout.SwipeDelegate
    public boolean canScrollUp() {
        return j1() != null && j1().d0(this.h);
    }

    public void e() {
        wg7 wg7Var = this.t;
        if (wg7Var != null) {
            wg7Var.e();
            return;
        }
        View view = this.u;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    protected void e1(SectionFrontRecyclerView sectionFrontRecyclerView, qf7 qf7Var) {
        f activity = getActivity();
        if (!qf7Var.c() || DeviceUtils.G(activity)) {
            sectionFrontRecyclerView.addItemDecoration(new l33(activity, qf7Var.a));
        }
    }

    @Override // defpackage.zh7
    public void g() {
        wg7 wg7Var = this.t;
        if (wg7Var != null) {
            wg7Var.o();
        } else {
            View view = this.u;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        f activity = getActivity();
        if (activity instanceof SectionActivity) {
            ((SectionActivity) activity).a0();
        }
    }

    protected vg7 j1() {
        return this.presenter;
    }

    @Override // defpackage.zh7
    public void k() {
        getActivity().finish();
    }

    public void l(SectionFront sectionFront) {
        this.i = sectionFront;
        x1(sectionFront);
    }

    @Override // defpackage.zh7
    public boolean l0() {
        return getArguments().getBoolean("recyclerHasHeader", false);
    }

    protected void l1(SectionFrontRecyclerView sectionFrontRecyclerView, qf7 qf7Var) {
        RecyclerView.o linearLayoutManager;
        int i = qf7Var.a;
        if (i == 1) {
            linearLayoutManager = new LinearLayoutManager(getActivity());
            linearLayoutManager.F1(true);
            this.j = h1();
        } else if (i == 2) {
            linearLayoutManager = new SpannableGridLayoutManager(sectionFrontRecyclerView);
            this.j = g1(qf7Var, true);
        } else {
            if (i != 3) {
                throw new IllegalStateException("Unknown desired number of columns: " + qf7Var.a);
            }
            linearLayoutManager = new SpannableGridLayoutManager(sectionFrontRecyclerView);
            this.j = g1(qf7Var, false);
        }
        sectionFrontRecyclerView.setLayoutManager(linearLayoutManager);
        sectionFrontRecyclerView.setAdapter(this.j);
        if (!(this instanceof SavedSectionFrontFragment) || DeviceUtils.C(getActivity())) {
            sectionFrontRecyclerView.setHasFixedSize(true);
        }
    }

    @Override // defpackage.zh7
    public void m(qf7 qf7Var, int i) {
        qf7Var.b(getContext(), i);
    }

    @Override // defpackage.rc7
    public void n0(boolean z) {
        SectionFrontRecyclerView sectionFrontRecyclerView = this.h;
        if (sectionFrontRecyclerView != null) {
            this.k = 0;
            if (z) {
                sectionFrontRecyclerView.smoothScrollToPosition(0);
                return;
            }
            sectionFrontRecyclerView.scrollToPosition(0);
            gf7 gf7Var = this.j;
            if (gf7Var != null) {
                gf7Var.d0();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.h.addOnScrollListener(this.l);
        this.h.addOnScrollListener(this.videoAutoPlayScrollListener);
        this.h.addOnScrollListener(this.regibundleScrollListener);
        j1().c0(this);
        this.r.a(this, this.f);
        this.n.l(this.f);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.r = new SectionFrontPageEventSender();
        this.f = getArguments().getString("sectionName");
        this.g = getArguments().getString("sectionTitle");
        this.n = (SectionFrontAdsViewModel) new t(this).a(SectionFrontAdsViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(hi6.fragment_section_front, viewGroup, false);
        this.h = (SectionFrontRecyclerView) inflate.findViewById(pg6.sectionFrontRecyclerView);
        this.u = inflate.findViewById(pg6.progress_indicator);
        if (bundle != null) {
            t1(bundle);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.m.clear();
        if (j1() != null) {
            j1().L();
        }
        this.h.clearOnScrollListeners();
        i1();
        S();
        this.videoAutoPlayScrollListener.j();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        w1();
        if (this.j != null) {
            v1(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.feedPerformanceTracker.n("Browse Sections Tab");
    }

    protected void p1(qf7 qf7Var) {
        if (j1() != null) {
            j1().B0(qf7Var);
        }
    }

    public void s1() {
        this.et2Scope.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        getUserVisibleHint();
        super.setUserVisibleHint(z);
    }

    protected void t1(Bundle bundle) {
        this.k = bundle.getInt("lastScrollPosition");
    }

    @Override // defpackage.zh7
    public String u0() {
        return this.f;
    }

    protected void u1() {
        if (uc7.b(this.h.getLayoutManager(), this.k)) {
            return;
        }
        this.h.scrollToPosition(this.k);
    }

    @Override // defpackage.zh7
    public void v() {
        zm8.d(getActivity());
    }

    protected void v1(Bundle bundle) {
        bundle.putInt("lastScrollPosition", this.k);
    }

    public void w1() {
        if (this.j.m() > 0) {
            this.k = uc7.a(this.h.getLayoutManager());
        }
    }

    void x1(SectionFront sectionFront) {
        x3 supportActionBar;
        if (!(getActivity() instanceof SectionActivity) || (supportActionBar = ((SectionActivity) getActivity()).getSupportActionBar()) == null) {
            return;
        }
        String title = sectionFront.getTitle();
        if (title.equals("Saved for Later") && this.featureFlagUtil.G()) {
            title = "All Saved";
        }
        supportActionBar.setTitle(title);
    }

    @Override // defpackage.zh7
    public void y() {
        SectionFrontRecyclerView sectionFrontRecyclerView = this.h;
        if (sectionFrontRecyclerView == null) {
            return;
        }
        sectionFrontRecyclerView.clearItemDecorations();
        e1(this.h, this.w);
    }

    protected void y1(gf7 gf7Var) {
        gf7Var.b0(this);
    }

    public void z1(wg7 wg7Var) {
        this.t = wg7Var;
    }
}
