package io.reactivex.internal.operators.observable;

import defpackage.kz4;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableWindowBoundarySupplier<T, B> extends AbstractObservableWithUpstream<T, Observable<T>> {
    final int capacityHint;
    final Callable<? extends ObservableSource<B>> other;

    static final class WindowBoundaryInnerObserver<T, B> extends DisposableObserver<B> {
        boolean done;
        final WindowBoundaryMainObserver<T, B> parent;

        WindowBoundaryInnerObserver(WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.parent = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.innerComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.parent.innerError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(B b) {
            if (this.done) {
                return;
            }
            this.done = true;
            dispose();
            this.parent.innerNext(this);
        }
    }

    static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        static final WindowBoundaryInnerObserver<Object, Object> BOUNDARY_DISPOSED = new WindowBoundaryInnerObserver<>(null);
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int capacityHint;
        volatile boolean done;
        final Observer<? super Observable<T>> downstream;
        final Callable<? extends ObservableSource<B>> other;
        Disposable upstream;
        UnicastSubject<T> window;
        final AtomicReference<WindowBoundaryInnerObserver<T, B>> boundaryObserver = new AtomicReference<>();
        final AtomicInteger windows = new AtomicInteger(1);
        final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicBoolean stopWindows = new AtomicBoolean();

        WindowBoundaryMainObserver(Observer<? super Observable<T>> observer, int i, Callable<? extends ObservableSource<B>> callable) {
            this.downstream = observer;
            this.capacityHint = i;
            this.other = callable;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                disposeBoundary();
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.dispose();
                }
            }
        }

        void disposeBoundary() {
            AtomicReference<WindowBoundaryInnerObserver<T, B>> atomicReference = this.boundaryObserver;
            WindowBoundaryInnerObserver<Object, Object> windowBoundaryInnerObserver = BOUNDARY_DISPOSED;
            Disposable disposable = (Disposable) atomicReference.getAndSet(windowBoundaryInnerObserver);
            if (disposable == null || disposable == windowBoundaryInnerObserver) {
                return;
            }
            disposable.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super Observable<T>> observer = this.downstream;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            int i = 1;
            while (this.windows.get() != 0) {
                UnicastSubject<T> unicastSubject = this.window;
                boolean z = this.done;
                if (z && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable terminate = atomicThrowable.terminate();
                    if (unicastSubject != 0) {
                        this.window = null;
                        unicastSubject.onError(terminate);
                    }
                    observer.onError(terminate);
                    return;
                }
                Object poll = mpscLinkedQueue.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    Throwable terminate2 = atomicThrowable.terminate();
                    if (terminate2 == null) {
                        if (unicastSubject != 0) {
                            this.window = null;
                            unicastSubject.onComplete();
                        }
                        observer.onComplete();
                        return;
                    }
                    if (unicastSubject != 0) {
                        this.window = null;
                        unicastSubject.onError(terminate2);
                    }
                    observer.onError(terminate2);
                    return;
                }
                if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll != NEXT_WINDOW) {
                    unicastSubject.onNext(poll);
                } else {
                    if (unicastSubject != 0) {
                        this.window = null;
                        unicastSubject.onComplete();
                    }
                    if (!this.stopWindows.get()) {
                        UnicastSubject<T> create = UnicastSubject.create(this.capacityHint, this);
                        this.window = create;
                        this.windows.getAndIncrement();
                        try {
                            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.other.call(), "The other Callable returned a null ObservableSource");
                            WindowBoundaryInnerObserver windowBoundaryInnerObserver = new WindowBoundaryInnerObserver(this);
                            if (kz4.a(this.boundaryObserver, null, windowBoundaryInnerObserver)) {
                                observableSource.subscribe(windowBoundaryInnerObserver);
                                observer.onNext(create);
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            atomicThrowable.addThrowable(th);
                            this.done = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.window = null;
        }

        void innerComplete() {
            this.upstream.dispose();
            this.done = true;
            drain();
        }

        void innerError(Throwable th) {
            this.upstream.dispose();
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        void innerNext(WindowBoundaryInnerObserver<T, B> windowBoundaryInnerObserver) {
            kz4.a(this.boundaryObserver, windowBoundaryInnerObserver, null);
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.stopWindows.get();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            disposeBoundary();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            disposeBoundary();
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                this.queue.offer(NEXT_WINDOW);
                drain();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }
    }

    public ObservableWindowBoundarySupplier(ObservableSource<T> observableSource, Callable<? extends ObservableSource<B>> callable, int i) {
        super(observableSource);
        this.other = callable;
        this.capacityHint = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        this.source.subscribe(new WindowBoundaryMainObserver(observer, this.capacityHint, this.other));
    }
}
