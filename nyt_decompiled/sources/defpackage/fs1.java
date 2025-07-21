package defpackage;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public abstract class fs1 {
    private static final CoroutineDispatcher a = Dispatchers.getMain();

    public static final CoroutineDispatcher a() {
        return a;
    }
}
