package com.nytimes.android.features.you.youtab.composable.interests.column;

import android.text.format.DateUtils;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
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
import defpackage.kj8;
import defpackage.n37;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.t5;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class HorizontalAssetCarouselKt {
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    public static final void a(final ss2 ss2Var, final int i, final List list, Modifier modifier, final gt2 gt2Var, Composer composer, final int i2, final int i3) {
        j l;
        zq3.h(ss2Var, "assetHasBeenViewed");
        zq3.h(list, "assetList");
        zq3.h(gt2Var, "onAssetClick");
        Composer h = composer.h(-1232784426);
        Modifier modifier2 = (i3 & 8) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-1232784426, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.column.HorizontalAssetCarousel (HorizontalAssetCarousel.kt:32)");
        }
        boolean z = 0;
        float f = 16;
        Modifier m = PaddingKt.m(PaddingKt.m(ScrollKt.b(SizeKt.w(modifier2, null, false, 3, null), ScrollKt.c(0, h, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, bu1.g(32), 7, null), bu1.g(f), 0.0f, 0.0f, 0.0f, 14, null);
        Arrangement.f n = Arrangement.a.n(bu1.g(f));
        h.z(693286680);
        rg4 a = m.a(n, Alignment.a.l(), h, 6);
        int i4 = -1323940314;
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
        n37 n37Var = n37.a;
        h.z(-1147782998);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final InterestAsset interestAsset = (InterestAsset) it2.next();
            String obj = DateUtils.getRelativeTimeSpanString(interestAsset.n().toInstant().toEpochMilli()).toString();
            final ComponentActivity d = t5.d(h, z);
            Modifier.a aVar = Modifier.a;
            Modifier e = ClickableKt.e(aVar, false, null, null, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.column.HorizontalAssetCarouselKt$HorizontalAssetCarousel$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m518invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m518invoke() {
                    gt2.this.invoke(ColumnInterestKt.b(interestAsset, i), d);
                }
            }, 7, null);
            h.z(-483455358);
            rg4 a5 = d.a(Arrangement.a.g(), Alignment.a.k(), h, z);
            h.z(i4);
            int a6 = cs0.a(h, z);
            et0 o2 = h.o();
            ComposeUiNode.Companion companion2 = ComposeUiNode.F;
            qs2 a7 = companion2.a();
            it2 c2 = LayoutKt.c(e);
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
            Updater.c(a8, a5, companion2.e());
            Updater.c(a8, o2, companion2.g());
            gt2 b2 = companion2.b();
            if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                a8.q(Integer.valueOf(a6));
                a8.v(Integer.valueOf(a6), b2);
            }
            c2.invoke(ju7.a(ju7.b(h)), h, Integer.valueOf((int) z));
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            Modifier w = SizeKt.w(SizeKt.s(aVar, bu1.g(200)), null, z, 3, null);
            String h2 = interestAsset.h();
            if (((Boolean) ss2Var.invoke(interestAsset.j())).booleanValue()) {
                h.z(-1609069707);
                eb5.a aVar2 = eb5.Companion;
                l = r33.f((r48 & 1) != 0 ? r33.a.i() : aVar2.b(h, 8).e(), (r48 & 2) != 0 ? r33.a.m() : 0L, (r48 & 4) != 0 ? r33.a.p() : null, (r48 & 8) != 0 ? r33.a.n() : null, (r48 & 16) != 0 ? r33.a.o() : null, (r48 & 32) != 0 ? r33.a.k() : null, (r48 & 64) != 0 ? r33.a.l() : null, (r48 & 128) != 0 ? r33.a.q() : 0L, (r48 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r33.a.g() : null, (r48 & 512) != 0 ? r33.a.w() : null, (r48 & 1024) != 0 ? r33.a.r() : null, (r48 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r33.a.f() : 0L, (r48 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r33.a.u() : null, (r48 & 8192) != 0 ? r33.a.t() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r33.a.j() : null, (r48 & 32768) != 0 ? r33.b.h() : 0, (r48 & 65536) != 0 ? r33.b.i() : 0, (r48 & 131072) != 0 ? r33.b.e() : 0L, (r48 & 262144) != 0 ? r33.b.j() : null, (r48 & 524288) != 0 ? r33.c : null, (r48 & Constants.MB) != 0 ? r33.b.f() : null, (r48 & 2097152) != 0 ? r33.b.d() : 0, (r48 & 4194304) != 0 ? r33.b.c() : 0, (r48 & 8388608) != 0 ? aVar2.c(h, 8).l().b.k() : null);
                h.R();
            } else {
                h.z(-1609069514);
                l = eb5.Companion.c(h, 8).l();
                h.R();
            }
            TextKt.c(h2, w, 0L, 0L, null, null, null, 0L, null, null, 0L, kj8.a.b(), false, 5, 0, null, l, h, 48, 3120, 55292);
            SpacerKt.a(SizeKt.n(aVar, bu1.g(8)), h, 6);
            TextKt.c(obj, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).w1(), h, 0, 0, 65534);
            h.R();
            h.t();
            h.R();
            h.R();
            i4 = -1323940314;
            z = z;
            modifier2 = modifier2;
        }
        final Modifier modifier3 = modifier2;
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.column.HorizontalAssetCarouselKt$HorizontalAssetCarousel$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    HorizontalAssetCarouselKt.a(ss2.this, i, list, modifier3, gt2Var, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }
}
