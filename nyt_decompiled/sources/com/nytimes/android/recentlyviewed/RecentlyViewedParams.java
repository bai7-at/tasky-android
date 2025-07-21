package com.nytimes.android.recentlyviewed;

import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.qq3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class RecentlyViewedParams {
    public static final a Companion = new a(null);
    private final FeedStore a;
    private final qq3 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public RecentlyViewedParams(FeedStore feedStore, qq3 qq3Var) {
        zq3.h(feedStore, "feedStore");
        zq3.h(qq3Var, "internalPreferences");
        this.a = feedStore;
        this.b = qq3Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|(1:15)|17|18))|28|6|7|(0)(0)|11|(2:13|15)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        com.nytimes.android.logging.NYTLogger.i(r6, "Failed to get history count. Returning default value", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.nytimes.android.recentlyviewed.RecentlyViewedParams$historyCount$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.recentlyviewed.RecentlyViewedParams$historyCount$1 r0 = (com.nytimes.android.recentlyviewed.RecentlyViewedParams$historyCount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.recentlyviewed.RecentlyViewedParams$historyCount$1 r0 = new com.nytimes.android.recentlyviewed.RecentlyViewedParams$historyCount$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L2c
            goto L45
        L2c:
            r6 = move-exception
            goto L58
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.f.b(r7)
            com.nytimes.android.latestfeed.feed.FeedStore r6 = r6.a     // Catch: java.lang.Exception -> L2c
            r0.label = r5     // Catch: java.lang.Exception -> L2c
            r7 = 0
            java.lang.Object r7 = com.nytimes.android.latestfeed.feed.FeedStore.d(r6, r4, r0, r5, r7)     // Catch: java.lang.Exception -> L2c
            if (r7 != r1) goto L45
            return r1
        L45:
            com.nytimes.android.api.cms.LatestFeed r7 = (com.nytimes.android.api.cms.LatestFeed) r7     // Catch: java.lang.Exception -> L2c
            com.nytimes.android.api.cms.RecentlyViewed r6 = r7.getRecentlyViewed()     // Catch: java.lang.Exception -> L2c
            if (r6 == 0) goto L5f
            java.lang.Integer r6 = r6.getHistoryCount()     // Catch: java.lang.Exception -> L2c
            if (r6 == 0) goto L5f
            int r3 = r6.intValue()     // Catch: java.lang.Exception -> L2c
            goto L5f
        L58:
            java.lang.String r7 = "Failed to get history count. Returning default value"
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.nytimes.android.logging.NYTLogger.i(r6, r7, r0)
        L5f:
            java.lang.Integer r6 = defpackage.cc0.c(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.recentlyviewed.RecentlyViewedParams.a(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.recentlyviewed.RecentlyViewedParams$showCount$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.recentlyviewed.RecentlyViewedParams$showCount$1 r0 = (com.nytimes.android.recentlyviewed.RecentlyViewedParams$showCount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.recentlyviewed.RecentlyViewedParams$showCount$1 r0 = new com.nytimes.android.recentlyviewed.RecentlyViewedParams$showCount$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.recentlyviewed.RecentlyViewedParams r5 = (com.nytimes.android.recentlyviewed.RecentlyViewedParams) r5
            kotlin.f.b(r6)
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            qq3 r6 = r5.b
            boolean r6 = r6.c()
            if (r6 == 0) goto L47
            qq3 r5 = r5.b
            int r5 = r5.b()
            goto L6f
        L47:
            com.nytimes.android.latestfeed.feed.FeedStore r6 = r5.a
            r0.L$0 = r5
            r0.label = r3
            r2 = 0
            r4 = 0
            java.lang.Object r6 = com.nytimes.android.latestfeed.feed.FeedStore.d(r6, r2, r0, r3, r4)
            if (r6 != r1) goto L56
            return r1
        L56:
            com.nytimes.android.api.cms.LatestFeed r6 = (com.nytimes.android.api.cms.LatestFeed) r6
            com.nytimes.android.api.cms.RecentlyViewed r6 = r6.getRecentlyViewed()
            if (r6 == 0) goto L69
            java.lang.Integer r6 = r6.getShowCount()
            if (r6 == 0) goto L69
            int r5 = r6.intValue()
            goto L6f
        L69:
            qq3 r5 = r5.b
            int r5 = r5.b()
        L6f:
            java.lang.Integer r5 = defpackage.cc0.c(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.recentlyviewed.RecentlyViewedParams.b(by0):java.lang.Object");
    }
}
