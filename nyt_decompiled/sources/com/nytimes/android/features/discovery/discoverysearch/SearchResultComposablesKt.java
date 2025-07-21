package com.nytimes.android.features.discovery.discoverysearch;

import android.content.res.Configuration;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.h;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.ui.NytTextStyle;
import com.nytimes.android.designsystem.uicompose.ui.tpl.XPNTypography;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import defpackage.aj8;
import defpackage.ap0;
import defpackage.br;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dg4;
import defpackage.dk8;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hd5;
import defpackage.he7;
import defpackage.hj8;
import defpackage.hn3;
import defpackage.ie7;
import defpackage.it2;
import defpackage.iv0;
import defpackage.ju7;
import defpackage.kb5;
import defpackage.kj8;
import defpackage.m37;
import defpackage.n37;
import defpackage.ow8;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class SearchResultComposablesKt {
    private static final float a = bu1.g(16);
    private static final float b = bu1.g(8);
    private static final float c = bu1.g(88);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r19, androidx.compose.ui.Modifier r20, float r21, float r22, androidx.compose.ui.layout.ContentScale r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.discovery.discoverysearch.SearchResultComposablesKt.a(java.lang.String, androidx.compose.ui.Modifier, float, float, androidx.compose.ui.layout.ContentScale, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final he7 he7Var, Modifier modifier, br brVar, Composer composer, final int i, final int i2) {
        final br brVar2;
        int i3;
        ww8 ww8Var;
        Modifier.a aVar;
        br brVar3;
        Composer composer2;
        Composer composer3;
        zq3.h(he7Var, "result");
        Composer h = composer.h(1744699379);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.a : modifier;
        if ((i2 & 4) != 0) {
            i3 = i & (-897);
            brVar2 = ow8.a.a(h, ow8.b);
        } else {
            brVar2 = brVar;
            i3 = i;
        }
        if (b.G()) {
            b.S(1744699379, i3, -1, "com.nytimes.android.features.discovery.discoverysearch.SearchResultItem (SearchResultComposables.kt:44)");
        }
        Modifier d = ModifierUtilsKt.d(PaddingKt.i(ClickableKt.e(modifier2, false, null, null, new qs2() { // from class: com.nytimes.android.features.discovery.discoverysearch.SearchResultComposablesKt$SearchResultItem$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m367invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m367invoke() {
                br.this.c(ie7.a(he7Var));
            }
        }, 7, null), a), "content");
        h.z(693286680);
        Arrangement arrangement = Arrangement.a;
        Arrangement.e f = arrangement.f();
        Alignment.a aVar2 = Alignment.a;
        rg4 a2 = m.a(f, aVar2.l(), h, 0);
        h.z(-1323940314);
        int a3 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c2 = LayoutKt.c(d);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a4);
        } else {
            h.p();
        }
        Composer a5 = Updater.a(h);
        Updater.c(a5, a2, companion.e());
        Updater.c(a5, o, companion.g());
        gt2 b2 = companion.b();
        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
            a5.q(Integer.valueOf(a3));
            a5.v(Integer.valueOf(a3), b2);
        }
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        n37 n37Var = n37.a;
        Modifier.a aVar3 = Modifier.a;
        Modifier b3 = m37.b(n37Var, aVar3, 1.0f, false, 2, null);
        h.z(-483455358);
        rg4 a6 = d.a(arrangement.g(), aVar2.k(), h, 0);
        h.z(-1323940314);
        int a7 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a8 = companion.a();
        it2 c3 = LayoutKt.c(b3);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a8);
        } else {
            h.p();
        }
        Composer a9 = Updater.a(h);
        Updater.c(a9, a6, companion.e());
        Updater.c(a9, o2, companion.g());
        gt2 b4 = companion.b();
        if (a9.f() || !zq3.c(a9.A(), Integer.valueOf(a7))) {
            a9.q(Integer.valueOf(a7));
            a9.v(Integer.valueOf(a7), b4);
        }
        c3.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        String d2 = he7Var.d();
        h.z(1482127517);
        if (d2 == null) {
            ww8Var = null;
        } else {
            c(he7Var.h(), he7Var.m(), he7Var.l(), String.valueOf(he7Var.g()), d2, h, 0);
            ww8Var = ww8.a;
        }
        h.R();
        h.z(1482127500);
        if (ww8Var == null) {
            aVar = aVar3;
            brVar3 = brVar2;
            TextKt.c(he7Var.h(), ModifierUtilsKt.d(aVar3, "headline"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, h, 0, 0, 131068);
            String g = he7Var.g();
            h.z(1482128048);
            if (g == null) {
                composer2 = h;
            } else {
                composer2 = h;
                TextKt.c(g, ModifierUtilsKt.d(PaddingKt.m(aVar, 0.0f, bu1.g(8), 0.0f, 0.0f, 13, null), "summary"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131068);
                ww8 ww8Var2 = ww8.a;
            }
            composer2.R();
        } else {
            aVar = aVar3;
            brVar3 = brVar2;
            composer2 = h;
        }
        composer2.R();
        String c4 = he7Var.c();
        Composer composer4 = composer2;
        composer4.z(741025335);
        if (c4 == null) {
            composer3 = composer4;
        } else {
            j b5 = kb5.b(NytTextStyle.TIMESTAMP, null, false, composer4, 6, 3);
            Modifier d3 = ModifierUtilsKt.d(PaddingKt.m(SizeKt.s(aVar, bu1.g(100)), 0.0f, bu1.g(8), bu1.g(20), 0.0f, 9, null), "timestamp");
            composer3 = composer4;
            TextKt.c(c4, d3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b5, composer3, 0, 0, 65532);
        }
        composer3.R();
        composer3.R();
        composer3.t();
        composer3.R();
        composer3.R();
        composer3.R();
        composer3.t();
        composer3.R();
        composer3.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = composer3.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            final br brVar4 = brVar3;
            k.a(new gt2() { // from class: com.nytimes.android.features.discovery.discoverysearch.SearchResultComposablesKt$SearchResultItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer5, int i4) {
                    SearchResultComposablesKt.b(he7.this, modifier3, brVar4, composer5, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final String str, final boolean z, final boolean z2, final String str2, final String str3, Composer composer, final int i) {
        int i2;
        aj8 a2;
        long g;
        Composer composer2;
        sy4 sy4Var;
        int i3;
        Modifier.a aVar;
        Composer composer3;
        final sy4 sy4Var2;
        Composer h = composer.h(-275602584);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.a(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.a(z2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.S(str2) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= h.S(str3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i4 = i2;
        if ((46811 & i4) == 9362 && h.i()) {
            h.K();
            composer3 = h;
        } else {
            if (b.G()) {
                b.S(-275602584, i4, -1, "com.nytimes.android.features.discovery.discoverysearch.WrappedSummaryImage (SearchResultComposables.kt:96)");
            }
            h.z(185673623);
            Object A = h.A();
            Composer.a aVar2 = Composer.a;
            if (A == aVar2.a()) {
                A = b0.e(null, null, 2, null);
                h.q(A);
            }
            final sy4 sy4Var3 = (sy4) A;
            h.R();
            h.z(185673705);
            Object A2 = h.A();
            if (A2 == aVar2.a()) {
                A2 = b0.e(0, null, 2, null);
                h.q(A2);
            }
            sy4 sy4Var4 = (sy4) A2;
            h.R();
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            float f = c;
            float f1 = fm1Var.f1(f);
            h.z(185673851);
            fm1 fm1Var2 = (fm1) h.m(CompositionLocalsKt.e());
            NytTextStyle nytTextStyle = NytTextStyle.SUMMARY_MEDIUM;
            float t0 = fm1Var2.t0(ek8.f(dk8.h(kb5.b(nytTextStyle, null, false, h, 6, 3).w())));
            h.R();
            h.z(185673982);
            fm1 fm1Var3 = (fm1) h.m(CompositionLocalsKt.e());
            float g2 = bu1.g(((Configuration) h.m(AndroidCompositionLocals_androidKt.f())).screenWidthDp);
            float f2 = a;
            float f3 = b;
            float f12 = fm1Var3.f1(bu1.g(g2 - bu1.g(bu1.g(bu1.g(f2 + f3) + f) + f2)));
            h.R();
            h a3 = hj8.a(0, h, 0, 1);
            h.z(185674252);
            a2 = a3.a(str, (r24 & 2) != 0 ? j.d.a() : null, (r24 & 4) != 0 ? kj8.a.a() : 0, (r24 & 8) != 0, (r24 & 16) != 0 ? Integer.MAX_VALUE : 0, (r24 & 32) != 0 ? iv0.b(0, 0, 0, 0, 15, null) : fv0.b.e(dg4.d(f12)), (r24 & 64) != 0 ? a3.c : null, (r24 & 128) != 0 ? a3.b : (fm1) h.m(CompositionLocalsKt.e()), (r24 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? a3.a : null, (r24 & 512) != 0 ? false : false);
            float f4 = hn3.f(a2.B());
            int d = f4 < f1 ? dg4.d((f1 - f4) / t0) : 0;
            h.R();
            h.z(-483455358);
            Modifier.a aVar3 = Modifier.a;
            Arrangement arrangement = Arrangement.a;
            Arrangement.m g3 = arrangement.g();
            Alignment.a aVar4 = Alignment.a;
            rg4 a4 = d.a(g3, aVar4.k(), h, 0);
            h.z(-1323940314);
            int a5 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a6 = companion.a();
            it2 c2 = LayoutKt.c(aVar3);
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
            Updater.c(a7, a4, companion.e());
            Updater.c(a7, o, companion.g());
            gt2 b2 = companion.b();
            if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                a7.q(Integer.valueOf(a5));
                a7.v(Integer.valueOf(a5), b2);
            }
            c2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            h.z(693286680);
            rg4 a8 = m.a(arrangement.f(), aVar4.l(), h, 0);
            h.z(-1323940314);
            int a9 = cs0.a(h, 0);
            et0 o2 = h.o();
            qs2 a10 = companion.a();
            it2 c3 = LayoutKt.c(aVar3);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a10);
            } else {
                h.p();
            }
            Composer a11 = Updater.a(h);
            Updater.c(a11, a8, companion.e());
            Updater.c(a11, o2, companion.g());
            gt2 b3 = companion.b();
            if (a11.f() || !zq3.c(a11.A(), Integer.valueOf(a9))) {
                a11.q(Integer.valueOf(a9));
                a11.v(Integer.valueOf(a9), b3);
            }
            c3.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            Modifier b4 = m37.b(n37.a, aVar3, 1.0f, false, 2, null);
            h.z(-483455358);
            rg4 a12 = d.a(arrangement.g(), aVar4.k(), h, 0);
            h.z(-1323940314);
            int a13 = cs0.a(h, 0);
            et0 o3 = h.o();
            qs2 a14 = companion.a();
            it2 c4 = LayoutKt.c(b4);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a14);
            } else {
                h.p();
            }
            Composer a15 = Updater.a(h);
            Updater.c(a15, a12, companion.e());
            Updater.c(a15, o3, companion.g());
            gt2 b5 = companion.b();
            if (a15.f() || !zq3.c(a15.A(), Integer.valueOf(a13))) {
                a15.q(Integer.valueOf(a13));
                a15.v(Integer.valueOf(a13), b5);
            }
            c4.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            j value = (z2 ? XPNTypography.title20 : XPNTypography.headline20).getValue();
            if (z) {
                h.z(-1523965579);
                g = eb5.Companion.b(h, 8).i();
            } else {
                h.z(-1523965531);
                g = eb5.Companion.b(h, 8).g();
            }
            h.R();
            TextKt.c(str, ModifierUtilsKt.d(PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, bu1.g(8), 7, null), "headline"), g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, value, h, i4 & 14, 0, 65528);
            h.z(-1503713843);
            if (d > 0) {
                Modifier d2 = ModifierUtilsKt.d(aVar3, "summary");
                j b6 = kb5.b(nytTextStyle, null, false, h, 6, 3);
                h.z(-1523964784);
                boolean z3 = (i4 & 7168) == 2048;
                Object A3 = h.A();
                if (z3 || A3 == aVar2.a()) {
                    sy4Var2 = sy4Var4;
                    A3 = new ss2() { // from class: com.nytimes.android.features.discovery.discoverysearch.SearchResultComposablesKt$WrappedSummaryImage$1$1$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(aj8 aj8Var) {
                            zq3.h(aj8Var, "result");
                            if (!aj8Var.f() || aj8Var.n() <= 0) {
                                sy4Var3.setValue(null);
                                sy4Var2.setValue(0);
                                return;
                            }
                            int x = aj8Var.x(hd5.a(aj8Var.t(aj8Var.n() - 1), aj8Var.v(aj8Var.n() - 1)));
                            if (x <= 0 || x >= str2.length()) {
                                return;
                            }
                            sy4 sy4Var5 = sy4Var3;
                            String substring = str2.substring(x, r1.length() - 1);
                            zq3.g(substring, "substring(...)");
                            sy4Var5.setValue(kotlin.text.h.f1(substring).toString());
                            sy4Var2.setValue(2);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((aj8) obj);
                            return ww8.a;
                        }
                    };
                    h.q(A3);
                } else {
                    sy4Var2 = sy4Var4;
                }
                h.R();
                aVar = aVar3;
                sy4Var = sy4Var2;
                composer2 = h;
                i3 = i4;
                TextKt.c(str2, d2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, d, 0, (ss2) A3, b6, composer2, (i4 >> 9) & 14, 0, 24572);
                sy4Var3 = sy4Var3;
            } else {
                composer2 = h;
                sy4Var = sy4Var4;
                i3 = i4;
                aVar = aVar3;
                sy4Var3.setValue(str2);
            }
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            a(str3, PaddingKt.m(aVar, f3, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0.0f, null, composer2, ((i3 >> 12) & 14) | 48, 28);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            String str4 = (String) sy4Var3.getValue();
            Composer composer4 = composer2;
            composer4.z(185678135);
            if (str4 == null) {
                composer3 = composer4;
            } else {
                Modifier.a aVar5 = aVar;
                composer3 = composer4;
                TextKt.c(str4, ModifierUtilsKt.d(PaddingKt.m(aVar5, 0.0f, bu1.g(((Number) sy4Var.getValue()).intValue()), 0.0f, 0.0f, 13, null), "summaryOverflow"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, kb5.b(nytTextStyle, null, false, composer4, 6, 3), composer3, 0, 0, 65532);
                ww8 ww8Var = ww8.a;
            }
            composer3.R();
            composer3.R();
            composer3.t();
            composer3.R();
            composer3.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer3.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.discovery.discoverysearch.SearchResultComposablesKt$WrappedSummaryImage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer5, int i5) {
                    SearchResultComposablesKt.c(str, z, z2, str2, str3, composer5, gt6.a(i | 1));
                }
            });
        }
    }
}
