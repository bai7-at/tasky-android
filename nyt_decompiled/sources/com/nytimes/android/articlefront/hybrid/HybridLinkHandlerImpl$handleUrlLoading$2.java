package com.nytimes.android.articlefront.hybrid;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AudioAsset;
import defpackage.by0;
import defpackage.ex;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.articlefront.hybrid.HybridLinkHandlerImpl$handleUrlLoading$2", f = "HybridLinkHandlerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class HybridLinkHandlerImpl$handleUrlLoading$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Asset $asset;
    int label;
    final /* synthetic */ HybridLinkHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridLinkHandlerImpl$handleUrlLoading$2(HybridLinkHandlerImpl hybridLinkHandlerImpl, Asset asset, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = hybridLinkHandlerImpl;
        this.$asset = asset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridLinkHandlerImpl$handleUrlLoading$2(this.this$0, this.$asset, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ex exVar;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        exVar = this.this$0.d;
        exVar.b((AudioAsset) this.$asset);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridLinkHandlerImpl$handleUrlLoading$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
