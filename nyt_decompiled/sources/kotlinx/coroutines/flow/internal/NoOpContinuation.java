package kotlinx.coroutines.flow.internal;

import defpackage.by0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes5.dex */
final class NoOpContinuation implements by0<Object> {
    public static final NoOpContinuation INSTANCE = new NoOpContinuation();
    private static final CoroutineContext context = EmptyCoroutineContext.a;

    private NoOpContinuation() {
    }

    @Override // defpackage.by0
    public CoroutineContext getContext() {
        return context;
    }

    @Override // defpackage.by0
    public void resumeWith(Object obj) {
    }
}
