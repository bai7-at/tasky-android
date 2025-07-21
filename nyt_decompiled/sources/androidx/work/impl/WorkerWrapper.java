package androidx.work.impl;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.impl.WorkerWrapper;
import defpackage.dk9;
import defpackage.ej9;
import defpackage.ek9;
import defpackage.h94;
import defpackage.ik9;
import defpackage.j64;
import defpackage.mm1;
import defpackage.rg8;
import defpackage.yo2;
import defpackage.zl0;
import defpackage.zq3;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes.dex */
public final class WorkerWrapper {
    private final dk9 a;
    private final Context b;
    private final String c;
    private final WorkerParameters.a d;
    private final androidx.work.b e;
    private final rg8 f;
    private final androidx.work.a g;
    private final zl0 h;
    private final yo2 i;
    private final WorkDatabase j;
    private final ek9 k;
    private final mm1 l;
    private final List m;
    private final String n;
    private final CompletableJob o;

    public static final class a {
        private final androidx.work.a a;
        private final rg8 b;
        private final yo2 c;
        private final WorkDatabase d;
        private final dk9 e;
        private final List f;
        private final Context g;
        private androidx.work.b h;
        private WorkerParameters.a i;

        public a(Context context, androidx.work.a aVar, rg8 rg8Var, yo2 yo2Var, WorkDatabase workDatabase, dk9 dk9Var, List list) {
            zq3.h(context, "context");
            zq3.h(aVar, "configuration");
            zq3.h(rg8Var, "workTaskExecutor");
            zq3.h(yo2Var, "foregroundProcessor");
            zq3.h(workDatabase, "workDatabase");
            zq3.h(dk9Var, "workSpec");
            zq3.h(list, "tags");
            this.a = aVar;
            this.b = rg8Var;
            this.c = yo2Var;
            this.d = workDatabase;
            this.e = dk9Var;
            this.f = list;
            Context applicationContext = context.getApplicationContext();
            zq3.g(applicationContext, "context.applicationContext");
            this.g = applicationContext;
            this.i = new WorkerParameters.a();
        }

        public final WorkerWrapper a() {
            return new WorkerWrapper(this);
        }

        public final Context b() {
            return this.g;
        }

        public final androidx.work.a c() {
            return this.a;
        }

        public final yo2 d() {
            return this.c;
        }

        public final WorkerParameters.a e() {
            return this.i;
        }

        public final List f() {
            return this.f;
        }

        public final WorkDatabase g() {
            return this.d;
        }

        public final dk9 h() {
            return this.e;
        }

        public final rg8 i() {
            return this.b;
        }

        public final androidx.work.b j() {
            return this.h;
        }

        public final a k(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.i = aVar;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class b {

        public static final class a extends b {
            private final b.a a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b.a aVar) {
                super(null);
                zq3.h(aVar, "result");
                this.a = aVar;
            }

            public final b.a a() {
                return this.a;
            }

            public /* synthetic */ a(b.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new b.a.C0121a() : aVar);
            }
        }

        /* renamed from: androidx.work.impl.WorkerWrapper$b$b, reason: collision with other inner class name */
        public static final class C0123b extends b {
            private final b.a a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0123b(b.a aVar) {
                super(null);
                zq3.h(aVar, "result");
                this.a = aVar;
            }

            public final b.a a() {
                return this.a;
            }
        }

        public static final class c extends b {
            private final int a;

            public c(int i) {
                super(null);
                this.a = i;
            }

            public final int a() {
                return this.a;
            }

            public /* synthetic */ c(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? -256 : i);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public WorkerWrapper(a aVar) {
        CompletableJob Job$default;
        zq3.h(aVar, "builder");
        dk9 h = aVar.h();
        this.a = h;
        this.b = aVar.b();
        this.c = h.a;
        this.d = aVar.e();
        this.e = aVar.j();
        this.f = aVar.i();
        androidx.work.a c = aVar.c();
        this.g = c;
        this.h = c.a();
        this.i = aVar.d();
        WorkDatabase g = aVar.g();
        this.j = g;
        this.k = g.i();
        this.l = g.d();
        List f = aVar.f();
        this.m = f;
        this.n = k(f);
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.o = Job$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean A(WorkerWrapper workerWrapper) {
        boolean z;
        if (workerWrapper.k.g(workerWrapper.c) == WorkInfo.State.ENQUEUED) {
            workerWrapper.k.t(WorkInfo.State.RUNNING, workerWrapper.c);
            workerWrapper.k.z(workerWrapper.c);
            workerWrapper.k.d(workerWrapper.c, -256);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private final String k(List list) {
        return "Work [ id=" + this.c + ", tags={ " + kotlin.collections.i.u0(list, ",", null, null, 0, null, null, 62, null) + " } ]";
    }

    private final boolean n(b.a aVar) {
        String str;
        String str2;
        String str3;
        if (aVar instanceof b.a.c) {
            str3 = WorkerWrapperKt.a;
            h94.e().f(str3, "Worker result SUCCESS for " + this.n);
            return this.a.n() ? t() : y(aVar);
        }
        if (aVar instanceof b.a.C0122b) {
            str2 = WorkerWrapperKt.a;
            h94.e().f(str2, "Worker result RETRY for " + this.n);
            return s(-256);
        }
        str = WorkerWrapperKt.a;
        h94.e().f(str, "Worker result FAILURE for " + this.n);
        if (this.a.n()) {
            return t();
        }
        if (aVar == null) {
            aVar = new b.a.C0121a();
        }
        return x(aVar);
    }

    private final void p(String str) {
        List r = kotlin.collections.i.r(str);
        while (!r.isEmpty()) {
            String str2 = (String) kotlin.collections.i.L(r);
            if (this.k.g(str2) != WorkInfo.State.CANCELLED) {
                this.k.t(WorkInfo.State.FAILED, str2);
            }
            r.addAll(this.l.a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r(b.a aVar) {
        WorkInfo.State g = this.k.g(this.c);
        this.j.h().a(this.c);
        if (g == null) {
            return false;
        }
        if (g == WorkInfo.State.RUNNING) {
            return n(aVar);
        }
        if (g.isFinished()) {
            return false;
        }
        return s(-512);
    }

    private final boolean s(int i) {
        this.k.t(WorkInfo.State.ENQUEUED, this.c);
        this.k.v(this.c, this.h.currentTimeMillis());
        this.k.B(this.c, this.a.h());
        this.k.p(this.c, -1L);
        this.k.d(this.c, i);
        return true;
    }

    private final boolean t() {
        this.k.v(this.c, this.h.currentTimeMillis());
        this.k.t(WorkInfo.State.ENQUEUED, this.c);
        this.k.y(this.c);
        this.k.B(this.c, this.a.h());
        this.k.b(this.c);
        this.k.p(this.c, -1L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(int i) {
        String str;
        String str2;
        WorkInfo.State g = this.k.g(this.c);
        if (g == null || g.isFinished()) {
            str = WorkerWrapperKt.a;
            h94.e().a(str, "Status for " + this.c + " is " + g + " ; not doing any work");
            return false;
        }
        str2 = WorkerWrapperKt.a;
        h94.e().a(str2, "Status for " + this.c + " is " + g + "; not doing any work and rescheduling for later execution");
        this.k.t(WorkInfo.State.ENQUEUED, this.c);
        this.k.d(this.c, i);
        this.k.p(this.c, -1L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.by0 r24) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkerWrapper.v(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean w(WorkerWrapper workerWrapper) {
        String str;
        String str2;
        dk9 dk9Var = workerWrapper.a;
        if (dk9Var.b != WorkInfo.State.ENQUEUED) {
            str2 = WorkerWrapperKt.a;
            h94.e().a(str2, workerWrapper.a.c + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!dk9Var.n() && !workerWrapper.a.m()) || workerWrapper.h.currentTimeMillis() >= workerWrapper.a.c()) {
            return Boolean.FALSE;
        }
        h94 e = h94.e();
        str = WorkerWrapperKt.a;
        e.a(str, "Delaying execution for " + workerWrapper.a.c + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    private final boolean y(b.a aVar) {
        String str;
        this.k.t(WorkInfo.State.SUCCEEDED, this.c);
        zq3.f(aVar, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        Data e = ((b.a.c) aVar).e();
        zq3.g(e, "success.outputData");
        this.k.u(this.c, e);
        long currentTimeMillis = this.h.currentTimeMillis();
        for (String str2 : this.l.a(this.c)) {
            if (this.k.g(str2) == WorkInfo.State.BLOCKED && this.l.b(str2)) {
                str = WorkerWrapperKt.a;
                h94.e().f(str, "Setting status to enqueued for " + str2);
                this.k.t(WorkInfo.State.ENQUEUED, str2);
                this.k.v(str2, currentTimeMillis);
            }
        }
        return false;
    }

    private final boolean z() {
        Object runInTransaction = this.j.runInTransaction((Callable<Object>) new Callable() { // from class: fl9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean A;
                A = WorkerWrapper.A(WorkerWrapper.this);
                return A;
            }
        });
        zq3.g(runInTransaction, "workDatabase.runInTransa…e\n            }\n        )");
        return ((Boolean) runInTransaction).booleanValue();
    }

    public final ej9 l() {
        return ik9.a(this.a);
    }

    public final dk9 m() {
        return this.a;
    }

    public final void o(int i) {
        this.o.cancel((CancellationException) new WorkerStoppedException(i));
    }

    public final j64 q() {
        CompletableJob Job$default;
        CoroutineDispatcher b2 = this.f.b();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        return ListenableFutureKt.k(b2.plus(Job$default), null, new WorkerWrapper$launch$1(this, null), 2, null);
    }

    public final boolean x(b.a aVar) {
        zq3.h(aVar, "result");
        p(this.c);
        Data e = ((b.a.C0121a) aVar).e();
        zq3.g(e, "failure.outputData");
        this.k.B(this.c, this.a.h());
        this.k.u(this.c, e);
        return false;
    }
}
