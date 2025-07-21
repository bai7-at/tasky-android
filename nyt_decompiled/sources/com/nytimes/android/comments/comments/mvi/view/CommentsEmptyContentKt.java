package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import com.nytimes.android.comments.R;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.gb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class CommentsEmptyContentKt {
    public static final void CommentsEmptyContent(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer h = composer.h(-333349201);
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
        if ((i3 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(-333349201, i3, -1, "com.nytimes.android.comments.comments.mvi.view.CommentsEmptyContent (CommentsEmptyContent.kt:27)");
            }
            eb5.a aVar = eb5.Companion;
            Modifier f = SizeKt.f(BackgroundKt.d(modifier3, aVar.a(h, 8).a(), null, 2, null), 0.0f, 1, null);
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
            Modifier c2 = BoxScopeInstance.a.c(SizeKt.h(modifier3, 0.0f, 1, null), aVar2.e());
            Alignment.b g2 = aVar2.g();
            h.z(-483455358);
            rg4 a4 = d.a(Arrangement.a.g(), g2, h, 48);
            h.z(-1323940314);
            int a5 = cs0.a(h, 0);
            et0 o2 = h.o();
            qs2 a6 = companion.a();
            it2 c3 = LayoutKt.c(c2);
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
            Updater.c(a7, o2, companion.g());
            gt2 b2 = companion.b();
            if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                a7.q(Integer.valueOf(a5));
                a7.v(Integer.valueOf(a5), b2);
            }
            c3.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            String b3 = k48.b(R.string.comments_empty_title, h, 0);
            long g3 = ek8.g(18);
            long g4 = ek8.g(21);
            e e = gb5.e();
            o.a aVar3 = o.b;
            Modifier modifier4 = modifier3;
            TextKt.c(b3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(aVar.a(h, 8).l(), g3, aVar3.e(), null, null, e, null, 0L, null, null, null, 0L, null, null, null, 0, 0, g4, null, null, null, 0, 0, null, 16646104, null), h, 0, 0, 65534);
            DividerKt.a(PaddingKt.j(Modifier.a, bu1.g(32), bu1.g(16)), aVar.a(h, 8).W(), bu1.g(2), 0.0f, h, 390, 8);
            String b4 = k48.b(R.string.comments_empty_message, h, 0);
            j jVar = new j(aVar.a(h, 8).r(), ek8.g(15), aVar3.e(), null, null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, ek8.g(18), null, null, null, 0, 0, null, 16646104, null);
            composer2 = h;
            TextKt.c(b4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar, composer2, 0, 0, 65534);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
            modifier2 = modifier4;
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsEmptyContentKt$CommentsEmptyContent$2
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
                    CommentsEmptyContentKt.CommentsEmptyContent(Modifier.this, composer3, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void CommentsEmptyContentPreview(Composer composer, final int i) {
        Composer h = composer.h(1906680274);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1906680274, i, -1, "com.nytimes.android.comments.comments.mvi.view.CommentsEmptyContentPreview (CommentsEmptyContent.kt:72)");
            }
            NytThemeKt.a(false, null, null, ComposableSingletons$CommentsEmptyContentKt.INSTANCE.m250getLambda1$comments_release(), h, 3072, 7);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsEmptyContentKt$CommentsEmptyContentPreview$1
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
                    CommentsEmptyContentKt.CommentsEmptyContentPreview(composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
