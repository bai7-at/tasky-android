package com.nytimes.android.ribbon.destinations.wirecutter;

import androidx.activity.ComponentActivity;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Modifier;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.ribbon.composable.ComposableSingletons$XpnModuleKt;
import com.nytimes.android.ribbon.composable.XpnHandoffKt;
import com.nytimes.android.ribbon.composable.XpnModuleKt;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.et2.Key;
import com.nytimes.android.tpl.TPLSize;
import defpackage.c58;
import defpackage.ei9;
import defpackage.fi9;
import defpackage.fm9;
import defpackage.gi9;
import defpackage.gt2;
import defpackage.h04;
import defpackage.it2;
import defpackage.ji9;
import defpackage.kt2;
import defpackage.mt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xe6;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class WirecutterDestinationKt$WirecutterDestination$4 extends Lambda implements it2 {
    final /* synthetic */ ComponentActivity $activity;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ fm9 $tracker;
    final /* synthetic */ WirecutterViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WirecutterDestinationKt$WirecutterDestination$4(fm9 fm9Var, Modifier modifier, LazyListState lazyListState, WirecutterViewModel wirecutterViewModel, ComponentActivity componentActivity) {
        super(3);
        this.$tracker = fm9Var;
        this.$modifier = modifier;
        this.$listState = lazyListState;
        this.$viewModel = wirecutterViewModel;
        this.$activity = componentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(WirecutterViewModel wirecutterViewModel, Key key, int i, String str, int i2, ei9 ei9Var) {
        String f = ei9Var.f();
        String g = ei9Var.g();
        if (g == null) {
            g = "";
        }
        wirecutterViewModel.x(key, i, str, i2, "", g, f, ei9Var.a());
    }

    public final void c(final ji9 ji9Var, Composer composer, int i) {
        zq3.h(ji9Var, "viewState");
        if (b.G()) {
            b.S(151637071, i, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestination.<anonymous> (WirecutterDestination.kt:54)");
        }
        fm9 fm9Var = this.$tracker;
        if (fm9Var != null) {
            fm9Var.m(RibbonConfig.WIRECUTTER.getId());
        }
        final WirecutterViewModel wirecutterViewModel = this.$viewModel;
        final ComponentActivity componentActivity = this.$activity;
        final kt2 kt2Var = new kt2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt$WirecutterDestination$4$onClickItem$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void b(int i2, String str, int i3, ei9 ei9Var) {
                zq3.h(str, "blockLabel");
                zq3.h(ei9Var, "data");
                WirecutterViewModel.this.s(componentActivity, gi9.a(ei9Var, i2, str, i3));
            }

            @Override // defpackage.kt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                b(((Number) obj).intValue(), (String) obj2, ((Number) obj3).intValue(), (ei9) obj4);
                return ww8.a;
            }
        };
        Modifier modifier = this.$modifier;
        final LazyListState lazyListState = this.$listState;
        final WirecutterViewModel wirecutterViewModel2 = this.$viewModel;
        final ComponentActivity componentActivity2 = this.$activity;
        LazyDslKt.a(modifier, lazyListState, null, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt$WirecutterDestination$4.1
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
                boolean z;
                zq3.h(lazyListScope, "$this$LazyColumn");
                final int i2 = 1;
                if (ji9.this.c().isEmpty()) {
                    z = true;
                } else {
                    final ei9 ei9Var = (ei9) i.k0(ji9.this.c());
                    List e0 = i.e0(ji9.this.c(), 1);
                    String g = ei9Var.g();
                    if (g == null) {
                        g = "";
                    }
                    Key key = new Key(g);
                    final WirecutterViewModel wirecutterViewModel3 = wirecutterViewModel2;
                    final int i3 = 0;
                    final String str = "heroArticle";
                    ss2 ss2Var = new ss2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(Key key2) {
                            zq3.h(key2, TransferTable.COLUMN_KEY);
                            WirecutterDestinationKt$WirecutterDestination$4.d(wirecutterViewModel3, key2, i3, str, 0, ei9Var);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((Key) obj);
                            return ww8.a;
                        }
                    };
                    LazyListState lazyListState2 = lazyListState;
                    final WirecutterViewModel wirecutterViewModel4 = wirecutterViewModel2;
                    qs2 qs2Var = new qs2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.2
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final Boolean mo865invoke() {
                            return Boolean.valueOf(WirecutterViewModel.this.q());
                        }
                    };
                    final kt2 kt2Var2 = kt2Var;
                    XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : null, (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, key, ss2Var, lazyListState2, qs2Var, zr0.c(1930100687, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(h04 h04Var, Composer composer2, int i4) {
                            zq3.h(h04Var, "$this$xpnModule");
                            if ((i4 & 81) == 16 && composer2.i()) {
                                composer2.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(1930100687, i4, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestination.<anonymous>.<anonymous>.<anonymous> (WirecutterDestination.kt:107)");
                            }
                            final ei9 ei9Var2 = ei9.this;
                            final kt2 kt2Var3 = kt2Var2;
                            final int i5 = i3;
                            final String str2 = str;
                            WirecutterLockupsKt.b(ei9Var2, new qs2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m740invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m740invoke() {
                                    kt2.this.invoke(Integer.valueOf(i5), str2, 0, ei9Var2);
                                }
                            }, null, composer2, 8, 4);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }));
                    AnonymousClass4 anonymousClass4 = new gt2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.4
                        public final Key b(int i4, ei9 ei9Var2) {
                            zq3.h(ei9Var2, "item");
                            String g2 = ei9Var2.g();
                            if (g2 == null) {
                                g2 = "";
                            }
                            return new Key(g2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return b(((Number) obj).intValue(), (ei9) obj2);
                        }
                    };
                    final WirecutterViewModel wirecutterViewModel5 = wirecutterViewModel2;
                    final String str2 = "topListArticles";
                    it2 it2Var = new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        public final void b(Key key2, int i4, ei9 ei9Var2) {
                            zq3.h(key2, TransferTable.COLUMN_KEY);
                            zq3.h(ei9Var2, "data");
                            WirecutterDestinationKt$WirecutterDestination$4.d(wirecutterViewModel5, key2, i2, str2, i4, ei9Var2);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            b((Key) obj, ((Number) obj2).intValue(), (ei9) obj3);
                            return ww8.a;
                        }
                    };
                    LazyListState lazyListState3 = lazyListState;
                    final WirecutterViewModel wirecutterViewModel6 = wirecutterViewModel2;
                    qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.6
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final Boolean mo865invoke() {
                            return Boolean.valueOf(WirecutterViewModel.this.q());
                        }
                    };
                    final kt2 kt2Var3 = kt2Var;
                    z = true;
                    XpnModuleKt.c(lazyListScope, e0, (r25 & 2) != 0 ? null : null, (r25 & 4) != 0 ? ComposableSingletons$XpnModuleKt.a.a() : null, (r25 & 8) != 0 ? false : true, (r25 & 16) != 0 ? false : false, (r25 & 32) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, anonymousClass4, it2Var, lazyListState3, qs2Var2, zr0.c(-98138507, true, new mt2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(5);
                        }

                        public final void b(h04 h04Var, final int i4, final ei9 ei9Var2, Composer composer2, int i5) {
                            zq3.h(h04Var, "$this$xpnListModule");
                            zq3.h(ei9Var2, "data");
                            if (b.G()) {
                                b.S(-98138507, i5, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestination.<anonymous>.<anonymous>.<anonymous> (WirecutterDestination.kt:127)");
                            }
                            final kt2 kt2Var4 = kt2.this;
                            final int i6 = i2;
                            final String str3 = str2;
                            WirecutterLockupsKt.c(ei9Var2, new qs2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.7.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m741invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m741invoke() {
                                    kt2.this.invoke(Integer.valueOf(i6), str3, Integer.valueOf(i4), ei9Var2);
                                }
                            }, null, composer2, 8, 4);
                            if (b.G()) {
                                b.R();
                            }
                        }

                        @Override // defpackage.mt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                            b((h04) obj, ((Number) obj2).intValue(), (ei9) obj3, (Composer) obj4, ((Number) obj5).intValue());
                            return ww8.a;
                        }
                    }));
                }
                if (ji9.this.a() != null) {
                    Key key2 = new Key("Sign up for The Recommendation");
                    it2 a = ComposableSingletons$WirecutterDestinationKt.a.a();
                    final WirecutterViewModel wirecutterViewModel7 = wirecutterViewModel2;
                    ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.8
                        {
                            super(1);
                        }

                        public final void b(Key key3) {
                            zq3.h(key3, TransferTable.COLUMN_KEY);
                            WirecutterViewModel.this.z(key3);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((Key) obj);
                            return ww8.a;
                        }
                    };
                    LazyListState lazyListState4 = lazyListState;
                    final WirecutterViewModel wirecutterViewModel8 = wirecutterViewModel2;
                    qs2 qs2Var3 = new qs2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.9
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final Boolean mo865invoke() {
                            return Boolean.valueOf(WirecutterViewModel.this.q());
                        }
                    };
                    final ji9 ji9Var2 = ji9.this;
                    final WirecutterViewModel wirecutterViewModel9 = wirecutterViewModel2;
                    XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : a, (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, key2, ss2Var2, lazyListState4, qs2Var3, zr0.c(1709472120, z, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(h04 h04Var, Composer composer2, int i4) {
                            zq3.h(h04Var, "$this$xpnModule");
                            if ((i4 & 81) == 16 && composer2.i()) {
                                composer2.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(1709472120, i4, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestination.<anonymous>.<anonymous>.<anonymous> (WirecutterDestination.kt:165)");
                            }
                            fi9 a2 = ji9.this.a();
                            boolean booleanValue = ((Boolean) y.b(wirecutterViewModel9.r(), null, composer2, 8, 1).getValue()).booleanValue();
                            fi9 fi9Var = new fi9(a2.c(), a2.b(), a2.d(), a2.a());
                            final WirecutterViewModel wirecutterViewModel10 = wirecutterViewModel9;
                            WirecutterLockupsKt.d(fi9Var, booleanValue, new ss2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.10.1
                                {
                                    super(1);
                                }

                                @Override // defpackage.ss2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((String) obj);
                                    return ww8.a;
                                }

                                public final void invoke(String str3) {
                                    zq3.h(str3, "newsletterCode");
                                    WirecutterViewModel.this.A(str3);
                                }
                            }, null, composer2, 0, 8);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }));
                }
                List b = ji9.this.b();
                ComposableSingletons$WirecutterDestinationKt composableSingletons$WirecutterDestinationKt = ComposableSingletons$WirecutterDestinationKt.a;
                gt2 b2 = composableSingletons$WirecutterDestinationKt.b();
                AnonymousClass11 anonymousClass11 = new gt2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.11
                    public final Key b(int i4, ei9 ei9Var2) {
                        zq3.h(ei9Var2, "item");
                        String g2 = ei9Var2.g();
                        if (g2 == null) {
                            g2 = "";
                        }
                        return new Key(g2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return b(((Number) obj).intValue(), (ei9) obj2);
                    }
                };
                final WirecutterViewModel wirecutterViewModel10 = wirecutterViewModel2;
                final int i4 = 2;
                final String str3 = "bottomListArticles";
                it2 it2Var2 = new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final void b(Key key3, int i5, ei9 ei9Var2) {
                        zq3.h(key3, TransferTable.COLUMN_KEY);
                        zq3.h(ei9Var2, "data");
                        WirecutterDestinationKt$WirecutterDestination$4.d(wirecutterViewModel10, key3, i4, str3, i5, ei9Var2);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        b((Key) obj, ((Number) obj2).intValue(), (ei9) obj3);
                        return ww8.a;
                    }
                };
                LazyListState lazyListState5 = lazyListState;
                final WirecutterViewModel wirecutterViewModel11 = wirecutterViewModel2;
                qs2 qs2Var4 = new qs2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.13
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Boolean mo865invoke() {
                        return Boolean.valueOf(WirecutterViewModel.this.q());
                    }
                };
                final kt2 kt2Var4 = kt2Var;
                XpnModuleKt.c(lazyListScope, b, (r25 & 2) != 0 ? null : null, (r25 & 4) != 0 ? ComposableSingletons$XpnModuleKt.a.a() : b2, (r25 & 8) != 0 ? false : true, (r25 & 16) != 0 ? false : false, (r25 & 32) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, anonymousClass11, it2Var2, lazyListState5, qs2Var4, zr0.c(749762480, z, new mt2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.14
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(5);
                    }

                    public final void b(h04 h04Var, final int i5, final ei9 ei9Var2, Composer composer2, int i6) {
                        zq3.h(h04Var, "$this$xpnListModule");
                        zq3.h(ei9Var2, "data");
                        if (b.G()) {
                            b.S(749762480, i6, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestination.<anonymous>.<anonymous>.<anonymous> (WirecutterDestination.kt:190)");
                        }
                        final kt2 kt2Var5 = kt2.this;
                        final int i7 = i4;
                        final String str4 = str3;
                        WirecutterLockupsKt.a(ei9Var2, new qs2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.14.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m738invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m738invoke() {
                                kt2.this.invoke(Integer.valueOf(i7), str4, Integer.valueOf(i5), ei9Var2);
                            }
                        }, null, composer2, 8, 4);
                        if (b.G()) {
                            b.R();
                        }
                    }

                    @Override // defpackage.mt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        b((h04) obj, ((Number) obj2).intValue(), (ei9) obj3, (Composer) obj4, ((Number) obj5).intValue());
                        return ww8.a;
                    }
                }));
                Key b3 = c58.g.a.b();
                final WirecutterViewModel wirecutterViewModel12 = wirecutterViewModel2;
                ss2 ss2Var3 = new ss2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.15
                    {
                        super(1);
                    }

                    public final void b(Key key3) {
                        zq3.h(key3, "it");
                        WirecutterViewModel.this.w(key3);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((Key) obj);
                        return ww8.a;
                    }
                };
                LazyListState lazyListState6 = lazyListState;
                final WirecutterViewModel wirecutterViewModel13 = wirecutterViewModel2;
                qs2 qs2Var5 = new qs2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.16
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Boolean mo865invoke() {
                        return Boolean.valueOf(WirecutterViewModel.this.q());
                    }
                };
                final WirecutterViewModel wirecutterViewModel14 = wirecutterViewModel2;
                final ComponentActivity componentActivity3 = componentActivity2;
                XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : null, (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, b3, ss2Var3, lazyListState6, qs2Var5, zr0.c(1308752266, z, new it2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.17
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i5) {
                        zq3.h(h04Var, "$this$xpnModule");
                        if ((i5 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1308752266, i5, -1, "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestination.<anonymous>.<anonymous>.<anonymous> (WirecutterDestination.kt:223)");
                        }
                        int i6 = xe6.ic_wirecutter_logo;
                        final WirecutterViewModel wirecutterViewModel15 = WirecutterViewModel.this;
                        final ComponentActivity componentActivity4 = componentActivity3;
                        XpnHandoffKt.d("Search product recommendations and reviews based on real-world testing.", null, i6, "Go to Wirecutter", new qs2() { // from class: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterDestinationKt.WirecutterDestination.4.1.17.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m739invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m739invoke() {
                                WirecutterViewModel.this.p(componentActivity4);
                            }
                        }, null, composer2, 3126, 32);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
                LazyListScope.d(lazyListScope, null, null, composableSingletons$WirecutterDestinationKt.c(), 3, null);
            }
        }, composer, 0, 252);
        if (b.G()) {
            b.R();
        }
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        c((ji9) obj, (Composer) obj2, ((Number) obj3).intValue());
        return ww8.a;
    }
}
