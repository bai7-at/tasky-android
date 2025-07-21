package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzaqj;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public final class paa extends Thread {
    private final BlockingQueue a;
    private final oaa b;
    private final gaa c;
    private volatile boolean d = false;
    private final maa e;

    public paa(BlockingQueue blockingQueue, oaa oaaVar, gaa gaaVar, maa maaVar) {
        this.a = blockingQueue;
        this.b = oaaVar;
        this.c = gaaVar;
        this.e = maaVar;
    }

    private void b() {
        zaa zaaVar = (zaa) this.a.take();
        SystemClock.elapsedRealtime();
        zaaVar.v(3);
        try {
            try {
                zaaVar.n("network-queue-take");
                zaaVar.y();
                TrafficStats.setThreadStatsTag(zaaVar.b());
                qaa a = this.b.a(zaaVar);
                zaaVar.n("network-http-complete");
                if (a.e && zaaVar.x()) {
                    zaaVar.q("not-modified");
                    zaaVar.t();
                } else {
                    dba g = zaaVar.g(a);
                    zaaVar.n("network-parse-complete");
                    if (g.b != null) {
                        this.c.b(zaaVar.j(), g.b);
                        zaaVar.n("network-cache-written");
                    }
                    zaaVar.s();
                    this.e.b(zaaVar, g, null);
                    zaaVar.u(g);
                }
            } catch (zzaqj e) {
                SystemClock.elapsedRealtime();
                this.e.a(zaaVar, e);
                zaaVar.t();
            } catch (Exception e2) {
                gba.c(e2, "Unhandled exception %s", e2.toString());
                zzaqj zzaqjVar = new zzaqj(e2);
                SystemClock.elapsedRealtime();
                this.e.a(zaaVar, zzaqjVar);
                zaaVar.t();
            }
            zaaVar.v(4);
        } catch (Throwable th) {
            zaaVar.v(4);
            throw th;
        }
    }

    public final void a() {
        this.d = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                gba.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
