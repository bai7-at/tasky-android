package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.bq4;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dy4;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.l27;
import defpackage.m37;
import defpackage.mq4;
import defpackage.n37;
import defpackage.nn0;
import defpackage.o76;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import defpackage.yr0;
import defpackage.zf4;
import defpackage.zq3;
import defpackage.zr0;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class MenuKt {
    private static final float a = bu1.g(48);
    private static final float b = bu1.g(12);
    private static final float c = bu1.g(8);
    private static final float d = bu1.g(ContentType.LONG_FORM_ON_DEMAND);
    private static final float e = bu1.g(280);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.ty4 r23, final defpackage.sy4 r24, final androidx.compose.foundation.ScrollState r25, androidx.compose.ui.Modifier r26, final defpackage.it2 r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.a(ty4, sy4, androidx.compose.foundation.ScrollState, androidx.compose.ui.Modifier, it2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    public static final void d(final gt2 gt2Var, final qs2 qs2Var, final Modifier modifier, final gt2 gt2Var2, final gt2 gt2Var3, final boolean z, final bq4 bq4Var, final ym5 ym5Var, final dy4 dy4Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-1564716777);
        if ((i & 6) == 0) {
            i2 = (h.C(gt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h.S(modifier) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h.C(gt2Var2) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h.C(gt2Var3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h.a(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= h.S(bq4Var) ? Constants.MB : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= h.S(ym5Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= h.S(dy4Var) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1564716777, i2, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:304)");
            }
            Modifier h2 = SizeKt.h(ClickableKt.c(modifier, dy4Var, l27.e(true, 0.0f, 0L, h, 6, 6), z, null, null, qs2Var, 24, null), 0.0f, 1, null);
            float f = d;
            float f2 = e;
            mq4 mq4Var = mq4.a;
            Modifier h3 = PaddingKt.h(SizeKt.r(h2, f, mq4Var.d(), f2, 0.0f, 8, null), ym5Var);
            Alignment.c i3 = Alignment.a.i();
            h.z(693286680);
            rg4 a2 = m.a(Arrangement.a.f(), i3, h, 48);
            h.z(-1323940314);
            int a3 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a4 = companion.a();
            it2 c2 = LayoutKt.c(h3);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a4);
            } else {
                h.p();
            }
            Composer a5 = Updater.a(h);
            Updater.c(a5, a2, companion.e());
            Updater.c(a5, o, companion.g());
            gt2 b2 = companion.b();
            if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                a5.q(Integer.valueOf(a3));
                a5.v(Integer.valueOf(a3), b2);
            }
            c2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            final n37 n37Var = n37.a;
            TextKt.a(TypographyKt.a(zf4.a.c(h, 6), mq4Var.i()), zr0.b(h, 1065051884, true, new gt2() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1
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
                    if ((i4 & 3) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(1065051884, i4, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:325)");
                    }
                    composer2.z(1426260804);
                    if (gt2.this != null) {
                        o76 c3 = ContentColorKt.a().c(nn0.j(bq4Var.a(z, composer2, 0)));
                        final gt2 gt2Var4 = gt2.this;
                        CompositionLocalKt.a(c3, zr0.b(composer2, 2035552199, true, new gt2() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.1
                            {
                                super(2);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return ww8.a;
                            }

                            public final void invoke(Composer composer3, int i5) {
                                if ((i5 & 3) == 2 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.S(2035552199, i5, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:329)");
                                }
                                Modifier b3 = SizeKt.b(Modifier.a, mq4.a.k(), 0.0f, 2, null);
                                gt2 gt2Var5 = gt2.this;
                                composer3.z(733328855);
                                rg4 g = BoxKt.g(Alignment.a.o(), false, composer3, 0);
                                composer3.z(-1323940314);
                                int a6 = cs0.a(composer3, 0);
                                et0 o2 = composer3.o();
                                ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                                qs2 a7 = companion2.a();
                                it2 c4 = LayoutKt.c(b3);
                                if (composer3.j() == null) {
                                    cs0.c();
                                }
                                composer3.G();
                                if (composer3.f()) {
                                    composer3.D(a7);
                                } else {
                                    composer3.p();
                                }
                                Composer a8 = Updater.a(composer3);
                                Updater.c(a8, g, companion2.e());
                                Updater.c(a8, o2, companion2.g());
                                gt2 b4 = companion2.b();
                                if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                                    a8.q(Integer.valueOf(a6));
                                    a8.v(Integer.valueOf(a6), b4);
                                }
                                c4.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                                composer3.z(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                                gt2Var5.invoke(composer3, 0);
                                composer3.R();
                                composer3.t();
                                composer3.R();
                                composer3.R();
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.R();
                                }
                            }
                        }), composer2, o76.d | 48);
                    }
                    composer2.R();
                    o76 c4 = ContentColorKt.a().c(bq4Var.b(z, composer2, 0).getValue());
                    final m37 m37Var = n37Var;
                    final gt2 gt2Var5 = gt2.this;
                    final gt2 gt2Var6 = gt2Var3;
                    final gt2 gt2Var7 = gt2Var;
                    yr0 b3 = zr0.b(composer2, -1728894036, true, new gt2() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.2
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
                            if ((i5 & 3) == 2 && composer3.i()) {
                                composer3.K();
                                return;
                            }
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.S(-1728894036, i5, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:335)");
                            }
                            Modifier m = PaddingKt.m(m37.b(m37.this, Modifier.a, 1.0f, false, 2, null), gt2Var5 != null ? MenuKt.b : bu1.g(0), 0.0f, gt2Var6 != null ? MenuKt.b : bu1.g(0), 0.0f, 10, null);
                            gt2 gt2Var8 = gt2Var7;
                            composer3.z(733328855);
                            rg4 g = BoxKt.g(Alignment.a.o(), false, composer3, 0);
                            composer3.z(-1323940314);
                            int a6 = cs0.a(composer3, 0);
                            et0 o2 = composer3.o();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                            qs2 a7 = companion2.a();
                            it2 c5 = LayoutKt.c(m);
                            if (composer3.j() == null) {
                                cs0.c();
                            }
                            composer3.G();
                            if (composer3.f()) {
                                composer3.D(a7);
                            } else {
                                composer3.p();
                            }
                            Composer a8 = Updater.a(composer3);
                            Updater.c(a8, g, companion2.e());
                            Updater.c(a8, o2, companion2.g());
                            gt2 b4 = companion2.b();
                            if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                                a8.q(Integer.valueOf(a6));
                                a8.v(Integer.valueOf(a6), b4);
                            }
                            c5.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                            composer3.z(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                            gt2Var8.invoke(composer3, 0);
                            composer3.R();
                            composer3.t();
                            composer3.R();
                            composer3.R();
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.R();
                            }
                        }
                    });
                    int i5 = o76.d;
                    CompositionLocalKt.a(c4, b3, composer2, i5 | 48);
                    if (gt2Var3 != null) {
                        o76 c5 = ContentColorKt.a().c(nn0.j(bq4Var.c(z, composer2, 0)));
                        final gt2 gt2Var8 = gt2Var3;
                        CompositionLocalKt.a(c5, zr0.b(composer2, 580312062, true, new gt2() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.3
                            {
                                super(2);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return ww8.a;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.S(580312062, i6, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:358)");
                                }
                                Modifier b4 = SizeKt.b(Modifier.a, mq4.a.m(), 0.0f, 2, null);
                                gt2 gt2Var9 = gt2.this;
                                composer3.z(733328855);
                                rg4 g = BoxKt.g(Alignment.a.o(), false, composer3, 0);
                                composer3.z(-1323940314);
                                int a6 = cs0.a(composer3, 0);
                                et0 o2 = composer3.o();
                                ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                                qs2 a7 = companion2.a();
                                it2 c6 = LayoutKt.c(b4);
                                if (composer3.j() == null) {
                                    cs0.c();
                                }
                                composer3.G();
                                if (composer3.f()) {
                                    composer3.D(a7);
                                } else {
                                    composer3.p();
                                }
                                Composer a8 = Updater.a(composer3);
                                Updater.c(a8, g, companion2.e());
                                Updater.c(a8, o2, companion2.g());
                                gt2 b5 = companion2.b();
                                if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                                    a8.q(Integer.valueOf(a6));
                                    a8.v(Integer.valueOf(a6), b5);
                                }
                                c6.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                                composer3.z(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                                gt2Var9.invoke(composer3, 0);
                                composer3.R();
                                composer3.t();
                                composer3.R();
                                composer3.R();
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.R();
                                }
                            }
                        }), composer2, i5 | 48);
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, 48);
            h.R();
            h.t();
            h.R();
            h.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$2
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
                    MenuKt.d(gt2.this, qs2Var, modifier, gt2Var2, gt2Var3, z, bq4Var, ym5Var, dy4Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long h(defpackage.bn3 r5, defpackage.bn3 r6) {
        /*
            int r0 = r6.d()
            int r1 = r5.e()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto Lf
        Ld:
            r0 = r3
            goto L49
        Lf:
            int r0 = r6.e()
            int r1 = r5.d()
            if (r0 > r1) goto L1b
            r0 = r2
            goto L49
        L1b:
            int r0 = r6.i()
            if (r0 != 0) goto L22
            goto Ld
        L22:
            int r0 = r5.d()
            int r1 = r6.d()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.e()
            int r4 = r6.e()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.d()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.i()
            float r1 = (float) r1
            float r0 = r0 / r1
        L49:
            int r1 = r6.g()
            int r4 = r5.a()
            if (r1 < r4) goto L55
        L53:
            r2 = r3
            goto L8f
        L55:
            int r1 = r6.a()
            int r4 = r5.g()
            if (r1 > r4) goto L60
            goto L8f
        L60:
            int r1 = r6.c()
            if (r1 != 0) goto L67
            goto L53
        L67:
            int r1 = r5.g()
            int r2 = r6.g()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.a()
            int r2 = r6.a()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.g()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.c()
            float r6 = (float) r6
            float r2 = r5 / r6
        L8f:
            long r5 = defpackage.vq8.a(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.h(bn3, bn3):long");
    }

    public static final float i() {
        return c;
    }

    public static final float j() {
        return a;
    }
}
