package io.reactivex;

import defpackage.g86;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Function7;
import io.reactivex.functions.Function8;
import io.reactivex.functions.Function9;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.observers.BiConsumerSingleObserver;
import io.reactivex.internal.observers.BlockingMultiObserver;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.observers.FutureSingleObserver;
import io.reactivex.internal.operators.completable.CompletableFromSingle;
import io.reactivex.internal.operators.completable.CompletableToFlowable;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.operators.flowable.FlowableConcatMapPublisher;
import io.reactivex.internal.operators.flowable.FlowableFlatMapPublisher;
import io.reactivex.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.internal.operators.maybe.MaybeFilterSingle;
import io.reactivex.internal.operators.maybe.MaybeFromSingle;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.internal.operators.single.SingleAmb;
import io.reactivex.internal.operators.single.SingleCache;
import io.reactivex.internal.operators.single.SingleContains;
import io.reactivex.internal.operators.single.SingleCreate;
import io.reactivex.internal.operators.single.SingleDefer;
import io.reactivex.internal.operators.single.SingleDelay;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.internal.operators.single.SingleDelayWithObservable;
import io.reactivex.internal.operators.single.SingleDelayWithPublisher;
import io.reactivex.internal.operators.single.SingleDelayWithSingle;
import io.reactivex.internal.operators.single.SingleDematerialize;
import io.reactivex.internal.operators.single.SingleDetach;
import io.reactivex.internal.operators.single.SingleDoAfterSuccess;
import io.reactivex.internal.operators.single.SingleDoAfterTerminate;
import io.reactivex.internal.operators.single.SingleDoFinally;
import io.reactivex.internal.operators.single.SingleDoOnDispose;
import io.reactivex.internal.operators.single.SingleDoOnError;
import io.reactivex.internal.operators.single.SingleDoOnEvent;
import io.reactivex.internal.operators.single.SingleDoOnSubscribe;
import io.reactivex.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.internal.operators.single.SingleDoOnTerminate;
import io.reactivex.internal.operators.single.SingleEquals;
import io.reactivex.internal.operators.single.SingleError;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.internal.operators.single.SingleFlatMapIterableFlowable;
import io.reactivex.internal.operators.single.SingleFlatMapIterableObservable;
import io.reactivex.internal.operators.single.SingleFlatMapMaybe;
import io.reactivex.internal.operators.single.SingleFlatMapPublisher;
import io.reactivex.internal.operators.single.SingleFromCallable;
import io.reactivex.internal.operators.single.SingleFromPublisher;
import io.reactivex.internal.operators.single.SingleFromUnsafeSource;
import io.reactivex.internal.operators.single.SingleHide;
import io.reactivex.internal.operators.single.SingleInternalHelper;
import io.reactivex.internal.operators.single.SingleJust;
import io.reactivex.internal.operators.single.SingleLift;
import io.reactivex.internal.operators.single.SingleMap;
import io.reactivex.internal.operators.single.SingleMaterialize;
import io.reactivex.internal.operators.single.SingleNever;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleOnErrorReturn;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleTakeUntil;
import io.reactivex.internal.operators.single.SingleTimeout;
import io.reactivex.internal.operators.single.SingleTimer;
import io.reactivex.internal.operators.single.SingleToFlowable;
import io.reactivex.internal.operators.single.SingleToObservable;
import io.reactivex.internal.operators.single.SingleUnsubscribeOn;
import io.reactivex.internal.operators.single.SingleUsing;
import io.reactivex.internal.operators.single.SingleZipArray;
import io.reactivex.internal.operators.single.SingleZipIterable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.TestObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class Single<T> implements SingleSource<T> {
    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Single<T> amb(Iterable<? extends SingleSource<? extends T>> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new SingleAmb(null, iterable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> ambArray(SingleSource<? extends T>... singleSourceArr) {
        return singleSourceArr.length == 0 ? error(SingleInternalHelper.emptyThrower()) : singleSourceArr.length == 1 ? wrap(singleSourceArr[0]) : RxJavaPlugins.onAssembly(new SingleAmb(singleSourceArr, null));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concat(Iterable<? extends SingleSource<? extends T>> iterable) {
        return concat(Flowable.fromIterable(iterable));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concatArray(SingleSource<? extends T>... singleSourceArr) {
        return RxJavaPlugins.onAssembly(new FlowableConcatMap(Flowable.fromArray(singleSourceArr), SingleInternalHelper.toFlowable(), 2, ErrorMode.BOUNDARY));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concatArrayEager(SingleSource<? extends T>... singleSourceArr) {
        return Flowable.fromArray(singleSourceArr).concatMapEager(SingleInternalHelper.toFlowable());
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concatEager(g86 g86Var) {
        return Flowable.fromPublisher(g86Var).concatMapEager(SingleInternalHelper.toFlowable());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Single<T> create(SingleOnSubscribe<T> singleOnSubscribe) {
        ObjectHelper.requireNonNull(singleOnSubscribe, "source is null");
        return RxJavaPlugins.onAssembly(new SingleCreate(singleOnSubscribe));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Single<T> defer(Callable<? extends SingleSource<? extends T>> callable) {
        ObjectHelper.requireNonNull(callable, "singleSupplier is null");
        return RxJavaPlugins.onAssembly(new SingleDefer(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Single<Boolean> equals(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        ObjectHelper.requireNonNull(singleSource, "first is null");
        ObjectHelper.requireNonNull(singleSource2, "second is null");
        return RxJavaPlugins.onAssembly(new SingleEquals(singleSource, singleSource2));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Single<T> error(Callable<? extends Throwable> callable) {
        ObjectHelper.requireNonNull(callable, "errorSupplier is null");
        return RxJavaPlugins.onAssembly(new SingleError(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Single<T> fromCallable(Callable<? extends T> callable) {
        ObjectHelper.requireNonNull(callable, "callable is null");
        return RxJavaPlugins.onAssembly(new SingleFromCallable(callable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> fromFuture(Future<? extends T> future) {
        return toSingle(Flowable.fromFuture(future));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Single<T> fromObservable(ObservableSource<? extends T> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "observableSource is null");
        return RxJavaPlugins.onAssembly(new ObservableSingleSingle(observableSource, null));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public static <T> Single<T> fromPublisher(g86 g86Var) {
        ObjectHelper.requireNonNull(g86Var, "publisher is null");
        return RxJavaPlugins.onAssembly(new SingleFromPublisher(g86Var));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Single<T> just(T t) {
        ObjectHelper.requireNonNull(t, "item is null");
        return RxJavaPlugins.onAssembly(new SingleJust(t));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> merge(Iterable<? extends SingleSource<? extends T>> iterable) {
        return merge(Flowable.fromIterable(iterable));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> mergeDelayError(Iterable<? extends SingleSource<? extends T>> iterable) {
        return mergeDelayError(Flowable.fromIterable(iterable));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> never() {
        return RxJavaPlugins.onAssembly(SingleNever.INSTANCE);
    }

    private Single<T> timeout0(long j, TimeUnit timeUnit, Scheduler scheduler, SingleSource<? extends T> singleSource) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new SingleTimeout(this, j, timeUnit, scheduler, singleSource));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public static Single<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, Schedulers.computation());
    }

    private static <T> Single<T> toSingle(Flowable<T> flowable) {
        return RxJavaPlugins.onAssembly(new FlowableSingleSingle(flowable, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Single<T> unsafeCreate(SingleSource<T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "onSubscribe is null");
        if (singleSource instanceof Single) {
            throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
        }
        return RxJavaPlugins.onAssembly(new SingleFromUnsafeSource(singleSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T, U> Single<T> using(Callable<U> callable, Function<? super U, ? extends SingleSource<? extends T>> function, Consumer<? super U> consumer) {
        return using(callable, function, consumer, true);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Single<T> wrap(SingleSource<T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "source is null");
        return singleSource instanceof Single ? RxJavaPlugins.onAssembly((Single) singleSource) : RxJavaPlugins.onAssembly(new SingleFromUnsafeSource(singleSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T, R> Single<R> zip(Iterable<? extends SingleSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        ObjectHelper.requireNonNull(function, "zipper is null");
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new SingleZipIterable(iterable, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T, R> Single<R> zipArray(Function<? super Object[], ? extends R> function, SingleSource<? extends T>... singleSourceArr) {
        ObjectHelper.requireNonNull(function, "zipper is null");
        ObjectHelper.requireNonNull(singleSourceArr, "sources is null");
        return singleSourceArr.length == 0 ? error(new NoSuchElementException()) : RxJavaPlugins.onAssembly(new SingleZipArray(singleSourceArr, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> ambWith(SingleSource<? extends T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "other is null");
        return ambArray(this, singleSource);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> R as(@NonNull SingleConverter<T, ? extends R> singleConverter) {
        return (R) ((SingleConverter) ObjectHelper.requireNonNull(singleConverter, "converter is null")).apply(this);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final T blockingGet() {
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        return (T) blockingMultiObserver.blockingGet();
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> cache() {
        return RxJavaPlugins.onAssembly(new SingleCache(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <U> Single<U> cast(Class<? extends U> cls) {
        ObjectHelper.requireNonNull(cls, "clazz is null");
        return (Single<U>) map(Functions.castFunction(cls));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> Single<R> compose(SingleTransformer<? super T, ? extends R> singleTransformer) {
        return wrap(((SingleTransformer) ObjectHelper.requireNonNull(singleTransformer, "transformer is null")).apply(this));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> concatWith(SingleSource<? extends T> singleSource) {
        return concat(this, singleSource);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<Boolean> contains(Object obj) {
        return contains(obj, ObjectHelper.equalsPredicate());
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Single<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, Schedulers.computation(), false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> delaySubscription(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new SingleDelayWithCompletable(this, completableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @Experimental
    @NonNull
    public final <R> Maybe<R> dematerialize(Function<? super T, Notification<R>> function) {
        ObjectHelper.requireNonNull(function, "selector is null");
        return RxJavaPlugins.onAssembly(new SingleDematerialize(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> doAfterSuccess(Consumer<? super T> consumer) {
        ObjectHelper.requireNonNull(consumer, "onAfterSuccess is null");
        return RxJavaPlugins.onAssembly(new SingleDoAfterSuccess(this, consumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> doAfterTerminate(Action action) {
        ObjectHelper.requireNonNull(action, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new SingleDoAfterTerminate(this, action));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> doFinally(Action action) {
        ObjectHelper.requireNonNull(action, "onFinally is null");
        return RxJavaPlugins.onAssembly(new SingleDoFinally(this, action));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> doOnDispose(Action action) {
        ObjectHelper.requireNonNull(action, "onDispose is null");
        return RxJavaPlugins.onAssembly(new SingleDoOnDispose(this, action));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> doOnError(Consumer<? super Throwable> consumer) {
        ObjectHelper.requireNonNull(consumer, "onError is null");
        return RxJavaPlugins.onAssembly(new SingleDoOnError(this, consumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> doOnEvent(BiConsumer<? super T, ? super Throwable> biConsumer) {
        ObjectHelper.requireNonNull(biConsumer, "onEvent is null");
        return RxJavaPlugins.onAssembly(new SingleDoOnEvent(this, biConsumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> doOnSubscribe(Consumer<? super Disposable> consumer) {
        ObjectHelper.requireNonNull(consumer, "onSubscribe is null");
        return RxJavaPlugins.onAssembly(new SingleDoOnSubscribe(this, consumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> doOnSuccess(Consumer<? super T> consumer) {
        ObjectHelper.requireNonNull(consumer, "onSuccess is null");
        return RxJavaPlugins.onAssembly(new SingleDoOnSuccess(this, consumer));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @Experimental
    @NonNull
    public final Single<T> doOnTerminate(Action action) {
        ObjectHelper.requireNonNull(action, "onTerminate is null");
        return RxJavaPlugins.onAssembly(new SingleDoOnTerminate(this, action));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Maybe<T> filter(Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new MaybeFilterSingle(this, predicate));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <R> Single<R> flatMap(Function<? super T, ? extends SingleSource<? extends R>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMap(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Completable flatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMapCompletable(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <R> Maybe<R> flatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMapMaybe(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <R> Observable<R> flatMapObservable(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMapObservable(this, function));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> flatMapPublisher(Function<? super T, ? extends g86> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMapPublisher(this, function));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U> Flowable<U> flattenAsFlowable(Function<? super T, ? extends Iterable<? extends U>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMapIterableFlowable(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <U> Observable<U> flattenAsObservable(Function<? super T, ? extends Iterable<? extends U>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMapIterableObservable(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> hide() {
        return RxJavaPlugins.onAssembly(new SingleHide(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Completable ignoreElement() {
        return RxJavaPlugins.onAssembly(new CompletableFromSingle(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <R> Single<R> lift(SingleOperator<? extends R, ? super T> singleOperator) {
        ObjectHelper.requireNonNull(singleOperator, "lift is null");
        return RxJavaPlugins.onAssembly(new SingleLift(this, singleOperator));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <R> Single<R> map(Function<? super T, ? extends R> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new SingleMap(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @Experimental
    public final Single<Notification<T>> materialize() {
        return RxJavaPlugins.onAssembly(new SingleMaterialize(this));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> mergeWith(SingleSource<? extends T> singleSource) {
        return merge(this, singleSource);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @NonNull
    public final Single<T> observeOn(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new SingleObserveOn(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> onErrorResumeNext(Single<? extends T> single) {
        ObjectHelper.requireNonNull(single, "resumeSingleInCaseOfError is null");
        return onErrorResumeNext(Functions.justFunction(single));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> onErrorReturn(Function<Throwable, ? extends T> function) {
        ObjectHelper.requireNonNull(function, "resumeFunction is null");
        return RxJavaPlugins.onAssembly(new SingleOnErrorReturn(this, function, null));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> onErrorReturnItem(T t) {
        ObjectHelper.requireNonNull(t, "value is null");
        return RxJavaPlugins.onAssembly(new SingleOnErrorReturn(this, null, t));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new SingleDetach(this));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> repeat() {
        return toFlowable().repeat();
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> repeatUntil(BooleanSupplier booleanSupplier) {
        return toFlowable().repeatUntil(booleanSupplier);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> repeatWhen(Function<? super Flowable<Object>, ? extends g86> function) {
        return toFlowable().repeatWhen(function);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> retry() {
        return toSingle(toFlowable().retry());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> retryWhen(Function<? super Flowable<Throwable>, ? extends g86> function) {
        return toSingle(toFlowable().retryWhen(function));
    }

    @SchedulerSupport("none")
    public final Disposable subscribe() {
        return subscribe(Functions.emptyConsumer(), Functions.ON_ERROR_MISSING);
    }

    protected abstract void subscribeActual(@NonNull SingleObserver<? super T> singleObserver);

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @NonNull
    public final Single<T> subscribeOn(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new SingleSubscribeOn(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <E extends SingleObserver<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> takeUntil(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return takeUntil(new CompletableToFlowable(completableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final TestObserver<T> test() {
        TestObserver<T> testObserver = new TestObserver<>();
        subscribe(testObserver);
        return testObserver;
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Single<T> timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, Schedulers.computation(), null);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <R> R to(Function<? super Single<T>, R> function) {
        try {
            return (R) ((Function) ObjectHelper.requireNonNull(function, "convert is null")).apply(this);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @Deprecated
    public final Completable toCompletable() {
        return RxJavaPlugins.onAssembly(new CompletableFromSingle(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> toFlowable() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable) this).fuseToFlowable() : RxJavaPlugins.onAssembly(new SingleToFlowable(this));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new FutureSingleObserver());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final Maybe<T> toMaybe() {
        return this instanceof FuseToMaybe ? ((FuseToMaybe) this).fuseToMaybe() : RxJavaPlugins.onAssembly(new MaybeFromSingle(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public final Observable<T> toObservable() {
        return this instanceof FuseToObservable ? ((FuseToObservable) this).fuseToObservable() : RxJavaPlugins.onAssembly(new SingleToObservable(this));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @NonNull
    public final Single<T> unsubscribeOn(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new SingleUnsubscribeOn(this, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <U, R> Single<R> zipWith(SingleSource<U> singleSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return zip(this, singleSource, biFunction);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Observable<T> concat(ObservableSource<? extends SingleSource<? extends T>> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "sources is null");
        return RxJavaPlugins.onAssembly(new ObservableConcatMap(observableSource, SingleInternalHelper.toObservable(), 2, ErrorMode.IMMEDIATE));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concatEager(Iterable<? extends SingleSource<? extends T>> iterable) {
        return Flowable.fromIterable(iterable).concatMapEager(SingleInternalHelper.toFlowable());
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static <T> Single<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return toSingle(Flowable.fromFuture(future, j, timeUnit));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> merge(g86 g86Var) {
        ObjectHelper.requireNonNull(g86Var, "sources is null");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapPublisher(g86Var, SingleInternalHelper.toFlowable(), false, Integer.MAX_VALUE, Flowable.bufferSize()));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> mergeDelayError(g86 g86Var) {
        ObjectHelper.requireNonNull(g86Var, "sources is null");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapPublisher(g86Var, SingleInternalHelper.toFlowable(), true, Integer.MAX_VALUE, Flowable.bufferSize()));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @NonNull
    public static Single<Long> timer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new SingleTimer(j, timeUnit, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T, U> Single<T> using(Callable<U> callable, Function<? super U, ? extends SingleSource<? extends T>> function, Consumer<? super U> consumer, boolean z) {
        ObjectHelper.requireNonNull(callable, "resourceSupplier is null");
        ObjectHelper.requireNonNull(function, "singleFunction is null");
        ObjectHelper.requireNonNull(consumer, "disposer is null");
        return RxJavaPlugins.onAssembly(new SingleUsing(callable, function, consumer, z));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<Boolean> contains(Object obj, BiPredicate<Object, Object> biPredicate) {
        ObjectHelper.requireNonNull(obj, "value is null");
        ObjectHelper.requireNonNull(biPredicate, "comparer is null");
        return RxJavaPlugins.onAssembly(new SingleContains(this, obj, biPredicate));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Single<T> delay(long j, TimeUnit timeUnit, boolean z) {
        return delay(j, timeUnit, Schedulers.computation(), z);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> repeat(long j) {
        return toFlowable().repeat(j);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> retry(long j) {
        return toSingle(toFlowable().retry(j));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Disposable subscribe(BiConsumer<? super T, ? super Throwable> biConsumer) {
        ObjectHelper.requireNonNull(biConsumer, "onCallback is null");
        BiConsumerSingleObserver biConsumerSingleObserver = new BiConsumerSingleObserver(biConsumer);
        subscribe(biConsumerSingleObserver);
        return biConsumerSingleObserver;
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    public final Single<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j, timeUnit, scheduler, null);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Single<T> error(Throwable th) {
        ObjectHelper.requireNonNull(th, "exception is null");
        return error((Callable<? extends Throwable>) Functions.justCallable(th));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    public static <T> Single<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return toSingle(Flowable.fromFuture(future, j, timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    public final Single<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j, timeUnit, scheduler, false);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <U> Single<T> delaySubscription(SingleSource<U> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "other is null");
        return RxJavaPlugins.onAssembly(new SingleDelayWithSingle(this, singleSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Single<T> onErrorResumeNext(Function<? super Throwable, ? extends SingleSource<? extends T>> function) {
        ObjectHelper.requireNonNull(function, "resumeFunctionInCaseOfError is null");
        return RxJavaPlugins.onAssembly(new SingleResumeNext(this, function));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> retry(BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        return toSingle(toFlowable().retry(biPredicate));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <E> Single<T> takeUntil(g86 g86Var) {
        ObjectHelper.requireNonNull(g86Var, "other is null");
        return RxJavaPlugins.onAssembly(new SingleTakeUntil(this, g86Var));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final TestObserver<T> test(boolean z) {
        TestObserver<T> testObserver = new TestObserver<>();
        if (z) {
            testObserver.cancel();
        }
        subscribe(testObserver);
        return testObserver;
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @NonNull
    public final Single<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler, SingleSource<? extends T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "other is null");
        return timeout0(j, timeUnit, scheduler, singleSource);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concat(g86 g86Var) {
        return concat(g86Var, 2);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    public static <T> Single<T> fromFuture(Future<? extends T> future, Scheduler scheduler) {
        return toSingle(Flowable.fromFuture(future, scheduler));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T> Single<T> merge(SingleSource<? extends SingleSource<? extends T>> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "source is null");
        return RxJavaPlugins.onAssembly(new SingleFlatMap(singleSource, Functions.identity()));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> mergeDelayError(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        return mergeDelayError(Flowable.fromArray(singleSource, singleSource2));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        return zipArray(Functions.toFunction(biFunction), singleSource, singleSource2);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    @NonNull
    public final Single<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new SingleDelay(this, j, timeUnit, scheduler, z));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> retry(long j, Predicate<? super Throwable> predicate) {
        return toSingle(toFlowable().retry(j, predicate));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concat(g86 g86Var, int i) {
        ObjectHelper.requireNonNull(g86Var, "sources is null");
        ObjectHelper.verifyPositive(i, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapPublisher(g86Var, SingleInternalHelper.toFlowable(), i, ErrorMode.IMMEDIATE));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <U> Single<T> delaySubscription(ObservableSource<U> observableSource) {
        ObjectHelper.requireNonNull(observableSource, "other is null");
        return RxJavaPlugins.onAssembly(new SingleDelayWithObservable(this, observableSource));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Single<T> retry(Predicate<? super Throwable> predicate) {
        return toSingle(toFlowable().retry(predicate));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.ON_ERROR_MISSING);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final <E> Single<T> takeUntil(SingleSource<? extends E> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "other is null");
        return takeUntil(new SingleToFlowable(singleSource));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    @NonNull
    public final Single<T> timeout(long j, TimeUnit timeUnit, SingleSource<? extends T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "other is null");
        return timeout0(j, timeUnit, Schedulers.computation(), singleSource);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> merge(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        return merge(Flowable.fromArray(singleSource, singleSource2));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        ObjectHelper.requireNonNull(consumer, "onSuccess is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(consumer, consumer2);
        subscribe(consumerSingleObserver);
        return consumerSingleObserver;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> mergeDelayError(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        ObjectHelper.requireNonNull(singleSource3, "source3 is null");
        return mergeDelayError(Flowable.fromArray(singleSource, singleSource2, singleSource3));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        ObjectHelper.requireNonNull(singleSource3, "source3 is null");
        return zipArray(Functions.toFunction(function3), singleSource, singleSource2, singleSource3);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U> Single<T> delaySubscription(g86 g86Var) {
        ObjectHelper.requireNonNull(g86Var, "other is null");
        return RxJavaPlugins.onAssembly(new SingleDelayWithPublisher(this, g86Var));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concat(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        return concat(Flowable.fromArray(singleSource, singleSource2));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> merge(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        ObjectHelper.requireNonNull(singleSource3, "source3 is null");
        return merge(Flowable.fromArray(singleSource, singleSource2, singleSource3));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Single<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    public final Single<T> delaySubscription(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delaySubscription(Observable.timer(j, timeUnit, scheduler));
    }

    @Override // io.reactivex.SingleSource
    @SchedulerSupport("none")
    public final void subscribe(SingleObserver<? super T> singleObserver) {
        ObjectHelper.requireNonNull(singleObserver, "observer is null");
        SingleObserver<? super T> onSubscribe = RxJavaPlugins.onSubscribe(this, singleObserver);
        ObjectHelper.requireNonNull(onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            subscribeActual(onSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concat(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        ObjectHelper.requireNonNull(singleSource3, "source3 is null");
        return concat(Flowable.fromArray(singleSource, singleSource2, singleSource3));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> mergeDelayError(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3, SingleSource<? extends T> singleSource4) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        ObjectHelper.requireNonNull(singleSource3, "source3 is null");
        ObjectHelper.requireNonNull(singleSource4, "source4 is null");
        return mergeDelayError(Flowable.fromArray(singleSource, singleSource2, singleSource3, singleSource4));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        ObjectHelper.requireNonNull(singleSource3, "source3 is null");
        ObjectHelper.requireNonNull(singleSource4, "source4 is null");
        return zipArray(Functions.toFunction(function4), singleSource, singleSource2, singleSource3, singleSource4);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> merge(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3, SingleSource<? extends T> singleSource4) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        ObjectHelper.requireNonNull(singleSource3, "source3 is null");
        ObjectHelper.requireNonNull(singleSource4, "source4 is null");
        return merge(Flowable.fromArray(singleSource, singleSource2, singleSource3, singleSource4));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concat(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3, SingleSource<? extends T> singleSource4) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        ObjectHelper.requireNonNull(singleSource3, "source3 is null");
        ObjectHelper.requireNonNull(singleSource4, "source4 is null");
        return concat(Flowable.fromArray(singleSource, singleSource2, singleSource3, singleSource4));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        ObjectHelper.requireNonNull(singleSource3, "source3 is null");
        ObjectHelper.requireNonNull(singleSource4, "source4 is null");
        ObjectHelper.requireNonNull(singleSource5, "source5 is null");
        return zipArray(Functions.toFunction(function5), singleSource, singleSource2, singleSource3, singleSource4, singleSource5);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, SingleSource<? extends T6> singleSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        ObjectHelper.requireNonNull(singleSource3, "source3 is null");
        ObjectHelper.requireNonNull(singleSource4, "source4 is null");
        ObjectHelper.requireNonNull(singleSource5, "source5 is null");
        ObjectHelper.requireNonNull(singleSource6, "source6 is null");
        return zipArray(Functions.toFunction(function6), singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, SingleSource<? extends T6> singleSource6, SingleSource<? extends T7> singleSource7, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        ObjectHelper.requireNonNull(singleSource3, "source3 is null");
        ObjectHelper.requireNonNull(singleSource4, "source4 is null");
        ObjectHelper.requireNonNull(singleSource5, "source5 is null");
        ObjectHelper.requireNonNull(singleSource6, "source6 is null");
        ObjectHelper.requireNonNull(singleSource7, "source7 is null");
        return zipArray(Functions.toFunction(function7), singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, SingleSource<? extends T6> singleSource6, SingleSource<? extends T7> singleSource7, SingleSource<? extends T8> singleSource8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        ObjectHelper.requireNonNull(singleSource3, "source3 is null");
        ObjectHelper.requireNonNull(singleSource4, "source4 is null");
        ObjectHelper.requireNonNull(singleSource5, "source5 is null");
        ObjectHelper.requireNonNull(singleSource6, "source6 is null");
        ObjectHelper.requireNonNull(singleSource7, "source7 is null");
        ObjectHelper.requireNonNull(singleSource8, "source8 is null");
        return zipArray(Functions.toFunction(function8), singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7, singleSource8);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, SingleSource<? extends T6> singleSource6, SingleSource<? extends T7> singleSource7, SingleSource<? extends T8> singleSource8, SingleSource<? extends T9> singleSource9, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        ObjectHelper.requireNonNull(singleSource, "source1 is null");
        ObjectHelper.requireNonNull(singleSource2, "source2 is null");
        ObjectHelper.requireNonNull(singleSource3, "source3 is null");
        ObjectHelper.requireNonNull(singleSource4, "source4 is null");
        ObjectHelper.requireNonNull(singleSource5, "source5 is null");
        ObjectHelper.requireNonNull(singleSource6, "source6 is null");
        ObjectHelper.requireNonNull(singleSource7, "source7 is null");
        ObjectHelper.requireNonNull(singleSource8, "source8 is null");
        ObjectHelper.requireNonNull(singleSource9, "source9 is null");
        return zipArray(Functions.toFunction(function9), singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7, singleSource8, singleSource9);
    }
}
