package androidx.paging;

import androidx.paging.DataSource;
import androidx.paging.PagedList;
import androidx.paging.RxPagedListBuilder;
import defpackage.ab7;
import defpackage.qs2;
import defpackage.vn;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.functions.Cancellable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxSchedulerKt;

/* loaded from: classes.dex */
public final class RxPagedListBuilder {
    private final qs2 a;
    private final DataSource.Factory b;
    private final PagedList.c c;
    private Object d;
    private CoroutineDispatcher e;
    private Scheduler f;
    private CoroutineDispatcher g;
    private Scheduler h;

    public static final class PagingObservableOnSubscribe implements ObservableOnSubscribe, Cancellable {
        private final PagedList.c a;
        private final qs2 b;
        private final CoroutineDispatcher c;
        private final CoroutineDispatcher d;
        private boolean e;
        private PagedList f;
        private Job g;
        private ObservableEmitter h;
        private final qs2 i;
        private final Runnable j;

        public PagingObservableOnSubscribe(Object obj, PagedList.c cVar, PagedList.a aVar, qs2 qs2Var, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
            zq3.h(cVar, "config");
            zq3.h(qs2Var, "pagingSourceFactory");
            zq3.h(coroutineDispatcher, "notifyDispatcher");
            zq3.h(coroutineDispatcher2, "fetchDispatcher");
            this.a = cVar;
            this.b = qs2Var;
            this.c = coroutineDispatcher;
            this.d = coroutineDispatcher2;
            this.e = true;
            this.i = new qs2() { // from class: androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$callback$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m128invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m128invoke() {
                    RxPagedListBuilder.PagingObservableOnSubscribe.this.m(true);
                }
            };
            Runnable runnable = new Runnable() { // from class: x47
                @Override // java.lang.Runnable
                public final void run() {
                    RxPagedListBuilder.PagingObservableOnSubscribe.o(RxPagedListBuilder.PagingObservableOnSubscribe.this);
                }
            };
            this.j = runnable;
            c cVar2 = new c(GlobalScope.INSTANCE, coroutineDispatcher, coroutineDispatcher2, cVar, obj);
            this.f = cVar2;
            cVar2.R(runnable);
        }

        public static final /* synthetic */ PagedList.a b(PagingObservableOnSubscribe pagingObservableOnSubscribe) {
            pagingObservableOnSubscribe.getClass();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m(boolean z) {
            Job launch$default;
            Job job = this.g;
            if (job == null || z) {
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, this.d, null, new RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1(this, null), 2, null);
                this.g = launch$default;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n(PagedList pagedList, PagedList pagedList2) {
            pagedList.R(null);
            pagedList2.R(this.j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(PagingObservableOnSubscribe pagingObservableOnSubscribe) {
            zq3.h(pagingObservableOnSubscribe, "this$0");
            pagingObservableOnSubscribe.m(true);
        }

        @Override // io.reactivex.functions.Cancellable
        public void cancel() {
            this.f.y().unregisterInvalidatedCallback(this.i);
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter observableEmitter) {
            zq3.h(observableEmitter, "emitter");
            this.h = observableEmitter;
            observableEmitter.setCancellable(this);
            if (this.e) {
                observableEmitter.onNext(this.f);
                this.e = false;
            }
            m(false);
        }
    }

    public RxPagedListBuilder(DataSource.Factory factory, PagedList.c cVar) {
        zq3.h(factory, "dataSourceFactory");
        zq3.h(cVar, "config");
        this.a = null;
        this.b = factory;
        this.c = cVar;
    }

    public final Flowable a(BackpressureStrategy backpressureStrategy) {
        zq3.h(backpressureStrategy, "backpressureStrategy");
        Flowable flowable = b().toFlowable(backpressureStrategy);
        zq3.g(flowable, "buildObservable().toFlowable(backpressureStrategy)");
        return flowable;
    }

    public final Observable b() {
        Scheduler scheduler = this.f;
        if (scheduler == null) {
            Executor h = vn.h();
            zq3.g(h, "getMainThreadExecutor()");
            scheduler = new ab7(h);
        }
        CoroutineDispatcher coroutineDispatcher = this.e;
        if (coroutineDispatcher == null) {
            coroutineDispatcher = RxSchedulerKt.asCoroutineDispatcher(scheduler);
        }
        CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
        Scheduler scheduler2 = this.h;
        if (scheduler2 == null) {
            Executor f = vn.f();
            zq3.g(f, "getIOThreadExecutor()");
            scheduler2 = new ab7(f);
        }
        CoroutineDispatcher coroutineDispatcher3 = this.g;
        if (coroutineDispatcher3 == null) {
            coroutineDispatcher3 = RxSchedulerKt.asCoroutineDispatcher(scheduler2);
        }
        CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcher3;
        qs2 qs2Var = this.a;
        if (qs2Var == null) {
            DataSource.Factory factory = this.b;
            qs2Var = factory != null ? factory.a(coroutineDispatcher4) : null;
        }
        qs2 qs2Var2 = qs2Var;
        if (qs2Var2 == null) {
            throw new IllegalStateException("RxPagedList cannot be built without a PagingSourceFactory or DataSource.Factory");
        }
        Observable subscribeOn = Observable.create(new PagingObservableOnSubscribe(this.d, this.c, null, qs2Var2, coroutineDispatcher2, coroutineDispatcher4)).observeOn(scheduler).subscribeOn(scheduler2);
        zq3.g(subscribeOn, "create(\n                …bscribeOn(fetchScheduler)");
        return subscribeOn;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RxPagedListBuilder(DataSource.Factory factory, int i) {
        this(factory, new PagedList.c.a().b(i).a());
        zq3.h(factory, "dataSourceFactory");
    }
}
