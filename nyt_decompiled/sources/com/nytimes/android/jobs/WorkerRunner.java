package com.nytimes.android.jobs;

import androidx.work.b;
import com.nytimes.android.jobs.WorkerRunner;
import com.nytimes.android.logging.NYTLogger;
import defpackage.gv0;
import defpackage.h05;
import defpackage.oi9;
import defpackage.ps3;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class WorkerRunner {
    private final h05 a;
    private final ps3 b;

    public WorkerRunner(h05 h05Var, ps3 ps3Var) {
        zq3.h(h05Var, "scheduler");
        zq3.h(ps3Var, "jobLogger");
        this.a = h05Var;
        this.b = ps3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b.a i(WorkerRunner workerRunner, String str) {
        zq3.h(workerRunner, "this$0");
        zq3.h(str, "$uniqueWorkName");
        workerRunner.b.b(str, "Data updated");
        return b.a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b.a j(b bVar, WorkerRunner workerRunner, String str, Throwable th) {
        zq3.h(bVar, "$worker");
        zq3.h(workerRunner, "this$0");
        zq3.h(str, "$uniqueWorkName");
        zq3.h(th, "it");
        int runAttemptCount = bVar.getRunAttemptCount();
        if (runAttemptCount < 2) {
            workerRunner.b.c(str, new Exception("Rescheduling " + str + " (attemptCount = " + runAttemptCount + "): " + th.getMessage(), th));
            return b.a.b();
        }
        workerRunner.b.c(str, new Exception("Error executing " + str + " (attemptCount = " + runAttemptCount + "): " + th.getMessage(), th));
        return b.a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    public final Single g(final b bVar, final Class cls, final String str, final qs2 qs2Var, Completable completable) {
        zq3.h(bVar, "worker");
        zq3.h(cls, "workerClass");
        zq3.h(str, "uniqueWorkName");
        zq3.h(qs2Var, "constraints");
        zq3.h(completable, "block");
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.jobs.WorkerRunner$runAndReschedule$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Disposable disposable) {
                ps3 ps3Var;
                ps3Var = WorkerRunner.this.b;
                ps3Var.a(str, "Updating local data");
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Disposable) obj);
                return ww8.a;
            }
        };
        Single onErrorReturn = completable.doOnSubscribe(new Consumer() { // from class: al9
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WorkerRunner.h(ss2.this, obj);
            }
        }).toSingle(new Callable() { // from class: bl9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b.a i;
                i = WorkerRunner.i(WorkerRunner.this, str);
                return i;
            }
        }).onErrorReturn(new Function() { // from class: cl9
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                b.a j;
                j = WorkerRunner.j(b.this, this, str, (Throwable) obj);
                return j;
            }
        });
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.jobs.WorkerRunner$runAndReschedule$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(b.a aVar) {
                h05 h05Var;
                h05 h05Var2;
                if (aVar instanceof b.a.C0122b) {
                    return;
                }
                NYTLogger.d("rescheduling job " + str, new Object[0]);
                h05Var = this.a;
                if (h05Var.a()) {
                    return;
                }
                h05Var2 = this.a;
                h05Var2.e(cls, str, ((oi9) bVar).a(), (gv0) qs2Var.mo865invoke());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((b.a) obj);
                return ww8.a;
            }
        };
        Single doOnSuccess = onErrorReturn.doOnSuccess(new Consumer() { // from class: dl9
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WorkerRunner.k(ss2.this, obj);
            }
        });
        zq3.g(doOnSuccess, "doOnSuccess(...)");
        return doOnSuccess;
    }
}
