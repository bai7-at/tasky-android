package io.reactivex.rxkotlin;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.gt2;
import defpackage.it2;
import defpackage.kt2;
import defpackage.mt2;
import defpackage.nt2;
import defpackage.ot2;
import defpackage.pt2;
import defpackage.qt2;
import defpackage.zq3;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Function7;
import io.reactivex.functions.Function8;
import io.reactivex.functions.Function9;
import kotlin.Pair;
import kotlin.Triple;

/* loaded from: classes5.dex */
public final class Singles {
    public static final Singles INSTANCE = new Singles();

    private Singles() {
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T, U, R> Single<R> zip(SingleSource<T> singleSource, SingleSource<U> singleSource2, final gt2 gt2Var) {
        zq3.i(singleSource, "s1");
        zq3.i(singleSource2, "s2");
        zq3.i(gt2Var, "zipper");
        Single<R> zip = Single.zip(singleSource, singleSource2, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t, U u) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(u, QueryKeys.USER_ID);
                return (R) gt2.this.invoke(t, u);
            }
        });
        zq3.d(zip, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T, U> Single<Pair<T, U>> zip(SingleSource<T> singleSource, SingleSource<U> singleSource2) {
        zq3.i(singleSource, "s1");
        zq3.i(singleSource2, "s2");
        Single<Pair<T, U>> zip = Single.zip(singleSource, singleSource2, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.Singles$zip$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((Singles$zip$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t, U u) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(u, QueryKeys.USER_ID);
                return new Pair<>(t, u);
            }
        });
        zq3.d(zip, "Single.zip(s1, s2, BiFun…n { t, u -> Pair(t, u) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, final it2 it2Var) {
        zq3.i(singleSource, "s1");
        zq3.i(singleSource2, "s2");
        zq3.i(singleSource3, "s3");
        zq3.i(it2Var, "zipper");
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, new Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$3
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                return (R) it2.this.invoke(t1, t2, t3);
            }
        });
        zq3.d(zip, "Single.zip(s1, s2, s3, F…per.invoke(t1, t2, t3) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3> Single<Triple<T1, T2, T3>> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3) {
        zq3.i(singleSource, "s1");
        zq3.i(singleSource2, "s2");
        zq3.i(singleSource3, "s3");
        Single<Triple<T1, T2, T3>> zip = Single.zip(singleSource, singleSource2, singleSource3, new Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Singles$zip$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((Singles$zip$4<T1, T2, T3, R>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                return new Triple<>(t1, t2, t3);
            }
        });
        zq3.d(zip, "Single.zip(s1, s2, s3, F… -> Triple(t1, t2, t3) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, SingleSource<T4> singleSource4, final kt2 kt2Var) {
        zq3.i(singleSource, "s1");
        zq3.i(singleSource2, "s2");
        zq3.i(singleSource3, "s3");
        zq3.i(singleSource4, "s4");
        zq3.i(kt2Var, "zipper");
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, singleSource4, new Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$5
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                zq3.i(t4, "t4");
                return (R) kt2.this.invoke(t1, t2, t3, t4);
            }
        });
        zq3.d(zip, "Single.zip(s1, s2, s3, s…invoke(t1, t2, t3, t4) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, SingleSource<T4> singleSource4, SingleSource<T5> singleSource5, final mt2 mt2Var) {
        zq3.i(singleSource, "s1");
        zq3.i(singleSource2, "s2");
        zq3.i(singleSource3, "s3");
        zq3.i(singleSource4, "s4");
        zq3.i(singleSource5, "s5");
        zq3.i(mt2Var, "zipper");
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, singleSource4, singleSource5, new Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$6
            @Override // io.reactivex.functions.Function5
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                zq3.i(t4, "t4");
                zq3.i(t5, "t5");
                return (R) mt2.this.invoke(t1, t2, t3, t4, t5);
            }
        });
        zq3.d(zip, "Single.zip(s1, s2, s3, s…ke(t1, t2, t3, t4, t5) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, SingleSource<T4> singleSource4, SingleSource<T5> singleSource5, SingleSource<T6> singleSource6, final nt2 nt2Var) {
        zq3.i(singleSource, "s1");
        zq3.i(singleSource2, "s2");
        zq3.i(singleSource3, "s3");
        zq3.i(singleSource4, "s4");
        zq3.i(singleSource5, "s5");
        zq3.i(singleSource6, "s6");
        zq3.i(nt2Var, "zipper");
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, new Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$7
            @Override // io.reactivex.functions.Function6
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                zq3.i(t4, "t4");
                zq3.i(t5, "t5");
                zq3.i(t6, "t6");
                return (R) nt2.this.a(t1, t2, t3, t4, t5, t6);
            }
        });
        zq3.d(zip, "Single.zip(s1, s2, s3, s…1, t2, t3, t4, t5, t6) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, SingleSource<T4> singleSource4, SingleSource<T5> singleSource5, SingleSource<T6> singleSource6, SingleSource<T7> singleSource7, final ot2 ot2Var) {
        zq3.i(singleSource, "s1");
        zq3.i(singleSource2, "s2");
        zq3.i(singleSource3, "s3");
        zq3.i(singleSource4, "s4");
        zq3.i(singleSource5, "s5");
        zq3.i(singleSource6, "s6");
        zq3.i(singleSource7, "s7");
        zq3.i(ot2Var, "zipper");
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7, new Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$8
            @Override // io.reactivex.functions.Function7
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                zq3.i(t4, "t4");
                zq3.i(t5, "t5");
                zq3.i(t6, "t6");
                zq3.i(t7, "t7");
                return (R) ot2.this.invoke(t1, t2, t3, t4, t5, t6, t7);
            }
        });
        zq3.d(zip, "Single.zip(s1, s2, s3, s…2, t3, t4, t5, t6, t7) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, SingleSource<T4> singleSource4, SingleSource<T5> singleSource5, SingleSource<T6> singleSource6, SingleSource<T7> singleSource7, SingleSource<T8> singleSource8, final pt2 pt2Var) {
        zq3.i(singleSource, "s1");
        zq3.i(singleSource2, "s2");
        zq3.i(singleSource3, "s3");
        zq3.i(singleSource4, "s4");
        zq3.i(singleSource5, "s5");
        zq3.i(singleSource6, "s6");
        zq3.i(singleSource7, "s7");
        zq3.i(singleSource8, "s8");
        zq3.i(pt2Var, "zipper");
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7, singleSource8, new Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$9
            @Override // io.reactivex.functions.Function8
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                zq3.i(t4, "t4");
                zq3.i(t5, "t5");
                zq3.i(t6, "t6");
                zq3.i(t7, "t7");
                zq3.i(t8, "t8");
                return (R) pt2.this.invoke(t1, t2, t3, t4, t5, t6, t7, t8);
            }
        });
        zq3.d(zip, "Single.zip(s1, s2, s3, s…3, t4, t5, t6, t7, t8) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, SingleSource<T4> singleSource4, SingleSource<T5> singleSource5, SingleSource<T6> singleSource6, SingleSource<T7> singleSource7, SingleSource<T8> singleSource8, SingleSource<T9> singleSource9, final qt2 qt2Var) {
        zq3.i(singleSource, "s1");
        zq3.i(singleSource2, "s2");
        zq3.i(singleSource3, "s3");
        zq3.i(singleSource4, "s4");
        zq3.i(singleSource5, "s5");
        zq3.i(singleSource6, "s6");
        zq3.i(singleSource7, "s7");
        zq3.i(singleSource8, "s8");
        zq3.i(singleSource9, "s9");
        zq3.i(qt2Var, "zipper");
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7, singleSource8, singleSource9, new Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$10
            @Override // io.reactivex.functions.Function9
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                zq3.i(t4, "t4");
                zq3.i(t5, "t5");
                zq3.i(t6, "t6");
                zq3.i(t7, "t7");
                zq3.i(t8, "t8");
                zq3.i(t9, "t9");
                return (R) qt2.this.e(t1, t2, t3, t4, t5, t6, t7, t8, t9);
            }
        });
        zq3.d(zip, "Single.zip(s1, s2, s3, s…4, t5, t6, t7, t8, t9) })");
        return zip;
    }
}
