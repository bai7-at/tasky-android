package com.nytimes.android.features.you.youtab.composable.interests.column;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.j;
import coil.compose.SingletonAsyncImageKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.interests.db.InterestAsset;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.re6;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.t5;
import defpackage.vg3;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class LargeColumnInterestKt {
    public static final void a(final ss2 ss2Var, final int i, final InterestAsset interestAsset, Modifier modifier, final gt2 gt2Var, Composer composer, final int i2, final int i3) {
        j u1;
        zq3.h(ss2Var, "assetHasBeenViewed");
        zq3.h(interestAsset, "asset");
        zq3.h(gt2Var, "onAssetClick");
        Composer h = composer.h(125372922);
        Modifier modifier2 = (i3 & 8) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(125372922, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.column.LargeAssetWithHeadline (LargeColumnInterest.kt:66)");
        }
        String obj = DateUtils.getRelativeTimeSpanString(interestAsset.n().toInstant().toEpochMilli()).toString();
        final ComponentActivity d = t5.d(h, 0);
        Modifier k = PaddingKt.k(SizeKt.w(ClickableKt.e(modifier2, false, null, null, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.column.LargeColumnInterestKt$LargeAssetWithHeadline$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m519invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m519invoke() {
                gt2.this.invoke(ColumnInterestKt.b(interestAsset, i), d);
            }
        }, 7, null), null, false, 3, null), bu1.g(16), 0.0f, 2, null);
        h.z(-483455358);
        Arrangement.m g = Arrangement.a.g();
        Alignment.a aVar = Alignment.a;
        rg4 a = d.a(g, aVar.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(k);
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
        Modifier.a aVar2 = Modifier.a;
        Modifier b2 = AspectRatioKt.b(SizeKt.h(ap0Var.c(aVar2, aVar.g()), 0.0f, 1, null), 1.0f, false, 2, null);
        h.z(733328855);
        rg4 g2 = BoxKt.g(aVar.o(), false, h, 0);
        h.z(-1323940314);
        int a5 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a6 = companion.a();
        it2 c2 = LayoutKt.c(b2);
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
        gt2 b3 = companion.b();
        if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
            a7.q(Integer.valueOf(a5));
            a7.v(Integer.valueOf(a5), b3);
        }
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        SingletonAsyncImageKt.a(new vg3.a((Context) h.m(AndroidCompositionLocals_androidKt.g())).d(interestAsset.c()).g(re6.ic_placeholder).f(re6.ic_placeholder).c(true).a(), null, AspectRatioKt.b(SizeKt.h(aVar2, 0.0f, 1, null), 1.0f, false, 2, null), null, null, null, ContentScale.a.a(), 0.0f, null, 0, h, 1573304, 952);
        h.z(595354639);
        if (((Boolean) ss2Var.invoke(interestAsset.j())).booleanValue()) {
            BoxKt.a(AspectRatioKt.b(SizeKt.h(BackgroundKt.d(aVar2, nn0.r(eb5.Companion.b(h, 8).a(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), 0.0f, 1, null), 1.0f, false, 2, null), h, 0);
        }
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        SpacerKt.a(SizeKt.n(aVar2, bu1.g(20)), h, 6);
        String h2 = interestAsset.h();
        if (((Boolean) ss2Var.invoke(interestAsset.j())).booleanValue()) {
            h.z(595355188);
            eb5.a aVar3 = eb5.Companion;
            u1 = r32.f((r48 & 1) != 0 ? r32.a.i() : aVar3.b(h, 8).e(), (r48 & 2) != 0 ? r32.a.m() : 0L, (r48 & 4) != 0 ? r32.a.p() : null, (r48 & 8) != 0 ? r32.a.n() : null, (r48 & 16) != 0 ? r32.a.o() : null, (r48 & 32) != 0 ? r32.a.k() : null, (r48 & 64) != 0 ? r32.a.l() : null, (r48 & 128) != 0 ? r32.a.q() : 0L, (r48 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r32.a.g() : null, (r48 & 512) != 0 ? r32.a.w() : null, (r48 & 1024) != 0 ? r32.a.r() : null, (r48 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r32.a.f() : 0L, (r48 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r32.a.u() : null, (r48 & 8192) != 0 ? r32.a.t() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r32.a.j() : null, (r48 & 32768) != 0 ? r32.b.h() : 0, (r48 & 65536) != 0 ? r32.b.i() : 0, (r48 & 131072) != 0 ? r32.b.e() : 0L, (r48 & 262144) != 0 ? r32.b.j() : null, (r48 & 524288) != 0 ? r32.c : null, (r48 & Constants.MB) != 0 ? r32.b.f() : null, (r48 & 2097152) != 0 ? r32.b.d() : 0, (r48 & 4194304) != 0 ? r32.b.c() : 0, (r48 & 8388608) != 0 ? aVar3.c(h, 8).u1().b.k() : null);
            h.R();
        } else {
            h.z(595355341);
            u1 = eb5.Companion.c(h, 8).u1();
            h.R();
        }
        TextKt.c(h2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, u1, h, 0, 0, 65534);
        SpacerKt.a(SizeKt.n(aVar2, bu1.g(8)), h, 6);
        TextKt.c(obj, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).w1(), h, 0, 0, 65534);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            final Modifier modifier3 = modifier2;
            k2.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.column.LargeColumnInterestKt$LargeAssetWithHeadline$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    LargeColumnInterestKt.a(ss2.this, i, interestAsset, modifier3, gt2Var, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }

    public static final void b(final ss2 ss2Var, final int i, final InterestAsset interestAsset, final List list, Modifier modifier, final gt2 gt2Var, Composer composer, final int i2, final int i3) {
        zq3.h(ss2Var, "assetHasBeenViewed");
        zq3.h(interestAsset, "firstAsset");
        zq3.h(list, "horizontalList");
        zq3.h(gt2Var, "onAssetClick");
        Composer h = composer.h(-562656802);
        final Modifier modifier2 = (i3 & 16) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-562656802, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.column.LargeColumnInterest (LargeColumnInterest.kt:38)");
        }
        Modifier f = SizeKt.f(modifier2, 0.0f, 1, null);
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(f);
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
        int i4 = (i2 & 14) | 512 | (i2 & ContentType.LONG_FORM_ON_DEMAND) | ((i2 >> 3) & 57344);
        a(ss2Var, i, interestAsset, null, gt2Var, h, i4, 8);
        SpacerKt.a(SizeKt.n(Modifier.a, bu1.g(28)), h, 6);
        HorizontalAssetCarouselKt.a(ss2Var, i, list, null, gt2Var, h, i4, 8);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.column.LargeColumnInterestKt$LargeColumnInterest$2
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
                    LargeColumnInterestKt.b(ss2.this, i, interestAsset, list, modifier2, gt2Var, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }
}
