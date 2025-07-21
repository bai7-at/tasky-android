package com.nytimes.android.comments.comments.data.store;

import com.nytimes.android.comments.comments.data.remote.getcommentssummary.GetCommentsSummaryDataSource;
import defpackage.ba2;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class CommentsStore_Factory implements ba2 {
    private final p76 commentsSummaryDataSourceProvider;

    public CommentsStore_Factory(p76 p76Var) {
        this.commentsSummaryDataSourceProvider = p76Var;
    }

    public static CommentsStore_Factory create(p76 p76Var) {
        return new CommentsStore_Factory(p76Var);
    }

    public static CommentsStore newInstance(GetCommentsSummaryDataSource getCommentsSummaryDataSource) {
        return new CommentsStore(getCommentsSummaryDataSource);
    }

    @Override // defpackage.p76
    public CommentsStore get() {
        return newInstance((GetCommentsSummaryDataSource) this.commentsSummaryDataSourceProvider.get());
    }
}
