package io.reactivex.internal.operators.observable;

import defpackage.kz4;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableFlatMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
    final int maxConcurrency;

    static final class InnerObserver<T, U> extends AtomicReference<Disposable> implements Observer<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;
        final long id;
        final MergeObserver<T, U> parent;
        volatile SimpleQueue<U> queue;

        InnerObserver(MergeObserver<T, U> mergeObserver, long j) {
            this.id = j;
            this.parent = mergeObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.parent.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            MergeObserver<T, U> mergeObserver = this.parent;
            if (!mergeObserver.delayErrors) {
                mergeObserver.disposeAll();
            }
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(U u) {
            if (this.fusionMode == 0) {
                this.parent.tryEmit(u, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int requestFusion = queueDisposable.requestFusion(7);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = queueDisposable;
                    this.done = true;
                    this.parent.drain();
                    return;
                }
                if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = queueDisposable;
                }
            }
        }
    }

    static final class MergeObserver<T, U> extends AtomicInteger implements Disposable, Observer<T> {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Observer<? super U> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<InnerObserver<?, ?>[]> observers;
        volatile SimplePlainQueue<U> queue;
        Queue<ObservableSource<? extends U>> sources;
        long uniqueId;
        Disposable upstream;
        int wip;
        static final InnerObserver<?, ?>[] EMPTY = new InnerObserver[0];
        static final InnerObserver<?, ?>[] CANCELLED = new InnerObserver[0];

        MergeObserver(Observer<? super U> observer, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            if (i != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i);
            }
            this.observers = new AtomicReference<>(EMPTY);
        }

        boolean addInner(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                if (innerObserverArr == CANCELLED) {
                    innerObserver.dispose();
                    return false;
                }
                int length = innerObserverArr.length;
                innerObserverArr2 = new InnerObserver[length + 1];
                System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                innerObserverArr2[length] = innerObserver;
            } while (!kz4.a(this.observers, innerObserverArr, innerObserverArr2));
            return true;
        }

        boolean checkTerminate() {
            if (this.cancelled) {
                return true;
            }
            Throwable th = this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            disposeAll();
            Throwable terminate = this.errors.terminate();
            if (terminate != ExceptionHelper.TERMINATED) {
                this.downstream.onError(terminate);
            }
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Throwable terminate;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (!disposeAll() || (terminate = this.errors.terminate()) == null || terminate == ExceptionHelper.TERMINATED) {
                return;
            }
            RxJavaPlugins.onError(terminate);
        }

        boolean disposeAll() {
            InnerObserver<?, ?>[] andSet;
            this.upstream.dispose();
            InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
            InnerObserver<?, ?>[] innerObserverArr2 = CANCELLED;
            if (innerObserverArr == innerObserverArr2 || (andSet = this.observers.getAndSet(innerObserverArr2)) == innerObserverArr2) {
                return false;
            }
            for (InnerObserver<?, ?> innerObserver : andSet) {
                innerObserver.dispose();
            }
            return true;
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drainLoop() {
            int i;
            int i2;
            Observer<? super U> observer = this.downstream;
            int i3 = 1;
            while (!checkTerminate()) {
                SimplePlainQueue<U> simplePlainQueue = this.queue;
                int i4 = 0;
                if (simplePlainQueue != null) {
                    while (!checkTerminate()) {
                        U poll = simplePlainQueue.poll();
                        if (poll != null) {
                            observer.onNext(poll);
                            i4++;
                        }
                    }
                    return;
                }
                if (i4 == 0) {
                    boolean z = this.done;
                    SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                    InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
                    int length = innerObserverArr.length;
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            i = this.sources.size();
                        }
                    } else {
                        i = 0;
                    }
                    if (z && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0 && i == 0)) {
                        Throwable terminate = this.errors.terminate();
                        if (terminate != ExceptionHelper.TERMINATED) {
                            if (terminate == null) {
                                observer.onComplete();
                                return;
                            } else {
                                observer.onError(terminate);
                                return;
                            }
                        }
                        return;
                    }
                    if (length != 0) {
                        long j = this.lastId;
                        int i5 = this.lastIndex;
                        if (length <= i5 || innerObserverArr[i5].id != j) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            for (int i6 = 0; i6 < length && innerObserverArr[i5].id != j; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.lastIndex = i5;
                            this.lastId = innerObserverArr[i5].id;
                        }
                        for (0; i2 < length; i2 + 1) {
                            if (checkTerminate()) {
                                return;
                            }
                            InnerObserver<T, U> innerObserver = innerObserverArr[i5];
                            SimpleQueue<U> simpleQueue = innerObserver.queue;
                            if (simpleQueue != null) {
                                do {
                                    try {
                                        U poll2 = simpleQueue.poll();
                                        if (poll2 != null) {
                                            observer.onNext(poll2);
                                        }
                                    } catch (Throwable th) {
                                        Exceptions.throwIfFatal(th);
                                        innerObserver.dispose();
                                        this.errors.addThrowable(th);
                                        if (checkTerminate()) {
                                            return;
                                        }
                                        removeInner(innerObserver);
                                        i4++;
                                        i5++;
                                        if (i5 != length) {
                                        }
                                    }
                                } while (!checkTerminate());
                                return;
                            }
                            boolean z2 = innerObserver.done;
                            SimpleQueue<U> simpleQueue2 = innerObserver.queue;
                            if (z2 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                removeInner(innerObserver);
                                if (checkTerminate()) {
                                    return;
                                } else {
                                    i4++;
                                }
                            }
                            i5++;
                            i2 = i5 != length ? i2 + 1 : 0;
                            i5 = 0;
                        }
                        this.lastIndex = i5;
                        this.lastId = innerObserverArr[i5].id;
                    }
                    if (i4 == 0) {
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                        subscribeMore(i4);
                    }
                } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    subscribeMore(i4);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                ObservableSource<? extends U> observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null ObservableSource");
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.wip;
                            if (i == this.maxConcurrency) {
                                this.sources.offer(observableSource);
                                return;
                            }
                            this.wip = i + 1;
                        } finally {
                        }
                    }
                }
                subscribeInner(observableSource);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void removeInner(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerObserverArr[i] == innerObserver) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = EMPTY;
                } else {
                    InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i);
                    System.arraycopy(innerObserverArr, i + 1, innerObserverArr3, i, (length - i) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!kz4.a(this.observers, innerObserverArr, innerObserverArr2));
        }

        void subscribeInner(ObservableSource<? extends U> observableSource) {
            boolean z;
            while (observableSource instanceof Callable) {
                if (!tryEmitScalar((Callable) observableSource) || this.maxConcurrency == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        observableSource = this.sources.poll();
                        if (observableSource == null) {
                            z = true;
                            this.wip--;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    drain();
                    return;
                }
            }
            long j = this.uniqueId;
            this.uniqueId = 1 + j;
            InnerObserver<T, U> innerObserver = new InnerObserver<>(this, j);
            if (addInner(innerObserver)) {
                observableSource.subscribe(innerObserver);
            }
        }

        void subscribeMore(int i) {
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        ObservableSource<? extends U> poll = this.sources.poll();
                        if (poll == null) {
                            this.wip--;
                        } else {
                            subscribeInner(poll);
                        }
                    } finally {
                    }
                }
                i = i2;
            }
        }

        void tryEmit(U u, InnerObserver<T, U> innerObserver) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue simpleQueue = innerObserver.queue;
                if (simpleQueue == null) {
                    simpleQueue = new SpscLinkedArrayQueue(this.bufferSize);
                    innerObserver.queue = simpleQueue;
                }
                simpleQueue.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        boolean tryEmitScalar(Callable<? extends U> callable) {
            try {
                U call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.downstream.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    SimplePlainQueue<U> simplePlainQueue = this.queue;
                    if (simplePlainQueue == null) {
                        simplePlainQueue = this.maxConcurrency == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                        this.queue = simplePlainQueue;
                    }
                    if (!simplePlainQueue.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                drainLoop();
                return true;
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.errors.addThrowable(th);
                drain();
                return true;
            }
        }
    }

    public ObservableFlatMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
        super(observableSource);
        this.mapper = function;
        this.delayErrors = z;
        this.maxConcurrency = i;
        this.bufferSize = i2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.mapper)) {
            return;
        }
        this.source.subscribe(new MergeObserver(observer, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
