package com.nytimes.android.composable;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.d;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostKt;
import com.nytimes.android.MainActivity;
import com.nytimes.android.MainActivityKt;
import com.nytimes.android.MainViewModel;
import com.nytimes.android.deeplink.NytUriHandlerKt;
import com.nytimes.android.designsystem.uicompose.composable.NytScaffoldKt;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.mainactivity.MainBottomNavUi;
import com.nytimes.android.mainactivity.MainBottomNavViewModel;
import com.nytimes.android.utils.composeutils.ComposablePositionsKt;
import com.nytimes.android.utils.composeutils.LifecycleUtilsKt;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserverKt;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.de4;
import defpackage.et0;
import defpackage.fc1;
import defpackage.fe4;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.i83;
import defpackage.it2;
import defpackage.ju7;
import defpackage.ka7;
import defpackage.kt2;
import defpackage.m25;
import defpackage.n25;
import defpackage.pa9;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.s5;
import defpackage.s96;
import defpackage.sa9;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.t21;
import defpackage.ud4;
import defpackage.uh;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.yr0;
import defpackage.yr4;
import defpackage.z12;
import defpackage.zq3;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public abstract class MainActivityScreenKt {
    public static final void a(final MainBottomNavUi mainBottomNavUi, final s96 s96Var, final n25 n25Var, final qs2 qs2Var, final ss2 ss2Var, MainViewModel mainViewModel, MainBottomNavViewModel mainBottomNavViewModel, Composer composer, final int i, final int i2) {
        String str;
        MainViewModel mainViewModel2;
        int i3;
        int i4;
        int i5;
        MainBottomNavViewModel mainBottomNavViewModel2;
        zq3.h(mainBottomNavUi, "ui");
        zq3.h(s96Var, "purrUI");
        zq3.h(n25Var, "navController");
        zq3.h(qs2Var, "onNavigateToNextTab");
        zq3.h(ss2Var, "onNavigateToMainTab");
        Composer h = composer.h(-752529301);
        if ((i2 & 32) != 0) {
            h.z(1890788296);
            sa9 a = LocalViewModelStoreOwner.a.a(h, LocalViewModelStoreOwner.c);
            if (a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t.b a2 = i83.a(a, h, 0);
            h.z(1729797275);
            str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
            q c = pa9.c(MainViewModel.class, a, null, a2, a instanceof d ? ((d) a).getDefaultViewModelCreationExtras() : t21.a.b, h, 36936, 0);
            h.R();
            h.R();
            mainViewModel2 = (MainViewModel) c;
            i3 = i & (-458753);
        } else {
            str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
            mainViewModel2 = mainViewModel;
            i3 = i;
        }
        if ((i2 & 64) != 0) {
            h.z(1729797275);
            sa9 a3 = LocalViewModelStoreOwner.a.a(h, 6);
            if (a3 == null) {
                throw new IllegalStateException(str);
            }
            i4 = 6;
            q c2 = pa9.c(MainBottomNavViewModel.class, a3, null, null, a3 instanceof d ? ((d) a3).getDefaultViewModelCreationExtras() : t21.a.b, h, 36936, 0);
            h.R();
            int i6 = i3 & (-3670017);
            mainBottomNavViewModel2 = (MainBottomNavViewModel) c2;
            i5 = i6;
        } else {
            i4 = 6;
            i5 = i3;
            mainBottomNavViewModel2 = mainBottomNavViewModel;
        }
        if (b.G()) {
            b.S(-752529301, i5, -1, "com.nytimes.android.composable.MainActivityScreen (MainActivityScreen.kt:62)");
        }
        final MainBottomNavViewModel mainBottomNavViewModel3 = mainBottomNavViewModel2;
        final MainViewModel mainViewModel3 = mainViewModel2;
        NytUriHandlerKt.a(zr0.b(h, -349572424, true, new gt2() { // from class: com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i7) {
                if ((i7 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-349572424, i7, -1, "com.nytimes.android.composable.MainActivityScreen.<anonymous> (MainActivityScreen.kt:64)");
                }
                final MainBottomNavViewModel mainBottomNavViewModel4 = MainBottomNavViewModel.this;
                final MainViewModel mainViewModel4 = mainViewModel3;
                final s96 s96Var2 = s96Var;
                final MainBottomNavUi mainBottomNavUi2 = mainBottomNavUi;
                final n25 n25Var2 = n25Var;
                final qs2 qs2Var2 = qs2Var;
                final ss2 ss2Var2 = ss2Var;
                NytThemeKt.a(false, null, null, zr0.b(composer2, -969079000, true, new gt2() { // from class: com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1.1

                    @fc1(c = "com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$1", f = "MainActivityScreen.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C02451 extends SuspendLambda implements gt2 {
                        final /* synthetic */ MainViewModel $mainVm;
                        final /* synthetic */ ScrollObserver $rememberToolbarScroller;
                        final /* synthetic */ sy4 $tabRoute;
                        int label;

                        @fc1(c = "com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$1$1", f = "MainActivityScreen.kt", l = {86}, m = "invokeSuspend")
                        /* renamed from: com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C02461 extends SuspendLambda implements gt2 {
                            final /* synthetic */ MainViewModel $mainVm;
                            final /* synthetic */ ScrollObserver $rememberToolbarScroller;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C02461(MainViewModel mainViewModel, ScrollObserver scrollObserver, by0 by0Var) {
                                super(2, by0Var);
                                this.$mainVm = mainViewModel;
                                this.$rememberToolbarScroller = scrollObserver;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final by0 create(Object obj, by0 by0Var) {
                                return new C02461(this.$mainVm, this.$rememberToolbarScroller, by0Var);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object h = a.h();
                                int i = this.label;
                                if (i == 0) {
                                    f.b(obj);
                                    MainViewModel mainViewModel = this.$mainVm;
                                    ScrollObserver scrollObserver = this.$rememberToolbarScroller;
                                    this.label = 1;
                                    if (mainViewModel.n("MobileNewsHome", scrollObserver, this) == h) {
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
                                return ((C02461) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C02451(sy4 sy4Var, MainViewModel mainViewModel, ScrollObserver scrollObserver, by0 by0Var) {
                            super(2, by0Var);
                            this.$tabRoute = sy4Var;
                            this.$mainVm = mainViewModel;
                            this.$rememberToolbarScroller = scrollObserver;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final by0 create(Object obj, by0 by0Var) {
                            return new C02451(this.$tabRoute, this.$mainVm, this.$rememberToolbarScroller, by0Var);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            a.h();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            f.b(obj);
                            if (zq3.c(this.$tabRoute.getValue(), "topStories")) {
                                BuildersKt__Builders_commonKt.launch$default(r.a(this.$mainVm), null, null, new C02461(this.$mainVm, this.$rememberToolbarScroller, null), 3, null);
                            }
                            return ww8.a;
                        }

                        @Override // defpackage.gt2
                        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                            return ((C02451) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                        }
                    }

                    @fc1(c = "com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$2", f = "MainActivityScreen.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
                        final /* synthetic */ MainActivity $activity;
                        final /* synthetic */ MainBottomNavViewModel $bottomNavViewModel;
                        final /* synthetic */ ud4 $entryPoint;
                        final /* synthetic */ MainBottomNavUi $ui;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(MainBottomNavUi mainBottomNavUi, MainBottomNavViewModel mainBottomNavViewModel, ud4 ud4Var, MainActivity mainActivity, by0 by0Var) {
                            super(2, by0Var);
                            this.$ui = mainBottomNavUi;
                            this.$bottomNavViewModel = mainBottomNavViewModel;
                            this.$entryPoint = ud4Var;
                            this.$activity = mainActivity;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final by0 create(Object obj, by0 by0Var) {
                            return new AnonymousClass2(this.$ui, this.$bottomNavViewModel, this.$entryPoint, this.$activity, by0Var);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            a.h();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            f.b(obj);
                            this.$ui.j();
                            this.$bottomNavViewModel.i();
                            this.$entryPoint.e0().a(this.$activity);
                            return ww8.a;
                        }

                        @Override // defpackage.gt2
                        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                            return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                        }
                    }

                    @fc1(c = "com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$3", f = "MainActivityScreen.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$3, reason: invalid class name */
                    static final class AnonymousClass3 extends SuspendLambda implements gt2 {
                        final /* synthetic */ MainViewModel $mainVm;
                        /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass3(MainViewModel mainViewModel, by0 by0Var) {
                            super(2, by0Var);
                            this.$mainVm = mainViewModel;
                        }

                        @Override // defpackage.gt2
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(Map map, by0 by0Var) {
                            return ((AnonymousClass3) create(map, by0Var)).invokeSuspend(ww8.a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final by0 create(Object obj, by0 by0Var) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$mainVm, by0Var);
                            anonymousClass3.L$0 = obj;
                            return anonymousClass3;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            a.h();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            f.b(obj);
                            this.$mainVm.j().setValue((Map) this.L$0);
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

                    public final void invoke(Composer composer3, int i8) {
                        if ((i8 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-969079000, i8, -1, "com.nytimes.android.composable.MainActivityScreen.<anonymous>.<anonymous> (MainActivityScreen.kt:65)");
                        }
                        ComponentActivity d = s5.d(composer3, 0);
                        zq3.f(d, "null cannot be cast to non-null type com.nytimes.android.MainActivity");
                        MainActivity mainActivity = (MainActivity) d;
                        composer3.z(1396128245);
                        ComponentActivity d2 = s5.d(composer3, 0);
                        composer3.z(363804603);
                        Object A = composer3.A();
                        if (A == Composer.a.a()) {
                            try {
                                zq3.e(d2);
                                A = z12.a(d2, ud4.class);
                            } catch (Exception unused) {
                                A = null;
                            }
                            composer3.q(A);
                        }
                        composer3.R();
                        composer3.R();
                        final ud4 ud4Var = (ud4) A;
                        if (ud4Var == null) {
                            throw new IllegalStateException("Should not be possible.");
                        }
                        ka7 l = ScaffoldKt.l(null, null, composer3, 0, 3);
                        List j = MainBottomNavViewModel.this.j();
                        final ArrayList arrayList = new ArrayList(i.w(j, 10));
                        Iterator it2 = j.iterator();
                        while (it2.hasNext()) {
                            arrayList.add((de4) ((Pair) it2.next()).d());
                        }
                        Iterable iterable = (Iterable) y.b(MainBottomNavViewModel.this.k(), null, composer3, 8, 1).getValue();
                        final ArrayList arrayList2 = new ArrayList(i.w(iterable, 10));
                        Iterator it3 = iterable.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add((de4) ((Pair) it3.next()).d());
                        }
                        composer3.z(-1190274830);
                        Object A2 = composer3.A();
                        Composer.a aVar = Composer.a;
                        if (A2 == aVar.a()) {
                            A2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
                            composer3.q(A2);
                        }
                        final MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) A2;
                        composer3.R();
                        composer3.z(-1190274745);
                        Object A3 = composer3.A();
                        if (A3 == aVar.a()) {
                            A3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
                            composer3.q(A3);
                        }
                        final MutableSharedFlow mutableSharedFlow2 = (MutableSharedFlow) A3;
                        composer3.R();
                        composer3.z(-1190274678);
                        Object A4 = composer3.A();
                        if (A4 == aVar.a()) {
                            A4 = b0.e("topStories", null, 2, null);
                            composer3.q(A4);
                        }
                        final sy4 sy4Var = (sy4) A4;
                        composer3.R();
                        final ScrollObserver c3 = ScrollObserverKt.c(bu1.g(ud4Var.a().F() ? 39 : 60), bu1.g(20), composer3, 48, 0);
                        ww8 ww8Var = ww8.a;
                        LifecycleUtilsKt.a(ww8Var, new C02451(sy4Var, mainViewModel4, c3, null), composer3, 70);
                        py1.d(ww8Var, new AnonymousClass2(mainBottomNavUi2, MainBottomNavViewModel.this, ud4Var, mainActivity, null), composer3, 70);
                        ComposablePositionsKt.a(new AnonymousClass3(mainViewModel4, null), composer3, 8);
                        yr4 yr4Var = (yr4) mainViewModel4.l().getValue();
                        ComposableSingletons$MainActivityScreenKt composableSingletons$MainActivityScreenKt = ComposableSingletons$MainActivityScreenKt.a;
                        gt2 a4 = composableSingletons$MainActivityScreenKt.a();
                        final n25 n25Var3 = n25Var2;
                        final MainBottomNavUi mainBottomNavUi3 = mainBottomNavUi2;
                        final MainViewModel mainViewModel5 = mainViewModel4;
                        yr0 b = zr0.b(composer3, -759625674, true, new gt2() { // from class: com.nytimes.android.composable.MainActivityScreenKt.MainActivityScreen.1.1.4

                            @fc1(c = "com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$4$1", f = "MainActivityScreen.kt", l = {172}, m = "invokeSuspend")
                            /* renamed from: com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$4$1, reason: invalid class name and collision with other inner class name */
                            static final class C02471 extends SuspendLambda implements it2 {
                                final /* synthetic */ ud4 $entryPoint;
                                final /* synthetic */ MainViewModel $mainVm;
                                final /* synthetic */ n25 $navController;
                                final /* synthetic */ MutableSharedFlow<ww8> $navigateTodayDestinationFlow;
                                final /* synthetic */ ScrollObserver $rememberToolbarScroller;
                                final /* synthetic */ sy4 $tabRoute;
                                final /* synthetic */ MainBottomNavUi $ui;
                                private /* synthetic */ Object L$0;
                                /* synthetic */ Object L$1;
                                int label;

                                @fc1(c = "com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$4$1$1", f = "MainActivityScreen.kt", l = {174}, m = "invokeSuspend")
                                /* renamed from: com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$4$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C02481 extends SuspendLambda implements gt2 {
                                    final /* synthetic */ MainViewModel $mainVm;
                                    final /* synthetic */ ScrollObserver $rememberToolbarScroller;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C02481(MainViewModel mainViewModel, ScrollObserver scrollObserver, by0 by0Var) {
                                        super(2, by0Var);
                                        this.$mainVm = mainViewModel;
                                        this.$rememberToolbarScroller = scrollObserver;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final by0 create(Object obj, by0 by0Var) {
                                        return new C02481(this.$mainVm, this.$rememberToolbarScroller, by0Var);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object h = a.h();
                                        int i = this.label;
                                        if (i == 0) {
                                            f.b(obj);
                                            MainViewModel mainViewModel = this.$mainVm;
                                            ScrollObserver scrollObserver = this.$rememberToolbarScroller;
                                            this.label = 1;
                                            if (mainViewModel.n("MobileNewsHome", scrollObserver, this) == h) {
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
                                        return ((C02481) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C02471(MainBottomNavUi mainBottomNavUi, sy4 sy4Var, ud4 ud4Var, MainViewModel mainViewModel, MutableSharedFlow mutableSharedFlow, n25 n25Var, ScrollObserver scrollObserver, by0 by0Var) {
                                    super(3, by0Var);
                                    this.$ui = mainBottomNavUi;
                                    this.$tabRoute = sy4Var;
                                    this.$entryPoint = ud4Var;
                                    this.$mainVm = mainViewModel;
                                    this.$navigateTodayDestinationFlow = mutableSharedFlow;
                                    this.$navController = n25Var;
                                    this.$rememberToolbarScroller = scrollObserver;
                                }

                                @Override // defpackage.it2
                                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                                public final Object invoke(Context context, de4 de4Var, by0 by0Var) {
                                    C02471 c02471 = new C02471(this.$ui, this.$tabRoute, this.$entryPoint, this.$mainVm, this.$navigateTodayDestinationFlow, this.$navController, this.$rememberToolbarScroller, by0Var);
                                    c02471.L$0 = context;
                                    c02471.L$1 = de4Var;
                                    return c02471.invokeSuspend(ww8.a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Context context;
                                    de4 de4Var;
                                    de4 de4Var2;
                                    Object h = a.h();
                                    int i = this.label;
                                    if (i == 0) {
                                        f.b(obj);
                                        context = (Context) this.L$0;
                                        de4Var = (de4) this.L$1;
                                        de4 i2 = this.$ui.i();
                                        this.$tabRoute.setValue(de4Var.f().c());
                                        if (i2 != null) {
                                            this.$entryPoint.i0().c(de4Var, i2.c());
                                            if (zq3.c(i2.f().c(), "you") && !zq3.c(this.$tabRoute.getValue(), "you")) {
                                                this.$mainVm.m();
                                            }
                                        }
                                        if (zq3.c(de4Var.f().c(), "play")) {
                                            this.$entryPoint.d().n();
                                            this.$entryPoint.d().m("Play Tab");
                                        }
                                        if (zq3.c(de4Var.f().c(), "topStories") || zq3.c(de4Var.f().c(), "ribbon")) {
                                            MutableSharedFlow<ww8> mutableSharedFlow = this.$navigateTodayDestinationFlow;
                                            ww8 ww8Var = ww8.a;
                                            this.L$0 = context;
                                            this.L$1 = de4Var;
                                            this.label = 1;
                                            if (mutableSharedFlow.emit(ww8Var, this) == h) {
                                                return h;
                                            }
                                            de4Var2 = de4Var;
                                        }
                                        this.$entryPoint.d0().b(context.getString(de4Var.f().e()), context.getString(de4Var.f().e()));
                                        MainActivityKt.a(this.$navController, de4Var);
                                        return ww8.a;
                                    }
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    de4Var2 = (de4) this.L$1;
                                    context = (Context) this.L$0;
                                    f.b(obj);
                                    BuildersKt__Builders_commonKt.launch$default(r.a(this.$mainVm), null, null, new C02481(this.$mainVm, this.$rememberToolbarScroller, null), 3, null);
                                    de4Var = de4Var2;
                                    this.$entryPoint.d0().b(context.getString(de4Var.f().e()), context.getString(de4Var.f().e()));
                                    MainActivityKt.a(this.$navController, de4Var);
                                    return ww8.a;
                                }
                            }

                            @fc1(c = "com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$4$2", f = "MainActivityScreen.kt", l = {193}, m = "invokeSuspend")
                            /* renamed from: com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$4$2, reason: invalid class name */
                            static final class AnonymousClass2 extends SuspendLambda implements it2 {
                                final /* synthetic */ ud4 $entryPoint;
                                final /* synthetic */ MutableSharedFlow<Integer> $scrollToTopEvents;
                                /* synthetic */ Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass2(ud4 ud4Var, MutableSharedFlow mutableSharedFlow, by0 by0Var) {
                                    super(3, by0Var);
                                    this.$entryPoint = ud4Var;
                                    this.$scrollToTopEvents = mutableSharedFlow;
                                }

                                @Override // defpackage.it2
                                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                                public final Object invoke(Context context, de4 de4Var, by0 by0Var) {
                                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$entryPoint, this.$scrollToTopEvents, by0Var);
                                    anonymousClass2.L$0 = de4Var;
                                    return anonymousClass2.invokeSuspend(ww8.a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object h = a.h();
                                    int i = this.label;
                                    if (i == 0) {
                                        f.b(obj);
                                        this.$entryPoint.i0().b(((de4) this.L$0).c());
                                        MutableSharedFlow<Integer> mutableSharedFlow = this.$scrollToTopEvents;
                                        Integer c = cc0.c(0);
                                        this.label = 1;
                                        if (mutableSharedFlow.emit(c, this) == h) {
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

                            public final void invoke(Composer composer4, int i9) {
                                if ((i9 & 11) == 2 && composer4.i()) {
                                    composer4.K();
                                    return;
                                }
                                if (b.G()) {
                                    b.S(-759625674, i9, -1, "com.nytimes.android.composable.MainActivityScreen.<anonymous>.<anonymous>.<anonymous> (MainActivityScreen.kt:138)");
                                }
                                List<de4> list = arrayList2;
                                n25 n25Var4 = n25Var3;
                                C02471 c02471 = new C02471(mainBottomNavUi3, sy4Var, ud4Var, mainViewModel5, mutableSharedFlow2, n25Var4, c3, null);
                                AnonymousClass2 anonymousClass2 = new AnonymousClass2(ud4Var, mutableSharedFlow, null);
                                final ud4 ud4Var2 = ud4Var;
                                MainBottomNavigationKt.a(list, n25Var4, c02471, anonymousClass2, new ss2() { // from class: com.nytimes.android.composable.MainActivityScreenKt.MainActivityScreen.1.1.4.3
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((String) obj);
                                        return ww8.a;
                                    }

                                    public final void invoke(String str2) {
                                        zq3.h(str2, "it");
                                        ud4.this.i0().d(str2);
                                    }
                                }, composer4, 4680);
                                if (b.G()) {
                                    b.R();
                                }
                            }
                        });
                        gt2 b2 = composableSingletons$MainActivityScreenKt.b();
                        final n25 n25Var4 = n25Var2;
                        final qs2 qs2Var3 = qs2Var2;
                        final MainBottomNavUi mainBottomNavUi4 = mainBottomNavUi2;
                        final ss2 ss2Var3 = ss2Var2;
                        NytScaffoldKt.a(l, a4, b, 0.0f, b2, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, yr4Var, null, zr0.b(composer3, -1309563513, true, new it2() { // from class: com.nytimes.android.composable.MainActivityScreenKt.MainActivityScreen.1.1.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // defpackage.it2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return ww8.a;
                            }

                            public final void invoke(ym5 ym5Var, Composer composer4, int i9) {
                                zq3.h(ym5Var, "it");
                                if ((i9 & 81) == 16 && composer4.i()) {
                                    composer4.K();
                                    return;
                                }
                                if (b.G()) {
                                    b.S(-1309563513, i9, -1, "com.nytimes.android.composable.MainActivityScreen.<anonymous>.<anonymous>.<anonymous> (MainActivityScreen.kt:104)");
                                }
                                n25 n25Var5 = n25.this;
                                String c4 = ((de4) i.k0(arrayList2)).f().c();
                                Modifier m = PaddingKt.m(Modifier.a, 0.0f, 0.0f, 0.0f, bu1.g(54), 7, null);
                                final List<de4> list = arrayList;
                                final MainBottomNavUi mainBottomNavUi5 = mainBottomNavUi4;
                                final n25 n25Var6 = n25.this;
                                final MutableSharedFlow<Integer> mutableSharedFlow3 = mutableSharedFlow;
                                final ScrollObserver scrollObserver = c3;
                                final ss2 ss2Var4 = ss2Var3;
                                final MutableSharedFlow<ww8> mutableSharedFlow4 = mutableSharedFlow2;
                                NavHostKt.b(n25Var5, c4, m, null, null, null, null, null, null, new ss2() { // from class: com.nytimes.android.composable.MainActivityScreenKt.MainActivityScreen.1.1.5.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((m25) obj);
                                        return ww8.a;
                                    }

                                    public final void invoke(m25 m25Var) {
                                        zq3.h(m25Var, "$this$NavHost");
                                        List<de4> list2 = list;
                                        final MainBottomNavUi mainBottomNavUi6 = mainBottomNavUi5;
                                        final n25 n25Var7 = n25Var6;
                                        MutableSharedFlow<Integer> mutableSharedFlow5 = mutableSharedFlow3;
                                        ScrollObserver scrollObserver2 = scrollObserver;
                                        ss2 ss2Var5 = ss2Var4;
                                        final MutableSharedFlow<ww8> mutableSharedFlow6 = mutableSharedFlow4;
                                        for (Iterator it4 = list2.iterator(); it4.hasNext(); it4 = it4) {
                                            final de4 de4Var = (de4) it4.next();
                                            final MutableSharedFlow<Integer> mutableSharedFlow7 = mutableSharedFlow5;
                                            final ScrollObserver scrollObserver3 = scrollObserver2;
                                            final ss2 ss2Var6 = ss2Var5;
                                            NavGraphBuilderKt.c(m25Var, de4Var.f().c(), null, null, null, null, null, null, zr0.c(1799795462, true, new kt2() { // from class: com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$1$1$5$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(4);
                                                }

                                                @Override // defpackage.kt2
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                    invoke((uh) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                                                    return ww8.a;
                                                }

                                                public final void invoke(uh uhVar, NavBackStackEntry navBackStackEntry, Composer composer5, int i10) {
                                                    zq3.h(uhVar, "$this$composable");
                                                    zq3.h(navBackStackEntry, "navBackStackEntry");
                                                    if (b.G()) {
                                                        b.S(1799795462, i10, -1, "com.nytimes.android.composable.MainActivityScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivityScreen.kt:111)");
                                                    }
                                                    MainBottomNavUi.this.l(de4Var);
                                                    Modifier f = SizeKt.f(Modifier.a, 0.0f, 1, null);
                                                    de4 de4Var2 = de4Var;
                                                    n25 n25Var8 = n25Var7;
                                                    MutableSharedFlow<Integer> mutableSharedFlow8 = mutableSharedFlow7;
                                                    ScrollObserver scrollObserver4 = scrollObserver3;
                                                    ss2 ss2Var7 = ss2Var6;
                                                    MutableSharedFlow<ww8> mutableSharedFlow9 = mutableSharedFlow6;
                                                    composer5.z(733328855);
                                                    rg4 g = BoxKt.g(Alignment.a.o(), false, composer5, 0);
                                                    composer5.z(-1323940314);
                                                    int a5 = cs0.a(composer5, 0);
                                                    et0 o = composer5.o();
                                                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                                                    qs2 a6 = companion.a();
                                                    it2 c5 = LayoutKt.c(f);
                                                    if (composer5.j() == null) {
                                                        cs0.c();
                                                    }
                                                    composer5.G();
                                                    if (composer5.f()) {
                                                        composer5.D(a6);
                                                    } else {
                                                        composer5.p();
                                                    }
                                                    Composer a7 = Updater.a(composer5);
                                                    Updater.c(a7, g, companion.e());
                                                    Updater.c(a7, o, companion.g());
                                                    gt2 b3 = companion.b();
                                                    if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                                                        a7.q(Integer.valueOf(a5));
                                                        a7.v(Integer.valueOf(a5), b3);
                                                    }
                                                    c5.invoke(ju7.a(ju7.b(composer5)), composer5, 0);
                                                    composer5.z(2058660585);
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                                                    de4Var2.a(new fe4(de4Var2, navBackStackEntry, n25Var8, mutableSharedFlow8, scrollObserver4, ss2Var7, mutableSharedFlow9), composer5, fe4.h | 64);
                                                    composer5.R();
                                                    composer5.t();
                                                    composer5.R();
                                                    composer5.R();
                                                    if (b.G()) {
                                                        b.R();
                                                    }
                                                }
                                            }), WebSocketProtocol.PAYLOAD_SHORT, null);
                                            scrollObserver2 = scrollObserver2;
                                            ss2Var5 = ss2Var5;
                                            mutableSharedFlow5 = mutableSharedFlow5;
                                        }
                                    }
                                }, composer4, 392, 504);
                                ww8 ww8Var2 = ww8.a;
                                composer4.z(-374455310);
                                boolean S = composer4.S(qs2Var3);
                                qs2 qs2Var4 = qs2Var3;
                                Object A5 = composer4.A();
                                if (S || A5 == Composer.a.a()) {
                                    A5 = new MainActivityScreenKt$MainActivityScreen$1$1$5$2$1(qs2Var4, null);
                                    composer4.q(A5);
                                }
                                composer4.R();
                                py1.d(ww8Var2, (gt2) A5, composer4, 70);
                                if (b.G()) {
                                    b.R();
                                }
                            }
                        }), composer3, 25008, 134217728, 6, 786408);
                        s96Var2.d(Modifier.a, new ss2() { // from class: com.nytimes.android.composable.MainActivityScreenKt.MainActivityScreen.1.1.6
                            public final void invoke(boolean z) {
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke(((Boolean) obj).booleanValue());
                                return ww8.a;
                            }
                        }, composer3, 566);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 3072, 7);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, i4);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final MainViewModel mainViewModel4 = mainViewModel2;
            final MainBottomNavViewModel mainBottomNavViewModel4 = mainBottomNavViewModel2;
            k.a(new gt2() { // from class: com.nytimes.android.composable.MainActivityScreenKt$MainActivityScreen$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    MainActivityScreenKt.a(MainBottomNavUi.this, s96Var, n25Var, qs2Var, ss2Var, mainViewModel4, mainBottomNavViewModel4, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
