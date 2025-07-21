package com.nytimes.android.assetretriever;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.assetretriever.AssetDownloader", f = "AssetDownloader.kt", l = {38, 42, 42, 42}, m = "prefetchFromService")
/* loaded from: classes.dex */
final class AssetDownloader$prefetchFromService$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetDownloader$prefetchFromService$1(AssetDownloader assetDownloader, by0 by0Var) {
        super(by0Var);
        this.this$0 = assetDownloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.f(this);
    }
}
