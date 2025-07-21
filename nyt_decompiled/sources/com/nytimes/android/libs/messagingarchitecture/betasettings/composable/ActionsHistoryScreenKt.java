package com.nytimes.android.libs.messagingarchitecture.betasettings.composable;

/* loaded from: classes4.dex */
public abstract class ActionsHistoryScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r1 != 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel r11, androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            r0 = -1100192617(0xffffffffbe6c6497, float:-0.23085247)
            androidx.compose.runtime.Composer r12 = r12.h(r0)
            r1 = r14 & 1
            if (r1 == 0) goto Lf
            r2 = r13 | 2
            r9 = r2
            goto L10
        Lf:
            r9 = r13
        L10:
            r10 = 1
            if (r1 != r10) goto L24
            r2 = r9 & 11
            r3 = 2
            if (r2 != r3) goto L24
            boolean r2 = r12.i()
            if (r2 != 0) goto L1f
            goto L24
        L1f:
            r12.K()
            goto Lc5
        L24:
            r12.E()
            r2 = r13 & 1
            if (r2 == 0) goto L3a
            boolean r2 = r12.N()
            if (r2 == 0) goto L32
            goto L3a
        L32:
            r12.K()
            if (r1 == 0) goto L84
        L37:
            r9 = r9 & (-15)
            goto L84
        L3a:
            if (r1 == 0) goto L84
            r11 = 1890788296(0x70b323c8, float:4.435286E29)
            r12.z(r11)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r11 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.c
            sa9 r2 = r11.a(r12, r1)
            if (r2 == 0) goto L7c
            r11 = 0
            androidx.lifecycle.t$b r4 = defpackage.i83.a(r2, r12, r11)
            r11 = 1729797275(0x671a9c9b, float:7.301333E23)
            r12.z(r11)
            boolean r11 = r2 instanceof androidx.lifecycle.d
            if (r11 == 0) goto L64
            r11 = r2
            androidx.lifecycle.d r11 = (androidx.lifecycle.d) r11
            t21 r11 = r11.getDefaultViewModelCreationExtras()
        L62:
            r5 = r11
            goto L67
        L64:
            t21$a r11 = t21.a.b
            goto L62
        L67:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel> r1 = com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.q r11 = defpackage.pa9.c(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.R()
            r12.R()
            com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel r11 = (com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel) r11
            goto L37
        L7c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r11.<init>(r12)
            throw r11
        L84:
            r12.u()
            boolean r1 = androidx.compose.runtime.b.G()
            if (r1 == 0) goto L93
            r1 = -1
            java.lang.String r2 = "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreen (ActionsHistoryScreen.kt:38)"
            androidx.compose.runtime.b.S(r0, r9, r1, r2)
        L93:
            kotlinx.coroutines.flow.StateFlow r0 = r11.n()
            r1 = 0
            r2 = 8
            x08 r0 = androidx.compose.runtime.y.b(r0, r1, r12, r2, r10)
            java.lang.Object r0 = r0.getValue()
            r1 = r0
            u14 r1 = (defpackage.u14) r1
            com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreenKt$ActionsHistoryScreen$1 r0 = new com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreenKt$ActionsHistoryScreen$1
            r0.<init>(r11)
            r2 = 467039643(0x1bd6759b, float:3.547933E-22)
            yr0 r5 = defpackage.zr0.b(r12, r2, r10, r0)
            r7 = 24584(0x6008, float:3.445E-41)
            r8 = 14
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = r12
            com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ScreenContentKt.a(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.b.G()
            if (r0 == 0) goto Lc5
            androidx.compose.runtime.b.R()
        Lc5:
            cc7 r12 = r12.k()
            if (r12 == 0) goto Ld3
            com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreenKt$ActionsHistoryScreen$2 r0 = new com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreenKt$ActionsHistoryScreen$2
            r0.<init>()
            r12.a(r0)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ActionsHistoryScreenKt.a(com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel, androidx.compose.runtime.Composer, int, int):void");
    }
}
