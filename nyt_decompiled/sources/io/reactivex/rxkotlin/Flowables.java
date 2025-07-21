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
import defpackage.ss2;
import defpackage.zq3;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
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
public final class Flowables {
    public static final Flowables INSTANCE = new Flowables();

    private Flowables() {
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, R> Flowable<R> combineLatest(Flowable<T1> flowable, Flowable<T2> flowable2, final gt2 gt2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(gt2Var, "combineFunction");
        Flowable<R> combineLatest = Flowable.combineLatest(flowable, flowable2, new BiFunction<T1, T2, R>() { // from class: io.reactivex.rxkotlin.Flowables$combineLatest$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                return (R) gt2.this.invoke(t1, t2);
            }
        });
        zq3.d(combineLatest, "Flowable.combineLatest(s…ombineFunction(t1, t2) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final <T> Flowable<T> create(BackpressureStrategy backpressureStrategy, final ss2 ss2Var) {
        zq3.i(backpressureStrategy, "mode");
        zq3.i(ss2Var, "source");
        Flowable<T> create = Flowable.create(new FlowableOnSubscribe<T>() { // from class: io.reactivex.rxkotlin.Flowables$create$1
            @Override // io.reactivex.FlowableOnSubscribe
            public final void subscribe(FlowableEmitter<T> flowableEmitter) {
                zq3.i(flowableEmitter, "it");
                ss2.this.invoke(flowableEmitter);
            }
        }, backpressureStrategy);
        zq3.d(create, "Flowable.create({ source(it) }, mode)");
        return create;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, R> Flowable<R> zip(Flowable<T1> flowable, Flowable<T2> flowable2, final gt2 gt2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(gt2Var, "combineFunction");
        Flowable<R> zip = Flowable.zip(flowable, flowable2, new BiFunction<T1, T2, R>() { // from class: io.reactivex.rxkotlin.Flowables$zip$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                return (R) gt2.this.invoke(t1, t2);
            }
        });
        zq3.d(zip, "Flowable.zip(source1, so…ombineFunction(t1, t2) })");
        return zip;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2> Flowable<Pair<T1, T2>> combineLatest(Flowable<T1> flowable, Flowable<T2> flowable2) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        Flowable<Pair<T1, T2>> combineLatest = Flowable.combineLatest(flowable, flowable2, new BiFunction<T1, T2, Pair<? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.Flowables$combineLatest$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((Flowables$combineLatest$2<T1, T2, R>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T1, T2> apply(T1 t1, T2 t2) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                return du8.a(t1, t2);
            }
        });
        zq3.d(combineLatest, "Flowable.combineLatest(s…> { t1, t2 -> t1 to t2 })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2> Flowable<Pair<T1, T2>> zip(Flowable<T1> flowable, Flowable<T2> flowable2) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        Flowable<Pair<T1, T2>> zip = Flowable.zip(flowable, flowable2, new BiFunction<T1, T2, Pair<? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.Flowables$zip$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((Flowables$zip$2<T1, T2, R>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T1, T2> apply(T1 t1, T2 t2) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                return du8.a(t1, t2);
            }
        });
        zq3.d(zip, "Flowable.zip(source1, so…> { t1, t2 -> t1 to t2 })");
        return zip;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, R> Flowable<R> zip(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, final it2 it2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(it2Var, "combineFunction");
        Flowable<R> zip = Flowable.zip(flowable, flowable2, flowable3, new Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.Flowables$zip$3
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                return (R) it2.this.invoke(t1, t2, t3);
            }
        });
        zq3.d(zip, "Flowable.zip(source1, so…neFunction(t1, t2, t3) })");
        return zip;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, R> Flowable<R> combineLatest(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, final it2 it2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(it2Var, "combineFunction");
        Flowable<R> combineLatest = Flowable.combineLatest(flowable, flowable2, flowable3, new Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.Flowables$combineLatest$3
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                return (R) it2.this.invoke(t1, t2, t3);
            }
        });
        zq3.d(combineLatest, "Flowable.combineLatest(s…neFunction(t1, t2, t3) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3> Flowable<Triple<T1, T2, T3>> zip(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        Flowable<Triple<T1, T2, T3>> zip = Flowable.zip(flowable, flowable2, flowable3, new Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Flowables$zip$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((Flowables$zip$4<T1, T2, T3, R>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                return new Triple<>(t1, t2, t3);
            }
        });
        zq3.d(zip, "Flowable.zip(source1, so… -> Triple(t1, t2, t3) })");
        return zip;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3> Flowable<Triple<T1, T2, T3>> combineLatest(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        Flowable<Triple<T1, T2, T3>> combineLatest = Flowable.combineLatest(flowable, flowable2, flowable3, new Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Flowables$combineLatest$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((Flowables$combineLatest$4<T1, T2, T3, R>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                return new Triple<>(t1, t2, t3);
            }
        });
        zq3.d(combineLatest, "Flowable.combineLatest(s… -> Triple(t1, t2, t3) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, R> Flowable<R> zip(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, Flowable<T4> flowable4, final kt2 kt2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(flowable4, "source4");
        zq3.i(kt2Var, "combineFunction");
        Flowable<R> zip = Flowable.zip(flowable, flowable2, flowable3, flowable4, new Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.Flowables$zip$5
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                zq3.i(t4, "t4");
                return (R) kt2.this.invoke(t1, t2, t3, t4);
            }
        });
        zq3.d(zip, "Flowable.zip(source1, so…nction(t1, t2, t3, t4) })");
        return zip;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, R> Flowable<R> combineLatest(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, Flowable<T4> flowable4, final kt2 kt2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(flowable4, "source4");
        zq3.i(kt2Var, "combineFunction");
        Flowable<R> combineLatest = Flowable.combineLatest(flowable, flowable2, flowable3, flowable4, new Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.Flowables$combineLatest$5
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                zq3.i(t1, "t1");
                zq3.i(t2, "t2");
                zq3.i(t3, "t3");
                zq3.i(t4, "t4");
                return (R) kt2.this.invoke(t1, t2, t3, t4);
            }
        });
        zq3.d(combineLatest, "Flowable.combineLatest(s…nction(t1, t2, t3, t4) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, R> Flowable<R> zip(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, Flowable<T4> flowable4, Flowable<T5> flowable5, final mt2 mt2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(flowable4, "source4");
        zq3.i(flowable5, "source5");
        zq3.i(mt2Var, "combineFunction");
        Flowable<R> zip = Flowable.zip(flowable, flowable2, flowable3, flowable4, flowable5, new Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxkotlin.Flowables$zip$6
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
        zq3.d(zip, "Flowable.zip(source1, so…on(t1, t2, t3, t4, t5) })");
        return zip;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, R> Flowable<R> combineLatest(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, Flowable<T4> flowable4, Flowable<T5> flowable5, final mt2 mt2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(flowable4, "source4");
        zq3.i(flowable5, "source5");
        zq3.i(mt2Var, "combineFunction");
        Flowable<R> combineLatest = Flowable.combineLatest(flowable, flowable2, flowable3, flowable4, flowable5, new Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxkotlin.Flowables$combineLatest$6
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
        zq3.d(combineLatest, "Flowable.combineLatest(s…on(t1, t2, t3, t4, t5) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, R> Flowable<R> zip(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, Flowable<T4> flowable4, Flowable<T5> flowable5, Flowable<T6> flowable6, final nt2 nt2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(flowable4, "source4");
        zq3.i(flowable5, "source5");
        zq3.i(flowable6, "source6");
        zq3.i(nt2Var, "combineFunction");
        Flowable<R> zip = Flowable.zip(flowable, flowable2, flowable3, flowable4, flowable5, flowable6, new Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxkotlin.Flowables$zip$7
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
        zq3.d(zip, "Flowable.zip(source1, so…1, t2, t3, t4, t5, t6) })");
        return zip;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, R> Flowable<R> combineLatest(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, Flowable<T4> flowable4, Flowable<T5> flowable5, Flowable<T6> flowable6, final nt2 nt2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(flowable4, "source4");
        zq3.i(flowable5, "source5");
        zq3.i(flowable6, "source6");
        zq3.i(nt2Var, "combineFunction");
        Flowable<R> combineLatest = Flowable.combineLatest(flowable, flowable2, flowable3, flowable4, flowable5, flowable6, new Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxkotlin.Flowables$combineLatest$7
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
        zq3.d(combineLatest, "Flowable.combineLatest(s…1, t2, t3, t4, t5, t6) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, R> Flowable<R> zip(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, Flowable<T4> flowable4, Flowable<T5> flowable5, Flowable<T6> flowable6, Flowable<T7> flowable7, final ot2 ot2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(flowable4, "source4");
        zq3.i(flowable5, "source5");
        zq3.i(flowable6, "source6");
        zq3.i(flowable7, "source7");
        zq3.i(ot2Var, "combineFunction");
        Flowable<R> zip = Flowable.zip(flowable, flowable2, flowable3, flowable4, flowable5, flowable6, flowable7, new Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxkotlin.Flowables$zip$8
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
        zq3.d(zip, "Flowable.zip(source1, so…2, t3, t4, t5, t6, t7) })");
        return zip;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, R> Flowable<R> combineLatest(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, Flowable<T4> flowable4, Flowable<T5> flowable5, Flowable<T6> flowable6, Flowable<T7> flowable7, final ot2 ot2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(flowable4, "source4");
        zq3.i(flowable5, "source5");
        zq3.i(flowable6, "source6");
        zq3.i(flowable7, "source7");
        zq3.i(ot2Var, "combineFunction");
        Flowable<R> combineLatest = Flowable.combineLatest(flowable, flowable2, flowable3, flowable4, flowable5, flowable6, flowable7, new Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxkotlin.Flowables$combineLatest$8
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
        zq3.d(combineLatest, "Flowable.combineLatest(s…2, t3, t4, t5, t6, t7) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Flowable<R> zip(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, Flowable<T4> flowable4, Flowable<T5> flowable5, Flowable<T6> flowable6, Flowable<T7> flowable7, Flowable<T8> flowable8, final pt2 pt2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(flowable4, "source4");
        zq3.i(flowable5, "source5");
        zq3.i(flowable6, "source6");
        zq3.i(flowable7, "source7");
        zq3.i(flowable8, "source8");
        zq3.i(pt2Var, "combineFunction");
        Flowable<R> zip = Flowable.zip(flowable, flowable2, flowable3, flowable4, flowable5, flowable6, flowable7, flowable8, new Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxkotlin.Flowables$zip$9
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
        zq3.d(zip, "Flowable.zip(source1, so…3, t4, t5, t6, t7, t8) })");
        return zip;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Flowable<R> combineLatest(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, Flowable<T4> flowable4, Flowable<T5> flowable5, Flowable<T6> flowable6, Flowable<T7> flowable7, Flowable<T8> flowable8, final pt2 pt2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(flowable4, "source4");
        zq3.i(flowable5, "source5");
        zq3.i(flowable6, "source6");
        zq3.i(flowable7, "source7");
        zq3.i(flowable8, "source8");
        zq3.i(pt2Var, "combineFunction");
        Flowable<R> combineLatest = Flowable.combineLatest(flowable, flowable2, flowable3, flowable4, flowable5, flowable6, flowable7, flowable8, new Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxkotlin.Flowables$combineLatest$9
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
        zq3.d(combineLatest, "Flowable.combineLatest(s…3, t4, t5, t6, t7, t8) })");
        return combineLatest;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Flowable<R> zip(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, Flowable<T4> flowable4, Flowable<T5> flowable5, Flowable<T6> flowable6, Flowable<T7> flowable7, Flowable<T8> flowable8, Flowable<T9> flowable9, final qt2 qt2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(flowable4, "source4");
        zq3.i(flowable5, "source5");
        zq3.i(flowable6, "source6");
        zq3.i(flowable7, "source7");
        zq3.i(flowable8, "source8");
        zq3.i(flowable9, "source9");
        zq3.i(qt2Var, "combineFunction");
        Flowable<R> zip = Flowable.zip(flowable, flowable2, flowable3, flowable4, flowable5, flowable6, flowable7, flowable8, flowable9, new Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxkotlin.Flowables$zip$10
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
        zq3.d(zip, "Flowable.zip(source1, so…4, t5, t6, t7, t8, t9) })");
        return zip;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Flowable<R> combineLatest(Flowable<T1> flowable, Flowable<T2> flowable2, Flowable<T3> flowable3, Flowable<T4> flowable4, Flowable<T5> flowable5, Flowable<T6> flowable6, Flowable<T7> flowable7, Flowable<T8> flowable8, Flowable<T9> flowable9, final qt2 qt2Var) {
        zq3.i(flowable, "source1");
        zq3.i(flowable2, "source2");
        zq3.i(flowable3, "source3");
        zq3.i(flowable4, "source4");
        zq3.i(flowable5, "source5");
        zq3.i(flowable6, "source6");
        zq3.i(flowable7, "source7");
        zq3.i(flowable8, "source8");
        zq3.i(flowable9, "source9");
        zq3.i(qt2Var, "combineFunction");
        Flowable<R> combineLatest = Flowable.combineLatest(flowable, flowable2, flowable3, flowable4, flowable5, flowable6, flowable7, flowable8, flowable9, new Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxkotlin.Flowables$combineLatest$10
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
        zq3.d(combineLatest, "Flowable.combineLatest(s…4, t5, t6, t7, t8, t9) })");
        return combineLatest;
    }
}
