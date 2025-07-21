package io.reactivex.rxkotlin;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.gt2;
import defpackage.zq3;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class MaybesKt {
    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T, U, R> Maybe<R> zipWith(Maybe<T> maybe, MaybeSource<U> maybeSource, final gt2 gt2Var) {
        zq3.i(maybe, "$this$zipWith");
        zq3.i(maybeSource, "other");
        zq3.i(gt2Var, "zipper");
        Maybe<R> zipWith = maybe.zipWith(maybeSource, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.MaybesKt$zipWith$1
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
    public static final <T, U> Maybe<Pair<T, U>> zipWith(Maybe<T> maybe, MaybeSource<U> maybeSource) {
        zq3.i(maybe, "$this$zipWith");
        zq3.i(maybeSource, "other");
        Maybe<Pair<T, U>> maybe2 = (Maybe<Pair<T, U>>) maybe.zipWith(maybeSource, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.MaybesKt$zipWith$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((MaybesKt$zipWith$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t, U u) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(u, QueryKeys.USER_ID);
                return new Pair<>(t, u);
            }
        });
        zq3.d(maybe2, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return maybe2;
    }
}
