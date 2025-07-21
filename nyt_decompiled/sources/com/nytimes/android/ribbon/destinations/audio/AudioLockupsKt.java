package com.nytimes.android.ribbon.destinations.audio;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.comscore.streaming.ContentType;
import com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt;
import com.nytimes.android.ribbon.composable.ComposableSingletons$XpnModuleKt;
import com.nytimes.android.ribbon.composable.XpnDividersKt;
import com.nytimes.android.ribbon.composable.XpnModuleKt;
import com.nytimes.android.ribbon.et2.Key;
import com.nytimes.android.tpl.TPLSize;
import defpackage.gt2;
import defpackage.h04;
import defpackage.it2;
import defpackage.mt2;
import defpackage.pz;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tx1;
import defpackage.ww8;
import defpackage.zl9;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class AudioLockupsKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.nytimes.android.ribbon.destinations.audio.AudioHeroData r23, final defpackage.qs2 r24, androidx.compose.ui.Modifier r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.audio.AudioLockupsKt.a(com.nytimes.android.ribbon.destinations.audio.AudioHeroData, qs2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final com.nytimes.android.ribbon.destinations.audio.PodcastData r19, final defpackage.qs2 r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.audio.AudioLockupsKt.b(com.nytimes.android.ribbon.destinations.audio.PodcastData, qs2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void e(LazyListScope lazyListScope, final pz pzVar, LazyListState lazyListState, qs2 qs2Var, final qs2 qs2Var2, ss2 ss2Var) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(pzVar, "viewState");
        zq3.h(lazyListState, "listState");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(qs2Var2, "onClick");
        zq3.h(ss2Var, "onView");
        XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : null, (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new Key(pzVar.a().c()), ss2Var, lazyListState, qs2Var, zr0.c(-1988416119, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.audio.AudioLockupsKt$audioHero$1
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
                zq3.h(h04Var, "$this$xpnModule");
                if ((i & 81) == 16 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1988416119, i, -1, "com.nytimes.android.ribbon.destinations.audio.audioHero.<anonymous> (AudioLockups.kt:52)");
                }
                AudioHeroData a = pz.this.a();
                composer.z(-848091047);
                boolean S = composer.S(qs2Var2);
                final qs2 qs2Var3 = qs2Var2;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.audio.AudioLockupsKt$audioHero$1$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m666invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m666invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                AudioLockupsKt.a(a, (qs2) A, null, composer, 0, 4);
                if (b.G()) {
                    b.R();
                }
            }
        }));
    }

    public static final void f(LazyListScope lazyListScope, final PodcastModule podcastModule, LazyListState lazyListState, qs2 qs2Var, final gt2 gt2Var, it2 it2Var) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(podcastModule, "module");
        zq3.h(lazyListState, "listState");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(gt2Var, "onClick");
        zq3.h(it2Var, "onView");
        XpnModuleKt.c(lazyListScope, podcastModule.b(), (r25 & 2) != 0 ? null : zr0.c(1819051711, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.audio.AudioLockupsKt$audioPodcasts$1
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(h04 h04Var, Composer composer, int i) {
                zq3.h(h04Var, "$this$xpnListModule");
                if ((i & 81) == 16 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(1819051711, i, -1, "com.nytimes.android.ribbon.destinations.audio.audioPodcasts.<anonymous> (AudioLockups.kt:68)");
                }
                String c = PodcastModule.this.c();
                if (c.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    String valueOf = String.valueOf(c.charAt(0));
                    zq3.f(valueOf, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = valueOf.toUpperCase(Locale.ROOT);
                    zq3.g(upperCase, "toUpperCase(...)");
                    sb.append((Object) upperCase);
                    String substring = c.substring(1);
                    zq3.g(substring, "substring(...)");
                    sb.append(substring);
                    c = sb.toString();
                }
                XpnDividersKt.b(c, null, false, false, null, composer, 0, 30);
                if (b.G()) {
                    b.R();
                }
            }
        }), (r25 & 4) != 0 ? ComposableSingletons$XpnModuleKt.a.a() : null, (r25 & 8) != 0 ? false : false, (r25 & 16) != 0 ? false : false, (r25 & 32) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new gt2() { // from class: com.nytimes.android.ribbon.destinations.audio.AudioLockupsKt$audioPodcasts$2
            public final Key b(int i, PodcastData podcastData) {
                zq3.h(podcastData, "item");
                return new Key(podcastData.b());
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Number) obj).intValue(), (PodcastData) obj2);
            }
        }, it2Var, lazyListState, qs2Var, zr0.c(640761422, true, new mt2() { // from class: com.nytimes.android.ribbon.destinations.audio.AudioLockupsKt$audioPodcasts$3
            {
                super(5);
            }

            public final void b(h04 h04Var, final int i, final PodcastData podcastData, Composer composer, int i2) {
                int i3;
                zq3.h(h04Var, "$this$xpnListModule");
                zq3.h(podcastData, "item");
                if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                    i3 = (composer.d(i) ? 32 : 16) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 896) == 0) {
                    i3 |= composer.S(podcastData) ? 256 : 128;
                }
                if ((i3 & 5841) == 1168 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(640761422, i3, -1, "com.nytimes.android.ribbon.destinations.audio.audioPodcasts.<anonymous> (AudioLockups.kt:74)");
                }
                composer.z(-741565903);
                boolean S = composer.S(gt2.this) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i3 & 896) == 256);
                final gt2 gt2Var2 = gt2.this;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.audio.AudioLockupsKt$audioPodcasts$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m667invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m667invoke() {
                            gt2.this.invoke(Integer.valueOf(i), podcastData);
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                AudioLockupsKt.b(podcastData, (qs2) A, null, composer, (i3 >> 6) & 14, 4);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.mt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                b((h04) obj, ((Number) obj2).intValue(), (PodcastData) obj3, (Composer) obj4, ((Number) obj5).intValue());
                return ww8.a;
            }
        }));
    }

    public static final void g(LazyListScope lazyListScope, pz pzVar, final LazyListState lazyListState, final qs2 qs2Var, final ss2 ss2Var) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(pzVar, "viewState");
        zq3.h(lazyListState, "listState");
        zq3.h(qs2Var, "onClick");
        zq3.h(ss2Var, "onView");
        final FooterData c = pzVar.c();
        final Key key = new Key(pzVar.c().a());
        LazyListScope.d(lazyListScope, key, null, zr0.c(-442397369, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.audio.AudioLockupsKt$viewAllFooter$1
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
                if (b.G()) {
                    b.S(-442397369, i, -1, "com.nytimes.android.ribbon.destinations.audio.viewAllFooter.<anonymous> (AudioLockups.kt:92)");
                }
                Key key2 = Key.this;
                LazyListState lazyListState2 = lazyListState;
                AnonymousClass1 anonymousClass1 = new ss2() { // from class: com.nytimes.android.ribbon.destinations.audio.AudioLockupsKt$viewAllFooter$1.1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(tx1 tx1Var) {
                        zq3.h(tx1Var, "it");
                        return Boolean.valueOf(tx1Var.h() instanceof zl9);
                    }
                };
                composer.z(-1830505432);
                boolean S = composer.S(ss2Var) | composer.S(Key.this);
                final ss2 ss2Var2 = ss2Var;
                final Key key3 = Key.this;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.audio.AudioLockupsKt$viewAllFooter$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m668invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m668invoke() {
                            ss2.this.invoke(key3);
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                ItemImpressionKt.a(key2, lazyListState2, anonymousClass1, null, (qs2) A, composer, 384, 8);
                String b = c.b();
                Modifier.a aVar = Modifier.a;
                composer.z(-1830505256);
                boolean S2 = composer.S(qs2Var);
                final qs2 qs2Var2 = qs2Var;
                Object A2 = composer.A();
                if (S2 || A2 == Composer.a.a()) {
                    A2 = new qs2() { // from class: com.nytimes.android.ribbon.destinations.audio.AudioLockupsKt$viewAllFooter$1$3$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m669invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m669invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    composer.q(A2);
                }
                composer.R();
                XpnDividersKt.b(b, ClickableKt.e(aVar, false, null, null, (qs2) A2, 7, null), true, false, null, composer, 384, 24);
                SpacerKt.a(SizeKt.n(aVar, TPLSize.spacing6.m765getValueD9Ej5fM()), composer, 0);
                if (b.G()) {
                    b.R();
                }
            }
        }), 2, null);
    }
}
