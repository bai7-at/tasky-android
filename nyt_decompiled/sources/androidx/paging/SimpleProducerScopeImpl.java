package androidx.paging;

import com.appsflyer.AppsFlyerProperties;
import defpackage.by0;
import defpackage.ns7;
import defpackage.ss2;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;

/* loaded from: classes.dex */
public final class SimpleProducerScopeImpl implements ns7, CoroutineScope, SendChannel {
    private final SendChannel a;
    private final /* synthetic */ CoroutineScope b;

    public SimpleProducerScopeImpl(CoroutineScope coroutineScope, SendChannel sendChannel) {
        zq3.h(coroutineScope, "scope");
        zq3.h(sendChannel, AppsFlyerProperties.CHANNEL);
        this.a = sendChannel;
        this.b = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.ns7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F0(defpackage.qs2 r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.SimpleProducerScopeImpl$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.SimpleProducerScopeImpl$awaitClose$1 r0 = (androidx.paging.SimpleProducerScopeImpl$awaitClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.SimpleProducerScopeImpl$awaitClose$1 r0 = new androidx.paging.SimpleProducerScopeImpl$awaitClose$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
            java.lang.Object r4 = r0.L$0
            r5 = r4
            qs2 r5 = (defpackage.qs2) r5
            kotlin.f.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L77
        L32:
            r4 = move-exception
            goto L85
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.f.b(r6)
            kotlin.coroutines.CoroutineContext r4 = r4.getCoroutineContext()     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.Job$Key r6 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> L32
            kotlin.coroutines.CoroutineContext$a r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L7d
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4     // Catch: java.lang.Throwable -> L32
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L32
            r0.label = r3     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L32
            by0 r2 = kotlin.coroutines.intrinsics.a.d(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.initCancellability()     // Catch: java.lang.Throwable -> L32
            androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1 r2 = new androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1     // Catch: java.lang.Throwable -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L32
            r4.invokeOnCompletion(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.getResult()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.h()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L74
            defpackage.hc1.c(r0)     // Catch: java.lang.Throwable -> L32
        L74:
            if (r4 != r1) goto L77
            return r1
        L77:
            r5.mo865invoke()
            ww8 r4 = defpackage.ww8.a
            return r4
        L7d:
            java.lang.String r4 = "Internal error, context should have a job."
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L85:
            r5.mo865invoke()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleProducerScopeImpl.F0(qs2, by0):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        return this.a.close(th);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2 getOnSend() {
        return this.a.getOnSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: invokeOnClose */
    public void mo949invokeOnClose(ss2 ss2Var) {
        zq3.h(ss2Var, "handler");
        this.a.mo949invokeOnClose(ss2Var);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.a.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean offer(Object obj) {
        return this.a.offer(obj);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(Object obj, by0 by0Var) {
        return this.a.send(obj, by0Var);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU, reason: not valid java name */
    public Object mo129trySendJP2dKIU(Object obj) {
        return this.a.mo129trySendJP2dKIU(obj);
    }
}
