package com.nytimes.android.features.you.youtab.composable.onboarding;

import androidx.activity.ComponentActivity;
import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.Modifier;
import com.nytimes.android.features.you.youtab.YouScreenViewModel;
import com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.by0;
import defpackage.cc7;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.py1;
import defpackage.qs2;
import defpackage.s5;
import defpackage.sp3;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes4.dex */
public abstract class OnboardingContentKt {
    public static final void a(final YouScreenViewModel youScreenViewModel, final sp3 sp3Var, Modifier modifier, Composer composer, final int i, final int i2) {
        zq3.h(youScreenViewModel, "viewModel");
        zq3.h(sp3Var, "allInterests");
        Composer h = composer.h(1293966875);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(1293966875, i, -1, "com.nytimes.android.features.you.youtab.composable.onboarding.OnBoardingContent (OnboardingContent.kt:22)");
        }
        ComponentActivity d = s5.d(h, 0);
        final SnackbarUtil a = d != null ? SnackbarUtil.Companion.a(d) : null;
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
        final CoroutineScope a2 = ((e) A).a();
        h.R();
        final SheetState n = ModalBottomSheet_androidKt.n(true, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$onBoardingBottomSheet$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(SheetValue sheetValue) {
                zq3.h(sheetValue, "it");
                return Boolean.valueOf(sheetValue != SheetValue.Hidden);
            }
        }, h, 54, 0);
        h.z(773894976);
        h.z(-492369756);
        Object A2 = h.A();
        if (A2 == aVar.a()) {
            e eVar2 = new e(py1.j(EmptyCoroutineContext.a, h));
            h.q(eVar2);
            A2 = eVar2;
        }
        h.R();
        CoroutineScope a3 = ((e) A2).a();
        h.R();
        InterestBottomSheetKt.b(new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$1

            @fc1(c = "com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$1$1", f = "OnboardingContent.kt", l = {32}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ SheetState $onBoardingBottomSheet;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SheetState sheetState, by0 by0Var) {
                    super(2, by0Var);
                    this.$onBoardingBottomSheet = sheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$onBoardingBottomSheet, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        SheetState sheetState = this.$onBoardingBottomSheet;
                        this.label = 1;
                        if (sheetState.k(this) == h) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m538invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m538invoke() {
                Job launch$default;
                launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(n, null), 3, null);
                final YouScreenViewModel youScreenViewModel2 = youScreenViewModel;
                launch$default.invokeOnCompletion(new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$1.2
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return ww8.a;
                    }

                    public final void invoke(Throwable th) {
                        YouScreenViewModel.this.f0();
                    }
                });
            }
        }, n, a3, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(List list) {
                zq3.h(list, "previewList");
                final YouScreenViewModel youScreenViewModel2 = YouScreenViewModel.this;
                final CoroutineScope coroutineScope = a2;
                final SheetState sheetState = n;
                final SnackbarUtil snackbarUtil = a;
                youScreenViewModel2.e1(list, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$2.1

                    @fc1(c = "com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$2$1$1", f = "OnboardingContent.kt", l = {58, LockFreeTaskQueueCore.FROZEN_SHIFT}, m = "invokeSuspend")
                    /* renamed from: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$2$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C03141 extends SuspendLambda implements gt2 {
                        final /* synthetic */ SheetState $onBoardingBottomSheet;
                        final /* synthetic */ SnackbarUtil $snackbarUtil;
                        final /* synthetic */ YouScreenViewModel $viewModel;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C03141(SheetState sheetState, SnackbarUtil snackbarUtil, YouScreenViewModel youScreenViewModel, by0 by0Var) {
                            super(2, by0Var);
                            this.$onBoardingBottomSheet = sheetState;
                            this.$snackbarUtil = snackbarUtil;
                            this.$viewModel = youScreenViewModel;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final by0 create(Object obj, by0 by0Var) {
                            return new C03141(this.$onBoardingBottomSheet, this.$snackbarUtil, this.$viewModel, by0Var);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object h = a.h();
                            int i = this.label;
                            if (i == 0) {
                                f.b(obj);
                                SheetState sheetState = this.$onBoardingBottomSheet;
                                this.label = 1;
                                if (sheetState.k(this) == h) {
                                    return h;
                                }
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    f.b(obj);
                                    YouScreenViewModel.a0(this.$viewModel, null, false, 3, null);
                                    return ww8.a;
                                }
                                f.b(obj);
                            }
                            SnackbarUtil snackbarUtil = this.$snackbarUtil;
                            if (snackbarUtil != null) {
                                SnackbarUtil.j(snackbarUtil, false, false, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt.OnBoardingContent.2.1.1.1
                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m540invoke() {
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m540invoke();
                                        return ww8.a;
                                    }
                                }, 3, null);
                            }
                            this.label = 2;
                            if (DelayKt.delay(500L, this) == h) {
                                return h;
                            }
                            YouScreenViewModel.a0(this.$viewModel, null, false, 3, null);
                            return ww8.a;
                        }

                        @Override // defpackage.gt2
                        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                            return ((C03141) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m539invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m539invoke() {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C03141(sheetState, snackbarUtil, youScreenViewModel2, null), 3, null);
                    }
                });
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((List) obj);
                return ww8.a;
            }
        }, sp3Var, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m541invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m541invoke() {
                YouScreenViewModel.this.N0();
            }
        }, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$4
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m542invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m542invoke() {
                YouScreenViewModel.this.O0();
            }
        }, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$5
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m543invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m543invoke() {
                YouScreenViewModel.this.K0();
            }
        }, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$6
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return ww8.a;
            }

            public final void invoke(int i3) {
                YouScreenViewModel.this.P0(i3);
            }
        }, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$7
            {
                super(2);
            }

            public final void b(int i3, String str) {
                zq3.h(str, "section");
                YouScreenViewModel.this.B0(i3, str);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b(((Number) obj).intValue(), (String) obj2);
                return ww8.a;
            }
        }, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$8
            {
                super(2);
            }

            public final void b(List list, List list2) {
                zq3.h(list, "ids");
                zq3.h(list2, "sections");
                YouScreenViewModel.this.M0(list, list2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((List) obj, (List) obj2);
                return ww8.a;
            }
        }, youScreenViewModel.F(), new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(List list) {
                zq3.h(list, "selectedId");
                YouScreenViewModel.this.k1(sp3Var, list);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((List) obj);
                return ww8.a;
            }
        }, modifier2, h, 33280, ((i << 3) & 7168) | 64, 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingContentKt$OnBoardingContent$10
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
                    OnboardingContentKt.a(YouScreenViewModel.this, sp3Var, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
