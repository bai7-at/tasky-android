package com.nytimes.android.comments.comments.data.remote.getreporterreplies;

import defpackage.p76;
import defpackage.xl3;

/* loaded from: classes4.dex */
public final class GetReportersRepliesPagingSourceFactory_Impl implements GetReportersRepliesPagingSourceFactory {
    private final GetReportersRepliesPagingSource_Factory delegateFactory;

    GetReportersRepliesPagingSourceFactory_Impl(GetReportersRepliesPagingSource_Factory getReportersRepliesPagingSource_Factory) {
        this.delegateFactory = getReportersRepliesPagingSource_Factory;
    }

    @Override // com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSourceFactory
    public GetReportersRepliesPagingSource create(String str) {
        return this.delegateFactory.get(str);
    }

    public static p76 create(GetReportersRepliesPagingSource_Factory getReportersRepliesPagingSource_Factory) {
        return xl3.a(new GetReportersRepliesPagingSourceFactory_Impl(getReportersRepliesPagingSource_Factory));
    }
}
