package com.nytimes.android.fragment.fullscreen;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.nytimes.android.ads.slideshow.SlideshowAdsViewModel;
import com.nytimes.android.ads.ui.compose.AdWrapperUiKt;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import defpackage.b04;
import defpackage.c04;
import defpackage.cs0;
import defpackage.d44;
import defpackage.d8;
import defpackage.du8;
import defpackage.et0;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.le0;
import defpackage.n37;
import defpackage.ng6;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ru7;
import defpackage.t21;
import defpackage.uq7;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class FullscreenAdFragment extends c {
    public static final a Companion = new a(null);
    public static final int h = 8;
    private final c04 f;
    private final c04 g = kotlin.c.a(new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullscreenAdFragment$slotIndex$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Integer mo865invoke() {
            Bundle arguments = FullscreenAdFragment.this.getArguments();
            return Integer.valueOf(arguments != null ? arguments.getInt("AD_SLOT_INDEX") : 0);
        }
    });
    public b04 sharingManager;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FullscreenAdFragment a(int i) {
            FullscreenAdFragment fullscreenAdFragment = new FullscreenAdFragment();
            fullscreenAdFragment.setArguments(le0.a(du8.a("AD_SLOT_INDEX", Integer.valueOf(i))));
            return fullscreenAdFragment;
        }

        private a() {
        }
    }

    public FullscreenAdFragment() {
        final qs2 qs2Var = null;
        this.f = FragmentViewModelLazyKt.b(this, zt6.b(SlideshowAdsViewModel.class), new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullscreenAdFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                u viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                zq3.g(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullscreenAdFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                if (qs2Var2 != null && (t21Var = (t21) qs2Var2.mo865invoke()) != null) {
                    return t21Var;
                }
                t21 defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                zq3.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new qs2() { // from class: com.nytimes.android.fragment.fullscreen.FullscreenAdFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                t.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                zq3.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SlideshowAdsViewModel f1() {
        return (SlideshowAdsViewModel) this.f.getValue();
    }

    public final b04 d1() {
        b04 b04Var = this.sharingManager;
        if (b04Var != null) {
            return b04Var;
        }
        zq3.z("sharingManager");
        return null;
    }

    public final int e1() {
        return ((Number) this.g.getValue()).intValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f1().l(e1());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        zq3.h(menu, "menu");
        zq3.h(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        ((uq7) d1().get()).f(menu, ng6.action_share);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        Context requireContext = requireContext();
        zq3.g(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        setHasOptionsMenu(true);
        d44 viewLifecycleOwner = getViewLifecycleOwner();
        zq3.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.b(viewLifecycleOwner));
        composeView.setContent(zr0.c(-1808188162, true, new gt2() { // from class: com.nytimes.android.fragment.fullscreen.FullscreenAdFragment$onCreateView$1$1
            {
                super(2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ru7 c(x08 x08Var) {
                return (ru7) x08Var.getValue();
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                SlideshowAdsViewModel f1;
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-1808188162, i, -1, "com.nytimes.android.fragment.fullscreen.FullscreenAdFragment.onCreateView.<anonymous>.<anonymous> (FullscreenAdFragment.kt:55)");
                }
                f1 = FullscreenAdFragment.this.f1();
                final x08 b = y.b(f1.i(), null, composer, 8, 1);
                NytThemeKt.a(false, null, null, zr0.b(composer, -454644370, true, new gt2() { // from class: com.nytimes.android.fragment.fullscreen.FullscreenAdFragment$onCreateView$1$1.1
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
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(-454644370, i2, -1, "com.nytimes.android.fragment.fullscreen.FullscreenAdFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (FullscreenAdFragment.kt:57)");
                        }
                        Modifier.a aVar = Modifier.a;
                        Modifier f = SizeKt.f(aVar, 0.0f, 1, null);
                        Alignment.c i3 = Alignment.a.i();
                        x08 x08Var = x08.this;
                        composer2.z(693286680);
                        rg4 a2 = m.a(Arrangement.a.f(), i3, composer2, 48);
                        composer2.z(-1323940314);
                        int a3 = cs0.a(composer2, 0);
                        et0 o = composer2.o();
                        ComposeUiNode.Companion companion = ComposeUiNode.F;
                        qs2 a4 = companion.a();
                        it2 c = LayoutKt.c(f);
                        if (composer2.j() == null) {
                            cs0.c();
                        }
                        composer2.G();
                        if (composer2.f()) {
                            composer2.D(a4);
                        } else {
                            composer2.p();
                        }
                        Composer a5 = Updater.a(composer2);
                        Updater.c(a5, a2, companion.e());
                        Updater.c(a5, o, companion.g());
                        gt2 b2 = companion.b();
                        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                            a5.q(Integer.valueOf(a3));
                            a5.v(Integer.valueOf(a3), b2);
                        }
                        c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                        composer2.z(2058660585);
                        n37 n37Var = n37.a;
                        AdWrapperUiKt.f(FullscreenAdFragment$onCreateView$1$1.c(x08Var).a(), SizeKt.A(aVar, null, false, 3, null), false, false, composer2, d8.a | 432, 8);
                        composer2.R();
                        composer2.t();
                        composer2.R();
                        composer2.R();
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), composer, 3072, 7);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }));
        return composeView;
    }
}
