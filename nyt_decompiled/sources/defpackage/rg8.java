package defpackage;

import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public interface rg8 {
    Executor a();

    CoroutineDispatcher b();

    ek7 c();

    default void d(Runnable runnable) {
        c().execute(runnable);
    }
}
