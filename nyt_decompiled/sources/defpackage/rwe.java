package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class rwe {
    private static final AtomicReference a = new AtomicReference();
    private static final AtomicReference b = new AtomicReference();
    static final AtomicBoolean c = new AtomicBoolean();

    static oue a() {
        return (oue) a.get();
    }

    static pve b() {
        lh4.a(b.get());
        return null;
    }

    public static void c(oue oueVar) {
        a.set(oueVar);
    }
}
