package com.nytimes.android.features.home.ui;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import androidx.fragment.app.FragmentContainerView;
import com.airbnb.lottie.compose.c;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.designsystem.uicompose.utils.LottieAnimationDetail;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.features.home.domain.HomeUseCase;
import com.nytimes.android.readerhybrid.HybridWebView;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import com.nytimes.android.utils.composeutils.nestedscroll.NestedScrollViewInteropKt;
import defpackage.af6;
import defpackage.b04;
import defpackage.by0;
import defpackage.cb2;
import defpackage.cc7;
import defpackage.de4;
import defpackage.fe4;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hf8;
import defpackage.it2;
import defpackage.oa2;
import defpackage.og6;
import defpackage.p93;
import defpackage.pj6;
import defpackage.sy4;
import defpackage.tk6;
import defpackage.ww8;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class HomeFragmentFactory implements de4 {
    private final b04 a;
    private final oa2 b;
    private final AppPreferences c;
    private final cb2 d;
    private final hf8 e;
    private final String f;

    static final class a implements FlowCollector {
        public static final a a = new a();

        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DownloadState downloadState, by0 by0Var) {
            return ww8.a;
        }
    }

    public HomeFragmentFactory(b04 b04Var, oa2 oa2Var, AppPreferences appPreferences, cb2 cb2Var) {
        zq3.h(b04Var, "homeUseCase");
        zq3.h(oa2Var, "fastlyHeadersManager");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(cb2Var, "featureFlagUtil");
        this.a = b04Var;
        this.b = oa2Var;
        this.c = appPreferences;
        this.d = cb2Var;
        this.e = new hf8(Integer.valueOf(af6.ic_tab_top_stories), tk6.today_one_webview_title, Integer.valueOf(tk6.today_accessibility), "topStories", new LottieAnimationDetail(new gt2() { // from class: com.nytimes.android.features.home.ui.HomeFragmentFactory$tabData$1
            public final com.airbnb.lottie.compose.c b(Composer composer, int i) {
                composer.z(-1287827340);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-1287827340, i, -1, "com.nytimes.android.features.home.ui.HomeFragmentFactory.tabData.<anonymous> (HomeFragmentFactory.kt:47)");
                }
                int b = c.a.b(pj6.lottie_today_tab);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return c.a.a(b);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((Composer) obj, ((Number) obj2).intValue());
            }
        }, new HomeFragmentFactory$tabData$2(null)));
        this.f = "homepage";
    }

    private static final HybridWebView g(sy4 sy4Var) {
        return (HybridWebView) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(sy4 sy4Var, HybridWebView hybridWebView) {
        sy4Var.setValue(hybridWebView);
    }

    @Override // defpackage.de4
    public void a(final fe4 fe4Var, Composer composer, final int i) {
        zq3.h(fe4Var, "mainTabState");
        Composer h = composer.h(-956080531);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-956080531, i, -1, "com.nytimes.android.features.home.ui.HomeFragmentFactory.Content (HomeFragmentFactory.kt:63)");
        }
        boolean n = this.c.n("FreshInstallLaunch", true);
        h.z(-676652528);
        if (!n) {
            ET2CoroutineScopeKt.e(null, new HomeFragmentFactory$Content$1(this, null), h, 64, 1);
        }
        h.R();
        h.z(-676652191);
        Object A = h.A();
        if (A == Composer.a.a()) {
            A = b0.e(null, null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        AndroidViewBindingKt.b(new it2() { // from class: com.nytimes.android.features.home.ui.HomeFragmentFactory$Content$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final p93 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
                zq3.h(layoutInflater, "inflater");
                zq3.h(viewGroup, "parent");
                p93 c = p93.c(layoutInflater, viewGroup, z);
                fe4 fe4Var2 = fe4.this;
                sy4 sy4Var2 = sy4Var;
                FragmentContainerView fragmentContainerView = c.b;
                zq3.g(fragmentContainerView, "homeFragmentContainerView");
                ((HomeFragment) fragmentContainerView.getFragment()).O1(fe4Var2);
                HomeFragmentFactory.h(sy4Var2, (HybridWebView) fragmentContainerView.findViewById(og6.webView));
                return c;
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }
        }, ModifierUtilsKt.b(androidx.compose.ui.input.nestedscroll.a.b(Modifier.a, fe4Var.e(), null, 2, null), g(sy4Var), new gt2() { // from class: com.nytimes.android.features.home.ui.HomeFragmentFactory$Content$3
            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Modifier invoke(Modifier modifier, HybridWebView hybridWebView) {
                zq3.h(modifier, "$this$ifNotNull");
                zq3.h(hybridWebView, "it");
                return NestedScrollViewInteropKt.a(Modifier.a, hybridWebView);
            }
        }), null, h, 0, 4);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.home.ui.HomeFragmentFactory$Content$4
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
                    HomeFragmentFactory.this.a(fe4Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    @Override // defpackage.de4
    public Flow b() {
        return de4.a.b(this);
    }

    @Override // defpackage.de4
    public String c() {
        return this.f;
    }

    @Override // defpackage.de4
    public Object d(by0 by0Var) {
        Object collect = ((HomeUseCase) this.a.get()).g(ParallelDownloadStrategy.FETCH_ALWAYS, null).collect(a.a, by0Var);
        return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
    }

    @Override // defpackage.de4
    public boolean e(Uri uri) {
        zq3.h(uri, "uri");
        return zq3.c(k(uri), "nytimes://reader/homepage");
    }

    @Override // defpackage.de4
    public hf8 f() {
        return this.e;
    }

    @Override // defpackage.de4
    public boolean isEnabled() {
        return this.d.D();
    }

    public String k(Uri uri) {
        return de4.a.a(this, uri);
    }
}
