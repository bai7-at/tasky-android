package com.nytimes.android.features.you.youtab.composable.onboarding;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.airbnb.lottie.compose.c;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.composable.BottomSheetKt;
import com.nytimes.android.features.you.youtab.composable.interests.CommonComponentsKt;
import defpackage.ap0;
import defpackage.bh5;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kt2;
import defpackage.lc4;
import defpackage.p29;
import defpackage.pb;
import defpackage.py1;
import defpackage.qj6;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes4.dex */
public abstract class OnboardingChooseTopicPageKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r31, final java.lang.String r32, final boolean r33, androidx.compose.ui.Modifier r34, final defpackage.qs2 r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPageKt.a(java.lang.String, java.lang.String, boolean, androidx.compose.ui.Modifier, qs2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final CoroutineScope coroutineScope, final qs2 qs2Var, final qs2 qs2Var2, final List list, final qs2 qs2Var3, final ss2 ss2Var, final ss2 ss2Var2, final qs2 qs2Var4, Modifier modifier, Composer composer, final int i, final int i2) {
        zq3.h(coroutineScope, "scope");
        zq3.h(qs2Var, "onDismiss");
        zq3.h(qs2Var2, "onButtonClick");
        zq3.h(list, "topics");
        zq3.h(qs2Var3, "sendOnboardingFirstPageImpression");
        zq3.h(ss2Var, "sendOnboardingTopicSelectInteraction");
        zq3.h(ss2Var2, "submitFilteredInterest");
        zq3.h(qs2Var4, "sendOnOnboardingInitialCloseInteraction");
        Composer h = composer.h(-439904246);
        Modifier modifier2 = (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-439904246, i, -1, "com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPage (OnboardingChooseTopicPage.kt:61)");
        }
        ww8 ww8Var = ww8.a;
        h.z(572720594);
        boolean z = (((57344 & i) ^ 24576) > 16384 && h.S(qs2Var3)) || (i & 24576) == 16384;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new OnboardingChooseTopicPageKt$OnboardingChooseTopicPage$1$1(qs2Var3, null);
            h.q(A);
        }
        h.R();
        py1.d(ww8Var, (gt2) A, h, 70);
        final Modifier modifier3 = modifier2;
        final lc4 r = RememberLottieCompositionKt.r(c.a.a(c.a.b(qj6.you_onboarding)), null, null, null, null, null, h, 0, 62);
        h.z(572720797);
        Object A2 = h.A();
        Composer.a aVar = Composer.a;
        if (A2 == aVar.a()) {
            A2 = b0.e(Boolean.FALSE, null, 2, null);
            h.q(A2);
        }
        final sy4 sy4Var = (sy4) A2;
        h.R();
        x08 d = AnimateAsStateKt.d(d(sy4Var) ? 1.0f : 0.93f, null, 0.0f, "screenHeight", null, h, 3072, 22);
        x08 d2 = AnimateAsStateKt.d(d(sy4Var) ? 0.0f : 1.0f, null, 0.0f, "alpha", null, h, 3072, 22);
        h.z(572721070);
        Object A3 = h.A();
        if (A3 == aVar.a()) {
            A3 = y.f();
            h.q(A3);
        }
        final SnapshotStateList snapshotStateList = (SnapshotStateList) A3;
        h.R();
        Modifier c = SizeKt.c(modifier3, f(d));
        h.z(-483455358);
        Arrangement arrangement = Arrangement.a;
        Arrangement.m g = arrangement.g();
        Alignment.a aVar2 = Alignment.a;
        rg4 a = d.a(g, aVar2.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c2 = LayoutKt.c(c);
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
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        BottomSheetKt.b(qs2Var, null, qs2Var4, h, ((i >> 3) & 14) | ((i >> 15) & 896), 2);
        Modifier.a aVar3 = Modifier.a;
        Modifier f = SizeKt.f(aVar3, 0.0f, 1, null);
        h.z(733328855);
        rg4 g2 = BoxKt.g(aVar2.o(), false, h, 0);
        h.z(-1323940314);
        int a5 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a6 = companion.a();
        it2 c3 = LayoutKt.c(f);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a6);
        } else {
            h.p();
        }
        Composer a7 = Updater.a(h);
        Updater.c(a7, g2, companion.e());
        Updater.c(a7, o2, companion.g());
        gt2 b2 = companion.b();
        if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
            a7.q(Integer.valueOf(a5));
            a7.v(Integer.valueOf(a5), b2);
        }
        c3.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        LazyDslKt.a(PaddingKt.m(pb.a(SizeKt.f(BackgroundKt.d(aVar3, eb5.Companion.a(h, 8).d(), null, 2, null), 0.0f, 1, null), g(d2)), 0.0f, 0.0f, 0.0f, bu1.g(118), 7, null), null, null, false, arrangement.n(bu1.g(10)), null, null, false, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPageKt$OnboardingChooseTopicPage$2$1$1
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
                final lc4 lc4Var = r;
                LazyListScope.d(lazyListScope, null, null, zr0.c(-1052279014, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPageKt$OnboardingChooseTopicPage$2$1$1.1
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i3) {
                        LottieComposition c4;
                        zq3.h(h04Var, "$this$item");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1052279014, i3, -1, "com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnboardingChooseTopicPage.kt:92)");
                        }
                        lc4 lc4Var2 = lc4.this;
                        composer2.z(-483455358);
                        Modifier.a aVar4 = Modifier.a;
                        rg4 a8 = d.a(Arrangement.a.g(), Alignment.a.k(), composer2, 0);
                        composer2.z(-1323940314);
                        int a9 = cs0.a(composer2, 0);
                        et0 o3 = composer2.o();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                        qs2 a10 = companion2.a();
                        it2 c5 = LayoutKt.c(aVar4);
                        if (composer2.j() == null) {
                            cs0.c();
                        }
                        composer2.G();
                        if (composer2.f()) {
                            composer2.D(a10);
                        } else {
                            composer2.p();
                        }
                        Composer a11 = Updater.a(composer2);
                        Updater.c(a11, a8, companion2.e());
                        Updater.c(a11, o3, companion2.g());
                        gt2 b3 = companion2.b();
                        if (a11.f() || !zq3.c(a11.A(), Integer.valueOf(a9))) {
                            a11.q(Integer.valueOf(a9));
                            a11.v(Integer.valueOf(a9), b3);
                        }
                        c5.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                        composer2.z(2058660585);
                        ap0 ap0Var2 = ap0.a;
                        SpacerKt.a(SizeKt.i(aVar4, bu1.g(20)), composer2, 6);
                        c4 = OnboardingChooseTopicPageKt.c(lc4Var2);
                        LottieAnimationKt.c(c4, SizeKt.h(aVar4, 0.0f, 1, null), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, ContentScale.a.d(), false, false, null, false, null, composer2, 56, 196608, 0, 2064380);
                        SpacerKt.a(SizeKt.i(aVar4, bu1.g(24)), composer2, 6);
                        composer2.R();
                        composer2.t();
                        composer2.R();
                        composer2.R();
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
                ComposableSingletons$OnboardingChooseTopicPageKt composableSingletons$OnboardingChooseTopicPageKt = ComposableSingletons$OnboardingChooseTopicPageKt.a;
                LazyListScope.d(lazyListScope, null, null, composableSingletons$OnboardingChooseTopicPageKt.a(), 3, null);
                final List<bh5> list2 = list;
                final SnapshotStateList snapshotStateList2 = snapshotStateList;
                final ss2 ss2Var3 = ss2Var;
                final OnboardingChooseTopicPageKt$OnboardingChooseTopicPage$2$1$1$invoke$$inlined$items$default$1 onboardingChooseTopicPageKt$OnboardingChooseTopicPage$2$1$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPageKt$OnboardingChooseTopicPage$2$1$1$invoke$$inlined$items$default$1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Void invoke(Object obj) {
                        return null;
                    }
                };
                lazyListScope.b(list2.size(), null, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPageKt$OnboardingChooseTopicPage$2$1$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i3) {
                        return ss2.this.invoke(list2.get(i3));
                    }
                }, zr0.c(-632812321, true, new kt2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPageKt$OnboardingChooseTopicPage$2$1$1$invoke$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, int i3, Composer composer2, int i4) {
                        int i5;
                        if ((i4 & 14) == 0) {
                            i5 = (composer2.S(h04Var) ? 4 : 2) | i4;
                        } else {
                            i5 = i4;
                        }
                        if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                            i5 |= composer2.d(i3) ? 32 : 16;
                        }
                        if ((i5 & 731) == 146 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                        }
                        final bh5 bh5Var = (bh5) list2.get(i3);
                        final boolean contains = snapshotStateList2.contains(Integer.valueOf(bh5Var.b()));
                        String d3 = bh5Var.d();
                        String a8 = bh5Var.a();
                        final ss2 ss2Var4 = ss2Var3;
                        final SnapshotStateList snapshotStateList3 = snapshotStateList2;
                        OnboardingChooseTopicPageKt.a(d3, a8, contains, null, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPageKt$OnboardingChooseTopicPage$2$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m536invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m536invoke() {
                                if (contains) {
                                    ss2Var4.invoke(Integer.valueOf(bh5Var.b()));
                                }
                                p29.a(snapshotStateList3, bh5Var.b());
                            }
                        }, composer2, 0, 8);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
                LazyListScope.d(lazyListScope, null, null, composableSingletons$OnboardingChooseTopicPageKt.b(), 3, null);
            }
        }, h, 24576, 238);
        CommonComponentsKt.a(k48.b(yk6.onboarding_choose_topics_button, h, 0), new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPageKt$OnboardingChooseTopicPage$2$1$2

            @fc1(c = "com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPageKt$OnboardingChooseTopicPage$2$1$2$1", f = "OnboardingChooseTopicPage.kt", l = {153}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPageKt$OnboardingChooseTopicPage$2$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ sy4 $completed$delegate;
                final /* synthetic */ qs2 $onButtonClick;
                final /* synthetic */ SnapshotStateList $selectedTopic;
                final /* synthetic */ ss2 $submitFilteredInterest;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ss2 ss2Var, SnapshotStateList snapshotStateList, qs2 qs2Var, sy4 sy4Var, by0 by0Var) {
                    super(2, by0Var);
                    this.$submitFilteredInterest = ss2Var;
                    this.$selectedTopic = snapshotStateList;
                    this.$onButtonClick = qs2Var;
                    this.$completed$delegate = sy4Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$submitFilteredInterest, this.$selectedTopic, this.$onButtonClick, this.$completed$delegate, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        OnboardingChooseTopicPageKt.e(this.$completed$delegate, true);
                        this.label = 1;
                        if (DelayKt.delay(100L, this) == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    this.$submitFilteredInterest.invoke(this.$selectedTopic.u());
                    this.$onButtonClick.mo865invoke();
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
                m537invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m537invoke() {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(ss2Var2, snapshotStateList, qs2Var2, sy4Var, null), 3, null);
            }
        }, boxScopeInstance.c(aVar3, aVar2.b()), false, h, 0, 8);
        h.R();
        h.t();
        h.R();
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPageKt$OnboardingChooseTopicPage$3
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
                    OnboardingChooseTopicPageKt.b(CoroutineScope.this, qs2Var, qs2Var2, list, qs2Var3, ss2Var, ss2Var2, qs2Var4, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieComposition c(lc4 lc4Var) {
        return (LottieComposition) lc4Var.getValue();
    }

    private static final boolean d(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    private static final float f(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    private static final float g(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }
}
