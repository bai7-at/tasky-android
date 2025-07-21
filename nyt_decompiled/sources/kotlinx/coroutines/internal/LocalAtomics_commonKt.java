package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class LocalAtomics_commonKt {
    public static final int getValue(AtomicInteger atomicInteger) {
        return atomicInteger.get();
    }

    public static final void setValue(AtomicInteger atomicInteger, int i) {
        atomicInteger.set(i);
    }
}
