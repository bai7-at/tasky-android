package com.nytimes.android.features.you.youtab.composable;

import androidx.activity.ComponentActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.e;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.a;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.comscore.streaming.ContentType;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.designsystem.uicompose.composable.RefreshableContentKt;
import com.nytimes.android.features.you.youtab.YouScreenViewModel;
import com.nytimes.android.features.you.youtab.b;
import com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt;
import com.nytimes.android.features.you.youtab.composable.interests.InterestDisplayKt;
import com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt;
import com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt;
import com.nytimes.android.interests.OnboardingToolTipState;
import com.nytimes.android.saved.SaveHandler;
import com.nytimes.android.utils.composeutils.LifecycleUtilsKt;
import com.nytimes.android.utils.snackbar.LocalSnackbarKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dk3;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fc1;
import defpackage.g14;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kt2;
import defpackage.lp0;
import defpackage.om9;
import defpackage.p14;
import defpackage.pm9;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.s5;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.vy8;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yk6;
import defpackage.ym5;
import defpackage.yr0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public abstract class YouTabContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final YouScreenViewModel youScreenViewModel, final om9 om9Var, final SaveHandler saveHandler, Composer composer, final int i) {
        Composer h = composer.h(697221642);
        if (b.G()) {
            b.S(697221642, i, -1, "com.nytimes.android.features.you.youtab.composable.LoggedInContent (YouTabContent.kt:99)");
        }
        ComponentActivity d = s5.d(h, 0);
        f fVar = d instanceof f ? (f) d : null;
        h.z(1380719424);
        if (fVar != null && youScreenViewModel.D().w()) {
            py1.d(ww8.a, new YouTabContentKt$LoggedInContent$1(youScreenViewModel, fVar, null), h, 70);
        }
        h.R();
        final x08 b = y.b(youScreenViewModel.H(), null, h, 8, 1);
        final x08 b2 = y.b(youScreenViewModel.G(), null, h, 8, 1);
        h.z(773894976);
        h.z(-492369756);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            e eVar = new e(py1.j(EmptyCoroutineContext.a, h));
            h.q(eVar);
            A = eVar;
        }
        h.R();
        final CoroutineScope a = ((e) A).a();
        h.R();
        SnackbarUtil a2 = fVar != null ? SnackbarUtil.Companion.a(fVar) : null;
        h.z(1380719930);
        Object A2 = h.A();
        if (A2 == aVar.a()) {
            A2 = b0.e(Boolean.FALSE, null, 2, null);
            h.q(A2);
        }
        final sy4 sy4Var = (sy4) A2;
        h.R();
        final SheetState n = ModalBottomSheet_androidKt.n(true, null, h, 6, 2);
        h.z(1380720083);
        Object A3 = h.A();
        if (A3 == aVar.a()) {
            A3 = b0.e(Boolean.FALSE, null, 2, null);
            h.q(A3);
        }
        final sy4 sy4Var2 = (sy4) A3;
        h.R();
        final SheetState n2 = ModalBottomSheet_androidKt.n(true, null, h, 6, 2);
        final x08 b3 = y.b(youScreenViewModel.K(), null, h, 8, 1);
        final x08 b4 = y.b(youScreenViewModel.E(), null, h, 8, 1);
        final x08 b5 = y.b(youScreenViewModel.N(), null, h, 8, 1);
        final vy8 vy8Var = (vy8) h.m(CompositionLocalsKt.o());
        LifecycleUtilsKt.a(ww8.a, new YouTabContentKt$LoggedInContent$2(youScreenViewModel, null), h, 70);
        DownloadState downloadState = (DownloadState) b.getValue();
        ym5 e = PaddingKt.e(0.0f, bu1.g(100), 0.0f, 0.0f, 13, null);
        Modifier d2 = BackgroundKt.d(SizeKt.f(Modifier.a, 0.0f, 1, null), eb5.Companion.b(h, 8).b(), null, 2, null);
        qs2 qs2Var = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m457invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m457invoke() {
                YouScreenViewModel.this.Z((com.nytimes.android.features.you.youtab.b) ((DownloadState) b.getValue()).a(), true);
            }
        };
        yr0 b6 = zr0.b(h, -2074441482, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$4
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
                    b.S(-2074441482, i2, -1, "com.nytimes.android.features.you.youtab.composable.LoggedInContent.<anonymous> (YouTabContent.kt:129)");
                }
                SnackbarUtil snackbarUtil = (SnackbarUtil) composer2.m(LocalSnackbarKt.a());
                final YouScreenViewModel youScreenViewModel2 = YouScreenViewModel.this;
                final x08 x08Var = b;
                SnackbarUtil.j(snackbarUtil, false, true, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$4.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m458invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m458invoke() {
                        YouScreenViewModel.this.Z((com.nytimes.android.features.you.youtab.b) ((DownloadState) x08Var.getValue()).a(), true);
                    }
                }, 1, null);
                if (b.G()) {
                    b.R();
                }
            }
        });
        final f fVar2 = fVar;
        final SnackbarUtil snackbarUtil = a2;
        RefreshableContentKt.a(downloadState, qs2Var, d2, b6, null, null, true, 0.0f, null, e, 0L, 0L, null, false, false, zr0.b(h, 1824674665, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5

            @fc1(c = "com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$6", f = "YouTabContent.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$6, reason: invalid class name */
            static final class AnonymousClass6 extends SuspendLambda implements gt2 {
                final /* synthetic */ YouScreenViewModel $viewModel;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass6(YouScreenViewModel youScreenViewModel, by0 by0Var) {
                    super(2, by0Var);
                    this.$viewModel = youScreenViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass6(this.$viewModel, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    a.h();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                    if (this.$viewModel.V()) {
                        this.$viewModel.Y();
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass6) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(final com.nytimes.android.features.you.youtab.b bVar, Composer composer2, int i2) {
                int i3;
                boolean e2;
                boolean g;
                List l;
                zq3.h(bVar, "interestsUiState");
                if ((i2 & 14) == 0) {
                    i3 = i2 | (composer2.S(bVar) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i3 & 91) == 18 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(1824674665, i3, -1, "com.nytimes.android.features.you.youtab.composable.LoggedInContent.<anonymous> (YouTabContent.kt:141)");
                }
                composer2.z(-1253048209);
                e2 = YouTabContentKt.e(sy4Var);
                if (e2) {
                    if (YouScreenViewModel.this.V()) {
                        composer2.z(-1253048111);
                        b.a aVar2 = bVar instanceof b.a ? (b.a) bVar : null;
                        if (aVar2 == null || (l = aVar2.d()) == null) {
                            l = i.l();
                        }
                        final CoroutineScope coroutineScope = a;
                        final SheetState sheetState = n;
                        final sy4 sy4Var3 = sy4Var;
                        qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5.1

                            @fc1(c = "com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$1$1", f = "YouTabContent.kt", l = {148}, m = "invokeSuspend")
                            /* renamed from: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C02981 extends SuspendLambda implements gt2 {
                                final /* synthetic */ SheetState $reorderSheetState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C02981(SheetState sheetState, by0 by0Var) {
                                    super(2, by0Var);
                                    this.$reorderSheetState = sheetState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final by0 create(Object obj, by0 by0Var) {
                                    return new C02981(this.$reorderSheetState, by0Var);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object h = a.h();
                                    int i = this.label;
                                    if (i == 0) {
                                        kotlin.f.b(obj);
                                        SheetState sheetState = this.$reorderSheetState;
                                        this.label = 1;
                                        if (sheetState.k(this) == h) {
                                            return h;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.f.b(obj);
                                    }
                                    return ww8.a;
                                }

                                @Override // defpackage.gt2
                                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                                    return ((C02981) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m459invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m459invoke() {
                                Job launch$default;
                                launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C02981(sheetState, null), 3, null);
                                final SheetState sheetState2 = sheetState;
                                final sy4 sy4Var4 = sy4Var3;
                                launch$default.invokeOnCompletion(new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Throwable) obj);
                                        return ww8.a;
                                    }

                                    public final void invoke(Throwable th) {
                                        if (SheetState.this.l()) {
                                            return;
                                        }
                                        YouTabContentKt.f(sy4Var4, false);
                                    }
                                });
                            }
                        };
                        final YouScreenViewModel youScreenViewModel2 = YouScreenViewModel.this;
                        qs2 qs2Var3 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5.2
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m466invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m466invoke() {
                                YouScreenViewModel.this.S0();
                            }
                        };
                        final YouScreenViewModel youScreenViewModel3 = YouScreenViewModel.this;
                        qs2 qs2Var4 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5.3
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m467invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m467invoke() {
                                YouScreenViewModel.this.J0();
                            }
                        };
                        final YouScreenViewModel youScreenViewModel4 = YouScreenViewModel.this;
                        final SnackbarUtil snackbarUtil2 = snackbarUtil;
                        InterestBottomSheetKt.c(l, coroutineScope, qs2Var2, qs2Var3, qs2Var4, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(List list) {
                                zq3.h(list, "interestData");
                                YouScreenViewModel youScreenViewModel5 = YouScreenViewModel.this;
                                final SnackbarUtil snackbarUtil3 = snackbarUtil2;
                                youScreenViewModel5.l1(list, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.4.1
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m468invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m468invoke() {
                                        SnackbarUtil snackbarUtil4 = SnackbarUtil.this;
                                        if (snackbarUtil4 != null) {
                                            SnackbarUtil.j(snackbarUtil4, false, false, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.4.1.1
                                                /* renamed from: invoke, reason: collision with other method in class */
                                                public final void m469invoke() {
                                                }

                                                @Override // defpackage.qs2
                                                /* renamed from: invoke */
                                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                    m469invoke();
                                                    return ww8.a;
                                                }
                                            }, 3, null);
                                        }
                                    }
                                });
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((List) obj);
                                return ww8.a;
                            }
                        }, n, composer2, 72);
                        composer2.R();
                    } else {
                        composer2.z(-1253047146);
                        YouTabContentKt.f(sy4Var, false);
                        SnackbarUtil.j((SnackbarUtil) composer2.m(LocalSnackbarKt.a()), false, false, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5.5
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m470invoke() {
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m470invoke();
                                return ww8.a;
                            }
                        }, 3, null);
                        composer2.R();
                    }
                }
                composer2.R();
                composer2.z(-1253047009);
                g = YouTabContentKt.g(sy4Var2);
                if (g) {
                    py1.d(ww8.a, new AnonymousClass6(YouScreenViewModel.this, null), composer2, 70);
                    if (YouScreenViewModel.this.V()) {
                        composer2.z(-1253046779);
                        DownloadState downloadState2 = (DownloadState) b2.getValue();
                        final CoroutineScope coroutineScope2 = a;
                        final SheetState sheetState2 = n2;
                        final YouScreenViewModel youScreenViewModel5 = YouScreenViewModel.this;
                        final sy4 sy4Var4 = sy4Var2;
                        final x08 x08Var = b3;
                        qs2 qs2Var5 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5.7

                            @fc1(c = "com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$7$1", f = "YouTabContent.kt", l = {176}, m = "invokeSuspend")
                            /* renamed from: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$7$1, reason: invalid class name */
                            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                                final /* synthetic */ SheetState $addSheetState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(SheetState sheetState, by0 by0Var) {
                                    super(2, by0Var);
                                    this.$addSheetState = sheetState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final by0 create(Object obj, by0 by0Var) {
                                    return new AnonymousClass1(this.$addSheetState, by0Var);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object h = a.h();
                                    int i = this.label;
                                    if (i == 0) {
                                        kotlin.f.b(obj);
                                        SheetState sheetState = this.$addSheetState;
                                        this.label = 1;
                                        if (sheetState.k(this) == h) {
                                            return h;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.f.b(obj);
                                    }
                                    return ww8.a;
                                }

                                @Override // defpackage.gt2
                                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m471invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m471invoke() {
                                Job launch$default;
                                launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(sheetState2, null), 3, null);
                                final SheetState sheetState3 = sheetState2;
                                final YouScreenViewModel youScreenViewModel6 = youScreenViewModel5;
                                final sy4 sy4Var5 = sy4Var4;
                                final x08 x08Var2 = x08Var;
                                launch$default.invokeOnCompletion(new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.7.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Throwable) obj);
                                        return ww8.a;
                                    }

                                    public final void invoke(Throwable th) {
                                        OnboardingToolTipState b7;
                                        if (SheetState.this.l()) {
                                            return;
                                        }
                                        YouTabContentKt.h(sy4Var5, false);
                                        b7 = YouTabContentKt.b(x08Var2);
                                        if (b7 == OnboardingToolTipState.ADD) {
                                            youScreenViewModel6.j0(OnboardingToolTipState.COMPLETE);
                                        }
                                    }
                                });
                            }
                        };
                        final YouScreenViewModel youScreenViewModel6 = YouScreenViewModel.this;
                        final SnackbarUtil snackbarUtil3 = snackbarUtil;
                        ss2 ss2Var = new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5.8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(List list) {
                                zq3.h(list, "previewList");
                                YouScreenViewModel youScreenViewModel7 = YouScreenViewModel.this;
                                final SnackbarUtil snackbarUtil4 = snackbarUtil3;
                                youScreenViewModel7.w(list, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.8.1
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m472invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m472invoke() {
                                        SnackbarUtil snackbarUtil5 = SnackbarUtil.this;
                                        if (snackbarUtil5 != null) {
                                            SnackbarUtil.j(snackbarUtil5, false, false, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.8.1.1
                                                /* renamed from: invoke, reason: collision with other method in class */
                                                public final void m473invoke() {
                                                }

                                                @Override // defpackage.qs2
                                                /* renamed from: invoke */
                                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                    m473invoke();
                                                    return ww8.a;
                                                }
                                            }, 3, null);
                                        }
                                    }
                                });
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((List) obj);
                                return ww8.a;
                            }
                        };
                        final YouScreenViewModel youScreenViewModel7 = YouScreenViewModel.this;
                        qs2 qs2Var6 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5.9
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m474invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m474invoke() {
                                YouScreenViewModel.this.w0();
                            }
                        };
                        final YouScreenViewModel youScreenViewModel8 = YouScreenViewModel.this;
                        gt2 gt2Var = new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5.10
                            {
                                super(2);
                            }

                            public final void b(int i4, String str) {
                                zq3.h(str, "subtype");
                                YouScreenViewModel.this.T0(i4, str);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                b(((Number) obj).intValue(), (String) obj2);
                                return ww8.a;
                            }
                        };
                        final YouScreenViewModel youScreenViewModel9 = YouScreenViewModel.this;
                        gt2 gt2Var2 = new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5.11
                            {
                                super(2);
                            }

                            public final void b(int i4, String str) {
                                zq3.h(str, "subtype");
                                YouScreenViewModel.this.B0(i4, str);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                b(((Number) obj).intValue(), (String) obj2);
                                return ww8.a;
                            }
                        };
                        final YouScreenViewModel youScreenViewModel10 = YouScreenViewModel.this;
                        InterestBottomSheetKt.a(downloadState2, coroutineScope2, qs2Var5, ss2Var, qs2Var6, gt2Var, gt2Var2, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5.12
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m460invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m460invoke() {
                                YouScreenViewModel.this.I0();
                            }
                        }, n2, composer2, 72);
                        composer2.R();
                    } else {
                        composer2.z(-1253045024);
                        YouTabContentKt.h(sy4Var2, false);
                        SnackbarUtil.j((SnackbarUtil) composer2.m(LocalSnackbarKt.a()), false, false, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5.13
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m461invoke() {
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m461invoke();
                                return ww8.a;
                            }
                        }, 3, null);
                        composer2.R();
                    }
                }
                composer2.R();
                LazyListState b7 = om9Var.b();
                final om9 om9Var2 = om9Var;
                final x08 x08Var2 = b4;
                final x08 x08Var3 = b5;
                final f fVar3 = fVar2;
                final YouScreenViewModel youScreenViewModel11 = YouScreenViewModel.this;
                final CoroutineScope coroutineScope3 = a;
                final x08 x08Var4 = b;
                final x08 x08Var5 = b3;
                final sy4 sy4Var5 = sy4Var2;
                final SnackbarUtil snackbarUtil4 = snackbarUtil;
                final vy8 vy8Var2 = vy8Var;
                final SaveHandler saveHandler2 = saveHandler;
                final sy4 sy4Var6 = sy4Var;
                LazyDslKt.a(null, b7, null, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5.14
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LazyListScope) obj);
                        return ww8.a;
                    }

                    public final void invoke(LazyListScope lazyListScope) {
                        zq3.h(lazyListScope, "$this$LazyColumn");
                        final om9 om9Var3 = om9Var2;
                        final x08 x08Var6 = x08Var2;
                        final x08 x08Var7 = x08Var3;
                        final f fVar4 = fVar3;
                        final YouScreenViewModel youScreenViewModel12 = youScreenViewModel11;
                        final CoroutineScope coroutineScope4 = coroutineScope3;
                        LazyListScope.d(lazyListScope, null, null, zr0.c(1938425341, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.14.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            private static final float b(x08 x08Var8) {
                                return ((Number) x08Var8.getValue()).floatValue();
                            }

                            @Override // defpackage.it2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return ww8.a;
                            }

                            public final void invoke(h04 h04Var, Composer composer3, int i4) {
                                DownloadState c;
                                DownloadState d3;
                                zq3.h(h04Var, "$this$item");
                                if ((i4 & 81) == 16 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.S(1938425341, i4, -1, "com.nytimes.android.features.you.youtab.composable.LoggedInContent.<anonymous>.<anonymous>.<anonymous> (YouTabContent.kt:209)");
                                }
                                composer3.z(1096715658);
                                final om9 om9Var4 = om9.this;
                                Object A4 = composer3.A();
                                if (A4 == Composer.a.a()) {
                                    A4 = y.d(new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$14$1$alpha$2$1
                                        {
                                            super(0);
                                        }

                                        @Override // defpackage.qs2
                                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                                        public final Float mo865invoke() {
                                            Object obj;
                                            Iterator it2 = om9.this.b().x().k().iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    obj = null;
                                                    break;
                                                }
                                                obj = it2.next();
                                                if (((g14) obj).getIndex() == 0) {
                                                    break;
                                                }
                                            }
                                            g14 g14Var = (g14) obj;
                                            float b8 = g14Var != null ? p14.b(om9.this.b().x(), g14Var) : 0.0f;
                                            return Float.valueOf(b8 > 0.95f ? 1.0f : b8 / 2);
                                        }
                                    });
                                    composer3.q(A4);
                                }
                                composer3.R();
                                float b8 = b((x08) A4);
                                c = YouTabContentKt.c(x08Var6);
                                d3 = YouTabContentKt.d(x08Var7);
                                final f fVar5 = fVar4;
                                final YouScreenViewModel youScreenViewModel13 = youScreenViewModel12;
                                final CoroutineScope coroutineScope5 = coroutineScope4;
                                qs2 qs2Var7 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.14.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m462invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m462invoke() {
                                        f fVar6 = f.this;
                                        if (fVar6 != null) {
                                            youScreenViewModel13.q0(fVar6, coroutineScope5);
                                        }
                                    }
                                };
                                final f fVar6 = fVar4;
                                final YouScreenViewModel youScreenViewModel14 = youScreenViewModel12;
                                final CoroutineScope coroutineScope6 = coroutineScope4;
                                SavedAndHistoryViewKt.c(b8, c, d3, qs2Var7, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.14.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m463invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m463invoke() {
                                        f fVar7 = f.this;
                                        if (fVar7 != null) {
                                            youScreenViewModel14.p0(fVar7, coroutineScope6);
                                        }
                                    }
                                }, null, composer3, 576, 32);
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.R();
                                }
                            }
                        }), 3, null);
                        LazyListScope.c(lazyListScope, null, null, ComposableSingletons$YouTabContentKt.a.b(), 3, null);
                        com.nytimes.android.features.you.youtab.b bVar2 = com.nytimes.android.features.you.youtab.b.this;
                        if (zq3.c(bVar2, b.C0296b.a)) {
                            return;
                        }
                        if (bVar2 instanceof b.c) {
                            final YouScreenViewModel youScreenViewModel13 = youScreenViewModel11;
                            final x08 x08Var8 = x08Var4;
                            LazyListScope.d(lazyListScope, null, null, zr0.c(-1000434850, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.14.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // defpackage.it2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(h04 h04Var, Composer composer3, int i4) {
                                    zq3.h(h04Var, "$this$item");
                                    if ((i4 & 81) == 16 && composer3.i()) {
                                        composer3.K();
                                        return;
                                    }
                                    if (androidx.compose.runtime.b.G()) {
                                        androidx.compose.runtime.b.S(-1000434850, i4, -1, "com.nytimes.android.features.you.youtab.composable.LoggedInContent.<anonymous>.<anonymous>.<anonymous> (YouTabContent.kt:245)");
                                    }
                                    Modifier d3 = BackgroundKt.d(Modifier.a, eb5.Companion.b(composer3, 8).b(), null, 2, null);
                                    YouScreenViewModel youScreenViewModel14 = YouScreenViewModel.this;
                                    x08 x08Var9 = x08Var8;
                                    composer3.z(-483455358);
                                    rg4 a3 = d.a(Arrangement.a.g(), Alignment.a.k(), composer3, 0);
                                    composer3.z(-1323940314);
                                    int a4 = cs0.a(composer3, 0);
                                    et0 o = composer3.o();
                                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                                    qs2 a5 = companion.a();
                                    it2 c = LayoutKt.c(d3);
                                    if (composer3.j() == null) {
                                        cs0.c();
                                    }
                                    composer3.G();
                                    if (composer3.f()) {
                                        composer3.D(a5);
                                    } else {
                                        composer3.p();
                                    }
                                    Composer a6 = Updater.a(composer3);
                                    Updater.c(a6, a3, companion.e());
                                    Updater.c(a6, o, companion.g());
                                    gt2 b8 = companion.b();
                                    if (a6.f() || !zq3.c(a6.A(), Integer.valueOf(a4))) {
                                        a6.q(Integer.valueOf(a4));
                                        a6.v(Integer.valueOf(a4), b8);
                                    }
                                    c.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                                    composer3.z(2058660585);
                                    ap0 ap0Var = ap0.a;
                                    composer3.z(1096717494);
                                    if (youScreenViewModel14.g1()) {
                                        Object a7 = ((DownloadState) x08Var9.getValue()).a();
                                        b.c cVar = a7 instanceof b.c ? (b.c) a7 : null;
                                        if (cVar != null) {
                                            OnboardingContentKt.a(youScreenViewModel14, cVar.a(), null, composer3, 72, 4);
                                        }
                                    } else {
                                        YouScreenViewModel.a0(youScreenViewModel14, null, false, 3, null);
                                    }
                                    composer3.R();
                                    composer3.R();
                                    composer3.t();
                                    composer3.R();
                                    composer3.R();
                                    if (androidx.compose.runtime.b.G()) {
                                        androidx.compose.runtime.b.R();
                                    }
                                }
                            }), 3, null);
                            return;
                        }
                        if (bVar2 instanceof b.a) {
                            final f fVar5 = fVar3;
                            final YouScreenViewModel youScreenViewModel14 = youScreenViewModel11;
                            final om9 om9Var4 = om9Var2;
                            final com.nytimes.android.features.you.youtab.b bVar3 = com.nytimes.android.features.you.youtab.b.this;
                            final x08 x08Var9 = x08Var5;
                            final sy4 sy4Var7 = sy4Var5;
                            LazyListScope.d(lazyListScope, null, null, zr0.c(-2049806851, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.14.3

                                @fc1(c = "com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$14$3$1", f = "YouTabContent.kt", l = {274}, m = "invokeSuspend")
                                /* renamed from: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$14$3$1, reason: invalid class name */
                                static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                                    final /* synthetic */ f $activity;
                                    final /* synthetic */ com.nytimes.android.features.you.youtab.b $interestsUiState;
                                    final /* synthetic */ om9 $state;
                                    final /* synthetic */ YouScreenViewModel $viewModel;
                                    int label;

                                    @fc1(c = "com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$14$3$1$2", f = "YouTabContent.kt", l = {}, m = "invokeSuspend")
                                    /* renamed from: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$14$3$1$2, reason: invalid class name */
                                    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
                                        /* synthetic */ boolean Z$0;
                                        int label;

                                        AnonymousClass2(by0 by0Var) {
                                            super(2, by0Var);
                                        }

                                        public final Object b(boolean z, by0 by0Var) {
                                            return ((AnonymousClass2) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final by0 create(Object obj, by0 by0Var) {
                                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(by0Var);
                                            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                                            return anonymousClass2;
                                        }

                                        @Override // defpackage.gt2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            return b(((Boolean) obj).booleanValue(), (by0) obj2);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            a.h();
                                            if (this.label != 0) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.f.b(obj);
                                            return cc0.a(this.Z$0);
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(f fVar, YouScreenViewModel youScreenViewModel, om9 om9Var, com.nytimes.android.features.you.youtab.b bVar, by0 by0Var) {
                                        super(2, by0Var);
                                        this.$activity = fVar;
                                        this.$viewModel = youScreenViewModel;
                                        this.$state = om9Var;
                                        this.$interestsUiState = bVar;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final by0 create(Object obj, by0 by0Var) {
                                        return new AnonymousClass1(this.$activity, this.$viewModel, this.$state, this.$interestsUiState, by0Var);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object h = a.h();
                                        int i = this.label;
                                        if (i == 0) {
                                            kotlin.f.b(obj);
                                            final om9 om9Var = this.$state;
                                            final com.nytimes.android.features.you.youtab.b bVar = this.$interestsUiState;
                                            Flow p = y.p(new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.14.3.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // defpackage.qs2
                                                /* renamed from: invoke */
                                                public final Boolean mo865invoke() {
                                                    return Boolean.valueOf(p14.a(om9.this.b(), ((b.a) bVar).d().size()) >= 10);
                                                }
                                            });
                                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                                            this.label = 1;
                                            if (FlowKt.first(p, anonymousClass2, this) == h) {
                                                return h;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.f.b(obj);
                                        }
                                        FragmentManager supportFragmentManager = this.$activity.getSupportFragmentManager();
                                        zq3.g(supportFragmentManager, "getSupportFragmentManager(...)");
                                        this.$viewModel.J().c(supportFragmentManager);
                                        return ww8.a;
                                    }

                                    @Override // defpackage.gt2
                                    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                                        return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // defpackage.it2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(h04 h04Var, Composer composer3, int i4) {
                                    int i5;
                                    OnboardingToolTipState b8;
                                    zq3.h(h04Var, "$this$item");
                                    if ((i4 & 14) == 0) {
                                        i5 = (composer3.S(h04Var) ? 4 : 2) | i4;
                                    } else {
                                        i5 = i4;
                                    }
                                    if ((i5 & 91) == 18 && composer3.i()) {
                                        composer3.K();
                                        return;
                                    }
                                    if (androidx.compose.runtime.b.G()) {
                                        androidx.compose.runtime.b.S(-2049806851, i5, -1, "com.nytimes.android.features.you.youtab.composable.LoggedInContent.<anonymous>.<anonymous>.<anonymous> (YouTabContent.kt:265)");
                                    }
                                    composer3.z(1096718251);
                                    if (f.this != null && youScreenViewModel14.D().w() && !youScreenViewModel14.X(f.this)) {
                                        py1.d(ww8.a, new AnonymousClass1(f.this, youScreenViewModel14, om9Var4, bVar3, null), composer3, 70);
                                    }
                                    composer3.R();
                                    YouScreenViewModel youScreenViewModel15 = youScreenViewModel14;
                                    b8 = YouTabContentKt.b(x08Var9);
                                    final YouScreenViewModel youScreenViewModel16 = youScreenViewModel14;
                                    final sy4 sy4Var8 = sy4Var7;
                                    InterestsContentHeaderKt.a(h04Var, youScreenViewModel15, b8, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.14.3.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // defpackage.qs2
                                        /* renamed from: invoke */
                                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                                            m464invoke();
                                            return ww8.a;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m464invoke() {
                                            YouScreenViewModel.this.H0();
                                            YouTabContentKt.h(sy4Var8, true);
                                        }
                                    }, composer3, (i5 & 14) | 64);
                                    if (androidx.compose.runtime.b.G()) {
                                        androidx.compose.runtime.b.R();
                                    }
                                }
                            }), 3, null);
                            final com.nytimes.android.features.you.youtab.b bVar4 = com.nytimes.android.features.you.youtab.b.this;
                            LazyListScope.d(lazyListScope, null, null, zr0.c(-1624772876, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt.LoggedInContent.5.14.4
                                {
                                    super(3);
                                }

                                @Override // defpackage.it2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(h04 h04Var, Composer composer3, int i4) {
                                    androidx.compose.ui.text.a u;
                                    zq3.h(h04Var, "$this$item");
                                    if ((i4 & 81) == 16 && composer3.i()) {
                                        composer3.K();
                                        return;
                                    }
                                    if (androidx.compose.runtime.b.G()) {
                                        androidx.compose.runtime.b.S(-1624772876, i4, -1, "com.nytimes.android.features.you.youtab.composable.LoggedInContent.<anonymous>.<anonymous>.<anonymous> (YouTabContent.kt:290)");
                                    }
                                    if (((b.a) com.nytimes.android.features.you.youtab.b.this).d().isEmpty()) {
                                        String b8 = k48.b(yk6.interests_empty_title, composer3, 0);
                                        u = YouTabContentKt.u(k48.b(yk6.interests_empty_content, composer3, 0));
                                        EmptyContentKt.a(b8, u, lp0.a(), PaddingKt.k(SizeKt.f(Modifier.a, 0.0f, 1, null), bu1.g(20), 0.0f, 2, null), composer3, 3584, 0);
                                    }
                                    if (androidx.compose.runtime.b.G()) {
                                        androidx.compose.runtime.b.R();
                                    }
                                }
                            }), 3, null);
                            final List d3 = ((b.a) com.nytimes.android.features.you.youtab.b.this).d();
                            final YouScreenViewModel youScreenViewModel15 = youScreenViewModel11;
                            final SnackbarUtil snackbarUtil5 = snackbarUtil4;
                            final vy8 vy8Var3 = vy8Var2;
                            final SaveHandler saveHandler3 = saveHandler2;
                            final sy4 sy4Var8 = sy4Var6;
                            lazyListScope.b(d3.size(), null, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$14$invoke$$inlined$itemsIndexed$default$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // defpackage.ss2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke(((Number) obj).intValue());
                                }

                                public final Object invoke(int i4) {
                                    d3.get(i4);
                                    return null;
                                }
                            }, zr0.c(-1091073711, true, new kt2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$14$invoke$$inlined$itemsIndexed$default$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                @Override // defpackage.kt2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(h04 h04Var, int i4, Composer composer3, int i5) {
                                    int i6;
                                    if ((i5 & 14) == 0) {
                                        i6 = (composer3.S(h04Var) ? 4 : 2) | i5;
                                    } else {
                                        i6 = i5;
                                    }
                                    if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                                        i6 |= composer3.d(i4) ? 32 : 16;
                                    }
                                    if ((i6 & 731) == 146 && composer3.i()) {
                                        composer3.K();
                                        return;
                                    }
                                    if (androidx.compose.runtime.b.G()) {
                                        androidx.compose.runtime.b.S(-1091073711, i6, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                                    }
                                    final com.nytimes.android.interests.db.a aVar3 = (com.nytimes.android.interests.db.a) d3.get(i4);
                                    final YouScreenViewModel youScreenViewModel16 = youScreenViewModel15;
                                    final sy4 sy4Var9 = sy4Var8;
                                    InterestDisplayKt.a(h04Var, aVar3, youScreenViewModel16, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$5$14$5$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // defpackage.qs2
                                        /* renamed from: invoke */
                                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                                            m465invoke();
                                            return ww8.a;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m465invoke() {
                                            YouScreenViewModel.this.R0(aVar3.d(), aVar3.e());
                                            YouTabContentKt.f(sy4Var9, true);
                                        }
                                    }, snackbarUtil5, vy8Var3, saveHandler3, composer3, 262720 | (i6 & 14) | (SnackbarUtil.f << 12) | (SaveHandler.l << 18));
                                    if (androidx.compose.runtime.b.G()) {
                                        androidx.compose.runtime.b.R();
                                    }
                                }
                            }));
                        }
                    }
                }, composer2, 0, 253);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((com.nytimes.android.features.you.youtab.b) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), h, 806882312, 196608, 32176);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$LoggedInContent$6
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
                    YouTabContentKt.a(YouScreenViewModel.this, om9Var, saveHandler, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingToolTipState b(x08 x08Var) {
        return (OnboardingToolTipState) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadState c(x08 x08Var) {
        return (DownloadState) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadState d(x08 x08Var) {
        return (DownloadState) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    public static final void i(final om9 om9Var, final YouScreenViewModel youScreenViewModel, final SaveHandler saveHandler, Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        Composer composer2;
        zq3.h(om9Var, TransferTable.COLUMN_STATE);
        zq3.h(youScreenViewModel, "viewModel");
        zq3.h(saveHandler, "saveHandler");
        Composer h = composer.h(292120098);
        Modifier modifier3 = (i2 & 8) != 0 ? Modifier.a : modifier;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(292120098, i, -1, "com.nytimes.android.features.you.youtab.composable.YouTabContent (YouTabContent.kt:79)");
        }
        Modifier f = SizeKt.f(modifier3, 0.0f, 1, null);
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(f);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a3);
        } else {
            h.p();
        }
        Composer a4 = Updater.a(h);
        Updater.c(a4, a, companion.e());
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        int i3 = ((i << 3) & ContentType.LONG_FORM_ON_DEMAND) | 8;
        TabHeaderContentKt.c(youScreenViewModel, om9Var, null, h, i3, 4);
        if (j(y.b(youScreenViewModel.U(), null, h, 8, 1)) == null) {
            h.z(1339033888);
            modifier2 = modifier3;
            composer2 = h;
            LoggedOutContentKt.a(youScreenViewModel.R(), youScreenViewModel.C(), null, h, 72, 4);
            composer2.R();
        } else {
            modifier2 = modifier3;
            composer2 = h;
            composer2.z(1339034012);
            a(youScreenViewModel, om9Var, saveHandler, composer2, (SaveHandler.l << 6) | i3 | (i & 896));
            composer2.R();
        }
        composer2.R();
        composer2.t();
        composer2.R();
        composer2.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.YouTabContentKt$YouTabContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i4) {
                    YouTabContentKt.i(om9.this, youScreenViewModel, saveHandler, modifier2, composer3, gt6.a(i | 1), i2);
                }
            });
        }
    }

    private static final pm9 j(x08 x08Var) {
        return (pm9) x08Var.getValue();
    }

    public static final om9 t(LazyListState lazyListState, Composer composer, int i, int i2) {
        composer.z(-395459999);
        if ((i2 & 1) != 0) {
            lazyListState = LazyListStateKt.c(0, 0, composer, 0, 3);
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-395459999, i, -1, "com.nytimes.android.features.you.youtab.composable.rememberYouTabState (YouTabContent.kt:59)");
        }
        composer.z(2128241386);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = new om9(lazyListState);
            composer.q(A);
        }
        om9 om9Var = (om9) A;
        composer.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return om9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.a u(String str) {
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        List F0 = h.F0(str, new String[]{"^"}, false, 0, 6, null);
        c0064a.i((String) F0.get(0));
        dk3.a(c0064a, "addInterestIcon", "Add");
        c0064a.i((String) F0.get(1));
        return c0064a.o();
    }
}
