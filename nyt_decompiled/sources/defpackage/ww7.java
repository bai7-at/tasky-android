package defpackage;

import androidx.compose.runtime.ActualAndroid_androidKt;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ww7 {
    private final AtomicReference a = new AtomicReference(dl8.a());
    private final Object b = new Object();
    private Object c;

    public final Object a() {
        return Thread.currentThread().getId() == ActualAndroid_androidKt.e() ? this.c : ((cl8) this.a.get()).b(Thread.currentThread().getId());
    }

    public final void b(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == ActualAndroid_androidKt.e()) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            cl8 cl8Var = (cl8) this.a.get();
            if (cl8Var.d(id, obj)) {
                return;
            }
            this.a.set(cl8Var.c(id, obj));
            ww8 ww8Var = ww8.a;
        }
    }
}
