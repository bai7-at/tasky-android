package kotlinx.coroutines.test.internal;

import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes5.dex */
public final class TestMainDispatcherJvmKt {
    public static final TestMainDispatcher getTestMainDispatcher(Dispatchers dispatchers) {
        MainCoroutineDispatcher main = Dispatchers.getMain();
        if (main instanceof TestMainDispatcher) {
            return (TestMainDispatcher) main;
        }
        throw new IllegalArgumentException(("TestMainDispatcher is not set as main dispatcher, have " + main + " instead.").toString());
    }
}
