package kotlinx.coroutines.reactive;

import defpackage.hb8;
import defpackage.va8;
import defpackage.zq3;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;

/* loaded from: classes5.dex */
final class ReactiveSubscriber<T> implements va8 {
    private final Channel<T> channel;
    private final long requestSize;
    private hb8 subscription;

    public ReactiveSubscriber(int i, BufferOverflow bufferOverflow, long j) {
        this.requestSize = j;
        this.channel = kotlinx.coroutines.channels.ChannelKt.Channel$default(i == 0 ? 1 : i, bufferOverflow, null, 4, null);
    }

    public final void cancel() {
        hb8 hb8Var = this.subscription;
        if (hb8Var == null) {
            zq3.z("subscription");
            hb8Var = null;
        }
        hb8Var.cancel();
    }

    public final void makeRequest() {
        hb8 hb8Var = this.subscription;
        if (hb8Var == null) {
            zq3.z("subscription");
            hb8Var = null;
        }
        hb8Var.request(this.requestSize);
    }

    @Override // defpackage.va8
    public void onComplete() {
        SendChannel.DefaultImpls.close$default(this.channel, null, 1, null);
    }

    @Override // defpackage.va8
    public void onError(Throwable th) {
        this.channel.close(th);
    }

    @Override // defpackage.va8
    public void onNext(T t) {
        if (ChannelResult.m902isSuccessimpl(this.channel.mo129trySendJP2dKIU(t))) {
            return;
        }
        throw new IllegalArgumentException(("Element " + t + " was not added to channel because it was full, " + this.channel).toString());
    }

    @Override // defpackage.va8
    public void onSubscribe(hb8 hb8Var) {
        this.subscription = hb8Var;
        makeRequest();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object takeNextOrNull(defpackage.by0<? super T> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1 r0 = (kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1 r0 = new kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.f.b(r5)
            kotlinx.coroutines.channels.ChannelResult r5 = (kotlinx.coroutines.channels.ChannelResult) r5
            java.lang.Object r4 = r5.m904unboximpl()
            goto L45
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r5)
            kotlinx.coroutines.channels.Channel<T> r4 = r4.channel
            r0.label = r3
            java.lang.Object r4 = r4.mo886receiveCatchingJP2dKIU(r0)
            if (r4 != r1) goto L45
            return r1
        L45:
            java.lang.Throwable r5 = kotlinx.coroutines.channels.ChannelResult.m896exceptionOrNullimpl(r4)
            if (r5 != 0) goto L54
            boolean r5 = r4 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r5 == 0) goto L53
            kotlinx.coroutines.channels.ChannelResult.m896exceptionOrNullimpl(r4)
            r4 = 0
        L53:
            return r4
        L54:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.ReactiveSubscriber.takeNextOrNull(by0):java.lang.Object");
    }
}
