package androidx.work;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.RxWorker;
import defpackage.j64;
import defpackage.qd8;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class RxWorker extends b {
    static final Executor e = new qd8();

    class a implements SingleObserver {
        final /* synthetic */ CallbackToFutureAdapter.a a;

        a(CallbackToFutureAdapter.a aVar) {
            this.a = aVar;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.a.f(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(final Disposable disposable) {
            CallbackToFutureAdapter.a aVar = this.a;
            Objects.requireNonNull(disposable);
            aVar.a(new Runnable() { // from class: i57
                @Override // java.lang.Runnable
                public final void run() {
                    Disposable.this.dispose();
                }
            }, RxWorker.e);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.a.c(obj);
        }
    }

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private j64 c(final Single single) {
        return CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: h57
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object a(CallbackToFutureAdapter.a aVar) {
                Object g;
                g = RxWorker.this.g(single, aVar);
                return g;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object g(Single single, CallbackToFutureAdapter.a aVar) {
        single.subscribeOn(e()).observeOn(Schedulers.from(getTaskExecutor().c())).subscribe(new a(aVar));
        return "converted single to future";
    }

    public abstract Single d();

    protected Scheduler e() {
        return Schedulers.from(getBackgroundExecutor());
    }

    public Single f() {
        return Single.error(new IllegalStateException("Expedited WorkRequests require a RxWorker to provide an implementation for `getForegroundInfo()`"));
    }

    @Override // androidx.work.b
    public j64 getForegroundInfoAsync() {
        return c(f());
    }

    @Override // androidx.work.b
    public j64 startWork() {
        return c(d());
    }
}
