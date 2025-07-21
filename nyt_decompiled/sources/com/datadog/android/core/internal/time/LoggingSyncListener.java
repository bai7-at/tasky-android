package com.datadog.android.core.internal.time;

import com.datadog.android.api.InternalLogger;
import defpackage.kd8;
import defpackage.qs2;
import defpackage.zq3;

/* loaded from: classes2.dex */
public final class LoggingSyncListener implements kd8 {
    private final InternalLogger a;

    public LoggingSyncListener(InternalLogger internalLogger) {
        zq3.h(internalLogger, "internalLogger");
        this.a = internalLogger;
    }

    @Override // defpackage.kd8
    public void a(String str) {
        zq3.h(str, "host");
    }

    @Override // defpackage.kd8
    public void b(final String str, Throwable th) {
        zq3.h(str, "host");
        zq3.h(th, "throwable");
        InternalLogger.b.a(this.a, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.time.LoggingSyncListener$onError$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return "Kronos onError @host:" + str;
            }
        }, th, false, null, 48, null);
    }

    @Override // defpackage.kd8
    public void c(long j, long j2) {
    }
}
