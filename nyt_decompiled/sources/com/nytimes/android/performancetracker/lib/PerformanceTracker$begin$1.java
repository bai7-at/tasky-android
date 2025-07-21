package com.nytimes.android.performancetracker.lib;

import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.j32;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.BroadcastChannel;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@fc1(c = "com.nytimes.android.performancetracker.lib.PerformanceTracker$begin$1", f = "PerformanceTracker.kt", l = {LockFreeTaskQueueCore.CLOSED_SHIFT, LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PerformanceTracker$begin$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Deferred<Map<String, Object>> $deferredParams;
    final /* synthetic */ long $timestamp;
    final /* synthetic */ j32 $type;
    final /* synthetic */ UUID $uuid;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PerformanceTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceTracker$begin$1(PerformanceTracker performanceTracker, j32 j32Var, Deferred deferred, long j, UUID uuid, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = performanceTracker;
        this.$type = j32Var;
        this.$deferredParams = deferred;
        this.$timestamp = j;
        this.$uuid = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PerformanceTracker$begin$1(this.this$0, this.$type, this.$deferredParams, this.$timestamp, this.$uuid, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BroadcastChannel broadcastChannel;
        PerformanceTracker.Kind kind;
        BroadcastChannel broadcastChannel2;
        String str;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            broadcastChannel = this.this$0.c;
            String a = this.$type.a();
            PerformanceTracker.Kind kind2 = PerformanceTracker.Kind.START;
            Deferred<Map<String, Object>> deferred = this.$deferredParams;
            this.L$0 = broadcastChannel;
            this.L$1 = a;
            this.L$2 = kind2;
            this.label = 1;
            Object await = deferred.await(this);
            if (await == h) {
                return h;
            }
            kind = kind2;
            broadcastChannel2 = broadcastChannel;
            str = a;
            obj = await;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            PerformanceTracker.Kind kind3 = (PerformanceTracker.Kind) this.L$2;
            String str2 = (String) this.L$1;
            BroadcastChannel broadcastChannel3 = (BroadcastChannel) this.L$0;
            f.b(obj);
            kind = kind3;
            broadcastChannel2 = broadcastChannel3;
            str = str2;
        }
        long j = this.$timestamp;
        UUID uuid = this.$uuid;
        zq3.g(uuid, "$uuid");
        PerformanceTracker.a aVar = new PerformanceTracker.a(str, kind, (Map) obj, j, uuid, null, 32, null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        if (broadcastChannel2.send(aVar, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PerformanceTracker$begin$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
