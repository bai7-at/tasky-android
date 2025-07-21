package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class iae {
    private final BlockingQueue a;
    private final ThreadPoolExecutor b;
    private final ArrayDeque c = new ArrayDeque();
    private hae d = null;

    public iae() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = linkedBlockingQueue;
        this.b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void c() {
        hae haeVar = (hae) this.c.poll();
        this.d = haeVar;
        if (haeVar != null) {
            haeVar.executeOnExecutor(this.b, new Object[0]);
        }
    }

    public final void a(hae haeVar) {
        this.d = null;
        c();
    }

    public final void b(hae haeVar) {
        haeVar.b(this);
        this.c.add(haeVar);
        if (this.d == null) {
            c();
        }
    }
}
