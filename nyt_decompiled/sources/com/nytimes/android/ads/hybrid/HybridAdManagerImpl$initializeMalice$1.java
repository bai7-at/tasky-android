package com.nytimes.android.ads.hybrid;

import com.nytimes.android.ads.network.model.AlsTargetingData;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.ads.hybrid.HybridAdManagerImpl$initializeMalice$1", f = "HybridAdManager.kt", l = {92, 99}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HybridAdManagerImpl$initializeMalice$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $contentUri;
    final /* synthetic */ String $contentUrl;
    final /* synthetic */ String $pageType;
    int label;
    final /* synthetic */ HybridAdManagerImpl this$0;

    static final class a implements FlowCollector {
        final /* synthetic */ HybridAdManagerImpl a;

        a(HybridAdManagerImpl hybridAdManagerImpl) {
            this.a = hybridAdManagerImpl;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, by0 by0Var) {
            Map c;
            Object j = ((Result) obj).j();
            if (Result.g(j)) {
                j = null;
            }
            AlsTargetingData alsTargetingData = (AlsTargetingData) j;
            if (alsTargetingData != null && (c = alsTargetingData.c()) != null) {
                this.a.j(c);
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridAdManagerImpl$initializeMalice$1(HybridAdManagerImpl hybridAdManagerImpl, String str, String str2, String str3, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = hybridAdManagerImpl;
        this.$pageType = str;
        this.$contentUri = str2;
        this.$contentUrl = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridAdManagerImpl$initializeMalice$1(this.this$0, this.$pageType, this.$contentUri, this.$contentUrl, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineDispatcher coroutineDispatcher;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            coroutineDispatcher = this.this$0.b;
            HybridAdManagerImpl$initializeMalice$1$alsDataFlow$1 hybridAdManagerImpl$initializeMalice$1$alsDataFlow$1 = new HybridAdManagerImpl$initializeMalice$1$alsDataFlow$1(this.this$0, this.$pageType, this.$contentUri, this.$contentUrl, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcher, hybridAdManagerImpl$initializeMalice$1$alsDataFlow$1, this);
            if (obj == h) {
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
            f.b(obj);
        }
        a aVar = new a(this.this$0);
        this.label = 2;
        if (((Flow) obj).collect(aVar, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridAdManagerImpl$initializeMalice$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
