package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class il7 {
    public static AtomicReference a() {
        return b(new AtomicReference(null));
    }

    private static AtomicReference b(AtomicReference atomicReference) {
        return atomicReference;
    }

    public static final Object c(AtomicReference atomicReference) {
        lh4.a(atomicReference.get());
        return null;
    }
}
