package com.nytimes.android.features.settings.legal;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.o;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.ui.NytColor;
import defpackage.ag4;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cb5;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dh8;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.gw8;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kt2;
import defpackage.m37;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xk6;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class LegalUiKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.ym5 r31, defpackage.qs2 r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.settings.legal.LegalUiKt.a(ym5, qs2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final gw8 gw8Var, final int i, final List list, ss2 ss2Var, Composer composer, final int i2, final int i3) {
        Composer h = composer.h(-1315652395);
        ss2 ss2Var2 = (i3 & 8) != 0 ? new ss2() { // from class: com.nytimes.android.features.settings.legal.LegalUiKt$Item$1
            public final void invoke(String str) {
                zq3.h(str, "it");
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }
        } : ss2Var;
        if (b.G()) {
            b.S(-1315652395, i2, -1, "com.nytimes.android.features.settings.legal.Item (LegalUi.kt:103)");
        }
        h.z(-483455358);
        Modifier.a aVar = Modifier.a;
        Arrangement.m g = Arrangement.a.g();
        Alignment.a aVar2 = Alignment.a;
        rg4 a = d.a(g, aVar2.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(aVar);
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
        float f = 8;
        final ss2 ss2Var3 = ss2Var2;
        float f2 = 4;
        TextKt.c(gw8Var.e(), PaddingKt.j(SizeKt.h(aVar, 0.0f, 1, null), bu1.g(f), bu1.g(f2)), 0L, 0L, null, o.b.a(), null, 0L, null, dh8.h(dh8.b.f()), 0L, 0, false, 0, 0, null, ag4.a.c(h, ag4.b).i(), h, 196656, 0, 64988);
        Modifier h2 = SizeKt.h(PaddingKt.i(aVar, bu1.g(f2)), 0.0f, 1, null);
        Alignment o2 = aVar2.o();
        h.z(733328855);
        rg4 g2 = BoxKt.g(o2, false, h, 6);
        h.z(-1323940314);
        int a5 = cs0.a(h, 0);
        et0 o3 = h.o();
        qs2 a6 = companion.a();
        it2 c2 = LayoutKt.c(h2);
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
        Updater.c(a7, o3, companion.g());
        gt2 b2 = companion.b();
        if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
            a7.q(Integer.valueOf(a5));
            a7.v(Integer.valueOf(a5), b2);
        }
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        h.z(1222950863);
        boolean z = ((((i2 & 7168) ^ 3072) > 2048 && h.S(ss2Var3)) || (i2 & 3072) == 2048) | ((((i2 & 14) ^ 6) > 4 && h.S(gw8Var)) || (i2 & 6) == 4);
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.features.settings.legal.LegalUiKt$Item$2$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m435invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m435invoke() {
                    ss2.this.invoke(gw8Var.d());
                }
            };
            h.q(A);
        }
        h.R();
        ButtonKt.d((qs2) A, null, false, null, null, null, null, null, null, zr0.b(h, -211341572, true, new it2() { // from class: com.nytimes.android.features.settings.legal.LegalUiKt$Item$2$1$2
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(m37 m37Var, Composer composer2, int i4) {
                zq3.h(m37Var, "$this$TextButton");
                if ((i4 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-211341572, i4, -1, "com.nytimes.android.features.settings.legal.Item.<anonymous>.<anonymous>.<anonymous> (LegalUi.kt:121)");
                }
                TextKt.c(gw8.this.b(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ag4.a.c(composer2, ag4.b).c(), composer2, 0, 0, 65534);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 805306368, 510);
        h.R();
        h.t();
        h.R();
        h.R();
        if (i < list.size() - 1) {
            h.z(2060783277);
            DividerKt.a(PaddingKt.m(aVar, bu1.g(f), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, h, 6, 14);
            h.R();
        } else {
            h.z(2060783357);
            DividerKt.a(null, cb5.a(NytColor.times_black, null, h, 6, 1), 0.0f, 0.0f, h, 0, 13);
            h.R();
        }
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.settings.legal.LegalUiKt$Item$3
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
                    LegalUiKt.b(gw8.this, i, list, ss2Var3, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }

    public static final void c(final ym5 ym5Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(ym5Var, "paddingValues");
        Composer h = composer.h(925108060);
        if ((i & 14) == 0) {
            i2 = (h.S(ym5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(925108060, i2, -1, "com.nytimes.android.features.settings.legal.LoadingUi (LegalUi.kt:57)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier d = SizeKt.d(SizeKt.h(PaddingKt.h(aVar, ym5Var), 0.0f, 1, null), 0.0f, 1, null);
            Arrangement.f b = Arrangement.a.b();
            Alignment.b g = Alignment.a.g();
            h.z(-483455358);
            rg4 a = d.a(b, g, h, 54);
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
            gt2 b2 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b2);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            composer2 = h;
            TextKt.c(k48.b(xk6.legal_loading, h, 0), SizeKt.h(PaddingKt.i(aVar, bu1.g(16)), 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 48, 0, 131068);
            ProgressIndicatorKt.g(null, 0L, 0L, 0, composer2, 0, 15);
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
            k.a(new gt2() { // from class: com.nytimes.android.features.settings.legal.LegalUiKt$LoadingUi$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    LegalUiKt.c(ym5.this, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(1659948500);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(1659948500, i2, -1, "com.nytimes.android.features.settings.legal.StickyHeader (LegalUi.kt:137)");
            }
            String upperCase = str.toUpperCase(Locale.ROOT);
            zq3.g(upperCase, "toUpperCase(...)");
            float f = 8;
            composer2 = h;
            TextKt.c(upperCase, PaddingKt.j(BackgroundKt.d(SizeKt.h(Modifier.a, 0.0f, 1, null), cb5.a(NytColor.background_primary, null, h, 6, 1), null, 2, null), bu1.g(f), bu1.g(f)), cb5.a(NytColor.text_primary, null, h, 6, 1), 0L, null, o.b.a(), null, 0L, null, dh8.h(dh8.b.f()), 0L, 0, false, 0, 0, null, ag4.a.c(h, ag4.b).f(), composer2, 196608, 0, 64984);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.settings.legal.LegalUiKt$StickyHeader$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    LegalUiKt.d(str, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void e(final ym5 ym5Var, final Map map, ss2 ss2Var, Composer composer, final int i, final int i2) {
        zq3.h(ym5Var, "paddingValues");
        zq3.h(map, "artifacts");
        Composer h = composer.h(-1054407176);
        final ss2 ss2Var2 = (i2 & 4) != 0 ? new ss2() { // from class: com.nytimes.android.features.settings.legal.LegalUiKt$SuccessUi$1
            public final void invoke(String str) {
                zq3.h(str, "it");
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }
        } : ss2Var;
        if (b.G()) {
            b.S(-1054407176, i, -1, "com.nytimes.android.features.settings.legal.SuccessUi (LegalUi.kt:83)");
        }
        final ss2 ss2Var3 = ss2Var2;
        LazyDslKt.a(PaddingKt.h(Modifier.a, ym5Var), null, null, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.features.settings.legal.LegalUiKt$SuccessUi$2
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
                Map<String, List<gw8>> map2 = map;
                final ss2 ss2Var4 = ss2Var2;
                for (Map.Entry<String, List<gw8>> entry : map2.entrySet()) {
                    final String key = entry.getKey();
                    final List<gw8> value = entry.getValue();
                    LazyListScope.c(lazyListScope, null, null, zr0.c(-1082196602, true, new it2() { // from class: com.nytimes.android.features.settings.legal.LegalUiKt$SuccessUi$2$1$1
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
                            zq3.h(h04Var, "$this$stickyHeader");
                            if ((i3 & 81) == 16 && composer2.i()) {
                                composer2.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(-1082196602, i3, -1, "com.nytimes.android.features.settings.legal.SuccessUi.<anonymous>.<anonymous>.<anonymous> (LegalUi.kt:87)");
                            }
                            LegalUiKt.d(key, composer2, 0);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), 3, null);
                    lazyListScope.b(value.size(), null, new ss2() { // from class: com.nytimes.android.features.settings.legal.LegalUiKt$SuccessUi$2$invoke$lambda$1$$inlined$itemsIndexed$default$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Number) obj).intValue());
                        }

                        public final Object invoke(int i3) {
                            value.get(i3);
                            return null;
                        }
                    }, zr0.c(-1091073711, true, new kt2() { // from class: com.nytimes.android.features.settings.legal.LegalUiKt$SuccessUi$2$invoke$lambda$1$$inlined$itemsIndexed$default$3
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
                                b.S(-1091073711, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                            }
                            LegalUiKt.b((gw8) value.get(i3), i3, value, ss2Var4, composer2, 512 | (i5 & ContentType.LONG_FORM_ON_DEMAND), 0);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }));
                }
            }
        }, h, 0, 254);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.settings.legal.LegalUiKt$SuccessUi$3
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
                    LegalUiKt.e(ym5.this, map, ss2Var3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
