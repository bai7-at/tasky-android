package kotlinx.coroutines.debug.internal;

import defpackage.by0;

/* loaded from: classes5.dex */
public final class DebugProbesKt {
    public static final <T> by0<T> probeCoroutineCreated(by0<? super T> by0Var) {
        return DebugProbesImpl.INSTANCE.probeCoroutineCreated$kotlinx_coroutines_core(by0Var);
    }

    public static final void probeCoroutineResumed(by0<?> by0Var) {
        DebugProbesImpl.INSTANCE.probeCoroutineResumed$kotlinx_coroutines_core(by0Var);
    }

    public static final void probeCoroutineSuspended(by0<?> by0Var) {
        DebugProbesImpl.INSTANCE.probeCoroutineSuspended$kotlinx_coroutines_core(by0Var);
    }
}
