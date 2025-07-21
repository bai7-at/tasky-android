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

@fc1(c = "com.nytimes.android.ads.AdRepositoryImpl$getAd$2$1", f = "AdRepository.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AdRepositoryImpl$getAd$2$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Map<String, String> $adKvps;
    final /* synthetic */ String $adPosition;
    final /* synthetic */ long $staleTime;
    int label;
    final /* synthetic */ AdRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdRepositoryImpl$getAd$2$1(AdRepositoryImpl adRepositoryImpl, String str, Map map, long j, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = adRepositoryImpl;
        this.$adPosition = str;
        this.$adKvps = map;
        this.$staleTime = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AdRepositoryImpl$getAd$2$1(this.this$0, this.$adPosition, this.$adKvps, this.$staleTime, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mutableSharedFlow = this.this$0.d;
            d6.e eVar = new d6.e(this.$adPosition, this.$adKvps.get(CommonAdKeys.CONTENT_TYPE.getKey()), this.$adKvps, this.$staleTime);
            this.label = 1;
            if (mutableSharedFlow.emit(eVar, this) == h) {
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
        return ((AdRepositoryImpl$getAd$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
