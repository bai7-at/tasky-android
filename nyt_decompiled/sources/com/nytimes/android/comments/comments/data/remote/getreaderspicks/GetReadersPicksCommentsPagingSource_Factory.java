package com.nytimes.android.comments.comments.data.remote.getreaderspicks;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.utils.TimeStampUtil;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class GetReadersPicksCommentsPagingSource_Factory {
    private final p76 commentsApiProvider;
    private final p76 timeStampUtilProvider;

    public GetReadersPicksCommentsPagingSource_Factory(p76 p76Var, p76 p76Var2) {
        this.commentsApiProvider = p76Var;
        this.timeStampUtilProvider = p76Var2;
    }

    public static GetReadersPicksCommentsPagingSource_Factory create(p76 p76Var, p76 p76Var2) {
        return new GetReadersPicksCommentsPagingSource_Factory(p76Var, p76Var2);
    }

    public static GetReadersPicksCommentsPagingSource newInstance(CommentsApi commentsApi, TimeStampUtil timeStampUtil, String str) {
        return new GetReadersPicksCommentsPagingSource(commentsApi, timeStampUtil, str);
    }

    public GetReadersPicksCommentsPagingSource get(String str) {
        return newInstance((CommentsApi) this.commentsApiProvider.get(), (TimeStampUtil) this.timeStampUtilProvider.get(), str);
    }
}
