package io.reactivex;

import defpackage.g86;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.observers.BlockingMultiObserver;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableAmb;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.internal.operators.completable.CompletableCache;
import io.reactivex.internal.operators.completable.CompletableConcat;
import io.reactivex.internal.operators.completable.CompletableConcatArray;
import io.reactivex.internal.operators.completable.CompletableConcatIterable;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.internal.operators.completable.CompletableDefer;
import io.reactivex.internal.operators.completable.CompletableDelay;
import io.reactivex.internal.operators.completable.CompletableDetach;
import io.reactivex.internal.operators.completable.CompletableDisposeOn;
import io.reactivex.internal.operators.completable.CompletableDoFinally;
import io.reactivex.internal.operators.completable.CompletableDoOnEvent;
import io.reactivex.internal.operators.completable.CompletableEmpty;
import io.reactivex.internal.operators.completable.CompletableError;
import io.reactivex.internal.operators.completable.CompletableErrorSupplier;
import io.reactivex.internal.operators.completable.CompletableFromAction;
import io.reactivex.internal.operators.completable.CompletableFromCallable;
import io.reactivex.internal.operators.completable.CompletableFromObservable;
import io.reactivex.internal.operators.completable.CompletableFromPublisher;
import io.reactivex.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.internal.operators.completable.CompletableFromSingle;
import io.reactivex.internal.operators.completable.CompletableFromUnsafeSource;
import io.reactivex.internal.operators.completable.CompletableHide;
import io.reactivex.internal.operators.completable.CompletableLift;
import io.reactivex.internal.operators.completable.CompletableMaterialize;
import io.reactivex.internal.operators.completable.CompletableMerge;
import io.reactivex.internal.operators.completable.CompletableMergeArray;
import io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray;
import io.reactivex.internal.operators.completable.CompletableMergeDelayErrorIterable;
import io.reactivex.internal.operators.completable.CompletableMergeIterable;
import io.reactivex.internal.operators.completable.CompletableNever;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.internal.operators.completable.CompletablePeek;
import io.reactivex.internal.operators.completable.CompletableResumeNext;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable;
import io.reactivex.internal.operators.completable.CompletableTimeout;
import io.reactivex.internal.operators.completable.CompletableTimer;
import io.reactivex.internal.operators.completable.CompletableToFlowable;
import io.reactivex.internal.operators.completable.CompletableToObservable;
import io.reactivex.internal.operators.completable.CompletableToSingle;
import io.reactivex.internal.operators.completable.CompletableUsing;
import io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable;
import io.reactivex.internal.operators.maybe.MaybeFromCompletable;
import io.reactivex.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.internal.operators.mixed.CompletableAndThenObservable;
import io.reactivex.internal.operators.mixed.CompletableAndThenPublisher;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.TestObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class Completable implements CompletableSource {
    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable amb(Iterable<? extends CompletableSource> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableAmb(null, iterable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable ambArray(CompletableSource... completableSourceArr) {
        ObjectHelper.requireNonNull(completableSourceArr, "sources is null");
        return completableSourceArr.length == 0 ? complete() : completableSourceArr.length == 1 ? wrap(completableSourceArr[0]) : RxJavaPlugins.onAssembly(new CompletableAmb(completableSourceArr, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable complete() {
        return RxJavaPlugins.onAssembly(CompletableEmpty.INSTANCE);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable concat(Iterable<? extends CompletableSource> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableConcatIterable(iterable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable concatArray(CompletableSource... completableSourceArr) {
        ObjectHelper.requireNonNull(completableSourceArr, "sources is null");
        return completableSourceArr.length == 0 ? complete() : completableSourceArr.length == 1 ? wrap(completableSourceArr[0]) : RxJavaPlugins.onAssembly(new CompletableConcatArray(completableSourceArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable create(CompletableOnSubscribe completableOnSubscribe) {
        ObjectHelper.requireNonNull(completableOnSubscribe, "source is null");
        return RxJavaPlugins.onAssembly(new CompletableCreate(completableOnSubscribe));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable defer(Callable<? extends CompletableSource> callable) {
        ObjectHelper.requireNonNull(callable, "completableSupplier");
        return RxJavaPlugins.onAssembly(new CompletableDefer(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    private Completable doOnLifecycle(Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2, Action action3, Action action4) {
        ObjectHelper.requireNonNull(consumer, "onSubscribe is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        ObjectHelper.requireNonNull(action2, "onTerminate is null");
        ObjectHelper.requireNonNull(action3, "onAfterTerminate is null");
        ObjectHelper.requireNonNull(action4, "onDispose is null");
        return RxJavaPlugins.onAssembly(new CompletablePeek(this, consumer, consumer2, action, action2, action3, action4));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable error(Callable<? extends Throwable> callable) {
        ObjectHelper.requireNonNull(callable, "errorSupplier is null");
        return RxJavaPlugins.onAssembly(new CompletableErrorSupplier(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable fromAction(Action action) {
        ObjectHelper.requireNonNull(action, "run is null");
        return RxJavaPlugins.onAssembly(new CompletableFromAction(action));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable fromCallable(Callable<?> callable) {
        ObjectHelper.requireNonNull(callable, "callable is null");
        return RxJavaPlugins.onAssembly(new CompletableFromCallable(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable fromFuture(Future<?> future) {
        ObjectHelper.requireNonNull(future, "future is null");
        return fromAction(Functions.futureAction(future));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Completable fromMaybe(MaybeSource<T> maybeSource) {
        ObjectHelper.requireNonNull(maybeSource, "maybe is null");
        return RxJavaPlugins.onAssembly(new MaybeIgnoreElementCompletable(maybeSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Completable fromObservable(ObservableSource<T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "observable is null");
        return RxJavaPlugins.onAssembly(new CompletableFromObservable(observableSource));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public static <T> Completable fromPublisher(g86 g86Var) {
        ObjectHelper.requireNonNull(g86Var, "publisher is null");
        return RxJavaPlugins.onAssembly(new CompletableFromPublisher(g86Var));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable fromRunnable(Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "run is null");
        return RxJavaPlugins.onAssembly(new CompletableFromRunnable(runnable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Completable fromSingle(SingleSource<T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "single is null");
        return RxJavaPlugins.onAssembly(new CompletableFromSingle(singleSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable merge(Iterable<? extends CompletableSource> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableMergeIterable(iterable));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    private static Completable merge0(g86 g86Var, int i, boolean z) {
        ObjectHelper.requireNonNull(g86Var, "sources is null");
        ObjectHelper.verifyPositive(i, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new CompletableMerge(g86Var, i, z));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable mergeArray(CompletableSource... completableSourceArr) {
        ObjectHelper.requireNonNull(completableSourceArr, "sources is null");
        return completableSourceArr.length == 0 ? complete() : completableSourceArr.length == 1 ? wrap(completableSourceArr[0]) : RxJavaPlugins.onAssembly(new CompletableMergeArray(completableSourceArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable mergeArrayDelayError(CompletableSource... completableSourceArr) {
        ObjectHelper.requireNonNull(completableSourceArr, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableMergeDelayErrorArray(completableSourceArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable mergeDelayError(Iterable<? extends CompletableSource> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new CompletableMergeDelayErrorIterable(iterable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static Completable never() {
        return RxJavaPlugins.onAssembly(CompletableNever.INSTANCE);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @NonNull
    private Completable timeout0(long j, TimeUnit timeUnit, Scheduler scheduler, CompletableSource completableSource) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableTimeout(this, j, timeUnit, scheduler, completableSource));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public static Completable timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, Schedulers.computation());
    }

    private static NullPointerException toNpe(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable unsafeCreate(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "source is null");
        if (completableSource instanceof Completable) {
            throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
        }
        return RxJavaPlugins.onAssembly(new CompletableFromUnsafeSource(completableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <R> Completable using(Callable<R> callable, Function<? super R, ? extends CompletableSource> function, Consumer<? super R> consumer) {
        return using(callable, function, consumer, true);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable wrap(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "source is null");
        return completableSource instanceof Completable ? RxJavaPlugins.onAssembly((Completable) completableSource) : RxJavaPlugins.onAssembly(new CompletableFromUnsafeSource(completableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Completable ambWith(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return ambArray(this, completableSource);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <T> Observable<T> andThen(ObservableSource<T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenObservable(this, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> R as(@NonNull CompletableConverter<? extends R> completableConverter) {
        return (R) ((CompletableConverter) ObjectHelper.requireNonNull(completableConverter, "converter is null")).apply(this);
    }

    @SchedulerSupport("none")
    public final void blockingAwait() {
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        blockingMultiObserver.blockingGet();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @Nullable
    public final Throwable blockingGet() {
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        return blockingMultiObserver.blockingGetError();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable cache() {
        return RxJavaPlugins.onAssembly(new CompletableCache(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable compose(CompletableTransformer completableTransformer) {
        return wrap(((CompletableTransformer) ObjectHelper.requireNonNull(completableTransformer, "transformer is null")).apply(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Completable concatWith(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenCompletable(this, completableSource));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Completable delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, Schedulers.computation(), false);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    @Experimental
    public final Completable delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable doAfterTerminate(Action action) {
        Consumer<? super Disposable> emptyConsumer = Functions.emptyConsumer();
        Consumer<? super Throwable> emptyConsumer2 = Functions.emptyConsumer();
        Action action2 = Functions.EMPTY_ACTION;
        return doOnLifecycle(emptyConsumer, emptyConsumer2, action2, action2, action, action2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Completable doFinally(Action action) {
        ObjectHelper.requireNonNull(action, "onFinally is null");
        return RxJavaPlugins.onAssembly(new CompletableDoFinally(this, action));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable doOnComplete(Action action) {
        Consumer<? super Disposable> emptyConsumer = Functions.emptyConsumer();
        Consumer<? super Throwable> emptyConsumer2 = Functions.emptyConsumer();
        Action action2 = Functions.EMPTY_ACTION;
        return doOnLifecycle(emptyConsumer, emptyConsumer2, action, action2, action2, action2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable doOnDispose(Action action) {
        Consumer<? super Disposable> emptyConsumer = Functions.emptyConsumer();
        Consumer<? super Throwable> emptyConsumer2 = Functions.emptyConsumer();
        Action action2 = Functions.EMPTY_ACTION;
        return doOnLifecycle(emptyConsumer, emptyConsumer2, action2, action2, action2, action);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable doOnError(Consumer<? super Throwable> consumer) {
        Consumer<? super Disposable> emptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return doOnLifecycle(emptyConsumer, consumer, action, action, action, action);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Completable doOnEvent(Consumer<? super Throwable> consumer) {
        ObjectHelper.requireNonNull(consumer, "onEvent is null");
        return RxJavaPlugins.onAssembly(new CompletableDoOnEvent(this, consumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable doOnSubscribe(Consumer<? super Disposable> consumer) {
        Consumer<? super Throwable> emptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return doOnLifecycle(consumer, emptyConsumer, action, action, action, action);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable doOnTerminate(Action action) {
        Consumer<? super Disposable> emptyConsumer = Functions.emptyConsumer();
        Consumer<? super Throwable> emptyConsumer2 = Functions.emptyConsumer();
        Action action2 = Functions.EMPTY_ACTION;
        return doOnLifecycle(emptyConsumer, emptyConsumer2, action2, action, action2, action2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable hide() {
        return RxJavaPlugins.onAssembly(new CompletableHide(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Completable lift(CompletableOperator completableOperator) {
        ObjectHelper.requireNonNull(completableOperator, "onLift is null");
        return RxJavaPlugins.onAssembly(new CompletableLift(this, completableOperator));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @Experimental
    public final <T> Single<Notification<T>> materialize() {
        return RxJavaPlugins.onAssembly(new CompletableMaterialize(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Completable mergeWith(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return mergeArray(this, completableSource);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @NonNull
    public final Completable observeOn(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableObserveOn(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable onErrorComplete() {
        return onErrorComplete(Functions.alwaysTrue());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Completable onErrorResumeNext(Function<? super Throwable, ? extends CompletableSource> function) {
        ObjectHelper.requireNonNull(function, "errorMapper is null");
        return RxJavaPlugins.onAssembly(new CompletableResumeNext(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new CompletableDetach(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable repeat() {
        return fromPublisher(toFlowable().repeat());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable repeatUntil(BooleanSupplier booleanSupplier) {
        return fromPublisher(toFlowable().repeatUntil(booleanSupplier));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable repeatWhen(Function<? super Flowable<Object>, ? extends g86> function) {
        return fromPublisher(toFlowable().repeatWhen(function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable retry() {
        return fromPublisher(toFlowable().retry());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable retryWhen(Function<? super Flowable<Throwable>, ? extends g86> function) {
        return fromPublisher(toFlowable().retryWhen(function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Completable startWith(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return concatArray(completableSource, this);
    }

    @SchedulerSupport("none")
    public final Disposable subscribe() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        subscribe(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    protected abstract void subscribeActual(CompletableObserver completableObserver);

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @NonNull
    public final Completable subscribeOn(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableSubscribeOn(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <E extends CompletableObserver> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Completable takeUntil(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new CompletableTakeUntilCompletable(this, completableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final TestObserver<Void> test() {
        TestObserver<Void> testObserver = new TestObserver<>();
        subscribe(testObserver);
        return testObserver;
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Completable timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, Schedulers.computation(), null);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U> U to(Function<? super Completable, U> function) {
        try {
            return (U) ((Function) ObjectHelper.requireNonNull(function, "converter is null")).apply(this);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T> Flowable<T> toFlowable() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable) this).fuseToFlowable() : RxJavaPlugins.onAssembly(new CompletableToFlowable(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T> Maybe<T> toMaybe() {
        return this instanceof FuseToMaybe ? ((FuseToMaybe) this).fuseToMaybe() : RxJavaPlugins.onAssembly(new MaybeFromCompletable(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T> Observable<T> toObservable() {
        return this instanceof FuseToObservable ? ((FuseToObservable) this).fuseToObservable() : RxJavaPlugins.onAssembly(new CompletableToObservable(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <T> Single<T> toSingle(Callable<? extends T> callable) {
        ObjectHelper.requireNonNull(callable, "completionValueSupplier is null");
        return RxJavaPlugins.onAssembly(new CompletableToSingle(this, callable, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <T> Single<T> toSingleDefault(T t) {
        ObjectHelper.requireNonNull(t, "completionValue is null");
        return RxJavaPlugins.onAssembly(new CompletableToSingle(this, null, t));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @NonNull
    public final Completable unsubscribeOn(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableDisposeOn(this, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @NonNull
    public static Completable timer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableTimer(j, timeUnit, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <R> Completable using(Callable<R> callable, Function<? super R, ? extends CompletableSource> function, Consumer<? super R> consumer, boolean z) {
        ObjectHelper.requireNonNull(callable, "resourceSupplier is null");
        ObjectHelper.requireNonNull(function, "completableFunction is null");
        ObjectHelper.requireNonNull(consumer, "disposer is null");
        return RxJavaPlugins.onAssembly(new CompletableUsing(callable, function, consumer, z));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    public final Completable delay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j, timeUnit, scheduler, false);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @Experimental
    public final Completable delaySubscription(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return timer(j, timeUnit, scheduler).andThen(this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Completable onErrorComplete(Predicate<? super Throwable> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new CompletableOnErrorComplete(this, predicate));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable repeat(long j) {
        return fromPublisher(toFlowable().repeat(j));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable retry(BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        return fromPublisher(toFlowable().retry(biPredicate));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    @NonNull
    public final Completable timeout(long j, TimeUnit timeUnit, CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return timeout0(j, timeUnit, Schedulers.computation(), completableSource);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static Completable concat(g86 g86Var) {
        return concat(g86Var, 2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static Completable error(Throwable th) {
        ObjectHelper.requireNonNull(th, "error is null");
        return RxJavaPlugins.onAssembly(new CompletableError(th));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static Completable merge(g86 g86Var) {
        return merge0(g86Var, Integer.MAX_VALUE, false);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static Completable mergeDelayError(g86 g86Var) {
        return merge0(g86Var, Integer.MAX_VALUE, true);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <T> Flowable<T> andThen(g86 g86Var) {
        ObjectHelper.requireNonNull(g86Var, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenPublisher(this, g86Var));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @NonNull
    public final Completable delay(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new CompletableDelay(this, j, timeUnit, scheduler, z));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable retry(long j) {
        return fromPublisher(toFlowable().retry(j));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <T> Observable<T> startWith(Observable<T> observable) {
        ObjectHelper.requireNonNull(observable, "other is null");
        return observable.concatWith(toObservable());
    }

    @Override // io.reactivex.CompletableSource
    @SchedulerSupport("none")
    public final void subscribe(CompletableObserver completableObserver) {
        ObjectHelper.requireNonNull(completableObserver, "observer is null");
        try {
            CompletableObserver onSubscribe = RxJavaPlugins.onSubscribe(this, completableObserver);
            ObjectHelper.requireNonNull(onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(onSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            RxJavaPlugins.onError(th);
            throw toNpe(th);
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final TestObserver<Void> test(boolean z) {
        TestObserver<Void> testObserver = new TestObserver<>();
        if (z) {
            testObserver.cancel();
        }
        subscribe(testObserver);
        return testObserver;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static Completable concat(g86 g86Var, int i) {
        ObjectHelper.requireNonNull(g86Var, "sources is null");
        ObjectHelper.verifyPositive(i, "prefetch");
        return RxJavaPlugins.onAssembly(new CompletableConcat(g86Var, i));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static Completable merge(g86 g86Var, int i) {
        return merge0(g86Var, i, false);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static Completable mergeDelayError(g86 g86Var, int i) {
        return merge0(g86Var, i, true);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final boolean blockingAwait(long j, TimeUnit timeUnit) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        return blockingMultiObserver.blockingAwait(j, timeUnit);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @Nullable
    public final Throwable blockingGet(long j, TimeUnit timeUnit) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        return blockingMultiObserver.blockingGetError(j, timeUnit);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable retry(long j, Predicate<? super Throwable> predicate) {
        return fromPublisher(toFlowable().retry(j, predicate));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    public final Completable timeout(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j, timeUnit, scheduler, null);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <T> Single<T> andThen(SingleSource<T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "next is null");
        return RxJavaPlugins.onAssembly(new SingleDelayWithCompletable(singleSource, this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable retry(Predicate<? super Throwable> predicate) {
        return fromPublisher(toFlowable().retry(predicate));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <T> Flowable<T> startWith(g86 g86Var) {
        ObjectHelper.requireNonNull(g86Var, "other is null");
        return toFlowable().startWith(g86Var);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @NonNull
    public final Completable timeout(long j, TimeUnit timeUnit, Scheduler scheduler, CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return timeout0(j, timeUnit, scheduler, completableSource);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <T> Maybe<T> andThen(MaybeSource<T> maybeSource) {
        ObjectHelper.requireNonNull(maybeSource, "next is null");
        return RxJavaPlugins.onAssembly(new MaybeDelayWithCompletable(maybeSource, this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable andThen(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "next is null");
        return RxJavaPlugins.onAssembly(new CompletableAndThenCompletable(this, completableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Disposable subscribe(Action action, Consumer<? super Throwable> consumer) {
        ObjectHelper.requireNonNull(consumer, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(consumer, action);
        subscribe(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Disposable subscribe(Action action) {
        ObjectHelper.requireNonNull(action, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(action);
        subscribe(callbackCompletableObserver);
        return callbackCompletableObserver;
    }
}
