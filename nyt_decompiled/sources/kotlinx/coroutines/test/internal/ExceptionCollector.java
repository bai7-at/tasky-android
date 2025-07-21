package kotlinx.coroutines.test.internal;

import defpackage.ss2;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* loaded from: classes5.dex */
public final class ExceptionCollector extends a implements CoroutineExceptionHandler {
    private static boolean enabled;
    public static final ExceptionCollector INSTANCE = new ExceptionCollector();
    private static final Object lock = new Object();
    private static final List<Throwable> unprocessedExceptions = new ArrayList();
    private static final Map<Object, ss2> callbacks = new LinkedHashMap();

    private ExceptionCollector() {
        super(CoroutineExceptionHandler.Key);
    }

    private final boolean reportException(Throwable th) {
        Iterator<ss2> it2 = callbacks.values().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            it2.next().invoke(th);
            z = true;
        }
        return z;
    }

    public final void addOnExceptionCallback(Object obj, ss2 ss2Var) {
        synchronized (lock) {
            try {
                enabled = true;
                if (callbacks.put(obj, ss2Var) != null) {
                    throw new IllegalStateException("Check failed.");
                }
                Iterator<T> it2 = unprocessedExceptions.iterator();
                while (it2.hasNext()) {
                    INSTANCE.reportException((Throwable) it2.next());
                }
                unprocessedExceptions.clear();
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ExceptionCollector) || (obj instanceof ExceptionCollectorAsService);
    }

    public final boolean handleException(Throwable th) {
        synchronized (lock) {
            if (!enabled) {
                return false;
            }
            if (INSTANCE.reportException(th)) {
                return true;
            }
            unprocessedExceptions.add(th);
            return false;
        }
    }

    public final void removeOnExceptionCallback(Object obj) {
        synchronized (lock) {
            try {
                if (enabled && callbacks.remove(obj) == null) {
                    throw new IllegalStateException("Check failed.");
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        if (handleException(th)) {
            throw ExceptionSuccessfullyProcessed.INSTANCE;
        }
    }
}
