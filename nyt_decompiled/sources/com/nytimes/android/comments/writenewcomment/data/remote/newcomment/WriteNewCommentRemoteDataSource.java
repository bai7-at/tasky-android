package com.nytimes.android.comments.writenewcomment.data.remote.newcomment;

import android.app.Application;
import defpackage.by0;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class WriteNewCommentRemoteDataSource {
    public static final int $stable = 8;
    private final Application application;
    private final CoroutineDispatcher ioDispatcher;
    private final WriteNewCommentApi writeNewCommentApi;

    public WriteNewCommentRemoteDataSource(WriteNewCommentApi writeNewCommentApi, Application application, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(writeNewCommentApi, "writeNewCommentApi");
        zq3.h(application, "application");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.writeNewCommentApi = writeNewCommentApi;
        this.application = application;
        this.ioDispatcher = coroutineDispatcher;
    }

    public final Object submitNewComment(WriteNewCommentBody writeNewCommentBody, by0<? super Flow<? extends SubmitNewCommentResult>> by0Var) {
        return FlowKt.flow(new WriteNewCommentRemoteDataSource$submitNewComment$2(this, writeNewCommentBody, null));
    }
}
