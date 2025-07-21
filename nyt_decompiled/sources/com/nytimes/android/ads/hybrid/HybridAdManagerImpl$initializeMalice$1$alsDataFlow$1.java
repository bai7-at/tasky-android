package com.nytimes.android.ads.hybrid;

import defpackage.bc;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ads.hybrid.HybridAdManagerImpl$initializeMalice$1$alsDataFlow$1", f = "HybridAdManager.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HybridAdManagerImpl$initializeMalice$1$alsDataFlow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $contentUri;
    final /* synthetic */ String $contentUrl;
    final /* synthetic */ String $pageType;
    int label;
    final /* synthetic */ HybridAdManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridAdManagerImpl$initializeMalice$1$alsDataFlow$1(HybridAdManagerImpl hybridAdManagerImpl, String str, String str2, String str3, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = hybridAdManagerImpl;
        this.$pageType = str;
        this.$contentUri = str2;
        this.$contentUrl = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridAdManagerImpl$initializeMalice$1$alsDataFlow$1(this.this$0, this.$pageType, this.$contentUri, this.$contentUrl, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bc bcVar;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            bcVar = this.this$0.a;
            String str = this.$pageType;
            String str2 = this.$contentUri;
            String str3 = this.$contentUrl;
            this.label = 1;
            obj = bcVar.a(str, str2, str3, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridAdManagerImpl$initializeMalice$1$alsDataFlow$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
