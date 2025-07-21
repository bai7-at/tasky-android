package com.nytimes.android.utils.composeutils;

import androidx.compose.runtime.Composer;

/* loaded from: classes4.dex */
public abstract class ActionUtilsKt {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r1 != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.d44 r5, final defpackage.ss2 r6, androidx.compose.runtime.Composer r7, final int r8, final int r9) {
        /*
            java.lang.String r0 = "block"
            defpackage.zq3.h(r6, r0)
            r0 = 2111043469(0x7dd3f78d, float:3.5219058E37)
            androidx.compose.runtime.Composer r7 = r7.h(r0)
            r1 = r9 & 1
            if (r1 == 0) goto L13
            r2 = r8 | 2
            goto L14
        L13:
            r2 = r8
        L14:
            r3 = r9 & 2
            if (r3 == 0) goto L1b
            r2 = r2 | 48
            goto L2b
        L1b:
            r3 = r8 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L2b
            boolean r3 = r7.C(r6)
            if (r3 == 0) goto L28
            r3 = 32
            goto L2a
        L28:
            r3 = 16
        L2a:
            r2 = r2 | r3
        L2b:
            r3 = 1
            if (r1 != r3) goto L3f
            r3 = r2 & 91
            r4 = 18
            if (r3 != r4) goto L3f
            boolean r3 = r7.i()
            if (r3 != 0) goto L3b
            goto L3f
        L3b:
            r7.K()
            goto L84
        L3f:
            r7.E()
            r3 = r8 & 1
            if (r3 == 0) goto L55
            boolean r3 = r7.N()
            if (r3 == 0) goto L4d
            goto L55
        L4d:
            r7.K()
            if (r1 == 0) goto L62
        L52:
            r2 = r2 & (-15)
            goto L62
        L55:
            if (r1 == 0) goto L62
            m76 r5 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.i()
            java.lang.Object r5 = r7.m(r5)
            d44 r5 = (defpackage.d44) r5
            goto L52
        L62:
            r7.u()
            boolean r1 = androidx.compose.runtime.b.G()
            if (r1 == 0) goto L71
            r1 = -1
            java.lang.String r3 = "com.nytimes.android.utils.composeutils.DisposableLifecycleEffect (ActionUtils.kt:42)"
            androidx.compose.runtime.b.S(r0, r2, r1, r3)
        L71:
            com.nytimes.android.utils.composeutils.ActionUtilsKt$DisposableLifecycleEffect$1 r0 = new com.nytimes.android.utils.composeutils.ActionUtilsKt$DisposableLifecycleEffect$1
            r0.<init>(r5, r6)
            r1 = 8
            defpackage.py1.a(r5, r0, r7, r1)
            boolean r0 = androidx.compose.runtime.b.G()
            if (r0 == 0) goto L84
            androidx.compose.runtime.b.R()
        L84:
            cc7 r7 = r7.k()
            if (r7 == 0) goto L92
            com.nytimes.android.utils.composeutils.ActionUtilsKt$DisposableLifecycleEffect$2 r0 = new com.nytimes.android.utils.composeutils.ActionUtilsKt$DisposableLifecycleEffect$2
            r0.<init>()
            r7.a(r0)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.utils.composeutils.ActionUtilsKt.a(d44, ss2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final SingleActionHandler b(long j, long j2, Composer composer, int i, int i2) {
        composer.z(1610874673);
        if ((i2 & 1) != 0) {
            j = System.currentTimeMillis();
        }
        if ((i2 & 2) != 0) {
            j2 = 500;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1610874673, i, -1, "com.nytimes.android.utils.composeutils.rememberSingleActionHandler (ActionUtils.kt:16)");
        }
        composer.z(228491004);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = new SingleActionHandler(j, j2);
            composer.q(A);
        }
        SingleActionHandler singleActionHandler = (SingleActionHandler) A;
        composer.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return singleActionHandler;
    }
}
