package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class li7 {
    public static final li7 a = new li7();
    private static final int b = 65536;
    private static final ji7 c = new ji7(new byte[0], 0, 0, false, false);
    private static final int d;
    private static final AtomicReference[] e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        d = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        e = atomicReferenceArr;
    }

    private li7() {
    }

    private final AtomicReference a() {
        return e[(int) (Thread.currentThread().getId() & (d - 1))];
    }

    public static final void b(ji7 ji7Var) {
        zq3.h(ji7Var, "segment");
        if (ji7Var.f != null || ji7Var.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (ji7Var.d) {
            return;
        }
        AtomicReference a2 = a.a();
        ji7 ji7Var2 = c;
        ji7 ji7Var3 = (ji7) a2.getAndSet(ji7Var2);
        if (ji7Var3 == ji7Var2) {
            return;
        }
        int i = ji7Var3 != null ? ji7Var3.c : 0;
        if (i >= b) {
            a2.set(ji7Var3);
            return;
        }
        ji7Var.f = ji7Var3;
        ji7Var.b = 0;
        ji7Var.c = i + 8192;
        a2.set(ji7Var);
    }

    public static final ji7 c() {
        AtomicReference a2 = a.a();
        ji7 ji7Var = c;
        ji7 ji7Var2 = (ji7) a2.getAndSet(ji7Var);
        if (ji7Var2 == ji7Var) {
            return new ji7();
        }
        if (ji7Var2 == null) {
            a2.set(null);
            return new ji7();
        }
        a2.set(ji7Var2.f);
        ji7Var2.f = null;
        ji7Var2.c = 0;
        return ji7Var2;
    }
}
