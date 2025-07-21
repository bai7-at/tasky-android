package com.nytimes.android.comments.comments.data.remote.getreaderspicks;

import defpackage.p76;
import defpackage.xl3;

/* loaded from: classes4.dex */
public final class GetReadersPicksCommentsPagingSourceFactory_Impl implements GetReadersPicksCommentsPagingSourceFactory {
    private final GetReadersPicksCommentsPagingSource_Factory delegateFactory;

    GetReadersPicksCommentsPagingSourceFactory_Impl(GetReadersPicksCommentsPagingSource_Factory getReadersPicksCommentsPagingSource_Factory) {
        this.delegateFactory = getReadersPicksCommentsPagingSource_Factory;
    }

    @Override // com.nytimes.android.comments.comments.data.remote.getreaderspicks.GetReadersPicksCommentsPagingSourceFactory
    public GetReadersPicksCommentsPagingSource create(String str) {
        return this.delegateFactory.get(str);
    }

    public static p76 create(GetReadersPicksCommentsPagingSource_Factory getReadersPicksCommentsPagingSource_Factory) {
        return xl3.a(new GetReadersPicksCommentsPagingSourceFactory_Impl(getReadersPicksCommentsPagingSource_Factory));
    }
}
