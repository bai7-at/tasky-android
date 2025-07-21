package io.reactivex.internal.operators.flowable;

import defpackage.hb8;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class FlowableRefCount<T> extends Flowable<T> {
    RefConnection connection;
    final int n;
    final Scheduler scheduler;
    final ConnectableFlowable<T> source;
    final long timeout;
    final TimeUnit unit;

    static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final FlowableRefCount<?> parent;
        long subscriberCount;
        Disposable timer;

        RefConnection(FlowableRefCount<?> flowableRefCount) {
            this.parent = flowableRefCount;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.timeout(this);
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Disposable disposable) throws Exception {
            DisposableHelper.replace(this, disposable);
            synchronized (this.parent) {
                try {
                    if (this.disconnectedEarly) {
                        ((ResettableConnectable) this.parent.source).resetIf(disposable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static final class RefCountSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, hb8 {
        private static final long serialVersionUID = -7419642935409022375L;
        final RefConnection connection;
        final va8 downstream;
        final FlowableRefCount<T> parent;
        hb8 upstream;

        RefCountSubscriber(va8 va8Var, FlowableRefCount<T> flowableRefCount, RefConnection refConnection) {
            this.downstream = va8Var;
            this.parent = flowableRefCount;
            this.connection = refConnection;
        }

        @Override // defpackage.hb8
        public void cancel() {
            this.upstream.cancel();
            if (compareAndSet(false, true)) {
                this.parent.cancel(this.connection);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.terminated(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.onError(th);
            } else {
                this.parent.terminated(this.connection);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onSubscribe(hb8 hb8Var) {
            if (SubscriptionHelper.validate(this.upstream, hb8Var)) {
                this.upstream = hb8Var;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.hb8
        public void request(long j) {
            this.upstream.request(j);
        }
    }

    public FlowableRefCount(ConnectableFlowable<T> connectableFlowable) {
        this(connectableFlowable, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    void cancel(RefConnection refConnection) {
        synchronized (this) {
            try {
                RefConnection refConnection2 = this.connection;
                if (refConnection2 != null && refConnection2 == refConnection) {
                    long j = refConnection.subscriberCount - 1;
                    refConnection.subscriberCount = j;
                    if (j == 0 && refConnection.connected) {
                        if (this.timeout == 0) {
                            timeout(refConnection);
                            return;
                        }
                        SequentialDisposable sequentialDisposable = new SequentialDisposable();
                        refConnection.timer = sequentialDisposable;
                        sequentialDisposable.replace(this.scheduler.scheduleDirect(refConnection, this.timeout, this.unit));
                    }
                }
            } finally {
            }
        }
    }

    void clearTimer(RefConnection refConnection) {
        Disposable disposable = refConnection.timer;
        if (disposable != null) {
            disposable.dispose();
            refConnection.timer = null;
        }
    }

    void reset(RefConnection refConnection) {
        ConnectableFlowable<T> connectableFlowable = this.source;
        if (connectableFlowable instanceof Disposable) {
            ((Disposable) connectableFlowable).dispose();
        } else if (connectableFlowable instanceof ResettableConnectable) {
            ((ResettableConnectable) connectableFlowable).resetIf(refConnection.get());
        }
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(va8 va8Var) {
        RefConnection refConnection;
        boolean z;
        Disposable disposable;
        synchronized (this) {
            try {
                refConnection = this.connection;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.connection = refConnection;
                }
                long j = refConnection.subscriberCount;
                if (j == 0 && (disposable = refConnection.timer) != null) {
                    disposable.dispose();
                }
                long j2 = j + 1;
                refConnection.subscriberCount = j2;
                if (refConnection.connected || j2 != this.n) {
                    z = false;
                } else {
                    z = true;
                    refConnection.connected = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.source.subscribe((FlowableSubscriber) new RefCountSubscriber(va8Var, this, refConnection));
        if (z) {
            this.source.connect(refConnection);
        }
    }

    void terminated(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (this.source instanceof FlowablePublishClassic) {
                    RefConnection refConnection2 = this.connection;
                    if (refConnection2 != null && refConnection2 == refConnection) {
                        this.connection = null;
                        clearTimer(refConnection);
                    }
                    long j = refConnection.subscriberCount - 1;
                    refConnection.subscriberCount = j;
                    if (j == 0) {
                        reset(refConnection);
                    }
                } else {
                    RefConnection refConnection3 = this.connection;
                    if (refConnection3 != null && refConnection3 == refConnection) {
                        clearTimer(refConnection);
                        long j2 = refConnection.subscriberCount - 1;
                        refConnection.subscriberCount = j2;
                        if (j2 == 0) {
                            this.connection = null;
                            reset(refConnection);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void timeout(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (refConnection.subscriberCount == 0 && refConnection == this.connection) {
                    this.connection = null;
                    Disposable disposable = refConnection.get();
                    DisposableHelper.dispose(refConnection);
                    ConnectableFlowable<T> connectableFlowable = this.source;
                    if (connectableFlowable instanceof Disposable) {
                        ((Disposable) connectableFlowable).dispose();
                    } else if (connectableFlowable instanceof ResettableConnectable) {
                        if (disposable == null) {
                            refConnection.disconnectedEarly = true;
                        } else {
                            ((ResettableConnectable) connectableFlowable).resetIf(disposable);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FlowableRefCount(ConnectableFlowable<T> connectableFlowable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.source = connectableFlowable;
        this.n = i;
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }
}
