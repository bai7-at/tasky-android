package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class bqf {
    private static final bqf b = new bqf();
    private static final ypf c = new ypf(null);
    private final AtomicReference a = new AtomicReference();

    public static bqf a() {
        return b;
    }

    public final kvf b() {
        kvf kvfVar = (kvf) this.a.get();
        return kvfVar == null ? c : kvfVar;
    }
}
