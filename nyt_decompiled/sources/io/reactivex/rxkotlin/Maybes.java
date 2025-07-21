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
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
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
public final class Maybes {
    public static final Maybes INSTANCE = new Maybes();

    private Maybes() {
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T, U, R> Maybe<R> zip(MaybeSource<T> maybeSource, MaybeSource<U> maybeSource2, final gt2 gt2Var) {
        zq3.i(maybeSource, "s1");
        zq3.i(maybeSource2, "s2");
        zq3.i(gt2Var, "zipper");
        Maybe<R> zip = Maybe.zip(maybeSource, maybeSource2, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t, U u) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(u, QueryKeys.USER_ID);
                return (R) gt2.this.invoke(t, u);
            }
        });
        zq3.d(zip, "Maybe.zip(s1, s2,\n      …-> zipper.invoke(t, u) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T, U> Maybe<Pair<T, U>> zip(MaybeSource<T> maybeSource, MaybeSource<U> maybeSource2) {
        zq3.i(maybeSource, "s1");
        zq3.i(maybeSource2, "s2");
        Maybe<Pair<T, U>> zip = Maybe.zip(maybeSource, maybeSource2, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.Maybes$zip$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((Maybes$zip$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t, U u) {
                zq3.i(t, QueryKeys.TOKEN);
                zq3.i(u, QueryKeys.USER_ID);
                return new Pair<>(t, u);
            }
        });
        zq3.d(zip, "Maybe.zip(s1, s2,\n      …n { t, u -> Pair(t, u) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, R> Maybe<R> zip(MaybeSource<T1> maybeSource, MaybeSource<T2> maybeSource2, MaybeSource<T3> maybeSource3, final it2 it2Var) {
        zq3.i(maybeSource, "s1");
        zq3.i(maybeSource2, "s2");
        zq3.i(maybeSource3, "s3");
        zq3.i(it2Var, "zipper");
        Maybe<R> zip = Maybe.zip(maybeSource, maybeSource2, maybeSource3, new Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$3
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                return (R) it2.this.invoke(t1, t2, t3);
            }
        });
        zq3.d(zip, "Maybe.zip(s1, s2, s3,\n  …per.invoke(t1, t2, t3) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3> Maybe<Triple<T1, T2, T3>> zip(MaybeSource<T1> maybeSource, MaybeSource<T2> maybeSource2, MaybeSource<T3> maybeSource3) {
        zq3.i(maybeSource, "s1");
        zq3.i(maybeSource2, "s2");
        zq3.i(maybeSource3, "s3");
        Maybe<Triple<T1, T2, T3>> zip = Maybe.zip(maybeSource, maybeSource2, maybeSource3, new Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Maybes$zip$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((Maybes$zip$4<T1, T2, T3, R>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                return new Triple<>(t1, t2, t3);
            }
        });
        zq3.d(zip, "Maybe.zip(s1, s2, s3,\n  … -> Triple(t1, t2, t3) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, R> Maybe<R> zip(MaybeSource<T1> maybeSource, MaybeSource<T2> maybeSource2, MaybeSource<T3> maybeSource3, MaybeSource<T4> maybeSource4, final kt2 kt2Var) {
        zq3.i(maybeSource, "s1");
        zq3.i(maybeSource2, "s2");
        zq3.i(maybeSource3, "s3");
        zq3.i(maybeSource4, "s4");
        zq3.i(kt2Var, "zipper");
        Maybe<R> zip = Maybe.zip(maybeSource, maybeSource2, maybeSource3, maybeSource4, new Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$5
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                zq3.i(t4, "t4");
                return (R) kt2.this.invoke(t1, t2, t3, t4);
            }
        });
        zq3.d(zip, "Maybe.zip(s1, s2, s3, s4…invoke(t1, t2, t3, t4) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, R> Maybe<R> zip(MaybeSource<T1> maybeSource, MaybeSource<T2> maybeSource2, MaybeSource<T3> maybeSource3, MaybeSource<T4> maybeSource4, MaybeSource<T5> maybeSource5, final mt2 mt2Var) {
        zq3.i(maybeSource, "s1");
        zq3.i(maybeSource2, "s2");
        zq3.i(maybeSource3, "s3");
        zq3.i(maybeSource4, "s4");
        zq3.i(maybeSource5, "s5");
        zq3.i(mt2Var, "zipper");
        Maybe<R> zip = Maybe.zip(maybeSource, maybeSource2, maybeSource3, maybeSource4, maybeSource5, new Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$6
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
        zq3.d(zip, "Maybe.zip(s1, s2, s3, s4…ke(t1, t2, t3, t4, t5) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, R> Maybe<R> zip(MaybeSource<T1> maybeSource, MaybeSource<T2> maybeSource2, MaybeSource<T3> maybeSource3, MaybeSource<T4> maybeSource4, MaybeSource<T5> maybeSource5, MaybeSource<T6> maybeSource6, final nt2 nt2Var) {
        zq3.i(maybeSource, "s1");
        zq3.i(maybeSource2, "s2");
        zq3.i(maybeSource3, "s3");
        zq3.i(maybeSource4, "s4");
        zq3.i(maybeSource5, "s5");
        zq3.i(maybeSource6, "s6");
        zq3.i(nt2Var, "zipper");
        Maybe<R> zip = Maybe.zip(maybeSource, maybeSource2, maybeSource3, maybeSource4, maybeSource5, maybeSource6, new Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$7
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
        zq3.d(zip, "Maybe.zip(s1, s2, s3, s4…1, t2, t3, t4, t5, t6) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, R> Maybe<R> zip(MaybeSource<T1> maybeSource, MaybeSource<T2> maybeSource2, MaybeSource<T3> maybeSource3, MaybeSource<T4> maybeSource4, MaybeSource<T5> maybeSource5, MaybeSource<T6> maybeSource6, MaybeSource<T7> maybeSource7, final ot2 ot2Var) {
        zq3.i(maybeSource, "s1");
        zq3.i(maybeSource2, "s2");
        zq3.i(maybeSource3, "s3");
        zq3.i(maybeSource4, "s4");
        zq3.i(maybeSource5, "s5");
        zq3.i(maybeSource6, "s6");
        zq3.i(maybeSource7, "s7");
        zq3.i(ot2Var, "zipper");
        Maybe<R> zip = Maybe.zip(maybeSource, maybeSource2, maybeSource3, maybeSource4, maybeSource5, maybeSource6, maybeSource7, new Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$8
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
        zq3.d(zip, "Maybe.zip(s1, s2, s3, s4…2, t3, t4, t5, t6, t7) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Maybe<R> zip(MaybeSource<T1> maybeSource, MaybeSource<T2> maybeSource2, MaybeSource<T3> maybeSource3, MaybeSource<T4> maybeSource4, MaybeSource<T5> maybeSource5, MaybeSource<T6> maybeSource6, MaybeSource<T7> maybeSource7, MaybeSource<T8> maybeSource8, final pt2 pt2Var) {
        zq3.i(maybeSource, "s1");
        zq3.i(maybeSource2, "s2");
        zq3.i(maybeSource3, "s3");
        zq3.i(maybeSource4, "s4");
        zq3.i(maybeSource5, "s5");
        zq3.i(maybeSource6, "s6");
        zq3.i(maybeSource7, "s7");
        zq3.i(maybeSource8, "s8");
        zq3.i(pt2Var, "zipper");
        Maybe<R> zip = Maybe.zip(maybeSource, maybeSource2, maybeSource3, maybeSource4, maybeSource5, maybeSource6, maybeSource7, maybeSource8, new Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$9
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
        zq3.d(zip, "Maybe.zip(s1, s2, s3, s4…3, t4, t5, t6, t7, t8) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Maybe<R> zip(MaybeSource<T1> maybeSource, MaybeSource<T2> maybeSource2, MaybeSource<T3> maybeSource3, MaybeSource<T4> maybeSource4, MaybeSource<T5> maybeSource5, MaybeSource<T6> maybeSource6, MaybeSource<T7> maybeSource7, MaybeSource<T8> maybeSource8, MaybeSource<T9> maybeSource9, final qt2 qt2Var) {
        zq3.i(maybeSource, "s1");
        zq3.i(maybeSource2, "s2");
        zq3.i(maybeSource3, "s3");
        zq3.i(maybeSource4, "s4");
        zq3.i(maybeSource5, "s5");
        zq3.i(maybeSource6, "s6");
        zq3.i(maybeSource7, "s7");
        zq3.i(maybeSource8, "s8");
        zq3.i(maybeSource9, "s9");
        zq3.i(qt2Var, "zipper");
        Maybe<R> zip = Maybe.zip(maybeSource, maybeSource2, maybeSource3, maybeSource4, maybeSource5, maybeSource6, maybeSource7, maybeSource8, maybeSource9, new Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxkotlin.Maybes$zip$10
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
        zq3.d(zip, "Maybe.zip(s1, s2, s3, s4…4, t5, t6, t7, t8, t9) })");
        return zip;
    }
}
