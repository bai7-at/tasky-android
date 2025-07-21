package com.nytimes.android.features.you.youtab.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.a;
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
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class EmptyContentKt {
    public static final void a(final String str, final a aVar, final Map map, Modifier modifier, Composer composer, final int i, final int i2) {
        zq3.h(str, "title");
        zq3.h(aVar, "content");
        zq3.h(map, "inlineContentForIcon");
        Composer h = composer.h(685621675);
        Modifier modifier2 = (i2 & 8) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(685621675, i, -1, "com.nytimes.android.features.you.youtab.composable.EmptyContent (EmptyContent.kt:19)");
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
        eb5.a aVar2 = eb5.Companion;
        final Modifier modifier3 = modifier2;
        TextKt.c(str, PaddingKt.m(Modifier.a, 0.0f, 0.0f, 0.0f, bu1.g(9), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(h, 8).t1(), h, (i & 14) | 48, 0, 65532);
        TextKt.d(aVar, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, map, null, aVar2.c(h, 8).s1(), h, (i >> 3) & 14, 262144, 98302);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.EmptyContentKt$EmptyContent$2
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
                    EmptyContentKt.a(str, aVar, map, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
