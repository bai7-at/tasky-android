package com.nytimes.android.subauth.core.util;

import com.squareup.moshi.i;
import defpackage.ul8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class NetworkUtils {
    public static final NetworkUtils a = new NetworkUtils();
    private static final i b;

    static {
        i d = new i.b().d();
        zq3.g(d, "build(...)");
        b = d;
    }

    private NetworkUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Class r5, defpackage.ss2 r6, defpackage.by0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.nytimes.android.subauth.core.util.NetworkUtils$attemptNetworkCall$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.subauth.core.util.NetworkUtils$attemptNetworkCall$1 r0 = (com.nytimes.android.subauth.core.util.NetworkUtils$attemptNetworkCall$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.util.NetworkUtils$attemptNetworkCall$1 r0 = new com.nytimes.android.subauth.core.util.NetworkUtils$attemptNetworkCall$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.L$0
            java.lang.Class r5 = (java.lang.Class) r5
            kotlin.f.b(r4)     // Catch: java.lang.Exception -> L2d retrofit2.HttpException -> L2f
            goto L72
        L2d:
            r4 = move-exception
            goto L47
        L2f:
            r4 = move-exception
            goto L58
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.f.b(r4)
            r0.L$0 = r5     // Catch: java.lang.Exception -> L2d retrofit2.HttpException -> L2f
            r0.label = r2     // Catch: java.lang.Exception -> L2d retrofit2.HttpException -> L2f
            java.lang.Object r4 = r6.invoke(r0)     // Catch: java.lang.Exception -> L2d retrofit2.HttpException -> L2f
            if (r4 != r7) goto L72
            return r7
        L47:
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r6 = "SUBAUTH"
            ul8$c r5 = r5.z(r6)
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "Exception in attemptNetworkCall"
            r5.f(r4, r7, r6)
            throw r4
        L58:
            retrofit2.Response r4 = r4.response()
            if (r4 == 0) goto L71
            okhttp3.ResponseBody r4 = r4.errorBody()
            if (r4 == 0) goto L71
            java.lang.String r4 = r4.string()
            if (r4 == 0) goto L71
            com.nytimes.android.subauth.core.util.NetworkUtils r6 = com.nytimes.android.subauth.core.util.NetworkUtils.a
            java.lang.Object r4 = r6.b(r5, r4)
            goto L72
        L71:
            r4 = 0
        L72:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.util.NetworkUtils.a(java.lang.Class, ss2, by0):java.lang.Object");
    }

    public final Object b(Class cls, String str) {
        zq3.h(cls, "responseType");
        zq3.h(str, "errorBody");
        if (str.length() == 0) {
            return null;
        }
        try {
            return b.c(cls).fromJson(str);
        } catch (Exception e) {
            ul8.a.z("SUBAUTH").b(e);
            return null;
        }
    }
}
