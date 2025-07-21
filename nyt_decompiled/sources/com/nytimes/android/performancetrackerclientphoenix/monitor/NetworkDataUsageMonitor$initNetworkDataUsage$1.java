package com.nytimes.android.performancetrackerclientphoenix.monitor;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.performancetrackerclientphoenix.monitor.NetworkDataUsageMonitor$initNetworkDataUsage$1", f = "NetworkDataUsageMonitor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NetworkDataUsageMonitor$initNetworkDataUsage$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ NetworkDataUsageMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkDataUsageMonitor$initNetworkDataUsage$1(NetworkDataUsageMonitor networkDataUsageMonitor, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = networkDataUsageMonitor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NetworkDataUsageMonitor$initNetworkDataUsage$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Float g;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        NetworkDataUsageMonitor networkDataUsageMonitor = this.this$0;
        g = networkDataUsageMonitor.g();
        networkDataUsageMonitor.b = g;
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NetworkDataUsageMonitor$initNetworkDataUsage$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
