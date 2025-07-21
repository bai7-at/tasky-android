package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class pte {
    private static final pte b = new pte();
    private final AtomicReference a = new AtomicReference(new kue(new gue(null), null));

    pte() {
    }

    public static pte a() {
        return b;
    }

    public final Class b(Class cls) {
        return ((kue) this.a.get()).a(cls);
    }

    public final Object c(ble bleVar, Class cls) {
        return ((kue) this.a.get()).b(bleVar, cls);
    }

    public final Object d(wle wleVar, Class cls) {
        return ((kue) this.a.get()).c(wleVar, cls);
    }

    public final synchronized void e(eue eueVar) {
        gue gueVar = new gue((kue) this.a.get(), null);
        gueVar.a(eueVar);
        this.a.set(new kue(gueVar, null));
    }

    public final synchronized void f(xle xleVar) {
        gue gueVar = new gue((kue) this.a.get(), null);
        gueVar.b(xleVar);
        this.a.set(new kue(gueVar, null));
    }
}
