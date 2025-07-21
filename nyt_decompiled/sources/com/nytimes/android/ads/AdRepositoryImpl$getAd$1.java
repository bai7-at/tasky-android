package com.nytimes.android.ads;

import com.nytimes.android.ads.models.CommonAdKeys;
import defpackage.by0;
import defpackage.d6;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.android.ads.AdRepositoryImpl$getAd$1", f = "AdRepository.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AdRepositoryImpl$getAd$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ AdConfig $adConfig;
    final /* synthetic */ Map<String, String> $adKvps;
    final /* synthetic */ String $adPosition;
    int label;
    final /* synthetic */ AdRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdRepositoryImpl$getAd$1(AdRepositoryImpl adRepositoryImpl, String str, AdConfig adConfig, Map map, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = adRepositoryImpl;
        this.$adPosition = str;
        this.$adConfig = adConfig;
        this.$adKvps = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AdRepositoryImpl$getAd$1(this.this$0, this.$adPosition, this.$adConfig, this.$adKvps, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mutableSharedFlow = this.this$0.d;
            d6.g gVar = new d6.g(this.$adPosition, this.$adConfig.k(CommonAdKeys.CONTENT_TYPE.getKey()), this.$adKvps);
            this.label = 1;
            if (mutableSharedFlow.emit(gVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AdRepositoryImpl$getAd$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
