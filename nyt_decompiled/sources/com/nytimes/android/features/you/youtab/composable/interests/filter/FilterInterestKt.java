package com.nytimes.android.features.you.youtab.composable.interests.filter;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.e;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.interests.InterestType;
import com.nytimes.android.interests.db.Interest;
import com.nytimes.android.interests.db.InterestAsset;
import com.nytimes.android.navigation.NavigationSource;
import com.nytimes.android.saved.SaveHandler;
import defpackage.ap0;
import defpackage.bf8;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d37;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fc1;
import defpackage.ff8;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.kt2;
import defpackage.n37;
import defpackage.nn0;
import defpackage.pl0;
import defpackage.py1;
import defpackage.qn5;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.y25;
import defpackage.zq3;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class FilterInterestKt {
    public static final void a(final int i, final Interest.FilterInterest filterInterest, final SaveHandler saveHandler, final ss2 ss2Var, final ss2 ss2Var2, final qs2 qs2Var, final gt2 gt2Var, Modifier modifier, Composer composer, final int i2, final int i3) {
        zq3.h(filterInterest, "interestData");
        zq3.h(saveHandler, "saveHandler");
        zq3.h(ss2Var, "assetHasBeenViewed");
        zq3.h(ss2Var2, "sendFilterTabSelectedInteraction");
        zq3.h(qs2Var, "sendFilterInterestImpression");
        zq3.h(gt2Var, "onAssetClick");
        Composer h = composer.h(-423142266);
        Modifier modifier2 = (i3 & 128) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-423142266, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterest (FilterInterest.kt:59)");
        }
        ww8 ww8Var = ww8.a;
        h.z(-620889277);
        boolean z = (((458752 & i2) ^ 196608) > 131072 && h.S(qs2Var)) || (i2 & 196608) == 131072;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new FilterInterestKt$FilterInterest$1$1(qs2Var, null);
            h.q(A);
        }
        h.R();
        py1.d(ww8Var, (gt2) A, h, 70);
        final List e = filterInterest.e();
        List list = e;
        final ArrayList arrayList = new ArrayList(i.w(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Interest.Filter) it2.next()).d());
        }
        final PagerState j = PagerStateKt.j(0, 0.0f, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestKt$FilterInterest$outerPagerState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Integer mo865invoke() {
                return Integer.valueOf(e.size());
            }
        }, h, 0, 3);
        h.z(773894976);
        h.z(-492369756);
        Object A2 = h.A();
        Composer.a aVar = Composer.a;
        if (A2 == aVar.a()) {
            e eVar = new e(py1.j(EmptyCoroutineContext.a, h));
            h.q(eVar);
            A2 = eVar;
        }
        h.R();
        final CoroutineScope a = ((e) A2).a();
        h.R();
        h.z(-620888981);
        Object A3 = h.A();
        if (A3 == aVar.a()) {
            A3 = b0.e(null, null, 2, null);
            h.q(A3);
        }
        final sy4 sy4Var = (sy4) A3;
        h.R();
        h.z(733328855);
        Alignment.a aVar2 = Alignment.a;
        rg4 g = BoxKt.g(aVar2.o(), false, h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(modifier2);
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
        Updater.c(a4, g, companion.e());
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        h.z(-483455358);
        Modifier.a aVar3 = Modifier.a;
        Arrangement arrangement = Arrangement.a;
        rg4 a5 = d.a(arrangement.g(), aVar2.k(), h, 0);
        h.z(-1323940314);
        int a6 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a7 = companion.a();
        it2 c2 = LayoutKt.c(aVar3);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a7);
        } else {
            h.p();
        }
        Composer a8 = Updater.a(h);
        Updater.c(a8, a5, companion.e());
        Updater.c(a8, o2, companion.g());
        gt2 b2 = companion.b();
        if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
            a8.q(Integer.valueOf(a6));
            a8.v(Integer.valueOf(a6), b2);
        }
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        int w = j.w();
        long a9 = eb5.Companion.b(h, 8).a();
        float g2 = bu1.g(2);
        ComposableSingletons$FilterInterestKt composableSingletons$FilterInterestKt = ComposableSingletons$FilterInterestKt.a;
        TabRowKt.a(w, null, a9, 0L, g2, composableSingletons$FilterInterestKt.a(), composableSingletons$FilterInterestKt.b(), zr0.b(h, 1689291562, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestKt$FilterInterest$2$1$1
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
                    b.S(1689291562, i4, -1, "com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterest.<anonymous>.<anonymous>.<anonymous> (FilterInterest.kt:80)");
                }
                List<String> list2 = arrayList;
                final PagerState pagerState = j;
                final CoroutineScope coroutineScope = a;
                final ss2 ss2Var3 = ss2Var2;
                int i5 = 0;
                for (Object obj : list2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        i.v();
                    }
                    final String str = (String) obj;
                    final int i7 = i5;
                    FilterInterestKt.b(pagerState, str, i5, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestKt$FilterInterest$2$1$1$1$1

                        @fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestKt$FilterInterest$2$1$1$1$1$1", f = "FilterInterest.kt", l = {89}, m = "invokeSuspend")
                        /* renamed from: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestKt$FilterInterest$2$1$1$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                            final /* synthetic */ PagerState $outerPagerState;
                            final /* synthetic */ ss2 $sendFilterTabSelectedInteraction;
                            final /* synthetic */ int $tabIndex;
                            final /* synthetic */ String $tabTitle;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(ss2 ss2Var, String str, PagerState pagerState, int i, by0 by0Var) {
                                super(2, by0Var);
                                this.$sendFilterTabSelectedInteraction = ss2Var;
                                this.$tabTitle = str;
                                this.$outerPagerState = pagerState;
                                this.$tabIndex = i;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final by0 create(Object obj, by0 by0Var) {
                                return new AnonymousClass1(this.$sendFilterTabSelectedInteraction, this.$tabTitle, this.$outerPagerState, this.$tabIndex, by0Var);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object h = a.h();
                                int i = this.label;
                                if (i == 0) {
                                    f.b(obj);
                                    this.$sendFilterTabSelectedInteraction.invoke(this.$tabTitle);
                                    PagerState pagerState = this.$outerPagerState;
                                    int i2 = this.$tabIndex;
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
                            m523invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m523invoke() {
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(ss2Var3, str, pagerState, i7, null), 3, null);
                        }
                    }, PaddingKt.m(Modifier.a, 0.0f, 0.0f, 0.0f, bu1.g(8), 7, null), composer2, 24576, 0);
                    i5 = i6;
                }
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 14376960, 10);
        PagerKt.a(j, SizeKt.d(aVar3, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, zr0.b(h, -1683283737, true, new kt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestKt$FilterInterest$2$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // defpackage.kt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((qn5) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return ww8.a;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x01dd  */
            /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(defpackage.qn5 r21, int r22, androidx.compose.runtime.Composer r23, int r24) {
                /*
                    Method dump skipped, instructions count: 481
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestKt$FilterInterest$2$1$2.invoke(qn5, int, androidx.compose.runtime.Composer, int):void");
            }
        }), h, 100663344, 384, 3836);
        h.R();
        h.t();
        h.R();
        h.R();
        PagerState pagerState = (PagerState) sy4Var.getValue();
        h.z(-620885779);
        if (pagerState != null) {
            Modifier m = PaddingKt.m(boxScopeInstance.c(SizeKt.h(SizeKt.w(aVar3, null, false, 3, null), 0.0f, 1, null), aVar2.b()), 0.0f, 0.0f, 0.0f, bu1.g(30), 7, null);
            Arrangement.f b3 = arrangement.b();
            h.z(693286680);
            rg4 a10 = m.a(b3, aVar2.l(), h, 6);
            h.z(-1323940314);
            int a11 = cs0.a(h, 0);
            et0 o3 = h.o();
            qs2 a12 = companion.a();
            it2 c3 = LayoutKt.c(m);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a12);
            } else {
                h.p();
            }
            Composer a13 = Updater.a(h);
            Updater.c(a13, a10, companion.e());
            Updater.c(a13, o3, companion.g());
            gt2 b4 = companion.b();
            if (a13.f() || !zq3.c(a13.A(), Integer.valueOf(a11))) {
                a13.q(Integer.valueOf(a11));
                a13.v(Integer.valueOf(a11), b4);
            }
            c3.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            n37 n37Var = n37.a;
            h.z(-451657254);
            int E = pagerState.E();
            int i4 = 0;
            while (i4 < E) {
                BoxKt.a(BackgroundKt.d(pl0.a(SizeKt.n(PaddingKt.k(Modifier.a, bu1.g(4), 0.0f, 2, null), bu1.g(8)), d37.f()), pagerState.w() == i4 ? ff8.b(bf8.a().l()) : nn0.r(ff8.b(bf8.a().l()), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), h, 0);
                i4++;
            }
            h.R();
            h.R();
            h.t();
            h.R();
            h.R();
            ww8 ww8Var2 = ww8.a;
        }
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
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestKt$FilterInterest$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    FilterInterestKt.a(i, filterInterest, saveHandler, ss2Var, ss2Var2, qs2Var, gt2Var, modifier3, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final androidx.compose.foundation.pager.PagerState r21, final java.lang.String r22, final int r23, final defpackage.qs2 r24, androidx.compose.ui.Modifier r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.interests.filter.FilterInterestKt.b(androidx.compose.foundation.pager.PagerState, java.lang.String, int, qs2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final y25 c(InterestAsset interestAsset, int i, String str) {
        zq3.h(interestAsset, "<this>");
        zq3.h(str, "filterName");
        String k = interestAsset.k();
        String j = interestAsset.j();
        InterestType interestType = InterestType.COLUMN;
        return new y25(k, AssetConstants.ARTICLE_TYPE, j, interestType.getType(), interestType.getType(), interestAsset.m(interestAsset), false, null, null, NavigationSource.YOU_TAB_FILTER, null, String.valueOf(i), "you tab", "interests-hub", str, "filter tap", null, null, null, 393472, null);
    }
}
