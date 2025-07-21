package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class mte {
    private static final mte b = new mte();
    private static final lte c = new lte(null);
    private final AtomicReference a = new AtomicReference();

    public static mte a() {
        return b;
    }

    public final rxe b() {
        rxe rxeVar = (rxe) this.a.get();
        return rxeVar == null ? c : rxeVar;
    }
}
