package com.nytimes.android.fragment.article.hybrid;

import defpackage.mc0;
import defpackage.n98;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class GetAllCookiesCommand extends mc0 {
    private final n98 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAllCookiesCommand(n98 n98Var) {
        super("getAllCookies");
        zq3.h(n98Var, "subAuthClient");
        this.b = n98Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.mc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.webkit.WebView r4, int r5, defpackage.nc0 r6, defpackage.by0 r7) {
        /*
            r3 = this;
            boolean r4 = r7 instanceof com.nytimes.android.fragment.article.hybrid.GetAllCookiesCommand$run$1
            if (r4 == 0) goto L13
            r4 = r7
            com.nytimes.android.fragment.article.hybrid.GetAllCookiesCommand$run$1 r4 = (com.nytimes.android.fragment.article.hybrid.GetAllCookiesCommand$run$1) r4
            int r6 = r4.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r4.label = r6
            goto L18
        L13:
            com.nytimes.android.fragment.article.hybrid.GetAllCookiesCommand$run$1 r4 = new com.nytimes.android.fragment.article.hybrid.GetAllCookiesCommand$run$1
            r4.<init>(r3, r7)
        L18:
            java.lang.Object r6 = r4.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.h()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            int r5 = r4.I$0
            kotlin.f.b(r6)
            goto L51
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            kotlin.f.b(r6)
            n98 r3 = r3.b
            java.lang.String r6 = "NYT-MPS"
            java.lang.String r0 = "nyt-a"
            java.lang.String r2 = "NYT-S"
            java.lang.String[] r6 = new java.lang.String[]{r2, r6, r0}
            java.util.List r6 = kotlin.collections.i.o(r6)
            r4.I$0 = r5
            r4.label = r1
            java.lang.Object r6 = r3.l(r6, r4)
            if (r6 != r7) goto L51
            return r7
        L51:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L60
            java.lang.String r3 = "cookies"
            kotlin.Pair r3 = defpackage.du8.a(r3, r6)
            java.util.Map r3 = kotlin.collections.t.f(r3)
            goto L61
        L60:
            r3 = 0
        L61:
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r4 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.Companion
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r3 = r4.c(r5, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.fragment.article.hybrid.GetAllCookiesCommand.b(android.webkit.WebView, int, nc0, by0):java.lang.Object");
    }
}
