package io.reactivex.rxkotlin;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.gt2;
import defpackage.it2;
import defpackage.kt2;
import defpackage.mt2;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import kotlin.Pair;
import kotlin.Triple;

/* loaded from: classes5.dex */
public final class ObservablesKt {
    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T, U, R> Observable<R> withLatestFrom(Observable<T> observable, ObservableSource<U> observableSource, final gt2 gt2Var) {
        zq3.i(observable, "$this$withLatestFrom");
        zq3.i(observableSource, "other");
        zq3.i(gt2Var, "combiner");
        Observable<R> withLatestFrom = observable.withLatestFrom(observableSource, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt$withLatestFrom$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t, U u) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(u, QueryKeys.USER_ID);
                return (R) gt2.this.invoke(t, u);
            }
        });
        zq3.d(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        return withLatestFrom;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T, U, R> Observable<R> zipWith(Observable<T> observable, ObservableSource<U> observableSource, final gt2 gt2Var) {
        zq3.i(observable, "$this$zipWith");
        zq3.i(observableSource, "other");
        zq3.i(gt2Var, "zipper");
        Observable<R> zipWith = observable.zipWith(observableSource, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt$zipWith$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t, U u) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(u, QueryKeys.USER_ID);
                return (R) gt2.this.invoke(t, u);
            }
        });
        zq3.d(zipWith, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return zipWith;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T, U> Observable<Pair<T, U>> withLatestFrom(Observable<T> observable, ObservableSource<U> observableSource) {
        zq3.i(observable, "$this$withLatestFrom");
        zq3.i(observableSource, "other");
        Observable<Pair<T, U>> observable2 = (Observable<Pair<T, U>>) observable.withLatestFrom(observableSource, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.ObservablesKt$withLatestFrom$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((ObservablesKt$withLatestFrom$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t, U u) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(u, QueryKeys.USER_ID);
                return new Pair<>(t, u);
            }
        });
        zq3.d(observable2, "withLatestFrom(other, Bi…n { t, u -> Pair(t, u) })");
        return observable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T, U> Observable<Pair<T, U>> zipWith(Observable<T> observable, ObservableSource<U> observableSource) {
        zq3.i(observable, "$this$zipWith");
        zq3.i(observableSource, "other");
        Observable<Pair<T, U>> observable2 = (Observable<Pair<T, U>>) observable.zipWith(observableSource, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.ObservablesKt$zipWith$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((ObservablesKt$zipWith$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t, U u) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(u, QueryKeys.USER_ID);
                return new Pair<>(t, u);
            }
        });
        zq3.d(observable2, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T, T1, T2, R> Observable<R> withLatestFrom(Observable<T> observable, ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, final it2 it2Var) {
        zq3.i(observable, "$this$withLatestFrom");
        zq3.i(observableSource, "o1");
        zq3.i(observableSource2, "o2");
        zq3.i(it2Var, "combiner");
        Observable<R> withLatestFrom = observable.withLatestFrom(observableSource, observableSource2, new Function3<T, T1, T2, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt$withLatestFrom$3
            @Override // io.reactivex.functions.Function3
            public final R apply(T t, T1 t1, T2 t2) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                return (R) it2.this.invoke(t, t1, t2);
            }
        });
        zq3.d(withLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        return withLatestFrom;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T, T1, T2> Observable<Triple<T, T1, T2>> withLatestFrom(Observable<T> observable, ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2) {
        zq3.i(observable, "$this$withLatestFrom");
        zq3.i(observableSource, "o1");
        zq3.i(observableSource2, "o2");
        Observable<Triple<T, T1, T2>> observable2 = (Observable<Triple<T, T1, T2>>) observable.withLatestFrom(observableSource, observableSource2, new Function3<T, T1, T2, Triple<? extends T, ? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.ObservablesKt$withLatestFrom$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((ObservablesKt$withLatestFrom$4<T1, T2, T3, R, T>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Triple<T, T1, T2> apply(T t, T1 t1, T2 t2) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                return new Triple<>(t, t1, t2);
            }
        });
        zq3.d(observable2, "withLatestFrom(o1, o2, F…2 -> Triple(t, t1, t2) })");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T, T1, T2, T3, R> Observable<R> withLatestFrom(Observable<T> observable, ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, final kt2 kt2Var) {
        zq3.i(observable, "$this$withLatestFrom");
        zq3.i(observableSource, "o1");
        zq3.i(observableSource2, "o2");
        zq3.i(observableSource3, "o3");
        zq3.i(kt2Var, "combiner");
        Observable<R> withLatestFrom = observable.withLatestFrom(observableSource, observableSource2, observableSource3, new Function4<T, T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt$withLatestFrom$5
            @Override // io.reactivex.functions.Function4
            public final R apply(T t, T1 t1, T2 t2, T3 t3) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                return (R) kt2.this.invoke(t, t1, t2, t3);
            }
        });
        zq3.d(withLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        return withLatestFrom;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T, T1, T2, T3, T4, R> Observable<R> withLatestFrom(Observable<T> observable, ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, ObservableSource<T4> observableSource4, final mt2 mt2Var) {
        zq3.i(observable, "$this$withLatestFrom");
        zq3.i(observableSource, "o1");
        zq3.i(observableSource2, "o2");
        zq3.i(observableSource3, "o3");
        zq3.i(observableSource4, "o4");
        zq3.i(mt2Var, "combiner");
        Observable<R> withLatestFrom = observable.withLatestFrom(observableSource, observableSource2, observableSource3, observableSource4, new Function5<T, T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt$withLatestFrom$6
            @Override // io.reactivex.functions.Function5
            public final R apply(T t, T1 t1, T2 t2, T3 t3, T4 t4) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                zq3.i(t4, "t4");
                return (R) mt2.this.invoke(t, t1, t2, t3, t4);
            }
        });
        zq3.d(withLatestFrom, "withLatestFrom(o1, o2, o…oke(t, t1, t2, t3, t4) })");
        return withLatestFrom;
    }
}
