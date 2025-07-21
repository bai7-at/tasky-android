package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class ofb implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);
    final /* synthetic */ String b;

    ofb(String str) {
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.b + ") #" + this.a.getAndIncrement());
    }
}
