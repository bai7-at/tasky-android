package com.nytimes.android.features.you.youtab.composable.interests.newsQuiz;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
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
import com.nytimes.android.designsystem.uicompose.ui.tpl.TPLTypography;
import com.nytimes.android.interests.db.Interest;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import com.nytimes.subauth.ui.purr.ui.compose.CenterTopAppBarKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.m37;
import defpackage.n37;
import defpackage.nn0;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sy4;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yk6;
import defpackage.yx4;
import defpackage.zq3;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class NewsQuizResultKt {
    private static final long a = wn0.d(4284721241L);
    private static final long b = wn0.d(4293651435L);

    public static final void a(final List list, Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        Composer composer2;
        zq3.h(list, "answers");
        Composer h = composer.h(-308394628);
        Modifier modifier3 = (i2 & 2) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-308394628, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.AnswerIndicator (NewsQuizResult.kt:164)");
        }
        Arrangement arrangement = Arrangement.a;
        float f = 3;
        Arrangement.f n = arrangement.n(bu1.g(f));
        Modifier b2 = IntrinsicKt.b(modifier3, IntrinsicSize.Max);
        h.z(-483455358);
        Alignment.a aVar = Alignment.a;
        rg4 a2 = d.a(n, aVar.k(), h, 6);
        h.z(-1323940314);
        int i3 = 0;
        int a3 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c = LayoutKt.c(b2);
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
        gt2 b3 = companion.b();
        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
            a5.q(Integer.valueOf(a3));
            a5.v(Integer.valueOf(a3), b3);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        py1.d(ww8.a, new NewsQuizResultKt$AnswerIndicator$1$1(800, list, 100, null), h, 70);
        int i4 = 693286680;
        if (list.size() <= 11) {
            h.z(-148341312);
            Arrangement.f n2 = arrangement.n(bu1.g(f));
            Alignment.c i5 = aVar.i();
            h.z(693286680);
            Modifier.a aVar2 = Modifier.a;
            rg4 a6 = m.a(n2, i5, h, 54);
            h.z(-1323940314);
            int a7 = cs0.a(h, 0);
            et0 o2 = h.o();
            qs2 a8 = companion.a();
            it2 c2 = LayoutKt.c(aVar2);
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
            c2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            n37 n37Var = n37.a;
            h.z(-148341136);
            for (Object obj : list) {
                int i6 = i3 + 1;
                if (i3 < 0) {
                    i.v();
                }
                b(((Boolean) obj).booleanValue(), b, a, i3 * 100, 800, null, h, 25008, 32);
                h = h;
                i3 = i6;
                modifier3 = modifier3;
            }
            modifier2 = modifier3;
            Composer composer3 = h;
            composer3.R();
            composer3.R();
            composer3.t();
            composer3.R();
            composer3.R();
            composer3.R();
            composer2 = composer3;
        } else {
            modifier2 = modifier3;
            h.z(-148340707);
            int size = (list.size() + 1) / 2;
            List list2 = list;
            List P0 = i.P0(list2, size);
            List e0 = i.e0(list2, size);
            Arrangement.f n3 = arrangement.n(bu1.g(f));
            Alignment.c i7 = aVar.i();
            h.z(693286680);
            Modifier.a aVar3 = Modifier.a;
            rg4 a10 = m.a(n3, i7, h, 54);
            h.z(-1323940314);
            int a11 = cs0.a(h, 0);
            et0 o3 = h.o();
            qs2 a12 = companion.a();
            it2 c3 = LayoutKt.c(aVar3);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a12);
            } else {
                h.p();
            }
            Composer a13 = Updater.a(h);
            Updater.c(a13, a10, companion.e());
            Updater.c(a13, o3, companion.g());
            gt2 b5 = companion.b();
            if (a13.f() || !zq3.c(a13.A(), Integer.valueOf(a11))) {
                a13.q(Integer.valueOf(a11));
                a13.v(Integer.valueOf(a11), b5);
            }
            c3.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            n37 n37Var2 = n37.a;
            h.z(-148340303);
            int i8 = 0;
            for (Object obj2 : P0) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    i.v();
                }
                b(((Boolean) obj2).booleanValue(), b, a, i8 * 100, 800, null, h, 25008, 32);
                i4 = i4;
                i8 = i9;
                f = f;
                h = h;
            }
            Composer composer4 = h;
            composer4.R();
            composer4.R();
            composer4.t();
            composer4.R();
            composer4.R();
            Modifier h2 = SizeKt.h(Modifier.a, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.a;
            float g = bu1.g(f);
            Alignment.a aVar4 = Alignment.a;
            Arrangement.e o4 = arrangement2.o(g, aVar4.g());
            Alignment.c i10 = aVar4.i();
            h.z(i4);
            rg4 a14 = m.a(o4, i10, h, 54);
            h.z(-1323940314);
            int a15 = cs0.a(h, 0);
            et0 o5 = h.o();
            ComposeUiNode.Companion companion2 = ComposeUiNode.F;
            qs2 a16 = companion2.a();
            it2 c4 = LayoutKt.c(h2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a16);
            } else {
                h.p();
            }
            Composer a17 = Updater.a(h);
            Updater.c(a17, a14, companion2.e());
            Updater.c(a17, o5, companion2.g());
            gt2 b6 = companion2.b();
            if (a17.f() || !zq3.c(a17.A(), Integer.valueOf(a15))) {
                a17.q(Integer.valueOf(a15));
                a17.v(Integer.valueOf(a15), b6);
            }
            c4.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            n37 n37Var3 = n37.a;
            h.z(-148339575);
            int i11 = 0;
            for (Object obj3 : e0) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    i.v();
                }
                b(((Boolean) obj3).booleanValue(), b, a, (P0.size() + i11) * 100, 800, null, h, 25008, 32);
                i11 = i12;
                h = h;
            }
            composer2 = h;
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            composer2.R();
        }
        composer2.R();
        composer2.t();
        composer2.R();
        composer2.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = composer2.k();
        if (k != null) {
            final Modifier modifier4 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$AnswerIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                    invoke((Composer) obj4, ((Number) obj5).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer5, int i13) {
                    NewsQuizResultKt.a(list, modifier4, composer5, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final boolean r24, final long r25, final long r27, final int r29, final int r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.b(boolean, long, long, int, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean c(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    private static final boolean e(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    private static final long g(x08 x08Var) {
        return ((nn0) x08Var.getValue()).B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    public static final void i(final qs2 qs2Var, final Interest.CompletedNewsQuizData completedNewsQuizData, final qs2 qs2Var2, Modifier modifier, final qs2 qs2Var3, Composer composer, final int i, final int i2) {
        j f;
        j f2;
        zq3.h(qs2Var, "sendCompletedNewsQuizImpression");
        zq3.h(completedNewsQuizData, "completedQuiz");
        zq3.h(qs2Var2, "sendTakePastNewsQuizzesImpression");
        zq3.h(qs2Var3, "onAssetClick");
        Composer h = composer.h(-565765525);
        Modifier modifier2 = (i2 & 8) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-565765525, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResult (NewsQuizResult.kt:63)");
        }
        ww8 ww8Var = ww8.a;
        h.z(1906899235);
        boolean z = (((i & 896) ^ 384) > 256 && h.S(qs2Var2)) || (i & 384) == 256;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new NewsQuizResultKt$NewsQuizResult$1$1(qs2Var2, null);
            h.q(A);
        }
        h.R();
        py1.d(ww8Var, (gt2) A, h, 70);
        final Modifier modifier3 = modifier2;
        Modifier k = PaddingKt.k(SizeKt.h(modifier2, 0.0f, 1, null), bu1.g(16), 0.0f, 2, null);
        h.z(-483455358);
        Arrangement arrangement = Arrangement.a;
        Arrangement.m g = arrangement.g();
        Alignment.a aVar = Alignment.a;
        rg4 a2 = d.a(g, aVar.k(), h, 0);
        h.z(-1323940314);
        int a3 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c = LayoutKt.c(k);
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
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        h.z(2025264647);
        boolean z2 = (((i & 14) ^ 6) > 4 && h.S(qs2Var)) || (i & 6) == 4;
        Object A2 = h.A();
        if (z2 || A2 == Composer.a.a()) {
            A2 = new NewsQuizResultKt$NewsQuizResult$2$1$1(qs2Var, null);
            h.q(A2);
        }
        h.R();
        py1.d(ww8Var, (gt2) A2, h, 70);
        Modifier.a aVar2 = Modifier.a;
        Modifier h2 = SizeKt.h(aVar2, 0.0f, 1, null);
        float f3 = 20;
        Arrangement.f n = arrangement.n(bu1.g(f3));
        h.z(693286680);
        rg4 a6 = m.a(n, aVar.l(), h, 6);
        h.z(-1323940314);
        int a7 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a8 = companion.a();
        it2 c2 = LayoutKt.c(h2);
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
        gt2 b3 = companion.b();
        if (a9.f() || !zq3.c(a9.A(), Integer.valueOf(a7))) {
            a9.q(Integer.valueOf(a7));
            a9.v(Integer.valueOf(a7), b3);
        }
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        n37 n37Var = n37.a;
        String d = completedNewsQuizData.d();
        if (d == null) {
            d = "";
        }
        String str = d;
        Modifier c3 = n37Var.c(m37.b(n37Var, aVar2, 1.0f, false, 2, null), aVar.i());
        long g2 = ek8.g(18);
        j value = TPLTypography.text14.getValue();
        eb5.a aVar3 = eb5.Companion;
        f = value.f((r48 & 1) != 0 ? value.a.i() : aVar3.b(h, 8).g(), (r48 & 2) != 0 ? value.a.m() : 0L, (r48 & 4) != 0 ? value.a.p() : null, (r48 & 8) != 0 ? value.a.n() : null, (r48 & 16) != 0 ? value.a.o() : null, (r48 & 32) != 0 ? value.a.k() : null, (r48 & 64) != 0 ? value.a.l() : null, (r48 & 128) != 0 ? value.a.q() : 0L, (r48 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? value.a.g() : null, (r48 & 512) != 0 ? value.a.w() : null, (r48 & 1024) != 0 ? value.a.r() : null, (r48 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? value.a.f() : 0L, (r48 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? value.a.u() : null, (r48 & 8192) != 0 ? value.a.t() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? value.a.j() : null, (r48 & 32768) != 0 ? value.b.h() : 0, (r48 & 65536) != 0 ? value.b.i() : 0, (r48 & 131072) != 0 ? value.b.e() : 0L, (r48 & 262144) != 0 ? value.b.j() : null, (r48 & 524288) != 0 ? value.c : null, (r48 & Constants.MB) != 0 ? value.b.f() : null, (r48 & 2097152) != 0 ? value.b.d() : 0, (r48 & 4194304) != 0 ? value.b.c() : 0, (r48 & 8388608) != 0 ? value.b.k() : null);
        TextKt.c(str, c3, 0L, 0L, null, null, null, 0L, null, null, g2, 0, false, 0, 0, null, f, h, 0, 6, 64508);
        j(completedNewsQuizData, null, h, 8, 2);
        h.R();
        h.t();
        h.R();
        h.R();
        SpacerKt.a(SizeKt.n(aVar2, bu1.g(f3)), h, 6);
        h.z(2025265416);
        boolean z3 = (((57344 & i) ^ 24576) > 16384 && h.S(qs2Var3)) || (i & 24576) == 16384;
        Object A3 = h.A();
        if (z3 || A3 == Composer.a.a()) {
            A3 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$NewsQuizResult$2$3$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m533invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m533invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A3);
        }
        h.R();
        Modifier e = ModifierUtilsKt.e(ClickableKt.e(aVar2, false, null, null, (qs2) A3, 7, null), aVar3.b(h, 8).g(), bu1.g(1), CenterTopAppBarKt.q(4));
        String b4 = k48.b(yk6.take_past_quizzes, h, 0);
        f2 = r35.f((r48 & 1) != 0 ? r35.a.i() : aVar3.b(h, 8).g(), (r48 & 2) != 0 ? r35.a.m() : 0L, (r48 & 4) != 0 ? r35.a.p() : null, (r48 & 8) != 0 ? r35.a.n() : null, (r48 & 16) != 0 ? r35.a.o() : null, (r48 & 32) != 0 ? r35.a.k() : null, (r48 & 64) != 0 ? r35.a.l() : null, (r48 & 128) != 0 ? r35.a.q() : 0L, (r48 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r35.a.g() : null, (r48 & 512) != 0 ? r35.a.w() : null, (r48 & 1024) != 0 ? r35.a.r() : null, (r48 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r35.a.f() : 0L, (r48 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r35.a.u() : null, (r48 & 8192) != 0 ? r35.a.t() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r35.a.j() : null, (r48 & 32768) != 0 ? r35.b.h() : 0, (r48 & 65536) != 0 ? r35.b.i() : 0, (r48 & 131072) != 0 ? r35.b.e() : 0L, (r48 & 262144) != 0 ? r35.b.j() : null, (r48 & 524288) != 0 ? r35.c : null, (r48 & Constants.MB) != 0 ? r35.b.f() : null, (r48 & 2097152) != 0 ? r35.b.d() : 0, (r48 & 4194304) != 0 ? r35.b.c() : 0, (r48 & 8388608) != 0 ? TPLTypography.title14.getValue().b.k() : null);
        TextKt.c(b4, e, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, f2, h, 0, 0, 65532);
        SpacerKt.a(SizeKt.n(aVar2, bu1.g(24)), h, 6);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$NewsQuizResult$3
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
                    NewsQuizResultKt.i(qs2.this, completedNewsQuizData, qs2Var2, modifier3, qs2Var3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void j(final Interest.CompletedNewsQuizData completedNewsQuizData, Modifier modifier, Composer composer, final int i, final int i2) {
        j f;
        long i3;
        zq3.h(completedNewsQuizData, "completedQuiz");
        Composer h = composer.h(-657792116);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-657792116, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.ScoreDisplay (NewsQuizResult.kt:113)");
        }
        List b2 = completedNewsQuizData.b();
        int size = b2 != null ? b2.size() : 0;
        Float c = completedNewsQuizData.c();
        boolean z = size > 0 && ((c != null ? c.floatValue() : 0.0f) / ((float) size)) * ((float) 100) >= 50.0f;
        Alignment.a aVar = Alignment.a;
        Alignment.b g = aVar.g();
        h.z(-483455358);
        Arrangement arrangement = Arrangement.a;
        rg4 a2 = d.a(arrangement.g(), g, h, 48);
        h.z(-1323940314);
        int a3 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c2 = LayoutKt.c(modifier2);
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
        gt2 b3 = companion.b();
        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
            a5.q(Integer.valueOf(a3));
            a5.v(Integer.valueOf(a3), b3);
        }
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        String upperCase = k48.b(yk6.your_score, h, 0).toUpperCase(Locale.ROOT);
        zq3.g(upperCase, "toUpperCase(...)");
        j value = TPLTypography.labelEmphasis.getValue();
        eb5.a aVar2 = eb5.Companion;
        f = value.f((r48 & 1) != 0 ? value.a.i() : aVar2.b(h, 8).g(), (r48 & 2) != 0 ? value.a.m() : 0L, (r48 & 4) != 0 ? value.a.p() : null, (r48 & 8) != 0 ? value.a.n() : null, (r48 & 16) != 0 ? value.a.o() : null, (r48 & 32) != 0 ? value.a.k() : null, (r48 & 64) != 0 ? value.a.l() : null, (r48 & 128) != 0 ? value.a.q() : 0L, (r48 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? value.a.g() : null, (r48 & 512) != 0 ? value.a.w() : null, (r48 & 1024) != 0 ? value.a.r() : null, (r48 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? value.a.f() : 0L, (r48 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? value.a.u() : null, (r48 & 8192) != 0 ? value.a.t() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? value.a.j() : null, (r48 & 32768) != 0 ? value.b.h() : 0, (r48 & 65536) != 0 ? value.b.i() : 0, (r48 & 131072) != 0 ? value.b.e() : 0L, (r48 & 262144) != 0 ? value.b.j() : null, (r48 & 524288) != 0 ? value.c : null, (r48 & Constants.MB) != 0 ? value.b.f() : null, (r48 & 2097152) != 0 ? value.b.d() : 0, (r48 & 4194304) != 0 ? value.b.c() : 0, (r48 & 8388608) != 0 ? value.b.k() : null);
        final Modifier modifier3 = modifier2;
        TextKt.c(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, f, h, 0, 0, 65534);
        h.z(693286680);
        Modifier.a aVar3 = Modifier.a;
        rg4 a6 = m.a(arrangement.f(), aVar.l(), h, 0);
        h.z(-1323940314);
        int a7 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a8 = companion.a();
        it2 c3 = LayoutKt.c(aVar3);
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
        n37 n37Var = n37.a;
        Float c4 = completedNewsQuizData.c();
        k(c4 != null ? c4.floatValue() : 0.0f, null, 0L, 0.0f, 0.0f, h, 0, 30);
        h.z(733328855);
        rg4 g2 = BoxKt.g(aVar.o(), false, h, 0);
        h.z(-1323940314);
        int a10 = cs0.a(h, 0);
        et0 o3 = h.o();
        qs2 a11 = companion.a();
        it2 c5 = LayoutKt.c(aVar3);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a11);
        } else {
            h.p();
        }
        Composer a12 = Updater.a(h);
        Updater.c(a12, g2, companion.e());
        Updater.c(a12, o3, companion.g());
        gt2 b5 = companion.b();
        if (a12.f() || !zq3.c(a12.A(), Integer.valueOf(a10))) {
            a12.q(Integer.valueOf(a10));
            a12.v(Integer.valueOf(a10), b5);
        }
        c5.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        Modifier c6 = OffsetKt.c(aVar3, 0.0f, bu1.g(20), 1, null);
        List b6 = completedNewsQuizData.b();
        String str = "/" + (b6 != null ? Integer.valueOf(b6.size()) : null);
        j value2 = TPLTypography.headline28.getValue();
        if (z) {
            h.z(255051763);
            i3 = aVar2.b(h, 8).g();
            h.R();
        } else {
            h.z(255051841);
            i3 = aVar2.b(h, 8).i();
            h.R();
        }
        TextKt.c(str, c6, i3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, value2, h, 48, 0, 65528);
        h.R();
        h.t();
        h.R();
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        h.z(693286680);
        rg4 a13 = m.a(arrangement.f(), aVar.l(), h, 0);
        h.z(-1323940314);
        int a14 = cs0.a(h, 0);
        et0 o4 = h.o();
        qs2 a15 = companion.a();
        it2 c7 = LayoutKt.c(aVar3);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a15);
        } else {
            h.p();
        }
        Composer a16 = Updater.a(h);
        Updater.c(a16, a13, companion.e());
        Updater.c(a16, o4, companion.g());
        gt2 b7 = companion.b();
        if (a16.f() || !zq3.c(a16.A(), Integer.valueOf(a14))) {
            a16.q(Integer.valueOf(a14));
            a16.v(Integer.valueOf(a14), b7);
        }
        c7.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        List b8 = completedNewsQuizData.b();
        if (b8 == null) {
            b8 = i.l();
        }
        a(b8, null, h, 8, 2);
        SpacerKt.a(SizeKt.s(aVar3, bu1.g(4)), h, 6);
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
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt$ScoreDisplay$2
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
                    NewsQuizResultKt.j(Interest.CompletedNewsQuizData.this, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0328 A[LOOP:0: B:81:0x0322->B:83:0x0328, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final float r70, androidx.compose.ui.Modifier r71, long r72, float r74, float r75, androidx.compose.runtime.Composer r76, final int r77, final int r78) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.interests.newsQuiz.NewsQuizResultKt.k(float, androidx.compose.ui.Modifier, long, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(yx4 yx4Var) {
        return yx4Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(yx4 yx4Var, float f) {
        yx4Var.r(f);
    }

    private static final boolean n(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }
}
