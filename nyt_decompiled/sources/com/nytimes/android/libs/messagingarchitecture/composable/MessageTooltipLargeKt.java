package com.nytimes.android.libs.messagingarchitecture.composable;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.composable.ButtonKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d37;
import defpackage.dk8;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.eu1;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.kt2;
import defpackage.nn0;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class MessageTooltipLargeKt {
    public static final void a(final a aVar, final String str, final com.airbnb.lottie.compose.a aVar2, final qs2 qs2Var, final long j, final kt2 kt2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(aVar, "text");
        zq3.h(qs2Var, "onClickClose");
        Composer h = composer.h(-918633235);
        if ((i & 14) == 0) {
            i2 = (h.S(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(aVar2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.C(qs2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= h.e(j) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= h.C(kt2Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((374491 & i3) == 74898 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-918633235, i3, -1, "com.nytimes.android.libs.messagingarchitecture.composable.MessageTooltipLarge (MessageTooltipLarge.kt:36)");
            }
            Modifier.a aVar3 = Modifier.a;
            composer2 = h;
            Modifier e = ClickableKt.e(aVar3, false, null, null, qs2Var, 7, null);
            eb5.a aVar4 = eb5.Companion;
            BoxKt.a(SizeKt.f(BackgroundKt.d(e, nn0.r(aVar4.a(composer2, 8).Q(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), 0.0f, 1, null), composer2, 0);
            float g = bu1.g(12);
            Modifier k = PaddingKt.k(aVar3, g, 0.0f, 2, null);
            composer2.z(2016319431);
            boolean z = (i3 & 57344) == 16384;
            Object A = composer2.A();
            if (z || A == Composer.a.a()) {
                A = new rg4() { // from class: com.nytimes.android.libs.messagingarchitecture.composable.MessageTooltipLargeKt$MessageTooltipLarge$1$1
                    @Override // defpackage.rg4
                    public final sg4 d(final f fVar, List list, long j2) {
                        Object obj;
                        zq3.h(fVar, "$this$Layout");
                        zq3.h(list, "measurables");
                        List list2 = list;
                        final ArrayList arrayList = new ArrayList(i.w(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((qg4) it2.next()).W(j2));
                        }
                        Iterator it3 = arrayList.iterator();
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            if (it3.hasNext()) {
                                int v0 = ((l) next).v0();
                                do {
                                    Object next2 = it3.next();
                                    int v02 = ((l) next2).v0();
                                    if (v0 < v02) {
                                        next = next2;
                                        v0 = v02;
                                    }
                                } while (it3.hasNext());
                            }
                            obj = next;
                        } else {
                            obj = null;
                        }
                        l lVar = (l) obj;
                        final int v03 = lVar != null ? lVar.v0() : 0;
                        int n = fv0.n(j2);
                        int m = fv0.m(j2);
                        final long j3 = j;
                        return f.J(fVar, n, m, null, new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.composable.MessageTooltipLargeKt$MessageTooltipLarge$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(l.a aVar5) {
                                zq3.h(aVar5, "$this$layout");
                                List<l> list3 = arrayList;
                                f fVar2 = fVar;
                                long j4 = j3;
                                int i4 = v03;
                                Iterator<T> it4 = list3.iterator();
                                while (it4.hasNext()) {
                                    l.a.j(aVar5, (l) it4.next(), 0, fVar2.l0(eu1.h(j4)) - i4, 0.0f, 4, null);
                                }
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                b((l.a) obj2);
                                return ww8.a;
                            }
                        }, 4, null);
                    }
                };
                composer2.q(A);
            }
            rg4 rg4Var = (rg4) A;
            composer2.R();
            composer2.z(-1323940314);
            int a = cs0.a(composer2, 0);
            et0 o = composer2.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 c = LayoutKt.c(k);
            if (composer2.j() == null) {
                cs0.c();
            }
            composer2.G();
            if (composer2.f()) {
                composer2.D(a2);
            } else {
                composer2.p();
            }
            Composer a3 = Updater.a(composer2);
            Updater.c(a3, rg4Var, companion.e());
            Updater.c(a3, o, companion.g());
            gt2 b = companion.b();
            if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
                a3.q(Integer.valueOf(a));
                a3.v(Integer.valueOf(a), b);
            }
            c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
            composer2.z(2058660585);
            composer2.z(-483455358);
            rg4 a4 = d.a(Arrangement.a.g(), Alignment.a.k(), composer2, 0);
            composer2.z(-1323940314);
            int a5 = cs0.a(composer2, 0);
            et0 o2 = composer2.o();
            qs2 a6 = companion.a();
            it2 c2 = LayoutKt.c(aVar3);
            if (composer2.j() == null) {
                cs0.c();
            }
            composer2.G();
            if (composer2.f()) {
                composer2.D(a6);
            } else {
                composer2.p();
            }
            Composer a7 = Updater.a(composer2);
            Updater.c(a7, a4, companion.e());
            Updater.c(a7, o2, companion.g());
            gt2 b2 = companion.b();
            if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                a7.q(Integer.valueOf(a5));
                a7.v(Integer.valueOf(a5), b2);
            }
            c2.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
            composer2.z(2058660585);
            ap0 ap0Var = ap0.a;
            SurfaceKt.a(null, d37.c(bu1.g(4)), aVar4.a(composer2, 8).a(), 0L, null, 0.0f, zr0.b(composer2, -483714218, true, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.composable.MessageTooltipLargeKt$MessageTooltipLarge$2$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i4) {
                    float f;
                    Modifier.a aVar5;
                    BoxScopeInstance boxScopeInstance;
                    qs2 qs2Var2;
                    if ((i4 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-483714218, i4, -1, "com.nytimes.android.libs.messagingarchitecture.composable.MessageTooltipLarge.<anonymous>.<anonymous>.<anonymous> (MessageTooltipLarge.kt:61)");
                    }
                    Modifier.a aVar6 = Modifier.a;
                    Modifier h2 = SizeKt.h(aVar6, 0.0f, 1, null);
                    com.airbnb.lottie.compose.a aVar7 = com.airbnb.lottie.compose.a.this;
                    qs2 qs2Var3 = qs2Var;
                    String str2 = str;
                    a aVar8 = aVar;
                    composer3.z(733328855);
                    Alignment.a aVar9 = Alignment.a;
                    rg4 g2 = BoxKt.g(aVar9.o(), false, composer3, 0);
                    composer3.z(-1323940314);
                    int a8 = cs0.a(composer3, 0);
                    et0 o3 = composer3.o();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                    qs2 a9 = companion2.a();
                    it2 c3 = LayoutKt.c(h2);
                    if (composer3.j() == null) {
                        cs0.c();
                    }
                    composer3.G();
                    if (composer3.f()) {
                        composer3.D(a9);
                    } else {
                        composer3.p();
                    }
                    Composer a10 = Updater.a(composer3);
                    Updater.c(a10, g2, companion2.e());
                    Updater.c(a10, o3, companion2.g());
                    gt2 b3 = companion2.b();
                    if (a10.f() || !zq3.c(a10.A(), Integer.valueOf(a8))) {
                        a10.q(Integer.valueOf(a8));
                        a10.v(Integer.valueOf(a8), b3);
                    }
                    c3.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                    composer3.z(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                    composer3.z(-672813452);
                    if (aVar7 != null) {
                        LottieComposablesKt.a(aVar7, qs2Var3, 0.0f, composer3, 0, 4);
                    }
                    composer3.R();
                    float f2 = 32;
                    Modifier c4 = boxScopeInstance2.c(PaddingKt.m(aVar6, bu1.g(f2), bu1.g(f2), bu1.g(48), 0.0f, 8, null), aVar9.o());
                    composer3.z(-483455358);
                    rg4 a11 = d.a(Arrangement.a.g(), aVar9.k(), composer3, 0);
                    composer3.z(-1323940314);
                    int a12 = cs0.a(composer3, 0);
                    et0 o4 = composer3.o();
                    qs2 a13 = companion2.a();
                    it2 c5 = LayoutKt.c(c4);
                    if (composer3.j() == null) {
                        cs0.c();
                    }
                    composer3.G();
                    if (composer3.f()) {
                        composer3.D(a13);
                    } else {
                        composer3.p();
                    }
                    Composer a14 = Updater.a(composer3);
                    Updater.c(a14, a11, companion2.e());
                    Updater.c(a14, o4, companion2.g());
                    gt2 b4 = companion2.b();
                    if (a14.f() || !zq3.c(a14.A(), Integer.valueOf(a12))) {
                        a14.q(Integer.valueOf(a12));
                        a14.v(Integer.valueOf(a12), b4);
                    }
                    c5.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                    composer3.z(2058660585);
                    ap0 ap0Var2 = ap0.a;
                    composer3.z(-592376217);
                    if (str2 != null) {
                        aVar5 = aVar6;
                        boxScopeInstance = boxScopeInstance2;
                        qs2Var2 = qs2Var3;
                        f = f2;
                        TextKt.c(str2, PaddingKt.m(aVar6, 0.0f, 0.0f, 0.0f, bu1.g(4), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(composer3, 8).m1(), composer3, 48, 0, 65532);
                    } else {
                        f = f2;
                        aVar5 = aVar6;
                        boxScopeInstance = boxScopeInstance2;
                        qs2Var2 = qs2Var3;
                    }
                    composer3.R();
                    eb5.a aVar10 = eb5.Companion;
                    j q0 = aVar10.c(composer3, 8).q0();
                    long p = aVar10.c(composer3, 8).q0().p();
                    ek8.b(p);
                    float f3 = 16;
                    TextKt.d(aVar8, PaddingKt.m(aVar5, 0.0f, 0.0f, bu1.g(f3), bu1.g(f), 3, null), 0L, 0L, null, null, null, 0L, null, null, ek8.j(dk8.f(p), (float) (dk8.h(p) * 1.3d)), 0, false, 0, 0, null, null, q0, composer3, 48, 0, 130044);
                    composer3.R();
                    composer3.t();
                    composer3.R();
                    composer3.R();
                    BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
                    ButtonKt.c(bu1.g(f3), bu1.g(0), aVar10.a(composer3, 8).r(), qs2Var2, boxScopeInstance3.c(PaddingKt.m(aVar5, bu1.g(f), bu1.g(f), bu1.g(f), 0.0f, 8, null), aVar9.n()), 0, 0, composer3, 54, 96);
                    composer3.R();
                    composer3.t();
                    composer3.R();
                    composer3.R();
                    if (b.G()) {
                        b.R();
                    }
                }
            }), composer2, 1572864, 57);
            composer2.z(-1569773856);
            if (kt2Var != null) {
                SurfaceKt.a(PaddingKt.m(aVar3, bu1.g(eu1.g(j) - g), 0.0f, 0.0f, 0.0f, 14, null), null, aVar4.a(composer2, 8).a(), 0L, null, 0.0f, zr0.b(composer2, 298473969, true, new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.composable.MessageTooltipLargeKt$MessageTooltipLarge$2$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i4) {
                        if ((i4 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(298473969, i4, -1, "com.nytimes.android.libs.messagingarchitecture.composable.MessageTooltipLarge.<anonymous>.<anonymous>.<anonymous> (MessageTooltipLarge.kt:117)");
                        }
                        kt2.this.invoke(Modifier.a, qs2Var, composer3, 6);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 1572864, 58);
            }
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k2 = composer2.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.composable.MessageTooltipLargeKt$MessageTooltipLarge$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i4) {
                    MessageTooltipLargeKt.a(a.this, str, aVar2, qs2Var, j, kt2Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }
}
