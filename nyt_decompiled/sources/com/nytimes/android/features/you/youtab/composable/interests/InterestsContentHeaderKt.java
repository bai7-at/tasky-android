package com.nytimes.android.features.you.youtab.composable.interests;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.nytimes.android.features.you.youtab.SortOrder;
import com.nytimes.android.features.you.youtab.YouScreenViewModel;
import com.nytimes.android.features.you.youtab.composable.InterestSortingOrderKt;
import com.nytimes.android.features.you.youtab.composable.onboarding.ToolTipsKt;
import com.nytimes.android.interests.OnboardingToolTipState;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.compose.BalloonKt;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d37;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.j40;
import defpackage.ju7;
import defpackage.k48;
import defpackage.m37;
import defpackage.n37;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class InterestsContentHeaderKt {
    public static final void a(final h04 h04Var, final YouScreenViewModel youScreenViewModel, final OnboardingToolTipState onboardingToolTipState, final qs2 qs2Var, Composer composer, final int i) {
        final sy4 sy4Var;
        zq3.h(h04Var, "<this>");
        zq3.h(youScreenViewModel, "viewModel");
        zq3.h(onboardingToolTipState, "toolTipState");
        zq3.h(qs2Var, "onAddInterestButtonClick");
        Composer h = composer.h(1320815562);
        if (b.G()) {
            b.S(1320815562, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeader (InterestsContentHeader.kt:42)");
        }
        Modifier.a aVar = Modifier.a;
        float f = 16;
        Modifier m = PaddingKt.m(PaddingKt.k(aVar, bu1.g(20), 0.0f, 2, null), 0.0f, bu1.g(f), 0.0f, 0.0f, 13, null);
        h.z(693286680);
        Arrangement.e f2 = Arrangement.a.f();
        Alignment.a aVar2 = Alignment.a;
        rg4 a = m.a(f2, aVar2.l(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(m);
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
        n37 n37Var = n37.a;
        h.z(286997534);
        Object A = h.A();
        Composer.a aVar3 = Composer.a;
        if (A == aVar3.a()) {
            A = b0.e(null, null, 2, null);
            h.q(A);
        }
        sy4 sy4Var2 = (sy4) A;
        h.R();
        InterestSortingOrderKt.a(youScreenViewModel.Q(), new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$1
            {
                super(1);
            }

            public final void b(SortOrder sortOrder) {
                zq3.h(sortOrder, "it");
                YouScreenViewModel.this.Y0(sortOrder);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((SortOrder) obj);
                return ww8.a;
            }
        }, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$2
            {
                super(1);
            }

            public final void b(SortOrder sortOrder) {
                zq3.h(sortOrder, "it");
                YouScreenViewModel.this.Z0(sortOrder);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((SortOrder) obj);
                return ww8.a;
            }
        }, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$3
            {
                super(2);
            }

            public final void b(SortOrder sortOrder, SortOrder sortOrder2) {
                zq3.h(sortOrder, "currentSortOrder");
                zq3.h(sortOrder2, "newSortOrder");
                YouScreenViewModel.this.o1(sortOrder, sortOrder2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((SortOrder) obj, (SortOrder) obj2);
                return ww8.a;
            }
        }, n37Var.c(aVar, aVar2.i()), h, 8, 0);
        SpacerKt.a(m37.b(n37Var, aVar, 1.0f, false, 2, null), h, 0);
        Balloon.a b2 = ToolTipsKt.b(h, 0);
        h.z(286998288);
        Object A2 = h.A();
        if (A2 == aVar3.a()) {
            sy4Var = sy4Var2;
            A2 = new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$4$1
                {
                    super(1);
                }

                public final void b(j40 j40Var) {
                    zq3.h(j40Var, "it");
                    InterestsContentHeaderKt.c(sy4.this, j40Var);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((j40) obj);
                    return ww8.a;
                }
            };
            h.q(A2);
        } else {
            sy4Var = sy4Var2;
        }
        h.R();
        BalloonKt.a(null, b2, null, null, (ss2) A2, zr0.b(h, -627720371, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$5

            @fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$5$1", f = "InterestsContentHeader.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ OnboardingToolTipState $toolTipState;
                final /* synthetic */ YouScreenViewModel $viewModel;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OnboardingToolTipState onboardingToolTipState, YouScreenViewModel youScreenViewModel, by0 by0Var) {
                    super(2, by0Var);
                    this.$toolTipState = onboardingToolTipState;
                    this.$viewModel = youScreenViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$toolTipState, this.$viewModel, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    a.h();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    if (this.$toolTipState == OnboardingToolTipState.ADD) {
                        this.$viewModel.L0();
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
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i2) {
                String b3;
                if ((i2 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-627720371, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeader.<anonymous>.<anonymous> (InterestsContentHeader.kt:68)");
                }
                py1.d(ww8.a, new AnonymousClass1(onboardingToolTipState, YouScreenViewModel.this, null), composer2, 70);
                composer2.z(-1233036526);
                String b4 = YouScreenViewModel.this.q1() ? null : k48.b(yk6.add_tooltip_skip_version_title, composer2, 0);
                composer2.R();
                if (YouScreenViewModel.this.q1()) {
                    composer2.z(-1233036223);
                    b3 = k48.b(yk6.add_tooltip_description, composer2, 0);
                    composer2.R();
                } else {
                    composer2.z(-1233036121);
                    b3 = k48.b(yk6.add_tooltip_skip_version_description, composer2, 0);
                    composer2.R();
                }
                String str = b3;
                final YouScreenViewModel youScreenViewModel2 = YouScreenViewModel.this;
                ToolTipsKt.a(b4, str, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$5.2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m510invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m510invoke() {
                        YouScreenViewModel.this.j0(OnboardingToolTipState.COMPLETE);
                    }
                }, ModifierUtilsKt.d(Modifier.a, "popup_container"), composer2, 0, 0);
                if (b.G()) {
                    b.R();
                }
            }
        }), zr0.b(h, -1711518347, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$6

            @fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$6$2", f = "InterestsContentHeader.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$1$6$2, reason: invalid class name */
            static final class AnonymousClass2 extends SuspendLambda implements gt2 {
                final /* synthetic */ sy4 $addTooltipBalloonWindow$delegate;
                final /* synthetic */ YouScreenViewModel $viewModel;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(sy4 sy4Var, YouScreenViewModel youScreenViewModel, by0 by0Var) {
                    super(2, by0Var);
                    this.$addTooltipBalloonWindow$delegate = sy4Var;
                    this.$viewModel = youScreenViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass2(this.$addTooltipBalloonWindow$delegate, this.$viewModel, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    j40 b;
                    a.h();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    b = InterestsContentHeaderKt.b(this.$addTooltipBalloonWindow$delegate);
                    if (b != null) {
                        final YouScreenViewModel youScreenViewModel = this.$viewModel;
                        b.setOnBalloonOverlayClickListener(new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt.InterestsContentHeader.1.6.2.1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m511invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m511invoke() {
                                YouScreenViewModel.this.j0(OnboardingToolTipState.COMPLETE);
                            }
                        });
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(j40 j40Var, Composer composer2, int i2) {
                zq3.h(j40Var, "it");
                if ((i2 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1711518347, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeader.<anonymous>.<anonymous> (InterestsContentHeader.kt:90)");
                }
                OnboardingToolTipState onboardingToolTipState2 = OnboardingToolTipState.this;
                composer2.z(-1233035772);
                boolean S = composer2.S(OnboardingToolTipState.this);
                OnboardingToolTipState onboardingToolTipState3 = OnboardingToolTipState.this;
                sy4 sy4Var3 = sy4Var;
                Object A3 = composer2.A();
                if (S || A3 == Composer.a.a()) {
                    A3 = new InterestsContentHeaderKt$InterestsContentHeader$1$6$1$1(onboardingToolTipState3, sy4Var3, null);
                    composer2.q(A3);
                }
                composer2.R();
                py1.d(onboardingToolTipState2, (gt2) A3, composer2, 64);
                py1.d(ww8.a, new AnonymousClass2(sy4Var, youScreenViewModel, null), composer2, 70);
                qs2 qs2Var2 = qs2Var;
                composer2.z(693286680);
                Modifier.a aVar4 = Modifier.a;
                rg4 a5 = m.a(Arrangement.a.f(), Alignment.a.l(), composer2, 0);
                composer2.z(-1323940314);
                int a6 = cs0.a(composer2, 0);
                et0 o2 = composer2.o();
                ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                qs2 a7 = companion2.a();
                it2 c2 = LayoutKt.c(aVar4);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a7);
                } else {
                    composer2.p();
                }
                Composer a8 = Updater.a(composer2);
                Updater.c(a8, a5, companion2.e());
                Updater.c(a8, o2, companion2.g());
                gt2 b3 = companion2.b();
                if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                    a8.q(Integer.valueOf(a6));
                    a8.v(Integer.valueOf(a6), b3);
                }
                c2.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                n37 n37Var2 = n37.a;
                eb5.a aVar5 = eb5.Companion;
                float f3 = 100;
                IconButtonKt.a(qs2Var2, SizeKt.i(SizeKt.s(BorderKt.f(BackgroundKt.c(aVar4, aVar5.b(composer2, 8).a(), d37.c(bu1.g(f3))), bu1.g(1), aVar5.b(composer2, 8).l(), d37.c(bu1.g(f3))), bu1.g(36)), bu1.g(28)), false, null, null, ComposableSingletons$InterestsContentHeaderKt.a.a(), composer2, 196608, 28);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((j40) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), h, 1794112, 13);
        h.R();
        h.t();
        h.R();
        h.R();
        SpacerKt.a(SizeKt.i(aVar, bu1.g(f)), h, 6);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestsContentHeaderKt$InterestsContentHeader$2
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
                    InterestsContentHeaderKt.a(h04.this, youScreenViewModel, onboardingToolTipState, qs2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j40 b(sy4 sy4Var) {
        return (j40) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sy4 sy4Var, j40 j40Var) {
        sy4Var.setValue(j40Var);
    }
}
