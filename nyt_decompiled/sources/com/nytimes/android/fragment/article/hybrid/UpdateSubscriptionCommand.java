package com.nytimes.android.fragment.article.hybrid;

import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.AbraVariant;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.push.PushClientManager;
import defpackage.by0;
import defpackage.du8;
import defpackage.e52;
import defpackage.mc0;
import defpackage.u32;
import defpackage.ue4;
import defpackage.zq3;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes4.dex */
public final class UpdateSubscriptionCommand extends mc0 {
    private final PushClientManager b;
    private final ET2Scope c;
    private final AbraManager d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateSubscriptionCommand(PushClientManager pushClientManager, ET2Scope eT2Scope, AbraManager abraManager) {
        super("updateSubscription");
        zq3.h(pushClientManager, "pushClientManager");
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(abraManager, "abraManager");
        this.b = pushClientManager;
        this.c = eT2Scope;
        this.d = abraManager;
    }

    private final void c(Map map, boolean z) {
        String str = (String) map.get("tag");
        String str2 = (String) map.get("region");
        String str3 = (String) map.get("product");
        AbraVariant testType = this.d.getTestType("APP_push_columns");
        zq3.f(testType, "null cannot be cast to non-null type com.nytimes.android.abra.AbraVariant");
        ET2PageScope.DefaultImpls.a(this.c, new e52.e(), new ue4(du8.a("region", str2), du8.a("context", "push_columns_signup"), du8.a("label", testType.getVariantName()), du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, "APP_push_columns"), du8.a("product", str3), du8.a("product_name", str), du8.a("signup_action", d(z))), new u32(null, AssetConstants.ARTICLE_TYPE, "sign-up", 1, null), null, 8, null);
    }

    private final String d(boolean z) {
        if (z) {
            return "opt_in";
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return "opt_out";
    }

    private final Object e(String str, by0 by0Var) {
        boolean i = this.b.i(str);
        if (i) {
            Object g = this.b.g(b0.d(str), by0Var);
            return g == a.h() ? g : (Set) g;
        }
        if (i) {
            throw new NoWhenBranchMatchedException();
        }
        Object f = this.b.f(b0.d(str), by0Var);
        return f == a.h() ? f : (Set) f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007a A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:11:0x0033, B:12:0x0075, B:14:0x007a, B:15:0x007e, B:22:0x0044), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.mc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.webkit.WebView r5, int r6, defpackage.nc0 r7, defpackage.by0 r8) {
        /*
            r4 = this;
            boolean r5 = r8 instanceof com.nytimes.android.fragment.article.hybrid.UpdateSubscriptionCommand$run$1
            if (r5 == 0) goto L13
            r5 = r8
            com.nytimes.android.fragment.article.hybrid.UpdateSubscriptionCommand$run$1 r5 = (com.nytimes.android.fragment.article.hybrid.UpdateSubscriptionCommand$run$1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.label = r0
            goto L18
        L13:
            com.nytimes.android.fragment.article.hybrid.UpdateSubscriptionCommand$run$1 r5 = new com.nytimes.android.fragment.article.hybrid.UpdateSubscriptionCommand$run$1
            r5.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r5.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 != r2) goto L39
            int r6 = r5.I$0
            java.lang.Object r4 = r5.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r5.L$1
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r5 = r5.L$0
            com.nytimes.android.fragment.article.hybrid.UpdateSubscriptionCommand r5 = (com.nytimes.android.fragment.article.hybrid.UpdateSubscriptionCommand) r5
            kotlin.f.b(r8)     // Catch: java.lang.Exception -> L37
            goto L75
        L37:
            r4 = move-exception
            goto L96
        L39:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L41:
            kotlin.f.b(r8)
            java.util.Map r7 = r7.f()     // Catch: java.lang.Exception -> L37
            java.lang.String r8 = "data"
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Exception -> L37
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"
            defpackage.zq3.f(r7, r8)     // Catch: java.lang.Exception -> L37
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Exception -> L37
            java.lang.String r8 = "tag"
            java.lang.Object r8 = r7.get(r8)     // Catch: java.lang.Exception -> L37
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L37
            defpackage.zq3.e(r8)     // Catch: java.lang.Exception -> L37
            r5.L$0 = r4     // Catch: java.lang.Exception -> L37
            r5.L$1 = r7     // Catch: java.lang.Exception -> L37
            r5.L$2 = r8     // Catch: java.lang.Exception -> L37
            r5.I$0 = r6     // Catch: java.lang.Exception -> L37
            r5.label = r2     // Catch: java.lang.Exception -> L37
            java.lang.Object r5 = r4.e(r8, r5)     // Catch: java.lang.Exception -> L37
            if (r5 != r0) goto L71
            return r0
        L71:
            r3 = r5
            r5 = r4
            r4 = r8
            r8 = r3
        L75:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Exception -> L37
            r0 = 0
            if (r8 == 0) goto L7e
            boolean r0 = r8.contains(r4)     // Catch: java.lang.Exception -> L37
        L7e:
            r5.c(r7, r0)     // Catch: java.lang.Exception -> L37
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r4 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.Companion     // Catch: java.lang.Exception -> L37
            java.lang.String r5 = "subscribed"
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L37
            kotlin.Pair r5 = defpackage.du8.a(r5, r7)     // Catch: java.lang.Exception -> L37
            java.util.Map r5 = kotlin.collections.t.f(r5)     // Catch: java.lang.Exception -> L37
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r4 = r4.c(r6, r5)     // Catch: java.lang.Exception -> L37
            goto Lab
        L96:
            com.nytimes.android.logging.NYTLogger.h(r4)
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r5 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.Companion
            java.lang.String r7 = r4.getMessage()
            java.lang.StackTraceElement[] r4 = r4.getStackTrace()
            java.lang.String r4 = r4.toString()
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r4 = r5.a(r6, r7, r4)
        Lab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.fragment.article.hybrid.UpdateSubscriptionCommand.b(android.webkit.WebView, int, nc0, by0):java.lang.Object");
    }
}
