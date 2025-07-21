package kotlinx.coroutines;

import defpackage.ss2;

/* loaded from: classes5.dex */
public final class CompletionHandlerKt {
    public static final ss2 getAsHandler(CompletionHandlerBase completionHandlerBase) {
        return completionHandlerBase;
    }

    public static final void invokeIt(ss2 ss2Var, Throwable th) {
        ss2Var.invoke(th);
    }

    public static final ss2 getAsHandler(CancelHandlerBase cancelHandlerBase) {
        return cancelHandlerBase;
    }
}
