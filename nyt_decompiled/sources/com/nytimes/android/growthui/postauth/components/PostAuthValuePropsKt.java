package com.nytimes.android.growthui.postauth.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.comscore.streaming.ContentType;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.c74;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.do5;
import defpackage.ek8;
import defpackage.fm1;
import defpackage.gn2;
import defpackage.gt2;
import defpackage.he3;
import defpackage.it2;
import defpackage.jo7;
import defpackage.ju7;
import defpackage.jy7;
import defpackage.l74;
import defpackage.le3;
import defpackage.li8;
import defpackage.m60;
import defpackage.n37;
import defpackage.oh3;
import defpackage.ph8;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.w39;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class PostAuthValuePropsKt {
    public static final void a(Modifier modifier, final w39 w39Var, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        int i4;
        int i5;
        Composer composer2;
        zq3.h(w39Var, "valueProp");
        Composer h = composer.h(-1362294598);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (h.S(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((2 & i2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(w39Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
            modifier3 = modifier2;
            composer2 = h;
        } else {
            modifier3 = i6 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(-1362294598, i3, -1, "com.nytimes.android.growthui.postauth.components.PostAuthValueProp (PostAuthValueProps.kt:41)");
            }
            h.z(693286680);
            rg4 a = m.a(Arrangement.a.f(), Alignment.a.l(), h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(modifier3);
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
            h.z(-678309503);
            n37 n37Var = n37.a;
            he3 b2 = w39Var.b();
            h.z(-2039327379);
            if (b2 == null) {
                i4 = 0;
                i5 = 1;
            } else {
                Painter d = do5.d(b2.b(), h, 0);
                String a4 = b2.a();
                long a5 = le3.a(b2, c74.a.a(h, 6).b());
                i4 = 0;
                i5 = 1;
                IconKt.b(d, a4, PaddingKt.m(Modifier.a, 0.0f, 0.0f, bu1.g(8), 0.0f, 11, null), a5, h, 392, 0);
            }
            h.R();
            a.C0064a c0064a = new a.C0064a(i4, i5, null);
            if (!h.d0(w39Var.c())) {
                c0064a.n(new jy7(0L, 0L, o.b.a(), (l) null, (androidx.compose.ui.text.font.m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, 16379, (DefaultConstructorMarker) null));
                c0064a.i(w39Var.c());
                c0064a.j();
                c0064a.i(" ");
            }
            c0064a.n(new jy7(0L, 0L, o.b.f(), (l) null, (androidx.compose.ui.text.font.m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, 16379, (DefaultConstructorMarker) null));
            c0064a.i(w39Var.a());
            composer2 = h;
            TextKt.b(c0064a.o(), null, c74.a.a(composer2, 6).b(), ek8.g(14), null, null, gn2.b(), 0L, null, null, ek8.g(21), 0, false, 0, null, null, null, composer2, 1575936, 6, 129970);
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
            k.a(new gt2() { // from class: com.nytimes.android.growthui.postauth.components.PostAuthValuePropsKt$PostAuthValueProp$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i7) {
                    PostAuthValuePropsKt.a(Modifier.this, w39Var, composer3, i | 1, i2);
                }
            });
        }
    }

    public static final void b(final oh3 oh3Var, Composer composer, final int i) {
        int i2;
        zq3.h(oh3Var, "valueProps");
        Composer h = composer.h(2127600406);
        if ((i & 14) == 0) {
            i2 = (h.S(oh3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(2127600406, i2, -1, "com.nytimes.android.growthui.postauth.components.PostAuthValueProps (PostAuthValueProps.kt:28)");
            }
            h.z(-483455358);
            Modifier.a aVar = Modifier.a;
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(aVar);
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
            h.z(-1275352008);
            Iterator<E> it2 = oh3Var.iterator();
            while (it2.hasNext()) {
                a(null, (w39) it2.next(), h, 0, 1);
                SpacerKt.a(SizeKt.i(Modifier.a, bu1.g(14)), h, 6);
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
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.growthui.postauth.components.PostAuthValuePropsKt$PostAuthValueProps$2
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
                    PostAuthValuePropsKt.b(oh3.this, composer2, i | 1);
                }
            });
        }
    }
}
