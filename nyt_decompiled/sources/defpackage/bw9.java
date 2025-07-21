package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class bw9 implements rx9 {
    private final CountDownLatch a = new CountDownLatch(1);

    /* synthetic */ bw9(mu9 mu9Var) {
    }

    @Override // defpackage.le5
    public final void a() {
        this.a.countDown();
    }

    public final void b() {
        this.a.await();
    }

    public final boolean c(long j, TimeUnit timeUnit) {
        return this.a.await(j, timeUnit);
    }

    @Override // defpackage.ue5
    public final void onFailure(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.vf5
    public final void onSuccess(Object obj) {
        this.a.countDown();
    }
}
