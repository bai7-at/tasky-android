package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class d61 implements ThreadFactory {
    public static final d61 b = new d61("dd-trace-processor");
    public static final d61 c = new d61("dd-trace-writer");
    public static final d61 d = new d61("dd-task-scheduler");
    private final String a;

    public d61(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.a);
        thread.setDaemon(true);
        thread.setContextClassLoader(null);
        return thread;
    }
}
