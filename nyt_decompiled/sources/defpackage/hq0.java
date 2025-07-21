package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class hq0 implements by0 {
    public static final hq0 a = new hq0();

    private hq0() {
    }

    @Override // defpackage.by0
    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.by0
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
