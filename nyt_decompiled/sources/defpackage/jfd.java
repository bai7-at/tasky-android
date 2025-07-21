package defpackage;

/* loaded from: classes3.dex */
public final class jfd {
    private final acd a;
    private boolean b;

    public jfd(acd acdVar) {
        this.a = acdVar;
    }

    public final synchronized void a() {
        while (!this.b) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public final synchronized boolean d() {
        return this.b;
    }

    public final synchronized boolean e() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }
}
