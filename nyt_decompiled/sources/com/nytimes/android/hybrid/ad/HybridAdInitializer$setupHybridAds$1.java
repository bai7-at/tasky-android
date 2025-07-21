package com.nytimes.android.hybrid.ad;

import com.nytimes.android.api.cms.AssetConstants;
import defpackage.b04;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.kb3;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.hybrid.ad.HybridAdInitializer$setupHybridAds$1", f = "HybridAdInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HybridAdInitializer$setupHybridAds$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $uri;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ HybridAdInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridAdInitializer$setupHybridAds$1(HybridAdInitializer hybridAdInitializer, String str, String str2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = hybridAdInitializer;
        this.$uri = str;
        this.$url = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridAdInitializer$setupHybridAds$1(this.this$0, this.$uri, this.$url, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b04 b04Var;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        b04Var = this.this$0.a;
        ((kb3) b04Var.get()).b(AssetConstants.ARTICLE_TYPE, this.$uri, this.$url);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridAdInitializer$setupHybridAds$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
