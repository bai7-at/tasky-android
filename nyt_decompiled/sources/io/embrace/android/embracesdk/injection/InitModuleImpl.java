package io.embrace.android.embracesdk.injection;

import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.yl0;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.internal.IdGenerator;
import io.embrace.android.embracesdk.internal.SystemInfo;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.telemetry.EmbraceTelemetryService;
import io.embrace.android.embracesdk.telemetry.TelemetryService;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class InitModuleImpl implements InitModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(InitModuleImpl.class, "telemetryService", "getTelemetryService()Lio/embrace/android/embracesdk/telemetry/TelemetryService;", 0))};
    private final Clock clock;
    private final InternalEmbraceLogger logger;
    private final yl0 openTelemetryClock;
    private final String processIdentifier;
    private final SystemInfo systemInfo;
    private final hp6 telemetryService$delegate;

    public InitModuleImpl() {
        this(null, null, null, null, 15, null);
    }

    @Override // io.embrace.android.embracesdk.injection.InitModule
    public Clock getClock() {
        return this.clock;
    }

    @Override // io.embrace.android.embracesdk.injection.InitModule
    public InternalEmbraceLogger getLogger() {
        return this.logger;
    }

    @Override // io.embrace.android.embracesdk.injection.InitModule
    public yl0 getOpenTelemetryClock() {
        return this.openTelemetryClock;
    }

    @Override // io.embrace.android.embracesdk.injection.InitModule
    public String getProcessIdentifier() {
        return this.processIdentifier;
    }

    @Override // io.embrace.android.embracesdk.injection.InitModule
    public SystemInfo getSystemInfo() {
        return this.systemInfo;
    }

    @Override // io.embrace.android.embracesdk.injection.InitModule
    public TelemetryService getTelemetryService() {
        return (TelemetryService) this.telemetryService$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public InitModuleImpl(Clock clock, yl0 yl0Var, InternalEmbraceLogger internalEmbraceLogger, SystemInfo systemInfo) {
        zq3.h(clock, "clock");
        zq3.h(yl0Var, "openTelemetryClock");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(systemInfo, "systemInfo");
        this.clock = clock;
        this.openTelemetryClock = yl0Var;
        this.logger = internalEmbraceLogger;
        this.systemInfo = systemInfo;
        this.telemetryService$delegate = new SingletonDelegate(LoadType.LAZY, new qs2() { // from class: io.embrace.android.embracesdk.injection.InitModuleImpl$telemetryService$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceTelemetryService mo865invoke() {
                return new EmbraceTelemetryService(InitModuleImpl.this.getSystemInfo());
            }
        });
        this.processIdentifier = IdGenerator.Companion.generateLaunchInstanceId();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ InitModuleImpl(io.embrace.android.embracesdk.internal.clock.Clock r15, defpackage.yl0 r16, io.embrace.android.embracesdk.logging.InternalEmbraceLogger r17, io.embrace.android.embracesdk.internal.SystemInfo r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r14 = this;
            r0 = r19 & 1
            if (r0 == 0) goto Lf
            io.embrace.android.embracesdk.internal.clock.NormalizedIntervalClock r0 = new io.embrace.android.embracesdk.internal.clock.NormalizedIntervalClock
            io.embrace.android.embracesdk.internal.clock.SystemClock r1 = new io.embrace.android.embracesdk.internal.clock.SystemClock
            r1.<init>()
            r0.<init>(r1)
            goto L10
        Lf:
            r0 = r15
        L10:
            r1 = r19 & 2
            if (r1 == 0) goto L1a
            io.embrace.android.embracesdk.internal.OpenTelemetryClock r1 = new io.embrace.android.embracesdk.internal.OpenTelemetryClock
            r1.<init>(r0)
            goto L1c
        L1a:
            r1 = r16
        L1c:
            r2 = r19 & 4
            if (r2 == 0) goto L26
            io.embrace.android.embracesdk.logging.InternalEmbraceLogger r2 = new io.embrace.android.embracesdk.logging.InternalEmbraceLogger
            r2.<init>()
            goto L28
        L26:
            r2 = r17
        L28:
            r3 = r19 & 8
            if (r3 == 0) goto L3e
            io.embrace.android.embracesdk.internal.SystemInfo r3 = new io.embrace.android.embracesdk.internal.SystemInfo
            r12 = 127(0x7f, float:1.78E-43)
            r13 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = r14
            goto L41
        L3e:
            r4 = r14
            r3 = r18
        L41:
            r14.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.injection.InitModuleImpl.<init>(io.embrace.android.embracesdk.internal.clock.Clock, yl0, io.embrace.android.embracesdk.logging.InternalEmbraceLogger, io.embrace.android.embracesdk.internal.SystemInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
