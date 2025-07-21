package io.reactivex.rxkotlin;

import defpackage.du8;
import defpackage.gt2;
import defpackage.it2;
import defpackage.kt2;
import defpackage.mt2;
import defpackage.nt2;
import defpackage.ot2;
import defpackage.pt2;
import defpackage.qt2;
import defpackage.zq3;
import io.reactivex.Observable;
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
public final class Observables {
    public static final Observables INSTANCE = new Observables();

    private Observables() {
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, R> Observable<R> combineLatest(Observable<T1> observable, Observable<T2> observable2, final gt2 gt2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(gt2Var, "combineFunction");
        Observable<R> combineLatest = Observable.combineLatest(observable, observable2, new BiFunction<T1, T2, R>() { // from class: io.reactivex.rxkotlin.Observables$combineLatest$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                return (R) gt2.this.invoke(t1, t2);
            }
        });
        zq3.d(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, R> Observable<R> zip(Observable<T1> observable, Observable<T2> observable2, final gt2 gt2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(gt2Var, "combineFunction");
        Observable<R> zip = Observable.zip(observable, observable2, new BiFunction<T1, T2, R>() { // from class: io.reactivex.rxkotlin.Observables$zip$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                return (R) gt2.this.invoke(t1, t2);
            }
        });
        zq3.d(zip, "Observable.zip(source1, …ombineFunction(t1, t2) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2> Observable<Pair<T1, T2>> combineLatest(Observable<T1> observable, Observable<T2> observable2) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        Observable<Pair<T1, T2>> combineLatest = Observable.combineLatest(observable, observable2, new BiFunction<T1, T2, Pair<? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.Observables$combineLatest$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((Observables$combineLatest$2<T1, T2, R>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T1, T2> apply(T1 t1, T2 t2) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                return du8.a(t1, t2);
            }
        });
        zq3.d(combineLatest, "Observable.combineLatest…> { t1, t2 -> t1 to t2 })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2> Observable<Pair<T1, T2>> zip(Observable<T1> observable, Observable<T2> observable2) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        Observable<Pair<T1, T2>> zip = Observable.zip(observable, observable2, new BiFunction<T1, T2, Pair<? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.Observables$zip$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((Observables$zip$2<T1, T2, R>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T1, T2> apply(T1 t1, T2 t2) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                return du8.a(t1, t2);
            }
        });
        zq3.d(zip, "Observable.zip(source1, …> { t1, t2 -> t1 to t2 })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, R> Observable<R> combineLatest(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, final it2 it2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(it2Var, "combineFunction");
        Observable<R> combineLatest = Observable.combineLatest(observable, observable2, observable3, new Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.Observables$combineLatest$3
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                return (R) it2.this.invoke(t1, t2, t3);
            }
        });
        zq3.d(combineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, R> Observable<R> zip(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, final it2 it2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(it2Var, "combineFunction");
        Observable<R> zip = Observable.zip(observable, observable2, observable3, new Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.Observables$zip$3
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                return (R) it2.this.invoke(t1, t2, t3);
            }
        });
        zq3.d(zip, "Observable.zip(source1, …neFunction(t1, t2, t3) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3> Observable<Triple<T1, T2, T3>> combineLatest(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        Observable<Triple<T1, T2, T3>> combineLatest = Observable.combineLatest(observable, observable2, observable3, new Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Observables$combineLatest$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((Observables$combineLatest$4<T1, T2, T3, R>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                return new Triple<>(t1, t2, t3);
            }
        });
        zq3.d(combineLatest, "Observable.combineLatest… -> Triple(t1, t2, t3) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3> Observable<Triple<T1, T2, T3>> zip(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        Observable<Triple<T1, T2, T3>> zip = Observable.zip(observable, observable2, observable3, new Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Observables$zip$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((Observables$zip$4<T1, T2, T3, R>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                return new Triple<>(t1, t2, t3);
            }
        });
        zq3.d(zip, "Observable.zip(source1, … -> Triple(t1, t2, t3) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, R> Observable<R> combineLatest(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, Observable<T4> observable4, final kt2 kt2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(observable4, "source4");
        zq3.i(kt2Var, "combineFunction");
        Observable<R> combineLatest = Observable.combineLatest(observable, observable2, observable3, observable4, new Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.Observables$combineLatest$5
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                zq3.i(t4, "t4");
                return (R) kt2.this.invoke(t1, t2, t3, t4);
            }
        });
        zq3.d(combineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, R> Observable<R> zip(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, Observable<T4> observable4, final kt2 kt2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(observable4, "source4");
        zq3.i(kt2Var, "combineFunction");
        Observable<R> zip = Observable.zip(observable, observable2, observable3, observable4, new Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.Observables$zip$5
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                zq3.i(t4, "t4");
                return (R) kt2.this.invoke(t1, t2, t3, t4);
            }
        });
        zq3.d(zip, "Observable.zip(source1, …nction(t1, t2, t3, t4) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, R> Observable<R> combineLatest(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, Observable<T4> observable4, Observable<T5> observable5, final mt2 mt2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(observable4, "source4");
        zq3.i(observable5, "source5");
        zq3.i(mt2Var, "combineFunction");
        Observable<R> combineLatest = Observable.combineLatest(observable, observable2, observable3, observable4, observable5, new Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxkotlin.Observables$combineLatest$6
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
        zq3.d(combineLatest, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, R> Observable<R> zip(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, Observable<T4> observable4, Observable<T5> observable5, final mt2 mt2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(observable4, "source4");
        zq3.i(observable5, "source5");
        zq3.i(mt2Var, "combineFunction");
        Observable<R> zip = Observable.zip(observable, observable2, observable3, observable4, observable5, new Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxkotlin.Observables$zip$6
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
        zq3.d(zip, "Observable.zip(source1, …on(t1, t2, t3, t4, t5) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, R> Observable<R> combineLatest(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, Observable<T4> observable4, Observable<T5> observable5, Observable<T6> observable6, final nt2 nt2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(observable4, "source4");
        zq3.i(observable5, "source5");
        zq3.i(observable6, "source6");
        zq3.i(nt2Var, "combineFunction");
        Observable<R> combineLatest = Observable.combineLatest(observable, observable2, observable3, observable4, observable5, observable6, new Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxkotlin.Observables$combineLatest$7
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
        zq3.d(combineLatest, "Observable.combineLatest…1, t2, t3, t4, t5, t6) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, R> Observable<R> zip(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, Observable<T4> observable4, Observable<T5> observable5, Observable<T6> observable6, final nt2 nt2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(observable4, "source4");
        zq3.i(observable5, "source5");
        zq3.i(observable6, "source6");
        zq3.i(nt2Var, "combineFunction");
        Observable<R> zip = Observable.zip(observable, observable2, observable3, observable4, observable5, observable6, new Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxkotlin.Observables$zip$7
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
        zq3.d(zip, "Observable.zip(source1, …1, t2, t3, t4, t5, t6) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> combineLatest(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, Observable<T4> observable4, Observable<T5> observable5, Observable<T6> observable6, Observable<T7> observable7, final ot2 ot2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(observable4, "source4");
        zq3.i(observable5, "source5");
        zq3.i(observable6, "source6");
        zq3.i(observable7, "source7");
        zq3.i(ot2Var, "combineFunction");
        Observable<R> combineLatest = Observable.combineLatest(observable, observable2, observable3, observable4, observable5, observable6, observable7, new Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxkotlin.Observables$combineLatest$8
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
        zq3.d(combineLatest, "Observable.combineLatest…2, t3, t4, t5, t6, t7) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> zip(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, Observable<T4> observable4, Observable<T5> observable5, Observable<T6> observable6, Observable<T7> observable7, final ot2 ot2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(observable4, "source4");
        zq3.i(observable5, "source5");
        zq3.i(observable6, "source6");
        zq3.i(observable7, "source7");
        zq3.i(ot2Var, "combineFunction");
        Observable<R> zip = Observable.zip(observable, observable2, observable3, observable4, observable5, observable6, observable7, new Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxkotlin.Observables$zip$8
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
        zq3.d(zip, "Observable.zip(source1, …2, t3, t4, t5, t6, t7) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> combineLatest(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, Observable<T4> observable4, Observable<T5> observable5, Observable<T6> observable6, Observable<T7> observable7, Observable<T8> observable8, final pt2 pt2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(observable4, "source4");
        zq3.i(observable5, "source5");
        zq3.i(observable6, "source6");
        zq3.i(observable7, "source7");
        zq3.i(observable8, "source8");
        zq3.i(pt2Var, "combineFunction");
        Observable<R> combineLatest = Observable.combineLatest(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8, new Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxkotlin.Observables$combineLatest$9
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
        zq3.d(combineLatest, "Observable.combineLatest…3, t4, t5, t6, t7, t8) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> zip(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, Observable<T4> observable4, Observable<T5> observable5, Observable<T6> observable6, Observable<T7> observable7, Observable<T8> observable8, final pt2 pt2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(observable4, "source4");
        zq3.i(observable5, "source5");
        zq3.i(observable6, "source6");
        zq3.i(observable7, "source7");
        zq3.i(observable8, "source8");
        zq3.i(pt2Var, "combineFunction");
        Observable<R> zip = Observable.zip(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8, new Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxkotlin.Observables$zip$9
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
        zq3.d(zip, "Observable.zip(source1, …3, t4, t5, t6, t7, t8) })");
        return zip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> combineLatest(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, Observable<T4> observable4, Observable<T5> observable5, Observable<T6> observable6, Observable<T7> observable7, Observable<T8> observable8, Observable<T9> observable9, final qt2 qt2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(observable4, "source4");
        zq3.i(observable5, "source5");
        zq3.i(observable6, "source6");
        zq3.i(observable7, "source7");
        zq3.i(observable8, "source8");
        zq3.i(observable9, "source9");
        zq3.i(qt2Var, "combineFunction");
        Observable<R> combineLatest = Observable.combineLatest(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8, observable9, new Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxkotlin.Observables$combineLatest$10
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
        zq3.d(combineLatest, "Observable.combineLatest…4, t5, t6, t7, t8, t9) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> zip(Observable<T1> observable, Observable<T2> observable2, Observable<T3> observable3, Observable<T4> observable4, Observable<T5> observable5, Observable<T6> observable6, Observable<T7> observable7, Observable<T8> observable8, Observable<T9> observable9, final qt2 qt2Var) {
        zq3.i(observable, "source1");
        zq3.i(observable2, "source2");
        zq3.i(observable3, "source3");
        zq3.i(observable4, "source4");
        zq3.i(observable5, "source5");
        zq3.i(observable6, "source6");
        zq3.i(observable7, "source7");
        zq3.i(observable8, "source8");
        zq3.i(observable9, "source9");
        zq3.i(qt2Var, "combineFunction");
        Observable<R> zip = Observable.zip(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8, observable9, new Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxkotlin.Observables$zip$10
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
        zq3.d(zip, "Observable.zip(source1, …4, t5, t6, t7, t8, t9) })");
        return zip;
    }
}
