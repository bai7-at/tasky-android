package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class qe5 {
    private final AtomicInteger a = new AtomicInteger();
    private final AtomicInteger b = new AtomicInteger();

    public void a() {
        this.b.getAndIncrement();
    }

    public void b() {
        this.a.getAndIncrement();
    }

    public void c() {
        this.b.set(0);
    }
}
