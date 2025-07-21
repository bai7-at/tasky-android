package com.nytimes.android.recent;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.f;
import androidx.lifecycle.d;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.nytimes.android.designsystem.uicompose.composable.NytScaffoldKt;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$2;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$3;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$4;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.features.recentlyviewedui.RecentlyViewedViewModel;
import com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt;
import com.nytimes.android.saved.SaveHandler;
import com.nytimes.android.unfear.reader.handlers.SavedStatusHandlerKt;
import com.nytimes.android.unfear.reader.handlers.ShareActionHandlerKt;
import com.nytimes.android.unfear.reader.handlers.UnfearReaderHandlerProviderKt;
import com.nytimes.android.utils.SaveOrigin;
import com.nytimes.android.utils.ShareOrigin;
import defpackage.by0;
import defpackage.c04;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.o76;
import defpackage.qs2;
import defpackage.s55;
import defpackage.s83;
import defpackage.sa9;
import defpackage.t21;
import defpackage.uq7;
import defpackage.wp6;
import defpackage.ww8;
import defpackage.xp6;
import defpackage.xr6;
import defpackage.ym5;
import defpackage.yr6;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final class RecentlyViewedUnfearFragment extends s83 {
    public xr6 analytics;
    private final c04 f;
    public SaveHandler saveHandler;
    public uq7 sharingManager;

    public RecentlyViewedUnfearFragment() {
        final qs2 qs2Var = new qs2() { // from class: com.nytimes.android.recent.RecentlyViewedUnfearFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Fragment mo865invoke() {
                return Fragment.this;
            }
        };
        final c04 b = c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: com.nytimes.android.recent.RecentlyViewedUnfearFragment$special$$inlined$viewModels$default$2
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
        this.f = FragmentViewModelLazyKt.b(this, zt6.b(RecentlyViewedViewModel.class), new qs2() { // from class: com.nytimes.android.recent.RecentlyViewedUnfearFragment$special$$inlined$viewModels$default$3
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
        }, new qs2() { // from class: com.nytimes.android.recent.RecentlyViewedUnfearFragment$special$$inlined$viewModels$default$4
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
        }, new qs2() { // from class: com.nytimes.android.recent.RecentlyViewedUnfearFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecentlyViewedViewModel h1() {
        return (RecentlyViewedViewModel) this.f.getValue();
    }

    @Override // defpackage.ff7
    public void b1() {
        h1().r();
    }

    @Override // com.nytimes.android.widget.CustomSwipeRefreshLayout.SwipeDelegate
    public boolean canScrollUp() {
        return true;
    }

    public final xr6 e1() {
        xr6 xr6Var = this.analytics;
        if (xr6Var != null) {
            return xr6Var;
        }
        zq3.z("analytics");
        return null;
    }

    public final SaveHandler f1() {
        SaveHandler saveHandler = this.saveHandler;
        if (saveHandler != null) {
            return saveHandler;
        }
        zq3.z("saveHandler");
        return null;
    }

    public final uq7 g1() {
        uq7 uq7Var = this.sharingManager;
        if (uq7Var != null) {
            return uq7Var;
        }
        zq3.z("sharingManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public ComposeView onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        Context requireContext = requireContext();
        zq3.g(requireContext, "requireContext(...)");
        final ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        xr6 e1 = e1();
        f requireActivity = requireActivity();
        zq3.g(requireActivity, "requireActivity(...)");
        final yr6 yr6Var = new yr6(e1, requireActivity);
        final wp6 wp6Var = new wp6(this, f1(), SaveOrigin.RECENTLY_VIEWED);
        Context context = composeView.getContext();
        zq3.g(context, "getContext(...)");
        final xp6 xp6Var = new xp6(context, g1(), ShareOrigin.RECENTLY_VIEWED);
        composeView.setContent(zr0.c(596499750, true, new gt2() { // from class: com.nytimes.android.recent.RecentlyViewedUnfearFragment$onCreateView$1$1

            @fc1(c = "com.nytimes.android.recent.RecentlyViewedUnfearFragment$onCreateView$1$1$1", f = "RecentlyViewedUnfearFragment.kt", l = {MdtaMetadataEntry.TYPE_INDICATOR_INT32}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.recent.RecentlyViewedUnfearFragment$onCreateView$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(by0 by0Var) {
                    super(2, by0Var);
                }

                @Override // defpackage.gt2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(ET2CoroutineScope eT2CoroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(eT2CoroutineScope, by0Var)).invokeSuspend(ww8.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(by0Var);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h;
                    Object h2 = a.h();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.f.b(obj);
                        ET2CoroutineScope eT2CoroutineScope = (ET2CoroutineScope) this.L$0;
                        s55.i iVar = s55.i.c;
                        this.label = 1;
                        h = eT2CoroutineScope.h(iVar, (r23 & 2) != 0 ? null : null, (r23 & 4) != 0 ? null : null, (r23 & 8) != 0 ? null : null, (r23 & 16) != 0 ? null : null, (r23 & 32) != 0 ? ET2CoroutineScope$trackPage$2.a : null, (r23 & 64) != 0 ? ET2CoroutineScope$trackPage$3.a : null, (r23 & 128) != 0 ? ET2CoroutineScope$trackPage$4.a : null, this);
                        if (h == h2) {
                            return h2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.f.b(obj);
                    }
                    return ww8.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                if (b.G()) {
                    b.S(596499750, i, -1, "com.nytimes.android.recent.RecentlyViewedUnfearFragment.onCreateView.<anonymous>.<anonymous> (RecentlyViewedUnfearFragment.kt:65)");
                }
                ET2CoroutineScopeKt.d(RecentlyViewedUnfearFragment.this, new AnonymousClass1(null));
                final yr6 yr6Var2 = yr6Var;
                final wp6 wp6Var2 = wp6Var;
                final xp6 xp6Var2 = xp6Var;
                final RecentlyViewedUnfearFragment recentlyViewedUnfearFragment = RecentlyViewedUnfearFragment.this;
                final ComposeView composeView2 = composeView;
                NytThemeKt.a(false, null, null, zr0.b(composer, 1916633494, true, new gt2() { // from class: com.nytimes.android.recent.RecentlyViewedUnfearFragment$onCreateView$1$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 11) == 2 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1916633494, i2, -1, "com.nytimes.android.recent.RecentlyViewedUnfearFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (RecentlyViewedUnfearFragment.kt:69)");
                        }
                        final yr6 yr6Var3 = yr6.this;
                        final wp6 wp6Var3 = wp6Var2;
                        final xp6 xp6Var3 = xp6Var2;
                        final RecentlyViewedUnfearFragment recentlyViewedUnfearFragment2 = recentlyViewedUnfearFragment;
                        final ComposeView composeView3 = composeView2;
                        NytScaffoldKt.a(null, null, null, 0.0f, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, null, null, zr0.b(composer2, -1411821323, true, new it2() { // from class: com.nytimes.android.recent.RecentlyViewedUnfearFragment.onCreateView.1.1.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // defpackage.it2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return ww8.a;
                            }

                            public final void invoke(final ym5 ym5Var, Composer composer3, int i3) {
                                zq3.h(ym5Var, "it");
                                if ((i3 & 14) == 0) {
                                    i3 |= composer3.S(ym5Var) ? 4 : 2;
                                }
                                if ((i3 & 91) == 18 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (b.G()) {
                                    b.S(-1411821323, i3, -1, "com.nytimes.android.recent.RecentlyViewedUnfearFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecentlyViewedUnfearFragment.kt:70)");
                                }
                                o76[] o76VarArr = {UnfearReaderHandlerProviderKt.a().c(yr6.this), SavedStatusHandlerKt.a().c(wp6Var3), ShareActionHandlerKt.a().c(xp6Var3)};
                                final RecentlyViewedUnfearFragment recentlyViewedUnfearFragment3 = recentlyViewedUnfearFragment2;
                                final wp6 wp6Var4 = wp6Var3;
                                final ComposeView composeView4 = composeView3;
                                CompositionLocalKt.b(o76VarArr, zr0.b(composer3, 109704629, true, new gt2() { // from class: com.nytimes.android.recent.RecentlyViewedUnfearFragment.onCreateView.1.1.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // defpackage.gt2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return ww8.a;
                                    }

                                    public final void invoke(Composer composer4, int i4) {
                                        RecentlyViewedViewModel h1;
                                        RecentlyViewedViewModel h12;
                                        RecentlyViewedViewModel h13;
                                        RecentlyViewedViewModel h14;
                                        if ((i4 & 11) == 2 && composer4.i()) {
                                            composer4.K();
                                            return;
                                        }
                                        if (b.G()) {
                                            b.S(109704629, i4, -1, "com.nytimes.android.recent.RecentlyViewedUnfearFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecentlyViewedUnfearFragment.kt:75)");
                                        }
                                        h1 = RecentlyViewedUnfearFragment.this.h1();
                                        h1.s(wp6Var4);
                                        h12 = RecentlyViewedUnfearFragment.this.h1();
                                        h12.p(RecentlyViewedUnfearFragment.this);
                                        h13 = RecentlyViewedUnfearFragment.this.h1();
                                        StateFlow o = h13.o();
                                        h14 = RecentlyViewedUnfearFragment.this.h1();
                                        StateFlow j = h14.j();
                                        final RecentlyViewedUnfearFragment recentlyViewedUnfearFragment4 = RecentlyViewedUnfearFragment.this;
                                        final ComposeView composeView5 = composeView4;
                                        qs2 qs2Var = new qs2() { // from class: com.nytimes.android.recent.RecentlyViewedUnfearFragment.onCreateView.1.1.2.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // defpackage.qs2
                                            /* renamed from: invoke */
                                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                m643invoke();
                                                return ww8.a;
                                            }

                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m643invoke() {
                                                RecentlyViewedViewModel h15;
                                                h15 = RecentlyViewedUnfearFragment.this.h1();
                                                Context context2 = composeView5.getContext();
                                                zq3.g(context2, "getContext(...)");
                                                h15.q(context2);
                                            }
                                        };
                                        final RecentlyViewedUnfearFragment recentlyViewedUnfearFragment5 = RecentlyViewedUnfearFragment.this;
                                        final ComposeView composeView6 = composeView4;
                                        RecentsComposablesKt.g(o, j, qs2Var, new qs2() { // from class: com.nytimes.android.recent.RecentlyViewedUnfearFragment.onCreateView.1.1.2.1.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // defpackage.qs2
                                            /* renamed from: invoke */
                                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                m644invoke();
                                                return ww8.a;
                                            }

                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m644invoke() {
                                                RecentlyViewedViewModel h15;
                                                h15 = RecentlyViewedUnfearFragment.this.h1();
                                                Context context2 = composeView6.getContext();
                                                zq3.g(context2, "getContext(...)");
                                                h15.q(context2);
                                            }
                                        }, PaddingKt.h(Modifier.a, ym5Var), composer4, 72, 0);
                                        if (b.G()) {
                                            b.R();
                                        }
                                    }
                                }), composer3, 56);
                                if (b.G()) {
                                    b.R();
                                }
                            }
                        }), composer2, 0, 0, 6, 1048575);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer, 3072, 7);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        return composeView;
    }

    @Override // defpackage.rc7
    public void n0(boolean z) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        zq3.h(view, "view");
        super.onViewCreated(view, bundle);
        setHasOptionsMenu(true);
    }
}
