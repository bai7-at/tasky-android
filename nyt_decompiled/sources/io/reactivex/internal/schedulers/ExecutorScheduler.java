package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ExecutorScheduler extends Scheduler {
    static final Scheduler HELPER = Schedulers.single();

    @NonNull
    final Executor executor;
    final boolean interruptibleWorker;

    final class DelayedDispose implements Runnable {
        private final DelayedRunnable dr;

        DelayedDispose(DelayedRunnable delayedRunnable) {
            this.dr = delayedRunnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            DelayedRunnable delayedRunnable = this.dr;
            delayedRunnable.direct.replace(ExecutorScheduler.this.scheduleDirect(delayedRunnable));
        }
    }

    static final class DelayedRunnable extends AtomicReference<Runnable> implements Runnable, Disposable, SchedulerRunnableIntrospection {
        private static final long serialVersionUID = -4101336210206799084L;
        final SequentialDisposable direct;
        final SequentialDisposable timed;

        DelayedRunnable(Runnable runnable) {
            super(runnable);
            this.timed = new SequentialDisposable();
            this.direct = new SequentialDisposable();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (getAndSet(null) != null) {
                this.timed.dispose();
                this.direct.dispose();
            }
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public Runnable getWrappedRunnable() {
            Runnable runnable = get();
            return runnable != null ? runnable : Functions.EMPTY_RUNNABLE;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    SequentialDisposable sequentialDisposable = this.timed;
                    DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                    sequentialDisposable.lazySet(disposableHelper);
                    this.direct.lazySet(disposableHelper);
                } catch (Throwable th) {
                    lazySet(null);
                    this.timed.lazySet(DisposableHelper.DISPOSED);
                    this.direct.lazySet(DisposableHelper.DISPOSED);
                    throw th;
                }
            }
        }
    }

    public ExecutorScheduler(@NonNull Executor executor, boolean z) {
        this.executor = executor;
        this.interruptibleWorker = z;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new ExecutorWorker(this.executor, this.interruptibleWorker);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable) {
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        try {
            if (this.executor instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(onSchedule);
                scheduledDirectTask.setFuture(((ExecutorService) this.executor).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            if (this.interruptibleWorker) {
                ExecutorWorker.InterruptibleRunnable interruptibleRunnable = new ExecutorWorker.InterruptibleRunnable(onSchedule, null);
                this.executor.execute(interruptibleRunnable);
                return interruptibleRunnable;
            }
            ExecutorWorker.BooleanRunnable booleanRunnable = new ExecutorWorker.BooleanRunnable(onSchedule);
            this.executor.execute(booleanRunnable);
            return booleanRunnable;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.onError(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.executor instanceof ScheduledExecutorService)) {
            return super.schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(RxJavaPlugins.onSchedule(runnable));
            scheduledDirectPeriodicTask.setFuture(((ScheduledExecutorService) this.executor).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.onError(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        if (this.executor instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(onSchedule);
                scheduledDirectTask.setFuture(((ScheduledExecutorService) this.executor).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.onError(e);
                return EmptyDisposable.INSTANCE;
            }
        }
        DelayedRunnable delayedRunnable = new DelayedRunnable(onSchedule);
        delayedRunnable.timed.replace(HELPER.scheduleDirect(new DelayedDispose(delayedRunnable), j, timeUnit));
        return delayedRunnable;
    }

    public static final class ExecutorWorker extends Scheduler.Worker implements Runnable {
        volatile boolean disposed;
        final Executor executor;
        final boolean interruptibleWorker;
        final AtomicInteger wip = new AtomicInteger();
        final CompositeDisposable tasks = new CompositeDisposable();
        final MpscLinkedQueue<Runnable> queue = new MpscLinkedQueue<>();

        static final class BooleanRunnable extends AtomicBoolean implements Runnable, Disposable {
            private static final long serialVersionUID = -2421395018820541164L;
            final Runnable actual;

            BooleanRunnable(Runnable runnable) {
                this.actual = runnable;
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.actual.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        static final class InterruptibleRunnable extends AtomicInteger implements Runnable, Disposable {
            static final int FINISHED = 2;
            static final int INTERRUPTED = 4;
            static final int INTERRUPTING = 3;
            static final int READY = 0;
            static final int RUNNING = 1;
            private static final long serialVersionUID = -3603436687413320876L;
            final Runnable run;
            final DisposableContainer tasks;
            volatile Thread thread;

            InterruptibleRunnable(Runnable runnable, DisposableContainer disposableContainer) {
                this.run = runnable;
                this.tasks = disposableContainer;
            }

            void cleanup() {
                DisposableContainer disposableContainer = this.tasks;
                if (disposableContainer != null) {
                    disposableContainer.delete(this);
                }
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            cleanup();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.thread;
                        if (thread != null) {
                            thread.interrupt();
                            this.thread = null;
                        }
                        set(4);
                        cleanup();
                        return;
                    }
                }
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.thread = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.thread = null;
                        return;
                    }
                    try {
                        this.run.run();
                        this.thread = null;
                        if (compareAndSet(1, 2)) {
                            cleanup();
                            return;
                        }
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } catch (Throwable th) {
                        this.thread = null;
                        if (compareAndSet(1, 2)) {
                            cleanup();
                        } else {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        }
                        throw th;
                    }
                }
            }
        }

        final class SequentialDispose implements Runnable {
            private final Runnable decoratedRun;
            private final SequentialDisposable mar;

            SequentialDispose(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.mar = sequentialDisposable;
                this.decoratedRun = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.mar.replace(ExecutorWorker.this.schedule(this.decoratedRun));
            }
        }

        public ExecutorWorker(Executor executor, boolean z) {
            this.executor = executor;
            this.interruptibleWorker = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.tasks.dispose();
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // java.lang.Runnable
        public void run() {
            MpscLinkedQueue<Runnable> mpscLinkedQueue = this.queue;
            int i = 1;
            while (!this.disposed) {
                do {
                    Runnable poll = mpscLinkedQueue.poll();
                    if (poll != null) {
                        poll.run();
                    } else if (this.disposed) {
                        mpscLinkedQueue.clear();
                        return;
                    } else {
                        i = this.wip.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } while (!this.disposed);
                mpscLinkedQueue.clear();
                return;
            }
            mpscLinkedQueue.clear();
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            Disposable booleanRunnable;
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
            if (this.interruptibleWorker) {
                booleanRunnable = new InterruptibleRunnable(onSchedule, this.tasks);
                this.tasks.add(booleanRunnable);
            } else {
                booleanRunnable = new BooleanRunnable(onSchedule);
            }
            this.queue.offer(booleanRunnable);
            if (this.wip.getAndIncrement() == 0) {
                try {
                    this.executor.execute(this);
                } catch (RejectedExecutionException e) {
                    this.disposed = true;
                    this.queue.clear();
                    RxJavaPlugins.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            }
            return booleanRunnable;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            if (j <= 0) {
                return schedule(runnable);
            }
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new SequentialDispose(sequentialDisposable2, RxJavaPlugins.onSchedule(runnable)), this.tasks);
            this.tasks.add(scheduledRunnable);
            Executor executor = this.executor;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.setFuture(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.disposed = true;
                    RxJavaPlugins.onError(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.setFuture(new DisposeOnCancel(ExecutorScheduler.HELPER.scheduleDirect(scheduledRunnable, j, timeUnit)));
            }
            sequentialDisposable.replace(scheduledRunnable);
            return sequentialDisposable2;
        }
    }
}
