package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class lb1 implements ThreadFactory {
    private final String a;
    private final AtomicInteger b;

    public lb1(String str) {
        zq3.h(str, "newThreadContext");
        this.a = str;
        this.b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        int andIncrement = this.b.getAndIncrement();
        Thread thread = new Thread(runnable, "datadog-" + this.a + "-thread-" + andIncrement);
        thread.setPriority(5);
        thread.setDaemon(false);
        return thread;
    }
}
