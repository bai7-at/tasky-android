package com.nytimes.android.assetretriever;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.assetretriever.AssetDownloader", f = "AssetDownloader.kt", l = {EventType.SUBS, 28}, m = "downloadAndSaveAsset")
/* loaded from: classes.dex */
final class AssetDownloader$downloadAndSaveAsset$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetDownloader$downloadAndSaveAsset$1(AssetDownloader assetDownloader, by0 by0Var) {
        super(by0Var);
        this.this$0 = assetDownloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.d(null, null, this);
    }
}
