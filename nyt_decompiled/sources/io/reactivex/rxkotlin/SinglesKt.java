package io.reactivex.rxkotlin;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.gt2;
import defpackage.zq3;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class SinglesKt {
    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T, U, R> Single<R> zipWith(Single<T> single, SingleSource<U> singleSource, final gt2 gt2Var) {
        zq3.i(single, "$this$zipWith");
        zq3.i(singleSource, "other");
        zq3.i(gt2Var, "zipper");
        Single<R> zipWith = single.zipWith(singleSource, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.SinglesKt$zipWith$1
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
    @CheckReturnValue
    public static final <T, U> Single<Pair<T, U>> zipWith(Single<T> single, SingleSource<U> singleSource) {
        zq3.i(single, "$this$zipWith");
        zq3.i(singleSource, "other");
        Single<Pair<T, U>> single2 = (Single<Pair<T, U>>) single.zipWith(singleSource, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.SinglesKt$zipWith$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((SinglesKt$zipWith$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t, U u) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(u, QueryKeys.USER_ID);
                return new Pair<>(t, u);
            }
        });
        zq3.d(single2, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return single2;
    }
}
