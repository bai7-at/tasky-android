package com.nytimes.android.assetretriever;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.assetretriever.AssetRetriever$deleteAssetSourcesWithOldId$2", f = "AssetRetriever.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AssetRetriever$deleteAssetSourcesWithOldId$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ long $newExternalId;
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ AssetRetriever this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetRetriever$deleteAssetSourcesWithOldId$2(AssetRetriever assetRetriever, String str, long j, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = assetRetriever;
        this.$type = str;
        this.$newExternalId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AssetRetriever$deleteAssetSourcesWithOldId$2(this.this$0, this.$type, this.$newExternalId, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h m;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        m = this.this$0.m();
        m.i(this.$type, this.$newExternalId);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AssetRetriever$deleteAssetSourcesWithOldId$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
