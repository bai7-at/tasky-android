package com.dropbox.android.external.store4.impl;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.dropbox.android.external.store4.Fetcher;
import defpackage.by0;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class FetcherController {
    private final CoroutineScope a;
    private final Fetcher b;
    private final SourceOfTruthWithBarrier c;
    private final RefCountedResource d;

    public FetcherController(CoroutineScope coroutineScope, Fetcher fetcher, SourceOfTruthWithBarrier sourceOfTruthWithBarrier) {
        zq3.h(coroutineScope, "scope");
        zq3.h(fetcher, "realFetcher");
        this.a = coroutineScope;
        this.b = fetcher;
        this.c = sourceOfTruthWithBarrier;
        this.d = new RefCountedResource(new FetcherController$fetchers$1(this, null), new FetcherController$fetchers$2(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(Object obj, by0 by0Var) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this.a, null, null, new FetcherController$acquireFetcher$2(this, obj, null), 3, null);
        return async$default.await(by0Var);
    }

    public final Flow g(Object obj, boolean z) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        return FlowKt.flow(new FetcherController$getFetcher$1(this, obj, z, null));
    }
}
