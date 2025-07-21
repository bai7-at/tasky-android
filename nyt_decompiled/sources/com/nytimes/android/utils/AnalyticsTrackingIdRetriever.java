package com.nytimes.android.utils;

import android.app.Application;
import defpackage.by0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class AnalyticsTrackingIdRetriever {
    public static final AnalyticsTrackingIdRetriever a = new AnalyticsTrackingIdRetriever();

    private AnalyticsTrackingIdRetriever() {
    }

    public final Object a(Application application, by0 by0Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnalyticsTrackingIdRetriever$analyticsDoNotTrack$2(application, null), by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.app.Application r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.utils.AnalyticsTrackingIdRetriever$analyticsTrackingId$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.utils.AnalyticsTrackingIdRetriever$analyticsTrackingId$1 r0 = (com.nytimes.android.utils.AnalyticsTrackingIdRetriever$analyticsTrackingId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.utils.AnalyticsTrackingIdRetriever$analyticsTrackingId$1 r0 = new com.nytimes.android.utils.AnalyticsTrackingIdRetriever$analyticsTrackingId$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            kotlin.f.b(r5)
            goto L6c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            java.lang.Object r6 = r0.L$0
            android.app.Application r6 = (android.app.Application) r6
            kotlin.f.b(r5)
            goto L54
        L3d:
            kotlin.f.b(r5)
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getIO()
            com.nytimes.android.utils.AnalyticsTrackingIdRetriever$analyticsTrackingId$trackingId$1 r1 = new com.nytimes.android.utils.AnalyticsTrackingIdRetriever$analyticsTrackingId$trackingId$1
            r1.<init>(r6, r4)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.BuildersKt.withContext(r5, r1, r0)
            if (r5 != r7) goto L54
            return r7
        L54:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L87
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getIO()
            com.nytimes.android.utils.AnalyticsTrackingIdRetriever$analyticsTrackingId$2 r1 = new com.nytimes.android.utils.AnalyticsTrackingIdRetriever$analyticsTrackingId$2
            r1.<init>(r6, r4)
            r0.L$0 = r4
            r0.label = r2
            java.lang.Object r5 = kotlinx.coroutines.BuildersKt.withContext(r5, r1, r0)
            if (r5 != r7) goto L6c
            return r7
        L6c:
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L77
            int r7 = r6.length()
            if (r7 != 0) goto L81
        L77:
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r0 = "Tracking ID is null or empty"
            r7.<init>(r0)
            com.nytimes.android.logging.NYTLogger.s(r7)
        L81:
            java.lang.String r7 = "also(...)"
            defpackage.zq3.g(r5, r7)
            r5 = r6
        L87:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.utils.AnalyticsTrackingIdRetriever.b(android.app.Application, by0):java.lang.Object");
    }
}
