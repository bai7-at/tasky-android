package com.nytimes.android.features.recentlyviewedui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.nytimes.android.unfear.core.composable.UnfearLayoutsKt;
import com.nytimes.android.utils.snackbar.LocalSnackbarKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.an5;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.em6;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.u14;
import defpackage.vk6;
import defpackage.ww8;
import defpackage.zq3;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public abstract class RecentsComposablesKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            r1 = r27
            r0 = r30
            r15 = r31
            java.lang.String r2 = "text"
            defpackage.zq3.h(r1, r2)
            r2 = -344390992(0xffffffffeb7902b0, float:-3.0103522E26)
            r3 = r29
            androidx.compose.runtime.Composer r13 = r3.h(r2)
            r3 = r15 & 1
            if (r3 == 0) goto L1b
            r3 = r0 | 6
            goto L2b
        L1b:
            r3 = r0 & 14
            if (r3 != 0) goto L2a
            boolean r3 = r13.S(r1)
            if (r3 == 0) goto L27
            r3 = 4
            goto L28
        L27:
            r3 = 2
        L28:
            r3 = r3 | r0
            goto L2b
        L2a:
            r3 = r0
        L2b:
            r4 = r15 & 2
            if (r4 == 0) goto L34
            r3 = r3 | 48
        L31:
            r5 = r28
            goto L46
        L34:
            r5 = r0 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L31
            r5 = r28
            boolean r6 = r13.S(r5)
            if (r6 == 0) goto L43
            r6 = 32
            goto L45
        L43:
            r6 = 16
        L45:
            r3 = r3 | r6
        L46:
            r6 = r3 & 91
            r7 = 18
            if (r6 != r7) goto L59
            boolean r6 = r13.i()
            if (r6 != 0) goto L53
            goto L59
        L53:
            r13.K()
            r26 = r13
            goto Lb9
        L59:
            if (r4 == 0) goto L60
            androidx.compose.ui.Modifier$a r4 = androidx.compose.ui.Modifier.a
            r25 = r4
            goto L62
        L60:
            r25 = r5
        L62:
            boolean r4 = androidx.compose.runtime.b.G()
            if (r4 == 0) goto L6e
            r4 = -1
            java.lang.String r5 = "com.nytimes.android.features.recentlyviewedui.Description (RecentsComposables.kt:178)"
            androidx.compose.runtime.b.S(r2, r3, r4, r5)
        L6e:
            eb5$a r2 = defpackage.eb5.Companion
            r4 = 8
            ob5 r2 = r2.c(r13, r4)
            androidx.compose.ui.text.j r20 = r2.b0()
            dh8$a r2 = defpackage.dh8.b
            int r2 = r2.a()
            dh8 r12 = defpackage.dh8.h(r2)
            r22 = r3 & 126(0x7e, float:1.77E-43)
            r23 = 0
            r24 = 65020(0xfdfc, float:9.1112E-41)
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r16 = 0
            r26 = r13
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r27
            r1 = r25
            r21 = r26
            androidx.compose.material.TextKt.c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = androidx.compose.runtime.b.G()
            if (r0 == 0) goto Lb7
            androidx.compose.runtime.b.R()
        Lb7:
            r5 = r25
        Lb9:
            cc7 r0 = r26.k()
            if (r0 == 0) goto Lcd
            com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt$Description$1 r1 = new com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt$Description$1
            r2 = r27
            r3 = r30
            r4 = r31
            r1.<init>()
            r0.a(r1)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt.a(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(1097972595);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(1097972595, i3, -1, "com.nytimes.android.features.recentlyviewedui.EmptyView (RecentsComposables.kt:144)");
            }
            Modifier d = SizeKt.d(modifier, 0.0f, 1, null);
            Arrangement.f b = Arrangement.a.b();
            Alignment.b g = Alignment.a.g();
            h.z(-483455358);
            rg4 a = d.a(b, g, h, 54);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(d);
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
            String b3 = k48.b(vk6.recents_empty_label, h, 0);
            Modifier.a aVar = Modifier.a;
            c(b3, PaddingKt.m(aVar, 0.0f, bu1.g(32), 0.0f, 0.0f, 13, null), h, 48, 0);
            a(k48.b(vk6.recents_empty_desciption, h, 0), PaddingKt.m(aVar, 0.0f, bu1.g(24), 0.0f, 0.0f, 13, null), h, 48, 0);
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
            k.a(new gt2() { // from class: com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt$EmptyView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    RecentsComposablesKt.b(Modifier.this, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            r1 = r27
            r0 = r30
            r15 = r31
            java.lang.String r2 = "text"
            defpackage.zq3.h(r1, r2)
            r2 = -1644071640(0xffffffff9e017528, float:-6.8534305E-21)
            r3 = r29
            androidx.compose.runtime.Composer r13 = r3.h(r2)
            r3 = r15 & 1
            if (r3 == 0) goto L1b
            r3 = r0 | 6
            goto L2b
        L1b:
            r3 = r0 & 14
            if (r3 != 0) goto L2a
            boolean r3 = r13.S(r1)
            if (r3 == 0) goto L27
            r3 = 4
            goto L28
        L27:
            r3 = 2
        L28:
            r3 = r3 | r0
            goto L2b
        L2a:
            r3 = r0
        L2b:
            r4 = r15 & 2
            if (r4 == 0) goto L34
            r3 = r3 | 48
        L31:
            r5 = r28
            goto L46
        L34:
            r5 = r0 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L31
            r5 = r28
            boolean r6 = r13.S(r5)
            if (r6 == 0) goto L43
            r6 = 32
            goto L45
        L43:
            r6 = 16
        L45:
            r3 = r3 | r6
        L46:
            r6 = r3 & 91
            r7 = 18
            if (r6 != r7) goto L59
            boolean r6 = r13.i()
            if (r6 != 0) goto L53
            goto L59
        L53:
            r13.K()
            r26 = r13
            goto Lb9
        L59:
            if (r4 == 0) goto L60
            androidx.compose.ui.Modifier$a r4 = androidx.compose.ui.Modifier.a
            r25 = r4
            goto L62
        L60:
            r25 = r5
        L62:
            boolean r4 = androidx.compose.runtime.b.G()
            if (r4 == 0) goto L6e
            r4 = -1
            java.lang.String r5 = "com.nytimes.android.features.recentlyviewedui.Label (RecentsComposables.kt:165)"
            androidx.compose.runtime.b.S(r2, r3, r4, r5)
        L6e:
            eb5$a r2 = defpackage.eb5.Companion
            r4 = 8
            ob5 r2 = r2.c(r13, r4)
            androidx.compose.ui.text.j r20 = r2.c0()
            dh8$a r2 = defpackage.dh8.b
            int r2 = r2.a()
            dh8 r12 = defpackage.dh8.h(r2)
            r22 = r3 & 126(0x7e, float:1.77E-43)
            r23 = 0
            r24 = 65020(0xfdfc, float:9.1112E-41)
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r16 = 0
            r26 = r13
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r27
            r1 = r25
            r21 = r26
            androidx.compose.material.TextKt.c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = androidx.compose.runtime.b.G()
            if (r0 == 0) goto Lb7
            androidx.compose.runtime.b.R()
        Lb7:
            r5 = r25
        Lb9:
            cc7 r0 = r26.k()
            if (r0 == 0) goto Lcd
            com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt$Label$1 r1 = new com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt$Label$1
            r2 = r27
            r3 = r30
            r4 = r31
            r1.<init>()
            r0.a(r1)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt.c(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(final an5 an5Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(196562389);
        if ((i & 14) == 0) {
            i2 = (h.S(an5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(196562389, i2, -1, "com.nytimes.android.features.recentlyviewedui.LoggedInView (RecentsComposables.kt:127)");
            }
            if (an5Var == null) {
                h.z(985360945);
                b(SizeKt.s(Modifier.a, bu1.g(280)), h, 6, 0);
                h.R();
            } else {
                h.z(985361011);
                UnfearLayoutsKt.a(an5Var, BackgroundKt.d(SizeKt.d(SizeKt.h(Modifier.a, 0.0f, 1, null), 0.0f, 1, null), eb5.Companion.a(h, 8).a0(), null, 2, null), null, h, an5.a | (i2 & 14), 4);
                h.R();
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt$LoggedInView$1
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
                    RecentsComposablesKt.d(an5.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.qs2 r22, final defpackage.qs2 r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt.e(qs2, qs2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final java.lang.String r19, final defpackage.qs2 r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt.f(java.lang.String, qs2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void g(final StateFlow stateFlow, final StateFlow stateFlow2, final qs2 qs2Var, final qs2 qs2Var2, Modifier modifier, Composer composer, final int i, final int i2) {
        zq3.h(stateFlow, "isLoggedInState");
        zq3.h(stateFlow2, "lceState");
        zq3.h(qs2Var, "onLoginButtonClick");
        zq3.h(qs2Var2, "onCreateAccountButtonClick");
        Composer h = composer.h(2117598762);
        Modifier modifier2 = (i2 & 16) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(2117598762, i, -1, "com.nytimes.android.features.recentlyviewedui.RecentsView (RecentsComposables.kt:38)");
        }
        boolean booleanValue = ((Boolean) y.b(stateFlow, null, h, 8, 1).getValue()).booleanValue();
        u14 u14Var = (u14) y.b(stateFlow2, null, h, 8, 1).getValue();
        Alignment e = Alignment.a.e();
        Modifier h2 = SizeKt.h(SizeKt.d(PaddingKt.m(BackgroundKt.d(modifier2, eb5.Companion.a(h, 8).w(), null, 2, null), 0.0f, 0.0f, 0.0f, bu1.g(42), 7, null), 0.0f, 1, null), 0.0f, 1, null);
        h.z(733328855);
        rg4 g = BoxKt.g(e, false, h, 6);
        h.z(-1323940314);
        int a = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a2 = companion.a();
        it2 c = LayoutKt.c(h2);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        if (booleanValue) {
            h.z(1079967891);
            if (u14Var instanceof u14.a) {
                h.z(1079967958);
                SnackbarUtil.y((SnackbarUtil) h.m(LocalSnackbarKt.a()), em6.retry_text_error, 0, 2, null);
                h.R();
            } else if (u14Var instanceof u14.c) {
                h.z(1079968104);
                d((an5) u14Var.a(), h, an5.a);
                h.R();
            } else {
                h.z(1079968158);
                h.R();
            }
            h.R();
        } else {
            h.z(1079968221);
            h.z(1079968273);
            boolean z = (((i & 896) ^ 384) > 256 && h.S(qs2Var)) || (i & 384) == 256;
            Object A = h.A();
            if (z || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt$RecentsView$1$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m422invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m422invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A);
            }
            qs2 qs2Var3 = (qs2) A;
            h.R();
            h.z(1079968351);
            boolean z2 = (((i & 7168) ^ 3072) > 2048 && h.S(qs2Var2)) || (i & 3072) == 2048;
            Object A2 = h.A();
            if (z2 || A2 == Composer.a.a()) {
                A2 = new qs2() { // from class: com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt$RecentsView$1$2$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m423invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m423invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A2);
            }
            h.R();
            e(qs2Var3, (qs2) A2, null, h, 0, 4);
            h.R();
        }
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.features.recentlyviewedui.RecentsComposablesKt$RecentsView$2
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
                    RecentsComposablesKt.g(StateFlow.this, stateFlow2, qs2Var, qs2Var2, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
