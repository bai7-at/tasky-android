package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* loaded from: classes5.dex */
public class pp2 extends pm8 {
    private pm8 a;

    public pp2(pm8 pm8Var) {
        zq3.h(pm8Var, "delegate");
        this.a = pm8Var;
    }

    public final pm8 a() {
        return this.a;
    }

    @Override // defpackage.pm8
    public void awaitSignal(Condition condition) {
        zq3.h(condition, "condition");
        this.a.awaitSignal(condition);
    }

    public final pp2 b(pm8 pm8Var) {
        zq3.h(pm8Var, "delegate");
        this.a = pm8Var;
        return this;
    }

    @Override // defpackage.pm8
    public pm8 clearDeadline() {
        return this.a.clearDeadline();
    }

    @Override // defpackage.pm8
    public pm8 clearTimeout() {
        return this.a.clearTimeout();
    }

    @Override // defpackage.pm8
    public long deadlineNanoTime() {
        return this.a.deadlineNanoTime();
    }

    @Override // defpackage.pm8
    public boolean hasDeadline() {
        return this.a.hasDeadline();
    }

    @Override // defpackage.pm8
    public void throwIfReached() {
        this.a.throwIfReached();
    }

    @Override // defpackage.pm8
    public pm8 timeout(long j, TimeUnit timeUnit) {
        zq3.h(timeUnit, "unit");
        return this.a.timeout(j, timeUnit);
    }

    @Override // defpackage.pm8
    public long timeoutNanos() {
        return this.a.timeoutNanos();
    }

    @Override // defpackage.pm8
    public void waitUntilNotified(Object obj) {
        zq3.h(obj, "monitor");
        this.a.waitUntilNotified(obj);
    }

    @Override // defpackage.pm8
    public pm8 deadlineNanoTime(long j) {
        return this.a.deadlineNanoTime(j);
    }
}
