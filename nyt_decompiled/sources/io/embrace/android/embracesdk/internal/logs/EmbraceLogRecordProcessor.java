package io.embrace.android.embracesdk.internal.logs;

import defpackage.gq0;
import defpackage.hx0;
import defpackage.kp6;
import defpackage.t84;
import defpackage.u84;
import defpackage.zq3;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class EmbraceLogRecordProcessor implements u84 {
    private final t84 logRecordExporter;

    public EmbraceLogRecordProcessor(t84 t84Var) {
        zq3.h(t84Var, "logRecordExporter");
        this.logRecordExporter = t84Var;
    }

    @Override // defpackage.u84, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // defpackage.u84
    public /* bridge */ /* synthetic */ gq0 forceFlush() {
        return super.forceFlush();
    }

    @Override // defpackage.u84
    public void onEmit(hx0 hx0Var, kp6 kp6Var) {
        zq3.h(hx0Var, "context");
        zq3.h(kp6Var, "logRecord");
        this.logRecordExporter.export(i.r(kp6Var.a()));
    }

    @Override // defpackage.u84
    public /* bridge */ /* synthetic */ gq0 shutdown() {
        return super.shutdown();
    }
}
