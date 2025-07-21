package com.nytimes.android.growthui.common.components;

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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
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
import defpackage.he3;
import defpackage.it2;
import defpackage.ju7;
import defpackage.le3;
import defpackage.n37;
import defpackage.oh3;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.w39;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Iterator;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class ValuePropsKt {
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v21 */
    public static final void a(Modifier modifier, final w39 w39Var, final long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        ?? r4;
        Composer composer2;
        Composer composer3;
        zq3.h(w39Var, "valueProp");
        Composer h = composer.h(1186503158);
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
            i3 |= h.S(w39Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.e(j) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i5 = i3;
        if ((i5 & 731) == 146 && h.i()) {
            h.K();
            modifier3 = modifier2;
            composer3 = h;
        } else {
            modifier3 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(1186503158, i5, -1, "com.nytimes.android.growthui.common.components.ValueProp (ValueProps.kt:46)");
            }
            h.z(693286680);
            Arrangement arrangement = Arrangement.a;
            Arrangement.e f = arrangement.f();
            Alignment.a aVar = Alignment.a;
            rg4 a = m.a(f, aVar.l(), h, 0);
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
            h.z(375417382);
            if (b2 == null) {
                r4 = 0;
            } else {
                r4 = 0;
                IconKt.b(do5.d(b2.b(), h, 0), b2.a(), PaddingKt.m(Modifier.a, 0.0f, (b2.b() == R.drawable.ic_main && h.d0(w39Var.c())) ? bu1.g((float) 0.5d) : bu1.g(6), bu1.g(8), 0.0f, 9, null), le3.a(b2, j), h, 8, 0);
                ww8 ww8Var = ww8.a;
            }
            h.R();
            Modifier.a aVar2 = Modifier.a;
            Modifier y = SizeKt.y(aVar2, null, r4, 3, null);
            h.z(-483455358);
            rg4 a4 = d.a(arrangement.g(), aVar.k(), h, r4);
            h.z(-1323940314);
            fm1 fm1Var2 = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection2 = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var2 = (r99) h.m(CompositionLocalsKt.p());
            qs2 a5 = companion.a();
            it2 b3 = LayoutKt.b(y);
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
            b3.invoke(ju7.a(ju7.b(h)), h, Integer.valueOf((int) r4));
            h.z(2058660585);
            h.z(-1163856341);
            ap0 ap0Var = ap0.a;
            h.z(-770098936);
            if (h.d0(w39Var.c())) {
                composer2 = h;
            } else {
                String c = w39Var.c();
                c74 c74Var = c74.a;
                composer2 = h;
                TextKt.e(c, PaddingKt.k(aVar2, 0.0f, bu1.g(4), 1, null), c74Var.a(h, 6).b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c74Var.b(h, 6).v(), composer2, 48, 0, 32760);
            }
            composer2.R();
            composer3 = composer2;
            TextKt.e(w39Var.a(), null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c74.a.b(composer2, 6).u(), composer3, i5 & 896, 0, 32762);
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
        cc7 k = composer3.k();
        if (k != null) {
            final Modifier modifier4 = modifier3;
            k.a(new gt2() { // from class: com.nytimes.android.growthui.common.components.ValuePropsKt$ValueProp$2
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
                    ValuePropsKt.a(Modifier.this, w39Var, j, composer4, i | 1, i2);
                }
            });
        }
    }

    public static final void b(Modifier modifier, final oh3 oh3Var, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        Modifier modifier3;
        final Modifier modifier4;
        final long j3;
        int i4;
        zq3.h(oh3Var, "valueProps");
        Composer h = composer.h(2086477905);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            i3 |= h.S(oh3Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (h.e(j2)) {
                    i4 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    i3 |= i4;
                }
            } else {
                j2 = j;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            j2 = j;
        }
        if ((i3 & 731) == 146 && h.i()) {
            h.K();
            modifier4 = modifier2;
            j3 = j2;
        } else {
            h.E();
            if ((i & 1) == 0 || h.N()) {
                Modifier modifier5 = i5 != 0 ? Modifier.a : modifier2;
                if ((i2 & 4) != 0) {
                    j2 = c74.a.a(h, 6).c();
                    i3 &= -897;
                }
                modifier3 = modifier5;
            } else {
                h.K();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier3 = modifier2;
            }
            int i6 = i3;
            long j4 = j2;
            h.u();
            if (b.G()) {
                b.S(2086477905, i6, -1, "com.nytimes.android.growthui.common.components.ValueProps (ValueProps.kt:29)");
            }
            Modifier k = PaddingKt.k(modifier3, bu1.g(12), 0.0f, 2, null);
            h.z(-483455358);
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(k);
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
            h.z(567052168);
            Iterator<E> it2 = oh3Var.iterator();
            while (it2.hasNext()) {
                a(null, (w39) it2.next(), j4, h, i6 & 896, 1);
                SpacerKt.a(SizeKt.i(Modifier.a, bu1.g(14)), h, 6);
                i6 = i6;
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
            modifier4 = modifier3;
            j3 = j4;
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.growthui.common.components.ValuePropsKt$ValueProps$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    ValuePropsKt.b(Modifier.this, oh3Var, j3, composer2, i | 1, i2);
                }
            });
        }
    }
}
