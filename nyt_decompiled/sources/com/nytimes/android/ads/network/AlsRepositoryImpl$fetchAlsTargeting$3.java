package com.nytimes.android.ads.network;

import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.qb;
import defpackage.sb;
import defpackage.ww8;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.android.ads.network.AlsRepositoryImpl$fetchAlsTargeting$3", f = "AlsRepository.kt", l = {62, 65}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AlsRepositoryImpl$fetchAlsTargeting$3 extends SuspendLambda implements it2 {
    final /* synthetic */ String $pageType;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AlsRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlsRepositoryImpl$fetchAlsTargeting$3(AlsRepositoryImpl alsRepositoryImpl, String str, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = alsRepositoryImpl;
        this.$pageType = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        MutableSharedFlow mutableSharedFlow;
        FlowCollector flowCollector;
        qb qbVar;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            th = (Throwable) this.L$1;
            mutableSharedFlow = this.this$0.d;
            sb.b bVar = new sb.b(this.$pageType, th);
            this.L$0 = flowCollector2;
            this.L$1 = th;
            this.label = 1;
            if (mutableSharedFlow.emit(bVar, this) == h) {
                return h;
            }
            flowCollector = flowCollector2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            th = (Throwable) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            f.b(obj);
        }
        qbVar = this.this$0.c;
        Map a = qbVar.a();
        if (a == null || a.isEmpty()) {
            Result.a aVar = Result.a;
            Result a2 = Result.a(Result.b(f.a(th)));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (flowCollector.emit(a2, this) == h) {
                return h;
            }
        }
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        AlsRepositoryImpl$fetchAlsTargeting$3 alsRepositoryImpl$fetchAlsTargeting$3 = new AlsRepositoryImpl$fetchAlsTargeting$3(this.this$0, this.$pageType, by0Var);
        alsRepositoryImpl$fetchAlsTargeting$3.L$0 = flowCollector;
        alsRepositoryImpl$fetchAlsTargeting$3.L$1 = th;
        return alsRepositoryImpl$fetchAlsTargeting$3.invokeSuspend(ww8.a);
    }
}
