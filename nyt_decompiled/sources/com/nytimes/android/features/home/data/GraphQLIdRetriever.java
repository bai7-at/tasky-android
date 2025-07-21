package com.nytimes.android.features.home.data;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class GraphQLIdRetriever {
    private final FeedStore a;
    private final SharedPreferences b;
    private final Resources c;

    public GraphQLIdRetriever(FeedStore feedStore, SharedPreferences sharedPreferences, Resources resources) {
        zq3.h(feedStore, "feedStore");
        zq3.h(sharedPreferences, "prefs");
        zq3.h(resources, "resources");
        this.a = feedStore;
        this.b = sharedPreferences;
        this.c = resources;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.nytimes.android.coroutinesutils.ParallelDownloadStrategy r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.features.home.data.GraphQLIdRetriever$retrieveGraphQLId$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.features.home.data.GraphQLIdRetriever$retrieveGraphQLId$1 r0 = (com.nytimes.android.features.home.data.GraphQLIdRetriever$retrieveGraphQLId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.home.data.GraphQLIdRetriever$retrieveGraphQLId$1 r0 = new com.nytimes.android.features.home.data.GraphQLIdRetriever$retrieveGraphQLId$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r7)
            goto L72
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r7)
            android.content.SharedPreferences r7 = r5.b
            android.content.res.Resources r2 = r5.c
            int r4 = defpackage.tk6.use_custom_oneWebViewGraphQLId
            java.lang.String r2 = r2.getString(r4)
            r4 = 0
            boolean r7 = r7.getBoolean(r2, r4)
            if (r7 == 0) goto L62
            android.content.SharedPreferences r6 = r5.b
            android.content.res.Resources r7 = r5.c
            int r0 = defpackage.tk6.custom_oneWebViewGraphQLId
            java.lang.String r7 = r7.getString(r0)
            android.content.res.Resources r5 = r5.c
            int r0 = defpackage.tk6.default_custom_oneWebViewGraphQLId
            java.lang.String r5 = r5.getString(r0)
            java.lang.String r5 = r6.getString(r7, r5)
            defpackage.zq3.e(r5)
            defpackage.zq3.e(r5)
            goto L7c
        L62:
            com.nytimes.android.latestfeed.feed.FeedStore r5 = r5.a
            com.nytimes.android.coroutinesutils.ParallelDownloadStrategy r7 = com.nytimes.android.coroutinesutils.ParallelDownloadStrategy.FETCH_ALWAYS
            if (r6 != r7) goto L69
            r4 = r3
        L69:
            r0.label = r3
            java.lang.Object r7 = r5.c(r4, r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            com.nytimes.android.api.cms.LatestFeed r7 = (com.nytimes.android.api.cms.LatestFeed) r7
            com.nytimes.android.api.cms.ProgramMeta r5 = com.nytimes.android.api.cms.ProgramMetaKt.getHomeProgramMeta(r7)
            java.lang.String r5 = r5.getOneWebViewGraphQLId()
        L7c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.home.data.GraphQLIdRetriever.a(com.nytimes.android.coroutinesutils.ParallelDownloadStrategy, by0):java.lang.Object");
    }
}
