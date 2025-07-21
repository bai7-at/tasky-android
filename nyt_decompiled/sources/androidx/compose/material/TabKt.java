package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
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
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.di;
import defpackage.ek8;
import defpackage.et0;
import defpackage.eu8;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hu8;
import defpackage.it2;
import defpackage.ju7;
import defpackage.nn0;
import defpackage.o76;
import defpackage.ph2;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.xx1;
import defpackage.zq3;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class TabKt {
    private static final float a = bu1.g(48);
    private static final float b = bu1.g(72);
    private static final float c = bu1.g(16);
    private static final float d = bu1.g(14);
    private static final float e = bu1.g(6);
    private static final long f = ek8.g(20);
    private static final float g = bu1.g(8);

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r30, final defpackage.qs2 r31, androidx.compose.ui.Modifier r32, boolean r33, defpackage.gt2 r34, defpackage.gt2 r35, defpackage.dy4 r36, long r37, long r39, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.a(boolean, qs2, androidx.compose.ui.Modifier, boolean, gt2, gt2, dy4, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final boolean r29, final defpackage.qs2 r30, androidx.compose.ui.Modifier r31, boolean r32, defpackage.dy4 r33, long r34, long r36, final defpackage.it2 r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.b(boolean, qs2, androidx.compose.ui.Modifier, boolean, dy4, long, long, it2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final gt2 gt2Var, final gt2 gt2Var2, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(1249848471);
        if ((i & 14) == 0) {
            i2 = (h.C(gt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(gt2Var2) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1249848471, i2, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:304)");
            }
            h.z(-1025551306);
            boolean C = h.C(gt2Var) | h.C(gt2Var2);
            Object A = h.A();
            if (C || A == Composer.a.a()) {
                A = new rg4() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2$1
                    @Override // defpackage.rg4
                    public final sg4 d(final androidx.compose.ui.layout.f fVar, List list, long j) {
                        androidx.compose.ui.layout.l lVar;
                        final androidx.compose.ui.layout.l lVar2;
                        if (gt2.this != null) {
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                qg4 qg4Var = (qg4) list.get(i3);
                                if (zq3.c(androidx.compose.ui.layout.b.a(qg4Var), "text")) {
                                    lVar = qg4Var.W(fv0.e(j, 0, 0, 0, 0, 11, null));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        lVar = null;
                        if (gt2Var2 != null) {
                            int size2 = list.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                qg4 qg4Var2 = (qg4) list.get(i4);
                                if (zq3.c(androidx.compose.ui.layout.b.a(qg4Var2), "icon")) {
                                    lVar2 = qg4Var2.W(j);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        lVar2 = null;
                        final int max = Math.max(lVar != null ? lVar.F0() : 0, lVar2 != null ? lVar2.F0() : 0);
                        final int l0 = fVar.l0((lVar == null || lVar2 == null) ? TabKt.a : TabKt.b);
                        final Integer valueOf = lVar != null ? Integer.valueOf(lVar.c0(AlignmentLineKt.a())) : null;
                        final Integer valueOf2 = lVar != null ? Integer.valueOf(lVar.c0(AlignmentLineKt.b())) : null;
                        final androidx.compose.ui.layout.l lVar3 = lVar;
                        return androidx.compose.ui.layout.f.J(fVar, max, l0, null, new ss2() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(l.a aVar) {
                                androidx.compose.ui.layout.l lVar4;
                                androidx.compose.ui.layout.l lVar5 = androidx.compose.ui.layout.l.this;
                                if (lVar5 == null || (lVar4 = lVar2) == null) {
                                    if (lVar5 != null) {
                                        TabKt.m(aVar, lVar5, l0);
                                        return;
                                    }
                                    androidx.compose.ui.layout.l lVar6 = lVar2;
                                    if (lVar6 != null) {
                                        TabKt.m(aVar, lVar6, l0);
                                        return;
                                    }
                                    return;
                                }
                                androidx.compose.ui.layout.f fVar2 = fVar;
                                int i5 = max;
                                int i6 = l0;
                                Integer num = valueOf;
                                zq3.e(num);
                                int intValue = num.intValue();
                                Integer num2 = valueOf2;
                                zq3.e(num2);
                                TabKt.l(aVar, fVar2, lVar5, lVar4, i5, i6, intValue, num2.intValue());
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((l.a) obj);
                                return ww8.a;
                            }
                        }, 4, null);
                    }
                };
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
            h.z(-2141028410);
            if (gt2Var != null) {
                Modifier k = PaddingKt.k(androidx.compose.ui.layout.b.b(aVar, "text"), c, 0.0f, 2, null);
                h.z(733328855);
                rg4 g2 = BoxKt.g(Alignment.a.o(), false, h, 0);
                h.z(-1323940314);
                int a5 = cs0.a(h, 0);
                et0 o2 = h.o();
                qs2 a6 = companion.a();
                it2 c3 = LayoutKt.c(k);
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
                Updater.c(a7, g2, companion.e());
                Updater.c(a7, o2, companion.g());
                gt2 b3 = companion.b();
                if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                    a7.q(Integer.valueOf(a5));
                    a7.v(Integer.valueOf(a5), b3);
                }
                c3.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                gt2Var.invoke(h, Integer.valueOf(i2 & 14));
                h.R();
                h.t();
                h.R();
                h.R();
            }
            h.R();
            h.z(448373087);
            if (gt2Var2 != null) {
                Modifier b4 = androidx.compose.ui.layout.b.b(aVar, "icon");
                h.z(733328855);
                rg4 g3 = BoxKt.g(Alignment.a.o(), false, h, 0);
                h.z(-1323940314);
                int a8 = cs0.a(h, 0);
                et0 o3 = h.o();
                qs2 a9 = companion.a();
                it2 c4 = LayoutKt.c(b4);
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
                Updater.c(a10, g3, companion.e());
                Updater.c(a10, o3, companion.g());
                gt2 b5 = companion.b();
                if (a10.f() || !zq3.c(a10.A(), Integer.valueOf(a8))) {
                    a10.q(Integer.valueOf(a8));
                    a10.v(Integer.valueOf(a8), b5);
                }
                c4.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
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
            k2.a(new gt2() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$3
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
                    TabKt.c(gt2.this, gt2Var2, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final long j, final long j2, final boolean z, final gt2 gt2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-405571117);
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
            i2 |= h.C(gt2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i2 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-405571117, i2, -1, "androidx.compose.material.TabTransition (Tab.kt:268)");
            }
            int i3 = i2 >> 6;
            Transition f2 = TransitionKt.f(Boolean.valueOf(z), null, h, i3 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new it2() { // from class: androidx.compose.material.TabKt$TabTransition$color$2
                public final ph2 b(Transition.b bVar, Composer composer2, int i4) {
                    composer2.z(-2120892502);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(-2120892502, i4, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:272)");
                    }
                    eu8 j3 = bVar.f(Boolean.FALSE, Boolean.TRUE) ? di.j(150, 100, xx1.d()) : di.k(100, 0, xx1.d(), 2, null);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                    composer2.R();
                    return j3;
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return b((Transition.b) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
            h.z(-1939694975);
            boolean booleanValue = ((Boolean) f2.n()).booleanValue();
            h.z(1445938070);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:286)");
            }
            long j3 = booleanValue ? j : j2;
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
            h.R();
            androidx.compose.ui.graphics.colorspace.c w = nn0.w(j3);
            h.z(1157296644);
            boolean S = h.S(w);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = (hu8) ColorVectorConverterKt.a(nn0.b).invoke(w);
                h.q(A);
            }
            h.R();
            hu8 hu8Var = (hu8) A;
            h.z(-142660079);
            boolean booleanValue2 = ((Boolean) f2.h()).booleanValue();
            h.z(1445938070);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:286)");
            }
            long j4 = booleanValue2 ? j : j2;
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
            h.R();
            nn0 j5 = nn0.j(j4);
            boolean booleanValue3 = ((Boolean) f2.n()).booleanValue();
            h.z(1445938070);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:286)");
            }
            long j6 = booleanValue3 ? j : j2;
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
            h.R();
            x08 c2 = TransitionKt.c(f2, j5, nn0.j(j6), (ph2) tabKt$TabTransition$color$2.invoke(f2.l(), h, 0), hu8Var, "ColorAnimation", h, 32768);
            h.R();
            h.R();
            CompositionLocalKt.b(new o76[]{ContentColorKt.a().c(nn0.j(nn0.r(e(c2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.a().c(Float.valueOf(nn0.u(e(c2))))}, gt2Var, h, (i3 & ContentType.LONG_FORM_ON_DEMAND) | 8);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.TabKt$TabTransition$1
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
                    TabKt.d(j, j2, z, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final long e(x08 x08Var) {
        return ((nn0) x08Var.getValue()).B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(l.a aVar, fm1 fm1Var, androidx.compose.ui.layout.l lVar, androidx.compose.ui.layout.l lVar2, int i, int i2, int i3, int i4) {
        int l0 = fm1Var.l0(i3 == i4 ? d : e) + fm1Var.l0(TabRowDefaults.a.c());
        int v0 = (lVar2.v0() + fm1Var.k1(f)) - i3;
        int i5 = (i2 - i4) - l0;
        l.a.j(aVar, lVar, (i - lVar.F0()) / 2, i5, 0.0f, 4, null);
        l.a.j(aVar, lVar2, (i - lVar2.F0()) / 2, i5 - v0, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(l.a aVar, androidx.compose.ui.layout.l lVar, int i) {
        l.a.j(aVar, lVar, 0, (i - lVar.v0()) / 2, 0.0f, 4, null);
    }
}
