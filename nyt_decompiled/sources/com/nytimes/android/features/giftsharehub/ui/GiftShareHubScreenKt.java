package com.nytimes.android.features.giftsharehub.ui;

import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.TabKt;
import androidx.compose.material.TabRowKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.composable.ClickableTextKt;
import com.nytimes.android.designsystem.uicompose.composable.NytScaffoldKt;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.features.giftsharehub.GiftShareHubFilterTab;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dh8;
import defpackage.dj6;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.gb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.gv1;
import defpackage.h03;
import defpackage.h04;
import defpackage.it2;
import defpackage.jo7;
import defpackage.ju7;
import defpackage.jy7;
import defpackage.k48;
import defpackage.kl0;
import defpackage.kt2;
import defpackage.l74;
import defpackage.li8;
import defpackage.m60;
import defpackage.n37;
import defpackage.ne6;
import defpackage.ph8;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sk6;
import defpackage.ss2;
import defpackage.vy8;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.ym2;
import defpackage.ym5;
import defpackage.yr0;
import defpackage.z38;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class GiftShareHubScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final String str, final boolean z, final String str2, final int i, Composer composer, final int i2) {
        int i3;
        String b;
        Composer h = composer.h(-258354718);
        if ((i2 & 14) == 0) {
            i3 = (h.S(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.a(z) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= h.S(str2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= h.d(i) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        int i4 = i3;
        if ((i4 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-258354718, i4, -1, "com.nytimes.android.features.giftsharehub.ui.Footer (GiftShareHubScreen.kt:347)");
            }
            if (z) {
                h.z(-409195648);
                b = k48.b(sk6.gift_share_hub_expired_label, h, 0);
                h.R();
            } else {
                h.z(-409195568);
                b = k48.b(sk6.gift_share_hub_expires_label, h, 0);
                h.R();
            }
            String str3 = b;
            h.z(-483455358);
            Modifier.a aVar = Modifier.a;
            Arrangement arrangement = Arrangement.a;
            Arrangement.m g = arrangement.g();
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
            gt2 b2 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b2);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            DividerKt.a(null, eb5.Companion.a(h, 8).W(), bu1.g(1), 0.0f, h, 384, 9);
            Modifier i5 = SizeKt.i(SizeKt.h(aVar, 0.0f, 1, null), bu1.g(28));
            Arrangement.f d = arrangement.d();
            Alignment.c i6 = aVar2.i();
            h.z(693286680);
            rg4 a5 = m.a(d, i6, h, 54);
            h.z(-1323940314);
            int a6 = cs0.a(h, 0);
            et0 o2 = h.o();
            qs2 a7 = companion.a();
            it2 c2 = LayoutKt.c(i5);
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
            gt2 b3 = companion.b();
            if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                a8.q(Integer.valueOf(a6));
                a8.v(Integer.valueOf(a6), b3);
            }
            c2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            n37 n37Var = n37.a;
            b(k48.b(sk6.gift_share_hub_shared_label, h, 0) + " " + str, ne6.ic_shared, null, h, 0, 4);
            h.z(763991561);
            if (i > 0) {
                b(i + " " + k48.a(dj6.gift_share_views_plural, i, new Object[]{Integer.valueOf(i)}, h, ((i4 >> 6) & ContentType.LONG_FORM_ON_DEMAND) | 512), ne6.ic_views, null, h, 0, 4);
            }
            h.R();
            b(str3 + " " + str2, ne6.ic_expires, null, h, 0, 4);
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
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$Footer$2
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
                    GiftShareHubScreenKt.a(str, z, str2, i, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r60, final int r61, androidx.compose.ui.Modifier r62, androidx.compose.runtime.Composer r63, final int r64, final int r65) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt.b(java.lang.String, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final int i, final List list, final List list2, final int i2, final boolean z, final ss2 ss2Var, final ss2 ss2Var2, Modifier modifier, final ss2 ss2Var3, Composer composer, final int i3, final int i4) {
        CharSequence o;
        Composer h = composer.h(853023275);
        final Modifier modifier2 = (i4 & 128) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(853023275, i3, -1, "com.nytimes.android.features.giftsharehub.ui.GiftShareHubContent (GiftShareHubScreen.kt:136)");
        }
        float f = 20;
        Modifier l = PaddingKt.l(modifier2, bu1.g(f), bu1.g(f), bu1.g(f), bu1.g(0));
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o2 = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(l);
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
        Updater.c(a4, o2, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        final vy8 vy8Var = (vy8) h.m(CompositionLocalsKt.o());
        String a5 = k48.a(dj6.gift_share_articles_plural, i, new Object[]{Integer.valueOf(i)}, h, ((i3 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 512);
        if (z) {
            h.z(-231224276);
            o = k48.b(sk6.unlimited_gift_share_hub_content, h, 0);
            h.R();
        } else {
            h.z(-231224172);
            String b2 = k48.b(sk6.gift_share_hub_content, h, 0);
            z38 z38Var = z38.a;
            String format = String.format(Locale.getDefault(), b2, Arrays.copyOf(new Object[]{Integer.valueOf(i), a5}, 2));
            zq3.g(format, "format(...)");
            a.C0064a c0064a = new a.C0064a(0, 1, null);
            c0064a.i(format);
            c0064a.c(new jy7(0L, 0L, o.b.a(), (l) null, (androidx.compose.ui.text.font.m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, (f) null, (gv1) null, 65531, (DefaultConstructorMarker) null), h.b0(format, String.valueOf(i), 0, false, 6, null), h.b0(format, a5, 0, false, 6, null) + a5.length());
            o = c0064a.o();
            h.R();
        }
        List o3 = i.o(new kl0(o, null, null, null, 14, null), new kl0(k48.b(sk6.gift_share_hub_content_learn_more_text, h, 0), k48.b(sk6.gift_share_hub_content_learn_more_url, h, 0), "learn-more", new ss2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubContent$1$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((a.b) obj);
                return ww8.a;
            }

            public final void invoke(a.b bVar) {
                zq3.h(bVar, "it");
                vy8 vy8Var2 = vy8.this;
                String uri = Uri.parse((String) bVar.e()).toString();
                zq3.g(uri, "toString(...)");
                vy8Var2.a(uri);
            }
        }));
        long g = ek8.g(16);
        long g2 = ek8.g(21);
        e e = gb5.e();
        o e2 = o.b.e();
        eb5.a aVar = eb5.Companion;
        j jVar = new j(aVar.a(h, 8).l(), g, e2, null, null, e, null, 0L, null, null, null, 0L, null, null, null, 0, 0, g2, null, null, null, 0, 0, null, 16646104, null);
        Modifier.a aVar2 = Modifier.a;
        ClickableTextKt.a(o3, PaddingKt.m(aVar2, 0.0f, 0.0f, 0.0f, bu1.g(8), 7, null), jVar, h, kl0.e | 48, 0);
        SpacerKt.a(SizeKt.i(aVar2, bu1.g(f)), h, 6);
        TabRowKt.b(i2, ShadowKt.b(aVar2, bu1.g(5), null, false, wn0.b(1073741824), wn0.b(1073741824), 6, null), aVar.a(h, 8).a(), 0L, null, null, zr0.b(h, -899586759, true, new gt2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubContent$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(Composer composer2, int i5) {
                if ((i5 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-899586759, i5, -1, "com.nytimes.android.features.giftsharehub.ui.GiftShareHubContent.<anonymous>.<anonymous> (GiftShareHubScreen.kt:204)");
                }
                List<GiftShareHubFilterTab> list3 = list2;
                int i6 = i2;
                final ss2 ss2Var4 = ss2Var;
                int i7 = 0;
                final int i8 = 0;
                for (Object obj : list3) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        i.v();
                    }
                    GiftShareHubFilterTab giftShareHubFilterTab = (GiftShareHubFilterTab) obj;
                    final boolean z2 = i6 == i8 ? 1 : i7;
                    final String b3 = k48.b(giftShareHubFilterTab.getTitle(), composer2, i7);
                    composer2.z(384195811);
                    boolean S = composer2.S(ss2Var4) | composer2.d(i8);
                    Object A = composer2.A();
                    if (S || A == Composer.a.a()) {
                        A = new qs2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubContent$1$2$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m402invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m402invoke() {
                                ss2.this.invoke(Integer.valueOf(i8));
                            }
                        };
                        composer2.q(A);
                    }
                    composer2.R();
                    TabKt.a(z2, (qs2) A, null, false, zr0.b(composer2, 759363587, true, new gt2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubContent$1$2$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            long p;
                            if ((i10 & 11) == 2 && composer3.i()) {
                                composer3.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(759363587, i10, -1, "com.nytimes.android.features.giftsharehub.ui.GiftShareHubContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GiftShareHubScreen.kt:209)");
                            }
                            String str = b3;
                            long b4 = ym2.b(16, composer3, 6);
                            e e3 = gb5.e();
                            o e4 = o.b.e();
                            if (z2) {
                                composer3.z(-226107516);
                                p = eb5.Companion.a(composer3, 8).l();
                                composer3.R();
                            } else {
                                composer3.z(-226107400);
                                p = eb5.Companion.a(composer3, 8).p();
                                composer3.R();
                            }
                            TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(p, b4, e4, null, null, e3, null, 0L, null, null, null, 0L, null, null, null, dh8.b.a(), 0, 0L, null, null, null, 0, 0, null, 16744408, null), composer3, 0, 0, 65534);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), null, null, 0L, 0L, composer2, 24576, 492);
                    i8 = i9;
                    ss2Var4 = ss2Var4;
                    i7 = i7;
                }
                if (b.G()) {
                    b.R();
                }
            }
        }), h, ((i3 >> 9) & 14) | 1572864, 56);
        LazyDslKt.a(null, null, null, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubContent$1$3
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
                final List<h03.a> list3 = list;
                final ss2 ss2Var4 = ss2Var2;
                final ss2 ss2Var5 = ss2Var3;
                final GiftShareHubScreenKt$GiftShareHubContent$1$3$invoke$$inlined$items$default$1 giftShareHubScreenKt$GiftShareHubContent$1$3$invoke$$inlined$items$default$1 = new ss2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubContent$1$3$invoke$$inlined$items$default$1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Void invoke(Object obj) {
                        return null;
                    }
                };
                lazyListScope.b(list3.size(), null, new ss2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubContent$1$3$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i5) {
                        return ss2.this.invoke(list3.get(i5));
                    }
                }, zr0.c(-632812321, true, new kt2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubContent$1$3$invoke$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, int i5, Composer composer2, int i6) {
                        int i7;
                        if ((i6 & 14) == 0) {
                            i7 = i6 | (composer2.S(h04Var) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i6 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                            i7 |= composer2.d(i5) ? 32 : 16;
                        }
                        if ((i7 & 731) == 146 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-632812321, i7, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                        }
                        final h03.a aVar3 = (h03.a) list3.get(i5);
                        String a6 = aVar3.a();
                        String c2 = aVar3.c();
                        String e3 = aVar3.e();
                        boolean j = aVar3.j();
                        String f2 = aVar3.f();
                        Integer g3 = aVar3.g();
                        zq3.e(g3);
                        int intValue = g3.intValue();
                        composer2.z(384196391);
                        boolean S = composer2.S(ss2Var4) | composer2.S(aVar3);
                        Object A = composer2.A();
                        if (S || A == Composer.a.a()) {
                            final ss2 ss2Var6 = ss2Var4;
                            A = new qs2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubContent$1$3$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m403invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m403invoke() {
                                    ss2.this.invoke(aVar3);
                                }
                            };
                            composer2.q(A);
                        }
                        qs2 qs2Var = (qs2) A;
                        composer2.R();
                        composer2.z(384196567);
                        boolean S2 = composer2.S(ss2Var5) | composer2.S(aVar3);
                        Object A2 = composer2.A();
                        if (S2 || A2 == Composer.a.a()) {
                            final ss2 ss2Var7 = ss2Var5;
                            A2 = new qs2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubContent$1$3$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m404invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m404invoke() {
                                    ss2.this.invoke(aVar3);
                                }
                            };
                            composer2.q(A2);
                        }
                        composer2.R();
                        GiftShareHubScreenKt.d(a6, c2, e3, j, f2, intValue, qs2Var, null, (qs2) A2, composer2, 0, 128);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
                LazyListScope.d(lazyListScope, null, null, ComposableSingletons$GiftShareHubScreenKt.a.c(), 3, null);
            }
        }, h, 0, 255);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubContent$2
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
                    GiftShareHubScreenKt.c(i, list, list2, i2, z, ss2Var, ss2Var2, modifier2, ss2Var3, composer2, gt6.a(i3 | 1), i4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final boolean r74, final java.lang.String r75, final int r76, final defpackage.qs2 r77, androidx.compose.ui.Modifier r78, final defpackage.qs2 r79, androidx.compose.runtime.Composer r80, final int r81, final int r82) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt.d(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, qs2, androidx.compose.ui.Modifier, qs2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void e(final int i, final List list, final List list2, final int i2, final boolean z, final ss2 ss2Var, final ss2 ss2Var2, final ss2 ss2Var3, final qs2 qs2Var, Composer composer, final int i3) {
        zq3.h(list, "giftsData");
        zq3.h(list2, "tabs");
        zq3.h(ss2Var, "onTabClicked");
        zq3.h(ss2Var2, "onGiftItemClicked");
        zq3.h(ss2Var3, "onShareGiftItemClicked");
        zq3.h(qs2Var, "onBackPressed");
        Composer h = composer.h(1585232445);
        if (b.G()) {
            b.S(1585232445, i3, -1, "com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreen (GiftShareHubScreen.kt:77)");
        }
        NytThemeKt.a(false, null, null, zr0.b(h, -910231603, true, new gt2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubScreen$1
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
                    b.S(-910231603, i4, -1, "com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreen.<anonymous> (GiftShareHubScreen.kt:79)");
                }
                long a = eb5.Companion.a(composer2, 8).a();
                final qs2 qs2Var2 = qs2.this;
                yr0 b = zr0.b(composer2, -16147360, true, new gt2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubScreen$1.1
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-16147360, i5, -1, "com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreen.<anonymous>.<anonymous> (GiftShareHubScreen.kt:82)");
                        }
                        gt2 a2 = ComposableSingletons$GiftShareHubScreenKt.a.a();
                        final qs2 qs2Var3 = qs2.this;
                        AppBarKt.d(a2, null, zr0.b(composer3, 2136897574, true, new gt2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt.GiftShareHubScreen.1.1.1
                            {
                                super(2);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return ww8.a;
                            }

                            public final void invoke(Composer composer4, int i6) {
                                if ((i6 & 11) == 2 && composer4.i()) {
                                    composer4.K();
                                    return;
                                }
                                if (b.G()) {
                                    b.S(2136897574, i6, -1, "com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreen.<anonymous>.<anonymous>.<anonymous> (GiftShareHubScreen.kt:99)");
                                }
                                composer4.z(-989164955);
                                boolean S = composer4.S(qs2.this);
                                final qs2 qs2Var4 = qs2.this;
                                Object A = composer4.A();
                                if (S || A == Composer.a.a()) {
                                    A = new qs2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubScreen$1$1$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // defpackage.qs2
                                        /* renamed from: invoke */
                                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                                            m406invoke();
                                            return ww8.a;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m406invoke() {
                                            qs2.this.mo865invoke();
                                        }
                                    };
                                    composer4.q(A);
                                }
                                composer4.R();
                                IconButtonKt.a((qs2) A, null, false, null, ComposableSingletons$GiftShareHubScreenKt.a.b(), composer4, 24576, 14);
                                if (b.G()) {
                                    b.R();
                                }
                            }
                        }), null, eb5.Companion.a(composer3, 8).a(), 0L, 0.0f, composer3, 390, 106);
                        if (b.G()) {
                            b.R();
                        }
                    }
                });
                final int i5 = i;
                final List<h03.a> list3 = list;
                final List<GiftShareHubFilterTab> list4 = list2;
                final int i6 = i2;
                final boolean z2 = z;
                final ss2 ss2Var4 = ss2Var;
                final ss2 ss2Var5 = ss2Var2;
                final ss2 ss2Var6 = ss2Var3;
                NytScaffoldKt.a(null, b, null, 0.0f, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, a, 0L, null, null, zr0.b(composer2, -840844402, true, new it2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubScreen$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(ym5 ym5Var, Composer composer3, int i7) {
                        zq3.h(ym5Var, "it");
                        if ((i7 & 81) == 16 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-840844402, i7, -1, "com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreen.<anonymous>.<anonymous> (GiftShareHubScreen.kt:111)");
                        }
                        GiftShareHubScreenKt.c(i5, list3, list4, i6, z2, ss2Var4, ss2Var5, null, ss2Var6, composer3, 576, 128);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 48, 0, 6, 983037);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 3072, 7);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.giftsharehub.ui.GiftShareHubScreenKt$GiftShareHubScreen$2
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
                    GiftShareHubScreenKt.e(i, list, list2, i2, z, ss2Var, ss2Var2, ss2Var3, qs2Var, composer2, gt6.a(i3 | 1));
                }
            });
        }
    }
}
