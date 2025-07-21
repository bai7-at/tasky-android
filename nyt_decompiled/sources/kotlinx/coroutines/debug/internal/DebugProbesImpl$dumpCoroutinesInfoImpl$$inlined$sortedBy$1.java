package kotlinx.coroutines.debug.internal;

import defpackage.tp0;
import java.util.Comparator;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* loaded from: classes5.dex */
public final class DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return tp0.d(Long.valueOf(((DebugProbesImpl.CoroutineOwner) t).info.sequenceNumber), Long.valueOf(((DebugProbesImpl.CoroutineOwner) t2).info.sequenceNumber));
    }
}
