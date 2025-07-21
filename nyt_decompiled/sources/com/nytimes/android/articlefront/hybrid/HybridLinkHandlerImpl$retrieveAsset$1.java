package com.nytimes.android.articlefront.hybrid;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.android.util.AndroidTcfDataLoader;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.articlefront.hybrid.HybridLinkHandlerImpl", f = "HybridLinkHandlerImpl.kt", l = {AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX}, m = "retrieveAsset")
/* loaded from: classes3.dex */
final class HybridLinkHandlerImpl$retrieveAsset$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HybridLinkHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridLinkHandlerImpl$retrieveAsset$1(HybridLinkHandlerImpl hybridLinkHandlerImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = hybridLinkHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        e = this.this$0.e(null, this);
        return e;
    }
}
