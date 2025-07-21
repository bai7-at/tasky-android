package kotlinx.coroutines;

import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;

/* loaded from: classes5.dex */
public final class DefaultExecutorKt {
    private static final boolean defaultMainDelayOptIn = SystemPropsKt.systemProp("kotlinx.coroutines.main.delay", false);
    private static final Delay DefaultDelay = initializeDefaultDelay();

    public static final Delay getDefaultDelay() {
        return DefaultDelay;
    }

    public static /* synthetic */ void getDefaultDelay$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Delay initializeDefaultDelay() {
        if (!defaultMainDelayOptIn) {
            return DefaultExecutor.INSTANCE;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        return (MainDispatchersKt.isMissing(main) || !(main instanceof Delay)) ? DefaultExecutor.INSTANCE : (Delay) main;
    }
}
