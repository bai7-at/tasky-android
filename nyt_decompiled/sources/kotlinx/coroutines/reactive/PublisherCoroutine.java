package kotlinx.coroutines.reactive;

import defpackage.g62;
import defpackage.gt2;
import defpackage.hb8;
import defpackage.it2;
import defpackage.ku8;
import defpackage.ss2;
import defpackage.va8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@InternalCoroutinesApi
/* loaded from: classes5.dex */
public final class PublisherCoroutine<T> extends AbstractCoroutine<ww8> implements ProducerScope<T>, hb8 {
    private static final /* synthetic */ AtomicLongFieldUpdater _nRequested$volatile$FU = AtomicLongFieldUpdater.newUpdater(PublisherCoroutine.class, "_nRequested$volatile");
    private volatile /* synthetic */ long _nRequested$volatile;
    private volatile boolean cancelled;
    private final gt2 exceptionOnCancelHandler;
    private final Mutex mutex;
    private final va8 subscriber;

    public PublisherCoroutine(CoroutineContext coroutineContext, va8 va8Var, gt2 gt2Var) {
        super(coroutineContext, false, true);
        this.subscriber = va8Var;
        this.exceptionOnCancelHandler = gt2Var;
        this.mutex = MutexKt.Mutex(true);
    }

    private final Throwable doLockedNext(T t) {
        if (t == null) {
            unlockAndCheckCompleted();
            throw new NullPointerException("Attempted to emit `null` inside a reactive publisher");
        }
        if (!isActive()) {
            unlockAndCheckCompleted();
            return getCancellationException();
        }
        try {
            this.subscriber.onNext(t);
            while (true) {
                long j = _nRequested$volatile$FU.get(this);
                if (j < 0 || j == Long.MAX_VALUE) {
                    break;
                }
                long j2 = j - 1;
                if (_nRequested$volatile$FU.compareAndSet(this, j, j2)) {
                    if (j2 == 0) {
                        return null;
                    }
                }
            }
            unlockAndCheckCompleted();
            return null;
        } catch (Throwable th) {
            this.cancelled = true;
            boolean close = close(th);
            unlockAndCheckCompleted();
            if (close) {
                return th;
            }
            this.exceptionOnCancelHandler.invoke(th, getContext());
            return getCancellationException();
        }
    }

    private final void doLockedSignalCompleted(Throwable th, boolean z) {
        if (_nRequested$volatile$FU.get(this) != -2) {
            _nRequested$volatile$FU.set(this, -2L);
            if (!this.cancelled) {
                if (th == null) {
                    try {
                        this.subscriber.onComplete();
                    } catch (Throwable th2) {
                        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th2);
                    }
                    return;
                } else {
                    try {
                        this.subscriber.onError(th);
                    } catch (Throwable th3) {
                        if (th3 != th) {
                            g62.a(th, th3);
                        }
                        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th);
                    }
                    return;
                }
                Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
            }
            if (th != null && !z) {
                this.exceptionOnCancelHandler.invoke(th, getContext());
            }
        }
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private final /* synthetic */ long get_nRequested$volatile() {
        return this._nRequested$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object processResultSelectSend(Object obj, Object obj2) {
        Throwable doLockedNext = doLockedNext(obj);
        if (doLockedNext == null) {
            return this;
        }
        throw doLockedNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) {
        if (Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            selectInstance.selectInRegistrationPhase(ww8.a);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new PublisherCoroutine$registerSelectForSend$1(this, selectInstance, null), 3, null);
        }
    }

    private final /* synthetic */ void set_nRequested$volatile(long j) {
        this._nRequested$volatile = j;
    }

    private final void signalCompleted(Throwable th, boolean z) {
        long j;
        do {
            j = _nRequested$volatile$FU.get(this);
            if (j == -2) {
                return;
            }
            if (j < 0) {
                throw new IllegalStateException("Check failed.");
            }
        } while (!_nRequested$volatile$FU.compareAndSet(this, j, -1L));
        if (j == 0) {
            doLockedSignalCompleted(th, z);
        } else if (Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            doLockedSignalCompleted(th, z);
        }
    }

    private final void unlockAndCheckCompleted() {
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        if (isCompleted() && Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            doLockedSignalCompleted(getCompletionCause(), getCompletionCauseHandled());
        }
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public void cancel() {
        this.cancelled = true;
        super.cancel((CancellationException) null);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        return cancelCoroutine(th);
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public SendChannel<T> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<T, SendChannel<T>> getOnSend() {
        PublisherCoroutine$onSend$1 publisherCoroutine$onSend$1 = PublisherCoroutine$onSend$1.INSTANCE;
        zq3.f(publisherCoroutine$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        it2 it2Var = (it2) ku8.f(publisherCoroutine$onSend$1, 3);
        PublisherCoroutine$onSend$2 publisherCoroutine$onSend$2 = PublisherCoroutine$onSend$2.INSTANCE;
        zq3.f(publisherCoroutine$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause2Impl(this, it2Var, (it2) ku8.f(publisherCoroutine$onSend$2, 3), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return !isActive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean offer(T t) {
        return ProducerScope.DefaultImpls.offer(this, t);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCancelled(Throwable th, boolean z) {
        signalCompleted(th, z);
    }

    @Override // defpackage.hb8
    public void request(long j) {
        long j2;
        long j3;
        if (j <= 0) {
            cancelCoroutine(new IllegalArgumentException("non-positive subscription request " + j));
            return;
        }
        do {
            j2 = _nRequested$volatile$FU.get(this);
            if (j2 < 0) {
                return;
            }
            long j4 = j2 + j;
            j3 = (j4 < 0 || j == Long.MAX_VALUE) ? Long.MAX_VALUE : j4;
            if (j2 == j3) {
                return;
            }
        } while (!_nRequested$volatile$FU.compareAndSet(this, j2, j3));
        if (j2 == 0) {
            unlockAndCheckCompleted();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.channels.SendChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object send(T r5, defpackage.by0<? super defpackage.ww8> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.reactive.PublisherCoroutine$send$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.reactive.PublisherCoroutine$send$1 r0 = (kotlinx.coroutines.reactive.PublisherCoroutine$send$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.PublisherCoroutine$send$1 r0 = new kotlinx.coroutines.reactive.PublisherCoroutine$send$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.reactive.PublisherCoroutine r4 = (kotlinx.coroutines.reactive.PublisherCoroutine) r4
            kotlin.f.b(r6)
            goto L4a
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = r4.mutex
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            r2 = 0
            java.lang.Object r6 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r6, r2, r0, r3, r2)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Throwable r4 = r4.doLockedNext(r5)
            if (r4 != 0) goto L53
            ww8 r4 = defpackage.ww8.a
            return r4
        L53:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.PublisherCoroutine.send(java.lang.Object, by0):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo129trySendJP2dKIU(T t) {
        if (!Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null)) {
            return ChannelResult.Companion.m906failurePtdJZtk();
        }
        Throwable doLockedNext = doLockedNext(t);
        return doLockedNext == null ? ChannelResult.Companion.m907successJP2dKIU(ww8.a) : ChannelResult.Companion.m905closedJP2dKIU(doLockedNext);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: invokeOnClose, reason: merged with bridge method [inline-methods] */
    public Void mo949invokeOnClose(ss2 ss2Var) {
        throw new UnsupportedOperationException("PublisherCoroutine doesn't support invokeOnClose");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(ww8 ww8Var) {
        signalCompleted(null, false);
    }
}
