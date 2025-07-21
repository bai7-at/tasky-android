package com.nytimes.android.libs.messagingarchitecture.composable;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.a;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.airbnb.lottie.compose.c;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.composable.ButtonKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d37;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fb0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.js0;
import defpackage.ju7;
import defpackage.lc4;
import defpackage.m37;
import defpackage.n37;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.se6;
import defpackage.wt7;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.text.h;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class CenterModalKt {
    public static final void a(final String str, final a aVar, final a aVar2, final String str2, final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(aVar, "bodyText");
        zq3.h(qs2Var, "onClickButton");
        zq3.h(qs2Var2, "onClickClose");
        Composer h = composer.h(-47498697);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(aVar) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(aVar2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.S(str2) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= h.C(qs2Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= h.C(qs2Var2) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-47498697, i2, -1, "com.nytimes.android.libs.messagingarchitecture.composable.CenterModal (CenterModal.kt:44)");
            }
            composer2 = h;
            SurfaceKt.a(null, d37.c(bu1.g(4)), 0L, 0L, null, bu1.g(2), zr0.b(h, 1784466043, true, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.composable.CenterModalKt$CenterModal$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                private static final LottieComposition b(lc4 lc4Var) {
                    return (LottieComposition) lc4Var.getValue();
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    qs2 qs2Var3;
                    Modifier.a aVar3;
                    Composer composer4;
                    String str3;
                    a aVar4;
                    a aVar5;
                    int i4;
                    Modifier.a aVar6;
                    if ((i3 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(1784466043, i3, -1, "com.nytimes.android.libs.messagingarchitecture.composable.CenterModal.<anonymous> (CenterModal.kt:49)");
                    }
                    String str4 = str2;
                    String str5 = str;
                    a aVar7 = aVar;
                    a aVar8 = aVar2;
                    qs2 qs2Var4 = qs2Var;
                    qs2 qs2Var5 = qs2Var2;
                    composer3.z(-483455358);
                    Modifier.a aVar9 = Modifier.a;
                    Arrangement arrangement = Arrangement.a;
                    Arrangement.m g = arrangement.g();
                    Alignment.a aVar10 = Alignment.a;
                    rg4 a = d.a(g, aVar10.k(), composer3, 0);
                    composer3.z(-1323940314);
                    int a2 = cs0.a(composer3, 0);
                    et0 o = composer3.o();
                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                    qs2 a3 = companion.a();
                    it2 c = LayoutKt.c(aVar9);
                    if (composer3.j() == null) {
                        cs0.c();
                    }
                    composer3.G();
                    if (composer3.f()) {
                        composer3.D(a3);
                    } else {
                        composer3.p();
                    }
                    Composer a4 = Updater.a(composer3);
                    Updater.c(a4, a, companion.e());
                    Updater.c(a4, o, companion.g());
                    gt2 b = companion.b();
                    if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                        a4.q(Integer.valueOf(a2));
                        a4.v(Integer.valueOf(a2), b);
                    }
                    c.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                    composer3.z(2058660585);
                    ap0 ap0Var = ap0.a;
                    boolean z = str4 != null && h.P(str4, "xpn", false, 2, null);
                    Integer a5 = js0.a(str4, composer3, 0);
                    if (z) {
                        composer3.z(-1740292756);
                        Modifier h2 = SizeKt.h(aVar9, 0.0f, 1, null);
                        composer3.z(733328855);
                        rg4 g2 = BoxKt.g(aVar10.o(), false, composer3, 0);
                        composer3.z(-1323940314);
                        int a6 = cs0.a(composer3, 0);
                        et0 o2 = composer3.o();
                        qs2 a7 = companion.a();
                        it2 c2 = LayoutKt.c(h2);
                        if (composer3.j() == null) {
                            cs0.c();
                        }
                        composer3.G();
                        if (composer3.f()) {
                            composer3.D(a7);
                        } else {
                            composer3.p();
                        }
                        Composer a8 = Updater.a(composer3);
                        Updater.c(a8, g2, companion.e());
                        Updater.c(a8, o2, companion.g());
                        gt2 b2 = companion.b();
                        if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                            a8.q(Integer.valueOf(a6));
                            a8.v(Integer.valueOf(a6), b2);
                        }
                        c2.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                        composer3.z(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                        ImageKt.b(wt7.a(Integer.valueOf(se6.xpn_onboarding_lightbox), null, null, null, 0, composer3, 0, 30), "XPN promotional image", PaddingKt.m(AspectRatioKt.b(aVar9, 1.0f, false, 2, null), 0.0f, 0.0f, 0.0f, bu1.g(12), 7, null), null, ContentScale.a.a(), 0.0f, null, composer3, 25008, 104);
                        qs2Var3 = qs2Var4;
                        ButtonKt.c(bu1.g(16), bu1.g(24), eb5.Companion.b(composer3, 8).g(), qs2Var5, boxScopeInstance.c(aVar9, aVar10.n()), 0, 0, composer3, 54, 96);
                        composer3.R();
                        composer3.t();
                        composer3.R();
                        composer3.R();
                        composer3.R();
                        i4 = 8;
                        aVar3 = aVar9;
                        composer4 = composer3;
                        str3 = str5;
                        aVar4 = aVar7;
                        aVar5 = aVar8;
                    } else {
                        qs2Var3 = qs2Var4;
                        composer3.z(-1740291904);
                        if (a5 != null) {
                            composer3.z(-1740291858);
                            Modifier h3 = SizeKt.h(aVar9, 0.0f, 1, null);
                            composer3.z(733328855);
                            rg4 g3 = BoxKt.g(aVar10.o(), false, composer3, 0);
                            composer3.z(-1323940314);
                            int a9 = cs0.a(composer3, 0);
                            et0 o3 = composer3.o();
                            qs2 a10 = companion.a();
                            it2 c3 = LayoutKt.c(h3);
                            if (composer3.j() == null) {
                                cs0.c();
                            }
                            composer3.G();
                            if (composer3.f()) {
                                composer3.D(a10);
                            } else {
                                composer3.p();
                            }
                            Composer a11 = Updater.a(composer3);
                            Updater.c(a11, g3, companion.e());
                            Updater.c(a11, o3, companion.g());
                            gt2 b3 = companion.b();
                            if (a11.f() || !zq3.c(a11.A(), Integer.valueOf(a9))) {
                                a11.q(Integer.valueOf(a9));
                                a11.v(Integer.valueOf(a9), b3);
                            }
                            c3.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                            composer3.z(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                            lc4 r = RememberLottieCompositionKt.r(c.a.a(c.a.b(a5.intValue())), null, null, null, null, null, composer3, 0, 62);
                            LottieComposition b4 = b(r);
                            aVar5 = aVar8;
                            aVar4 = aVar7;
                            str3 = str5;
                            LottieAnimationKt.c(b(r), SizeKt.h(AspectRatioKt.b(aVar9, (b4 != null ? b4.b() : null) != null ? r7.width() / r7.height() : 1.7777778f, false, 2, null), 0.0f, 1, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer3, 1572872, 0, 0, 2097084);
                            composer4 = composer3;
                            i4 = 8;
                            aVar3 = aVar9;
                            ButtonKt.c(bu1.g(16), bu1.g(24), eb5.Companion.b(composer4, 8).g(), qs2Var5, boxScopeInstance2.c(aVar3, aVar10.n()), 0, 0, composer3, 54, 96);
                            composer3.R();
                            composer3.t();
                            composer3.R();
                            composer3.R();
                            SpacerKt.a(PaddingKt.m(aVar3, 0.0f, bu1.g(20), 0.0f, 0.0f, 13, null), composer4, 6);
                            composer3.R();
                        } else {
                            aVar3 = aVar9;
                            composer4 = composer3;
                            str3 = str5;
                            aVar4 = aVar7;
                            aVar5 = aVar8;
                            i4 = 8;
                            composer4.z(-1740290538);
                            composer4.z(693286680);
                            rg4 a12 = m.a(arrangement.f(), aVar10.l(), composer4, 0);
                            composer4.z(-1323940314);
                            int a13 = cs0.a(composer4, 0);
                            et0 o4 = composer3.o();
                            qs2 a14 = companion.a();
                            it2 c4 = LayoutKt.c(aVar3);
                            if (composer3.j() == null) {
                                cs0.c();
                            }
                            composer3.G();
                            if (composer3.f()) {
                                composer4.D(a14);
                            } else {
                                composer3.p();
                            }
                            Composer a15 = Updater.a(composer3);
                            Updater.c(a15, a12, companion.e());
                            Updater.c(a15, o4, companion.g());
                            gt2 b5 = companion.b();
                            if (a15.f() || !zq3.c(a15.A(), Integer.valueOf(a13))) {
                                a15.q(Integer.valueOf(a13));
                                a15.v(Integer.valueOf(a13), b5);
                            }
                            c4.invoke(ju7.a(ju7.b(composer3)), composer4, 0);
                            composer4.z(2058660585);
                            SpacerKt.a(m37.b(n37.a, aVar3, 1.0f, false, 2, null), composer4, 0);
                            float f = 24;
                            ButtonKt.c(bu1.g(16), bu1.g(0), eb5.Companion.b(composer4, 8).g(), qs2Var5, PaddingKt.m(aVar3, 0.0f, bu1.g(f), bu1.g(f), 0.0f, 9, null), 0, 0, composer3, 54, 96);
                            composer3.R();
                            composer3.t();
                            composer3.R();
                            composer3.R();
                            composer3.R();
                        }
                        composer3.R();
                    }
                    composer4.z(-1740290034);
                    if (str3 != null) {
                        aVar6 = aVar3;
                        TextKt.c(str3, PaddingKt.j(aVar3, bu1.g(32), bu1.g(4)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(composer4, i4).m1(), composer3, 48, 0, 65532);
                    } else {
                        aVar6 = aVar3;
                    }
                    composer3.R();
                    float f2 = 32;
                    Modifier.a aVar11 = aVar6;
                    float f3 = 16;
                    TextKt.d(aVar4, PaddingKt.m(PaddingKt.k(aVar11, bu1.g(f2), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bu1.g(f3), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 48, 0, 262140);
                    final a aVar12 = aVar5;
                    if (aVar12 != null) {
                        composer3.z(-1740289516);
                        float g4 = bu1.g(1);
                        eb5.a aVar13 = eb5.Companion;
                        androidx.compose.material.ButtonKt.c(qs2Var3, SizeKt.h(PaddingKt.m(PaddingKt.k(aVar11, bu1.g(f2), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bu1.g(f3), 7, null), 0.0f, 1, null), false, null, null, null, fb0.a(g4, aVar13.a(composer3, 8).l()), androidx.compose.material.a.a.a(aVar13.a(composer3, 8).a(), 0L, 0L, 0L, composer3, androidx.compose.material.a.l << 12, 14), null, zr0.b(composer3, 2105817206, true, new it2() { // from class: com.nytimes.android.libs.messagingarchitecture.composable.CenterModalKt$CenterModal$1$1$4
                            {
                                super(3);
                            }

                            @Override // defpackage.it2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return ww8.a;
                            }

                            public final void invoke(m37 m37Var, Composer composer5, int i5) {
                                zq3.h(m37Var, "$this$OutlinedButton");
                                if ((i5 & 81) == 16 && composer5.i()) {
                                    composer5.K();
                                    return;
                                }
                                if (b.G()) {
                                    b.S(2105817206, i5, -1, "com.nytimes.android.libs.messagingarchitecture.composable.CenterModal.<anonymous>.<anonymous>.<anonymous> (CenterModal.kt:144)");
                                }
                                TextKt.d(a.this, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, eb5.Companion.c(composer5, 8).k1(), composer5, 0, 0, 131070);
                                if (b.G()) {
                                    b.R();
                                }
                            }
                        }), composer3, 805306416, 316);
                        composer3.R();
                    } else {
                        composer3.z(-1740288796);
                        SpacerKt.a(PaddingKt.m(aVar11, 0.0f, 0.0f, 0.0f, bu1.g(f2), 7, null), composer3, 6);
                        composer3.R();
                    }
                    composer3.R();
                    composer3.t();
                    composer3.R();
                    composer3.R();
                    if (b.G()) {
                        b.R();
                    }
                }
            }), composer2, 1769472, 29);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.composable.CenterModalKt$CenterModal$2
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
                    CenterModalKt.a(str, aVar, aVar2, str2, qs2Var, qs2Var2, composer3, gt6.a(i | 1));
                }
            });
        }
    }
}
