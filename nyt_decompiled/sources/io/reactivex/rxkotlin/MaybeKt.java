package io.reactivex.rxkotlin;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.zq3;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;

/* loaded from: classes5.dex */
public final class MaybeKt {
    @SchedulerSupport("none")
    @CheckReturnValue
    public static final /* synthetic */ <R> Maybe<R> cast(Maybe<?> maybe) {
        zq3.i(maybe, "$this$cast");
        zq3.n(4, QueryKeys.READING);
        Maybe<R> maybe2 = (Maybe<R>) maybe.cast(Object.class);
        zq3.d(maybe2, "cast(R::class.java)");
        return maybe2;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(Iterable<? extends MaybeSource<T>> iterable) {
        zq3.i(iterable, "$this$concatAll");
        Flowable<T> concat = Maybe.concat(iterable);
        zq3.d(concat, "Maybe.concat(this)");
        return concat;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> mergeAllMaybes(Observable<Maybe<T>> observable) {
        zq3.i(observable, "$this$mergeAllMaybes");
        Observable<T> observable2 = (Observable<T>) observable.flatMapMaybe(new Function<T, MaybeSource<? extends R>>() { // from class: io.reactivex.rxkotlin.MaybeKt$mergeAllMaybes$1
            @Override // io.reactivex.functions.Function
            public final Maybe<T> apply(Maybe<T> maybe) {
                zq3.i(maybe, "it");
                return maybe;
            }
        });
        zq3.d(observable2, "flatMapMaybe { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final /* synthetic */ <R> Maybe<R> ofType(Maybe<?> maybe) {
        zq3.i(maybe, "$this$ofType");
        zq3.n(4, QueryKeys.READING);
        Maybe<R> maybe2 = (Maybe<R>) maybe.ofType(Object.class);
        zq3.d(maybe2, "ofType(R::class.java)");
        return maybe2;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeAllMaybes(Flowable<Maybe<T>> flowable) {
        zq3.i(flowable, "$this$mergeAllMaybes");
        Flowable<T> flowable2 = (Flowable<T>) flowable.flatMapMaybe(new Function<T, MaybeSource<? extends R>>() { // from class: io.reactivex.rxkotlin.MaybeKt$mergeAllMaybes$2
            @Override // io.reactivex.functions.Function
            public final Maybe<T> apply(Maybe<T> maybe) {
                zq3.i(maybe, "it");
                return maybe;
            }
        });
        zq3.d(flowable2, "flatMapMaybe { it }");
        return flowable2;
    }
}
