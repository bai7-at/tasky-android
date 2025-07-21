package com.nytimes.android.features.discovery.discoverysearch;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TabKt;
import androidx.compose.material.TabRowDefaults;
import androidx.compose.material.TabRowKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.j;
import androidx.paging.compose.LazyPagingItems;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.composable.SearchBarComposableKt;
import com.nytimes.android.features.discovery.discoverysearch.a;
import com.nytimes.android.unfear.nytdesignsystem.composable.DividerLayoutsKt;
import com.nytimes.android.utils.composeutils.AutoFocusKt;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import com.nytimes.android.utils.composeutils.nestedscroll.DirectionScrollObserverKt;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserverKt;
import com.nytimes.android.utils.snackbar.LocalSnackbarKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ag4;
import defpackage.ap0;
import defpackage.b00;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dy4;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.he7;
import defpackage.it2;
import defpackage.jr1;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kf8;
import defpackage.kt2;
import defpackage.pk6;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ts1;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class DiscoverySearchScreenKt {
    public static final void a(final jr1 jr1Var, final LazyPagingItems lazyPagingItems, final Set set, final a aVar, final String str, final ss2 ss2Var, final ss2 ss2Var2, final qs2 qs2Var, Modifier modifier, Composer composer, final int i, final int i2) {
        zq3.h(jr1Var, TransferTable.COLUMN_STATE);
        zq3.h(lazyPagingItems, "lazyItems");
        zq3.h(set, "recentlyViewed");
        zq3.h(aVar, "status");
        zq3.h(str, "searchText");
        zq3.h(ss2Var, "onValueChanged");
        zq3.h(ss2Var2, "onSetSortOption");
        zq3.h(qs2Var, "onCancel");
        Composer h = composer.h(85233009);
        Modifier modifier2 = (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(85233009, i, -1, "com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreen (DiscoverySearchScreen.kt:76)");
        }
        h.z(-619079108);
        Object A = h.A();
        Composer.a aVar2 = Composer.a;
        if (A == aVar2.a()) {
            A = b0.e(0, null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        final List o = i.o(k48.b(pk6.search_term_relevance, h, 0), k48.b(pk6.search_term_newest, h, 0), k48.b(pk6.search_term_oldest, h, 0));
        final SnackbarUtil snackbarUtil = (SnackbarUtil) h.m(LocalSnackbarKt.a());
        h.z(-619078823);
        boolean z = ((((458752 & i) ^ 196608) > 131072 && h.S(ss2Var)) || (196608 & i) == 131072) | ((((29360128 & i) ^ 12582912) > 8388608 && h.S(qs2Var)) || (i & 12582912) == 8388608);
        Object A2 = h.A();
        if (z || A2 == aVar2.a()) {
            A2 = new qs2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$DiscoverySearchScreen$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m365invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m365invoke() {
                    ss2.this.invoke("");
                    qs2Var.mo865invoke();
                }
            };
            h.q(A2);
        }
        h.R();
        BackHandlerKt.a(false, (qs2) A2, h, 0, 1);
        LazyDslKt.a(androidx.compose.ui.input.nestedscroll.a.b(androidx.compose.ui.input.nestedscroll.a.b(BackgroundKt.d(modifier2, eb5.Companion.a(h, 8).d(), null, 2, null), jr1Var.b(), null, 2, null), DirectionScrollObserverKt.a(h, 0), null, 2, null), jr1Var.a(), null, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$DiscoverySearchScreen$2
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
                final jr1 jr1Var2 = jr1Var;
                final qs2 qs2Var2 = qs2Var;
                final String str2 = str;
                final ss2 ss2Var3 = ss2Var;
                final sy4 sy4Var2 = sy4Var;
                final List<String> list = o;
                final ss2 ss2Var4 = ss2Var2;
                LazyListScope.c(lazyListScope, null, null, zr0.c(-215981432, true, new it2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$DiscoverySearchScreen$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i3) {
                        int b;
                        zq3.h(h04Var, "$this$stickyHeader");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-215981432, i3, -1, "com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreen.<anonymous>.<anonymous> (DiscoverySearchScreen.kt:99)");
                        }
                        Modifier b2 = ScrollObserverKt.b(Modifier.a, jr1.this.b());
                        eb5.a aVar3 = eb5.Companion;
                        Modifier d = BackgroundKt.d(b2, aVar3.a(composer2, 8).a(), null, 2, null);
                        final qs2 qs2Var3 = qs2Var2;
                        final String str3 = str2;
                        final ss2 ss2Var5 = ss2Var3;
                        final sy4 sy4Var3 = sy4Var2;
                        final List<String> list2 = list;
                        final ss2 ss2Var6 = ss2Var4;
                        composer2.z(-483455358);
                        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), composer2, 0);
                        composer2.z(-1323940314);
                        int a2 = cs0.a(composer2, 0);
                        et0 o2 = composer2.o();
                        ComposeUiNode.Companion companion = ComposeUiNode.F;
                        qs2 a3 = companion.a();
                        it2 c = LayoutKt.c(d);
                        if (composer2.j() == null) {
                            cs0.c();
                        }
                        composer2.G();
                        if (composer2.f()) {
                            composer2.D(a3);
                        } else {
                            composer2.p();
                        }
                        Composer a4 = Updater.a(composer2);
                        Updater.c(a4, a, companion.e());
                        Updater.c(a4, o2, companion.g());
                        gt2 b3 = companion.b();
                        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                            a4.q(Integer.valueOf(a2));
                            a4.v(Integer.valueOf(a2), b3);
                        }
                        c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                        composer2.z(2058660585);
                        ap0 ap0Var = ap0.a;
                        AutoFocusKt.a(qs2Var3, zr0.b(composer2, -221892862, true, new it2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$DiscoverySearchScreen$2$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            public final void b(b00 b00Var, Composer composer3, int i4) {
                                int i5;
                                zq3.h(b00Var, "$this$AutoFocus");
                                if ((i4 & 14) == 0) {
                                    i5 = i4 | (composer3.S(b00Var) ? 4 : 2);
                                } else {
                                    i5 = i4;
                                }
                                if ((i5 & 91) == 18 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (b.G()) {
                                    b.S(-221892862, i5, -1, "com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DiscoverySearchScreen.kt:105)");
                                }
                                long l = eb5.Companion.a(composer3, 8).l();
                                float f = 8;
                                Modifier l2 = PaddingKt.l(Modifier.a, bu1.g(f), bu1.g(16), bu1.g(f), bu1.g(4));
                                dy4 b4 = b00Var.b();
                                FocusRequester a5 = b00Var.a();
                                String str4 = str3;
                                composer3.z(-501456456);
                                boolean S = composer3.S(ss2Var5);
                                final ss2 ss2Var7 = ss2Var5;
                                Object A3 = composer3.A();
                                if (S || A3 == Composer.a.a()) {
                                    A3 = new ss2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$DiscoverySearchScreen$2$1$1$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.ss2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((String) obj);
                                            return ww8.a;
                                        }

                                        public final void invoke(String str5) {
                                            zq3.h(str5, "it");
                                            ss2.this.invoke(str5);
                                        }
                                    };
                                    composer3.q(A3);
                                }
                                composer3.R();
                                SearchBarComposableKt.a(str4, (ss2) A3, l2, qs2Var3, a5, false, false, null, l, null, null, false, 0, null, b4, composer3, 0, 0, 16096);
                                if (b.G()) {
                                    b.R();
                                }
                            }

                            @Override // defpackage.it2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                b((b00) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return ww8.a;
                            }
                        }), composer2, 48);
                        b = DiscoverySearchScreenKt.b(sy4Var3);
                        TabRowKt.b(b, null, aVar3.a(composer2, 8).a(), aVar3.a(composer2, 8).S(), zr0.b(composer2, 563017110, true, new it2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$DiscoverySearchScreen$2$1$1$2
                            {
                                super(3);
                            }

                            public final void b(List list3, Composer composer3, int i4) {
                                int b4;
                                zq3.h(list3, "tabPositions");
                                if (b.G()) {
                                    b.S(563017110, i4, -1, "com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DiscoverySearchScreen.kt:119)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.a;
                                Modifier.a aVar4 = Modifier.a;
                                b4 = DiscoverySearchScreenKt.b(sy4.this);
                                tabRowDefaults.b(tabRowDefaults.e(aVar4, (kf8) list3.get(b4)), 0.0f, 0L, composer3, TabRowDefaults.e << 9, 6);
                                if (b.G()) {
                                    b.R();
                                }
                            }

                            @Override // defpackage.it2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                b((List) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return ww8.a;
                            }
                        }), null, zr0.b(composer2, 1881548694, true, new gt2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$DiscoverySearchScreen$2$1$1$3
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
                                int b4;
                                if ((i4 & 11) == 2 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (b.G()) {
                                    b.S(1881548694, i4, -1, "com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DiscoverySearchScreen.kt:126)");
                                }
                                List<String> list3 = list2;
                                final ss2 ss2Var7 = ss2Var6;
                                final sy4 sy4Var4 = sy4Var3;
                                final int i5 = 0;
                                for (Object obj : list3) {
                                    int i6 = i5 + 1;
                                    if (i5 < 0) {
                                        i.v();
                                    }
                                    final String str4 = (String) obj;
                                    Modifier d2 = ModifierUtilsKt.d(Modifier.a, str4);
                                    b4 = DiscoverySearchScreenKt.b(sy4Var4);
                                    boolean z2 = b4 == i5;
                                    long a5 = eb5.Companion.a(composer3, 8).a();
                                    composer3.z(-34230033);
                                    boolean d3 = composer3.d(i5) | composer3.S(ss2Var7) | composer3.S(str4);
                                    Object A3 = composer3.A();
                                    if (d3 || A3 == Composer.a.a()) {
                                        A3 = new qs2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$DiscoverySearchScreen$2$1$1$3$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // defpackage.qs2
                                            /* renamed from: invoke */
                                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                m366invoke();
                                                return ww8.a;
                                            }

                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m366invoke() {
                                                DiscoverySearchScreenKt.c(sy4Var4, i5);
                                                ss2Var7.invoke(str4);
                                            }
                                        };
                                        composer3.q(A3);
                                    }
                                    composer3.R();
                                    TabKt.a(z2, (qs2) A3, d2, false, zr0.b(composer3, -459098398, true, new gt2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$DiscoverySearchScreen$2$1$1$3$1$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // defpackage.gt2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                            invoke((Composer) obj2, ((Number) obj3).intValue());
                                            return ww8.a;
                                        }

                                        public final void invoke(Composer composer4, int i7) {
                                            if ((i7 & 11) == 2 && composer4.i()) {
                                                composer4.K();
                                                return;
                                            }
                                            if (b.G()) {
                                                b.S(-459098398, i7, -1, "com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DiscoverySearchScreen.kt:130)");
                                            }
                                            j f = ag4.a.c(composer4, ag4.b).f();
                                            TextKt.c(str4, null, eb5.Companion.a(composer4, 8).l(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, f, composer4, 0, 0, 65530);
                                            if (b.G()) {
                                                b.R();
                                            }
                                        }
                                    }), null, null, a5, 0L, composer3, 24576, 360);
                                    i5 = i6;
                                    sy4Var4 = sy4Var4;
                                }
                                if (b.G()) {
                                    b.R();
                                }
                            }
                        }), composer2, 1597440, 34);
                        composer2.R();
                        composer2.t();
                        composer2.R();
                        composer2.R();
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
                a aVar3 = a.this;
                if (aVar3 instanceof a.b) {
                    LazyListScope.d(lazyListScope, null, null, ComposableSingletons$DiscoverySearchScreenKt.a.a(), 3, null);
                    return;
                }
                if (aVar3 instanceof a.c) {
                    LazyListScope.d(lazyListScope, null, null, ComposableSingletons$DiscoverySearchScreenKt.a.b(), 3, null);
                    snackbarUtil.o(false);
                    return;
                }
                if (aVar3 instanceof a.C0268a) {
                    LazyListScope.d(lazyListScope, null, null, ComposableSingletons$DiscoverySearchScreenKt.a.c(), 3, null);
                    SnackbarUtil.l(snackbarUtil, false, 1, null);
                } else if (aVar3 instanceof a.d) {
                    if (lazyPagingItems.g() == 0) {
                        LazyListScope.d(lazyListScope, null, null, ComposableSingletons$DiscoverySearchScreenKt.a.d(), 3, null);
                        return;
                    }
                    int g = lazyPagingItems.g();
                    final LazyPagingItems lazyPagingItems2 = lazyPagingItems;
                    final Set<String> set2 = set;
                    LazyListScope.e(lazyListScope, g, null, null, zr0.c(2067017681, true, new kt2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$DiscoverySearchScreen$2.2
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
                            zq3.h(h04Var, "$this$items");
                            if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                                i4 |= composer2.d(i3) ? 32 : 16;
                            }
                            if ((i4 & 721) == 144 && composer2.i()) {
                                composer2.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(2067017681, i4, -1, "com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreen.<anonymous>.<anonymous> (DiscoverySearchScreen.kt:178)");
                            }
                            he7 he7Var = (he7) LazyPagingItems.this.f(i3);
                            if (he7Var != null) {
                                if (set2.contains(he7Var.j())) {
                                    he7Var.n(true);
                                }
                                composer2.z(-483455358);
                                Modifier.a aVar4 = Modifier.a;
                                rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), composer2, 0);
                                composer2.z(-1323940314);
                                int a2 = cs0.a(composer2, 0);
                                et0 o2 = composer2.o();
                                ComposeUiNode.Companion companion = ComposeUiNode.F;
                                qs2 a3 = companion.a();
                                it2 c = LayoutKt.c(aVar4);
                                if (composer2.j() == null) {
                                    cs0.c();
                                }
                                composer2.G();
                                if (composer2.f()) {
                                    composer2.D(a3);
                                } else {
                                    composer2.p();
                                }
                                Composer a4 = Updater.a(composer2);
                                Updater.c(a4, a, companion.e());
                                Updater.c(a4, o2, companion.g());
                                gt2 b = companion.b();
                                if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                                    a4.q(Integer.valueOf(a2));
                                    a4.v(Integer.valueOf(a2), b);
                                }
                                c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                                composer2.z(2058660585);
                                ap0 ap0Var = ap0.a;
                                SearchResultComposablesKt.b(he7Var, null, null, composer2, 8, 6);
                                DividerLayoutsKt.a(fb5.a.c(), null, composer2, ts1.c, 2);
                                composer2.R();
                                composer2.t();
                                composer2.R();
                                composer2.R();
                            }
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), 6, null);
                }
            }
        }, h, 0, 252);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$DiscoverySearchScreen$3
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
                    DiscoverySearchScreenKt.a(jr1.this, lazyPagingItems, set, aVar, str, ss2Var, ss2Var2, qs2Var, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(sy4 sy4Var) {
        return ((Number) sy4Var.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sy4 sy4Var, int i) {
        sy4Var.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Composer composer, final int i) {
        Composer composer2;
        Composer h = composer.h(-385871511);
        if (i == 0 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-385871511, i, -1, "com.nytimes.android.features.discovery.discoverysearch.Empty (DiscoverySearchScreen.kt:193)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier h2 = SizeKt.h(PaddingKt.m(aVar, 0.0f, bu1.g(128), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            Alignment e = Alignment.a.e();
            h.z(733328855);
            rg4 g = BoxKt.g(e, false, h, 6);
            h.z(-1323940314);
            int a = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 c = LayoutKt.c(h2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a2);
            } else {
                h.p();
            }
            Composer a3 = Updater.a(h);
            Updater.c(a3, g, companion.e());
            Updater.c(a3, o, companion.g());
            gt2 b = companion.b();
            if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
                a3.q(Integer.valueOf(a));
                a3.v(Integer.valueOf(a), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            Modifier d = ModifierUtilsKt.d(aVar, "Search empty watermark");
            composer2 = h;
            TextKt.c(k48.b(pk6.search_empty, h, 0), d, eb5.Companion.a(h, 8).p(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131064);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$Empty$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i2) {
                    DiscoverySearchScreenKt.d(composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Composer composer, final int i) {
        Composer h = composer.h(-1891058662);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1891058662, i, -1, "com.nytimes.android.features.discovery.discoverysearch.Loading (DiscoverySearchScreen.kt:224)");
            }
            Modifier h2 = SizeKt.h(PaddingKt.m(Modifier.a, 0.0f, bu1.g(128), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            Alignment e = Alignment.a.e();
            h.z(733328855);
            rg4 g = BoxKt.g(e, false, h, 6);
            h.z(-1323940314);
            int a = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 c = LayoutKt.c(h2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a2);
            } else {
                h.p();
            }
            Composer a3 = Updater.a(h);
            Updater.c(a3, g, companion.e());
            Updater.c(a3, o, companion.g());
            gt2 b = companion.b();
            if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
                a3.q(Integer.valueOf(a));
                a3.v(Integer.valueOf(a), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            ProgressIndicatorKt.a(null, 0L, 0.0f, 0L, 0, h, 0, 31);
            h.R();
            h.t();
            h.R();
            h.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$Loading$2
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
                    DiscoverySearchScreenKt.e(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Composer composer, final int i) {
        Composer composer2;
        Composer h = composer.h(-1769246061);
        if (i == 0 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1769246061, i, -1, "com.nytimes.android.features.discovery.discoverysearch.Offline (DiscoverySearchScreen.kt:209)");
            }
            Modifier h2 = SizeKt.h(PaddingKt.m(Modifier.a, 0.0f, bu1.g(128), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            Alignment e = Alignment.a.e();
            h.z(733328855);
            rg4 g = BoxKt.g(e, false, h, 6);
            h.z(-1323940314);
            int a = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 c = LayoutKt.c(h2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a2);
            } else {
                h.p();
            }
            Composer a3 = Updater.a(h);
            Updater.c(a3, g, companion.e());
            Updater.c(a3, o, companion.g());
            gt2 b = companion.b();
            if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
                a3.q(Integer.valueOf(a));
                a3.v(Integer.valueOf(a), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            composer2 = h;
            TextKt.c(k48.b(pk6.search_device_offline, h, 0), null, eb5.Companion.a(h, 8).p(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131066);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt$Offline$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i2) {
                    DiscoverySearchScreenKt.f(composer3, gt6.a(i | 1));
                }
            });
        }
    }

    public static final jr1 l(float f, ScrollObserver scrollObserver, LazyListState lazyListState, Composer composer, int i, int i2) {
        composer.z(-1568307187);
        if ((i2 & 2) != 0) {
            scrollObserver = ScrollObserverKt.c(bu1.g(f + bu1.g(4)), 0.0f, composer, 0, 2);
        }
        if ((i2 & 4) != 0) {
            lazyListState = LazyListStateKt.c(0, 0, composer, 0, 3);
        }
        if (b.G()) {
            b.S(-1568307187, i, -1, "com.nytimes.android.features.discovery.discoverysearch.rememberDiscoverySearchState (DiscoverySearchScreen.kt:52)");
        }
        composer.z(-53366108);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = new jr1(scrollObserver, lazyListState);
            composer.q(A);
        }
        jr1 jr1Var = (jr1) A;
        composer.R();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return jr1Var;
    }
}
