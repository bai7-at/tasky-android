package com.nytimes.android.comments.comments.data.remote.getallcomments;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.utils.TimeStampUtil;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class GetAllCommentsPagingSource_Factory {
    private final p76 commentsApiProvider;
    private final p76 timeStampUtilProvider;

    public GetAllCommentsPagingSource_Factory(p76 p76Var, p76 p76Var2) {
        this.commentsApiProvider = p76Var;
        this.timeStampUtilProvider = p76Var2;
    }

    public static GetAllCommentsPagingSource_Factory create(p76 p76Var, p76 p76Var2) {
        return new GetAllCommentsPagingSource_Factory(p76Var, p76Var2);
    }

    public static GetAllCommentsPagingSource newInstance(CommentsApi commentsApi, TimeStampUtil timeStampUtil, String str, String str2) {
        return new GetAllCommentsPagingSource(commentsApi, timeStampUtil, str, str2);
    }

    public GetAllCommentsPagingSource get(String str, String str2) {
        return newInstance((CommentsApi) this.commentsApiProvider.get(), (TimeStampUtil) this.timeStampUtilProvider.get(), str, str2);
    }
}
