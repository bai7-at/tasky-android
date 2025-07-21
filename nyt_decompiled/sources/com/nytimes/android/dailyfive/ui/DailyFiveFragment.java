package com.nytimes.android.dailyfive.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.f;
import androidx.lifecycle.d;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.comscore.streaming.AdvertisementType;
import com.nytimes.android.dailyfive.analytics.DailyFiveAnalytics;
import com.nytimes.android.dailyfive.ui.DailyFiveFragment;
import com.nytimes.android.dailyfive.ui.items.DailyFiveViewItemProvider;
import com.nytimes.android.designsystem.uiview.ProgressTextView;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.tabs.composable.MainTopAppBarKt;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import defpackage.b35;
import defpackage.c04;
import defpackage.cb2;
import defpackage.cs0;
import defpackage.d44;
import defpackage.ee4;
import defpackage.et0;
import defpackage.fe4;
import defpackage.gd6;
import defpackage.gt2;
import defpackage.it2;
import defpackage.j81;
import defpackage.ju7;
import defpackage.lt2;
import defpackage.m37;
import defpackage.mn7;
import defpackage.o33;
import defpackage.ot7;
import defpackage.p81;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rc7;
import defpackage.rg4;
import defpackage.sa9;
import defpackage.sn2;
import defpackage.ss2;
import defpackage.st2;
import defpackage.t21;
import defpackage.td4;
import defpackage.vb2;
import defpackage.vc5;
import defpackage.ww8;
import defpackage.zp2;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.i;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final class DailyFiveFragment extends c implements ee4, rc7 {
    public DailyFiveAnalytics analytics;
    public b eventsManager;
    public fe4 f;
    public cb2 featureFlagUtil;
    public vb2 feedPerformanceTracker;
    private final c04 g;
    private final o33 h;
    private zp2 i;
    private final String j;
    public td4 mainActivityNavigator;
    public b35 navigationStateHolder;
    public j81 navigator;
    public mn7 settingsMenuManager;
    public DailyFiveViewItemProvider viewItemProvider;

    static final class a implements vc5, st2 {
        private final /* synthetic */ ss2 a;

        a(ss2 ss2Var) {
            zq3.h(ss2Var, "function");
            this.a = ss2Var;
        }

        @Override // defpackage.vc5
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        @Override // defpackage.st2
        public final lt2 b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof vc5) && (obj instanceof st2)) {
                return zq3.c(b(), ((st2) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public DailyFiveFragment() {
        final qs2 qs2Var = new qs2() { // from class: com.nytimes.android.dailyfive.ui.DailyFiveFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Fragment mo865invoke() {
                return Fragment.this;
            }
        };
        final c04 b = kotlin.c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: com.nytimes.android.dailyfive.ui.DailyFiveFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final sa9 mo865invoke() {
                return (sa9) qs2.this.mo865invoke();
            }
        });
        final qs2 qs2Var2 = null;
        this.g = FragmentViewModelLazyKt.b(this, zt6.b(DailyFiveViewModel.class), new qs2() { // from class: com.nytimes.android.dailyfive.ui.DailyFiveFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                sa9 c;
                c = FragmentViewModelLazyKt.c(c04.this);
                return c.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.dailyfive.ui.DailyFiveFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                sa9 c;
                t21 t21Var;
                qs2 qs2Var3 = qs2.this;
                if (qs2Var3 != null && (t21Var = (t21) qs2Var3.mo865invoke()) != null) {
                    return t21Var;
                }
                c = FragmentViewModelLazyKt.c(b);
                d dVar = c instanceof d ? (d) c : null;
                return dVar != null ? dVar.getDefaultViewModelCreationExtras() : t21.a.b;
            }
        }, new qs2() { // from class: com.nytimes.android.dailyfive.ui.DailyFiveFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                sa9 c;
                t.b defaultViewModelProviderFactory;
                c = FragmentViewModelLazyKt.c(b);
                d dVar = c instanceof d ? (d) c : null;
                if (dVar != null && (defaultViewModelProviderFactory = dVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                t.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                zq3.g(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.h = new o33();
        this.j = "For You Tab";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DailyFiveViewModel o1() {
        return (DailyFiveViewModel) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p1(DailyFiveFragment dailyFiveFragment) {
        zq3.h(dailyFiveFragment, "this$0");
        dailyFiveFragment.o1().k();
        dailyFiveFragment.i1().o(dailyFiveFragment.j);
    }

    public final DailyFiveAnalytics g1() {
        DailyFiveAnalytics dailyFiveAnalytics = this.analytics;
        if (dailyFiveAnalytics != null) {
            return dailyFiveAnalytics;
        }
        zq3.z("analytics");
        return null;
    }

    public final b h1() {
        b bVar = this.eventsManager;
        if (bVar != null) {
            return bVar;
        }
        zq3.z("eventsManager");
        return null;
    }

    public final vb2 i1() {
        vb2 vb2Var = this.feedPerformanceTracker;
        if (vb2Var != null) {
            return vb2Var;
        }
        zq3.z("feedPerformanceTracker");
        return null;
    }

    public final td4 j1() {
        td4 td4Var = this.mainActivityNavigator;
        if (td4Var != null) {
            return td4Var;
        }
        zq3.z("mainActivityNavigator");
        return null;
    }

    public final fe4 k1() {
        fe4 fe4Var = this.f;
        if (fe4Var != null) {
            return fe4Var;
        }
        zq3.z("mainTabState");
        return null;
    }

    public final b35 l1() {
        b35 b35Var = this.navigationStateHolder;
        if (b35Var != null) {
            return b35Var;
        }
        zq3.z("navigationStateHolder");
        return null;
    }

    public final mn7 m1() {
        mn7 mn7Var = this.settingsMenuManager;
        if (mn7Var != null) {
            return mn7Var;
        }
        zq3.z("settingsMenuManager");
        return null;
    }

    @Override // defpackage.rc7
    public void n0(boolean z) {
        RecyclerView recyclerView;
        zp2 zp2Var = this.i;
        if (zp2Var == null || (recyclerView = zp2Var.c) == null) {
            return;
        }
        ViewExtensions.o(recyclerView, z);
    }

    public final DailyFiveViewItemProvider n1() {
        DailyFiveViewItemProvider dailyFiveViewItemProvider = this.viewItemProvider;
        if (dailyFiveViewItemProvider != null) {
            return dailyFiveViewItemProvider;
        }
        zq3.z("viewItemProvider");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        l1().e(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        zq3.h(menu, "menu");
        zq3.h(menuInflater, "inflater");
        m1().b(menu, new qs2() { // from class: com.nytimes.android.dailyfive.ui.DailyFiveFragment$onCreateOptionsMenu$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m329invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m329invoke() {
                DailyFiveFragment.this.g1().e();
            }
        });
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        final zp2 c = zp2.c(layoutInflater, viewGroup, false);
        zq3.g(c, "inflate(...)");
        RecyclerView recyclerView = c.c;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(this.h);
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        zq3.f(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
        ((e) itemAnimator).Q(false);
        c.f.setProgressViewOffset(false, 0, (int) Math.ceil(72 * getResources().getDisplayMetrics().density));
        c.b.setContent(zr0.c(-937236308, true, new gt2() { // from class: com.nytimes.android.dailyfive.ui.DailyFiveFragment$onCreateView$2
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-937236308, i, -1, "com.nytimes.android.dailyfive.ui.DailyFiveFragment.onCreateView.<anonymous> (DailyFiveFragment.kt:103)");
                }
                final DailyFiveFragment dailyFiveFragment = DailyFiveFragment.this;
                composer.z(733328855);
                Modifier.a aVar = Modifier.a;
                rg4 g = BoxKt.g(Alignment.a.o(), false, composer, 0);
                composer.z(-1323940314);
                int a2 = cs0.a(composer, 0);
                et0 o = composer.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a3 = companion.a();
                it2 c2 = LayoutKt.c(aVar);
                if (composer.j() == null) {
                    cs0.c();
                }
                composer.G();
                if (composer.f()) {
                    composer.D(a3);
                } else {
                    composer.p();
                }
                Composer a4 = Updater.a(composer);
                Updater.c(a4, g, companion.e());
                Updater.c(a4, o, companion.g());
                gt2 b = companion.b();
                if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                    a4.q(Integer.valueOf(a2));
                    a4.v(Integer.valueOf(a2), b);
                }
                c2.invoke(ju7.a(ju7.b(composer)), composer, 0);
                composer.z(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                py1.d(ww8.a, new DailyFiveFragment$onCreateView$2$1$1(dailyFiveFragment, null), composer, 70);
                MainTopAppBarKt.a(ComposableSingletons$DailyFiveFragmentKt.a.a(), null, dailyFiveFragment.k1().e(), null, zr0.b(composer, -60030417, true, new it2() { // from class: com.nytimes.android.dailyfive.ui.DailyFiveFragment$onCreateView$2$1$2
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(m37 m37Var, Composer composer2, int i2) {
                        zq3.h(m37Var, "$this$MainTopAppBar");
                        if ((i2 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(-60030417, i2, -1, "com.nytimes.android.dailyfive.ui.DailyFiveFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (DailyFiveFragment.kt:111)");
                        }
                        final DailyFiveFragment dailyFiveFragment2 = DailyFiveFragment.this;
                        IconButtonKt.a(new qs2() { // from class: com.nytimes.android.dailyfive.ui.DailyFiveFragment$onCreateView$2$1$2.1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m330invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m330invoke() {
                                td4 j1 = DailyFiveFragment.this.j1();
                                f requireActivity = DailyFiveFragment.this.requireActivity();
                                zq3.g(requireActivity, "requireActivity(...)");
                                j1.f(requireActivity);
                                DailyFiveFragment.this.g1().e();
                            }
                        }, null, false, null, ComposableSingletons$DailyFiveFragmentKt.a.b(), composer2, 24576, 14);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), 0L, 0L, 0.0f, composer, (ScrollObserver.g << 6) | 24582, AdvertisementType.BRANDED_AS_CONTENT);
                composer.R();
                composer.t();
                composer.R();
                composer.R();
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }));
        i1().n(this.j);
        DailyFiveAnalytics g1 = g1();
        RecyclerView recyclerView2 = c.c;
        zq3.g(recyclerView2, "dailyFiveFeedRv");
        g1.d(this, recyclerView2);
        SwipeRefreshLayout swipeRefreshLayout = c.f;
        swipeRefreshLayout.setColorSchemeResources(gd6.content_primary_alwayslight);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(gd6.background_primary_alwayslight);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: x71
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                DailyFiveFragment.p1(DailyFiveFragment.this);
            }
        });
        o1().j().j(getViewLifecycleOwner(), new a(new ss2() { // from class: com.nytimes.android.dailyfive.ui.DailyFiveFragment$onCreateView$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(p81 p81Var) {
                o33 o33Var;
                String str;
                o33Var = DailyFiveFragment.this.h;
                DailyFiveViewItemProvider n1 = DailyFiveFragment.this.n1();
                sn2 c2 = p81Var.c();
                List b = c2 != null ? c2.b() : null;
                if (b == null) {
                    b = i.l();
                }
                o33Var.W(n1.d(b), false);
                vb2 i1 = DailyFiveFragment.this.i1();
                str = DailyFiveFragment.this.j;
                i1.l(str);
                zp2 zp2Var = c;
                ProgressTextView progressTextView = zp2Var.e;
                SwipeRefreshLayout swipeRefreshLayout2 = zp2Var.f;
                zq3.g(swipeRefreshLayout2, "swipeRefreshLayout");
                progressTextView.A(swipeRefreshLayout2, p81Var.d());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((p81) obj);
                return ww8.a;
            }
        }));
        ot7 i = o1().i();
        d44 viewLifecycleOwner = getViewLifecycleOwner();
        zq3.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        i.j(viewLifecycleOwner, new a(new ss2() { // from class: com.nytimes.android.dailyfive.ui.DailyFiveFragment$onCreateView$5

            /* renamed from: com.nytimes.android.dailyfive.ui.DailyFiveFragment$onCreateView$5$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements qs2 {
                AnonymousClass1(Object obj) {
                    super(0, obj, DailyFiveViewModel.class, "onRetryAfterAnError", "onRetryAfterAnError()V", 0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m331invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m331invoke() {
                    ((DailyFiveViewModel) this.receiver).m();
                }
            }

            {
                super(1);
            }

            public final void b(a aVar) {
                DailyFiveViewModel o1;
                zq3.h(aVar, "event");
                b h1 = DailyFiveFragment.this.h1();
                o1 = DailyFiveFragment.this.o1();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(o1);
                final DailyFiveFragment dailyFiveFragment = DailyFiveFragment.this;
                h1.a(aVar, anonymousClass1, new ss2() { // from class: com.nytimes.android.dailyfive.ui.DailyFiveFragment$onCreateView$5.2
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return ww8.a;
                    }

                    public final void invoke(String str) {
                        DailyFiveViewModel o12;
                        zq3.h(str, "it");
                        DailyFiveFragment.this.l1().c();
                        o12 = DailyFiveFragment.this.o1();
                        f requireActivity = DailyFiveFragment.this.requireActivity();
                        zq3.g(requireActivity, "requireActivity(...)");
                        o12.g(requireActivity);
                    }
                });
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((a) obj);
                return ww8.a;
            }
        }));
        this.i = c;
        FrameLayout root = c.getRoot();
        zq3.g(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        zp2 zp2Var = this.i;
        RecyclerView recyclerView = zp2Var != null ? zp2Var.c : null;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o1().l(l1().a());
        l1().d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        zq3.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        l1().f(bundle);
    }

    public final void q1(fe4 fe4Var) {
        zq3.h(fe4Var, "<set-?>");
        this.f = fe4Var;
    }
}
