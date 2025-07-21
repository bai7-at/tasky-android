package io.reactivex.rxkotlin;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.g86;
import defpackage.gt2;
import defpackage.it2;
import defpackage.kt2;
import defpackage.mt2;
import defpackage.zq3;
import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import kotlin.Pair;
import kotlin.Triple;

/* loaded from: classes5.dex */
public final class FlowablesKt {
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U, R> Flowable<R> withLatestFrom(Flowable<T> flowable, g86 g86Var, final gt2 gt2Var) {
        zq3.i(flowable, "$this$withLatestFrom");
        zq3.i(g86Var, "other");
        zq3.i(gt2Var, "combiner");
        Flowable<R> withLatestFrom = flowable.withLatestFrom(g86Var, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$1
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
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U, R> Flowable<R> zipWith(Flowable<T> flowable, g86 g86Var, final gt2 gt2Var) {
        zq3.i(flowable, "$this$zipWith");
        zq3.i(g86Var, "other");
        zq3.i(gt2Var, "zipper");
        Flowable<R> zipWith = flowable.zipWith(g86Var, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$zipWith$1
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

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U> Flowable<Pair<T, U>> withLatestFrom(Flowable<T> flowable, g86 g86Var) {
        zq3.i(flowable, "$this$withLatestFrom");
        zq3.i(g86Var, "other");
        Flowable<Pair<T, U>> flowable2 = (Flowable<Pair<T, U>>) flowable.withLatestFrom(g86Var, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((FlowablesKt$withLatestFrom$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t, U u) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(u, QueryKeys.USER_ID);
                return new Pair<>(t, u);
            }
        });
        zq3.d(flowable2, "withLatestFrom(other, Bi…n { t, u -> Pair(t, u) })");
        return flowable2;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, U> Flowable<Pair<T, U>> zipWith(Flowable<T> flowable, g86 g86Var) {
        zq3.i(flowable, "$this$zipWith");
        zq3.i(g86Var, "other");
        Flowable<Pair<T, U>> flowable2 = (Flowable<Pair<T, U>>) flowable.zipWith(g86Var, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.FlowablesKt$zipWith$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((FlowablesKt$zipWith$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t, U u) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(u, QueryKeys.USER_ID);
                return new Pair<>(t, u);
            }
        });
        zq3.d(flowable2, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return flowable2;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2, R> Flowable<R> withLatestFrom(Flowable<T> flowable, g86 g86Var, g86 g86Var2, final it2 it2Var) {
        zq3.i(flowable, "$this$withLatestFrom");
        zq3.i(g86Var, "o1");
        zq3.i(g86Var2, "o2");
        zq3.i(it2Var, "combiner");
        Flowable<R> withLatestFrom = flowable.withLatestFrom(g86Var, g86Var2, new Function3<T, T1, T2, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$3
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
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2> Flowable<Triple<T, T1, T2>> withLatestFrom(Flowable<T> flowable, g86 g86Var, g86 g86Var2) {
        zq3.i(flowable, "$this$withLatestFrom");
        zq3.i(g86Var, "o1");
        zq3.i(g86Var2, "o2");
        Flowable<Triple<T, T1, T2>> flowable2 = (Flowable<Triple<T, T1, T2>>) flowable.withLatestFrom(g86Var, g86Var2, new Function3<T, T1, T2, Triple<? extends T, ? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((FlowablesKt$withLatestFrom$4<T1, T2, T3, R, T>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Triple<T, T1, T2> apply(T t, T1 t1, T2 t2) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                return new Triple<>(t, t1, t2);
            }
        });
        zq3.d(flowable2, "withLatestFrom(o1, o2, F…2 -> Triple(t, t1, t2) })");
        return flowable2;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2, T3, R> Flowable<R> withLatestFrom(Flowable<T> flowable, g86 g86Var, g86 g86Var2, g86 g86Var3, final kt2 kt2Var) {
        zq3.i(flowable, "$this$withLatestFrom");
        zq3.i(g86Var, "o1");
        zq3.i(g86Var2, "o2");
        zq3.i(g86Var3, "o3");
        zq3.i(kt2Var, "combiner");
        Flowable<R> withLatestFrom = flowable.withLatestFrom(g86Var, g86Var2, g86Var3, new Function4<T, T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$5
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
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, T1, T2, T3, T4, R> Flowable<R> withLatestFrom(Flowable<T> flowable, g86 g86Var, g86 g86Var2, g86 g86Var3, g86 g86Var4, final mt2 mt2Var) {
        zq3.i(flowable, "$this$withLatestFrom");
        zq3.i(g86Var, "o1");
        zq3.i(g86Var2, "o2");
        zq3.i(g86Var3, "o3");
        zq3.i(g86Var4, "o4");
        zq3.i(mt2Var, "combiner");
        Flowable<R> withLatestFrom = flowable.withLatestFrom(g86Var, g86Var2, g86Var3, g86Var4, new Function5<T, T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$6
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
