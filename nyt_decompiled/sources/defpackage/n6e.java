package defpackage;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class n6e implements k6e {
    private final k6e a;
    private final Queue b = new LinkedBlockingQueue();
    private final int c = ((Integer) pla.c().a(mpa.C8)).intValue();
    private final AtomicBoolean d = new AtomicBoolean(false);

    public n6e(k6e k6eVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = k6eVar;
        long intValue = ((Integer) pla.c().a(mpa.B8)).intValue();
        if (((Boolean) pla.c().a(mpa.kb)).booleanValue()) {
            scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: m6e
                @Override // java.lang.Runnable
                public final void run() {
                    n6e.c(n6e.this);
                }
            }, intValue, intValue, TimeUnit.MILLISECONDS);
        } else {
            scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: m6e
                @Override // java.lang.Runnable
                public final void run() {
                    n6e.c(n6e.this);
                }
            }, intValue, intValue, TimeUnit.MILLISECONDS);
        }
    }

    public static /* synthetic */ void c(n6e n6eVar) {
        while (!n6eVar.b.isEmpty()) {
            n6eVar.a.a((j6e) n6eVar.b.remove());
        }
    }

    @Override // defpackage.k6e
    public final void a(j6e j6eVar) {
        if (this.b.size() < this.c) {
            this.b.offer(j6eVar);
            return;
        }
        if (this.d.getAndSet(true)) {
            return;
        }
        Queue queue = this.b;
        j6e b = j6e.b("dropped_event");
        Map j = j6eVar.j();
        if (j.containsKey("action")) {
            b.a("dropped_action", (String) j.get("action"));
        }
        queue.offer(b);
    }

    @Override // defpackage.k6e
    public final String b(j6e j6eVar) {
        return this.a.b(j6eVar);
    }
}
