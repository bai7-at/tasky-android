package com.nytimes.android.performancetracker.lib;

import com.comscore.android.util.AndroidTcfDataLoader;
import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.BroadcastChannel;

@fc1(c = "com.nytimes.android.performancetracker.lib.PerformanceTracker$end$1", f = "PerformanceTracker.kt", l = {75, AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PerformanceTracker$end$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Map<String, Object> $info;
    final /* synthetic */ long $timestamp;
    final /* synthetic */ PerformanceTracker.b $token;
    Object L$0;
    int label;
    final /* synthetic */ PerformanceTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceTracker$end$1(PerformanceTracker performanceTracker, PerformanceTracker.b bVar, Map map, long j, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = performanceTracker;
        this.$token = bVar;
        this.$info = map;
        this.$timestamp = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PerformanceTracker$end$1(this.this$0, this.$token, this.$info, this.$timestamp, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PerformanceTracker performanceTracker;
        BroadcastChannel broadcastChannel;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            performanceTracker = this.this$0;
            Deferred a = this.$token.a();
            this.L$0 = performanceTracker;
            this.label = 1;
            obj = a.await(this);
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
            performanceTracker = (PerformanceTracker) this.L$0;
            f.b(obj);
        }
        Map h2 = performanceTracker.h((Map) obj, this.$info);
        long H = b.H(this.$timestamp, this.$token.b());
        broadcastChannel = this.this$0.c;
        PerformanceTracker.a aVar = new PerformanceTracker.a(this.$token.c(), PerformanceTracker.Kind.END, h2, this.$timestamp, this.$token.d(), b.f(H), null);
        this.L$0 = null;
        this.label = 2;
        if (broadcastChannel.send(aVar, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PerformanceTracker$end$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
