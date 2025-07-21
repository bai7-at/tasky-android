package com.nytimes.android.comments.comments.data.remote.nytpickscomments;

import defpackage.p76;
import defpackage.xl3;

/* loaded from: classes4.dex */
public final class GetNYTPicksCommentsPagingSourceFactory_Impl implements GetNYTPicksCommentsPagingSourceFactory {
    private final GetNYTPicksCommentsPagingSource_Factory delegateFactory;

    GetNYTPicksCommentsPagingSourceFactory_Impl(GetNYTPicksCommentsPagingSource_Factory getNYTPicksCommentsPagingSource_Factory) {
        this.delegateFactory = getNYTPicksCommentsPagingSource_Factory;
    }

    @Override // com.nytimes.android.comments.comments.data.remote.nytpickscomments.GetNYTPicksCommentsPagingSourceFactory
    public GetNYTPicksCommentsPagingSource create(String str) {
        return this.delegateFactory.get(str);
    }

    public static p76 create(GetNYTPicksCommentsPagingSource_Factory getNYTPicksCommentsPagingSource_Factory) {
        return xl3.a(new GetNYTPicksCommentsPagingSourceFactory_Impl(getNYTPicksCommentsPagingSource_Factory));
    }
}
