package com.nytimes.android.readerhybrid;

import defpackage.ab6;
import defpackage.z58;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class HybridUserInfoBuilder {
    private final ab6 a;
    private final z58 b;

    public HybridUserInfoBuilder(ab6 ab6Var, z58 z58Var) {
        zq3.h(ab6Var, "pushRegIdProvider");
        zq3.h(z58Var, "subauthClient");
        this.a = ab6Var;
        this.b = z58Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(2:14|15)(1:17)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        com.nytimes.android.logging.NYTLogger.h(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.by0 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.nytimes.android.readerhybrid.HybridUserInfoBuilder$buildUserInfo$1
            if (r0 == 0) goto L13
            r0 = r13
            com.nytimes.android.readerhybrid.HybridUserInfoBuilder$buildUserInfo$1 r0 = (com.nytimes.android.readerhybrid.HybridUserInfoBuilder$buildUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.readerhybrid.HybridUserInfoBuilder$buildUserInfo$1 r0 = new com.nytimes.android.readerhybrid.HybridUserInfoBuilder$buildUserInfo$1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.f.b(r13)     // Catch: java.lang.Throwable -> L2a
            goto L47
        L2a:
            r12 = move-exception
            goto L4b
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            kotlin.f.b(r13)
            com.nytimes.android.readerhybrid.HybridUserInfoBuilder$buildUserInfo$2 r13 = new com.nytimes.android.readerhybrid.HybridUserInfoBuilder$buildUserInfo$2     // Catch: java.lang.Throwable -> L2a
            r13.<init>(r12, r3)     // Catch: java.lang.Throwable -> L2a
            r0.label = r4     // Catch: java.lang.Throwable -> L2a
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r13 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r4, r13, r0)     // Catch: java.lang.Throwable -> L2a
            if (r13 != r1) goto L47
            return r1
        L47:
            com.nytimes.android.hybrid.HybridUserInfo r13 = (com.nytimes.android.hybrid.HybridUserInfo) r13     // Catch: java.lang.Throwable -> L2a
            r3 = r13
            goto L4e
        L4b:
            com.nytimes.android.logging.NYTLogger.h(r12)
        L4e:
            if (r3 != 0) goto L5e
            com.nytimes.android.hybrid.HybridUserInfo r3 = new com.nytimes.android.hybrid.HybridUserInfo
            r10 = 24
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.readerhybrid.HybridUserInfoBuilder.c(by0):java.lang.Object");
    }
}
