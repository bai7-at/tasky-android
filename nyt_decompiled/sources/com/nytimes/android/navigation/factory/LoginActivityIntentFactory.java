package com.nytimes.android.navigation.factory;

/* loaded from: classes4.dex */
public final class LoginActivityIntentFactory {
    public static final LoginActivityIntentFactory a = new LoginActivityIntentFactory();

    private LoginActivityIntentFactory() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.z58 r8, android.content.Context r9, java.lang.String r10, kotlinx.coroutines.CoroutineScope r11, defpackage.qs2 r12, defpackage.by0 r13) {
        /*
            boolean r0 = r13 instanceof com.nytimes.android.navigation.factory.LoginActivityIntentFactory$forLoginDeepLink$1
            if (r0 == 0) goto L14
            r0 = r13
            com.nytimes.android.navigation.factory.LoginActivityIntentFactory$forLoginDeepLink$1 r0 = (com.nytimes.android.navigation.factory.LoginActivityIntentFactory$forLoginDeepLink$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.nytimes.android.navigation.factory.LoginActivityIntentFactory$forLoginDeepLink$1 r0 = new com.nytimes.android.navigation.factory.LoginActivityIntentFactory$forLoginDeepLink$1
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r4.label
            r7 = 1
            if (r1 == 0) goto L46
            if (r1 != r7) goto L3e
            java.lang.Object r8 = r4.L$3
            r12 = r8
            qs2 r12 = (defpackage.qs2) r12
            java.lang.Object r8 = r4.L$2
            r11 = r8
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            java.lang.Object r8 = r4.L$1
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r4.L$0
            z58 r8 = (defpackage.z58) r8
            kotlin.f.b(r13)
            goto L5f
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L46:
            kotlin.f.b(r13)
            r4.L$0 = r8
            r4.L$1 = r10
            r4.L$2 = r11
            r4.L$3 = r12
            r4.label = r7
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            r2 = r9
            java.lang.Object r13 = s98.a.a(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5f
            return r0
        L5f:
            android.content.Intent r13 = (android.content.Intent) r13
            r9 = 268435456(0x10000000, float:2.524355E-29)
            r13.addFlags(r9)
            java.lang.String r9 = "ARTICLE_REFERRING_SOURCE"
            r13.putExtra(r9, r10)
            java.lang.String r9 = "com.nytimes.android.extra.DEEPLINK"
            r13.putExtra(r9, r7)
            boolean r9 = defpackage.yt6.b(r10)
            if (r9 == 0) goto L94
            kotlinx.coroutines.flow.Flow r8 = r8.w()
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r8)
            com.nytimes.android.navigation.factory.LoginActivityIntentFactory$forLoginDeepLink$2 r9 = new com.nytimes.android.navigation.factory.LoginActivityIntentFactory$forLoginDeepLink$2
            r10 = 0
            r9.<init>(r12, r10)
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.onEach(r8, r9)
            com.nytimes.android.navigation.factory.LoginActivityIntentFactory$forLoginDeepLink$3 r9 = new com.nytimes.android.navigation.factory.LoginActivityIntentFactory$forLoginDeepLink$3
            r9.<init>(r10)
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.m911catch(r8, r9)
            kotlinx.coroutines.flow.FlowKt.launchIn(r8, r11)
        L94:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.navigation.factory.LoginActivityIntentFactory.a(z58, android.content.Context, java.lang.String, kotlinx.coroutines.CoroutineScope, qs2, by0):java.lang.Object");
    }
}
