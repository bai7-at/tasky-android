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
import kotlinx.coroutines.channels.BroadcastChannel;

@fc1(c = "com.nytimes.android.performancetracker.lib.PerformanceTracker$track$1", f = "PerformanceTracker.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PerformanceTracker$track$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ j32 $type;
    int label;
    final /* synthetic */ PerformanceTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceTracker$track$1(PerformanceTracker performanceTracker, j32 j32Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = performanceTracker;
        this.$type = j32Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PerformanceTracker$track$1(this.this$0, this.$type, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BroadcastChannel broadcastChannel;
        long d;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            broadcastChannel = this.this$0.c;
            String a = this.$type.a();
            PerformanceTracker.Kind kind = PerformanceTracker.Kind.TRIGGER;
            Map b = this.$type.b();
            d = this.this$0.d();
            UUID randomUUID = UUID.randomUUID();
            zq3.g(randomUUID, "randomUUID(...)");
            PerformanceTracker.a aVar = new PerformanceTracker.a(a, kind, b, d, randomUUID, null, 32, null);
            this.label = 1;
            if (broadcastChannel.send(aVar, this) == h) {
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
        return ((PerformanceTracker$track$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
