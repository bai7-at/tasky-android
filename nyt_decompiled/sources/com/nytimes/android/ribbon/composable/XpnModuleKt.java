package com.nytimes.android.ribbon.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.comscore.streaming.ContentType;
import com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt;
import com.nytimes.android.ribbon.et2.Key;
import com.nytimes.android.tpl.TPLSize;
import defpackage.gt2;
import defpackage.h04;
import defpackage.it2;
import defpackage.kt2;
import defpackage.mt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tx1;
import defpackage.ww8;
import defpackage.zl9;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public abstract class XpnModuleKt {
    public static final void a(LazyListScope lazyListScope, final List list, final it2 it2Var, final gt2 gt2Var, final boolean z, final float f, final Arrangement.e eVar, final qs2 qs2Var, final gt2 gt2Var2, final it2 it2Var2, final gt2 gt2Var3, final mt2 mt2Var) {
        zq3.h(lazyListScope, "$this$xpnCarouselModule");
        zq3.h(list, "items");
        zq3.h(gt2Var, "divider");
        zq3.h(eVar, "horizontalArrangement");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(gt2Var2, TransferTable.COLUMN_KEY);
        zq3.h(it2Var2, "onView");
        zq3.h(gt2Var3, "listState");
        zq3.h(mt2Var, "itemContent");
        if (it2Var != null) {
            LazyListScope.d(lazyListScope, null, null, zr0.c(703954503, true, new it2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnCarouselModule$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(h04 h04Var, Composer composer, int i) {
                    zq3.h(h04Var, "$this$item");
                    if ((i & 14) == 0) {
                        i |= composer.S(h04Var) ? 4 : 2;
                    }
                    if ((i & 91) == 18 && composer.i()) {
                        composer.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(703954503, i, -1, "com.nytimes.android.ribbon.composable.xpnCarouselModule.<anonymous> (XpnModule.kt:102)");
                    }
                    composer.z(400573138);
                    if (z) {
                        gt2Var.invoke(composer, 0);
                    }
                    composer.R();
                    SpacerKt.a(SizeKt.n(Modifier.a, f), composer, 0);
                    it2Var.invoke(h04Var, composer, Integer.valueOf(i & 14));
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), 3, null);
        }
        LazyListScope.d(lazyListScope, null, null, zr0.c(521105708, true, new it2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnCarouselModule$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(h04 h04Var, Composer composer, int i) {
                zq3.h(h04Var, "$this$item");
                if ((i & 81) == 16 && composer.i()) {
                    composer.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(521105708, i, -1, "com.nytimes.android.ribbon.composable.xpnCarouselModule.<anonymous> (XpnModule.kt:111)");
                }
                final LazyListState lazyListState = (LazyListState) gt2.this.invoke(composer, 0);
                final List<Object> list2 = list;
                final gt2 gt2Var4 = gt2Var2;
                final qs2 qs2Var2 = qs2Var;
                final mt2 mt2Var2 = mt2Var;
                final it2 it2Var3 = it2Var2;
                XpnCarouselKt.a(new ss2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnCarouselModule$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LazyListScope) obj);
                        return ww8.a;
                    }

                    public final void invoke(LazyListScope lazyListScope2) {
                        zq3.h(lazyListScope2, "$this$XpnCarousel");
                        final List<Object> list3 = list2;
                        final gt2 gt2Var5 = gt2Var4;
                        final LazyListState lazyListState2 = lazyListState;
                        final qs2 qs2Var3 = qs2Var2;
                        final mt2 mt2Var3 = mt2Var2;
                        final it2 it2Var4 = it2Var3;
                        lazyListScope2.b(list3.size(), gt2Var5 != null ? new ss2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnCarouselModule$2$1$invoke$$inlined$itemsIndexed$default$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final Object invoke(int i2) {
                                return gt2.this.invoke(Integer.valueOf(i2), list3.get(i2));
                            }
                        } : null, new ss2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnCarouselModule$2$1$invoke$$inlined$itemsIndexed$default$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final Object invoke(int i2) {
                                list3.get(i2);
                                return null;
                            }
                        }, zr0.c(-1091073711, true, new kt2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnCarouselModule$2$1$invoke$$inlined$itemsIndexed$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // defpackage.kt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                return ww8.a;
                            }

                            public final void invoke(h04 h04Var2, final int i2, Composer composer2, int i3) {
                                int i4;
                                if ((i3 & 14) == 0) {
                                    i4 = i3 | (composer2.S(h04Var2) ? 4 : 2);
                                } else {
                                    i4 = i3;
                                }
                                if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                                    i4 |= composer2.d(i2) ? 32 : 16;
                                }
                                int i5 = i4;
                                if ((i5 & 731) == 146 && composer2.i()) {
                                    composer2.K();
                                    return;
                                }
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.S(-1091073711, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                                }
                                final Object obj = list3.get(i2);
                                final Key key = (Key) gt2Var5.invoke(Integer.valueOf(i2), obj);
                                LazyListState lazyListState3 = lazyListState2;
                                XpnModuleKt$xpnCarouselModule$2$1$1$1 xpnModuleKt$xpnCarouselModule$2$1$1$1 = new ss2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnCarouselModule$2$1$1$1
                                    @Override // defpackage.ss2
                                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(tx1 tx1Var) {
                                        zq3.h(tx1Var, "it");
                                        return Boolean.valueOf(tx1Var.h() instanceof zl9);
                                    }
                                };
                                qs2 qs2Var4 = qs2Var3;
                                final it2 it2Var5 = it2Var4;
                                ItemImpressionKt.a(key, lazyListState3, xpnModuleKt$xpnCarouselModule$2$1$1$1, qs2Var4, new qs2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnCarouselModule$2$1$1$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m656invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m656invoke() {
                                        it2.this.invoke(key, Integer.valueOf(i2), obj);
                                    }
                                }, composer2, 384, 0);
                                mt2Var3.invoke(h04Var2, Integer.valueOf(i2), obj, composer2, Integer.valueOf(i5 & WebSocketProtocol.PAYLOAD_SHORT));
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.R();
                                }
                            }
                        }));
                    }
                }, null, null, eVar, lazyListState, composer, 0, 6);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), 3, null);
    }

    public static final void c(LazyListScope lazyListScope, final List list, final it2 it2Var, final gt2 gt2Var, final boolean z, final boolean z2, final float f, final gt2 gt2Var2, final it2 it2Var2, final LazyListState lazyListState, final qs2 qs2Var, final mt2 mt2Var) {
        zq3.h(lazyListScope, "$this$xpnListModule");
        zq3.h(list, "items");
        zq3.h(gt2Var, "divider");
        zq3.h(gt2Var2, TransferTable.COLUMN_KEY);
        zq3.h(it2Var2, "onView");
        zq3.h(lazyListState, "listState");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(mt2Var, "itemContent");
        if (it2Var != null) {
            LazyListScope.d(lazyListScope, null, null, zr0.c(-1974166868, true, new it2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnListModule$1
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(h04 h04Var, Composer composer, int i) {
                    zq3.h(h04Var, "$this$item");
                    if ((i & 14) == 0) {
                        i |= composer.S(h04Var) ? 4 : 2;
                    }
                    if ((i & 91) == 18 && composer.i()) {
                        composer.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(-1974166868, i, -1, "com.nytimes.android.ribbon.composable.xpnListModule.<anonymous> (XpnModule.kt:51)");
                    }
                    it2.this.invoke(h04Var, composer, Integer.valueOf(i & 14));
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), 3, null);
        }
        lazyListScope.b(list.size(), new ss2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnListModule-V-95POc$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return gt2.this.invoke(Integer.valueOf(i), list.get(i));
            }
        }, new ss2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnListModule-V-95POc$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, zr0.c(-1091073711, true, new kt2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnListModule-V-95POc$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // defpackage.kt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return ww8.a;
            }

            public final void invoke(h04 h04Var, final int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 14) == 0) {
                    i3 = i2 | (composer.S(h04Var) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                    i3 |= composer.d(i) ? 32 : 16;
                }
                int i4 = i3;
                if ((i4 & 731) == 146 && composer.i()) {
                    composer.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                }
                final Object obj = list.get(i);
                composer.z(1752064632);
                if (i != 0 || z) {
                    gt2Var.invoke(composer, 0);
                }
                composer.R();
                final Key key = (Key) gt2Var2.invoke(Integer.valueOf(i), obj);
                LazyListState lazyListState2 = lazyListState;
                XpnModuleKt$xpnListModule$2$1 xpnModuleKt$xpnListModule$2$1 = new ss2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnListModule$2$1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(tx1 tx1Var) {
                        zq3.h(tx1Var, "it");
                        return Boolean.valueOf(tx1Var.h() instanceof zl9);
                    }
                };
                qs2 qs2Var2 = qs2Var;
                final it2 it2Var3 = it2Var2;
                ItemImpressionKt.a(key, lazyListState2, xpnModuleKt$xpnListModule$2$1, qs2Var2, new qs2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnListModule$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m657invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m657invoke() {
                        it2.this.invoke(key, Integer.valueOf(i), obj);
                    }
                }, composer, 384, 0);
                composer.z(1752065039);
                if (!z2) {
                    SpacerKt.a(SizeKt.n(Modifier.a, TPLSize.spacing1_5.m765getValueD9Ej5fM()), composer, 0);
                }
                composer.R();
                mt2Var.invoke(h04Var, Integer.valueOf(i), obj, composer, Integer.valueOf(i4 & WebSocketProtocol.PAYLOAD_SHORT));
                if (!z2) {
                    SpacerKt.a(SizeKt.n(Modifier.a, f), composer, 0);
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }));
    }

    public static final void e(LazyListScope lazyListScope, final it2 it2Var, final float f, final Key key, final ss2 ss2Var, final LazyListState lazyListState, final qs2 qs2Var, final it2 it2Var2) {
        zq3.h(lazyListScope, "$this$xpnModule");
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(ss2Var, "onView");
        zq3.h(lazyListState, "listState");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(it2Var2, "itemContent");
        if (it2Var != null) {
            LazyListScope.d(lazyListScope, null, null, zr0.c(626083819, true, new it2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnModule$1
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(h04 h04Var, Composer composer, int i) {
                    zq3.h(h04Var, "$this$item");
                    if ((i & 14) == 0) {
                        i |= composer.S(h04Var) ? 4 : 2;
                    }
                    if ((i & 91) == 18 && composer.i()) {
                        composer.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(626083819, i, -1, "com.nytimes.android.ribbon.composable.xpnModule.<anonymous> (XpnModule.kt:162)");
                    }
                    it2.this.invoke(h04Var, composer, Integer.valueOf(i & 14));
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), 3, null);
        }
        LazyListScope.d(lazyListScope, key, null, zr0.c(-1862828464, true, new it2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnModule$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(h04 h04Var, Composer composer, int i) {
                zq3.h(h04Var, "$this$item");
                if ((i & 14) == 0) {
                    i |= composer.S(h04Var) ? 4 : 2;
                }
                if ((i & 91) == 18 && composer.i()) {
                    composer.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-1862828464, i, -1, "com.nytimes.android.ribbon.composable.xpnModule.<anonymous> (XpnModule.kt:167)");
                }
                Key key2 = Key.this;
                LazyListState lazyListState2 = lazyListState;
                AnonymousClass1 anonymousClass1 = new ss2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnModule$2.1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(tx1 tx1Var) {
                        zq3.h(tx1Var, "it");
                        return Boolean.valueOf(tx1Var.h() instanceof zl9);
                    }
                };
                qs2 qs2Var2 = qs2Var;
                composer.z(1103131416);
                boolean S = composer.S(ss2Var) | composer.S(Key.this);
                final ss2 ss2Var2 = ss2Var;
                final Key key3 = Key.this;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.ribbon.composable.XpnModuleKt$xpnModule$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m658invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m658invoke() {
                            ss2.this.invoke(key3);
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                ItemImpressionKt.a(key2, lazyListState2, anonymousClass1, qs2Var2, (qs2) A, composer, 384, 0);
                it2Var2.invoke(h04Var, composer, Integer.valueOf(i & 14));
                SpacerKt.a(SizeKt.n(Modifier.a, f), composer, 0);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), 2, null);
    }
}
