package defpackage;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public abstract class u82 {
    private static final CoroutineScope a = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());

    public static final CoroutineScope a() {
        return a;
    }
}
