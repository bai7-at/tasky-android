package com.nytimes.android.assetretriever;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.assetretriever.AssetRetriever$clearOnLoginChanged$2", f = "AssetRetriever.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AssetRetriever$clearOnLoginChanged$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ AssetRetriever this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetRetriever$clearOnLoginChanged$2(AssetRetriever assetRetriever, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = assetRetriever;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(NYTUser.StateChangeType stateChangeType, by0 by0Var) {
        return ((AssetRetriever$clearOnLoginChanged$2) create(stateChangeType, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AssetRetriever$clearOnLoginChanged$2(this.this$0, by0Var);
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
        m.h();
        return ww8.a;
    }
}
