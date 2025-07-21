package com.nytimes.android.features.home.ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.comscore.streaming.AdvertisementType;
import com.nytimes.android.messaging.subscriptionbanner.BarOneSubscribeBannerKt;
import com.nytimes.android.tabs.composable.MainTopAppBarKt;
import com.nytimes.android.utils.composeutils.ComposablePositionsKt;
import com.nytimes.android.utils.composeutils.LifecycleUtilsKt;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cs0;
import defpackage.et0;
import defpackage.fc1;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.m37;
import defpackage.o93;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.td4;
import defpackage.wh;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
final class HomeFragment$initToolbar$1 extends Lambda implements gt2 {
    final /* synthetic */ o93 $binding;
    final /* synthetic */ HomeFragment this$0;

    @fc1(c = "com.nytimes.android.features.home.ui.HomeFragment$initToolbar$1$1", f = "HomeFragment.kt", l = {275}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.features.home.ui.HomeFragment$initToolbar$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;
        final /* synthetic */ HomeFragment this$0;

        /* renamed from: com.nytimes.android.features.home.ui.HomeFragment$initToolbar$1$1$a */
        static final class a implements FlowCollector {
            final /* synthetic */ HomeFragment a;

            a(HomeFragment homeFragment) {
                this.a = homeFragment;
            }

            public final Object a(int i, by0 by0Var) {
                this.a.n0(true);
                return ww8.a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, by0 by0Var) {
                return a(((Number) obj).intValue(), by0Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HomeFragment homeFragment, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Flow c = this.this$0.u1().c();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (c.collect(aVar, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "com.nytimes.android.features.home.ui.HomeFragment$initToolbar$1$2", f = "HomeFragment.kt", l = {287}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.features.home.ui.HomeFragment$initToolbar$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ o93 $binding;
        final /* synthetic */ x08 $includeSubscribeBar$delegate;
        final /* synthetic */ float $subscribeBarHeight;
        final /* synthetic */ float $topSpace;
        int label;
        final /* synthetic */ HomeFragment this$0;

        @fc1(c = "com.nytimes.android.features.home.ui.HomeFragment$initToolbar$1$2$2", f = "HomeFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.nytimes.android.features.home.ui.HomeFragment$initToolbar$1$2$2, reason: invalid class name and collision with other inner class name */
        static final class C02852 extends SuspendLambda implements gt2 {
            final /* synthetic */ o93 $binding;
            /* synthetic */ int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02852(o93 o93Var, by0 by0Var) {
                super(2, by0Var);
                this.$binding = o93Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                C02852 c02852 = new C02852(this.$binding, by0Var);
                c02852.I$0 = ((Number) obj).intValue();
                return c02852;
            }

            public final Object invoke(int i, by0 by0Var) {
                return ((C02852) create(Integer.valueOf(i), by0Var)).invokeSuspend(ww8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.a.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                int i = this.I$0;
                SwipeRefreshLayout swipeRefreshLayout = this.$binding.f;
                zq3.g(swipeRefreshLayout, "webViewRefreshLayout");
                swipeRefreshLayout.setPadding(swipeRefreshLayout.getPaddingLeft(), i, swipeRefreshLayout.getPaddingRight(), swipeRefreshLayout.getPaddingBottom());
                return ww8.a;
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (by0) obj2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(HomeFragment homeFragment, float f, float f2, x08 x08Var, o93 o93Var, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = homeFragment;
            this.$subscribeBarHeight = f;
            this.$topSpace = f2;
            this.$includeSubscribeBar$delegate = x08Var;
            this.$binding = o93Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass2(this.this$0, this.$subscribeBarHeight, this.$topSpace, this.$includeSubscribeBar$delegate, this.$binding, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                final HomeFragment homeFragment = this.this$0;
                final float f = this.$subscribeBarHeight;
                final float f2 = this.$topSpace;
                final x08 x08Var = this.$includeSubscribeBar$delegate;
                Flow p = y.p(new qs2() { // from class: com.nytimes.android.features.home.ui.HomeFragment.initToolbar.1.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Integer mo865invoke() {
                        float g;
                        float f3;
                        if (HomeFragment$initToolbar$1.c(x08Var)) {
                            g = HomeFragment.this.u1().e().g() + f;
                            f3 = f2;
                        } else {
                            g = HomeFragment.this.u1().e().g();
                            f3 = f2;
                        }
                        return Integer.valueOf((int) (g - f3));
                    }
                });
                C02852 c02852 = new C02852(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(p, c02852, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeFragment$initToolbar$1(HomeFragment homeFragment, o93 o93Var) {
        super(2);
        this.this$0 = homeFragment;
        this.$binding = o93Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return ww8.a;
    }

    public final void invoke(Composer composer, int i) {
        HomeViewModel A1;
        if ((i & 11) == 2 && composer.i()) {
            composer.K();
            return;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1339950991, i, -1, "com.nytimes.android.features.home.ui.HomeFragment.initToolbar.<anonymous> (HomeFragment.kt:271)");
        }
        A1 = this.this$0.A1();
        x08 b = y.b(A1.j(), null, composer, 8, 1);
        ww8 ww8Var = ww8.a;
        py1.d(ww8Var, new AnonymousClass1(this.this$0, null), composer, 70);
        py1.d(ww8Var, new AnonymousClass2(this.this$0, ((fm1) composer.m(CompositionLocalsKt.e())).f1(bu1.g(55)), ((fm1) composer.m(CompositionLocalsKt.e())).f1(bu1.g(4)), b, this.$binding, null), composer, 70);
        ScrollObserver e = c(b) ? null : this.this$0.u1().e();
        final HomeFragment homeFragment = this.this$0;
        composer.z(733328855);
        Modifier.a aVar = Modifier.a;
        Alignment.a aVar2 = Alignment.a;
        rg4 g = BoxKt.g(aVar2.o(), false, composer, 0);
        composer.z(-1323940314);
        int a = cs0.a(composer, 0);
        et0 o = composer.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a2 = companion.a();
        it2 c = LayoutKt.c(aVar);
        if (composer.j() == null) {
            cs0.c();
        }
        composer.G();
        if (composer.f()) {
            composer.D(a2);
        } else {
            composer.p();
        }
        Composer a3 = Updater.a(composer);
        Updater.c(a3, g, companion.e());
        Updater.c(a3, o, companion.g());
        gt2 b2 = companion.b();
        if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
            a3.q(Integer.valueOf(a));
            a3.v(Integer.valueOf(a), b2);
        }
        c.invoke(ju7.a(ju7.b(composer)), composer, 0);
        composer.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        composer.z(-483455358);
        rg4 a4 = d.a(Arrangement.a.g(), aVar2.k(), composer, 0);
        composer.z(-1323940314);
        int a5 = cs0.a(composer, 0);
        et0 o2 = composer.o();
        qs2 a6 = companion.a();
        it2 c2 = LayoutKt.c(aVar);
        if (composer.j() == null) {
            cs0.c();
        }
        composer.G();
        if (composer.f()) {
            composer.D(a6);
        } else {
            composer.p();
        }
        Composer a7 = Updater.a(composer);
        Updater.c(a7, a4, companion.e());
        Updater.c(a7, o2, companion.g());
        gt2 b3 = companion.b();
        if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
            a7.q(Integer.valueOf(a5));
            a7.v(Integer.valueOf(a5), b3);
        }
        c2.invoke(ju7.a(ju7.b(composer)), composer, 0);
        composer.z(2058660585);
        ap0 ap0Var = ap0.a;
        MainTopAppBarKt.a(ComposableSingletons$HomeFragmentKt.a.a(), null, e, null, zr0.b(composer, -1849885308, true, new it2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$initToolbar$1$3$1$1
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
                    androidx.compose.runtime.b.S(-1849885308, i2, -1, "com.nytimes.android.features.home.ui.HomeFragment.initToolbar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:307)");
                }
                if (!HomeFragment.this.getFeatureFlagUtil().G()) {
                    final HomeFragment homeFragment2 = HomeFragment.this;
                    IconButtonKt.a(new qs2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$initToolbar$1$3$1$1.1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m407invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m407invoke() {
                            td4 t1 = HomeFragment.this.t1();
                            androidx.fragment.app.f requireActivity = HomeFragment.this.requireActivity();
                            zq3.g(requireActivity, "requireActivity(...)");
                            t1.f(requireActivity);
                            HomeFragment.this.p1().a();
                        }
                    }, ComposablePositionsKt.d(Modifier.a, "settingAccount", null, 2, null), false, null, ComposableSingletons$HomeFragmentKt.a.b(), composer2, 24576, 12);
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), 0L, 0L, 0.0f, composer, (ScrollObserver.g << 6) | 24582, AdvertisementType.BRANDED_AS_CONTENT);
        AnimatedVisibilityKt.d(ap0Var, c(b), null, null, null, null, zr0.b(composer, -113148859, true, new it2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$initToolbar$1$3$1$2

            @fc1(c = "com.nytimes.android.features.home.ui.HomeFragment$initToolbar$1$3$1$2$1", f = "HomeFragment.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.features.home.ui.HomeFragment$initToolbar$1$3$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                int label;
                final /* synthetic */ HomeFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(HomeFragment homeFragment, by0 by0Var) {
                    super(2, by0Var);
                    this.this$0 = homeFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.this$0, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.a.h();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    this.this$0.N1();
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((wh) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(wh whVar, Composer composer2, int i2) {
                zq3.h(whVar, "$this$AnimatedVisibility");
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-113148859, i2, -1, "com.nytimes.android.features.home.ui.HomeFragment.initToolbar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:326)");
                }
                LifecycleUtilsKt.a(ww8.a, new AnonymousClass1(HomeFragment.this, null), composer2, 70);
                final HomeFragment homeFragment2 = HomeFragment.this;
                BarOneSubscribeBannerKt.a(new qs2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$initToolbar$1$3$1$2.2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m408invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m408invoke() {
                        HomeFragment.this.K1();
                    }
                }, composer2, 0, 0);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), composer, 1572870, 30);
        composer.R();
        composer.t();
        composer.R();
        composer.R();
        composer.R();
        composer.t();
        composer.R();
        composer.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
    }
}
