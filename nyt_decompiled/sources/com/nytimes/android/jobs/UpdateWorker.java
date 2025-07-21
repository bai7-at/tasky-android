package com.nytimes.android.jobs;

import android.content.Context;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import defpackage.oi9;
import defpackage.zq3;
import io.reactivex.Single;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class UpdateWorker extends RxWorker implements oi9 {
    public static final a Companion = new a(null);
    public static final int i = 8;
    private final Context f;
    private final UpdateWorkerCompletableCreator g;
    private final UpdateWorkerSchedulingParams h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateWorker(Context context, WorkerParameters workerParameters, UpdateWorkerCompletableCreator updateWorkerCompletableCreator, UpdateWorkerSchedulingParams updateWorkerSchedulingParams) {
        super(context, workerParameters);
        zq3.h(context, "context");
        zq3.h(workerParameters, "workerParams");
        zq3.h(updateWorkerCompletableCreator, "updateWorkerCompletableCreator");
        zq3.h(updateWorkerSchedulingParams, "updateWorkerSchedulingParams");
        this.f = context;
        this.g = updateWorkerCompletableCreator;
        this.h = updateWorkerSchedulingParams;
    }

    @Override // defpackage.oi9
    public long a() {
        return this.h.b();
    }

    @Override // androidx.work.RxWorker
    public Single d() {
        return this.g.f(this);
    }
}
