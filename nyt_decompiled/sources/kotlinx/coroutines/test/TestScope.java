package kotlinx.coroutines.test;

import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public interface TestScope extends CoroutineScope {
    CoroutineScope getBackgroundScope();

    TestCoroutineScheduler getTestScheduler();
}
