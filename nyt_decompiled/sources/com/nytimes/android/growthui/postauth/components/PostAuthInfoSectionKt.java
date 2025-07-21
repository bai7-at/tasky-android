package com.nytimes.android.growthui.postauth.components;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.comscore.streaming.ContentType;
import com.nytimes.android.growthui.R;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.c74;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.do5;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.n06;
import defpackage.n37;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.wh;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public abstract class PostAuthInfoSectionKt {
    public static final void a(final n06 n06Var, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(n06Var, "postAuthInfoData");
        zq3.h(qs2Var, "onToggleClick");
        Composer h = composer.h(2107985192);
        if ((i & 14) == 0) {
            i2 = (h.S(n06Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(qs2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(2107985192, i2, -1, "com.nytimes.android.growthui.postauth.components.PostAuthInfoSection (PostAuthInfoSection.kt:33)");
            }
            h.z(-934330229);
            Object A = h.A();
            Composer.a aVar = Composer.a;
            if (A == aVar.a()) {
                A = b0.e(Boolean.FALSE, null, 2, null);
                h.q(A);
            }
            final sy4 sy4Var = (sy4) A;
            h.R();
            Modifier.a aVar2 = Modifier.a;
            c74 c74Var = c74.a;
            Modifier d = BackgroundKt.d(aVar2, c74Var.a(h, 6).a(), null, 2, null);
            h.z(-483455358);
            Arrangement arrangement = Arrangement.a;
            Arrangement.m g = arrangement.g();
            Alignment.a aVar3 = Alignment.a;
            rg4 a = d.a(g, aVar3.k(), h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(d);
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
            Updater.c(a3, a, companion.e());
            Updater.c(a3, fm1Var, companion.c());
            Updater.c(a3, layoutDirection, companion.d());
            Updater.c(a3, r99Var, companion.h());
            h.c();
            b.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-1163856341);
            ap0 ap0Var = ap0.a;
            TextKt.e(n06Var.a(), null, c74Var.a(h, 6).b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c74Var.b(h, 6).n(), h, 0, 0, 32762);
            SpacerKt.a(SizeKt.i(aVar2, bu1.g(4)), h, 6);
            TextKt.e(n06Var.b(), null, c74Var.a(h, 6).b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c74Var.b(h, 6).o(), h, 0, 0, 32762);
            Modifier m = PaddingKt.m(SizeKt.h(aVar2, 0.0f, 1, null), 0.0f, bu1.g(16), 0.0f, 0.0f, 13, null);
            boolean b2 = b(sy4Var);
            h.z(-735853512);
            boolean S = h.S(sy4Var) | h.S(qs2Var);
            Object A2 = h.A();
            if (S || A2 == aVar.a()) {
                A2 = new ss2() { // from class: com.nytimes.android.growthui.postauth.components.PostAuthInfoSectionKt$PostAuthInfoSection$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return ww8.a;
                    }

                    public final void invoke(boolean z) {
                        boolean b3;
                        sy4 sy4Var2 = sy4Var;
                        b3 = PostAuthInfoSectionKt.b(sy4Var2);
                        PostAuthInfoSectionKt.c(sy4Var2, !b3);
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A2);
            }
            h.R();
            Modifier c = ToggleableKt.c(m, b2, false, null, (ss2) A2, 6, null);
            h.z(-483455358);
            rg4 a4 = d.a(arrangement.g(), aVar3.k(), h, 0);
            h.z(-1323940314);
            fm1 fm1Var2 = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection2 = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var2 = (r99) h.m(CompositionLocalsKt.p());
            qs2 a5 = companion.a();
            it2 b3 = LayoutKt.b(c);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a5);
            } else {
                h.p();
            }
            h.H();
            Composer a6 = Updater.a(h);
            Updater.c(a6, a4, companion.e());
            Updater.c(a6, fm1Var2, companion.c());
            Updater.c(a6, layoutDirection2, companion.d());
            Updater.c(a6, r99Var2, companion.h());
            h.c();
            b3.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-1163856341);
            Modifier m2 = PaddingKt.m(SizeKt.h(aVar2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bu1.g(12), 7, null);
            Arrangement.f d2 = arrangement.d();
            h.z(693286680);
            rg4 a7 = m.a(d2, aVar3.l(), h, 6);
            h.z(-1323940314);
            fm1 fm1Var3 = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection3 = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var3 = (r99) h.m(CompositionLocalsKt.p());
            qs2 a8 = companion.a();
            it2 b4 = LayoutKt.b(m2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a8);
            } else {
                h.p();
            }
            h.H();
            Composer a9 = Updater.a(h);
            Updater.c(a9, a7, companion.e());
            Updater.c(a9, fm1Var3, companion.c());
            Updater.c(a9, layoutDirection3, companion.d());
            Updater.c(a9, r99Var3, companion.h());
            h.c();
            b4.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-678309503);
            n37 n37Var = n37.a;
            TextKt.e(n06Var.c(), null, c74Var.a(h, 6).c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c74Var.b(h, 6).p(), h, 0, 0, 32762);
            composer2 = h;
            IconKt.b(do5.d(b(sy4Var) ? R.drawable.ic_chevron_up : R.drawable.ic_chevron_down, composer2, 0), "", null, 0L, composer2, 56, 12);
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            AnimatedVisibilityKt.d(ap0Var, b(sy4Var), null, null, null, null, zr0.b(composer2, -1829800988, true, new it2() { // from class: com.nytimes.android.growthui.postauth.components.PostAuthInfoSectionKt$PostAuthInfoSection$1$2$2
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((wh) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(wh whVar, Composer composer3, int i3) {
                    zq3.h(whVar, "$this$AnimatedVisibility");
                    if (b.G()) {
                        b.S(-1829800988, i3, -1, "com.nytimes.android.growthui.postauth.components.PostAuthInfoSection.<anonymous>.<anonymous>.<anonymous> (PostAuthInfoSection.kt:79)");
                    }
                    PostAuthValuePropsKt.b(n06.this.d(), composer3, 0);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), composer2, 1572870, 30);
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            composer2.R();
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
            k.a(new gt2() { // from class: com.nytimes.android.growthui.postauth.components.PostAuthInfoSectionKt$PostAuthInfoSection$2
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
                    PostAuthInfoSectionKt.a(n06.this, qs2Var, composer3, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }
}
