package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.ComposeUiNode;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dg4;
import defpackage.et0;
import defpackage.eu8;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.iv0;
import defpackage.ju7;
import defpackage.nn0;
import defpackage.o76;
import defpackage.pb;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.uh9;
import defpackage.uo6;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.x08;
import defpackage.xx1;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class BottomNavigationKt {
    private static final eu8 a = new eu8(ContentFeedType.OTHER, 0, xx1.c(), 2, null);
    private static final float b = bu1.g(56);
    private static final float c;
    private static final float d;
    private static final androidx.compose.foundation.layout.o e;

    static final class a implements rg4 {
        final /* synthetic */ gt2 a;
        final /* synthetic */ float b;

        a(gt2 gt2Var, float f) {
            this.a = gt2Var;
            this.b = f;
        }

        @Override // defpackage.rg4
        public final sg4 d(androidx.compose.ui.layout.f fVar, List list, long j) {
            androidx.compose.ui.layout.l lVar;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                qg4 qg4Var = (qg4) list.get(i);
                if (zq3.c(androidx.compose.ui.layout.b.a(qg4Var), "icon")) {
                    androidx.compose.ui.layout.l W = qg4Var.W(j);
                    if (this.a != null) {
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            qg4 qg4Var2 = (qg4) list.get(i2);
                            if (zq3.c(androidx.compose.ui.layout.b.a(qg4Var2), "label")) {
                                lVar = qg4Var2.W(fv0.e(j, 0, 0, 0, 0, 11, null));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    lVar = null;
                    if (this.a == null) {
                        return BottomNavigationKt.m(fVar, W, j);
                    }
                    zq3.e(lVar);
                    return BottomNavigationKt.n(fVar, lVar, W, j, this.b);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    static {
        float f = 12;
        c = bu1.g(f);
        d = bu1.g(f);
        float f2 = 0;
        e = uh9.b(bu1.g(f2), bu1.g(f2), bu1.g(f2), bu1.g(f2));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r22, long r23, long r25, float r27, final defpackage.it2 r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.a(androidx.compose.ui.Modifier, long, long, float, it2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final androidx.compose.foundation.layout.o r25, androidx.compose.ui.Modifier r26, long r27, long r29, float r31, final defpackage.it2 r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.b(androidx.compose.foundation.layout.o, androidx.compose.ui.Modifier, long, long, float, it2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.m37 r27, final boolean r28, final defpackage.qs2 r29, final defpackage.gt2 r30, androidx.compose.ui.Modifier r31, boolean r32, defpackage.gt2 r33, boolean r34, defpackage.dy4 r35, long r36, long r38, androidx.compose.runtime.Composer r40, final int r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.c(m37, boolean, qs2, gt2, androidx.compose.ui.Modifier, boolean, gt2, boolean, dy4, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final gt2 gt2Var, final gt2 gt2Var2, final float f, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-1162995092);
        if ((i & 14) == 0) {
            i2 = (h.C(gt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(gt2Var2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.b(f) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1162995092, i2, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:319)");
            }
            h.z(188155536);
            boolean C = h.C(gt2Var2) | h.b(f);
            Object A = h.A();
            if (C || A == Composer.a.a()) {
                A = new a(gt2Var2, f);
                h.q(A);
            }
            rg4 rg4Var = (rg4) A;
            h.R();
            h.z(-1323940314);
            Modifier.a aVar = Modifier.a;
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c2 = LayoutKt.c(aVar);
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
            Updater.c(a4, rg4Var, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b2 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b2);
            }
            c2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            Modifier b3 = androidx.compose.ui.layout.b.b(aVar, "icon");
            h.z(733328855);
            Alignment.a aVar2 = Alignment.a;
            rg4 g = BoxKt.g(aVar2.o(), false, h, 0);
            h.z(-1323940314);
            int a5 = cs0.a(h, 0);
            et0 o2 = h.o();
            qs2 a6 = companion.a();
            it2 c3 = LayoutKt.c(b3);
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
            Updater.c(a7, g, companion.e());
            Updater.c(a7, o2, companion.g());
            gt2 b4 = companion.b();
            if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                a7.q(Integer.valueOf(a5));
                a7.v(Integer.valueOf(a5), b4);
            }
            c3.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            gt2Var.invoke(h, Integer.valueOf(i2 & 14));
            h.R();
            h.t();
            h.R();
            h.R();
            h.z(-1198309649);
            if (gt2Var2 != null) {
                Modifier k = PaddingKt.k(pb.a(androidx.compose.ui.layout.b.b(aVar, "label"), f), c, 0.0f, 2, null);
                h.z(733328855);
                rg4 g2 = BoxKt.g(aVar2.o(), false, h, 0);
                h.z(-1323940314);
                int a8 = cs0.a(h, 0);
                et0 o3 = h.o();
                qs2 a9 = companion.a();
                it2 c4 = LayoutKt.c(k);
                if (h.j() == null) {
                    cs0.c();
                }
                h.G();
                if (h.f()) {
                    h.D(a9);
                } else {
                    h.p();
                }
                Composer a10 = Updater.a(h);
                Updater.c(a10, g2, companion.e());
                Updater.c(a10, o3, companion.g());
                gt2 b5 = companion.b();
                if (a10.f() || !zq3.c(a10.A(), Integer.valueOf(a8))) {
                    a10.q(Integer.valueOf(a8));
                    a10.v(Integer.valueOf(a8), b5);
                }
                c4.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                gt2Var2.invoke(h, Integer.valueOf((i2 >> 3) & 14));
                h.R();
                h.t();
                h.R();
                h.R();
            }
            h.R();
            h.R();
            h.t();
            h.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$3
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
                    BottomNavigationKt.d(gt2.this, gt2Var2, f, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final long j, final long j2, final boolean z, final it2 it2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(-985175058);
        if ((i & 14) == 0) {
            i2 = (h.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.e(j2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.a(z) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.C(it2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i2 & 5851) == 1170 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-985175058, i2, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:287)");
            }
            composer2 = h;
            final x08 d2 = AnimateAsStateKt.d(z ? 1.0f : 0.0f, a, 0.0f, null, null, h, 48, 28);
            long h2 = wn0.h(j2, j, f(d2));
            CompositionLocalKt.b(new o76[]{ContentColorKt.a().c(nn0.j(nn0.r(h2, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.a().c(Float.valueOf(nn0.u(h2)))}, zr0.b(composer2, -138092754, true, new gt2() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationTransition$1
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
                    float f;
                    if ((i3 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(-138092754, i3, -1, "androidx.compose.material.BottomNavigationTransition.<anonymous> (BottomNavigation.kt:299)");
                    }
                    it2 it2Var2 = it2.this;
                    f = BottomNavigationKt.f(d2);
                    it2Var2.invoke(Float.valueOf(f), composer3, 0);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), composer2, 56);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationTransition$2
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
                    BottomNavigationKt.e(j, j2, z, it2Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sg4 m(androidx.compose.ui.layout.f fVar, final androidx.compose.ui.layout.l lVar, long j) {
        int f = iv0.f(j, fVar.l0(b));
        final int v0 = (f - lVar.v0()) / 2;
        return androidx.compose.ui.layout.f.J(fVar, lVar.F0(), f, null, new ss2() { // from class: androidx.compose.material.BottomNavigationKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.a.j(aVar, androidx.compose.ui.layout.l.this, 0, v0, 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sg4 n(androidx.compose.ui.layout.f fVar, final androidx.compose.ui.layout.l lVar, final androidx.compose.ui.layout.l lVar2, long j, final float f) {
        int l0 = fVar.l0(d) - lVar.c0(AlignmentLineKt.a());
        int v0 = lVar2.v0() + lVar.v0() + l0;
        int f2 = iv0.f(j, Math.max(v0, fVar.l0(b)));
        final int d2 = uo6.d((f2 - v0) / 2, 0);
        int v02 = (f2 - lVar2.v0()) / 2;
        final int v03 = lVar2.v0() + d2 + l0;
        int max = Math.max(lVar.F0(), lVar2.F0());
        final int F0 = (max - lVar.F0()) / 2;
        final int F02 = (max - lVar2.F0()) / 2;
        final int d3 = dg4.d((v02 - d2) * (1 - f));
        return androidx.compose.ui.layout.f.J(fVar, max, f2, null, new ss2() { // from class: androidx.compose.material.BottomNavigationKt$placeLabelAndIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                if (f != 0.0f) {
                    l.a.j(aVar, lVar, F0, v03 + d3, 0.0f, 4, null);
                }
                l.a.j(aVar, lVar2, F02, d2 + d3, 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }
}
