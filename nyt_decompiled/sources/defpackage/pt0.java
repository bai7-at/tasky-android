package defpackage;

/* loaded from: classes2.dex */
public class pt0 {
    private final vl0 a;
    private boolean b;

    public pt0() {
        this(vl0.a);
    }

    public synchronized void a() {
        while (!this.b) {
            wait();
        }
    }

    public synchronized void b() {
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

    public synchronized boolean c() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public synchronized boolean d() {
        return this.b;
    }

    public synchronized boolean e() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public pt0(vl0 vl0Var) {
        this.a = vl0Var;
    }
}
