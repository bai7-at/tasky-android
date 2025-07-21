package com.nytimes.android.recent;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.f;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.GridLayoutManager;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.comments.comments.data.store.CommentsStore;
import com.nytimes.android.databinding.RecentsEmptyViewBinding;
import com.nytimes.android.entitlements.b;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.recent.RecentlyViewedFragment;
import com.nytimes.android.recent.ui.ToggleableRecentsView;
import com.nytimes.android.recentlyviewed.RecentlyViewedLoginManager;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.recentlyviewed.RecentlyViewingFetchingProxy;
import com.nytimes.android.utils.ShareOrigin;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import com.nytimes.android.widget.SectionFrontRecyclerView;
import defpackage.c04;
import defpackage.cb2;
import defpackage.hf5;
import defpackage.hq2;
import defpackage.jk;
import defpackage.m33;
import defpackage.mc6;
import defpackage.qn6;
import defpackage.qq3;
import defpackage.qs2;
import defpackage.r83;
import defpackage.ss2;
import defpackage.um6;
import defpackage.uq7;
import defpackage.wr6;
import defpackage.ww8;
import defpackage.xr6;
import defpackage.ys7;
import defpackage.z18;
import defpackage.zq3;
import defpackage.zr6;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import kotlin.c;
import kotlin.collections.d;

/* loaded from: classes4.dex */
public final class RecentlyViewedFragment extends r83 implements zr6, hf5 {
    public xr6 analytics;
    public CommentsStore commentStore;
    private RecentlyViewingFetchingProxy f;
    public cb2 featureFlagUtil;
    private ConstraintLayout g;
    private RecentlyViewedLoginManager h;
    private hq2 i;
    public qq3 internalPreferences;
    private boolean m;
    public RecentlyViewedManager recentlyViewedManager;
    public SavingBridge savedBridge;
    public uq7 sharingManager;
    public b signInClient;
    public SnackbarUtil snackbarUtil;
    private final c04 j = c.a(new qs2() { // from class: com.nytimes.android.recent.RecentlyViewedFragment$recentsAdapter$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final wr6 mo865invoke() {
            return new wr6(RecentlyViewedFragment.this);
        }
    });
    private final c04 k = c.a(new qs2() { // from class: com.nytimes.android.recent.RecentlyViewedFragment$numberOfColumns$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Integer mo865invoke() {
            TypedArray obtainStyledAttributes;
            Context context = RecentlyViewedFragment.this.getContext();
            int i = 1;
            if (context != null && (obtainStyledAttributes = context.obtainStyledAttributes(um6.SectionFront_LayoutConfig_Default, qn6.SectionFrontLayoutConfig)) != null) {
                int[] iArr = qn6.SectionFrontLayoutConfig;
                zq3.g(iArr, "SectionFrontLayoutConfig");
                i = obtainStyledAttributes.getInt(d.i0(iArr, mc6.numColumns), 1);
                obtainStyledAttributes.recycle();
            }
            return Integer.valueOf(i);
        }
    });
    private final CompositeDisposable l = new CompositeDisposable();
    private final c04 n = c.a(new qs2() { // from class: com.nytimes.android.recent.RecentlyViewedFragment$toggleableRecentsView$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ToggleableRecentsView mo865invoke() {
            ConstraintLayout constraintLayout;
            hq2 q1;
            constraintLayout = RecentlyViewedFragment.this.g;
            if (constraintLayout == null) {
                zq3.z("emptyView");
                constraintLayout = null;
            }
            q1 = RecentlyViewedFragment.this.q1();
            SectionFrontRecyclerView sectionFrontRecyclerView = q1.c;
            zq3.g(sectionFrontRecyclerView, "sectionFrontRecyclerView");
            f activity = RecentlyViewedFragment.this.getActivity();
            zq3.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            return new ToggleableRecentsView(constraintLayout, sectionFrontRecyclerView, (jk) activity, RecentlyViewedFragment.this.t1());
        }
    });

    private final int n1() {
        return ((Number) this.k.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wr6 p1() {
        return (wr6) this.j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hq2 q1() {
        hq2 hq2Var = this.i;
        if (hq2Var != null) {
            return hq2Var;
        }
        throw new IllegalStateException("Missing binding");
    }

    private final ToggleableRecentsView u1() {
        return (ToggleableRecentsView) this.n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y1(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    public final void A1(z18 z18Var, int i) {
        zq3.h(z18Var, "asset");
        DisposableKt.plusAssign(this.l, o1().A(z18Var, i));
    }

    @Override // defpackage.hf5
    public void D0(z18 z18Var) {
        zq3.h(z18Var, "asset");
        final int P = p1().P(z18Var);
        if (W(z18Var)) {
            CompositeDisposable compositeDisposable = this.l;
            Completable k = r1().k(this, z18Var, new ss2() { // from class: com.nytimes.android.recent.RecentlyViewedFragment$onRecentlyViewedItemSaved$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return ww8.a;
                }

                public final void invoke(boolean z) {
                    wr6 p1;
                    p1 = RecentlyViewedFragment.this.p1();
                    p1.s(P);
                }
            });
            Action action = new Action() { // from class: as6
                @Override // io.reactivex.functions.Action
                public final void run() {
                    RecentlyViewedFragment.v1();
                }
            };
            final RecentlyViewedFragment$onRecentlyViewedItemSaved$3 recentlyViewedFragment$onRecentlyViewedItemSaved$3 = new ss2() { // from class: com.nytimes.android.recent.RecentlyViewedFragment$onRecentlyViewedItemSaved$3
                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return ww8.a;
                }

                public final void invoke(Throwable th) {
                    zq3.e(th);
                    NYTLogger.h(th);
                }
            };
            Disposable subscribe = k.subscribe(action, new Consumer() { // from class: bs6
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    RecentlyViewedFragment.w1(ss2.this, obj);
                }
            });
            zq3.g(subscribe, "subscribe(...)");
            DisposableKt.plusAssign(compositeDisposable, subscribe);
            return;
        }
        CompositeDisposable compositeDisposable2 = this.l;
        Completable i = r1().i(this, z18Var, new ss2() { // from class: com.nytimes.android.recent.RecentlyViewedFragment$onRecentlyViewedItemSaved$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return ww8.a;
            }

            public final void invoke(boolean z) {
                wr6 p1;
                p1 = RecentlyViewedFragment.this.p1();
                p1.s(P);
            }
        });
        Action action2 = new Action() { // from class: cs6
            @Override // io.reactivex.functions.Action
            public final void run() {
                RecentlyViewedFragment.x1();
            }
        };
        final RecentlyViewedFragment$onRecentlyViewedItemSaved$6 recentlyViewedFragment$onRecentlyViewedItemSaved$6 = new ss2() { // from class: com.nytimes.android.recent.RecentlyViewedFragment$onRecentlyViewedItemSaved$6
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.h(th);
            }
        };
        Disposable subscribe2 = i.subscribe(action2, new Consumer() { // from class: ds6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RecentlyViewedFragment.y1(ss2.this, obj);
            }
        });
        zq3.g(subscribe2, "subscribe(...)");
        DisposableKt.plusAssign(compositeDisposable2, subscribe2);
    }

    @Override // defpackage.hf5
    public void E0(z18 z18Var) {
        zq3.h(z18Var, "asset");
        uq7 s1 = s1();
        f requireActivity = requireActivity();
        zq3.g(requireActivity, "requireActivity(...)");
        uq7.n(s1, requireActivity, z18Var.o(), z18Var.m(), z18Var.l(), ShareOrigin.RECENTLY_VIEWED, null, null, null, null, false, null, null, 4064, null);
    }

    @Override // defpackage.hf5
    public boolean W(z18 z18Var) {
        zq3.h(z18Var, "asset");
        return r1().g(z18Var);
    }

    @Override // defpackage.ff7
    public void b1() {
        p1().r();
    }

    @Override // com.nytimes.android.widget.CustomSwipeRefreshLayout.SwipeDelegate
    public boolean canScrollUp() {
        return true;
    }

    @Override // defpackage.zr6
    public void d0(PagedList pagedList) {
        zq3.h(pagedList, "assets");
        ProgressBar progressBar = q1().b;
        zq3.g(progressBar, "progressIndicator");
        ConstraintLayout constraintLayout = null;
        ViewExtensions.i(progressBar, 0L, 1, null);
        if (pagedList.isEmpty()) {
            SectionFrontRecyclerView sectionFrontRecyclerView = q1().c;
            zq3.g(sectionFrontRecyclerView, "sectionFrontRecyclerView");
            ConstraintLayout constraintLayout2 = this.g;
            if (constraintLayout2 == null) {
                zq3.z("emptyView");
            } else {
                constraintLayout = constraintLayout2;
            }
            ViewExtensions.p(sectionFrontRecyclerView, constraintLayout);
            return;
        }
        RecentlyViewedLoginManager recentlyViewedLoginManager = this.h;
        if (recentlyViewedLoginManager == null) {
            zq3.z("loginManager");
            recentlyViewedLoginManager = null;
        }
        if (recentlyViewedLoginManager.e()) {
            ConstraintLayout constraintLayout3 = this.g;
            if (constraintLayout3 == null) {
                zq3.z("emptyView");
                constraintLayout3 = null;
            }
            if (constraintLayout3.getVisibility() == 0) {
                ConstraintLayout constraintLayout4 = this.g;
                if (constraintLayout4 == null) {
                    zq3.z("emptyView");
                } else {
                    constraintLayout = constraintLayout4;
                }
                SectionFrontRecyclerView sectionFrontRecyclerView2 = q1().c;
                zq3.g(sectionFrontRecyclerView2, "sectionFrontRecyclerView");
                ViewExtensions.p(constraintLayout, sectionFrontRecyclerView2);
            }
        }
        p1().O(pagedList);
        if (this.m) {
            return;
        }
        this.m = true;
        Iterator<E> it2 = pagedList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            z18 z18Var = (z18) it2.next();
            zq3.e(z18Var);
            z1(z18Var, i);
            i++;
        }
    }

    public final xr6 k1() {
        xr6 xr6Var = this.analytics;
        if (xr6Var != null) {
            return xr6Var;
        }
        zq3.z("analytics");
        return null;
    }

    public final CommentsStore l1() {
        CommentsStore commentsStore = this.commentStore;
        if (commentsStore != null) {
            return commentsStore;
        }
        zq3.z("commentStore");
        return null;
    }

    public final qq3 m1() {
        qq3 qq3Var = this.internalPreferences;
        if (qq3Var != null) {
            return qq3Var;
        }
        zq3.z("internalPreferences");
        return null;
    }

    @Override // defpackage.rc7
    public void n0(boolean z) {
        SectionFrontRecyclerView sectionFrontRecyclerView = q1().c;
        zq3.g(sectionFrontRecyclerView, "sectionFrontRecyclerView");
        ViewExtensions.o(sectionFrontRecyclerView, z);
    }

    public final RecentlyViewedManager o1() {
        RecentlyViewedManager recentlyViewedManager = this.recentlyViewedManager;
        if (recentlyViewedManager != null) {
            return recentlyViewedManager;
        }
        zq3.z("recentlyViewedManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ET2CoroutineScopeKt.d(this, new RecentlyViewedFragment$onActivityCreated$1(null));
        RecentlyViewingFetchingProxy a = RecentlyViewingFetchingProxy.Companion.a(this, o1(), m1());
        this.f = a;
        if (a == null) {
            zq3.z("recentProxy");
            a = null;
        }
        a.b();
        ProgressBar progressBar = q1().b;
        zq3.g(progressBar, "progressIndicator");
        ViewExtensions.g(progressBar, 0L, 1, null);
        SectionFrontRecyclerView sectionFrontRecyclerView = q1().c;
        sectionFrontRecyclerView.setLayoutManager(new GridLayoutManager(sectionFrontRecyclerView.getContext(), n1()));
        sectionFrontRecyclerView.setAdapter(p1());
        Context requireContext = requireContext();
        zq3.g(requireContext, "requireContext(...)");
        sectionFrontRecyclerView.addItemDecoration(new m33(requireContext));
        setHasOptionsMenu(true);
        this.h = RecentlyViewedLoginManager.Companion.a(this, t1(), u1());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        this.i = hq2.c(layoutInflater, viewGroup, false);
        FrameLayout root = q1().getRoot();
        ConstraintLayout constraintLayout = RecentsEmptyViewBinding.inflate(layoutInflater, root, true).recentsEmptyView;
        zq3.g(constraintLayout, "recentsEmptyView");
        this.g = constraintLayout;
        if (constraintLayout == null) {
            zq3.z("emptyView");
            constraintLayout = null;
        }
        ViewExtensions.k(constraintLayout);
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.l.clear();
        this.i = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RecentlyViewedLoginManager recentlyViewedLoginManager = this.h;
        if (recentlyViewedLoginManager == null) {
            zq3.z("loginManager");
            recentlyViewedLoginManager = null;
        }
        recentlyViewedLoginManager.d();
        p1().r();
    }

    @Override // defpackage.hf5
    public void r0(z18 z18Var) {
        zq3.h(z18Var, "asset");
        k1().a(z18Var);
        String o = z18Var.o();
        if (o != null) {
            String n = z18Var.n();
            if (n == null) {
                n = Asset.Companion.generateUri(z18Var.e(), z18Var.c());
            }
            ys7 ys7Var = ys7.a;
            Context requireContext = requireContext();
            zq3.g(requireContext, "requireContext(...)");
            startActivity(ys7Var.b(requireContext, n, o));
        }
    }

    public final SavingBridge r1() {
        SavingBridge savingBridge = this.savedBridge;
        if (savingBridge != null) {
            return savingBridge;
        }
        zq3.z("savedBridge");
        return null;
    }

    @Override // defpackage.zr6
    public void s(Throwable th) {
        zq3.h(th, "throwable");
    }

    public final uq7 s1() {
        uq7 uq7Var = this.sharingManager;
        if (uq7Var != null) {
            return uq7Var;
        }
        zq3.z("sharingManager");
        return null;
    }

    public final b t1() {
        b bVar = this.signInClient;
        if (bVar != null) {
            return bVar;
        }
        zq3.z("signInClient");
        return null;
    }

    public final void z1(final z18 z18Var, final int i) {
        zq3.h(z18Var, "asset");
        String o = z18Var.o();
        if (o != null) {
            CompositeDisposable compositeDisposable = this.l;
            Single<Integer> observeOn = l1().getCommentCountSingle(o).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            zq3.g(observeOn, "observeOn(...)");
            DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy(observeOn, new ss2() { // from class: com.nytimes.android.recent.RecentlyViewedFragment$subscribeToCommentCountChanges$1$1
                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return ww8.a;
                }

                public final void invoke(Throwable th) {
                    zq3.h(th, "it");
                    NYTLogger.i(th, "failed to fetch comment count", new Object[0]);
                }
            }, new ss2() { // from class: com.nytimes.android.recent.RecentlyViewedFragment$subscribeToCommentCountChanges$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(Integer num) {
                    wr6 p1;
                    RecentlyViewedFragment recentlyViewedFragment = RecentlyViewedFragment.this;
                    z18 z18Var2 = z18Var;
                    zq3.e(num);
                    recentlyViewedFragment.A1(z18Var2, num.intValue());
                    p1 = RecentlyViewedFragment.this.p1();
                    p1.s(i);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Integer) obj);
                    return ww8.a;
                }
            }));
        }
    }
}
