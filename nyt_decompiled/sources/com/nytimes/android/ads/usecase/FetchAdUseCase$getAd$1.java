package com.nytimes.android.ads.usecase;

import com.nytimes.android.ads.AdConfig;
import com.nytimes.android.ads.network.model.AlsTargetingData;
import defpackage.by0;
import defpackage.d8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.m7;
import defpackage.ww8;
import defpackage.z7;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.ads.usecase.FetchAdUseCase$getAd$1", f = "FetchAdUseCase.kt", l = {42, 47}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FetchAdUseCase$getAd$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ AdConfig $adConfig;
    final /* synthetic */ String $adPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FetchAdUseCase this$0;

    static final class a implements FlowCollector {
        final /* synthetic */ FlowCollector a;

        a(FlowCollector flowCollector) {
            this.a = flowCollector;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(z7 z7Var, by0 by0Var) {
            Object emit = this.a.emit(d8.Companion.a(z7Var), by0Var);
            return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchAdUseCase$getAd$1(FetchAdUseCase fetchAdUseCase, String str, AdConfig adConfig, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = fetchAdUseCase;
        this.$adPosition = str;
        this.$adConfig = adConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        FetchAdUseCase$getAd$1 fetchAdUseCase$getAd$1 = new FetchAdUseCase$getAd$1(this.this$0, this.$adPosition, this.$adConfig, by0Var);
        fetchAdUseCase$getAd$1.L$0 = obj;
        return fetchAdUseCase$getAd$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        AlsTargetingData alsTargetingData;
        m7 m7Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            d8.b bVar = d8.b.b;
            this.L$0 = flowCollector;
            this.label = 1;
            if (flowCollector.emit(bVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            flowCollector = (FlowCollector) this.L$0;
            f.b(obj);
        }
        alsTargetingData = this.this$0.c;
        if (alsTargetingData != null) {
            this.$adConfig.c(alsTargetingData.c());
        }
        m7Var = this.this$0.a;
        Flow a2 = m7Var.a(this.$adPosition, this.$adConfig);
        a aVar = new a(flowCollector);
        this.L$0 = null;
        this.label = 2;
        if (a2.collect(aVar, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((FetchAdUseCase$getAd$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
