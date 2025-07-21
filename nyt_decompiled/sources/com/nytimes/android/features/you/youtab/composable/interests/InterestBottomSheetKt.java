package com.nytimes.android.features.you.youtab.composable.interests;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.c;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.comscore.streaming.ContentType;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.designsystem.uicompose.composable.BottomSheetKt;
import com.nytimes.android.designsystem.uicompose.composable.RefreshableContentKt;
import com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingChooseTopicPageKt;
import com.nytimes.android.features.you.youtab.composable.onboarding.OnboardingResultsPageKt;
import com.nytimes.android.interests.InterestOnboardingScreen;
import com.nytimes.android.utils.snackbar.LocalSnackbarKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc7;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.kt2;
import defpackage.qn5;
import defpackage.qs2;
import defpackage.sp3;
import defpackage.ss2;
import defpackage.tp3;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import defpackage.yr0;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt7;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public abstract class InterestBottomSheetKt {
    public static final void a(final DownloadState downloadState, final CoroutineScope coroutineScope, final qs2 qs2Var, final ss2 ss2Var, final qs2 qs2Var2, final gt2 gt2Var, final gt2 gt2Var2, final qs2 qs2Var3, final SheetState sheetState, Composer composer, final int i) {
        zq3.h(downloadState, TransferTable.COLUMN_STATE);
        zq3.h(coroutineScope, "scope");
        zq3.h(qs2Var, "onDismiss");
        zq3.h(ss2Var, "addInterests");
        zq3.h(qs2Var2, "sendAddInterestImpression");
        zq3.h(gt2Var, "sendSelectInterestMenuTap");
        zq3.h(gt2Var2, "sendDeSelectInterestMenuTap");
        zq3.h(qs2Var3, "sendOnDismissAddInterestInteraction");
        zq3.h(sheetState, "sheetState");
        Composer h = composer.h(-215154382);
        if (b.G()) {
            b.S(-215154382, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.AddInterestBottomSheet (InterestBottomSheet.kt:71)");
        }
        h.z(-1571228832);
        boolean z = (((i & 896) ^ 384) > 256 && h.S(qs2Var)) || (i & 384) == 256;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$AddInterestBottomSheet$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m482invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m482invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        BottomSheetKt.a((qs2) A, sheetState, null, false, zr0.b(h, -1365988211, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$AddInterestBottomSheet$2
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
                    b.S(-1365988211, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.AddInterestBottomSheet.<anonymous> (InterestBottomSheet.kt:76)");
                }
                ym5 e = PaddingKt.e(0.0f, bu1.g(40), 0.0f, 0.0f, 13, null);
                DownloadState downloadState2 = DownloadState.this;
                AnonymousClass1 anonymousClass1 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$AddInterestBottomSheet$2.1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m483invoke() {
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m483invoke();
                        return ww8.a;
                    }
                };
                final qs2 qs2Var4 = qs2Var;
                yr0 b = zr0.b(composer2, -952177375, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$AddInterestBottomSheet$2.2
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        if ((i3 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-952177375, i3, -1, "com.nytimes.android.features.you.youtab.composable.interests.AddInterestBottomSheet.<anonymous>.<anonymous> (InterestBottomSheet.kt:79)");
                        }
                        SnackbarUtil.j((SnackbarUtil) composer3.m(LocalSnackbarKt.a()), false, false, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt.AddInterestBottomSheet.2.2.1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m484invoke() {
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m484invoke();
                                return ww8.a;
                            }
                        }, 3, null);
                        qs2.this.mo865invoke();
                        if (b.G()) {
                            b.R();
                        }
                    }
                });
                final qs2 qs2Var5 = qs2Var;
                yr0 b2 = zr0.b(composer2, -978347240, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$AddInterestBottomSheet$2.3
                    {
                        super(3);
                    }

                    public final void b(DownloadState.b bVar, Composer composer3, int i3) {
                        zq3.h(bVar, "it");
                        if (b.G()) {
                            b.S(-978347240, i3, -1, "com.nytimes.android.features.you.youtab.composable.interests.AddInterestBottomSheet.<anonymous>.<anonymous> (InterestBottomSheet.kt:83)");
                        }
                        SnackbarUtil.j((SnackbarUtil) composer3.m(LocalSnackbarKt.a()), false, false, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt.AddInterestBottomSheet.2.3.1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m485invoke() {
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m485invoke();
                                return ww8.a;
                            }
                        }, 3, null);
                        qs2.this.mo865invoke();
                        if (b.G()) {
                            b.R();
                        }
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        b((DownloadState.b) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }
                });
                final qs2 qs2Var6 = qs2Var;
                yr0 b3 = zr0.b(composer2, 1332517795, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$AddInterestBottomSheet$2.4
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        if ((i3 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1332517795, i3, -1, "com.nytimes.android.features.you.youtab.composable.interests.AddInterestBottomSheet.<anonymous>.<anonymous> (InterestBottomSheet.kt:88)");
                        }
                        BottomSheetKt.c(qs2.this, null, composer3, 0, 2);
                        if (b.G()) {
                            b.R();
                        }
                    }
                });
                final CoroutineScope coroutineScope2 = coroutineScope;
                final qs2 qs2Var7 = qs2Var;
                final ss2 ss2Var2 = ss2Var;
                final SheetState sheetState2 = sheetState;
                final qs2 qs2Var8 = qs2Var2;
                final gt2 gt2Var3 = gt2Var;
                final gt2 gt2Var4 = gt2Var2;
                final qs2 qs2Var9 = qs2Var3;
                RefreshableContentKt.a(downloadState2, anonymousClass1, null, b, b2, b3, false, 0.0f, null, e, 0L, 0L, null, false, false, zr0.b(composer2, 1896142456, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$AddInterestBottomSheet$2.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final void b(List list, Composer composer3, int i3) {
                        zq3.h(list, "it");
                        if (b.G()) {
                            b.S(1896142456, i3, -1, "com.nytimes.android.features.you.youtab.composable.interests.AddInterestBottomSheet.<anonymous>.<anonymous> (InterestBottomSheet.kt:93)");
                        }
                        AddInterestsContentKt.a(list, CoroutineScope.this, qs2Var7, ss2Var2, sheetState2, qs2Var8, gt2Var3, gt2Var4, qs2Var9, null, composer3, 72, 512);
                        if (b.G()) {
                            b.R();
                        }
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        b((List) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }
                }), composer2, 807103544, 196608, 32132);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, ((i >> 21) & ContentType.LONG_FORM_ON_DEMAND) | 24576, 12);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$AddInterestBottomSheet$3
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
                    InterestBottomSheetKt.a(DownloadState.this, coroutineScope, qs2Var, ss2Var, qs2Var2, gt2Var, gt2Var2, qs2Var3, sheetState, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final qs2 qs2Var, final SheetState sheetState, final CoroutineScope coroutineScope, final ss2 ss2Var, final sp3 sp3Var, final qs2 qs2Var2, final qs2 qs2Var3, final qs2 qs2Var4, final ss2 ss2Var2, final gt2 gt2Var, final gt2 gt2Var2, final StateFlow stateFlow, final ss2 ss2Var3, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        zq3.h(qs2Var, "onDismiss");
        zq3.h(sheetState, "sheetState");
        zq3.h(coroutineScope, "scope");
        zq3.h(ss2Var, "setOnboardingUserInterests");
        zq3.h(sp3Var, "allInterests");
        zq3.h(qs2Var2, "sendOnboardingFirstPageImpression");
        zq3.h(qs2Var3, "sendOnboardingSecondPageImpression");
        zq3.h(qs2Var4, "sendOnOnboardingInitialCloseInteraction");
        zq3.h(ss2Var2, "sendOnboardingTopicSelectInteraction");
        zq3.h(gt2Var, "sendOnboardingSecondPageDeselectInterest");
        zq3.h(gt2Var2, "sendOnboardingFinishTap");
        zq3.h(stateFlow, "getOnboardingResult");
        zq3.h(ss2Var3, "submitFilteredInterest");
        Composer h = composer.h(-1863626246);
        Modifier modifier2 = (i3 & 8192) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-1863626246, i, i2, "com.nytimes.android.features.you.youtab.composable.interests.InterestsOnboardingBottomSheet (InterestBottomSheet.kt:125)");
        }
        final PagerState j = PagerStateKt.j(0, 0.0f, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$InterestsOnboardingBottomSheet$pagerState$1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Integer mo865invoke() {
                return Integer.valueOf(InterestOnboardingScreen.values().length);
            }
        }, h, 384, 3);
        BottomSheetKt.a(qs2Var, sheetState, modifier2, false, zr0.b(h, 475493653, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$InterestsOnboardingBottomSheet$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(475493653, i4, -1, "com.nytimes.android.features.you.youtab.composable.interests.InterestsOnboardingBottomSheet.<anonymous> (InterestBottomSheet.kt:134)");
                }
                Modifier w = SizeKt.w(Modifier.a, null, false, 3, null);
                final PagerState pagerState = PagerState.this;
                final sp3 sp3Var2 = sp3Var;
                final CoroutineScope coroutineScope2 = coroutineScope;
                final qs2 qs2Var5 = qs2Var;
                final qs2 qs2Var6 = qs2Var2;
                final ss2 ss2Var4 = ss2Var2;
                final ss2 ss2Var5 = ss2Var3;
                final qs2 qs2Var7 = qs2Var4;
                final StateFlow<tp3> stateFlow2 = stateFlow;
                final qs2 qs2Var8 = qs2Var3;
                final gt2 gt2Var3 = gt2Var;
                final gt2 gt2Var4 = gt2Var2;
                final ss2 ss2Var6 = ss2Var;
                PagerKt.a(pagerState, w, null, null, 0, 0.0f, null, null, false, false, null, null, zr0.b(composer2, 1756899864, true, new kt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$InterestsOnboardingBottomSheet$1.1

                    /* renamed from: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$InterestsOnboardingBottomSheet$1$1$a */
                    public /* synthetic */ class a {
                        public static final /* synthetic */ int[] a;

                        static {
                            int[] iArr = new int[InterestOnboardingScreen.values().length];
                            try {
                                iArr[InterestOnboardingScreen.Topics.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[InterestOnboardingScreen.Results.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((qn5) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    public final void invoke(qn5 qn5Var, final int i5, Composer composer3, int i6) {
                        zq3.h(qn5Var, "$this$HorizontalPager");
                        if (b.G()) {
                            b.S(1756899864, i6, -1, "com.nytimes.android.features.you.youtab.composable.interests.InterestsOnboardingBottomSheet.<anonymous>.<anonymous> (InterestBottomSheet.kt:139)");
                        }
                        int i7 = a.a[InterestOnboardingScreen.values()[i5].ordinal()];
                        if (i7 == 1) {
                            composer3.z(1342754158);
                            List b = sp3.this.b();
                            Modifier e = InterestBottomSheetKt.e(Modifier.a, i5, pagerState);
                            final CoroutineScope coroutineScope3 = coroutineScope2;
                            qs2 qs2Var9 = qs2Var5;
                            final PagerState pagerState2 = pagerState;
                            OnboardingChooseTopicPageKt.b(coroutineScope3, qs2Var9, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt.InterestsOnboardingBottomSheet.1.1.1

                                @fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$InterestsOnboardingBottomSheet$1$1$1$1", f = "InterestBottomSheet.kt", l = {146}, m = "invokeSuspend")
                                /* renamed from: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$InterestsOnboardingBottomSheet$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C03091 extends SuspendLambda implements gt2 {
                                    final /* synthetic */ int $page;
                                    final /* synthetic */ PagerState $pagerState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C03091(PagerState pagerState, int i, by0 by0Var) {
                                        super(2, by0Var);
                                        this.$pagerState = pagerState;
                                        this.$page = i;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final by0 create(Object obj, by0 by0Var) {
                                        return new C03091(this.$pagerState, this.$page, by0Var);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object h = kotlin.coroutines.intrinsics.a.h();
                                        int i = this.label;
                                        if (i == 0) {
                                            f.b(obj);
                                            PagerState pagerState = this.$pagerState;
                                            int i2 = this.$page + 1;
                                            this.label = 1;
                                            if (PagerState.o(pagerState, i2, 0.0f, null, this, 6, null) == h) {
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
                                        return ((C03091) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m486invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m486invoke() {
                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C03091(pagerState2, i5, null), 3, null);
                                }
                            }, b, qs2Var6, ss2Var4, ss2Var5, qs2Var7, e, composer3, 4104, 0);
                            composer3.R();
                        } else if (i7 != 2) {
                            composer3.z(1342755896);
                            composer3.R();
                        } else {
                            composer3.z(1342755058);
                            x08 b2 = y.b(stateFlow2, null, composer3, 8, 1);
                            Modifier e2 = InterestBottomSheetKt.e(Modifier.a, i5, pagerState);
                            final gt2 gt2Var5 = gt2Var4;
                            final ss2 ss2Var7 = ss2Var6;
                            final CoroutineScope coroutineScope4 = coroutineScope2;
                            final PagerState pagerState3 = pagerState;
                            OnboardingResultsPageKt.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt.InterestsOnboardingBottomSheet.1.1.2

                                @fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$InterestsOnboardingBottomSheet$1$1$2$1", f = "InterestBottomSheet.kt", l = {163}, m = "invokeSuspend")
                                /* renamed from: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$InterestsOnboardingBottomSheet$1$1$2$1, reason: invalid class name and collision with other inner class name */
                                static final class C03101 extends SuspendLambda implements gt2 {
                                    final /* synthetic */ int $page;
                                    final /* synthetic */ PagerState $pagerState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C03101(PagerState pagerState, int i, by0 by0Var) {
                                        super(2, by0Var);
                                        this.$pagerState = pagerState;
                                        this.$page = i;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final by0 create(Object obj, by0 by0Var) {
                                        return new C03101(this.$pagerState, this.$page, by0Var);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object h = kotlin.coroutines.intrinsics.a.h();
                                        int i = this.label;
                                        if (i == 0) {
                                            f.b(obj);
                                            PagerState pagerState = this.$pagerState;
                                            int i2 = this.$page + 1;
                                            this.label = 1;
                                            if (PagerState.o(pagerState, i2, 0.0f, null, this, 6, null) == h) {
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
                                        return ((C03101) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void b(List list, List list2) {
                                    zq3.h(list, "previewList");
                                    zq3.h(list2, "selectedSection");
                                    gt2.this.invoke(list, list2);
                                    ss2Var7.invoke(list);
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C03101(pagerState3, i5, null), 3, null);
                                }

                                @Override // defpackage.gt2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    b((List) obj, (List) obj2);
                                    return ww8.a;
                                }
                            }, b2, qs2Var8, gt2Var3, e2, composer3, 0, 0);
                            composer3.R();
                        }
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 100663344, 384, 3836);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, (i & 14) | 27648 | (i & ContentType.LONG_FORM_ON_DEMAND) | ((i2 >> 3) & 896), 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$InterestsOnboardingBottomSheet$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    InterestBottomSheetKt.b(qs2.this, sheetState, coroutineScope, ss2Var, sp3Var, qs2Var2, qs2Var3, qs2Var4, ss2Var2, gt2Var, gt2Var2, stateFlow, ss2Var3, modifier3, composer2, gt6.a(i | 1), gt6.a(i2), i3);
                }
            });
        }
    }

    public static final void c(final List list, final CoroutineScope coroutineScope, final qs2 qs2Var, final qs2 qs2Var2, final qs2 qs2Var3, final ss2 ss2Var, final SheetState sheetState, Composer composer, final int i) {
        zq3.h(list, "list");
        zq3.h(coroutineScope, "scope");
        zq3.h(qs2Var, "onDismiss");
        zq3.h(qs2Var2, "sendReorderingImpression");
        zq3.h(qs2Var3, "sendOnDismissReorderingInteraction");
        zq3.h(ss2Var, "updateList");
        zq3.h(sheetState, "sheetState");
        Composer h = composer.h(-1662967905);
        if (b.G()) {
            b.S(-1662967905, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestBottomSheet (InterestBottomSheet.kt:42)");
        }
        h.z(21010020);
        boolean z = (((i & 896) ^ 384) > 256 && h.S(qs2Var)) || (i & 384) == 256;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$ReorderInterestBottomSheet$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m487invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m487invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        BottomSheetKt.a((qs2) A, sheetState, null, false, zr0.b(h, 1181244388, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$ReorderInterestBottomSheet$2
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
                    b.S(1181244388, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestBottomSheet.<anonymous> (InterestBottomSheet.kt:47)");
                }
                ReorderInterestContentKt.a(list, qs2Var, qs2Var2, sheetState, coroutineScope, ss2Var, null, qs2Var3, composer2, 32776, 64);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, ((i >> 15) & ContentType.LONG_FORM_ON_DEMAND) | 24576, 12);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$ReorderInterestBottomSheet$3
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
                    InterestBottomSheetKt.c(list, coroutineScope, qs2Var, qs2Var2, qs2Var3, ss2Var, sheetState, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final float d(PagerState pagerState, int i) {
        zq3.h(pagerState, "<this>");
        return (pagerState.w() - i) + pagerState.x();
    }

    public static final Modifier e(Modifier modifier, final int i, final PagerState pagerState) {
        zq3.h(modifier, "<this>");
        zq3.h(pagerState, "pagerState");
        return androidx.compose.ui.graphics.b.a(modifier, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.InterestBottomSheetKt$pagerFadeTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(c cVar) {
                zq3.h(cVar, "$this$graphicsLayer");
                float d = InterestBottomSheetKt.d(PagerState.this, i);
                cVar.x(zt7.i(cVar.b()) * d);
                cVar.c(1 - Math.abs(d));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((c) obj);
                return ww8.a;
            }
        });
    }
}
