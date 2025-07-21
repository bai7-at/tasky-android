package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class c5e implements v3f {
    private final l4f a;

    public c5e(l4f l4fVar) {
        this.a = l4fVar;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        ThreadFactory threadFactory = (ThreadFactory) this.a.zzb();
        bde.a();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
        d4f.b(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
