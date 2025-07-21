package com.nytimes.android.dailyfive.di;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.c;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.dailyfive.ui.DailyFiveFragment;
import com.nytimes.android.designsystem.uicompose.utils.LottieAnimationDetail;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import com.nytimes.android.utils.composeutils.nestedscroll.NestedScrollViewInteropKt;
import defpackage.b04;
import defpackage.by0;
import defpackage.cb2;
import defpackage.cc7;
import defpackage.de4;
import defpackage.fe4;
import defpackage.fk6;
import defpackage.ge6;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hf8;
import defpackage.ig6;
import defpackage.it2;
import defpackage.kj6;
import defpackage.m81;
import defpackage.q81;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class DailyFiveMainTabFactory implements de4 {
    private final b04 a;
    private final cb2 b;
    private final hf8 c;
    private final String d;

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

    public DailyFiveMainTabFactory(b04 b04Var, cb2 cb2Var) {
        zq3.h(b04Var, "dailyFiveRepository");
        zq3.h(cb2Var, "featureFlagUtil");
        this.a = b04Var;
        this.b = cb2Var;
        this.c = new hf8(Integer.valueOf(ge6.ic_tab_for_you), fk6.daily_five_for_you_title, Integer.valueOf(fk6.daily_five_for_you_accessibility), "dailyfive", new LottieAnimationDetail(new gt2() { // from class: com.nytimes.android.dailyfive.di.DailyFiveMainTabFactory$tabData$1
            public final c b(Composer composer, int i) {
                composer.z(1019038830);
                if (b.G()) {
                    b.S(1019038830, i, -1, "com.nytimes.android.dailyfive.di.DailyFiveMainTabFactory.tabData.<anonymous> (DailyFiveMainTabFactory.kt:42)");
                }
                int b = c.a.b(kj6.lottie_foryou_tab);
                if (b.G()) {
                    b.R();
                }
                composer.R();
                return c.a.a(b);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((Composer) obj, ((Number) obj2).intValue());
            }
        }, new DailyFiveMainTabFactory$tabData$2(null)));
        this.d = "for you";
    }

    private static final RecyclerView g(sy4 sy4Var) {
        return (RecyclerView) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(sy4 sy4Var, RecyclerView recyclerView) {
        sy4Var.setValue(recyclerView);
    }

    @Override // defpackage.de4
    public void a(final fe4 fe4Var, Composer composer, final int i) {
        int i2;
        zq3.h(fe4Var, "mainTabState");
        Composer h = composer.h(-1033259545);
        if ((i & 14) == 0) {
            i2 = (h.S(fe4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1033259545, i2, -1, "com.nytimes.android.dailyfive.di.DailyFiveMainTabFactory.Content (DailyFiveMainTabFactory.kt:59)");
            }
            ET2CoroutineScopeKt.e(null, new DailyFiveMainTabFactory$Content$1(null), h, 64, 1);
            h.z(-1651124732);
            Object A = h.A();
            if (A == Composer.a.a()) {
                A = b0.e(null, null, 2, null);
                h.q(A);
            }
            final sy4 sy4Var = (sy4) A;
            h.R();
            AndroidViewBindingKt.b(new it2() { // from class: com.nytimes.android.dailyfive.di.DailyFiveMainTabFactory$Content$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final q81 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
                    zq3.h(layoutInflater, "inflater");
                    zq3.h(viewGroup, "parent");
                    q81 c = q81.c(layoutInflater, viewGroup, z);
                    fe4 fe4Var2 = fe4.this;
                    sy4 sy4Var2 = sy4Var;
                    FragmentContainerView fragmentContainerView = c.b;
                    zq3.g(fragmentContainerView, "dailyfiveFragmentContainerView");
                    ((DailyFiveFragment) fragmentContainerView.getFragment()).q1(fe4Var2);
                    DailyFiveMainTabFactory.h(sy4Var2, (RecyclerView) fragmentContainerView.findViewById(ig6.dailyFiveFeedRv));
                    return c;
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
                }
            }, ModifierUtilsKt.b(androidx.compose.ui.input.nestedscroll.a.b(Modifier.a, fe4Var.e(), null, 2, null), g(sy4Var), new gt2() { // from class: com.nytimes.android.dailyfive.di.DailyFiveMainTabFactory$Content$3
                @Override // defpackage.gt2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Modifier invoke(Modifier modifier, RecyclerView recyclerView) {
                    zq3.h(modifier, "$this$ifNotNull");
                    zq3.h(recyclerView, "it");
                    return NestedScrollViewInteropKt.b(Modifier.a, recyclerView);
                }
            }), null, h, 0, 4);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.dailyfive.di.DailyFiveMainTabFactory$Content$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    DailyFiveMainTabFactory.this.a(fe4Var, composer2, gt6.a(i | 1));
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
        return this.d;
    }

    @Override // defpackage.de4
    public Object d(by0 by0Var) {
        Object collect = ((m81) this.a.get()).a(ParallelDownloadStrategy.FETCH_ALWAYS, null).collect(a.a, by0Var);
        return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
    }

    @Override // defpackage.de4
    public boolean e(Uri uri) {
        zq3.h(uri, "uri");
        return zq3.c(j(uri), "nytimes://reader/followFeed");
    }

    @Override // defpackage.de4
    public hf8 f() {
        return this.c;
    }

    @Override // defpackage.de4
    public boolean isEnabled() {
        return !this.b.G();
    }

    public String j(Uri uri) {
        return de4.a.a(this, uri);
    }
}
