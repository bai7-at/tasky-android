package com.nytimes.android.comments.comments.data.remote.getallcomments;

import defpackage.p76;
import defpackage.xl3;

/* loaded from: classes4.dex */
public final class GetAllCommentsPagingSourceFactory_Impl implements GetAllCommentsPagingSourceFactory {
    private final GetAllCommentsPagingSource_Factory delegateFactory;

    GetAllCommentsPagingSourceFactory_Impl(GetAllCommentsPagingSource_Factory getAllCommentsPagingSource_Factory) {
        this.delegateFactory = getAllCommentsPagingSource_Factory;
    }

    @Override // com.nytimes.android.comments.comments.data.remote.getallcomments.GetAllCommentsPagingSourceFactory
    public GetAllCommentsPagingSource create(String str, String str2) {
        return this.delegateFactory.get(str, str2);
    }

    public static p76 create(GetAllCommentsPagingSource_Factory getAllCommentsPagingSource_Factory) {
        return xl3.a(new GetAllCommentsPagingSourceFactory_Impl(getAllCommentsPagingSource_Factory));
    }
}
