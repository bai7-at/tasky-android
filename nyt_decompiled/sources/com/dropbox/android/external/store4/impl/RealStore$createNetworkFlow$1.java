package com.dropbox.android.external.store4.impl;

import com.dropbox.android.external.store4.ResponseOrigin;
import defpackage.b38;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.android.external.store4.impl.RealStore$createNetworkFlow$1", f = "RealStore.kt", l = {273, 275}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RealStore$createNetworkFlow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ CompletableDeferred<ww8> $networkLock;
    final /* synthetic */ boolean $piggybackOnly;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealStore$createNetworkFlow$1(CompletableDeferred completableDeferred, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.$networkLock = completableDeferred;
        this.$piggybackOnly = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        RealStore$createNetworkFlow$1 realStore$createNetworkFlow$1 = new RealStore$createNetworkFlow$1(this.$networkLock, this.$piggybackOnly, by0Var);
        realStore$createNetworkFlow$1.L$0 = obj;
        return realStore$createNetworkFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            CompletableDeferred<ww8> completableDeferred = this.$networkLock;
            if (completableDeferred != null) {
                this.L$0 = flowCollector;
                this.label = 1;
                if (completableDeferred.await(this) == h) {
                    return h;
                }
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
        if (!this.$piggybackOnly) {
            b38.c cVar = new b38.c(ResponseOrigin.Fetcher);
            this.L$0 = null;
            this.label = 2;
            if (flowCollector.emit(cVar, this) == h) {
                return h;
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((RealStore$createNetworkFlow$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
