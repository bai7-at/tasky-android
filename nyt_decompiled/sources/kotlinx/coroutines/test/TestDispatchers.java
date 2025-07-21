package kotlinx.coroutines.test;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.test.internal.TestMainDispatcher;
import kotlinx.coroutines.test.internal.TestMainDispatcherJvmKt;

/* loaded from: classes5.dex */
public final class TestDispatchers {
    @ExperimentalCoroutinesApi
    public static final void resetMain(Dispatchers dispatchers) {
        TestMainDispatcherJvmKt.getTestMainDispatcher(dispatchers).resetDispatcher();
    }

    @ExperimentalCoroutinesApi
    public static final void setMain(Dispatchers dispatchers, CoroutineDispatcher coroutineDispatcher) {
        if (coroutineDispatcher instanceof TestMainDispatcher) {
            throw new IllegalArgumentException("Dispatchers.setMain(Dispatchers.Main) is prohibited, probably Dispatchers.resetMain() should be used instead");
        }
        TestMainDispatcherJvmKt.getTestMainDispatcher(dispatchers).setDispatcher(coroutineDispatcher);
    }
}
