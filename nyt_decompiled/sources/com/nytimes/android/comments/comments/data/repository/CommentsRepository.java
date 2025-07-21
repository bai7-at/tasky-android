package com.nytimes.android.comments.comments.data.repository;

import androidx.paging.Pager;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.nytimes.android.comments.comments.data.remote.flagcomment.FlagCommentDataSource;
import com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSource;
import com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSourceFactory;
import com.nytimes.android.comments.comments.data.remote.getcommentbypermid.CommentThreadResult;
import com.nytimes.android.comments.comments.data.remote.getcommentbypermid.GetCommentThreadDataSource;
import com.nytimes.android.comments.comments.data.remote.getcommentssummary.CommentsSummary;
import com.nytimes.android.comments.comments.data.remote.getcommentssummary.GetCommentsSummaryDataSource;
import com.nytimes.android.comments.comments.data.remote.getreaderspicks.GetReadersPicksCommentsPagingSource;
import com.nytimes.android.comments.comments.data.remote.getreaderspicks.GetReadersPicksCommentsPagingSourceFactory;
import com.nytimes.android.comments.comments.data.remote.getreplies.GetRepliesDataSource;
import com.nytimes.android.comments.comments.data.remote.getreplies.RepliesResult;
import com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSource;
import com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSourceFactory;
import com.nytimes.android.comments.comments.data.remote.nytpickscomments.GetNYTPicksCommentsPagingSource;
import com.nytimes.android.comments.comments.data.remote.nytpickscomments.GetNYTPicksCommentsPagingSourceFactory;
import com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentDataSource;
import com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentResult;
import com.nytimes.android.comments.writenewcomment.data.remote.getuser.GetCurrentUserRemoteDataSource;
import com.nytimes.android.comments.writenewcomment.data.remote.getuser.User;
import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.by0;
import defpackage.qs2;
import defpackage.xn5;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class CommentsRepository {
    public static final int $stable = 8;
    private GetAllCommentsPagingSource allCommentsPagingSource;
    private final GetAllCommentsPagingSourceFactory allCommentsPagingSourceFactory;
    private final FlagCommentDataSource flagCommentDataSource;
    private final GetCommentThreadDataSource getCommentThreadDataSource;
    private final GetCommentsSummaryDataSource getCommentsSummaryDataSource;
    private final GetCurrentUserRemoteDataSource getCurrentUserRemoteDataSource;
    private final GetRepliesDataSource getRepliesDataSource;
    private GetNYTPicksCommentsPagingSource nytPicksCommentsPagingSource;
    private final GetNYTPicksCommentsPagingSourceFactory nytPicksCommentsPagingSourceFactory;
    private GetReadersPicksCommentsPagingSource readersPicksCommentsPagingSource;
    private final GetReadersPicksCommentsPagingSourceFactory readersPicksCommentsPagingSourceFactory;
    private final RecommendCommentDataSource recommendCommentDataSource;
    private GetReportersRepliesPagingSource reportersRepliesPagingSource;
    private final GetReportersRepliesPagingSourceFactory reportersRepliesPagingSourceFactory;

    public CommentsRepository(GetAllCommentsPagingSourceFactory getAllCommentsPagingSourceFactory, GetReadersPicksCommentsPagingSourceFactory getReadersPicksCommentsPagingSourceFactory, GetReportersRepliesPagingSourceFactory getReportersRepliesPagingSourceFactory, GetNYTPicksCommentsPagingSourceFactory getNYTPicksCommentsPagingSourceFactory, GetCommentsSummaryDataSource getCommentsSummaryDataSource, GetCurrentUserRemoteDataSource getCurrentUserRemoteDataSource, FlagCommentDataSource flagCommentDataSource, RecommendCommentDataSource recommendCommentDataSource, GetRepliesDataSource getRepliesDataSource, GetCommentThreadDataSource getCommentThreadDataSource) {
        zq3.h(getAllCommentsPagingSourceFactory, "allCommentsPagingSourceFactory");
        zq3.h(getReadersPicksCommentsPagingSourceFactory, "readersPicksCommentsPagingSourceFactory");
        zq3.h(getReportersRepliesPagingSourceFactory, "reportersRepliesPagingSourceFactory");
        zq3.h(getNYTPicksCommentsPagingSourceFactory, "nytPicksCommentsPagingSourceFactory");
        zq3.h(getCommentsSummaryDataSource, "getCommentsSummaryDataSource");
        zq3.h(getCurrentUserRemoteDataSource, "getCurrentUserRemoteDataSource");
        zq3.h(flagCommentDataSource, "flagCommentDataSource");
        zq3.h(recommendCommentDataSource, "recommendCommentDataSource");
        zq3.h(getRepliesDataSource, "getRepliesDataSource");
        zq3.h(getCommentThreadDataSource, "getCommentThreadDataSource");
        this.allCommentsPagingSourceFactory = getAllCommentsPagingSourceFactory;
        this.readersPicksCommentsPagingSourceFactory = getReadersPicksCommentsPagingSourceFactory;
        this.reportersRepliesPagingSourceFactory = getReportersRepliesPagingSourceFactory;
        this.nytPicksCommentsPagingSourceFactory = getNYTPicksCommentsPagingSourceFactory;
        this.getCommentsSummaryDataSource = getCommentsSummaryDataSource;
        this.getCurrentUserRemoteDataSource = getCurrentUserRemoteDataSource;
        this.flagCommentDataSource = flagCommentDataSource;
        this.recommendCommentDataSource = recommendCommentDataSource;
        this.getRepliesDataSource = getRepliesDataSource;
        this.getCommentThreadDataSource = getCommentThreadDataSource;
    }

    public final Object flagComment(long j, String str, String str2, by0<? super FetchResult<Integer>> by0Var) {
        return this.flagCommentDataSource.flagComment(j, str, str2, by0Var);
    }

    public final Flow<PagingData> getAllComments(final String str, final String str2) {
        zq3.h(str, "articleUrl");
        zq3.h(str2, "sortOrder");
        return new Pager(new xn5(25, 0, false, 0, 0, 0, 62, null), null, new qs2() { // from class: com.nytimes.android.comments.comments.data.repository.CommentsRepository$getAllComments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final PagingSource mo865invoke() {
                GetAllCommentsPagingSourceFactory getAllCommentsPagingSourceFactory;
                GetAllCommentsPagingSource getAllCommentsPagingSource;
                CommentsRepository commentsRepository = CommentsRepository.this;
                getAllCommentsPagingSourceFactory = commentsRepository.allCommentsPagingSourceFactory;
                commentsRepository.allCommentsPagingSource = getAllCommentsPagingSourceFactory.create(str, str2);
                getAllCommentsPagingSource = CommentsRepository.this.allCommentsPagingSource;
                if (getAllCommentsPagingSource != null) {
                    return getAllCommentsPagingSource;
                }
                zq3.z("allCommentsPagingSource");
                return null;
            }
        }, 2, null).a();
    }

    public final Object getCommentThread(long j, String str, by0<? super FetchResult<CommentThreadResult>> by0Var) {
        return this.getCommentThreadDataSource.getCommentThread(j, str, by0Var);
    }

    public final Object getCommentsSummary(String str, by0<? super FetchResult<CommentsSummary>> by0Var) {
        return this.getCommentsSummaryDataSource.getCommentsSummary(str, by0Var);
    }

    public final Object getCurrentUser(by0<? super FetchResult<User>> by0Var) {
        return this.getCurrentUserRemoteDataSource.getCurrentUser(by0Var);
    }

    public final Flow<PagingData> getNYTPicksComments(final String str) {
        zq3.h(str, "articleUrl");
        return new Pager(new xn5(25, 0, false, 0, 0, 0, 62, null), null, new qs2() { // from class: com.nytimes.android.comments.comments.data.repository.CommentsRepository$getNYTPicksComments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final PagingSource mo865invoke() {
                GetNYTPicksCommentsPagingSourceFactory getNYTPicksCommentsPagingSourceFactory;
                GetNYTPicksCommentsPagingSource getNYTPicksCommentsPagingSource;
                CommentsRepository commentsRepository = CommentsRepository.this;
                getNYTPicksCommentsPagingSourceFactory = commentsRepository.nytPicksCommentsPagingSourceFactory;
                commentsRepository.nytPicksCommentsPagingSource = getNYTPicksCommentsPagingSourceFactory.create(str);
                getNYTPicksCommentsPagingSource = CommentsRepository.this.nytPicksCommentsPagingSource;
                if (getNYTPicksCommentsPagingSource != null) {
                    return getNYTPicksCommentsPagingSource;
                }
                zq3.z("nytPicksCommentsPagingSource");
                return null;
            }
        }, 2, null).a();
    }

    public final Flow<PagingData> getReadersPicksComments(final String str) {
        zq3.h(str, "articleUrl");
        return new Pager(new xn5(25, 0, false, 0, 0, 0, 62, null), null, new qs2() { // from class: com.nytimes.android.comments.comments.data.repository.CommentsRepository$getReadersPicksComments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final PagingSource mo865invoke() {
                GetReadersPicksCommentsPagingSourceFactory getReadersPicksCommentsPagingSourceFactory;
                GetReadersPicksCommentsPagingSource getReadersPicksCommentsPagingSource;
                CommentsRepository commentsRepository = CommentsRepository.this;
                getReadersPicksCommentsPagingSourceFactory = commentsRepository.readersPicksCommentsPagingSourceFactory;
                commentsRepository.readersPicksCommentsPagingSource = getReadersPicksCommentsPagingSourceFactory.create(str);
                getReadersPicksCommentsPagingSource = CommentsRepository.this.readersPicksCommentsPagingSource;
                if (getReadersPicksCommentsPagingSource != null) {
                    return getReadersPicksCommentsPagingSource;
                }
                zq3.z("readersPicksCommentsPagingSource");
                return null;
            }
        }, 2, null).a();
    }

    public final Object getReplies(long j, int i, String str, int i2, by0<? super FetchResult<RepliesResult>> by0Var) {
        return this.getRepliesDataSource.getReplies(j, str, i, i2, by0Var);
    }

    public final Flow<PagingData> getReporterReplies(final String str) {
        zq3.h(str, "articleUrl");
        return new Pager(new xn5(25, 0, false, 0, 0, 0, 62, null), null, new qs2() { // from class: com.nytimes.android.comments.comments.data.repository.CommentsRepository$getReporterReplies$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final PagingSource mo865invoke() {
                GetReportersRepliesPagingSourceFactory getReportersRepliesPagingSourceFactory;
                GetReportersRepliesPagingSource getReportersRepliesPagingSource;
                CommentsRepository commentsRepository = CommentsRepository.this;
                getReportersRepliesPagingSourceFactory = commentsRepository.reportersRepliesPagingSourceFactory;
                commentsRepository.reportersRepliesPagingSource = getReportersRepliesPagingSourceFactory.create(str);
                getReportersRepliesPagingSource = CommentsRepository.this.reportersRepliesPagingSource;
                if (getReportersRepliesPagingSource != null) {
                    return getReportersRepliesPagingSource;
                }
                zq3.z("reportersRepliesPagingSource");
                return null;
            }
        }, 2, null).a();
    }

    public final void invalidateAllComments() {
        GetAllCommentsPagingSource getAllCommentsPagingSource = this.allCommentsPagingSource;
        if (getAllCommentsPagingSource != null) {
            if (getAllCommentsPagingSource == null) {
                zq3.z("allCommentsPagingSource");
                getAllCommentsPagingSource = null;
            }
            getAllCommentsPagingSource.invalidate();
        }
    }

    public final void invalidateNYTPicksComments() {
        GetNYTPicksCommentsPagingSource getNYTPicksCommentsPagingSource = this.nytPicksCommentsPagingSource;
        if (getNYTPicksCommentsPagingSource != null) {
            if (getNYTPicksCommentsPagingSource == null) {
                zq3.z("nytPicksCommentsPagingSource");
                getNYTPicksCommentsPagingSource = null;
            }
            getNYTPicksCommentsPagingSource.invalidate();
        }
    }

    public final void invalidateReadersPicksComments() {
        GetReadersPicksCommentsPagingSource getReadersPicksCommentsPagingSource = this.readersPicksCommentsPagingSource;
        if (getReadersPicksCommentsPagingSource != null) {
            if (getReadersPicksCommentsPagingSource == null) {
                zq3.z("readersPicksCommentsPagingSource");
                getReadersPicksCommentsPagingSource = null;
            }
            getReadersPicksCommentsPagingSource.invalidate();
        }
    }

    public final void invalidateReporterReplies() {
        GetReportersRepliesPagingSource getReportersRepliesPagingSource = this.reportersRepliesPagingSource;
        if (getReportersRepliesPagingSource != null) {
            if (getReportersRepliesPagingSource == null) {
                zq3.z("reportersRepliesPagingSource");
                getReportersRepliesPagingSource = null;
            }
            getReportersRepliesPagingSource.invalidate();
        }
    }

    public final Object recommendComment(long j, String str, boolean z, by0<? super FetchResult<RecommendCommentResult>> by0Var) {
        return this.recommendCommentDataSource.recommendComment(j, str, z, by0Var);
    }
}
