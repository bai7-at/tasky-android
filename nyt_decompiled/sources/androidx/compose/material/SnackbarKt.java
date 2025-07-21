package androidx.compose.material;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class SnackbarKt {
    private static final float c;
    private static final float f;
    private static final float a = bu1.g(30);
    private static final float b = bu1.g(16);
    private static final float d = bu1.g(2);
    private static final float e = bu1.g(6);
    private static final float g = bu1.g(12);
    private static final float h = bu1.g(48);
    private static final float i = bu1.g(68);

    static {
        float f2 = 8;
        c = bu1.g(f2);
        f = bu1.g(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final gt2 gt2Var, final gt2 gt2Var2, Composer composer, final int i2) {
        int i3;
        Composer h2 = composer.h(-1229075900);
        if ((i2 & 14) == 0) {
            i3 = (h2.C(gt2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h2.C(gt2Var2) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h2.i()) {
            h2.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1229075900, i3, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:274)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier h3 = SizeKt.h(aVar, 0.0f, 1, null);
            float f2 = b;
            float f3 = c;
            Modifier m = PaddingKt.m(h3, f2, 0.0f, f3, d, 2, null);
            h2.z(-483455358);
            Arrangement.m g2 = Arrangement.a.g();
            Alignment.a aVar2 = Alignment.a;
            rg4 a2 = androidx.compose.foundation.layout.d.a(g2, aVar2.k(), h2, 0);
            h2.z(-1323940314);
            int a3 = cs0.a(h2, 0);
            et0 o = h2.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a4 = companion.a();
            it2 c2 = LayoutKt.c(m);
            if (h2.j() == null) {
                cs0.c();
            }
            h2.G();
            if (h2.f()) {
                h2.D(a4);
            } else {
                h2.p();
            }
            Composer a5 = Updater.a(h2);
            Updater.c(a5, a2, companion.e());
            Updater.c(a5, o, companion.g());
            gt2 b2 = companion.b();
            if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                a5.q(Integer.valueOf(a3));
                a5.v(Integer.valueOf(a3), b2);
            }
            c2.invoke(ju7.a(ju7.b(h2)), h2, 0);
            h2.z(2058660585);
            ap0 ap0Var = ap0.a;
            Modifier m2 = PaddingKt.m(AlignmentLineKt.g(aVar, a, g), 0.0f, 0.0f, f3, 0.0f, 11, null);
            h2.z(733328855);
            rg4 g3 = BoxKt.g(aVar2.o(), false, h2, 0);
            h2.z(-1323940314);
            int a6 = cs0.a(h2, 0);
            et0 o2 = h2.o();
            qs2 a7 = companion.a();
            it2 c3 = LayoutKt.c(m2);
            if (h2.j() == null) {
                cs0.c();
            }
            h2.G();
            if (h2.f()) {
                h2.D(a7);
            } else {
                h2.p();
            }
            Composer a8 = Updater.a(h2);
            Updater.c(a8, g3, companion.e());
            Updater.c(a8, o2, companion.g());
            gt2 b3 = companion.b();
            if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                a8.q(Integer.valueOf(a6));
                a8.v(Integer.valueOf(a6), b3);
            }
            c3.invoke(ju7.a(ju7.b(h2)), h2, 0);
            h2.z(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            gt2Var.invoke(h2, Integer.valueOf(i3 & 14));
            h2.R();
            h2.t();
            h2.R();
            h2.R();
            Modifier c4 = ap0Var.c(aVar, aVar2.j());
            h2.z(733328855);
            rg4 g4 = BoxKt.g(aVar2.o(), false, h2, 0);
            h2.z(-1323940314);
            int a9 = cs0.a(h2, 0);
            et0 o3 = h2.o();
            qs2 a10 = companion.a();
            it2 c5 = LayoutKt.c(c4);
            if (h2.j() == null) {
                cs0.c();
            }
            h2.G();
            if (h2.f()) {
                h2.D(a10);
            } else {
                h2.p();
            }
            Composer a11 = Updater.a(h2);
            Updater.c(a11, g4, companion.e());
            Updater.c(a11, o3, companion.g());
            gt2 b4 = companion.b();
            if (a11.f() || !zq3.c(a11.A(), Integer.valueOf(a9))) {
                a11.q(Integer.valueOf(a9));
                a11.v(Integer.valueOf(a9), b4);
            }
            c5.invoke(ju7.a(ju7.b(h2)), h2, 0);
            h2.z(2058660585);
            gt2Var2.invoke(h2, Integer.valueOf((i3 >> 3) & 14));
            h2.R();
            h2.t();
            h2.R();
            h2.R();
            h2.R();
            h2.t();
            h2.R();
            h2.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h2.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.SnackbarKt$NewLineButtonSnackbar$2
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
                    SnackbarKt.a(gt2.this, gt2Var2, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final gt2 gt2Var, final gt2 gt2Var2, Composer composer, final int i2) {
        int i3;
        Composer h2 = composer.h(-534813202);
        if ((i2 & 14) == 0) {
            i3 = (h2.C(gt2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h2.C(gt2Var2) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h2.i()) {
            h2.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-534813202, i3, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:295)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier m = PaddingKt.m(aVar, b, 0.0f, c, 0.0f, 10, null);
            h2.z(-749985289);
            final String str = "action";
            final String str2 = "text";
            boolean S = h2.S("action") | h2.S("text");
            Object A = h2.A();
            if (S || A == Composer.a.a()) {
                A = new rg4() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1
                    @Override // defpackage.rg4
                    public final sg4 d(androidx.compose.ui.layout.f fVar, List list, long j) {
                        float f2;
                        float f3;
                        float f4;
                        final int i4;
                        final int v0;
                        int i5;
                        float f5;
                        String str3 = str;
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            qg4 qg4Var = (qg4) list.get(i6);
                            if (zq3.c(androidx.compose.ui.layout.b.a(qg4Var), str3)) {
                                final androidx.compose.ui.layout.l W = qg4Var.W(j);
                                int n = fv0.n(j) - W.F0();
                                f2 = SnackbarKt.f;
                                int d2 = uo6.d(n - fVar.l0(f2), fv0.p(j));
                                String str4 = str2;
                                int size2 = list.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    qg4 qg4Var2 = (qg4) list.get(i7);
                                    if (zq3.c(androidx.compose.ui.layout.b.a(qg4Var2), str4)) {
                                        final androidx.compose.ui.layout.l W2 = qg4Var2.W(fv0.e(j, 0, d2, 0, 0, 9, null));
                                        int c0 = W2.c0(androidx.compose.ui.layout.AlignmentLineKt.a());
                                        if (c0 == Integer.MIN_VALUE) {
                                            throw new IllegalArgumentException("No baselines for text");
                                        }
                                        int c02 = W2.c0(androidx.compose.ui.layout.AlignmentLineKt.b());
                                        if (c02 == Integer.MIN_VALUE) {
                                            throw new IllegalArgumentException("No baselines for text");
                                        }
                                        boolean z = c0 == c02;
                                        final int n2 = fv0.n(j) - W.F0();
                                        if (z) {
                                            f5 = SnackbarKt.h;
                                            i5 = Math.max(fVar.l0(f5), W.v0());
                                            int v02 = (i5 - W2.v0()) / 2;
                                            int c03 = W.c0(androidx.compose.ui.layout.AlignmentLineKt.a());
                                            v0 = c03 != Integer.MIN_VALUE ? (c0 + v02) - c03 : 0;
                                            i4 = v02;
                                        } else {
                                            f3 = SnackbarKt.a;
                                            int l0 = fVar.l0(f3) - c0;
                                            f4 = SnackbarKt.i;
                                            int max = Math.max(fVar.l0(f4), W2.v0() + l0);
                                            i4 = l0;
                                            v0 = (max - W.v0()) / 2;
                                            i5 = max;
                                        }
                                        return androidx.compose.ui.layout.f.J(fVar, fv0.n(j), i5, null, new ss2() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            public final void b(l.a aVar2) {
                                                l.a.j(aVar2, androidx.compose.ui.layout.l.this, 0, i4, 0.0f, 4, null);
                                                l.a.j(aVar2, W, n2, v0, 0.0f, 4, null);
                                            }

                                            @Override // defpackage.ss2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                b((l.a) obj);
                                                return ww8.a;
                                            }
                                        }, 4, null);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                h2.q(A);
            }
            rg4 rg4Var = (rg4) A;
            h2.R();
            h2.z(-1323940314);
            int a2 = cs0.a(h2, 0);
            et0 o = h2.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c2 = LayoutKt.c(m);
            if (h2.j() == null) {
                cs0.c();
            }
            h2.G();
            if (h2.f()) {
                h2.D(a3);
            } else {
                h2.p();
            }
            Composer a4 = Updater.a(h2);
            Updater.c(a4, rg4Var, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b2 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b2);
            }
            c2.invoke(ju7.a(ju7.b(h2)), h2, 0);
            h2.z(2058660585);
            Modifier k = PaddingKt.k(androidx.compose.ui.layout.b.b(aVar, "text"), 0.0f, e, 1, null);
            h2.z(733328855);
            Alignment.a aVar2 = Alignment.a;
            rg4 g2 = BoxKt.g(aVar2.o(), false, h2, 0);
            h2.z(-1323940314);
            int a5 = cs0.a(h2, 0);
            et0 o2 = h2.o();
            qs2 a6 = companion.a();
            it2 c3 = LayoutKt.c(k);
            if (h2.j() == null) {
                cs0.c();
            }
            h2.G();
            if (h2.f()) {
                h2.D(a6);
            } else {
                h2.p();
            }
            Composer a7 = Updater.a(h2);
            Updater.c(a7, g2, companion.e());
            Updater.c(a7, o2, companion.g());
            gt2 b3 = companion.b();
            if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                a7.q(Integer.valueOf(a5));
                a7.v(Integer.valueOf(a5), b3);
            }
            c3.invoke(ju7.a(ju7.b(h2)), h2, 0);
            h2.z(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            gt2Var.invoke(h2, Integer.valueOf(i3 & 14));
            h2.R();
            h2.t();
            h2.R();
            h2.R();
            Modifier b4 = androidx.compose.ui.layout.b.b(aVar, "action");
            h2.z(733328855);
            rg4 g3 = BoxKt.g(aVar2.o(), false, h2, 0);
            h2.z(-1323940314);
            int a8 = cs0.a(h2, 0);
            et0 o3 = h2.o();
            qs2 a9 = companion.a();
            it2 c4 = LayoutKt.c(b4);
            if (h2.j() == null) {
                cs0.c();
            }
            h2.G();
            if (h2.f()) {
                h2.D(a9);
            } else {
                h2.p();
            }
            Composer a10 = Updater.a(h2);
            Updater.c(a10, g3, companion.e());
            Updater.c(a10, o3, companion.g());
            gt2 b5 = companion.b();
            if (a10.f() || !zq3.c(a10.A(), Integer.valueOf(a8))) {
                a10.q(Integer.valueOf(a8));
                a10.v(Integer.valueOf(a8), b5);
            }
            c4.invoke(ju7.a(ju7.b(h2)), h2, 0);
            h2.z(2058660585);
            gt2Var2.invoke(h2, Integer.valueOf((i3 >> 3) & 14));
            h2.R();
            h2.t();
            h2.R();
            h2.R();
            h2.R();
            h2.t();
            h2.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k2 = h2.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$3
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
                    SnackbarKt.b(gt2.this, gt2Var2, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.Modifier r27, defpackage.gt2 r28, boolean r29, defpackage.no7 r30, long r31, long r33, float r35, final defpackage.gt2 r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.c(androidx.compose.ui.Modifier, gt2, boolean, no7, long, long, float, gt2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.tv7 r29, androidx.compose.ui.Modifier r30, boolean r31, defpackage.no7 r32, long r33, long r35, long r37, float r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.d(tv7, androidx.compose.ui.Modifier, boolean, no7, long, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final gt2 gt2Var, Composer composer, final int i2) {
        int i3;
        Composer h2 = composer.h(917397959);
        if ((i2 & 14) == 0) {
            i3 = (h2.C(gt2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && h2.i()) {
            h2.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(917397959, i3, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:236)");
            }
            SnackbarKt$TextOnlySnackbar$2 snackbarKt$TextOnlySnackbar$2 = new rg4() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2
                @Override // defpackage.rg4
                public final sg4 d(androidx.compose.ui.layout.f fVar, List list, long j) {
                    if (list.size() != 1) {
                        throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child");
                    }
                    final androidx.compose.ui.layout.l W = ((qg4) kotlin.collections.i.k0(list)).W(j);
                    int c0 = W.c0(androidx.compose.ui.layout.AlignmentLineKt.a());
                    int c02 = W.c0(androidx.compose.ui.layout.AlignmentLineKt.b());
                    if (c0 == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("No baselines for text");
                    }
                    if (c02 == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("No baselines for text");
                    }
                    final int max = Math.max(fVar.l0(c0 == c02 ? SnackbarKt.h : SnackbarKt.i), W.v0());
                    return androidx.compose.ui.layout.f.J(fVar, fv0.n(j), max, null, new ss2() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(l.a aVar) {
                            l.a.j(aVar, W, 0, (max - W.v0()) / 2, 0.0f, 4, null);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((l.a) obj);
                            return ww8.a;
                        }
                    }, 4, null);
                }
            };
            h2.z(-1323940314);
            Modifier.a aVar = Modifier.a;
            int a2 = cs0.a(h2, 0);
            et0 o = h2.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c2 = LayoutKt.c(aVar);
            if (h2.j() == null) {
                cs0.c();
            }
            h2.G();
            if (h2.f()) {
                h2.D(a3);
            } else {
                h2.p();
            }
            Composer a4 = Updater.a(h2);
            Updater.c(a4, snackbarKt$TextOnlySnackbar$2, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b2 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b2);
            }
            c2.invoke(ju7.a(ju7.b(h2)), h2, 0);
            h2.z(2058660585);
            Modifier j = PaddingKt.j(aVar, b, e);
            h2.z(733328855);
            rg4 g2 = BoxKt.g(Alignment.a.o(), false, h2, 0);
            h2.z(-1323940314);
            int a5 = cs0.a(h2, 0);
            et0 o2 = h2.o();
            qs2 a6 = companion.a();
            it2 c3 = LayoutKt.c(j);
            if (h2.j() == null) {
                cs0.c();
            }
            h2.G();
            if (h2.f()) {
                h2.D(a6);
            } else {
                h2.p();
            }
            Composer a7 = Updater.a(h2);
            Updater.c(a7, g2, companion.e());
            Updater.c(a7, o2, companion.g());
            gt2 b3 = companion.b();
            if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                a7.q(Integer.valueOf(a5));
                a7.v(Integer.valueOf(a5), b3);
            }
            c3.invoke(ju7.a(ju7.b(h2)), h2, 0);
            h2.z(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            gt2Var.invoke(h2, Integer.valueOf(i3 & 14));
            h2.R();
            h2.t();
            h2.R();
            h2.R();
            h2.R();
            h2.t();
            h2.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h2.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$3
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
                    SnackbarKt.e(gt2.this, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }
}
