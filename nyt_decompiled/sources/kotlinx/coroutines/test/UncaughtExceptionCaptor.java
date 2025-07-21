package kotlinx.coroutines.test;

import java.util.List;

/* loaded from: classes5.dex */
public interface UncaughtExceptionCaptor {
    void cleanupTestCoroutines();

    List<Throwable> getUncaughtExceptions();
}
