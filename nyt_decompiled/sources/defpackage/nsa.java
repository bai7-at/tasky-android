package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class nsa {
    private static final AtomicReference a = new AtomicReference();
    private static final AtomicReference b = new AtomicReference();
    static final AtomicBoolean c = new AtomicBoolean();

    static lsa a() {
        return (lsa) a.get();
    }

    static msa b() {
        lh4.a(b.get());
        return null;
    }

    public static void c(lsa lsaVar) {
        a.set(lsaVar);
    }
}
