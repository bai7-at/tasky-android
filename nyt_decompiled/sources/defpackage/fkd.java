package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class fkd {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private ekd b;

    final ekd a() {
        return this.b;
    }

    final void b(ekd ekdVar) {
        this.b = ekdVar;
    }

    public final void c(boolean z) {
        this.a.set(true);
    }

    public final boolean d() {
        return this.a.get();
    }
}
