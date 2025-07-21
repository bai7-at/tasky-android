package kotlinx.coroutines.internal;

import kotlinx.coroutines.DebugStringsKt;

/* loaded from: classes5.dex */
public abstract class OpDescriptor {
    public abstract AtomicOp<?> getAtomicOp();

    public abstract Object perform(Object obj);

    public String toString() {
        return DebugStringsKt.getClassSimpleName(this) + '@' + DebugStringsKt.getHexAddress(this);
    }
}
