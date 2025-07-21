package io.reactivex.rxkotlin;

import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;

/* loaded from: classes5.dex */
public final class SubscribersKt {
    private static final ss2 onNextStub = new ss2() { // from class: io.reactivex.rxkotlin.SubscribersKt$onNextStub$1
        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m866invoke(obj);
            return ww8.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m866invoke(Object obj) {
            zq3.i(obj, "it");
        }
    };
    private static final ss2 onErrorStub = new ss2() { // from class: io.reactivex.rxkotlin.SubscribersKt$onErrorStub$1
        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return ww8.a;
        }

        public final void invoke(Throwable th) {
            zq3.i(th, "it");
        }
    };
    private static final qs2 onCompleteStub = new qs2() { // from class: io.reactivex.rxkotlin.SubscribersKt$onCompleteStub$1
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            invoke();
            return ww8.a;
        }

        public final void invoke() {
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxkotlin.SubscribersKt$sam$io_reactivex_functions_Consumer$0] */
    private static final <T> Consumer<T> asConsumer(ss2 ss2Var) {
        if (ss2Var == onNextStub) {
            Consumer<T> emptyConsumer = Functions.emptyConsumer();
            zq3.d(emptyConsumer, "Functions.emptyConsumer()");
            return emptyConsumer;
        }
        if (ss2Var != null) {
            ss2Var = new SubscribersKt$sam$io_reactivex_functions_Consumer$0(ss2Var);
        }
        return (Consumer) ss2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxkotlin.SubscribersKt$sam$io_reactivex_functions_Action$0] */
    private static final Action asOnCompleteAction(qs2 qs2Var) {
        if (qs2Var == onCompleteStub) {
            Action action = Functions.EMPTY_ACTION;
            zq3.d(action, "Functions.EMPTY_ACTION");
            return action;
        }
        if (qs2Var != null) {
            qs2Var = new SubscribersKt$sam$io_reactivex_functions_Action$0(qs2Var);
        }
        return (Action) qs2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxkotlin.SubscribersKt$sam$io_reactivex_functions_Consumer$0] */
    private static final Consumer<Throwable> asOnErrorConsumer(ss2 ss2Var) {
        if (ss2Var == onErrorStub) {
            Consumer<Throwable> consumer = Functions.ON_ERROR_MISSING;
            zq3.d(consumer, "Functions.ON_ERROR_MISSING");
            return consumer;
        }
        if (ss2Var != null) {
            ss2Var = new SubscribersKt$sam$io_reactivex_functions_Consumer$0(ss2Var);
        }
        return (Consumer) ss2Var;
    }

    @SchedulerSupport("none")
    public static final <T> void blockingSubscribeBy(Observable<T> observable, ss2 ss2Var, qs2 qs2Var, ss2 ss2Var2) {
        zq3.i(observable, "$this$blockingSubscribeBy");
        zq3.i(ss2Var, "onError");
        zq3.i(qs2Var, "onComplete");
        zq3.i(ss2Var2, "onNext");
        observable.blockingSubscribe(asConsumer(ss2Var2), asOnErrorConsumer(ss2Var), asOnCompleteAction(qs2Var));
    }

    public static /* synthetic */ void blockingSubscribeBy$default(Observable observable, ss2 ss2Var, qs2 qs2Var, ss2 ss2Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            ss2Var = onErrorStub;
        }
        if ((i & 2) != 0) {
            qs2Var = onCompleteStub;
        }
        if ((i & 4) != 0) {
            ss2Var2 = onNextStub;
        }
        blockingSubscribeBy(observable, ss2Var, qs2Var, ss2Var2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Disposable subscribeBy(Observable<T> observable, ss2 ss2Var, qs2 qs2Var, ss2 ss2Var2) {
        zq3.i(observable, "$this$subscribeBy");
        zq3.i(ss2Var, "onError");
        zq3.i(qs2Var, "onComplete");
        zq3.i(ss2Var2, "onNext");
        Disposable subscribe = observable.subscribe(asConsumer(ss2Var2), asOnErrorConsumer(ss2Var), asOnCompleteAction(qs2Var));
        zq3.d(subscribe, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return subscribe;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Observable observable, ss2 ss2Var, qs2 qs2Var, ss2 ss2Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            ss2Var = onErrorStub;
        }
        if ((i & 2) != 0) {
            qs2Var = onCompleteStub;
        }
        if ((i & 4) != 0) {
            ss2Var2 = onNextStub;
        }
        return subscribeBy(observable, ss2Var, qs2Var, ss2Var2);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    public static final <T> void blockingSubscribeBy(Flowable<T> flowable, ss2 ss2Var, qs2 qs2Var, ss2 ss2Var2) {
        zq3.i(flowable, "$this$blockingSubscribeBy");
        zq3.i(ss2Var, "onError");
        zq3.i(qs2Var, "onComplete");
        zq3.i(ss2Var2, "onNext");
        flowable.blockingSubscribe(asConsumer(ss2Var2), asOnErrorConsumer(ss2Var), asOnCompleteAction(qs2Var));
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <T> Disposable subscribeBy(Flowable<T> flowable, ss2 ss2Var, qs2 qs2Var, ss2 ss2Var2) {
        zq3.i(flowable, "$this$subscribeBy");
        zq3.i(ss2Var, "onError");
        zq3.i(qs2Var, "onComplete");
        zq3.i(ss2Var2, "onNext");
        Disposable subscribe = flowable.subscribe(asConsumer(ss2Var2), asOnErrorConsumer(ss2Var), asOnCompleteAction(qs2Var));
        zq3.d(subscribe, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return subscribe;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Disposable subscribeBy(Single<T> single, ss2 ss2Var, ss2 ss2Var2) {
        zq3.i(single, "$this$subscribeBy");
        zq3.i(ss2Var, "onError");
        zq3.i(ss2Var2, "onSuccess");
        Disposable subscribe = single.subscribe(asConsumer(ss2Var2), asOnErrorConsumer(ss2Var));
        zq3.d(subscribe, "subscribe(onSuccess.asCo…rror.asOnErrorConsumer())");
        return subscribe;
    }

    public static /* synthetic */ void blockingSubscribeBy$default(Flowable flowable, ss2 ss2Var, qs2 qs2Var, ss2 ss2Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            ss2Var = onErrorStub;
        }
        if ((i & 2) != 0) {
            qs2Var = onCompleteStub;
        }
        if ((i & 4) != 0) {
            ss2Var2 = onNextStub;
        }
        blockingSubscribeBy(flowable, ss2Var, qs2Var, ss2Var2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final <T> Disposable subscribeBy(Maybe<T> maybe, ss2 ss2Var, qs2 qs2Var, ss2 ss2Var2) {
        zq3.i(maybe, "$this$subscribeBy");
        zq3.i(ss2Var, "onError");
        zq3.i(qs2Var, "onComplete");
        zq3.i(ss2Var2, "onSuccess");
        Disposable subscribe = maybe.subscribe(asConsumer(ss2Var2), asOnErrorConsumer(ss2Var), asOnCompleteAction(qs2Var));
        zq3.d(subscribe, "subscribe(onSuccess.asCo…ete.asOnCompleteAction())");
        return subscribe;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Flowable flowable, ss2 ss2Var, qs2 qs2Var, ss2 ss2Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            ss2Var = onErrorStub;
        }
        if ((i & 2) != 0) {
            qs2Var = onCompleteStub;
        }
        if ((i & 4) != 0) {
            ss2Var2 = onNextStub;
        }
        return subscribeBy(flowable, ss2Var, qs2Var, ss2Var2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public static final Disposable subscribeBy(Completable completable, ss2 ss2Var, qs2 qs2Var) {
        zq3.i(completable, "$this$subscribeBy");
        zq3.i(ss2Var, "onError");
        zq3.i(qs2Var, "onComplete");
        ss2 ss2Var2 = onErrorStub;
        if (ss2Var == ss2Var2 && qs2Var == onCompleteStub) {
            Disposable subscribe = completable.subscribe();
            zq3.d(subscribe, "subscribe()");
            return subscribe;
        }
        if (ss2Var == ss2Var2) {
            Disposable subscribe2 = completable.subscribe(new SubscribersKt$sam$io_reactivex_functions_Action$0(qs2Var));
            zq3.d(subscribe2, "subscribe(onComplete)");
            return subscribe2;
        }
        Disposable subscribe3 = completable.subscribe(asOnCompleteAction(qs2Var), new SubscribersKt$sam$io_reactivex_functions_Consumer$0(ss2Var));
        zq3.d(subscribe3, "subscribe(onComplete.asO…ion(), Consumer(onError))");
        return subscribe3;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Single single, ss2 ss2Var, ss2 ss2Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            ss2Var = onErrorStub;
        }
        if ((i & 2) != 0) {
            ss2Var2 = onNextStub;
        }
        return subscribeBy(single, ss2Var, ss2Var2);
    }

    public static /* synthetic */ Disposable subscribeBy$default(Maybe maybe, ss2 ss2Var, qs2 qs2Var, ss2 ss2Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            ss2Var = onErrorStub;
        }
        if ((i & 2) != 0) {
            qs2Var = onCompleteStub;
        }
        if ((i & 4) != 0) {
            ss2Var2 = onNextStub;
        }
        return subscribeBy(maybe, ss2Var, qs2Var, ss2Var2);
    }

    public static /* synthetic */ Disposable subscribeBy$default(Completable completable, ss2 ss2Var, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ss2Var = onErrorStub;
        }
        if ((i & 2) != 0) {
            qs2Var = onCompleteStub;
        }
        return subscribeBy(completable, ss2Var, qs2Var);
    }
}
