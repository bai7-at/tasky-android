package com.nytimes.android.fragment.article.hybrid;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.readerhybrid.HybridConfigBuilder;
import defpackage.bc3;
import defpackage.mc0;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class HybridConfigCommand extends mc0 {
    private final ET2Scope b;
    private final HybridConfigBuilder c;
    private final bc3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HybridConfigCommand(ET2Scope eT2Scope, HybridConfigBuilder hybridConfigBuilder, bc3 bc3Var) {
        super("hybridConfig");
        zq3.h(eT2Scope, "eT2Scope");
        zq3.h(hybridConfigBuilder, "hybridConfigBuilder");
        zq3.h(bc3Var, "hybridConfigInstaller");
        this.b = eT2Scope;
        this.c = hybridConfigBuilder;
        this.d = bc3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.mc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.webkit.WebView r3, int r4, defpackage.nc0 r5, defpackage.by0 r6) {
        /*
            r2 = this;
            boolean r3 = r6 instanceof com.nytimes.android.fragment.article.hybrid.HybridConfigCommand$run$1
            if (r3 == 0) goto L13
            r3 = r6
            com.nytimes.android.fragment.article.hybrid.HybridConfigCommand$run$1 r3 = (com.nytimes.android.fragment.article.hybrid.HybridConfigCommand$run$1) r3
            int r5 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r3.label = r5
            goto L18
        L13:
            com.nytimes.android.fragment.article.hybrid.HybridConfigCommand$run$1 r3 = new com.nytimes.android.fragment.article.hybrid.HybridConfigCommand$run$1
            r3.<init>(r2, r6)
        L18:
            java.lang.Object r5 = r3.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.h()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L2f
            int r4 = r3.I$0
            java.lang.Object r2 = r3.L$0
            com.nytimes.android.fragment.article.hybrid.HybridConfigCommand r2 = (com.nytimes.android.fragment.article.hybrid.HybridConfigCommand) r2
            kotlin.f.b(r5)
            goto L60
        L2f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L37:
            kotlin.f.b(r5)
            com.nytimes.android.readerhybrid.HybridConfigBuilder r5 = r2.c
            com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope r0 = r2.b
            tx1 r0 = r0.c()
            if (r0 == 0) goto L50
            com.nytimes.android.eventtracker.context.PageContext r0 = r0.i()
            if (r0 == 0) goto L50
            java.lang.String r0 = r0.g()
            if (r0 != 0) goto L52
        L50:
            java.lang.String r0 = ""
        L52:
            r3.L$0 = r2
            r3.I$0 = r4
            r3.label = r1
            r1 = 0
            java.lang.Object r5 = r5.b(r0, r1, r3)
            if (r5 != r6) goto L60
            return r6
        L60:
            com.nytimes.android.hybrid.HybridConfig r5 = (com.nytimes.android.hybrid.HybridConfig) r5
            bc3 r2 = r2.d
            java.lang.String r2 = r2.b(r5)
            java.lang.String r3 = "config"
            kotlin.Pair r2 = defpackage.du8.a(r3, r2)
            java.util.Map r2 = kotlin.collections.t.f(r2)
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r3 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.Companion
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r2 = r3.c(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.fragment.article.hybrid.HybridConfigCommand.b(android.webkit.WebView, int, nc0, by0):java.lang.Object");
    }
}
