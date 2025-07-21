package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class r01 {
    public static final r01 a = new r01();

    private r01() {
    }

    public final CoroutineScope a() {
        Lifecycle lifecycle = l.k().getLifecycle();
        zq3.g(lifecycle, "getLifecycle(...)");
        return CoroutineScopeKt.plus(a44.a(lifecycle), Dispatchers.getDefault());
    }

    public final CoroutineDispatcher b() {
        return Dispatchers.getDefault();
    }

    public final CoroutineDispatcher c() {
        return Dispatchers.getIO();
    }

    public final CoroutineDispatcher d() {
        return Dispatchers.getMain();
    }
}
