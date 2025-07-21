package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class zk8 implements Runnable {
    private static final a Companion = new a(null);
    private final long a;
    private long b;
    private boolean c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public zk8() {
        long nanoTime = System.nanoTime();
        this.a = nanoTime;
        this.b = nanoTime;
    }

    private final void c(Object obj) {
        zq3.f(obj, "null cannot be cast to non-null type java.lang.Object");
        obj.notifyAll();
    }

    public final synchronized long a() {
        return (this.b - this.a) / 1000000;
    }

    public final synchronized boolean b() {
        return this.c;
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        this.b = System.nanoTime();
        this.c = true;
        c(this);
    }
}
