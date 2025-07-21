package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
final class w4 extends FutureTask implements Comparable {
    private final long a;
    final boolean b;
    private final String c;
    final /* synthetic */ y4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w4(y4 y4Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.d = y4Var;
        Preconditions.checkNotNull(str);
        atomicLong = y4.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            y4Var.a.o().n().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        w4 w4Var = (w4) obj;
        boolean z = this.b;
        if (z == w4Var.b) {
            long j = this.a;
            long j2 = w4Var.a;
            if (j < j2) {
                return -1;
            }
            if (j <= j2) {
                this.d.a.o().s().b("Two tasks share the same index. index", Long.valueOf(this.a));
                return 0;
            }
        } else if (z) {
            return -1;
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.d.a.o().n().b(this.c, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w4(y4 y4Var, Callable callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.d = y4Var;
        Preconditions.checkNotNull("Task exception on worker thread");
        atomicLong = y4.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.a = andIncrement;
        this.c = "Task exception on worker thread";
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            y4Var.a.o().n().a("Tasks index overflow");
        }
    }
}
