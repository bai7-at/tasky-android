package com.nytimes.android.ribbon;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.ribbon.composable.DestinationPagerKt;
import com.nytimes.android.ribbon.composable.tabrow.RibbonTabRowKt;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.destinations.audio.AudioDestinationKt;
import com.nytimes.android.ribbon.destinations.bestof.BestOfDestinationKt;
import com.nytimes.android.ribbon.destinations.cooking.CookingDestinationKt;
import com.nytimes.android.ribbon.destinations.elections.ElectionsDestinationKt;
import com.nytimes.android.ribbon.destinations.games.GamesDestinationKt;
import com.nytimes.android.ribbon.destinations.greatreads.GreatReadsDestinationKt;
import com.nytimes.android.ribbon.destinations.lifestyle.LifestyleWebDestinationKt;
import com.nytimes.android.ribbon.destinations.more.SectionsDestinationKt;
import com.nytimes.android.ribbon.destinations.opinions.OpinionsDestinationKt;
import com.nytimes.android.ribbon.destinations.theathletic.TheAthleticDestinationKt;
import com.nytimes.android.ribbon.destinations.today.TodayDestinationKt;
import com.nytimes.android.ribbon.destinations.trending.TrendingDestinationKt;
import com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt;
import com.nytimes.android.tabs.composable.MainTopAppBarKt;
import com.nytimes.android.utils.composeutils.ComposablePositionsKt;
import defpackage.ac0;
import defpackage.ap0;
import defpackage.bd8;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.do5;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fc1;
import defpackage.fd5;
import defpackage.fe4;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.he6;
import defpackage.in1;
import defpackage.it2;
import defpackage.ju7;
import defpackage.m37;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sm9;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.xl9;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes4.dex */
public abstract class DestinationContentKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.fe4 r28, androidx.compose.ui.Modifier r29, com.nytimes.android.ribbon.DestinationContentViewModel r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.DestinationContentKt.a(fe4, androidx.compose.ui.Modifier, com.nytimes.android.ribbon.DestinationContentViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final in1 b(x08 x08Var) {
        return (in1) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xl9 c(x08 x08Var) {
        return (xl9) x08Var.getValue();
    }

    private static final boolean d(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final float f, final qs2 qs2Var, final ss2 ss2Var, Composer composer, final int i) {
        Composer h = composer.h(-1680647390);
        if (b.G()) {
            b.S(-1680647390, i, -1, "com.nytimes.android.ribbon.NYTHeader (DestinationContent.kt:296)");
        }
        h.z(773894976);
        h.z(-492369756);
        Object A = h.A();
        if (A == Composer.a.a()) {
            e eVar = new e(py1.j(EmptyCoroutineContext.a, h));
            h.q(eVar);
            A = eVar;
        }
        h.R();
        final CoroutineScope a = ((e) A).a();
        h.R();
        MainTopAppBarKt.a(zr0.b(h, 1652757078, true, new it2() { // from class: com.nytimes.android.ribbon.DestinationContentKt$NYTHeader$1

            @fc1(c = "com.nytimes.android.ribbon.DestinationContentKt$NYTHeader$1$1", f = "DestinationContent.kt", l = {StatusLine.HTTP_PERM_REDIRECT}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.ribbon.DestinationContentKt$NYTHeader$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ ss2 $onDoubleTapLogo;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CoroutineScope coroutineScope, ss2 ss2Var, by0 by0Var) {
                    super(2, by0Var);
                    this.$scope = coroutineScope;
                    this.$onDoubleTapLogo = ss2Var;
                }

                @Override // defpackage.gt2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(fy5 fy5Var, by0 by0Var) {
                    return ((AnonymousClass1) create(fy5Var, by0Var)).invokeSuspend(ww8.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$onDoubleTapLogo, by0Var);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        fy5 fy5Var = (fy5) this.L$0;
                        final CoroutineScope coroutineScope = this.$scope;
                        final ss2 ss2Var = this.$onDoubleTapLogo;
                        ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.ribbon.DestinationContentKt.NYTHeader.1.1.1

                            @fc1(c = "com.nytimes.android.ribbon.DestinationContentKt$NYTHeader$1$1$1$1", f = "DestinationContent.kt", l = {311}, m = "invokeSuspend")
                            /* renamed from: com.nytimes.android.ribbon.DestinationContentKt$NYTHeader$1$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C03841 extends SuspendLambda implements gt2 {
                                final /* synthetic */ ss2 $onDoubleTapLogo;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C03841(ss2 ss2Var, by0 by0Var) {
                                    super(2, by0Var);
                                    this.$onDoubleTapLogo = ss2Var;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final by0 create(Object obj, by0 by0Var) {
                                    return new C03841(this.$onDoubleTapLogo, by0Var);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object h = a.h();
                                    int i = this.label;
                                    if (i == 0) {
                                        f.b(obj);
                                        ss2 ss2Var = this.$onDoubleTapLogo;
                                        this.label = 1;
                                        if (ss2Var.invoke(this) == h) {
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
                                    return ((C03841) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(long j) {
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C03841(ss2Var, null), 3, null);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                b(((fd5) obj2).x());
                                return ww8.a;
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.j(fy5Var, ss2Var2, null, null, null, this, 14, null) == h) {
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
                super(3);
            }

            public final void b(ac0 ac0Var, Composer composer2, int i2) {
                zq3.h(ac0Var, "$this$MainTopAppBar");
                if ((i2 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(1652757078, i2, -1, "com.nytimes.android.ribbon.NYTHeader.<anonymous> (DestinationContent.kt:303)");
                }
                ImageKt.b(do5.d(he6.nyt_nameplate, composer2, 0), null, bd8.c(PaddingKt.m(Modifier.a, 0.0f, bu1.g(5), 0.0f, 0.0f, 13, null), ww8.a, new AnonymousClass1(CoroutineScope.this, ss2Var, null)), null, null, 0.0f, null, composer2, 56, 120);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((ac0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), SizeKt.i(Modifier.a, f), null, null, zr0.b(h, 2058790379, true, new it2() { // from class: com.nytimes.android.ribbon.DestinationContentKt$NYTHeader$2
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
                if (b.G()) {
                    b.S(2058790379, i2, -1, "com.nytimes.android.ribbon.NYTHeader.<anonymous> (DestinationContent.kt:322)");
                }
                composer2.z(837029245);
                boolean S = composer2.S(qs2.this);
                final qs2 qs2Var2 = qs2.this;
                Object A2 = composer2.A();
                if (S || A2 == Composer.a.a()) {
                    A2 = new qs2() { // from class: com.nytimes.android.ribbon.DestinationContentKt$NYTHeader$2$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m648invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m648invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    composer2.q(A2);
                }
                composer2.R();
                IconButtonKt.a((qs2) A2, ComposablePositionsKt.d(Modifier.a, "settingAccount", null, 2, null), false, null, ComposableSingletons$DestinationContentKt.a.a(), composer2, 24576, 12);
                if (b.G()) {
                    b.R();
                }
            }
        }), 0L, 0L, bu1.g(0), h, 12607494, 108);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.DestinationContentKt$NYTHeader$3
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
                    DestinationContentKt.e(f, qs2Var, ss2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final PagerState pagerState, final boolean z, final qs2 qs2Var, final Map map, final fe4 fe4Var, final ss2 ss2Var, final int i, final boolean z2, Composer composer, final int i2) {
        Composer h = composer.h(-1268295953);
        if (b.G()) {
            b.S(-1268295953, i2, -1, "com.nytimes.android.ribbon.PagerContent (DestinationContent.kt:350)");
        }
        DestinationPagerKt.b(pagerState, i, null, zr0.b(h, 514154235, true, new it2() { // from class: com.nytimes.android.ribbon.DestinationContentKt$PagerContent$1

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[RibbonConfig.values().length];
                    try {
                        iArr[RibbonConfig.TODAY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RibbonConfig.GAMES.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RibbonConfig.AUDIO.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[RibbonConfig.WIRECUTTER.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[RibbonConfig.COOKING.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[RibbonConfig.THE_ATHLETIC.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[RibbonConfig.BEST_OF.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[RibbonConfig.ELECTION.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[RibbonConfig.TRENDING.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[RibbonConfig.GREAT_READS.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[RibbonConfig.OPINION.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[RibbonConfig.LIFESTYLE.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[RibbonConfig.SECTIONS.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(int i3, Composer composer2, int i4) {
                LazyListState r;
                LazyListState r2;
                LazyListState r3;
                LazyListState r4;
                LazyListState r5;
                LazyListState r6;
                LazyListState r7;
                LazyListState r8;
                if ((i4 & 14) == 0) {
                    i4 |= composer2.d(i3) ? 4 : 2;
                }
                if ((i4 & 91) == 18 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(514154235, i4, -1, "com.nytimes.android.ribbon.PagerContent.<anonymous> (DestinationContent.kt:355)");
                }
                RibbonConfig ribbonConfig = (RibbonConfig) ss2.this.invoke(Integer.valueOf(i3));
                switch (ribbonConfig != null ? a.a[ribbonConfig.ordinal()] : -1) {
                    case -1:
                        composer2.z(1690897748);
                        composer2.R();
                        NYTLogger.g("Unknown Ribbon Config Item In DestinationPager", new Object[0]);
                        break;
                    case 0:
                    default:
                        composer2.z(1690897809);
                        composer2.R();
                        break;
                    case 1:
                        composer2.z(1690895243);
                        TodayDestinationKt.a(z, qs2Var, fe4Var, null, composer2, fe4.h << 6, 8);
                        composer2.R();
                        break;
                    case 2:
                        composer2.z(1690895451);
                        fe4 fe4Var2 = fe4Var;
                        boolean z3 = z2;
                        r = DestinationContentKt.r(RibbonConfig.GAMES, map, composer2, 70);
                        GamesDestinationKt.a(fe4Var2, z3, r, null, null, composer2, fe4.h, 24);
                        composer2.R();
                        break;
                    case 3:
                        composer2.z(1690895762);
                        r2 = DestinationContentKt.r(RibbonConfig.AUDIO, map, composer2, 70);
                        AudioDestinationKt.a(r2, z2, null, null, composer2, 0, 12);
                        composer2.R();
                        break;
                    case 4:
                        composer2.z(1690895939);
                        r3 = DestinationContentKt.r(RibbonConfig.WIRECUTTER, map, composer2, 70);
                        WirecutterDestinationKt.a(r3, z2, null, null, composer2, 0, 12);
                        composer2.R();
                        break;
                    case 5:
                        composer2.z(1690896014);
                        boolean z4 = z2;
                        r4 = DestinationContentKt.r(RibbonConfig.COOKING, map, composer2, 70);
                        CookingDestinationKt.a(z4, r4, null, null, composer2, 0, 12);
                        composer2.R();
                        break;
                    case 6:
                        composer2.z(1690896192);
                        boolean z5 = z2;
                        r5 = DestinationContentKt.r(RibbonConfig.THE_ATHLETIC, map, composer2, 70);
                        TheAthleticDestinationKt.a(z5, r5, null, null, composer2, 0, 12);
                        composer2.R();
                        break;
                    case 7:
                        composer2.z(1690896374);
                        BestOfDestinationKt.a(z, qs2Var, fe4Var, null, composer2, fe4.h << 6, 8);
                        composer2.R();
                        break;
                    case 8:
                        composer2.z(1690896586);
                        ElectionsDestinationKt.a(z2, z, qs2Var, fe4Var, null, composer2, fe4.h << 9, 16);
                        composer2.R();
                        break;
                    case 9:
                        composer2.z(1690896854);
                        TrendingDestinationKt.a(z2, null, null, composer2, 0, 6);
                        composer2.R();
                        break;
                    case 10:
                        composer2.z(1690896939);
                        boolean z6 = z2;
                        r6 = DestinationContentKt.r(RibbonConfig.GREAT_READS, map, composer2, 70);
                        GreatReadsDestinationKt.a(z6, r6, null, null, composer2, 0, 12);
                        composer2.R();
                        break;
                    case 11:
                        composer2.z(1690897119);
                        boolean z7 = z2;
                        r7 = DestinationContentKt.r(RibbonConfig.OPINION, map, composer2, 70);
                        OpinionsDestinationKt.a(z7, r7, null, null, composer2, 0, 12);
                        composer2.R();
                        break;
                    case 12:
                        composer2.z(1690897295);
                        LifestyleWebDestinationKt.a(z2, z, qs2Var, fe4Var, null, composer2, fe4.h << 9, 16);
                        composer2.R();
                        break;
                    case 13:
                        composer2.z(1690897566);
                        boolean z8 = z2;
                        r8 = DestinationContentKt.r(RibbonConfig.SECTIONS, map, composer2, 70);
                        SectionsDestinationKt.b(z8, r8, null, null, composer2, 0, 12);
                        composer2.R();
                        break;
                }
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b(((Number) obj).intValue(), (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), h, (i2 & 14) | 3072 | ((i2 >> 15) & ContentType.LONG_FORM_ON_DEMAND), 4);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.DestinationContentKt$PagerContent$2
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
                    DestinationContentKt.f(PagerState.this, z, qs2Var, map, fe4Var, ss2Var, i, z2, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final float r30, final boolean r31, androidx.compose.ui.Modifier r32, com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel r33, defpackage.qs2 r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.DestinationContentKt.g(float, boolean, androidx.compose.ui.Modifier, com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel, qs2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set h(x08 x08Var) {
        return (Set) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final PagerState pagerState, final List list, final float f, final float f2, final qs2 qs2Var, final ss2 ss2Var, final it2 it2Var, Composer composer, final int i) {
        Composer h = composer.h(-178398589);
        if (b.G()) {
            b.S(-178398589, i, -1, "com.nytimes.android.ribbon.Toolbar (DestinationContent.kt:271)");
        }
        Modifier d = BackgroundKt.d(sm9.a(Modifier.a, 1.0f), eb5.Companion.b(h, 8).a(), null, 2, null);
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(d);
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
        e(f, qs2Var, ss2Var, h, ((i >> 6) & 14) | 512 | ((i >> 9) & ContentType.LONG_FORM_ON_DEMAND));
        RibbonTabRowKt.f(pagerState, list, it2Var, f2, h, (i & 14) | 576 | (i & 7168));
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.DestinationContentKt$Toolbar$2
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
                    DestinationContentKt.i(PagerState.this, list, f, f2, qs2Var, ss2Var, it2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListState r(RibbonConfig ribbonConfig, Map map, Composer composer, int i) {
        composer.z(1019026528);
        if (b.G()) {
            b.S(1019026528, i, -1, "com.nytimes.android.ribbon.getListState (DestinationContent.kt:453)");
        }
        LazyListState lazyListState = (LazyListState) map.get(ribbonConfig.getId());
        if (lazyListState == null) {
            lazyListState = LazyListStateKt.c(0, 0, composer, 0, 3);
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return lazyListState;
    }

    private static final PagerState s(int i, final List list, DestinationContentViewModel destinationContentViewModel, Composer composer, int i2) {
        composer.z(1327498648);
        if (b.G()) {
            b.S(1327498648, i2, -1, "com.nytimes.android.ribbon.initializePagerState (DestinationContent.kt:213)");
        }
        PagerState j = PagerStateKt.j(i, 0.0f, new qs2() { // from class: com.nytimes.android.ribbon.DestinationContentKt$initializePagerState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Integer mo865invoke() {
                return Integer.valueOf(list.size());
            }
        }, composer, i2 & 14, 2);
        destinationContentViewModel.w(list, j);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(com.nytimes.android.ribbon.DestinationContentViewModel r7, com.nytimes.android.ribbon.config.RibbonConfig r8, java.util.Map r9, defpackage.fe4 r10, defpackage.by0 r11) {
        /*
            boolean r0 = r11 instanceof com.nytimes.android.ribbon.DestinationContentKt$onTabSelected$1
            if (r0 == 0) goto L14
            r0 = r11
            com.nytimes.android.ribbon.DestinationContentKt$onTabSelected$1 r0 = (com.nytimes.android.ribbon.DestinationContentKt$onTabSelected$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.nytimes.android.ribbon.DestinationContentKt$onTabSelected$1 r0 = new com.nytimes.android.ribbon.DestinationContentKt$onTabSelected$1
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r7 = r4.L$1
            r8 = r7
            com.nytimes.android.ribbon.config.RibbonConfig r8 = (com.nytimes.android.ribbon.config.RibbonConfig) r8
            java.lang.Object r7 = r4.L$0
            com.nytimes.android.ribbon.DestinationContentViewModel r7 = (com.nytimes.android.ribbon.DestinationContentViewModel) r7
            kotlin.f.b(r11)
            goto L79
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.f.b(r11)
            boolean r11 = r7.o(r8)
            if (r11 == 0) goto L79
            if (r8 == 0) goto L4c
            java.lang.String r11 = r8.getId()
            goto L4d
        L4c:
            r11 = 0
        L4d:
            java.lang.Object r9 = r9.get(r11)
            r1 = r9
            androidx.compose.foundation.lazy.LazyListState r1 = (androidx.compose.foundation.lazy.LazyListState) r1
            if (r1 == 0) goto L79
            boolean r9 = r7.p()
            if (r9 == 0) goto L60
            r7.u(r2)
            goto L79
        L60:
            com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver r9 = r10.e()
            r10 = 0
            r9.j(r10)
            r4.L$0 = r7
            r4.L$1 = r8
            r4.label = r2
            r2 = 0
            r3 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r9 = androidx.compose.foundation.lazy.LazyListState.k(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L79
            return r0
        L79:
            r7.s(r8)
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.DestinationContentKt.t(com.nytimes.android.ribbon.DestinationContentViewModel, com.nytimes.android.ribbon.config.RibbonConfig, java.util.Map, fe4, by0):java.lang.Object");
    }
}
