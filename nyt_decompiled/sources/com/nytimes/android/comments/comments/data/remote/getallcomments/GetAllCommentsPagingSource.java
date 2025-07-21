package com.nytimes.android.comments.comments.data.remote.getallcomments;

import androidx.paging.PagingSource;
import androidx.paging.m;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.utils.TimeStampUtil;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class GetAllCommentsPagingSource extends PagingSource {
    public static final int $stable = 8;
    private final String articleUrl;
    private final CommentsApi commentsApi;
    private final String sortOrder;
    private final TimeStampUtil timeStampUtil;

    public GetAllCommentsPagingSource(CommentsApi commentsApi, TimeStampUtil timeStampUtil, String str, String str2) {
        zq3.h(commentsApi, "commentsApi");
        zq3.h(timeStampUtil, "timeStampUtil");
        zq3.h(str, "articleUrl");
        zq3.h(str2, "sortOrder");
        this.commentsApi = commentsApi;
        this.timeStampUtil = timeStampUtil;
        this.articleUrl = str;
        this.sortOrder = str2;
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
    public java.lang.Object load(androidx.paging.PagingSource.a r12, defpackage.by0<? super androidx.paging.PagingSource.b> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSource$load$1
            if (r0 == 0) goto L14
            r0 = r13
            com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSource$load$1 r0 = (com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSource$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSource$load$1 r0 = new com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSource$load$1
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r8.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r11 = r8.L$1
            r12 = r11
            androidx.paging.PagingSource$a r12 = (androidx.paging.PagingSource.a) r12
            java.lang.Object r11 = r8.L$0
            com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSource r11 = (com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSource) r11
            kotlin.f.b(r13)
            goto L61
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            kotlin.f.b(r13)
            com.nytimes.android.comments.comments.data.remote.CommentsApi r1 = r11.commentsApi
            java.lang.String r4 = r11.articleUrl
            int r5 = r12.b()
            java.lang.String r6 = r11.sortOrder
            java.lang.Object r13 = r12.a()
            r7 = r13
            java.lang.Long r7 = (java.lang.Long) r7
            r8.L$0 = r11
            r8.L$1 = r12
            r8.label = r2
            r2 = 0
            r3 = 0
            r9 = 3
            r10 = 0
            java.lang.Object r13 = com.nytimes.android.comments.comments.data.remote.CommentsApi.DefaultImpls.getAllComments$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r13 != r0) goto L61
            return r0
        L61:
            com.nytimes.android.coroutinesutils.FetchResult r13 = (com.nytimes.android.coroutinesutils.FetchResult) r13
            com.nytimes.android.utils.TimeStampUtil r11 = r11.timeStampUtil
            androidx.paging.PagingSource$b r11 = com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSourceKt.mapCatchingLoadResult(r13, r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSource.load(androidx.paging.PagingSource$a, by0):java.lang.Object");
    }
}
