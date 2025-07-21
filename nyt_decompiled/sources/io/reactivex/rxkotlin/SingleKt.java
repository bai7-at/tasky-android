package io.reactivex.rxkotlin;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.zq3;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;

/* loaded from: classes5.dex */
public final class SingleKt {
    public static final /* synthetic */ <R> Single<R> cast(Single<?> single) {
        zq3.i(single, "$this$cast");
        zq3.n(4, QueryKeys.READING);
        Single<R> single2 = (Single<R>) single.cast(Object.class);
        zq3.d(single2, "cast(R::class.java)");
        return single2;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(Iterable<? extends SingleSource<T>> iterable) {
        zq3.i(iterable, "$this$concatAll");
        Flowable<T> concat = Single.concat(iterable);
        zq3.d(concat, "Single.concat(this)");
        return concat;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> mergeAllSingles(Observable<Single<T>> observable) {
        zq3.i(observable, "$this$mergeAllSingles");
        Observable<T> observable2 = (Observable<T>) observable.flatMapSingle(new Function<T, SingleSource<? extends R>>() { // from class: io.reactivex.rxkotlin.SingleKt$mergeAllSingles$1
            @Override // io.reactivex.functions.Function
            public final Single<T> apply(Single<T> single) {
                zq3.i(single, "it");
                return single;
            }
        });
        zq3.d(observable2, "flatMapSingle { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeAllSingles(Flowable<Single<T>> flowable) {
        zq3.i(flowable, "$this$mergeAllSingles");
        Flowable<T> flowable2 = (Flowable<T>) flowable.flatMapSingle(new Function<T, SingleSource<? extends R>>() { // from class: io.reactivex.rxkotlin.SingleKt$mergeAllSingles$2
            @Override // io.reactivex.functions.Function
            public final Single<T> apply(Single<T> single) {
                zq3.i(single, "it");
                return single;
            }
        });
        zq3.d(flowable2, "flatMapSingle { it }");
        return flowable2;
    }
}
