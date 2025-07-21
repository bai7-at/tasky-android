package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public final class iaa extends Thread {
    private static final boolean g = gba.b;
    private final BlockingQueue a;
    private final BlockingQueue b;
    private final gaa c;
    private volatile boolean d = false;
    private final hba e;
    private final maa f;

    public iaa(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, gaa gaaVar, maa maaVar) {
        this.a = blockingQueue;
        this.b = blockingQueue2;
        this.c = gaaVar;
        this.f = maaVar;
        this.e = new hba(this, blockingQueue2, maaVar);
    }

    private void c() {
        zaa zaaVar = (zaa) this.a.take();
        zaaVar.n("cache-queue-take");
        zaaVar.v(1);
        try {
            zaaVar.y();
            faa a = this.c.a(zaaVar.j());
            if (a == null) {
                zaaVar.n("cache-miss");
                if (!this.e.c(zaaVar)) {
                    this.b.put(zaaVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (a.a(currentTimeMillis)) {
                    zaaVar.n("cache-hit-expired");
                    zaaVar.d(a);
                    if (!this.e.c(zaaVar)) {
                        this.b.put(zaaVar);
                    }
                } else {
                    zaaVar.n("cache-hit");
                    dba g2 = zaaVar.g(new qaa(a.a, a.g));
                    zaaVar.n("cache-hit-parsed");
                    if (!g2.c()) {
                        zaaVar.n("cache-parsing-failed");
                        this.c.zzc(zaaVar.j(), true);
                        zaaVar.d(null);
                        if (!this.e.c(zaaVar)) {
                            this.b.put(zaaVar);
                        }
                    } else if (a.f < currentTimeMillis) {
                        zaaVar.n("cache-hit-refresh-needed");
                        zaaVar.d(a);
                        g2.d = true;
                        if (this.e.c(zaaVar)) {
                            this.f.b(zaaVar, g2, null);
                        } else {
                            this.f.b(zaaVar, g2, new haa(this, zaaVar));
                        }
                    } else {
                        this.f.b(zaaVar, g2, null);
                    }
                }
            }
            zaaVar.v(2);
        } catch (Throwable th) {
            zaaVar.v(2);
            throw th;
        }
    }

    public final void b() {
        this.d = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (g) {
            gba.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.c.zzb();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                gba.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
