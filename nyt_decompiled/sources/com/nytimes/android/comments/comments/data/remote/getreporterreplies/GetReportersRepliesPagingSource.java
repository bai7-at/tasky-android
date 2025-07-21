package com.nytimes.android.comments.comments.data.remote.getreporterreplies;

import androidx.paging.PagingSource;
import androidx.paging.m;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.utils.TimeStampUtil;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class GetReportersRepliesPagingSource extends PagingSource {
    public static final int $stable = 8;
    private final String articleUrl;
    private final CommentsApi commentsApi;
    private final TimeStampUtil timeStampUtil;

    public GetReportersRepliesPagingSource(CommentsApi commentsApi, TimeStampUtil timeStampUtil, String str) {
        zq3.h(commentsApi, "commentsApi");
        zq3.h(timeStampUtil, "timeStampUtil");
        zq3.h(str, "articleUrl");
        this.commentsApi = commentsApi;
        this.timeStampUtil = timeStampUtil;
        this.articleUrl = str;
    }

    @Override // androidx.paging.PagingSource
    public boolean getKeyReuseSupported() {
        return true;
    }

    @Override // androidx.paging.PagingSource
    public Long getRefreshKey(m mVar) {
        zq3.h(mVar, TransferTable.COLUMN_STATE);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(androidx.paging.PagingSource.a r11, defpackage.by0<? super androidx.paging.PagingSource.b> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSource$load$1
            if (r0 == 0) goto L14
            r0 = r12
            com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSource$load$1 r0 = (com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSource$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSource$load$1 r0 = new com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSource$load$1
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r10 = r7.L$1
            r11 = r10
            androidx.paging.PagingSource$a r11 = (androidx.paging.PagingSource.a) r11
            java.lang.Object r10 = r7.L$0
            com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSource r10 = (com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSource) r10
            kotlin.f.b(r12)
            goto L5f
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            kotlin.f.b(r12)
            com.nytimes.android.comments.comments.data.remote.CommentsApi r1 = r10.commentsApi
            java.lang.String r4 = r10.articleUrl
            int r5 = r11.b()
            java.lang.Object r12 = r11.a()
            r6 = r12
            java.lang.Long r6 = (java.lang.Long) r6
            r7.L$0 = r10
            r7.L$1 = r11
            r7.label = r2
            r2 = 0
            r3 = 0
            r8 = 3
            r9 = 0
            java.lang.Object r12 = com.nytimes.android.comments.comments.data.remote.CommentsApi.DefaultImpls.getReporterReplies$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L5f
            return r0
        L5f:
            com.nytimes.android.coroutinesutils.FetchResult r12 = (com.nytimes.android.coroutinesutils.FetchResult) r12
            com.nytimes.android.utils.TimeStampUtil r10 = r10.timeStampUtil
            androidx.paging.PagingSource$b r10 = com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSourceKt.mapCatchingLoadResult(r12, r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSource.load(androidx.paging.PagingSource$a, by0):java.lang.Object");
    }
}
