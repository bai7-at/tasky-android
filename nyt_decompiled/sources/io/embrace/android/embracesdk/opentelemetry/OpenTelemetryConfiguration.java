package io.embrace.android.embracesdk.opentelemetry;

import defpackage.bz6;
import defpackage.c04;
import defpackage.ey7;
import defpackage.iy7;
import defpackage.qs2;
import defpackage.t84;
import defpackage.u84;
import defpackage.zq3;
import io.embrace.android.embracesdk.BuildConfig;
import io.embrace.android.embracesdk.internal.SystemInfo;
import io.embrace.android.embracesdk.internal.logs.EmbraceLogRecordExporter;
import io.embrace.android.embracesdk.internal.logs.EmbraceLogRecordProcessor;
import io.embrace.android.embracesdk.internal.logs.LogSink;
import io.embrace.android.embracesdk.internal.spans.EmbraceSpanExporter;
import io.embrace.android.embracesdk.internal.spans.EmbraceSpanProcessor;
import io.embrace.android.embracesdk.internal.spans.SpanSink;
import java.util.ArrayList;
import java.util.List;
import kotlin.c;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class OpenTelemetryConfiguration {
    private final String embraceServiceName;
    private final String embraceVersionName;
    private final List<ey7> externalSpanExporters;
    private final List<t84> logExporters;
    private final c04 logProcessor$delegate;
    private final bz6 resource;
    private final c04 spanProcessor$delegate;

    public OpenTelemetryConfiguration(final SpanSink spanSink, LogSink logSink, SystemInfo systemInfo, final String str) {
        zq3.h(spanSink, "spanSink");
        zq3.h(logSink, "logSink");
        zq3.h(systemInfo, "systemInfo");
        zq3.h(str, "processIdentifier");
        this.embraceServiceName = BuildConfig.LIBRARY_PACKAGE_NAME;
        this.embraceVersionName = BuildConfig.VERSION_NAME;
        bz6 a = bz6.g().m().b(OpenTelemetryAttributeKeysKt.getServiceName(), BuildConfig.LIBRARY_PACKAGE_NAME).b(OpenTelemetryAttributeKeysKt.getServiceVersion(), BuildConfig.VERSION_NAME).b(OpenTelemetryAttributeKeysKt.getOsName(), systemInfo.getOsName()).b(OpenTelemetryAttributeKeysKt.getOsVersion(), systemInfo.getOsVersion()).b(OpenTelemetryAttributeKeysKt.getOsType(), systemInfo.getOsType()).b(OpenTelemetryAttributeKeysKt.getOsBuildId(), systemInfo.getOsBuild()).b(OpenTelemetryAttributeKeysKt.getAndroidApiLevel(), systemInfo.getAndroidOsApiLevel()).b(OpenTelemetryAttributeKeysKt.getDeviceManufacturer(), systemInfo.getDeviceManufacturer()).b(OpenTelemetryAttributeKeysKt.getDeviceModelIdentifier(), systemInfo.getDeviceModel()).b(OpenTelemetryAttributeKeysKt.getDeviceModelName(), systemInfo.getDeviceModel()).a();
        zq3.g(a, "Resource.getDefault().to…ceModel)\n        .build()");
        this.resource = a;
        this.externalSpanExporters = new ArrayList();
        this.logExporters = i.r(new EmbraceLogRecordExporter(logSink));
        this.spanProcessor$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.opentelemetry.OpenTelemetryConfiguration$spanProcessor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceSpanProcessor mo865invoke() {
                List list;
                SpanSink spanSink2 = spanSink;
                list = OpenTelemetryConfiguration.this.externalSpanExporters;
                ey7 c = ey7.c(list);
                zq3.g(c, "SpanExporter.composite(externalSpanExporters)");
                return new EmbraceSpanProcessor(new EmbraceSpanExporter(spanSink2, c), str);
            }
        });
        this.logProcessor$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.opentelemetry.OpenTelemetryConfiguration$logProcessor$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceLogRecordProcessor mo865invoke() {
                List list;
                list = OpenTelemetryConfiguration.this.logExporters;
                t84 c = t84.c(list);
                zq3.g(c, "LogRecordExporter.composite(logExporters)");
                return new EmbraceLogRecordProcessor(c);
            }
        });
    }

    public final void addLogExporter(t84 t84Var) {
        zq3.h(t84Var, "logExporter");
        this.logExporters.add(t84Var);
    }

    public final void addSpanExporter(ey7 ey7Var) {
        zq3.h(ey7Var, "spanExporter");
        this.externalSpanExporters.add(ey7Var);
    }

    public final String getEmbraceServiceName() {
        return this.embraceServiceName;
    }

    public final String getEmbraceVersionName() {
        return this.embraceVersionName;
    }

    public final u84 getLogProcessor() {
        return (u84) this.logProcessor$delegate.getValue();
    }

    public final bz6 getResource() {
        return this.resource;
    }

    public final iy7 getSpanProcessor() {
        return (iy7) this.spanProcessor$delegate.getValue();
    }
}
