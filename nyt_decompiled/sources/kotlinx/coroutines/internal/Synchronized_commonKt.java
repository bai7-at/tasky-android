package kotlinx.coroutines.internal;

import defpackage.bk3;
import defpackage.qs2;
import kotlinx.coroutines.InternalCoroutinesApi;

/* loaded from: classes5.dex */
public final class Synchronized_commonKt {
    @InternalCoroutinesApi
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m948synchronized(Object obj, qs2 qs2Var) {
        T t;
        synchronized (obj) {
            try {
                t = (T) qs2Var.mo865invoke();
                bk3.b(1);
            } catch (Throwable th) {
                bk3.b(1);
                bk3.a(1);
                throw th;
            }
        }
        bk3.a(1);
        return t;
    }
}
