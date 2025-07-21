package kotlinx.coroutines.debug.internal;

import defpackage.p01;

/* loaded from: classes5.dex */
public final class StackTraceFrame implements p01 {
    private final p01 callerFrame;
    public final StackTraceElement stackTraceElement;

    public StackTraceFrame(p01 p01Var, StackTraceElement stackTraceElement) {
        this.callerFrame = p01Var;
        this.stackTraceElement = stackTraceElement;
    }

    @Override // defpackage.p01
    public p01 getCallerFrame() {
        return this.callerFrame;
    }

    @Override // defpackage.p01
    public StackTraceElement getStackTraceElement() {
        return this.stackTraceElement;
    }
}
