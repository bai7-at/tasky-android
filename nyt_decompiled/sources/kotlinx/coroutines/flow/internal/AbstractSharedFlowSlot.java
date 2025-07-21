package kotlinx.coroutines.flow.internal;

import defpackage.by0;
import defpackage.ww8;

/* loaded from: classes5.dex */
public abstract class AbstractSharedFlowSlot<F> {
    public abstract boolean allocateLocked(F f);

    public abstract by0<ww8>[] freeLocked(F f);
}
