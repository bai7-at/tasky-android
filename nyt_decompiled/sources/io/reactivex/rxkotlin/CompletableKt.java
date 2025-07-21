package io.reactivex.rxkotlin;

import defpackage.qs2;
import defpackage.zq3;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public final class CompletableKt {
    @SchedulerSupport("none")
    @CheckReturnValue
    public static final Completable concatAll(Iterable<? extends CompletableSource> iterable) {
        zq3.i(iterable, "$this$concatAll");
        Completable concat = Completable.concat(iterable);
        zq3.d(concat, "Completable.concat(this)");
        return concat;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final Completable mergeAllCompletables(Observable<Completable> observable) {
        zq3.i(observable, "$this$mergeAllCompletables");
        Completable flatMapCompletable = observable.flatMapCompletable(new Function<Completable, CompletableSource>() { // from class: io.reactivex.rxkotlin.CompletableKt$mergeAllCompletables$1
            @Override // io.reactivex.functions.Function
            public final Completable apply(Completable completable) {
                zq3.i(completable, "it");
                return completable;
            }
        });
        zq3.d(flatMapCompletable, "flatMapCompletable { it }");
        return flatMapCompletable;
    }

    public static final Completable toCompletable(Action action) {
        zq3.i(action, "$this$toCompletable");
        Completable fromAction = Completable.fromAction(action);
        zq3.d(fromAction, "Completable.fromAction(this)");
        return fromAction;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final Completable mergeAllCompletables(Flowable<Completable> flowable) {
        zq3.i(flowable, "$this$mergeAllCompletables");
        Completable flatMapCompletable = flowable.flatMapCompletable(new Function<Completable, CompletableSource>() { // from class: io.reactivex.rxkotlin.CompletableKt$mergeAllCompletables$2
            @Override // io.reactivex.functions.Function
            public final Completable apply(Completable completable) {
                zq3.i(completable, "it");
                return completable;
            }
        });
        zq3.d(flatMapCompletable, "flatMapCompletable { it }");
        return flatMapCompletable;
    }

    public static final Completable toCompletable(Callable<? extends Object> callable) {
        zq3.i(callable, "$this$toCompletable");
        Completable fromCallable = Completable.fromCallable(callable);
        zq3.d(fromCallable, "Completable.fromCallable(this)");
        return fromCallable;
    }

    public static final Completable toCompletable(Future<? extends Object> future) {
        zq3.i(future, "$this$toCompletable");
        Completable fromFuture = Completable.fromFuture(future);
        zq3.d(fromFuture, "Completable.fromFuture(this)");
        return fromFuture;
    }

    public static final Completable toCompletable(final qs2 qs2Var) {
        zq3.i(qs2Var, "$this$toCompletable");
        Completable fromCallable = Completable.fromCallable(new Callable() { // from class: io.reactivex.rxkotlin.CompletableKt$sam$java_util_concurrent_Callable$0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return qs2.this.mo865invoke();
            }
        });
        zq3.d(fromCallable, "Completable.fromCallable(this)");
        return fromCallable;
    }
}
