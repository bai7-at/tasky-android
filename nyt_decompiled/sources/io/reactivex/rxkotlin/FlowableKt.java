package io.reactivex.rxkotlin;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.ak7;
import defpackage.g86;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ss2;
import defpackage.ym3;
import defpackage.zq3;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TypeCastException;
import kotlin.collections.d;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class FlowableKt {
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final /* synthetic */ <R> Flowable<R> cast(Flowable<?> flowable) {
        zq3.i(flowable, "$this$cast");
        zq3.n(4, QueryKeys.READING);
        Flowable<R> flowable2 = (Flowable<R>) flowable.cast(Object.class);
        zq3.d(flowable2, "cast(R::class.java)");
        return flowable2;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> combineLatest(Iterable<? extends Flowable<T>> iterable, final ss2 ss2Var) {
        zq3.i(iterable, "$this$combineLatest");
        zq3.i(ss2Var, "combineFunction");
        Flowable<R> combineLatest = Flowable.combineLatest(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.FlowableKt$combineLatest$1
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
        zq3.d(combineLatest, "Flowable.combineLatest(t…List().map { it as T }) }");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(Flowable<Flowable<T>> flowable) {
        zq3.i(flowable, "$this$concatAll");
        Flowable<T> flowable2 = (Flowable<T>) flowable.concatMap(new Function<T, g86>() { // from class: io.reactivex.rxkotlin.FlowableKt$concatAll$1
            @Override // io.reactivex.functions.Function
            public final Flowable<T> apply(Flowable<T> flowable3) {
                zq3.i(flowable3, "it");
                return flowable3;
            }
        });
        zq3.d(flowable2, "concatMap { it }");
        return flowable2;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> flatMapSequence(Flowable<T> flowable, final ss2 ss2Var) {
        zq3.i(flowable, "$this$flatMapSequence");
        zq3.i(ss2Var, "body");
        Flowable<R> flatMap = flowable.flatMap(new Function<T, g86>() { // from class: io.reactivex.rxkotlin.FlowableKt$flatMapSequence$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ g86 apply(Object obj) {
                return apply((FlowableKt$flatMapSequence$1<T, R>) obj);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.reactivex.functions.Function
            public final g86 apply(T t) {
                zq3.i(t, "it");
                return FlowableKt.toFlowable((ak7) ss2.this.invoke(t));
            }
        });
        zq3.d(flatMap, "flatMap { body(it).toFlowable() }");
        return flatMap;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> merge(Iterable<? extends Flowable<? extends T>> iterable) {
        zq3.i(iterable, "$this$merge");
        Flowable<T> merge = Flowable.merge(toFlowable(iterable));
        zq3.d(merge, "Flowable.merge(this.toFlowable())");
        return merge;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeAll(Flowable<Flowable<T>> flowable) {
        zq3.i(flowable, "$this$mergeAll");
        Flowable<T> flowable2 = (Flowable<T>) flowable.flatMap(new Function<T, g86>() { // from class: io.reactivex.rxkotlin.FlowableKt$mergeAll$1
            @Override // io.reactivex.functions.Function
            public final Flowable<T> apply(Flowable<T> flowable3) {
                zq3.i(flowable3, "it");
                return flowable3;
            }
        });
        zq3.d(flowable2, "flatMap { it }");
        return flowable2;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeDelayError(Iterable<? extends Flowable<? extends T>> iterable) {
        zq3.i(iterable, "$this$mergeDelayError");
        Flowable<T> mergeDelayError = Flowable.mergeDelayError(toFlowable(iterable));
        zq3.d(mergeDelayError, "Flowable.mergeDelayError(this.toFlowable())");
        return mergeDelayError;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final /* synthetic */ <R> Flowable<R> ofType(Flowable<?> flowable) {
        zq3.i(flowable, "$this$ofType");
        zq3.n(4, QueryKeys.READING);
        Flowable<R> flowable2 = (Flowable<R>) flowable.ofType(Object.class);
        zq3.d(flowable2, "ofType(R::class.java)");
        return flowable2;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> switchLatest(Flowable<Flowable<T>> flowable) {
        zq3.i(flowable, "$this$switchLatest");
        Flowable<T> flowable2 = (Flowable<T>) flowable.switchMap(new Function<T, g86>() { // from class: io.reactivex.rxkotlin.FlowableKt$switchLatest$1
            @Override // io.reactivex.functions.Function
            public final Flowable<T> apply(Flowable<T> flowable3) {
                zq3.i(flowable3, "it");
                return flowable3;
            }
        });
        zq3.d(flowable2, "switchMap { it }");
        return flowable2;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> switchOnNext(Flowable<Flowable<T>> flowable) {
        zq3.i(flowable, "$this$switchOnNext");
        Flowable<T> switchOnNext = Flowable.switchOnNext(flowable);
        zq3.d(switchOnNext, "Flowable.switchOnNext(this)");
        return switchOnNext;
    }

    @CheckReturnValue
    public static final Flowable<Boolean> toFlowable(boolean[] zArr) {
        zq3.i(zArr, "$this$toFlowable");
        return toFlowable(d.Q(zArr));
    }

    private static final <T> Iterable<T> toIterable(Iterator<? extends T> it2) {
        return new FlowableKt$toIterable$1(it2);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <A, B> Single<Map<A, B>> toMap(Flowable<Pair<A, B>> flowable) {
        zq3.i(flowable, "$this$toMap");
        Single<Map<A, B>> single = (Single<Map<A, B>>) flowable.toMap(new Function() { // from class: io.reactivex.rxkotlin.FlowableKt$toMap$1
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                zq3.i(pair, "it");
                return pair.c();
            }
        }, new Function() { // from class: io.reactivex.rxkotlin.FlowableKt$toMap$2
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
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <A, B> Single<Map<A, Collection<B>>> toMultimap(Flowable<Pair<A, B>> flowable) {
        zq3.i(flowable, "$this$toMultimap");
        Single<Map<A, Collection<B>>> single = (Single<Map<A, Collection<B>>>) flowable.toMultimap(new Function() { // from class: io.reactivex.rxkotlin.FlowableKt$toMultimap$1
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                zq3.i(pair, "it");
                return pair.c();
            }
        }, new Function() { // from class: io.reactivex.rxkotlin.FlowableKt$toMultimap$2
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
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> zip(Iterable<? extends Flowable<T>> iterable, final ss2 ss2Var) {
        zq3.i(iterable, "$this$zip");
        zq3.i(ss2Var, "zipFunction");
        Flowable<R> zip = Flowable.zip(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.FlowableKt$zip$1
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
        zq3.d(zip, "Flowable.zip(this) { zip…List().map { it as T }) }");
        return zip;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<Pair<T, R>> combineLatest(Flowable<T> flowable, Flowable<R> flowable2) {
        zq3.i(flowable, "$this$combineLatest");
        zq3.i(flowable2, "flowable");
        final FlowableKt$combineLatest$2 flowableKt$combineLatest$2 = FlowableKt$combineLatest$2.INSTANCE;
        Object obj = flowableKt$combineLatest$2;
        if (flowableKt$combineLatest$2 != null) {
            obj = new BiFunction() { // from class: io.reactivex.rxkotlin.FlowableKt$sam$io_reactivex_functions_BiFunction$0
                @Override // io.reactivex.functions.BiFunction
                @NonNull
                public final /* synthetic */ Object apply(@NonNull Object obj2, @NonNull Object obj3) {
                    return gt2.this.invoke(obj2, obj3);
                }
            };
        }
        Flowable<Pair<T, R>> combineLatest = Flowable.combineLatest(flowable, flowable2, (BiFunction) obj);
        zq3.d(combineLatest, "Flowable.combineLatest(t…able, BiFunction(::Pair))");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(Iterable<? extends g86> iterable) {
        zq3.i(iterable, "$this$concatAll");
        Flowable<T> concat = Flowable.concat(iterable);
        zq3.d(concat, "Flowable.concat(this)");
        return concat;
    }

    @CheckReturnValue
    public static final Flowable<Byte> toFlowable(byte[] bArr) {
        zq3.i(bArr, "$this$toFlowable");
        return toFlowable(d.I(bArr));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R, U> Flowable<Triple<T, R, U>> combineLatest(Flowable<T> flowable, Flowable<R> flowable2, Flowable<U> flowable3) {
        zq3.i(flowable, "$this$combineLatest");
        zq3.i(flowable2, "flowable1");
        zq3.i(flowable3, "flowable2");
        final FlowableKt$combineLatest$3 flowableKt$combineLatest$3 = FlowableKt$combineLatest$3.INSTANCE;
        Object obj = flowableKt$combineLatest$3;
        if (flowableKt$combineLatest$3 != null) {
            obj = new Function3() { // from class: io.reactivex.rxkotlin.FlowableKt$sam$io_reactivex_functions_Function3$0
                @Override // io.reactivex.functions.Function3
                @NonNull
                public final /* synthetic */ Object apply(@NonNull Object obj2, @NonNull Object obj3, @NonNull Object obj4) {
                    return it2.this.invoke(obj2, obj3, obj4);
                }
            };
        }
        Flowable<Triple<T, R, U>> combineLatest = Flowable.combineLatest(flowable, flowable2, flowable3, (Function3) obj);
        zq3.d(combineLatest, "Flowable.combineLatest(t…le2, Function3(::Triple))");
        return combineLatest;
    }

    @CheckReturnValue
    public static final Flowable<Character> toFlowable(char[] cArr) {
        zq3.i(cArr, "$this$toFlowable");
        return toFlowable(d.J(cArr));
    }

    @CheckReturnValue
    public static final Flowable<Short> toFlowable(short[] sArr) {
        zq3.i(sArr, "$this$toFlowable");
        return toFlowable(d.P(sArr));
    }

    @CheckReturnValue
    public static final Flowable<Integer> toFlowable(int[] iArr) {
        zq3.i(iArr, "$this$toFlowable");
        return toFlowable(d.M(iArr));
    }

    @CheckReturnValue
    public static final Flowable<Long> toFlowable(long[] jArr) {
        zq3.i(jArr, "$this$toFlowable");
        return toFlowable(d.N(jArr));
    }

    @CheckReturnValue
    public static final Flowable<Float> toFlowable(float[] fArr) {
        zq3.i(fArr, "$this$toFlowable");
        return toFlowable(d.L(fArr));
    }

    @CheckReturnValue
    public static final Flowable<Double> toFlowable(double[] dArr) {
        zq3.i(dArr, "$this$toFlowable");
        return toFlowable(d.K(dArr));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> toFlowable(T[] tArr) {
        zq3.i(tArr, "$this$toFlowable");
        Flowable<T> fromArray = Flowable.fromArray(Arrays.copyOf(tArr, tArr.length));
        zq3.d(fromArray, "Flowable.fromArray(*this)");
        return fromArray;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final Flowable<Integer> toFlowable(ym3 ym3Var) {
        zq3.i(ym3Var, "$this$toFlowable");
        if (ym3Var.n() != 1 || ym3Var.j() - ym3Var.g() >= Integer.MAX_VALUE) {
            Flowable<Integer> fromIterable = Flowable.fromIterable(ym3Var);
            zq3.d(fromIterable, "Flowable.fromIterable(this)");
            return fromIterable;
        }
        Flowable<Integer> range = Flowable.range(ym3Var.g(), Math.max(0, (ym3Var.j() - ym3Var.g()) + 1));
        zq3.d(range, "Flowable.range(first, Ma…max(0, last - first + 1))");
        return range;
    }

    public static final <T> Flowable<T> toFlowable(Iterator<? extends T> it2) {
        zq3.i(it2, "$this$toFlowable");
        return toFlowable(toIterable(it2));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> toFlowable(Iterable<? extends T> iterable) {
        zq3.i(iterable, "$this$toFlowable");
        Flowable<T> fromIterable = Flowable.fromIterable(iterable);
        zq3.d(fromIterable, "Flowable.fromIterable(this)");
        return fromIterable;
    }

    public static final <T> Flowable<T> toFlowable(ak7 ak7Var) {
        zq3.i(ak7Var, "$this$toFlowable");
        return toFlowable(kotlin.sequences.d.h(ak7Var));
    }
}
