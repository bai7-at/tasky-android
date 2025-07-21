package com.nytimes.android.messaging.postloginregioffers.components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.streaming.ContentType;
import com.nytimes.android.messaging.postloginregioffers.model.PostRegiLoginOfferConfig;
import com.nytimes.android.messaging.postloginregioffers.model.ValueProp;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dh8;
import defpackage.do5;
import defpackage.eb0;
import defpackage.eb5;
import defpackage.ei0;
import defpackage.ek8;
import defpackage.et0;
import defpackage.fb0;
import defpackage.gb5;
import defpackage.gd6;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.gv1;
import defpackage.it2;
import defpackage.jo7;
import defpackage.ju7;
import defpackage.jy7;
import defpackage.k48;
import defpackage.l74;
import defpackage.lf6;
import defpackage.li8;
import defpackage.m07;
import defpackage.m37;
import defpackage.m60;
import defpackage.ma3;
import defpackage.mx0;
import defpackage.n37;
import defpackage.nn0;
import defpackage.ol6;
import defpackage.ph8;
import defpackage.qs2;
import defpackage.r81;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.u06;
import defpackage.ue6;
import defpackage.ve0;
import defpackage.we6;
import defpackage.wh;
import defpackage.ww8;
import defpackage.xe0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class PostRegiLoginOfferComponentsKt {
    public static final void a(final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(str, "title");
        zq3.h(str2, "message");
        Composer h = composer.h(1862157738);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(str2) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(1862157738, i2, -1, "com.nytimes.android.messaging.postloginregioffers.components.ErrorBottomBar (PostRegiLoginOfferComponents.kt:480)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier f = SizeKt.f(aVar, 0.0f, 1, null);
            h.z(733328855);
            Alignment.a aVar2 = Alignment.a;
            rg4 g = BoxKt.g(aVar2.o(), false, h, 0);
            h.z(-1323940314);
            int a = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 c = LayoutKt.c(f);
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
            composer2 = h;
            ei0.a(BoxScopeInstance.a.c(SizeKt.h(BackgroundKt.d(aVar, eb5.Companion.a(h, 8).d(), null, 2, null), 0.0f, 1, null), aVar2.b()), null, 0L, 0L, null, bu1.g(62), zr0.b(h, -1448634221, true, new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$ErrorBottomBar$1$1
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
                    if ((i3 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-1448634221, i3, -1, "com.nytimes.android.messaging.postloginregioffers.components.ErrorBottomBar.<anonymous>.<anonymous> (PostRegiLoginOfferComponents.kt:491)");
                    }
                    String str3 = str;
                    String str4 = str2;
                    composer3.z(-483455358);
                    Modifier.a aVar3 = Modifier.a;
                    Arrangement.m g2 = Arrangement.a.g();
                    Alignment.a aVar4 = Alignment.a;
                    rg4 a4 = d.a(g2, aVar4.k(), composer3, 0);
                    composer3.z(-1323940314);
                    int a5 = cs0.a(composer3, 0);
                    et0 o2 = composer3.o();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                    qs2 a6 = companion2.a();
                    it2 c2 = LayoutKt.c(aVar3);
                    if (composer3.j() == null) {
                        cs0.c();
                    }
                    composer3.G();
                    if (composer3.f()) {
                        composer3.D(a6);
                    } else {
                        composer3.p();
                    }
                    Composer a7 = Updater.a(composer3);
                    Updater.c(a7, a4, companion2.e());
                    Updater.c(a7, o2, companion2.g());
                    gt2 b2 = companion2.b();
                    if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                        a7.q(Integer.valueOf(a5));
                        a7.v(Integer.valueOf(a5), b2);
                    }
                    c2.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                    composer3.z(2058660585);
                    ap0 ap0Var = ap0.a;
                    Modifier m = PaddingKt.m(ap0Var.c(aVar3, aVar4.g()), 0.0f, bu1.g(16), 0.0f, bu1.g(8), 5, null);
                    e e = gb5.e();
                    o.a aVar5 = o.b;
                    o a8 = aVar5.a();
                    eb5.a aVar6 = eb5.Companion;
                    TextKt.c(str3, m, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(aVar6.a(composer3, 8).r(), ek8.g(13), a8, null, null, e, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777176, null), composer3, 0, 0, 65532);
                    TextKt.c(str4, PaddingKt.m(ap0Var.c(aVar3, aVar4.g()), 0.0f, 0.0f, 0.0f, bu1.g(18), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(aVar6.a(composer3, 8).r(), ek8.g(13), aVar5.f(), null, null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777176, null), composer3, 0, 0, 65532);
                    composer3.R();
                    composer3.t();
                    composer3.R();
                    composer3.R();
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, 1769472, 30);
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
            k.a(new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$ErrorBottomBar$2
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
                    PostRegiLoginOfferComponentsKt.a(str, str2, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final PostRegiLoginOfferConfig postRegiLoginOfferConfig, final boolean z, final HashMap hashMap, final qs2 qs2Var, Composer composer, final int i) {
        zq3.h(postRegiLoginOfferConfig, "postRegiLoginOfferConfig");
        zq3.h(hashMap, "skuDetails");
        zq3.h(qs2Var, "onToggleDetail");
        Composer h = composer.h(-1621412791);
        if (b.G()) {
            b.S(-1621412791, i, -1, "com.nytimes.android.messaging.postloginregioffers.components.InfoSection (PostRegiLoginOfferComponents.kt:238)");
        }
        String productTitle = postRegiLoginOfferConfig.getProductTitle();
        e e = gb5.e();
        o.a aVar = o.b;
        o a = aVar.a();
        eb5.a aVar2 = eb5.Companion;
        j jVar = new j(aVar2.a(h, 8).l(), ek8.g(22), a, null, null, e, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777176, null);
        Modifier.a aVar3 = Modifier.a;
        TextKt.c(productTitle, PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, bu1.g(8), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar, h, 48, 0, 65532);
        float f = 16;
        TextKt.c(postRegiLoginOfferConfig.getProductSubHeader(), PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, bu1.g(f), 7, null), 0L, 0L, null, null, null, 0L, null, null, ek8.g(20), 0, false, 0, 0, null, new j(aVar2.a(h, 8).l(), ek8.g(14), aVar.f(), null, null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777176, null), h, 48, 6, 64508);
        h.z(-887826283);
        if (postRegiLoginOfferConfig.getShowValuePropsToggle()) {
            i(postRegiLoginOfferConfig, z, qs2Var, h, (i & ContentType.LONG_FORM_ON_DEMAND) | 8 | ((i >> 3) & 896));
        }
        h.R();
        DividerKt.a(PaddingKt.m(SizeKt.i(BackgroundKt.d(aVar3, aVar2.a(h, 8).W(), null, 2, null), bu1.g(1)), 0.0f, 0.0f, 0.0f, bu1.g(f), 7, null), 0L, 0.0f, 0.0f, h, 0, 14);
        if (!hashMap.isEmpty()) {
            TextKt.d(j((String) hashMap.get("introPrice"), String.valueOf(hashMap.get("fullPrice")), String.valueOf(hashMap.get("period")), aVar2.a(h, 8).u(), aVar2.a(h, 8).l()), PaddingKt.m(aVar3, 0.0f, bu1.g(f), 0.0f, bu1.g(6), 5, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, h, 0, 0, 262140);
            TextKt.c(postRegiLoginOfferConfig.getFooter(), PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, bu1.g(20), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(aVar2.a(h, 8).r(), ek8.g(12), aVar.f(), null, null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777176, null), h, 48, 0, 65532);
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$InfoSection$1
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
                    PostRegiLoginOfferComponentsKt.b(PostRegiLoginOfferConfig.this, z, hashMap, qs2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void c(final String str, final boolean z, final PostRegiLoginOfferConfig postRegiLoginOfferConfig, final HashMap hashMap, final boolean z2, final qs2 qs2Var, final qs2 qs2Var2, final qs2 qs2Var3, Composer composer, final int i) {
        zq3.h(str, "email");
        zq3.h(postRegiLoginOfferConfig, "postRegiLoginOfferConfig");
        zq3.h(hashMap, "skuDetail");
        zq3.h(qs2Var, "onToggleDetail");
        zq3.h(qs2Var2, "onClickSubscribe");
        zq3.h(qs2Var3, "onClickContinue");
        Composer h = composer.h(289557153);
        if (b.G()) {
            b.S(289557153, i, -1, "com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferBody (PostRegiLoginOfferComponents.kt:72)");
        }
        h.z(-483455358);
        Modifier.a aVar = Modifier.a;
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
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
        d(str, postRegiLoginOfferConfig, h, (i & 14) | 64);
        int i2 = i >> 3;
        f(postRegiLoginOfferConfig, z, hashMap, z2, qs2Var, qs2Var2, qs2Var3, h, (i & ContentType.LONG_FORM_ON_DEMAND) | 520 | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (i2 & 3670016));
        e(postRegiLoginOfferConfig, h, 8);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$PostRegiLoginOfferBody$2
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
                    PostRegiLoginOfferComponentsKt.c(str, z, postRegiLoginOfferConfig, hashMap, z2, qs2Var, qs2Var2, qs2Var3, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void d(final String str, final PostRegiLoginOfferConfig postRegiLoginOfferConfig, Composer composer, final int i) {
        zq3.h(str, "email");
        zq3.h(postRegiLoginOfferConfig, "postRegiLoginOfferConfig");
        Composer h = composer.h(-548381540);
        if (b.G()) {
            b.S(-548381540, i, -1, "com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferHeader (PostRegiLoginOfferComponents.kt:110)");
        }
        Modifier.a aVar = Modifier.a;
        float f = 20;
        Modifier m = PaddingKt.m(aVar, bu1.g(f), 0.0f, bu1.g(f), 0.0f, 10, null);
        h.z(-483455358);
        Arrangement.m g = Arrangement.a.g();
        Alignment.a aVar2 = Alignment.a;
        rg4 a = d.a(g, aVar2.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(m);
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
        String accountStatus = postRegiLoginOfferConfig.getAccountStatus();
        float f2 = 16;
        Modifier l = PaddingKt.l(ap0Var.c(aVar, aVar2.g()), bu1.g(f2), bu1.g(f2), bu1.g(f2), bu1.g(24));
        e e = gb5.e();
        o.a aVar3 = o.b;
        o g2 = aVar3.g();
        eb5.a aVar4 = eb5.Companion;
        TextKt.c(accountStatus, l, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(aVar4.a(h, 8).l(), ek8.g(18), g2, null, null, e, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777176, null), h, 0, 0, 65532);
        IconKt.b(do5.d(ue6.offer_logged_in, h, 0), "Header Icon", PaddingKt.m(ap0Var.c(aVar, aVar2.g()), 0.0f, 0.0f, 0.0f, bu1.g(17), 7, null), nn0.b.g(), h, 3128, 0);
        long g3 = ek8.g(23);
        int a5 = dh8.b.a();
        Modifier m2 = PaddingKt.m(ap0Var.c(aVar, aVar2.g()), 0.0f, 0.0f, 0.0f, bu1.g(40), 7, null);
        h.z(-821220349);
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        h.z(-821220310);
        int n = c0064a.n(new jy7(aVar4.a(h, 8).l(), ek8.g(18), aVar3.f(), (l) null, (m) null, gb5.e(), (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, (f) null, (gv1) null, 65496, (DefaultConstructorMarker) null));
        try {
            c0064a.i(k48.b(ol6.you_are_logged_in_as, h, 0) + "\n");
            ww8 ww8Var = ww8.a;
            c0064a.k(n);
            h.R();
            n = c0064a.n(new jy7(aVar4.a(h, 8).l(), ek8.g(18), aVar3.a(), (l) null, (m) null, gb5.e(), (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, (f) null, (gv1) null, 65496, (DefaultConstructorMarker) null));
            try {
                c0064a.i(String.valueOf(str));
                c0064a.k(n);
                a o2 = c0064a.o();
                h.R();
                TextKt.d(o2, m2, 0L, 0L, null, null, null, 0L, null, dh8.h(a5), g3, 0, false, 0, 0, null, null, null, h, 0, 6, 260604);
                DividerKt.a(SizeKt.i(aVar, bu1.g(1)), aVar4.a(h, 8).W(), 0.0f, 0.0f, h, 6, 12);
                TextKt.c(u06.b(postRegiLoginOfferConfig), PaddingKt.m(aVar, 0.0f, bu1.g(12), 0.0f, bu1.g(32), 5, null), 0L, 0L, null, null, null, 0L, null, null, ek8.g(30), 0, false, 0, 0, null, new j(aVar4.a(h, 8).l(), ek8.g(24), aVar3.d(), null, null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777176, null), h, 48, 6, 64508);
                h.R();
                h.t();
                h.R();
                h.R();
                if (b.G()) {
                    b.R();
                }
                cc7 k = h.k();
                if (k != null) {
                    k.a(new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$PostRegiLoginOfferHeader$2
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
                            PostRegiLoginOfferComponentsKt.d(str, postRegiLoginOfferConfig, composer2, gt6.a(i | 1));
                        }
                    });
                }
            } finally {
            }
        } finally {
        }
    }

    public static final void e(final PostRegiLoginOfferConfig postRegiLoginOfferConfig, Composer composer, final int i) {
        zq3.h(postRegiLoginOfferConfig, "postRegiLoginOfferConfig");
        Composer h = composer.h(398644781);
        if (b.G()) {
            b.S(398644781, i, -1, "com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferLegal (PostRegiLoginOfferComponents.kt:89)");
        }
        float f = 20;
        AndroidView_androidKt.b(new ss2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$PostRegiLoginOfferLegal$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final TextView invoke(Context context) {
                zq3.h(context, "context");
                TextView textView = new TextView(context);
                textView.setText(ma3.a(PostRegiLoginOfferConfig.this.getLegalText(), 63));
                textView.setLineSpacing(0.0f, 1.5f);
                textView.setTextSize(14.0f);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setLinkTextColor(mx0.c(context, gd6.content_tertiary));
                textView.setTypeface(m07.g(context, lf6.font_franklin_medium));
                textView.setTextColor(mx0.c(context, gd6.content_tertiary));
                return textView;
            }
        }, PaddingKt.m(Modifier.a, bu1.g(f), 0.0f, bu1.g(f), 0.0f, 10, null), null, h, 48, 4);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$PostRegiLoginOfferLegal$2
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
                    PostRegiLoginOfferComponentsKt.e(PostRegiLoginOfferConfig.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void f(final PostRegiLoginOfferConfig postRegiLoginOfferConfig, final boolean z, final HashMap hashMap, final boolean z2, final qs2 qs2Var, final qs2 qs2Var2, final qs2 qs2Var3, Composer composer, final int i) {
        zq3.h(postRegiLoginOfferConfig, "postRegiLoginOfferConfig");
        zq3.h(hashMap, "skuDetails");
        zq3.h(qs2Var, "onToggleDetail");
        zq3.h(qs2Var2, "onClickSubscribe");
        zq3.h(qs2Var3, "onClickContinue");
        Composer h = composer.h(-891319849);
        if (b.G()) {
            b.S(-891319849, i, -1, "com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferSubscribeSheet (PostRegiLoginOfferComponents.kt:198)");
        }
        float f = 20;
        Modifier m = PaddingKt.m(Modifier.a, bu1.g(f), 0.0f, bu1.g(f), bu1.g(40), 2, null);
        eb5.a aVar = eb5.Companion;
        Modifier d = BackgroundKt.d(m, aVar.a(h, 8).d(), null, 2, null);
        float g = bu1.g(r81.a(h, 0) ? 0 : 10);
        h.z(-1053564588);
        eb0 a = r81.a(h, 0) ? fb0.a(bu1.g(1), aVar.a(h, 8).l()) : fb0.a(bu1.g(0), nn0.b.g());
        h.R();
        ei0.a(d, null, 0L, 0L, a, g, zr0.b(h, 604149844, true, new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$PostRegiLoginOfferSubscribeSheet$1
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
                    b.S(604149844, i2, -1, "com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferSubscribeSheet.<anonymous> (PostRegiLoginOfferComponents.kt:210)");
                }
                float f2 = 20;
                Modifier d2 = BackgroundKt.d(PaddingKt.l(Modifier.a, bu1.g(f2), bu1.g(f2), bu1.g(f2), bu1.g(f2)), eb5.Companion.a(composer2, 8).d(), null, 2, null);
                PostRegiLoginOfferConfig postRegiLoginOfferConfig2 = PostRegiLoginOfferConfig.this;
                boolean z3 = z;
                HashMap<String, String> hashMap2 = hashMap;
                qs2 qs2Var4 = qs2Var;
                boolean z4 = z2;
                qs2 qs2Var5 = qs2Var2;
                qs2 qs2Var6 = qs2Var3;
                composer2.z(-483455358);
                rg4 a2 = d.a(Arrangement.a.g(), Alignment.a.k(), composer2, 0);
                composer2.z(-1323940314);
                int a3 = cs0.a(composer2, 0);
                et0 o = composer2.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a4 = companion.a();
                it2 c = LayoutKt.c(d2);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a4);
                } else {
                    composer2.p();
                }
                Composer a5 = Updater.a(composer2);
                Updater.c(a5, a2, companion.e());
                Updater.c(a5, o, companion.g());
                gt2 b = companion.b();
                if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                    a5.q(Integer.valueOf(a3));
                    a5.v(Integer.valueOf(a3), b);
                }
                c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                ap0 ap0Var = ap0.a;
                PostRegiLoginOfferComponentsKt.b(postRegiLoginOfferConfig2, z3, hashMap2, qs2Var4, composer2, 520);
                PostRegiLoginOfferComponentsKt.h(postRegiLoginOfferConfig2, hashMap2, z4, qs2Var5, qs2Var6, composer2, 72);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 1572864, 14);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$PostRegiLoginOfferSubscribeSheet$2
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
                    PostRegiLoginOfferComponentsKt.f(PostRegiLoginOfferConfig.this, z, hashMap, z2, qs2Var, qs2Var2, qs2Var3, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void g(Composer composer, final int i) {
        Composer h = composer.h(-1842355137);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1842355137, i, -1, "com.nytimes.android.messaging.postloginregioffers.components.Spinner (PostRegiLoginOfferComponents.kt:178)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier f = SizeKt.f(aVar, 0.0f, 1, null);
            h.z(733328855);
            Alignment.a aVar2 = Alignment.a;
            rg4 g = BoxKt.g(aVar2.o(), false, h, 0);
            h.z(-1323940314);
            int a = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 c = LayoutKt.c(f);
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
            AndroidView_androidKt.b(new ss2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$Spinner$1$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ProgressBar invoke(Context context) {
                    zq3.h(context, "context");
                    return new ProgressBar(context);
                }
            }, BoxScopeInstance.a.c(aVar, aVar2.e()), null, h, 6, 4);
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
            k.a(new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$Spinner$2
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
                    PostRegiLoginOfferComponentsKt.g(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void h(final PostRegiLoginOfferConfig postRegiLoginOfferConfig, final HashMap hashMap, final boolean z, final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i) {
        zq3.h(postRegiLoginOfferConfig, "postRegiLoginOfferConfig");
        zq3.h(hashMap, "skuDetails");
        zq3.h(qs2Var, "onClickSubscribe");
        zq3.h(qs2Var2, "onClickContinue");
        Composer h = composer.h(786075566);
        if (b.G()) {
            b.S(786075566, i, -1, "com.nytimes.android.messaging.postloginregioffers.components.SubscriptionSection (PostRegiLoginOfferComponents.kt:304)");
        }
        boolean z2 = (z || hashMap.isEmpty()) ? false : true;
        Modifier.a aVar = Modifier.a;
        Modifier h2 = SizeKt.h(aVar, 0.0f, 1, null);
        float f = 8;
        float g = bu1.g(f);
        if (!hashMap.isEmpty()) {
            f = 0;
        }
        Modifier m = PaddingKt.m(h2, 0.0f, bu1.g(f), 0.0f, g, 5, null);
        androidx.compose.material.a aVar2 = androidx.compose.material.a.a;
        eb5.a aVar3 = eb5.Companion;
        long f2 = aVar3.a(h, 8).f();
        long o = aVar3.a(h, 8).o();
        int i2 = androidx.compose.material.a.l;
        ve0 a = aVar2.a(f2, o, 0L, 0L, h, i2 << 12, 12);
        h.z(-727581188);
        boolean z3 = (((i & 7168) ^ 3072) > 2048 && h.S(qs2Var)) || (i & 3072) == 2048;
        Object A = h.A();
        if (z3 || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$SubscriptionSection$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m599invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m599invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        ButtonKt.a((qs2) A, m, z2, null, null, null, null, a, null, zr0.b(h, -1143331938, true, new it2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$SubscriptionSection$2
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(m37 m37Var, Composer composer2, int i3) {
                zq3.h(m37Var, "$this$Button");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1143331938, i3, -1, "com.nytimes.android.messaging.postloginregioffers.components.SubscriptionSection.<anonymous> (PostRegiLoginOfferComponents.kt:316)");
                }
                TextKt.c(PostRegiLoginOfferConfig.this.getSubscribeButtonText(), PaddingKt.i(Modifier.a, bu1.g(2)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(eb5.Companion.a(composer2, 8).o(), ek8.g(16), o.b.g(), null, null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777176, null), composer2, 48, 0, 65532);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 805306368, 376);
        boolean z4 = !z;
        boolean z5 = false;
        xe0 b = aVar2.b(bu1.g(0), 0.0f, 0.0f, 0.0f, 0.0f, h, (i2 << 15) | 6, 30);
        Modifier h3 = SizeKt.h(aVar, 0.0f, 1, null);
        ve0 a2 = aVar2.a(aVar3.a(h, 8).d(), aVar3.a(h, 8).l(), 0L, 0L, h, i2 << 12, 12);
        eb0 a3 = fb0.a(bu1.g(1), aVar3.a(h, 8).l());
        h.z(-727580302);
        if ((((57344 & i) ^ 24576) > 16384 && h.S(qs2Var2)) || (i & 24576) == 16384) {
            z5 = true;
        }
        Object A2 = h.A();
        if (z5 || A2 == Composer.a.a()) {
            A2 = new qs2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$SubscriptionSection$3$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m600invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m600invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A2);
        }
        h.R();
        ButtonKt.a((qs2) A2, h3, z4, null, b, null, a3, a2, null, zr0.b(h, -1374224619, true, new it2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$SubscriptionSection$4
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(m37 m37Var, Composer composer2, int i3) {
                zq3.h(m37Var, "$this$Button");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1374224619, i3, -1, "com.nytimes.android.messaging.postloginregioffers.components.SubscriptionSection.<anonymous> (PostRegiLoginOfferComponents.kt:340)");
                }
                TextKt.c(PostRegiLoginOfferConfig.this.getContinueButtonText(), PaddingKt.i(Modifier.a, bu1.g(2)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(eb5.Companion.a(composer2, 8).l(), ek8.g(16), o.b.g(), null, null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777176, null), composer2, 48, 0, 65532);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 805306416, 296);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$SubscriptionSection$5
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
                    PostRegiLoginOfferComponentsKt.h(PostRegiLoginOfferConfig.this, hashMap, z, qs2Var, qs2Var2, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void i(final PostRegiLoginOfferConfig postRegiLoginOfferConfig, final boolean z, final qs2 qs2Var, Composer composer, final int i) {
        zq3.h(postRegiLoginOfferConfig, "postRegiLoginOfferConfig");
        zq3.h(qs2Var, "onToggleDetail");
        Composer h = composer.h(-1129094668);
        if (b.G()) {
            b.S(-1129094668, i, -1, "com.nytimes.android.messaging.postloginregioffers.components.ValuePropsView (PostRegiLoginOfferComponents.kt:401)");
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
        Modifier m = PaddingKt.m(SizeKt.h(aVar, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bu1.g(20), 7, null);
        h.z(733328855);
        rg4 g2 = BoxKt.g(aVar2.o(), false, h, 0);
        h.z(-1323940314);
        int a5 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a6 = companion.a();
        it2 c2 = LayoutKt.c(m);
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
        Updater.c(a7, o2, companion.g());
        gt2 b2 = companion.b();
        if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
            a7.q(Integer.valueOf(a5));
            a7.v(Integer.valueOf(a5), b2);
        }
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        TextKt.c(postRegiLoginOfferConfig.getValuePropsHeader(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(eb5.Companion.a(h, 8).r(), ek8.g(14), o.b.g(), null, null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777176, null), h, 0, 0, 65534);
        Painter d = do5.d(z ? ue6.chevron_down : ue6.chevron_up, h, 0);
        Modifier c3 = boxScopeInstance.c(aVar, aVar2.f());
        h.z(992286111);
        boolean z2 = (((i & 896) ^ 384) > 256 && h.S(qs2Var)) || (i & 384) == 256;
        Object A = h.A();
        if (z2 || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$ValuePropsView$1$1$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m601invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m601invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        IconKt.b(d, "", ClickableKt.e(c3, false, null, null, (qs2) A, 7, null), 0L, h, 56, 8);
        h.R();
        h.t();
        h.R();
        h.R();
        AnimatedVisibilityKt.d(ap0Var, !z, null, null, null, null, zr0.b(h, -982554, true, new it2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$ValuePropsView$1$2
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((wh) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(wh whVar, Composer composer2, int i2) {
                zq3.h(whVar, "$this$AnimatedVisibility");
                if (b.G()) {
                    b.S(-982554, i2, -1, "com.nytimes.android.messaging.postloginregioffers.components.ValuePropsView.<anonymous>.<anonymous> (PostRegiLoginOfferComponents.kt:430)");
                }
                Modifier m2 = PaddingKt.m(Modifier.a, 0.0f, 0.0f, 0.0f, bu1.g(12), 7, null);
                PostRegiLoginOfferConfig postRegiLoginOfferConfig2 = PostRegiLoginOfferConfig.this;
                composer2.z(-483455358);
                int i3 = 0;
                rg4 a8 = d.a(Arrangement.a.g(), Alignment.a.k(), composer2, 0);
                int i4 = -1323940314;
                composer2.z(-1323940314);
                int a9 = cs0.a(composer2, 0);
                et0 o3 = composer2.o();
                ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                qs2 a10 = companion2.a();
                it2 c4 = LayoutKt.c(m2);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a10);
                } else {
                    composer2.p();
                }
                Composer a11 = Updater.a(composer2);
                Updater.c(a11, a8, companion2.e());
                Updater.c(a11, o3, companion2.g());
                gt2 b3 = companion2.b();
                if (a11.f() || !zq3.c(a11.A(), Integer.valueOf(a9))) {
                    a11.q(Integer.valueOf(a9));
                    a11.v(Integer.valueOf(a9), b3);
                }
                c4.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                int i5 = 2058660585;
                composer2.z(2058660585);
                ap0 ap0Var2 = ap0.a;
                composer2.z(992286356);
                for (ValueProp valueProp : postRegiLoginOfferConfig2.getValueProps()) {
                    composer2.z(693286680);
                    Modifier.a aVar3 = Modifier.a;
                    rg4 a12 = androidx.compose.foundation.layout.m.a(Arrangement.a.f(), Alignment.a.l(), composer2, i3);
                    composer2.z(i4);
                    int a13 = cs0.a(composer2, i3);
                    et0 o4 = composer2.o();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.F;
                    qs2 a14 = companion3.a();
                    it2 c5 = LayoutKt.c(aVar3);
                    if (composer2.j() == null) {
                        cs0.c();
                    }
                    composer2.G();
                    if (composer2.f()) {
                        composer2.D(a14);
                    } else {
                        composer2.p();
                    }
                    Composer a15 = Updater.a(composer2);
                    Updater.c(a15, a12, companion3.e());
                    Updater.c(a15, o4, companion3.g());
                    gt2 b4 = companion3.b();
                    if (a15.f() || !zq3.c(a15.A(), Integer.valueOf(a13))) {
                        a15.q(Integer.valueOf(a13));
                        a15.v(Integer.valueOf(a13), b4);
                    }
                    c5.invoke(ju7.a(ju7.b(composer2)), composer2, Integer.valueOf(i3));
                    composer2.z(i5);
                    n37 n37Var = n37.a;
                    IconKt.b(do5.d(zq3.c(valueProp.getIconName(), "checkmark") ? ue6.ic_checkmark : we6.ic_bullet_point, composer2, i3), "", PaddingKt.m(aVar3, 0.0f, bu1.g(2), bu1.g(10), 0.0f, 9, null), nn0.b.g(), composer2, 3128, 0);
                    composer2.z(1621290826);
                    a.C0064a c0064a = new a.C0064a(i3, 1, null);
                    e e = gb5.e();
                    o.a aVar4 = o.b;
                    o a16 = aVar4.a();
                    eb5.a aVar5 = eb5.Companion;
                    int n = c0064a.n(new jy7(aVar5.a(composer2, 8).l(), ek8.g(14), a16, (l) null, (m) null, e, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, (f) null, (gv1) null, 65496, (DefaultConstructorMarker) null));
                    try {
                        c0064a.i(valueProp.getHeader());
                        ww8 ww8Var = ww8.a;
                        c0064a.k(n);
                        c0064a.i(" ");
                        n = c0064a.n(new jy7(aVar5.a(composer2, 8).r(), ek8.g(14), aVar4.f(), (l) null, (m) null, gb5.e(), (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, (f) null, (gv1) null, 65496, (DefaultConstructorMarker) null));
                        try {
                            c0064a.i(valueProp.getSubheader());
                            c0064a.k(n);
                            a o5 = c0064a.o();
                            composer2.R();
                            TextKt.d(o5, PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, bu1.g(4), 7, null), 0L, 0L, null, null, null, 0L, null, null, ek8.g(20), 0, false, 0, 0, null, null, null, composer2, 48, 6, 261116);
                            composer2.R();
                            composer2.t();
                            composer2.R();
                            composer2.R();
                            i5 = i5;
                            i4 = i4;
                            i3 = i3;
                        } finally {
                        }
                    } finally {
                    }
                }
                composer2.R();
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 1572870, 30);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.messaging.postloginregioffers.components.PostRegiLoginOfferComponentsKt$ValuePropsView$2
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
                    PostRegiLoginOfferComponentsKt.i(PostRegiLoginOfferConfig.this, z, qs2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final a j(String str, String str2, String str3, long j, long j2) {
        int n;
        String str4 = str2;
        zq3.h(str4, "fullPrice");
        zq3.h(str3, "period");
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        if (str != null && !h.d0(str)) {
            n = c0064a.n(new jy7(j, ek8.g(17), o.b.g(), (l) null, (m) null, gb5.e(), (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, ph8.b.b(), (jo7) null, (f) null, (gv1) null, 61400, (DefaultConstructorMarker) null));
            try {
                c0064a.i(str4);
                ww8 ww8Var = ww8.a;
                c0064a.k(n);
                c0064a.i(" ");
            } finally {
                c0064a.k(n);
            }
        }
        n = c0064a.n(new jy7(j2, ek8.g(17), o.b.g(), (l) null, (m) null, gb5.e(), (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, (f) null, (gv1) null, 65496, (DefaultConstructorMarker) null));
        if (str != null) {
            try {
                if (!h.d0(str)) {
                    str4 = str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        c0064a.i(str4 + "/" + (h.P(lowerCase, QueryKeys.MAX_SCROLL_DEPTH, false, 2, null) ? "month" : "year"));
        ww8 ww8Var2 = ww8.a;
        c0064a.k(n);
        return c0064a.o();
    }
}
