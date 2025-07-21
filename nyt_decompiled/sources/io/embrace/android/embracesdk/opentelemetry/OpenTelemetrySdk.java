package io.embrace.android.embracesdk.opentelemetry;

import defpackage.bd7;
import defpackage.c04;
import defpackage.ei5;
import defpackage.gp8;
import defpackage.n94;
import defpackage.qs2;
import defpackage.yl0;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.Systrace;
import io.opentelemetry.sdk.trace.i;
import kotlin.c;

/* loaded from: classes5.dex */
public final class OpenTelemetrySdk {
    private final c04 logger$delegate;
    private final ei5 sdk;
    private final gp8 tracer;

    public OpenTelemetrySdk(yl0 yl0Var, final OpenTelemetryConfiguration openTelemetryConfiguration) {
        zq3.h(yl0Var, "openTelemetryClock");
        zq3.h(openTelemetryConfiguration, "configuration");
        try {
            Systrace.startSynchronous("otel-sdk-init");
            ei5 a = ei5.d().c(i.h().a(openTelemetryConfiguration.getResource()).b(openTelemetryConfiguration.getSpanProcessor()).d(yl0Var).c()).b(bd7.h().b(openTelemetryConfiguration.getResource()).a(openTelemetryConfiguration.getLogProcessor()).d(yl0Var).c()).a();
            Systrace.endSynchronous();
            this.sdk = a;
            try {
                Systrace.startSynchronous("otel-tracer-init");
                gp8 a2 = a.a(openTelemetryConfiguration.getEmbraceServiceName(), openTelemetryConfiguration.getEmbraceVersionName());
                Systrace.endSynchronous();
                this.tracer = a2;
                this.logger$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.opentelemetry.OpenTelemetrySdk$logger$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final n94 mo865invoke() {
                        ei5 ei5Var;
                        try {
                            Systrace.startSynchronous("otel-logger-init");
                            ei5Var = OpenTelemetrySdk.this.sdk;
                            zq3.g(ei5Var, "sdk");
                            return ei5Var.h().b(openTelemetryConfiguration.getEmbraceServiceName()).build();
                        } finally {
                        }
                    }
                });
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    private final n94 getLogger() {
        return (n94) this.logger$delegate.getValue();
    }

    public final n94 getOpenTelemetryLogger() {
        n94 logger = getLogger();
        zq3.g(logger, "logger");
        return logger;
    }

    public final gp8 getOpenTelemetryTracer() {
        gp8 gp8Var = this.tracer;
        zq3.g(gp8Var, "tracer");
        return gp8Var;
    }
}
