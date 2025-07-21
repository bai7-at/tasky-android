package io.embrace.android.embracesdk.injection;

import defpackage.yl0;
import io.embrace.android.embracesdk.internal.SystemInfo;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.telemetry.TelemetryService;

/* loaded from: classes5.dex */
public interface InitModule {
    Clock getClock();

    InternalEmbraceLogger getLogger();

    yl0 getOpenTelemetryClock();

    String getProcessIdentifier();

    SystemInfo getSystemInfo();

    TelemetryService getTelemetryService();
}
