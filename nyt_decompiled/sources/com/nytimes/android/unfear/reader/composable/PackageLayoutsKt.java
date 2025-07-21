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
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ha3;
import defpackage.it2;
import defpackage.ju7;
import defpackage.l59;
import defpackage.m34;
import defpackage.n37;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ts1;
import defpackage.ww8;
import defpackage.z74;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class PackageLayoutsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.ea3 r20, androidx.compose.ui.Modifier r21, androidx.compose.foundation.lazy.LazyListState r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.unfear.reader.composable.PackageLayoutsKt.a(ea3, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final ha3 ha3Var, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(ha3Var, "pkg");
        Composer h = composer.h(39081482);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(ha3Var) ? 4 : 2) | i;
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
                k.a(new gt2(ha3Var, modifier, i, i2) { // from class: com.nytimes.android.unfear.reader.composable.PackageLayoutsKt$HorizontalStackPackageLayout$2
                    final /* synthetic */ int $$changed;
                    final /* synthetic */ int $$default;
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ ha3 $pkg;

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
                        PackageLayoutsKt.b(null, this.$modifier, composer2, gt6.a(this.$$changed | 1), this.$$default);
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
            b.S(39081482, i3, -1, "com.nytimes.android.unfear.reader.composable.HorizontalStackPackageLayout (PackageLayouts.kt:41)");
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
        h.z(741197717);
        throw null;
    }

    public static final void c(final l59 l59Var, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(l59Var, "pkg");
        Composer h = composer.h(-673901878);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(l59Var) ? 4 : 2) | i;
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
                b.S(-673901878, i3, -1, "com.nytimes.android.unfear.reader.composable.VerticalStackPackageLayout (PackageLayouts.kt:69)");
            }
            h.z(-483455358);
            int i5 = 0;
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(modifier);
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
            h.z(1536654079);
            for (Object obj : l59Var.b()) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    i.v();
                }
                final z74 z74Var = (z74) obj;
                h.z(309683278);
                if (i5 > 0 && !l59Var.c().b().c()) {
                    com.nytimes.android.unfear.nytdesignsystem.composable.DividerLayoutsKt.a(l59Var.c().b(), null, h, ts1.c, 2);
                }
                h.R();
                m34.a(z74Var, i5, zr0.b(h, 1534204923, true, new gt2() { // from class: com.nytimes.android.unfear.reader.composable.PackageLayoutsKt$VerticalStackPackageLayout$1$1$1
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
                            b.S(1534204923, i7, -1, "com.nytimes.android.unfear.reader.composable.VerticalStackPackageLayout.<anonymous>.<anonymous>.<anonymous> (PackageLayouts.kt:80)");
                        }
                        UnfearLayoutsKt.a(z74.this, null, null, composer2, z74.a, 6);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), h, z74.a | 384);
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
            k.a(new gt2() { // from class: com.nytimes.android.unfear.reader.composable.PackageLayoutsKt$VerticalStackPackageLayout$2
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
                    PackageLayoutsKt.c(l59.this, modifier, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
