package com.nytimes.xwords.hybrid.bridgecommands;

import defpackage.dz1;
import defpackage.mc0;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SendEmailCommand extends mc0 {
    private final dz1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendEmailCommand(dz1 dz1Var) {
        super("gamesSendEmail");
        zq3.h(dz1Var, "emailEventHandler");
        this.b = dz1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.mc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.webkit.WebView r7, int r8, defpackage.nc0 r9, defpackage.by0 r10) {
        /*
            r6 = this;
            boolean r7 = r10 instanceof com.nytimes.xwords.hybrid.bridgecommands.SendEmailCommand$run$1
            if (r7 == 0) goto L13
            r7 = r10
            com.nytimes.xwords.hybrid.bridgecommands.SendEmailCommand$run$1 r7 = (com.nytimes.xwords.hybrid.bridgecommands.SendEmailCommand$run$1) r7
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.label = r0
            goto L18
        L13:
            com.nytimes.xwords.hybrid.bridgecommands.SendEmailCommand$run$1 r7 = new com.nytimes.xwords.hybrid.bridgecommands.SendEmailCommand$run$1
            r7.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            int r8 = r7.I$0
            kotlin.f.b(r10)
            goto L68
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.f.b(r10)
            java.lang.String r10 = "type"
            java.lang.String r10 = r9.j(r10)
            java.lang.String r1 = "debugInfo"
            java.lang.String r1 = r9.j(r1)
            java.lang.String r3 = "emailTitle"
            java.lang.String r3 = r9.l(r3)
            java.lang.String r4 = "emailDestination"
            java.lang.String r9 = r9.l(r4)
            dz1 r6 = r6.b
            pj7 r4 = new pj7
            java.lang.String r5 = ""
            if (r3 != 0) goto L57
            r3 = r5
        L57:
            if (r9 != 0) goto L5a
            r9 = r5
        L5a:
            r4.<init>(r10, r1, r3, r9)
            r7.I$0 = r8
            r7.label = r2
            java.lang.Object r6 = r6.a(r4, r7)
            if (r6 != r0) goto L68
            return r0
        L68:
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r6 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.Companion
            r7 = 2
            r9 = 0
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r6 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.a.d(r6, r8, r9, r7, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.xwords.hybrid.bridgecommands.SendEmailCommand.b(android.webkit.WebView, int, nc0, by0):java.lang.Object");
    }
}
