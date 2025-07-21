package com.nytimes.android.unfear.reader.composable;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import com.nytimes.android.unfear.core.composable.UnfearLayoutsKt;
import defpackage.ap0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.ga3;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k59;
import defpackage.m34;
import defpackage.n37;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.rm5;
import defpackage.ts1;
import defpackage.ww8;
import defpackage.x14;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class ContainerLayoutsKt {
    public static final void a(final ga3 ga3Var, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(ga3Var, "container");
        Composer h = composer.h(980054949);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(ga3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = 2 & i2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(modifier) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
            cc7 k = h.k();
            if (k != null) {
                k.a(new gt2(ga3Var, modifier, i, i2) { // from class: com.nytimes.android.unfear.reader.composable.ContainerLayoutsKt$HorizontalStackContainerLayout$2
                    final /* synthetic */ int $$changed;
                    final /* synthetic */ int $$default;
                    final /* synthetic */ ga3 $container;
                    final /* synthetic */ Modifier $modifier;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                        this.$modifier = modifier;
                        this.$$changed = i;
                        this.$$default = i2;
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        ContainerLayoutsKt.a(null, this.$modifier, composer2, gt6.a(this.$$changed | 1), this.$$default);
                    }
                });
                return;
            }
            return;
        }
        if (i4 != 0) {
            modifier = Modifier.a;
        }
        Modifier modifier2 = modifier;
        if (b.G()) {
            b.S(980054949, i3, -1, "com.nytimes.android.unfear.reader.composable.HorizontalStackContainerLayout (ContainerLayouts.kt:32)");
        }
        Modifier b = ScrollKt.b(modifier2, ScrollKt.c(0, h, 0, 1), false, null, false, 14, null);
        h.z(693286680);
        rg4 a = m.a(Arrangement.a.f(), Alignment.a.l(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(b);
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
        gt2 b2 = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b2);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        n37 n37Var = n37.a;
        h.z(558996276);
        throw null;
    }

    public static final void b(x14 x14Var, Modifier modifier, Composer composer, int i, int i2) {
        zq3.h(x14Var, "container");
        composer.h(-1789332388);
        if ((i2 & 2) != 0) {
            Modifier.a aVar = Modifier.a;
        }
        if (b.G()) {
            b.S(-1789332388, i, -1, "com.nytimes.android.unfear.reader.composable.LedeContainerLayout (ContainerLayouts.kt:82)");
        }
        throw null;
    }

    public static final void c(final k59 k59Var, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(k59Var, "container");
        Composer h = composer.h(-961060315);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(k59Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(modifier) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(-961060315, i3, -1, "com.nytimes.android.unfear.reader.composable.VerticalStackContainerLayout (ContainerLayouts.kt:60)");
            }
            Modifier b = androidx.compose.animation.b.b(modifier, null, null, 3, null);
            h.z(-483455358);
            int i5 = 0;
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(b);
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
            gt2 b2 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b2);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            h.z(487648084);
            for (Object obj : k59Var.c()) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    i.v();
                }
                final rm5 rm5Var = (rm5) obj;
                h.z(-1753078493);
                if (i5 > 0 && !k59Var.b().b().c()) {
                    com.nytimes.android.unfear.nytdesignsystem.composable.DividerLayoutsKt.a(k59Var.b().b(), null, h, ts1.c, 2);
                }
                h.R();
                m34.a(rm5Var, i5, zr0.b(h, -1334193870, true, new gt2() { // from class: com.nytimes.android.unfear.reader.composable.ContainerLayoutsKt$VerticalStackContainerLayout$1$1$1
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 11) == 2 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1334193870, i7, -1, "com.nytimes.android.unfear.reader.composable.VerticalStackContainerLayout.<anonymous>.<anonymous>.<anonymous> (ContainerLayouts.kt:71)");
                        }
                        UnfearLayoutsKt.a(rm5.this, null, null, composer2, rm5.a, 6);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), h, rm5.a | 384);
                i5 = i6;
            }
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
            k.a(new gt2() { // from class: com.nytimes.android.unfear.reader.composable.ContainerLayoutsKt$VerticalStackContainerLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    ContainerLayoutsKt.c(k59.this, modifier, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
