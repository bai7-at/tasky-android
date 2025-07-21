package com.nytimes.android.comments.comments.data.repository;

import com.nytimes.android.comments.comments.data.remote.flagcomment.FlagCommentDataSource;
import com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSourceFactory;
import com.nytimes.android.comments.comments.data.remote.getcommentbypermid.GetCommentThreadDataSource;
import com.nytimes.android.comments.comments.data.remote.getcommentssummary.GetCommentsSummaryDataSource;
import com.nytimes.android.comments.comments.data.remote.getreaderspicks.GetReadersPicksCommentsPagingSourceFactory;
import com.nytimes.android.comments.comments.data.remote.getreplies.GetRepliesDataSource;
import com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSourceFactory;
import com.nytimes.android.comments.comments.data.remote.nytpickscomments.GetNYTPicksCommentsPagingSourceFactory;
import com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentDataSource;
import com.nytimes.android.comments.writenewcomment.data.remote.getuser.GetCurrentUserRemoteDataSource;
import defpackage.ba2;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class CommentsRepository_Factory implements ba2 {
    private final p76 allCommentsPagingSourceFactoryProvider;
    private final p76 flagCommentDataSourceProvider;
    private final p76 getCommentThreadDataSourceProvider;
    private final p76 getCommentsSummaryDataSourceProvider;
    private final p76 getCurrentUserRemoteDataSourceProvider;
    private final p76 getRepliesDataSourceProvider;
    private final p76 nytPicksCommentsPagingSourceFactoryProvider;
    private final p76 readersPicksCommentsPagingSourceFactoryProvider;
    private final p76 recommendCommentDataSourceProvider;
    private final p76 reportersRepliesPagingSourceFactoryProvider;

    public CommentsRepository_Factory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8, p76 p76Var9, p76 p76Var10) {
        this.allCommentsPagingSourceFactoryProvider = p76Var;
        this.readersPicksCommentsPagingSourceFactoryProvider = p76Var2;
        this.reportersRepliesPagingSourceFactoryProvider = p76Var3;
        this.nytPicksCommentsPagingSourceFactoryProvider = p76Var4;
        this.getCommentsSummaryDataSourceProvider = p76Var5;
        this.getCurrentUserRemoteDataSourceProvider = p76Var6;
        this.flagCommentDataSourceProvider = p76Var7;
        this.recommendCommentDataSourceProvider = p76Var8;
        this.getRepliesDataSourceProvider = p76Var9;
        this.getCommentThreadDataSourceProvider = p76Var10;
    }

    public static CommentsRepository_Factory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8, p76 p76Var9, p76 p76Var10) {
        return new CommentsRepository_Factory(p76Var, p76Var2, p76Var3, p76Var4, p76Var5, p76Var6, p76Var7, p76Var8, p76Var9, p76Var10);
    }

    public static CommentsRepository newInstance(GetAllCommentsPagingSourceFactory getAllCommentsPagingSourceFactory, GetReadersPicksCommentsPagingSourceFactory getReadersPicksCommentsPagingSourceFactory, GetReportersRepliesPagingSourceFactory getReportersRepliesPagingSourceFactory, GetNYTPicksCommentsPagingSourceFactory getNYTPicksCommentsPagingSourceFactory, GetCommentsSummaryDataSource getCommentsSummaryDataSource, GetCurrentUserRemoteDataSource getCurrentUserRemoteDataSource, FlagCommentDataSource flagCommentDataSource, RecommendCommentDataSource recommendCommentDataSource, GetRepliesDataSource getRepliesDataSource, GetCommentThreadDataSource getCommentThreadDataSource) {
        return new CommentsRepository(getAllCommentsPagingSourceFactory, getReadersPicksCommentsPagingSourceFactory, getReportersRepliesPagingSourceFactory, getNYTPicksCommentsPagingSourceFactory, getCommentsSummaryDataSource, getCurrentUserRemoteDataSource, flagCommentDataSource, recommendCommentDataSource, getRepliesDataSource, getCommentThreadDataSource);
    }

    @Override // defpackage.p76
    public CommentsRepository get() {
        return newInstance((GetAllCommentsPagingSourceFactory) this.allCommentsPagingSourceFactoryProvider.get(), (GetReadersPicksCommentsPagingSourceFactory) this.readersPicksCommentsPagingSourceFactoryProvider.get(), (GetReportersRepliesPagingSourceFactory) this.reportersRepliesPagingSourceFactoryProvider.get(), (GetNYTPicksCommentsPagingSourceFactory) this.nytPicksCommentsPagingSourceFactoryProvider.get(), (GetCommentsSummaryDataSource) this.getCommentsSummaryDataSourceProvider.get(), (GetCurrentUserRemoteDataSource) this.getCurrentUserRemoteDataSourceProvider.get(), (FlagCommentDataSource) this.flagCommentDataSourceProvider.get(), (RecommendCommentDataSource) this.recommendCommentDataSourceProvider.get(), (GetRepliesDataSource) this.getRepliesDataSourceProvider.get(), (GetCommentThreadDataSource) this.getCommentThreadDataSourceProvider.get());
    }
}
