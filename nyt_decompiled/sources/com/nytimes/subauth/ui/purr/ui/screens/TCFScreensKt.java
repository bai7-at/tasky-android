package com.nytimes.subauth.ui.purr.ui.screens;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.p;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentType;
import com.nytimes.android.composeui.text.LinkableTextKt;
import com.nytimes.subauth.ui.purr.tcf.TCFViewModel;
import com.nytimes.subauth.ui.purr.ui.compose.CenterTopAppBarKt;
import com.nytimes.subauth.ui.purr.webview.PurrUIWebViewActivity;
import defpackage.ag4;
import defpackage.ap;
import defpackage.ap0;
import defpackage.bi9;
import defpackage.bu1;
import defpackage.bv8;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.cz3;
import defpackage.dh8;
import defpackage.dj7;
import defpackage.fb0;
import defpackage.fm1;
import defpackage.fv1;
import defpackage.g54;
import defpackage.gt2;
import defpackage.hd5;
import defpackage.hn3;
import defpackage.it2;
import defpackage.jj7;
import defpackage.ju7;
import defpackage.k48;
import defpackage.lj7;
import defpackage.m36;
import defpackage.mm6;
import defpackage.n37;
import defpackage.oe3;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.uh8;
import defpackage.ve0;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yr0;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt7;
import java.util.List;
import kotlin.collections.i;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class TCFScreensKt {

    public static final class a implements o {
        private final /* synthetic */ o b;

        a(Composer composer) {
            this.b = p.c(o.a, composer, 8);
        }

        @Override // androidx.compose.foundation.layout.o
        public int a(fm1 fm1Var) {
            zq3.h(fm1Var, "density");
            return this.b.a(fm1Var);
        }

        @Override // androidx.compose.foundation.layout.o
        public int b(fm1 fm1Var, LayoutDirection layoutDirection) {
            zq3.h(fm1Var, "density");
            zq3.h(layoutDirection, "layoutDirection");
            return this.b.b(fm1Var, layoutDirection);
        }

        @Override // androidx.compose.foundation.layout.o
        public int c(fm1 fm1Var) {
            zq3.h(fm1Var, "density");
            return 0;
        }

        @Override // androidx.compose.foundation.layout.o
        public int d(fm1 fm1Var, LayoutDirection layoutDirection) {
            zq3.h(fm1Var, "density");
            zq3.h(layoutDirection, "layoutDirection");
            return this.b.d(fm1Var, layoutDirection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Modifier modifier, final boolean z, final bi9 bi9Var, final qs2 qs2Var, final qs2 qs2Var2, final qs2 qs2Var3, final ss2 ss2Var, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        Composer h = composer.h(-537442079);
        Modifier modifier3 = (i2 & 1) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-537442079, i, -1, "com.nytimes.subauth.ui.purr.ui.screens.BlockerCard (TCFScreens.kt:261)");
        }
        Alignment.a aVar = Alignment.a;
        Alignment b = aVar.b();
        Modifier f = SizeKt.f(modifier3, 0.0f, 1, null);
        h.z(733328855);
        rg4 g = BoxKt.g(b, false, h, 6);
        h.z(-1323940314);
        fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
        r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a2 = companion.a();
        it2 b2 = LayoutKt.b(f);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a2);
        } else {
            h.p();
        }
        h.H();
        Composer a3 = Updater.a(h);
        Updater.c(a3, g, companion.e());
        Updater.c(a3, fm1Var, companion.c());
        Updater.c(a3, layoutDirection, companion.d());
        Updater.c(a3, r99Var, companion.h());
        h.c();
        b2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        h.z(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        l(modifier3, h, i & 14);
        m36 m36Var = m36.a;
        final long i3 = m36Var.b(h, 6).i();
        final fm1 fm1Var2 = (fm1) h.m(CompositionLocalsKt.e());
        h.z(987242322);
        Object A = h.A();
        Composer.a aVar2 = Composer.a;
        if (A == aVar2.a()) {
            A = b0.e(bu1.d(bu1.g(0)), null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        Modifier h2 = SizeKt.h(modifier3, 0.0f, 1, null);
        h.z(987247444);
        boolean S = h.S(sy4Var) | h.S(fm1Var2);
        Object A2 = h.A();
        if (S || A2 == aVar2.a()) {
            A2 = new ss2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$BlockerCard$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(cz3 cz3Var) {
                    zq3.h(cz3Var, "coordinates");
                    TCFScreensKt.c(sy4Var, fm1.this.v(hn3.f(cz3Var.a())));
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((cz3) obj);
                    return ww8.a;
                }
            };
            h.q(A2);
        }
        h.R();
        Modifier d = BackgroundKt.d(h.a(h2, (ss2) A2), m36Var.b(h, 6).h(), null, 2, null);
        h.z(987254409);
        boolean e = h.e(i3);
        Object A3 = h.A();
        if (e || A3 == aVar2.a()) {
            A3 = new ss2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$BlockerCard$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((fv1) obj);
                    return ww8.a;
                }

                public final void invoke(fv1 fv1Var) {
                    zq3.h(fv1Var, "$this$drawBehind");
                    fv1.s0(fv1Var, i3, hd5.a(0.0f, 0.0f), hd5.a(zt7.i(fv1Var.b()), 0.0f), fv1Var.f1(bu1.g(1)), 0, null, 0.0f, null, 0, 496, null);
                }
            };
            h.q(A3);
        }
        h.R();
        Modifier b3 = androidx.compose.ui.draw.a.b(d, (ss2) A3);
        h.z(733328855);
        rg4 g2 = BoxKt.g(aVar.o(), false, h, 0);
        h.z(-1323940314);
        fm1 fm1Var3 = (fm1) h.m(CompositionLocalsKt.e());
        LayoutDirection layoutDirection2 = (LayoutDirection) h.m(CompositionLocalsKt.j());
        r99 r99Var2 = (r99) h.m(CompositionLocalsKt.p());
        qs2 a4 = companion.a();
        it2 b4 = LayoutKt.b(b3);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a4);
        } else {
            h.p();
        }
        h.H();
        Composer a5 = Updater.a(h);
        Updater.c(a5, g2, companion.e());
        Updater.c(a5, fm1Var3, companion.c());
        Updater.c(a5, layoutDirection2, companion.d());
        Updater.c(a5, r99Var2, companion.h());
        h.c();
        b4.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        h.z(-2137368960);
        Modifier.a aVar3 = Modifier.a;
        Modifier c = boxScopeInstance.c(aVar3, aVar.e());
        int i4 = i >> 3;
        g(c, bi9Var, qs2Var, qs2Var2, qs2Var3, ss2Var, h, (i4 & 896) | 64 | (i4 & 7168) | (57344 & i4) | (i4 & 458752), 0);
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        h.z(987278264);
        if (z) {
            modifier2 = modifier3;
            e(SizeKt.i(SizeKt.h(aVar3, 0.0f, 1, null), b(sy4Var)), 0L, h, 0, 2);
        } else {
            modifier2 = modifier3;
        }
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
            final Modifier modifier4 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$BlockerCard$2
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
                    TCFScreensKt.a(Modifier.this, z, bi9Var, qs2Var, qs2Var2, qs2Var3, ss2Var, composer2, i | 1, i2);
                }
            });
        }
    }

    private static final float b(sy4 sy4Var) {
        return ((bu1) sy4Var.getValue()).n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sy4 sy4Var, float f) {
        sy4Var.setValue(bu1.d(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Modifier modifier, final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composer2;
        Composer h = composer.h(-1769381776);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (h.S(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(qs2Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(qs2Var2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i3 & 731) == 146 && h.i()) {
            h.K();
            modifier3 = modifier2;
            composer2 = h;
        } else {
            final Modifier modifier4 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(-1769381776, i3, -1, "com.nytimes.subauth.ui.purr.ui.screens.LoseSavedChangesDialog (TCFScreens.kt:444)");
            }
            modifier3 = modifier4;
            composer2 = h;
            AndroidAlertDialog_androidKt.b(qs2Var2, zr0.b(h, -2136022344, true, new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$LoseSavedChangesDialog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        b.S(-2136022344, i5, -1, "com.nytimes.subauth.ui.purr.ui.screens.LoseSavedChangesDialog.<anonymous> (TCFScreens.kt:448)");
                    }
                    Arrangement.e c = Arrangement.a.c();
                    Modifier.a aVar = Modifier.a;
                    float f = 8;
                    Modifier m = PaddingKt.m(SizeKt.h(aVar, 0.0f, 1, null), bu1.g(f), 0.0f, bu1.g(f), bu1.g(10), 2, null);
                    Modifier modifier5 = Modifier.this;
                    final qs2 qs2Var3 = qs2Var;
                    final qs2 qs2Var4 = qs2Var2;
                    composer3.z(693286680);
                    Alignment.a aVar2 = Alignment.a;
                    rg4 a2 = m.a(c, aVar2.l(), composer3, 6);
                    composer3.z(-1323940314);
                    fm1 fm1Var = (fm1) composer3.m(CompositionLocalsKt.e());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.m(CompositionLocalsKt.j());
                    r99 r99Var = (r99) composer3.m(CompositionLocalsKt.p());
                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                    qs2 a3 = companion.a();
                    it2 b = LayoutKt.b(m);
                    if (composer3.j() == null) {
                        cs0.c();
                    }
                    composer3.G();
                    if (composer3.f()) {
                        composer3.D(a3);
                    } else {
                        composer3.p();
                    }
                    composer3.H();
                    Composer a4 = Updater.a(composer3);
                    Updater.c(a4, a2, companion.e());
                    Updater.c(a4, fm1Var, companion.c());
                    Updater.c(a4, layoutDirection, companion.d());
                    Updater.c(a4, r99Var, companion.h());
                    composer3.c();
                    b.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                    composer3.z(2058660585);
                    composer3.z(-678309503);
                    n37 n37Var = n37.a;
                    composer3.z(35411742);
                    boolean S = composer3.S(qs2Var3);
                    Object A = composer3.A();
                    if (S || A == Composer.a.a()) {
                        A = new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$LoseSavedChangesDialog$1$1$1$1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m800invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m800invoke() {
                                qs2.this.mo865invoke();
                            }
                        };
                        composer3.q(A);
                    }
                    composer3.R();
                    Modifier e = ClickableKt.e(modifier5, false, null, null, (qs2) A, 7, null);
                    composer3.z(733328855);
                    rg4 g = BoxKt.g(aVar2.o(), false, composer3, 0);
                    composer3.z(-1323940314);
                    fm1 fm1Var2 = (fm1) composer3.m(CompositionLocalsKt.e());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer3.m(CompositionLocalsKt.j());
                    r99 r99Var2 = (r99) composer3.m(CompositionLocalsKt.p());
                    qs2 a5 = companion.a();
                    it2 b2 = LayoutKt.b(e);
                    if (composer3.j() == null) {
                        cs0.c();
                    }
                    composer3.G();
                    if (composer3.f()) {
                        composer3.D(a5);
                    } else {
                        composer3.p();
                    }
                    composer3.H();
                    Composer a6 = Updater.a(composer3);
                    Updater.c(a6, g, companion.e());
                    Updater.c(a6, fm1Var2, companion.c());
                    Updater.c(a6, layoutDirection2, companion.d());
                    Updater.c(a6, r99Var2, companion.h());
                    composer3.c();
                    b2.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                    composer3.z(2058660585);
                    composer3.z(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                    final String b3 = k48.b(mm6.tcf_lose_saved_changes_ok_description, composer3, 0);
                    String b4 = k48.b(mm6.tcf_lose_saved_changes_ok, composer3, 0);
                    dh8.a aVar3 = dh8.b;
                    int a7 = aVar3.a();
                    float f2 = 32;
                    float f3 = 16;
                    Modifier l = PaddingKt.l(aVar, bu1.g(f2), bu1.g(f3), bu1.g(f2), bu1.g(f3));
                    composer3.z(-1765272696);
                    boolean S2 = composer3.S(b3);
                    Object A2 = composer3.A();
                    if (S2 || A2 == Composer.a.a()) {
                        A2 = new ss2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$LoseSavedChangesDialog$1$1$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(lj7 lj7Var) {
                                zq3.h(lj7Var, "$this$clearAndSetSemantics");
                                jj7.O(lj7Var, b3);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((lj7) obj);
                                return ww8.a;
                            }
                        };
                        composer3.q(A2);
                    }
                    composer3.R();
                    TextKt.e(b4, dj7.a(l, (ss2) A2), 0L, 0L, null, null, null, 0L, null, dh8.h(a7), 0L, 0, false, 0, null, null, composer3, 0, 0, 65020);
                    composer3.R();
                    composer3.R();
                    composer3.t();
                    composer3.R();
                    composer3.R();
                    SpacerKt.a(SizeKt.s(aVar, bu1.g(f)), composer3, 6);
                    composer3.z(35436157);
                    boolean S3 = composer3.S(qs2Var4);
                    Object A3 = composer3.A();
                    if (S3 || A3 == Composer.a.a()) {
                        A3 = new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$LoseSavedChangesDialog$1$1$3$1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m801invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m801invoke() {
                                qs2.this.mo865invoke();
                            }
                        };
                        composer3.q(A3);
                    }
                    composer3.R();
                    Modifier e2 = ClickableKt.e(modifier5, false, null, null, (qs2) A3, 7, null);
                    composer3.z(733328855);
                    rg4 g2 = BoxKt.g(aVar2.o(), false, composer3, 0);
                    composer3.z(-1323940314);
                    fm1 fm1Var3 = (fm1) composer3.m(CompositionLocalsKt.e());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.m(CompositionLocalsKt.j());
                    r99 r99Var3 = (r99) composer3.m(CompositionLocalsKt.p());
                    qs2 a8 = companion.a();
                    it2 b5 = LayoutKt.b(e2);
                    if (composer3.j() == null) {
                        cs0.c();
                    }
                    composer3.G();
                    if (composer3.f()) {
                        composer3.D(a8);
                    } else {
                        composer3.p();
                    }
                    composer3.H();
                    Composer a9 = Updater.a(composer3);
                    Updater.c(a9, g2, companion.e());
                    Updater.c(a9, fm1Var3, companion.c());
                    Updater.c(a9, layoutDirection3, companion.d());
                    Updater.c(a9, r99Var3, companion.h());
                    composer3.c();
                    b5.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                    composer3.z(2058660585);
                    composer3.z(-2137368960);
                    final String b6 = k48.b(mm6.tcf_lose_saved_changes_cancel_description, composer3, 0);
                    String b7 = k48.b(mm6.tcf_lose_saved_changes_cancel, composer3, 0);
                    int a10 = aVar3.a();
                    float f4 = 32;
                    float f5 = 16;
                    Modifier l2 = PaddingKt.l(aVar, bu1.g(f4), bu1.g(f5), bu1.g(f4), bu1.g(f5));
                    composer3.z(-1765247924);
                    boolean S4 = composer3.S(b6);
                    Object A4 = composer3.A();
                    if (S4 || A4 == Composer.a.a()) {
                        A4 = new ss2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$LoseSavedChangesDialog$1$1$4$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(lj7 lj7Var) {
                                zq3.h(lj7Var, "$this$clearAndSetSemantics");
                                jj7.O(lj7Var, b6);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((lj7) obj);
                                return ww8.a;
                            }
                        };
                        composer3.q(A4);
                    }
                    composer3.R();
                    TextKt.e(b7, dj7.a(l2, (ss2) A4), 0L, 0L, null, null, null, 0L, null, dh8.h(a10), 0L, 0, false, 0, null, null, composer3, 0, 0, 65020);
                    composer3.R();
                    composer3.R();
                    composer3.t();
                    composer3.R();
                    composer3.R();
                    composer3.R();
                    composer3.R();
                    composer3.t();
                    composer3.R();
                    composer3.R();
                    if (b.G()) {
                        b.R();
                    }
                }
            }), SizeKt.s(modifier4, bu1.g(ContentFeedType.OTHER)), null, ComposableSingletons$TCFScreensKt.a.d(), null, 0L, 0L, null, h, ((i3 >> 6) & 14) | 24624, 488);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            final Modifier modifier5 = modifier3;
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$LoseSavedChangesDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i5) {
                    TCFScreensKt.d(Modifier.this, qs2Var, qs2Var2, composer3, i | 1, i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Modifier modifier, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        Modifier modifier3;
        final Modifier modifier4;
        final long j3;
        int i4;
        Composer h = composer.h(720019261);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = i | (h.S(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                if (h.e(j2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                j2 = j;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            j2 = j;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
            modifier4 = modifier2;
            j3 = j2;
        } else {
            h.E();
            if ((i & 1) == 0 || h.N()) {
                Modifier f = i5 != 0 ? SizeKt.f(Modifier.a, 0.0f, 1, null) : modifier2;
                if ((i2 & 2) != 0) {
                    j2 = ag4.a.a(h, ag4.b).j();
                    i3 &= -113;
                }
                modifier3 = f;
            } else {
                h.K();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                modifier3 = modifier2;
            }
            long j4 = j2;
            h.u();
            if (b.G()) {
                b.S(720019261, i3, -1, "com.nytimes.subauth.ui.purr.ui.screens.ProgressBarBox (TCFScreens.kt:239)");
            }
            Modifier e = ClickableKt.e(SizeKt.f(modifier3, 0.0f, 1, null), false, null, null, new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$ProgressBarBox$1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m802invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m802invoke();
                    return ww8.a;
                }
            }, 7, null);
            h.z(733328855);
            Alignment.a aVar = Alignment.a;
            rg4 g = BoxKt.g(aVar.o(), false, h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(e);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a2);
            } else {
                h.p();
            }
            h.H();
            Composer a3 = Updater.a(h);
            Updater.c(a3, g, companion.e());
            Updater.c(a3, fm1Var, companion.c());
            Updater.c(a3, layoutDirection, companion.d());
            Updater.c(a3, r99Var, companion.h());
            h.c();
            b.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-2137368960);
            ProgressIndicatorKt.b(BoxScopeInstance.a.c(Modifier.a, aVar.e()), j4, 0.0f, h, i3 & ContentType.LONG_FORM_ON_DEMAND, 4);
            h.R();
            h.R();
            h.t();
            h.R();
            h.R();
            if (b.G()) {
                b.R();
            }
            modifier4 = modifier3;
            j3 = j4;
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$ProgressBarBox$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    TCFScreensKt.e(Modifier.this, j3, composer2, i | 1, i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(androidx.compose.ui.Modifier r16, final defpackage.u96 r17, defpackage.ss2 r18, com.nytimes.subauth.ui.purr.tcf.TCFViewModel r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt.f(androidx.compose.ui.Modifier, u96, ss2, com.nytimes.subauth.ui.purr.tcf.TCFViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void g(Modifier modifier, final bi9 bi9Var, final qs2 qs2Var, final qs2 qs2Var2, final qs2 qs2Var3, final ss2 ss2Var, Composer composer, final int i, final int i2) {
        j b;
        zq3.h(bi9Var, "windowWidthSizeClass");
        zq3.h(qs2Var, "onAcceptAllButtonClicked");
        zq3.h(qs2Var2, "onRejectAllButtonClicked");
        zq3.h(qs2Var3, "onManagePreferencesLinkClicked");
        zq3.h(ss2Var, "onLinkedTextClicked");
        Composer h = composer.h(-827078007);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-827078007, i, -1, "com.nytimes.subauth.ui.purr.ui.screens.TCFBlockerCardContent (TCFScreens.kt:339)");
        }
        Modifier h2 = PaddingKt.i(modifier2, bu1.g(20)).h(zq3.c(bi9Var, bi9.c) ? SizeKt.h(modifier2, 0.0f, 1, null) : SizeKt.s(modifier2, bu1.g(320)));
        h.z(-483455358);
        rg4 a2 = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
        r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 b2 = LayoutKt.b(h2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a3);
        } else {
            h.p();
        }
        h.H();
        Composer a4 = Updater.a(h);
        Updater.c(a4, a2, companion.e());
        Updater.c(a4, fm1Var, companion.c());
        Updater.c(a4, layoutDirection, companion.d());
        Updater.c(a4, r99Var, companion.h());
        h.c();
        b2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        h.z(-1163856341);
        ap0 ap0Var = ap0.a;
        String b3 = k48.b(mm6.tcf_blocker_card_title, h, 0);
        j h3 = bv8.h();
        m36 m36Var = m36.a;
        final Modifier modifier3 = modifier2;
        TextKt.e(b3, null, m36Var.b(h, 6).b().j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, h3, h, 0, 196608, 32762);
        Modifier.a aVar = Modifier.a;
        SpacerKt.a(SizeKt.i(aVar, bu1.g(8)), h, 6);
        final Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
        String b4 = k48.b(mm6.tcf_blocker_card_body_text, h, 0);
        List o = i.o(new g54(k48.b(mm6.cookie_policy, h, 0), "https://www.nytimes.com/cookie-policy?gdpr-purr=true", null, null, 12, null), new g54(k48.b(mm6.privacy_policy, h, 0), "https://help.nytimes.com/hc/en-us/articles/10940941449492-The-New-York-Times-Company-Privacy-Policy-", null, null, 12, null));
        b = r32.b((r42 & 1) != 0 ? r32.a.i() : m36Var.b(h, 6).j(), (r42 & 2) != 0 ? r32.a.m() : 0L, (r42 & 4) != 0 ? r32.a.p() : null, (r42 & 8) != 0 ? r32.a.n() : null, (r42 & 16) != 0 ? r32.a.o() : null, (r42 & 32) != 0 ? r32.a.k() : null, (r42 & 64) != 0 ? r32.a.l() : null, (r42 & 128) != 0 ? r32.a.q() : 0L, (r42 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r32.a.g() : null, (r42 & 512) != 0 ? r32.a.w() : null, (r42 & 1024) != 0 ? r32.a.r() : null, (r42 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r32.a.f() : 0L, (r42 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r32.a.u() : null, (r42 & 8192) != 0 ? r32.a.t() : null, (r42 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dh8.h(r32.b.h()) : null, (r42 & 32768) != 0 ? uh8.g(r32.b.i()) : null, (r42 & 65536) != 0 ? r32.b.e() : 0L, (r42 & 131072) != 0 ? bv8.g().b.j() : null);
        LinkableTextKt.a(b4, o, true, new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$TCFBlockerCardContent$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(String str, String str2) {
                zq3.h(str, "url");
                zq3.h(str2, "<anonymous parameter 1>");
                ss2.this.invoke(str);
                Context context2 = context;
                context2.startActivity(PurrUIWebViewActivity.e.a(context2, str));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((String) obj, (String) obj2);
                return ww8.a;
            }
        }, null, b, m36Var.b(h, 6).e(), h, (g54.e << 3) | 384, 16);
        SpacerKt.a(SizeKt.i(aVar, bu1.g(16)), h, 6);
        h.z(1450971443);
        boolean S = h.S(qs2Var);
        Object A = h.A();
        if (S || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$TCFBlockerCardContent$1$2$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m803invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m803invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        qs2 qs2Var4 = (qs2) A;
        h.R();
        Modifier h4 = SizeKt.h(aVar, 0.0f, 1, null);
        androidx.compose.material.a aVar2 = androidx.compose.material.a.a;
        long g = m36Var.b(h, 6).g();
        long f = m36Var.b(h, 6).f();
        int i3 = androidx.compose.material.a.l;
        ve0 a5 = aVar2.a(f, g, 0L, 0L, h, i3 << 12, 12);
        ComposableSingletons$TCFScreensKt composableSingletons$TCFScreensKt = ComposableSingletons$TCFScreensKt.a;
        ButtonKt.a(qs2Var4, h4, false, null, null, null, null, a5, null, composableSingletons$TCFScreensKt.a(), h, 805306416, 380);
        float f2 = 12;
        SpacerKt.a(SizeKt.i(aVar, bu1.g(f2)), h, 6);
        h.z(1450991347);
        boolean S2 = h.S(qs2Var2);
        Object A2 = h.A();
        if (S2 || A2 == Composer.a.a()) {
            A2 = new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$TCFBlockerCardContent$1$3$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m804invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m804invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A2);
        }
        h.R();
        ButtonKt.a((qs2) A2, SizeKt.h(aVar, 0.0f, 1, null), false, null, null, null, null, aVar2.a(m36Var.b(h, 6).f(), m36Var.b(h, 6).g(), 0L, 0L, h, i3 << 12, 12), null, composableSingletons$TCFScreensKt.b(), h, 805306416, 380);
        SpacerKt.a(SizeKt.i(aVar, bu1.g(f2)), h, 6);
        h.z(1451011513);
        boolean S3 = h.S(qs2Var3);
        Object A3 = h.A();
        if (S3 || A3 == Composer.a.a()) {
            A3 = new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$TCFBlockerCardContent$1$4$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m805invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m805invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A3);
        }
        h.R();
        ButtonKt.c((qs2) A3, SizeKt.h(aVar, 0.0f, 1, null), false, null, null, null, fb0.a(bu1.g(1), m36Var.b(h, 6).i()), aVar2.a(m36Var.b(h, 6).g(), m36Var.b(h, 6).f(), 0L, 0L, h, i3 << 12, 12), null, composableSingletons$TCFScreensKt.c(), h, 805306416, 316);
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
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$TCFBlockerCardContent$2
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
                    TCFScreensKt.g(Modifier.this, bi9Var, qs2Var, qs2Var2, qs2Var3, ss2Var, composer2, i | 1, i2);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r5 != 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(androidx.compose.ui.Modifier r10, defpackage.qs2 r11, com.nytimes.subauth.ui.purr.tcf.TCFViewModel r12, androidx.compose.runtime.Composer r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt.h(androidx.compose.ui.Modifier, qs2, com.nytimes.subauth.ui.purr.tcf.TCFViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(androidx.compose.ui.Modifier r37, defpackage.bi9 r38, defpackage.u96 r39, defpackage.ss2 r40, defpackage.qs2 r41, com.nytimes.subauth.ui.purr.tcf.TCFViewModel r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt.i(androidx.compose.ui.Modifier, bi9, u96, ss2, qs2, com.nytimes.subauth.ui.purr.tcf.TCFViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TCFViewModel.Companion.a j(x08 x08Var) {
        return (TCFViewModel.Companion.a) x08Var.getValue();
    }

    public static final void k(Modifier modifier, final qs2 qs2Var, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(-374852191);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (h.S(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(qs2Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(-374852191, i3, -1, "com.nytimes.subauth.ui.purr.ui.screens.TopBar (TCFScreens.kt:503)");
            }
            final String b = k48.b(mm6.back_description, h, 0);
            gt2 e = ComposableSingletons$TCFScreensKt.a.e();
            yr0 b2 = zr0.b(h, 1204281628, true, new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$TopBar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        b.S(1204281628, i5, -1, "com.nytimes.subauth.ui.purr.ui.screens.TopBar.<anonymous> (TCFScreens.kt:515)");
                    }
                    qs2 qs2Var2 = qs2.this;
                    final String str = b;
                    IconButtonKt.a(qs2Var2, null, false, null, zr0.b(composer3, 467287992, true, new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$TopBar$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                b.S(467287992, i6, -1, "com.nytimes.subauth.ui.purr.ui.screens.TopBar.<anonymous>.<anonymous> (TCFScreens.kt:518)");
                            }
                            IconKt.a(ap.a(oe3.a.a), str, null, 0L, composer4, 0, 12);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), composer3, 24576, 14);
                    if (b.G()) {
                        b.R();
                    }
                }
            });
            m36 m36Var = m36.a;
            composer2 = h;
            CenterTopAppBarKt.b(e, modifier3, b2, null, m36Var.b(h, 6).h(), m36Var.b(h, 6).j(), 0.0f, h, ((i3 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 390, 72);
            if (b.G()) {
                b.R();
            }
            modifier2 = modifier3;
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$TopBar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i5) {
                    TCFScreensKt.k(Modifier.this, qs2Var, composer3, i | 1, i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-2020960370);
        if ((i & 14) == 0) {
            i2 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-2020960370, i2, -1, "com.nytimes.subauth.ui.purr.ui.screens.UnClickableContentBox (TCFScreens.kt:317)");
            }
            Modifier e = ClickableKt.e(SizeKt.f(modifier, 0.0f, 1, null), false, null, null, new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$UnClickableContentBox$1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m815invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m815invoke();
                    return ww8.a;
                }
            }, 6, null);
            h.z(733328855);
            rg4 g = BoxKt.g(Alignment.a.o(), false, h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(e);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a2);
            } else {
                h.p();
            }
            h.H();
            Composer a3 = Updater.a(h);
            Updater.c(a3, g, companion.e());
            Updater.c(a3, fm1Var, companion.c());
            Updater.c(a3, layoutDirection, companion.d());
            Updater.c(a3, r99Var, companion.h());
            h.c();
            b.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
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
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt$UnClickableContentBox$3
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
                    TCFScreensKt.l(Modifier.this, composer2, i | 1);
                }
            });
        }
    }
}
