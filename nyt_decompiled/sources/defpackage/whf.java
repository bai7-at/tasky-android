package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class whf extends ThreadPoolExecutor {
    final /* synthetic */ xuf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whf(xuf xufVar) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.a = xufVar;
        setThreadFactory(new wof(null));
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new gff(this, runnable, obj);
    }
}
