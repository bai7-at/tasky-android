package kotlinx.coroutines;

import defpackage.ss2;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {
    public static final Key Key = new Key(null);

    public static final class Key extends b {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Key() {
            super(CoroutineDispatcher.Key, new ss2() { // from class: kotlinx.coroutines.ExecutorCoroutineDispatcher.Key.1
                @Override // defpackage.ss2
                public final ExecutorCoroutineDispatcher invoke(CoroutineContext.a aVar) {
                    if (aVar instanceof ExecutorCoroutineDispatcher) {
                        return (ExecutorCoroutineDispatcher) aVar;
                    }
                    return null;
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract Executor getExecutor();
}
