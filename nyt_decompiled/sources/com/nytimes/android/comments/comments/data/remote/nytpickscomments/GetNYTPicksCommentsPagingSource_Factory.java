package com.nytimes.android.comments.comments.data.remote.nytpickscomments;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.utils.TimeStampUtil;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class GetNYTPicksCommentsPagingSource_Factory {
    private final p76 commentsApiProvider;
    private final p76 timeStampUtilProvider;

    public GetNYTPicksCommentsPagingSource_Factory(p76 p76Var, p76 p76Var2) {
        this.commentsApiProvider = p76Var;
        this.timeStampUtilProvider = p76Var2;
    }

    public static GetNYTPicksCommentsPagingSource_Factory create(p76 p76Var, p76 p76Var2) {
        return new GetNYTPicksCommentsPagingSource_Factory(p76Var, p76Var2);
    }

    public static GetNYTPicksCommentsPagingSource newInstance(CommentsApi commentsApi, TimeStampUtil timeStampUtil, String str) {
        return new GetNYTPicksCommentsPagingSource(commentsApi, timeStampUtil, str);
    }

    public GetNYTPicksCommentsPagingSource get(String str) {
        return newInstance((CommentsApi) this.commentsApiProvider.get(), (TimeStampUtil) this.timeStampUtilProvider.get(), str);
    }
}
