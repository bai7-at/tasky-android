package com.nytimes.android.coroutinesutils;

import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.ss2;
import defpackage.zq3;
import java.net.UnknownHostException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class FetchResultKt {
    public static final String a(FetchResult.b.a aVar, String str) {
        zq3.h(aVar, "<this>");
        zq3.h(str, "noNetworkErrorMessage");
        if (b(aVar.b())) {
            return str;
        }
        String message = aVar.b().getMessage();
        return message == null ? "" : message;
    }

    public static final boolean b(Throwable th) {
        zq3.h(th, "<this>");
        if (th instanceof UnknownHostException) {
            return true;
        }
        String message = th.getMessage();
        return message != null && h.N(message, "Unable to resolve host", true);
    }

    public static final FetchResult c(FetchResult fetchResult, ss2 ss2Var) {
        zq3.h(fetchResult, "<this>");
        zq3.h(ss2Var, "transform");
        if (fetchResult instanceof FetchResult.b.C0251b) {
            FetchResult.a aVar = FetchResult.Companion;
            try {
                return new FetchResult.b.C0251b(ss2Var.invoke(((FetchResult.b.C0251b) fetchResult).b()));
            } catch (Exception e) {
                return new FetchResult.b.a(e);
            }
        }
        if (fetchResult instanceof FetchResult.b.a) {
            return new FetchResult.b.a(((FetchResult.b.a) fetchResult).b());
        }
        if (fetchResult instanceof FetchResult.c) {
            return new FetchResult.c();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.nytimes.android.coroutinesutils.FetchResult r4, defpackage.gt2 r5, defpackage.by0 r6) {
        /*
            boolean r0 = r6 instanceof com.nytimes.android.coroutinesutils.FetchResultKt$onError$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.coroutinesutils.FetchResultKt$onError$1 r0 = (com.nytimes.android.coroutinesutils.FetchResultKt$onError$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.coroutinesutils.FetchResultKt$onError$1 r0 = new com.nytimes.android.coroutinesutils.FetchResultKt$onError$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.coroutinesutils.FetchResult r4 = (com.nytimes.android.coroutinesutils.FetchResult) r4
            kotlin.f.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            boolean r6 = r4 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.a
            if (r6 == 0) goto L4e
            r6 = r4
            com.nytimes.android.coroutinesutils.FetchResult$b$a r6 = (com.nytimes.android.coroutinesutils.FetchResult.b.a) r6
            java.lang.Throwable r6 = r6.b()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.invoke(r6, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.FetchResultKt.d(com.nytimes.android.coroutinesutils.FetchResult, gt2, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.nytimes.android.coroutinesutils.FetchResult r4, defpackage.gt2 r5, defpackage.by0 r6) {
        /*
            boolean r0 = r6 instanceof com.nytimes.android.coroutinesutils.FetchResultKt$onSuccess$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.coroutinesutils.FetchResultKt$onSuccess$1 r0 = (com.nytimes.android.coroutinesutils.FetchResultKt$onSuccess$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.coroutinesutils.FetchResultKt$onSuccess$1 r0 = new com.nytimes.android.coroutinesutils.FetchResultKt$onSuccess$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.coroutinesutils.FetchResult r4 = (com.nytimes.android.coroutinesutils.FetchResult) r4
            kotlin.f.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            boolean r6 = r4 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.C0251b
            if (r6 == 0) goto L4e
            r6 = r4
            com.nytimes.android.coroutinesutils.FetchResult$b$b r6 = (com.nytimes.android.coroutinesutils.FetchResult.b.C0251b) r6
            java.lang.Object r6 = r6.b()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.invoke(r6, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.FetchResultKt.e(com.nytimes.android.coroutinesutils.FetchResult, gt2, by0):java.lang.Object");
    }
}
