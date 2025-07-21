package com.nytimes.android.unfear.reader.composable;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
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
import defpackage.ap0;
import defpackage.br;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.f38;
import defpackage.fg9;
import defpackage.g38;
import defpackage.gm2;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h38;
import defpackage.i38;
import defpackage.il9;
import defpackage.it2;
import defpackage.ju7;
import defpackage.n37;
import defpackage.ow8;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class LockupLayoutsKt {
    public static final void a(final gm2 gm2Var, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(gm2Var, "lockup");
        Composer h = composer.h(-802347586);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(gm2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = 2 & i2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(modifier) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !h.i()) {
            if (i4 != 0) {
                Modifier.a aVar = Modifier.a;
            }
            if (b.G()) {
                b.S(-802347586, i3, -1, "com.nytimes.android.unfear.reader.composable.FollowLockupLayout (LockupLayouts.kt:262)");
            }
            throw null;
        }
        h.K();
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2(gm2Var, modifier, i, i2) { // from class: com.nytimes.android.unfear.reader.composable.LockupLayoutsKt$FollowLockupLayout$1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ gm2 $lockup;
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
                    LockupLayoutsKt.a(null, this.$modifier, composer2, gt6.a(this.$$changed | 1), this.$$default);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.yh7 r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            r0 = r31
            r1 = r34
            r2 = r35
            java.lang.String r3 = "lockup"
            defpackage.zq3.h(r0, r3)
            r3 = 1354060734(0x50b553be, float:2.4337314E10)
            r4 = r33
            androidx.compose.runtime.Composer r15 = r4.h(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L1b
            r4 = r1 | 6
            goto L2b
        L1b:
            r4 = r1 & 14
            if (r4 != 0) goto L2a
            boolean r4 = r15.S(r0)
            if (r4 == 0) goto L27
            r4 = 4
            goto L28
        L27:
            r4 = 2
        L28:
            r4 = r4 | r1
            goto L2b
        L2a:
            r4 = r1
        L2b:
            r5 = r2 & 2
            r6 = 16
            if (r5 == 0) goto L36
            r4 = r4 | 48
        L33:
            r7 = r32
            goto L47
        L36:
            r7 = r1 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L33
            r7 = r32
            boolean r8 = r15.S(r7)
            if (r8 == 0) goto L45
            r8 = 32
            goto L46
        L45:
            r8 = r6
        L46:
            r4 = r4 | r8
        L47:
            r8 = r4 & 91
            r9 = 18
            if (r8 != r9) goto L5b
            boolean r8 = r15.i()
            if (r8 != 0) goto L54
            goto L5b
        L54:
            r15.K()
            r3 = r7
            r30 = r15
            goto Lb8
        L5b:
            if (r5 == 0) goto L61
            androidx.compose.ui.Modifier$a r5 = androidx.compose.ui.Modifier.a
            r13 = r5
            goto L62
        L61:
            r13 = r7
        L62:
            boolean r5 = androidx.compose.runtime.b.G()
            if (r5 == 0) goto L6e
            r5 = -1
            java.lang.String r7 = "com.nytimes.android.unfear.reader.composable.SectionTitleLockupLayout (LockupLayouts.kt:37)"
            androidx.compose.runtime.b.S(r3, r4, r5, r7)
        L6e:
            com.nytimes.android.unfear.nytdesignsystem.model.StyledText r3 = r31.b()
            int r4 = com.nytimes.android.unfear.nytdesignsystem.model.StyledText.d
            androidx.compose.ui.text.a r4 = r3.d(r15, r4)
            float r3 = (float) r6
            float r3 = defpackage.bu1.g(r3)
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.PaddingKt.i(r13, r3)
            r28 = 0
            r29 = 262140(0x3fffc, float:3.67336E-40)
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r3 = r13
            r13 = r16
            r16 = 0
            r30 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r26 = r30
            androidx.compose.material.TextKt.d(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r4 = androidx.compose.runtime.b.G()
            if (r4 == 0) goto Lb8
            androidx.compose.runtime.b.R()
        Lb8:
            cc7 r4 = r30.k()
            if (r4 == 0) goto Lc6
            com.nytimes.android.unfear.reader.composable.LockupLayoutsKt$SectionTitleLockupLayout$1 r5 = new com.nytimes.android.unfear.reader.composable.LockupLayoutsKt$SectionTitleLockupLayout$1
            r5.<init>()
            r4.a(r5)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.unfear.reader.composable.LockupLayoutsKt.b(yh7, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(f38 f38Var, Modifier modifier, Composer composer, int i, int i2) {
        zq3.h(f38Var, "lockup");
        Composer h = composer.h(182839710);
        if ((i2 & 2) != 0) {
            modifier = Modifier.a;
        }
        if (b.G()) {
            b.S(182839710, i, -1, "com.nytimes.android.unfear.reader.composable.StoryALockupLayout (LockupLayouts.kt:49)");
        }
        Modifier i3 = PaddingKt.i(modifier, bu1.g(16));
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(i3);
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
        h.z(-713997987);
        throw null;
    }

    public static final void d(g38 g38Var, Modifier modifier, Composer composer, int i, int i2) {
        zq3.h(g38Var, "lockup");
        Composer h = composer.h(-655091906);
        if ((i2 & 2) != 0) {
            modifier = Modifier.a;
        }
        if (b.G()) {
            b.S(-655091906, i, -1, "com.nytimes.android.unfear.reader.composable.StoryBLockupLayout (LockupLayouts.kt:70)");
        }
        Modifier i3 = PaddingKt.i(modifier, bu1.g(16));
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(i3);
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
        h.z(-682977525);
        throw null;
    }

    public static final void e(h38 h38Var, Modifier modifier, Composer composer, int i, int i2) {
        zq3.h(h38Var, "lockup");
        Composer h = composer.h(-1493023522);
        if ((i2 & 2) != 0) {
            modifier = Modifier.a;
        }
        if (b.G()) {
            b.S(-1493023522, i, -1, "com.nytimes.android.unfear.reader.composable.StoryCLockupLayout (LockupLayouts.kt:210)");
        }
        Modifier i3 = PaddingKt.i(modifier, bu1.g(16));
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(i3);
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
        h.z(-651953485);
        throw null;
    }

    public static final void f(i38 i38Var, Modifier modifier, Composer composer, int i, int i2) {
        zq3.h(i38Var, "lockup");
        Composer h = composer.h(1964012158);
        if ((i2 & 2) != 0) {
            modifier = Modifier.a;
        }
        if (b.G()) {
            b.S(1964012158, i, -1, "com.nytimes.android.unfear.reader.composable.StoryDLockupLayout (LockupLayouts.kt:225)");
        }
        Modifier i3 = PaddingKt.i(modifier, bu1.g(16));
        h.z(693286680);
        rg4 a = m.a(Arrangement.a.f(), Alignment.a.l(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(i3);
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
        n37 n37Var = n37.a;
        throw null;
    }

    public static final void g(final fg9 fg9Var, Modifier modifier, final br brVar, Composer composer, int i, int i2) {
        zq3.h(fg9Var, "lockup");
        Composer h = composer.h(1385547620);
        if ((i2 & 2) != 0) {
            modifier = Modifier.a;
        }
        Modifier modifier2 = modifier;
        if ((i2 & 4) != 0) {
            brVar = ow8.a.a(h, 6);
            i &= -897;
        }
        if (b.G()) {
            b.S(1385547620, i, -1, "com.nytimes.android.unfear.reader.composable.WideThumbnailStoryLockupLayout (LockupLayouts.kt:151)");
        }
        Modifier i3 = PaddingKt.i(ClickableKt.e(modifier2, false, null, null, new qs2(fg9Var) { // from class: com.nytimes.android.unfear.reader.composable.LockupLayoutsKt$WideThumbnailStoryLockupLayout$1
            final /* synthetic */ fg9 $lockup;

            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m766invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m766invoke() {
                br.this.c(null);
            }
        }, 7, null), bu1.g(25));
        h.z(693286680);
        rg4 a = m.a(Arrangement.a.f(), Alignment.a.l(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(i3);
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
        n37 n37Var = n37.a;
        throw null;
    }

    public static final void h(final il9 il9Var, Modifier modifier, final br brVar, Composer composer, int i, int i2) {
        zq3.h(il9Var, "lockup");
        Composer h = composer.h(-506704984);
        if ((i2 & 2) != 0) {
            modifier = Modifier.a;
        }
        Modifier modifier2 = modifier;
        if ((i2 & 4) != 0) {
            brVar = ow8.a.a(h, 6);
            i &= -897;
        }
        if (b.G()) {
            b.S(-506704984, i, -1, "com.nytimes.android.unfear.reader.composable.WrappedSummaryImageLockupLayout (LockupLayouts.kt:106)");
        }
        Modifier i3 = PaddingKt.i(ClickableKt.e(modifier2, false, null, null, new qs2(il9Var) { // from class: com.nytimes.android.unfear.reader.composable.LockupLayoutsKt$WrappedSummaryImageLockupLayout$1
            final /* synthetic */ il9 $lockup;

            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m767invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m767invoke() {
                br.this.c(null);
            }
        }, 7, null), bu1.g(16));
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(i3);
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
        h.z(1877181389);
        throw null;
    }
}
