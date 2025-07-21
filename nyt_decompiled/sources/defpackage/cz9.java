package defpackage;

import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
final class cz9 implements rx9 {
    private final Object a = new Object();
    private final int b;
    private final w1g c;
    private int d;
    private int e;
    private int f;
    private Exception g;
    private boolean h;

    public cz9(int i, w1g w1gVar) {
        this.b = i;
        this.c = w1gVar;
    }

    private final void b() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g == null) {
                if (this.h) {
                    this.c.v();
                    return;
                } else {
                    this.c.u(null);
                    return;
                }
            }
            this.c.t(new ExecutionException(this.e + " out of " + this.b + " underlying tasks failed", this.g));
        }
    }

    @Override // defpackage.le5
    public final void a() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            b();
        }
    }

    @Override // defpackage.ue5
    public final void onFailure(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            b();
        }
    }

    @Override // defpackage.vf5
    public final void onSuccess(Object obj) {
        synchronized (this.a) {
            this.d++;
            b();
        }
    }
}
