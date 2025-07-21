package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class wxa {
    private boolean a = false;
    private boolean b = false;
    private float c = 0.0f;
    private final AtomicBoolean d = new AtomicBoolean(false);

    public final synchronized float a() {
        return this.c;
    }

    public final synchronized void b(boolean z, float f) {
        this.b = z;
        this.c = f;
    }

    public final synchronized void c(boolean z) {
        this.a = z;
        this.d.set(true);
    }

    public final synchronized boolean d() {
        return this.b;
    }

    public final synchronized boolean e(boolean z) {
        if (!this.d.get()) {
            return z;
        }
        return this.a;
    }
}
