package com.nytimes.android.assetretriever;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.assetretriever.AssetRetrieverJobIntentService$onHandleWork$1", f = "AssetRetrieverJobIntentService.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AssetRetrieverJobIntentService$onHandleWork$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ AssetRetrieverJobIntentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetRetrieverJobIntentService$onHandleWork$1(AssetRetrieverJobIntentService assetRetrieverJobIntentService, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = assetRetrieverJobIntentService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AssetRetrieverJobIntentService$onHandleWork$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            AssetDownloader m = this.this$0.m();
            this.label = 1;
            if (m.f(this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AssetRetrieverJobIntentService$onHandleWork$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
