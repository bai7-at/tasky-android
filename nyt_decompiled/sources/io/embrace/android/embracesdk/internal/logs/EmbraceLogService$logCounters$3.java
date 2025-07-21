package io.embrace.android.embracesdk.internal.logs;

import defpackage.qs2;
import io.embrace.android.embracesdk.config.behavior.LogMessageBehavior;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class EmbraceLogService$logCounters$3 extends FunctionReferenceImpl implements qs2 {
    EmbraceLogService$logCounters$3(LogMessageBehavior logMessageBehavior) {
        super(0, logMessageBehavior, LogMessageBehavior.class, "getErrorLogLimit", "getErrorLogLimit()I", 0);
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        return Integer.valueOf(invoke());
    }

    public final int invoke() {
        return ((LogMessageBehavior) this.receiver).getErrorLogLimit();
    }
}
