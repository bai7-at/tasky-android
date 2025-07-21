package com.nytimes.android.performancetracker.lib;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.performancetracker.lib.PerformanceTracker$observe$1", f = "PerformanceTracker.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PerformanceTracker$observe$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ a $observer;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PerformanceTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceTracker$observe$1(PerformanceTracker performanceTracker, a aVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = performanceTracker;
        this.$observer = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PerformanceTracker$observe$1(this.this$0, this.$observer, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #1 {all -> 0x001b, blocks: (B:6:0x0017, B:7:0x0048, B:9:0x0050, B:11:0x0056, B:12:0x0039, B:18:0x005b, B:25:0x0034), top: B:2:0x0007, inners: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0045 -> B:7:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r8.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r3 = r8.L$1
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            java.lang.Object r4 = r8.L$0
            com.nytimes.android.performancetracker.lib.a r4 = (com.nytimes.android.performancetracker.lib.a) r4
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L1b
            goto L48
        L1b:
            r8 = move-exception
            goto L6d
        L1d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L25:
            kotlin.f.b(r9)
            com.nytimes.android.performancetracker.lib.PerformanceTracker r9 = r8.this$0
            kotlinx.coroutines.channels.BroadcastChannel r9 = com.nytimes.android.performancetracker.lib.PerformanceTracker.b(r9)
            kotlinx.coroutines.channels.ReceiveChannel r3 = r9.openSubscription()
            com.nytimes.android.performancetracker.lib.a r9 = r8.$observer
            kotlinx.coroutines.channels.ChannelIterator r1 = r3.iterator()     // Catch: java.lang.Throwable -> L1b
            r4 = r9
        L39:
            r8.L$0 = r4     // Catch: java.lang.Throwable -> L1b
            r8.L$1 = r3     // Catch: java.lang.Throwable -> L1b
            r8.L$2 = r1     // Catch: java.lang.Throwable -> L1b
            r8.label = r2     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r9 = r1.hasNext(r8)     // Catch: java.lang.Throwable -> L1b
            if (r9 != r0) goto L48
            return r0
        L48:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
            if (r9 == 0) goto L66
            java.lang.Object r9 = r1.next()     // Catch: java.lang.Throwable -> L1b
            com.nytimes.android.performancetracker.lib.PerformanceTracker$a r9 = (com.nytimes.android.performancetracker.lib.PerformanceTracker.a) r9     // Catch: java.lang.Throwable -> L1b
            r4.a(r9)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L5a
            goto L39
        L5a:
            r9 = move-exception
            ul8$b r5 = defpackage.ul8.a     // Catch: java.lang.Throwable -> L1b
            java.lang.String r6 = "Exception in observer"
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L1b
            r5.f(r9, r6, r7)     // Catch: java.lang.Throwable -> L1b
            goto L39
        L66:
            r8 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r8)
            ww8 r8 = defpackage.ww8.a
            return r8
        L6d:
            throw r8     // Catch: java.lang.Throwable -> L6e
        L6e:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.performancetracker.lib.PerformanceTracker$observe$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PerformanceTracker$observe$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
