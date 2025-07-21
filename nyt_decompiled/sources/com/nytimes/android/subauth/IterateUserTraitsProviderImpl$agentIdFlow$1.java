package com.nytimes.android.subauth;

import android.app.Application;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.AnalyticsTrackingIdRetriever;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.subauth.IterateUserTraitsProviderImpl$agentIdFlow$1", f = "IterateUserTraitsProviderImpl.kt", l = {32, 32, 35}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class IterateUserTraitsProviderImpl$agentIdFlow$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ IterateUserTraitsProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IterateUserTraitsProviderImpl$agentIdFlow$1(IterateUserTraitsProviderImpl iterateUserTraitsProviderImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = iterateUserTraitsProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        IterateUserTraitsProviderImpl$agentIdFlow$1 iterateUserTraitsProviderImpl$agentIdFlow$1 = new IterateUserTraitsProviderImpl$agentIdFlow$1(this.this$0, by0Var);
        iterateUserTraitsProviderImpl$agentIdFlow$1.L$0 = obj;
        return iterateUserTraitsProviderImpl$agentIdFlow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Application application;
        FlowCollector flowCollector2;
        Object h = a.h();
        ?? r1 = this.label;
        try {
        } catch (Exception e) {
            e = e;
        }
        if (r1 == 0) {
            f.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            AnalyticsTrackingIdRetriever analyticsTrackingIdRetriever = AnalyticsTrackingIdRetriever.a;
            application = this.this$0.a;
            this.L$0 = flowCollector;
            this.L$1 = flowCollector;
            this.label = 1;
            obj = analyticsTrackingIdRetriever.b(application, this);
            if (obj == h) {
                return h;
            }
            flowCollector2 = flowCollector;
        } else {
            if (r1 != 1) {
                if (r1 == 2) {
                    f.b(obj);
                } else {
                    if (r1 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                }
                return ww8.a;
            }
            flowCollector = (FlowCollector) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            try {
                f.b(obj);
            } catch (Exception e2) {
                e = e2;
                r1 = flowCollector2;
                NYTLogger.s(new Exception("Error while getting identifier.", e));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (r1.emit("", this) == h) {
                    return h;
                }
                return ww8.a;
            }
        }
        this.L$0 = flowCollector2;
        this.L$1 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((IterateUserTraitsProviderImpl$agentIdFlow$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
