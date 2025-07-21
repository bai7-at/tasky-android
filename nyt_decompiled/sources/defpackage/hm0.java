package defpackage;

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes2.dex */
public final class hm0 implements Closeable {
    private boolean a;
    private final ExecutorCoroutineDispatcher b;

    public hm0() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        zq3.g(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.b = ExecutorsKt.from(newSingleThreadExecutor);
    }

    public final CoroutineDispatcher a() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.a) {
            return;
        }
        this.b.close();
        this.a = true;
    }
}
