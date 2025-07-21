package com.nytimes.xwords.hybrid.bridgecommands;

import defpackage.mc0;

/* loaded from: classes4.dex */
public final class GetUserDetailsCommand extends mc0 {
    public GetUserDetailsCommand() {
        super("gamesGetUserDetails");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.mc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.webkit.WebView r8, int r9, defpackage.nc0 r10, defpackage.by0 r11) {
        /*
            r7 = this;
            boolean r8 = r11 instanceof com.nytimes.xwords.hybrid.bridgecommands.GetUserDetailsCommand$run$1
            if (r8 == 0) goto L13
            r8 = r11
            com.nytimes.xwords.hybrid.bridgecommands.GetUserDetailsCommand$run$1 r8 = (com.nytimes.xwords.hybrid.bridgecommands.GetUserDetailsCommand$run$1) r8
            int r10 = r8.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r10 & r0
            if (r1 == 0) goto L13
            int r10 = r10 - r0
            r8.label = r10
            goto L18
        L13:
            com.nytimes.xwords.hybrid.bridgecommands.GetUserDetailsCommand$run$1 r8 = new com.nytimes.xwords.hybrid.bridgecommands.GetUserDetailsCommand$run$1
            r8.<init>(r7, r11)
        L18:
            java.lang.Object r7 = r8.result
            java.lang.Object r10 = kotlin.coroutines.intrinsics.a.h()
            int r11 = r8.label
            r0 = 1
            if (r11 == 0) goto L37
            if (r11 != r0) goto L2f
            int r9 = r8.I$0
            java.lang.Object r8 = r8.L$0
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r8 = (com.nytimes.android.hybrid.bridge.BridgeCommandResult.a) r8
            kotlin.f.b(r7)
            goto L52
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.f.b(r7)
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r7 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.Companion
            com.nytimes.xwords.hybrid.GamesHybridManager r11 = com.nytimes.xwords.hybrid.GamesHybridManager.a
            kotlinx.coroutines.flow.Flow r11 = r11.f()
            r8.L$0 = r7
            r8.I$0 = r9
            r8.label = r0
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r11, r8)
            if (r8 != r10) goto L4f
            return r10
        L4f:
            r6 = r8
            r8 = r7
            r7 = r6
        L52:
            zu2 r7 = (defpackage.zu2) r7
            boolean r10 = r7.g()
            java.lang.Boolean r10 = defpackage.cc0.a(r10)
            java.lang.String r11 = "isSubscribed"
            kotlin.Pair r0 = defpackage.du8.a(r11, r10)
            boolean r10 = r7.i()
            java.lang.Boolean r10 = defpackage.cc0.a(r10)
            java.lang.String r11 = "isUserLoggedIn"
            kotlin.Pair r1 = defpackage.du8.a(r11, r10)
            java.lang.String r10 = r7.e()
            if (r10 != 0) goto L78
            java.lang.String r10 = ""
        L78:
            java.lang.String r11 = "nytsCookie"
            kotlin.Pair r2 = defpackage.du8.a(r11, r10)
            java.lang.String r10 = "regiID"
            java.lang.String r11 = r7.f()
            kotlin.Pair r3 = defpackage.du8.a(r10, r11)
            java.lang.String r10 = "email"
            java.lang.String r11 = r7.b()
            kotlin.Pair r4 = defpackage.du8.a(r10, r11)
            java.lang.String r10 = "entitlements"
            java.util.Set r7 = r7.c()
            kotlin.Pair r5 = defpackage.du8.a(r10, r7)
            kotlin.Pair[] r7 = new kotlin.Pair[]{r0, r1, r2, r3, r4, r5}
            java.util.Map r7 = kotlin.collections.t.m(r7)
            java.lang.String r10 = "gamesGetUserDetails"
            kotlin.Pair r7 = defpackage.du8.a(r10, r7)
            java.util.Map r7 = kotlin.collections.t.f(r7)
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r7 = r8.c(r9, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.xwords.hybrid.bridgecommands.GetUserDetailsCommand.b(android.webkit.WebView, int, nc0, by0):java.lang.Object");
    }
}
