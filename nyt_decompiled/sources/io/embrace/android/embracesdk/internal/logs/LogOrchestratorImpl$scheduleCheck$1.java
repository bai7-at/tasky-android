package io.embrace.android.embracesdk.internal.logs;

import defpackage.qs2;
import defpackage.ww8;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes5.dex */
final /* synthetic */ class LogOrchestratorImpl$scheduleCheck$1 extends AdaptedFunctionReference implements qs2 {
    LogOrchestratorImpl$scheduleCheck$1(LogOrchestratorImpl logOrchestratorImpl) {
        super(0, logOrchestratorImpl, LogOrchestratorImpl.class, "sendLogsIfNeeded", "sendLogsIfNeeded()Z", 8);
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        invoke();
        return ww8.a;
    }

    public final void invoke() {
        ((LogOrchestratorImpl) this.receiver).sendLogsIfNeeded();
    }
}
