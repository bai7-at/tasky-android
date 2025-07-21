package com.nytimes.android.jobs;

import com.nytimes.android.saved.SavedManager;
import defpackage.if8;
import defpackage.pk9;
import defpackage.ps3;
import defpackage.zq3;
import io.reactivex.Completable;
import io.reactivex.Single;
import kotlinx.coroutines.rx2.RxCompletableKt;

/* loaded from: classes4.dex */
public final class UpdateWorkerCompletableCreator {
    private final WorkerRunner a;
    private final pk9 b;
    private final ps3 c;
    private final SavedManager d;
    private final if8 e;

    public UpdateWorkerCompletableCreator(WorkerRunner workerRunner, pk9 pk9Var, ps3 ps3Var, SavedManager savedManager, if8 if8Var) {
        zq3.h(workerRunner, "workerRunner");
        zq3.h(pk9Var, "constraintsCalculator");
        zq3.h(ps3Var, "jobLogger");
        zq3.h(savedManager, "savedManager");
        zq3.h(if8Var, "tabFragmentProxy");
        this.a = workerRunner;
        this.b = pk9Var;
        this.c = ps3Var;
        this.d = savedManager;
        this.e = if8Var;
    }

    public final Completable e() {
        return RxCompletableKt.rxCompletable$default(null, new UpdateWorkerCompletableCreator$create$1(this, null), 1, null);
    }

    public final Single f(UpdateWorker updateWorker) {
        zq3.h(updateWorker, "updateWorker");
        return this.a.g(updateWorker, UpdateWorker.class, "update_job_tag", new UpdateWorkerCompletableCreator$runAndReschedule$1(this.b), e());
    }
}
