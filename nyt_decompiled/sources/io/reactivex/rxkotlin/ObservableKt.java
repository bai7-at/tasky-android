package io.reactivex.rxkotlin;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.ak7;
import defpackage.ss2;
import defpackage.ym3;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.d;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class ObservableKt {
    @SchedulerSupport("none")
    @CheckReturnValue
    public static final /* synthetic */ <R> Observable<R> cast(Observable<?> observable) {
        zq3.i(observable, "$this$cast");
        zq3.n(4, QueryKeys.READING);
        Observable<R> observable2 = (Observable<R>) observable.cast(Object.class);
        zq3.d(observable2, "cast(R::class.java)");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T, R> Observable<R> combineLatest(Iterable<? extends Observable<T>> iterable, final ss2 ss2Var) {
        zq3.i(iterable, "$this$combineLatest");
        zq3.i(ss2Var, "combineFunction");
        Observable<R> combineLatest = Observable.combineLatest(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.ObservableKt$combineLatest$1
            @Override // io.reactivex.functions.Function
            public final R apply(Object[] objArr) {
                zq3.i(objArr, "it");
                ss2 ss2Var2 = ss2.this;
                List e = d.e(objArr);
                ArrayList arrayList = new ArrayList(i.w(e, 10));
                for (T t : e) {
                    if (t == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t);
                }
                return (R) ss2Var2.invoke(arrayList);
            }
        });
        zq3.d(combineLatest, "Observable.combineLatest…List().map { it as T }) }");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> concatAll(Observable<Observable<T>> observable) {
        zq3.i(observable, "$this$concatAll");
        Observable<T> observable2 = (Observable<T>) observable.concatMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt$concatAll$1
            @Override // io.reactivex.functions.Function
            public final Observable<T> apply(Observable<T> observable3) {
                zq3.i(observable3, "it");
                return observable3;
            }
        });
        zq3.d(observable2, "concatMap { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> concatMapIterable(Observable<? extends Iterable<? extends T>> observable) {
        zq3.i(observable, "$this$concatMapIterable");
        Observable<T> observable2 = (Observable<T>) observable.concatMapIterable(new Function() { // from class: io.reactivex.rxkotlin.ObservableKt$concatMapIterable$1
            @Override // io.reactivex.functions.Function
            public final Iterable<Object> apply(Iterable<Object> iterable) {
                zq3.i(iterable, "it");
                return iterable;
            }
        });
        zq3.d(observable2, "concatMapIterable { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> flatMapIterable(Observable<? extends Iterable<? extends T>> observable) {
        zq3.i(observable, "$this$flatMapIterable");
        Observable<T> observable2 = (Observable<T>) observable.flatMapIterable(new Function() { // from class: io.reactivex.rxkotlin.ObservableKt$flatMapIterable$1
            @Override // io.reactivex.functions.Function
            public final Iterable<Object> apply(Iterable<Object> iterable) {
                zq3.i(iterable, "it");
                return iterable;
            }
        });
        zq3.d(observable2, "flatMapIterable { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T, R> Observable<R> flatMapSequence(Observable<T> observable, final ss2 ss2Var) {
        zq3.i(observable, "$this$flatMapSequence");
        zq3.i(ss2Var, "body");
        Observable<R> flatMap = observable.flatMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt$flatMapSequence$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((ObservableKt$flatMapSequence$1<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Observable<R> apply(T t) {
                zq3.i(t, "it");
                return ObservableKt.toObservable((ak7) ss2.this.invoke(t));
            }
        });
        zq3.d(flatMap, "flatMap { body(it).toObservable() }");
        return flatMap;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> merge(Iterable<? extends Observable<? extends T>> iterable) {
        zq3.i(iterable, "$this$merge");
        Observable<T> merge = Observable.merge(toObservable(iterable));
        zq3.d(merge, "Observable.merge(this.toObservable())");
        return merge;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> mergeAll(Observable<Observable<T>> observable) {
        zq3.i(observable, "$this$mergeAll");
        Observable<T> observable2 = (Observable<T>) observable.flatMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt$mergeAll$1
            @Override // io.reactivex.functions.Function
            public final Observable<T> apply(Observable<T> observable3) {
                zq3.i(observable3, "it");
                return observable3;
            }
        });
        zq3.d(observable2, "flatMap { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> mergeDelayError(Iterable<? extends Observable<? extends T>> iterable) {
        zq3.i(iterable, "$this$mergeDelayError");
        Observable<T> mergeDelayError = Observable.mergeDelayError(toObservable(iterable));
        zq3.d(mergeDelayError, "Observable.mergeDelayError(this.toObservable())");
        return mergeDelayError;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final /* synthetic */ <R> Observable<R> ofType(Observable<?> observable) {
        zq3.i(observable, "$this$ofType");
        zq3.n(4, QueryKeys.READING);
        Observable<R> observable2 = (Observable<R>) observable.ofType(Object.class);
        zq3.d(observable2, "ofType(R::class.java)");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> switchLatest(Observable<Observable<T>> observable) {
        zq3.i(observable, "$this$switchLatest");
        Observable<T> observable2 = (Observable<T>) observable.switchMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt$switchLatest$1
            @Override // io.reactivex.functions.Function
            public final Observable<T> apply(Observable<T> observable3) {
                zq3.i(observable3, "it");
                return observable3;
            }
        });
        zq3.d(observable2, "switchMap { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> switchOnNext(Observable<Observable<T>> observable) {
        zq3.i(observable, "$this$switchOnNext");
        Observable<T> switchOnNext = Observable.switchOnNext(observable);
        zq3.d(switchOnNext, "Observable.switchOnNext(this)");
        return switchOnNext;
    }

    private static final <T> Iterable<T> toIterable(Iterator<? extends T> it2) {
        return new ObservableKt$toIterable$1(it2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <A, B> Single<Map<A, B>> toMap(Observable<Pair<A, B>> observable) {
        zq3.i(observable, "$this$toMap");
        Single<Map<A, B>> single = (Single<Map<A, B>>) observable.toMap(new Function() { // from class: io.reactivex.rxkotlin.ObservableKt$toMap$1
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                zq3.i(pair, "it");
                return pair.c();
            }
        }, new Function() { // from class: io.reactivex.rxkotlin.ObservableKt$toMap$2
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                zq3.i(pair, "it");
                return pair.d();
            }
        });
        zq3.d(single, "toMap({ it.first }, { it.second })");
        return single;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <A, B> Single<Map<A, Collection<B>>> toMultimap(Observable<Pair<A, B>> observable) {
        zq3.i(observable, "$this$toMultimap");
        Single<Map<A, Collection<B>>> single = (Single<Map<A, Collection<B>>>) observable.toMultimap(new Function() { // from class: io.reactivex.rxkotlin.ObservableKt$toMultimap$1
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                zq3.i(pair, "it");
                return pair.c();
            }
        }, new Function() { // from class: io.reactivex.rxkotlin.ObservableKt$toMultimap$2
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                zq3.i(pair, "it");
                return pair.d();
            }
        });
        zq3.d(single, "toMultimap({ it.first }, { it.second })");
        return single;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final Observable<Boolean> toObservable(boolean[] zArr) {
        zq3.i(zArr, "$this$toObservable");
        return toObservable(d.Q(zArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T, R> Observable<R> zip(Iterable<? extends Observable<T>> iterable, final ss2 ss2Var) {
        zq3.i(iterable, "$this$zip");
        zq3.i(ss2Var, "zipFunction");
        Observable<R> zip = Observable.zip(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.ObservableKt$zip$1
            @Override // io.reactivex.functions.Function
            public final R apply(Object[] objArr) {
                zq3.i(objArr, "it");
                ss2 ss2Var2 = ss2.this;
                List e = d.e(objArr);
                ArrayList arrayList = new ArrayList(i.w(e, 10));
                for (T t : e) {
                    if (t == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t);
                }
                return (R) ss2Var2.invoke(arrayList);
            }
        });
        zq3.d(zip, "Observable.zip(this) { z…List().map { it as T }) }");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> concatAll(Iterable<? extends ObservableSource<T>> iterable) {
        zq3.i(iterable, "$this$concatAll");
        Observable<T> concat = Observable.concat(iterable);
        zq3.d(concat, "Observable.concat(this)");
        return concat;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final Observable<Byte> toObservable(byte[] bArr) {
        zq3.i(bArr, "$this$toObservable");
        return toObservable(d.I(bArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final Observable<Character> toObservable(char[] cArr) {
        zq3.i(cArr, "$this$toObservable");
        return toObservable(d.J(cArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final Observable<Short> toObservable(short[] sArr) {
        zq3.i(sArr, "$this$toObservable");
        return toObservable(d.P(sArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final Observable<Integer> toObservable(int[] iArr) {
        zq3.i(iArr, "$this$toObservable");
        return toObservable(d.M(iArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final Observable<Long> toObservable(long[] jArr) {
        zq3.i(jArr, "$this$toObservable");
        return toObservable(d.N(jArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final Observable<Float> toObservable(float[] fArr) {
        zq3.i(fArr, "$this$toObservable");
        return toObservable(d.L(fArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final Observable<Double> toObservable(double[] dArr) {
        zq3.i(dArr, "$this$toObservable");
        return toObservable(d.K(dArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> toObservable(T[] tArr) {
        zq3.i(tArr, "$this$toObservable");
        Observable<T> fromArray = Observable.fromArray(Arrays.copyOf(tArr, tArr.length));
        zq3.d(fromArray, "Observable.fromArray(*this)");
        return fromArray;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final Observable<Integer> toObservable(ym3 ym3Var) {
        zq3.i(ym3Var, "$this$toObservable");
        if (ym3Var.n() != 1 || ym3Var.j() - ym3Var.g() >= Integer.MAX_VALUE) {
            Observable<Integer> fromIterable = Observable.fromIterable(ym3Var);
            zq3.d(fromIterable, "Observable.fromIterable(this)");
            return fromIterable;
        }
        Observable<Integer> range = Observable.range(ym3Var.g(), Math.max(0, (ym3Var.j() - ym3Var.g()) + 1));
        zq3.d(range, "Observable.range(first, …max(0, last - first + 1))");
        return range;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> toObservable(Iterator<? extends T> it2) {
        zq3.i(it2, "$this$toObservable");
        return toObservable(toIterable(it2));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> toObservable(Iterable<? extends T> iterable) {
        zq3.i(iterable, "$this$toObservable");
        Observable<T> fromIterable = Observable.fromIterable(iterable);
        zq3.d(fromIterable, "Observable.fromIterable(this)");
        return fromIterable;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Observable<T> toObservable(ak7 ak7Var) {
        zq3.i(ak7Var, "$this$toObservable");
        return toObservable(kotlin.sequences.d.h(ak7Var));
    }
}
