package com.nytimes.android.features.games.gameshub.ui.layouts;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.snapping.e;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.a;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabFooter;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabHeader;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabSection;
import com.nytimes.android.features.games.gameshub.configuration.models.SectionCardDescription;
import com.nytimes.android.features.games.gameshub.progress.api.GamesButtonState;
import com.nytimes.android.features.games.gameshub.ui.components.GameCardHeroKt;
import com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt;
import com.nytimes.android.features.games.gameshub.ui.components.PlayTabAdsKt;
import com.nytimes.android.features.games.gameshub.ui.components.PlayTabInformationKt;
import com.nytimes.android.features.games.gameshub.ui.components.SectionHeaderKt;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d37;
import defpackage.d8;
import defpackage.dj7;
import defpackage.eb5;
import defpackage.et0;
import defpackage.g14;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.jj7;
import defpackage.ju7;
import defpackage.jv5;
import defpackage.k48;
import defpackage.kt2;
import defpackage.lj7;
import defpackage.n37;
import defpackage.nn0;
import defpackage.pl0;
import defpackage.qk2;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.rk6;
import defpackage.ss2;
import defpackage.wt2;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class PlayTabTabletLayoutsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final jv5 jv5Var, final int i, final wt2 wt2Var, final SectionCardDescription sectionCardDescription, final int i2, final it2 it2Var, Composer composer, final int i3) {
        int i4;
        Composer h = composer.h(-1325606785);
        if ((i3 & 14) == 0) {
            i4 = (h.S(jv5Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i4 |= h.d(i) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= h.S(wt2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i3 & 7168) == 0) {
            i4 |= h.S(sectionCardDescription) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i3) == 0) {
            i4 |= h.d(i2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i3 & 458752) == 0) {
            i4 |= h.C(it2Var) ? 131072 : 65536;
        }
        if ((374491 & i4) == 74898 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1325606785, i4, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.DynamicSizedCards (PlayTabTabletLayouts.kt:253)");
            }
            if (i != 0 || i2 <= 2) {
                h.z(1666254132);
                String i5 = wt2Var.i();
                long a = wt2Var.a();
                int h2 = wt2Var.h();
                String d = wt2Var.d();
                String e = wt2Var.e();
                boolean j = wt2Var.j();
                boolean a2 = jv5Var.f().a();
                Modifier s = SizeKt.s(PaddingKt.j(Modifier.a, bu1.g(16), bu1.g(8)), bu1.g(450));
                GamesButtonState b = wt2Var.b();
                String c = wt2Var.c();
                Integer valueOf = Integer.valueOf(h2);
                h.z(1666254494);
                boolean z = ((i4 & 458752) == 131072) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
                Object A = h.A();
                if (z || A == Composer.a.a()) {
                    A = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$DynamicSizedCards$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Boolean) obj).booleanValue());
                            return ww8.a;
                        }

                        public final void invoke(boolean z2) {
                            it2.this.invoke(Boolean.valueOf(z2), wt2Var, sectionCardDescription.b());
                        }
                    };
                    h.q(A);
                }
                h.R();
                GameCardHeroKt.a(s, a, valueOf, i5, d, e, j, a2, (ss2) A, b, c, h, 6, 0, 0);
                h.R();
            } else {
                h.z(1666253451);
                String i6 = wt2Var.i();
                long a3 = wt2Var.a();
                int h3 = wt2Var.h();
                String d2 = wt2Var.d();
                String e2 = wt2Var.e();
                boolean j2 = wt2Var.j();
                boolean a4 = jv5Var.f().a();
                Modifier s2 = SizeKt.s(PaddingKt.j(Modifier.a, bu1.g(16), bu1.g(8)), bu1.g(550));
                GamesButtonState b2 = wt2Var.b();
                String c2 = wt2Var.c();
                Integer valueOf2 = Integer.valueOf(h3);
                h.z(1666253813);
                boolean z2 = ((i4 & 458752) == 131072) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
                Object A2 = h.A();
                if (z2 || A2 == Composer.a.a()) {
                    A2 = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$DynamicSizedCards$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Boolean) obj).booleanValue());
                            return ww8.a;
                        }

                        public final void invoke(boolean z3) {
                            it2.this.invoke(Boolean.valueOf(z3), wt2Var, sectionCardDescription.b());
                        }
                    };
                    h.q(A2);
                }
                h.R();
                GameCardHeroKt.a(s2, a3, valueOf2, i6, d2, e2, j2, a4, (ss2) A2, b2, c2, h, 6, 0, 0);
                h.R();
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$DynamicSizedCards$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    PlayTabTabletLayoutsKt.a(jv5.this, i, wt2Var, sectionCardDescription, i2, it2Var, composer2, gt6.a(i3 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final jv5 jv5Var, final PlayTabSection playTabSection, final Map map, final it2 it2Var, final qs2 qs2Var, final gt2 gt2Var, final float f, Composer composer, final int i) {
        Composer h = composer.h(1294145862);
        if (b.G()) {
            b.S(1294145862, i, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.GamesSectionContent (PlayTabTabletLayouts.kt:207)");
        }
        final LazyListState c = LazyListStateKt.c(0, 0, h, 0, 3);
        qk2 e = e.e(c, h, 0);
        final int size = playTabSection.c().size();
        LazyDslKt.b(null, c, null, false, null, null, e, false, new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$GamesSectionContent$1
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
                zq3.h(lazyListScope, "$this$LazyRow");
                final List c2 = PlayTabSection.this.c();
                final Map<String, wt2> map2 = map;
                final gt2 gt2Var2 = new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$GamesSectionContent$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final Object b(int i2, SectionCardDescription sectionCardDescription) {
                        String g;
                        zq3.h(sectionCardDescription, "section");
                        wt2 wt2Var = map2.get(sectionCardDescription.c());
                        if (wt2Var != null && (g = wt2Var.g()) != null) {
                            return g;
                        }
                        UUID randomUUID = UUID.randomUUID();
                        zq3.g(randomUUID, "randomUUID(...)");
                        return randomUUID;
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return b(((Number) obj).intValue(), (SectionCardDescription) obj2);
                    }
                };
                final Map<String, wt2> map3 = map;
                final LazyListState lazyListState = c;
                final gt2 gt2Var3 = gt2Var;
                final jv5 jv5Var2 = jv5Var;
                final int i2 = size;
                final it2 it2Var2 = it2Var;
                lazyListScope.b(c2.size(), new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$GamesSectionContent$1$invoke$$inlined$itemsIndexed$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i3) {
                        return gt2.this.invoke(Integer.valueOf(i3), c2.get(i3));
                    }
                }, new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$GamesSectionContent$1$invoke$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i3) {
                        c2.get(i3);
                        return null;
                    }
                }, zr0.c(-1091073711, true, new kt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$GamesSectionContent$1$invoke$$inlined$itemsIndexed$default$3
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
                            i5 = i4 | (composer2.S(h04Var) ? 4 : 2);
                        } else {
                            i5 = i4;
                        }
                        if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                            i5 |= composer2.d(i3) ? 32 : 16;
                        }
                        int i6 = i5;
                        if ((i6 & 731) == 146 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1091073711, i6, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                        }
                        final SectionCardDescription sectionCardDescription = (SectionCardDescription) c2.get(i3);
                        final wt2 wt2Var = (wt2) map3.get(sectionCardDescription.c());
                        if (wt2Var != null) {
                            String g = wt2Var.g();
                            LazyListState lazyListState2 = lazyListState;
                            composer2.z(-152689992);
                            boolean S = composer2.S(gt2Var3) | composer2.S(wt2Var) | composer2.S(sectionCardDescription);
                            Object A = composer2.A();
                            if (S || A == Composer.a.a()) {
                                final gt2 gt2Var4 = gt2Var3;
                                A = new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$GamesSectionContent$1$2$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m398invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m398invoke() {
                                        gt2.this.invoke(wt2Var, sectionCardDescription.b());
                                    }
                                };
                                composer2.q(A);
                            }
                            composer2.R();
                            ItemImpressionKt.a(g, lazyListState2, null, null, (qs2) A, composer2, 0, 12);
                            PlayTabTabletLayoutsKt.a(jv5Var2, i3, wt2Var, sectionCardDescription, i2, it2Var2, composer2, ScrollObserver.g | (i6 & ContentType.LONG_FORM_ON_DEMAND));
                        }
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
                final float f2 = f;
                LazyListScope.d(lazyListScope, null, null, zr0.c(1264669028, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$GamesSectionContent$1.3
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
                        zq3.h(h04Var, "$this$item");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1264669028, i3, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.GamesSectionContent.<anonymous>.<anonymous> (PlayTabTabletLayouts.kt:237)");
                        }
                        SpacerKt.a(SizeKt.s(Modifier.a, f2), composer2, 0);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
            }
        }, h, 0, 189);
        if (((Boolean) qs2Var.mo865invoke()).booleanValue()) {
            c(size, c, h, 0);
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$GamesSectionContent$2
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
                    PlayTabTabletLayoutsKt.b(jv5.this, playTabSection, map, it2Var, qs2Var, gt2Var, f, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final int i, final LazyListState lazyListState, Composer composer, final int i2) {
        int i3;
        Composer h = composer.h(251168553);
        if ((i2 & 14) == 0) {
            i3 = (h.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(lazyListState) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(251168553, i3, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.ListIndicator (PlayTabTabletLayouts.kt:293)");
            }
            float f = 8;
            Modifier h2 = SizeKt.h(PaddingKt.m(SizeKt.i(Modifier.a, bu1.g(50)), 0.0f, bu1.g(f), 0.0f, bu1.g(f), 5, null), 0.0f, 1, null);
            Arrangement.f b = Arrangement.a.b();
            h.z(693286680);
            rg4 a = m.a(b, Alignment.a.l(), h, 6);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(h2);
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
            n37 n37Var = n37.a;
            h.z(342962268);
            int i4 = 0;
            while (i4 < i) {
                long l = l(lazyListState, i4);
                i4++;
                final String c2 = k48.c(rk6.cd_play_tab_card_indicator_dots, new Object[]{Integer.valueOf(i4), Integer.valueOf(i)}, h, 64);
                Modifier n = SizeKt.n(BackgroundKt.d(pl0.a(PaddingKt.i(Modifier.a, bu1.g(4)), d37.f()), l, null, 2, null), bu1.g(f));
                h.z(1323746376);
                boolean S = h.S(c2);
                Object A = h.A();
                if (S || A == Composer.a.a()) {
                    A = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$ListIndicator$1$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(lj7 lj7Var) {
                            zq3.h(lj7Var, "$this$clearAndSetSemantics");
                            jj7.O(lj7Var, c2);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((lj7) obj);
                            return ww8.a;
                        }
                    };
                    h.q(A);
                }
                h.R();
                BoxKt.a(dj7.a(n, (ss2) A), h, 0);
            }
            h.R();
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
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$ListIndicator$2
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
                    PlayTabTabletLayoutsKt.c(i, lazyListState, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final jv5 jv5Var, final Map map, final ym5 ym5Var, final PlayTabHeader playTabHeader, final List list, final d8 d8Var, final PlayTabFooter playTabFooter, final float f, final it2 it2Var, final qs2 qs2Var, final gt2 gt2Var, Composer composer, final int i, final int i2) {
        Composer h = composer.h(1261733527);
        if (b.G()) {
            b.S(1261733527, i, i2, "com.nytimes.android.features.games.gameshub.ui.layouts.TabletLandscapeView (PlayTabTabletLayouts.kt:159)");
        }
        LazyDslKt.a(BackgroundKt.d(a.b(Modifier.a, jv5Var.e(), null, 2, null), eb5.Companion.a(h, 8).h(), null, 2, null), jv5Var.d(), ym5Var, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletLandscapeView$1
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
                final jv5 jv5Var2 = jv5Var;
                LazyListScope.d(lazyListScope, null, null, zr0.c(1572928299, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletLandscapeView$1.1
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i3) {
                        zq3.h(h04Var, "$this$item");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1572928299, i3, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.TabletLandscapeView.<anonymous>.<anonymous> (PlayTabTabletLayouts.kt:167)");
                        }
                        jv5.this.e().a(composer2, ScrollObserver.g);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
                final PlayTabHeader playTabHeader2 = playTabHeader;
                LazyListScope.d(lazyListScope, null, null, zr0.c(-241152542, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletLandscapeView$1.2
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i3) {
                        zq3.h(h04Var, "$this$item");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-241152542, i3, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.TabletLandscapeView.<anonymous>.<anonymous> (PlayTabTabletLayouts.kt:170)");
                        }
                        PlayTabInformationKt.b(PlayTabHeader.this.b(), PlayTabHeader.this.a(), composer2, 0);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
                final List<PlayTabSection> list2 = list;
                final qs2 qs2Var2 = qs2Var;
                final jv5 jv5Var3 = jv5Var;
                final Map<String, wt2> map2 = map;
                final it2 it2Var2 = it2Var;
                final gt2 gt2Var2 = gt2Var;
                final float f2 = f;
                final PlayTabTabletLayoutsKt$TabletLandscapeView$1$invoke$$inlined$items$default$1 playTabTabletLayoutsKt$TabletLandscapeView$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletLandscapeView$1$invoke$$inlined$items$default$1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Void invoke(Object obj) {
                        return null;
                    }
                };
                lazyListScope.b(list2.size(), null, new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletLandscapeView$1$invoke$$inlined$items$default$3
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
                }, zr0.c(-632812321, true, new kt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletLandscapeView$1$invoke$$inlined$items$default$4
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
                        final PlayTabSection playTabSection = (PlayTabSection) list2.get(i3);
                        SectionHeaderKt.a(playTabSection.e(), playTabSection.d(), qs2Var2, composer2, 0);
                        PlayTabTabletLayoutsKt.b(jv5Var3, playTabSection, map2, it2Var2, new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletLandscapeView$1$3$1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public final Boolean mo865invoke() {
                                return Boolean.valueOf(PlayTabSection.this.c().size() > 2);
                            }
                        }, gt2Var2, f2, composer2, ScrollObserver.g | 576);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
                final d8 d8Var2 = d8Var;
                LazyListScope.d(lazyListScope, null, null, zr0.c(2111705699, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletLandscapeView$1.4
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i3) {
                        zq3.h(h04Var, "$this$item");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(2111705699, i3, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.TabletLandscapeView.<anonymous>.<anonymous> (PlayTabTabletLayouts.kt:189)");
                        }
                        PlayTabAdsKt.a(d8.this, composer2, d8.a);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
                final PlayTabFooter playTabFooter2 = playTabFooter;
                LazyListScope.d(lazyListScope, null, null, zr0.c(169596644, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletLandscapeView$1.5
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i3) {
                        zq3.h(h04Var, "$this$item");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(169596644, i3, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.TabletLandscapeView.<anonymous>.<anonymous> (PlayTabTabletLayouts.kt:192)");
                        }
                        PlayTabInformationKt.a(PlayTabFooter.this.b(), PlayTabFooter.this.a(), composer2, 0);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
            }
        }, h, i & 896, 248);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletLandscapeView$2
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
                    PlayTabTabletLayoutsKt.d(jv5.this, map, ym5Var, playTabHeader, list, d8Var, playTabFooter, f, it2Var, qs2Var, gt2Var, composer2, gt6.a(i | 1), gt6.a(i2));
                }
            });
        }
    }

    public static final void e(final jv5 jv5Var, final Map map, final ym5 ym5Var, final PlayTabHeader playTabHeader, final List list, final d8 d8Var, final PlayTabFooter playTabFooter, final qs2 qs2Var, final it2 it2Var, final gt2 gt2Var, Composer composer, final int i) {
        Composer composer2;
        zq3.h(jv5Var, TransferTable.COLUMN_STATE);
        zq3.h(map, "playTabGames");
        zq3.h(ym5Var, "paddingValues");
        zq3.h(playTabHeader, "header");
        zq3.h(list, "playTabSections");
        zq3.h(d8Var, "bottomAd");
        zq3.h(playTabFooter, "footer");
        zq3.h(qs2Var, "onClickSubtitleSubscription");
        zq3.h(it2Var, "openOrSubscribe");
        zq3.h(gt2Var, "onItemViewed");
        Composer h = composer.h(1859132089);
        if (b.G()) {
            b.S(1859132089, i, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.TabletLayout (PlayTabTabletLayouts.kt:63)");
        }
        if (DeviceUtils.B((Context) h.m(AndroidCompositionLocals_androidKt.g()))) {
            h.z(896761706);
            composer2 = h;
            f(jv5Var, map, ym5Var, playTabHeader, list, d8Var, playTabFooter, it2Var, qs2Var, gt2Var, bu1.g(200), composer2, ScrollObserver.g | 32832 | (i & 14) | (i & 896) | (i & 7168) | (d8.a << 15) | (i & 458752) | (i & 3670016) | ((i >> 3) & 29360128) | ((i << 3) & 234881024) | (1879048192 & i), 6);
            composer2.R();
        } else {
            composer2 = h;
            composer2.z(896762198);
            d(jv5Var, map, ym5Var, playTabHeader, list, d8Var, playTabFooter, bu1.g(350), it2Var, qs2Var, gt2Var, composer2, 12615744 | ScrollObserver.g | (i & 14) | (i & 896) | (i & 7168) | (d8.a << 15) | (i & 458752) | (3670016 & i) | (234881024 & i) | ((i << 6) & 1879048192), (i >> 27) & 14);
            composer2.R();
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletLayout$1
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
                    PlayTabTabletLayoutsKt.e(jv5.this, map, ym5Var, playTabHeader, list, d8Var, playTabFooter, qs2Var, it2Var, gt2Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final jv5 jv5Var, final Map map, final ym5 ym5Var, final PlayTabHeader playTabHeader, final List list, final d8 d8Var, final PlayTabFooter playTabFooter, final it2 it2Var, final qs2 qs2Var, final gt2 gt2Var, final float f, Composer composer, final int i, final int i2) {
        Composer h = composer.h(-1057935343);
        if (b.G()) {
            b.S(-1057935343, i, i2, "com.nytimes.android.features.games.gameshub.ui.layouts.TabletPortraitView (PlayTabTabletLayouts.kt:108)");
        }
        LazyDslKt.a(BackgroundKt.d(a.b(Modifier.a, jv5Var.e(), null, 2, null), eb5.Companion.a(h, 8).h(), null, 2, null), jv5Var.d(), ym5Var, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletPortraitView$1
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
                final jv5 jv5Var2 = jv5Var;
                LazyListScope.d(lazyListScope, null, null, zr0.c(2138691837, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletPortraitView$1.1
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i3) {
                        zq3.h(h04Var, "$this$item");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(2138691837, i3, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.TabletPortraitView.<anonymous>.<anonymous> (PlayTabTabletLayouts.kt:116)");
                        }
                        jv5.this.e().a(composer2, ScrollObserver.g);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
                final PlayTabHeader playTabHeader2 = playTabHeader;
                LazyListScope.d(lazyListScope, null, null, zr0.c(-275131546, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletPortraitView$1.2
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i3) {
                        zq3.h(h04Var, "$this$item");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-275131546, i3, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.TabletPortraitView.<anonymous>.<anonymous> (PlayTabTabletLayouts.kt:119)");
                        }
                        PlayTabInformationKt.b(PlayTabHeader.this.b(), PlayTabHeader.this.a(), composer2, 0);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
                final List<PlayTabSection> list2 = list;
                final qs2 qs2Var2 = qs2Var;
                final jv5 jv5Var3 = jv5Var;
                final Map<String, wt2> map2 = map;
                final it2 it2Var2 = it2Var;
                final gt2 gt2Var2 = gt2Var;
                final float f2 = f;
                final PlayTabTabletLayoutsKt$TabletPortraitView$1$invoke$$inlined$items$default$1 playTabTabletLayoutsKt$TabletPortraitView$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletPortraitView$1$invoke$$inlined$items$default$1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Void invoke(Object obj) {
                        return null;
                    }
                };
                lazyListScope.b(list2.size(), null, new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletPortraitView$1$invoke$$inlined$items$default$3
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
                }, zr0.c(-632812321, true, new kt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletPortraitView$1$invoke$$inlined$items$default$4
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
                        final PlayTabSection playTabSection = (PlayTabSection) list2.get(i3);
                        SectionHeaderKt.a(playTabSection.e(), playTabSection.d(), qs2Var2, composer2, 0);
                        PlayTabTabletLayoutsKt.b(jv5Var3, playTabSection, map2, it2Var2, new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletPortraitView$1$3$1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public final Boolean mo865invoke() {
                                return Boolean.valueOf(PlayTabSection.this.c().size() > 2);
                            }
                        }, gt2Var2, f2, composer2, ScrollObserver.g | 576);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
                final d8 d8Var2 = d8Var;
                LazyListScope.d(lazyListScope, null, null, zr0.c(2017524421, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletPortraitView$1.4
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i3) {
                        zq3.h(h04Var, "$this$item");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(2017524421, i3, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.TabletPortraitView.<anonymous>.<anonymous> (PlayTabTabletLayouts.kt:138)");
                        }
                        PlayTabAdsKt.a(d8.this, composer2, d8.a);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
                final PlayTabFooter playTabFooter2 = playTabFooter;
                LazyListScope.d(lazyListScope, null, null, zr0.c(15213092, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletPortraitView$1.5
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i3) {
                        zq3.h(h04Var, "$this$item");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(15213092, i3, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.TabletPortraitView.<anonymous>.<anonymous> (PlayTabTabletLayouts.kt:141)");
                        }
                        PlayTabInformationKt.a(PlayTabFooter.this.b(), PlayTabFooter.this.a(), composer2, 0);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
            }
        }, h, i & 896, 248);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt$TabletPortraitView$2
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
                    PlayTabTabletLayoutsKt.f(jv5.this, map, ym5Var, playTabHeader, list, d8Var, playTabFooter, it2Var, qs2Var, gt2Var, f, composer2, gt6.a(i | 1), gt6.a(i2));
                }
            });
        }
    }

    private static final long l(LazyListState lazyListState, int i) {
        Object obj;
        Iterator it2 = lazyListState.x().k().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((g14) obj).getIndex() == i) {
                break;
            }
        }
        if (((g14) obj) != null) {
            double a = r1.a() / 2.0d;
            double b = (r1.b() + (r1.a() / 2)) - (lazyListState.x().g() / 2.5d);
            if ((-a) <= b && b <= a) {
                return nn0.b.c();
            }
        }
        return nn0.b.d();
    }
}
