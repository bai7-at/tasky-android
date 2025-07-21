package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class zc4 implements ThreadFactory {
    private static final AtomicInteger d = new AtomicInteger(1);
    private final ThreadGroup a;
    private final AtomicInteger b = new AtomicInteger(1);
    private final String c;

    public zc4() {
        SecurityManager securityManager = System.getSecurityManager();
        this.a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.c = "lottie-" + d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.a, runnable, this.c + this.b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
