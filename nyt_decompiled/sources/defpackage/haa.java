package defpackage;

import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
final class haa implements Runnable {
    final /* synthetic */ zaa a;
    final /* synthetic */ iaa b;

    haa(iaa iaaVar, zaa zaaVar) {
        this.a = zaaVar;
        this.b = iaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.b.b;
            blockingQueue.put(this.a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
