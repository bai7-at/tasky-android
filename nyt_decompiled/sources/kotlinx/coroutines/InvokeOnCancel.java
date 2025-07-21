package kotlinx.coroutines;

import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes5.dex */
final class InvokeOnCancel extends CancelHandler {
    private final ss2 handler;

    public InvokeOnCancel(ss2 ss2Var) {
        this.handler = ss2Var;
    }

    @Override // kotlinx.coroutines.CancelHandler, kotlinx.coroutines.CancelHandlerBase, defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return ww8.a;
    }

    public String toString() {
        return "InvokeOnCancel[" + DebugStringsKt.getClassSimpleName(this.handler) + '@' + DebugStringsKt.getHexAddress(this) + ']';
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    public void invoke(Throwable th) {
        this.handler.invoke(th);
    }
}
