package io.embrace.android.embracesdk.injection;

import defpackage.c04;
import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.EmbraceInternalErrorService;
import io.embrace.android.embracesdk.logging.InternalErrorService;
import io.embrace.android.embracesdk.logging.ReportingLoggerAction;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import kotlin.c;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class SdkObservabilityModuleImpl implements SdkObservabilityModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(SdkObservabilityModuleImpl.class, "internalErrorService", "getInternalErrorService()Lio/embrace/android/embracesdk/logging/InternalErrorService;", 0)), zt6.i(new PropertyReference1Impl(SdkObservabilityModuleImpl.class, "reportingLoggerAction", "getReportingLoggerAction()Lio/embrace/android/embracesdk/logging/ReportingLoggerAction;", 0))};
    private final hp6 internalErrorService$delegate;
    private final c04 logStrictMode$delegate;
    private final hp6 reportingLoggerAction$delegate;

    public SdkObservabilityModuleImpl(final InitModule initModule, final EssentialServiceModule essentialServiceModule) {
        zq3.h(initModule, "initModule");
        zq3.h(essentialServiceModule, "essentialServiceModule");
        this.logStrictMode$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.SdkObservabilityModuleImpl$logStrictMode$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(invoke());
            }

            public final boolean invoke() {
                return EssentialServiceModule.this.getConfigService().getSessionBehavior().isSessionErrorLogStrictModeEnabled();
            }
        });
        qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.injection.SdkObservabilityModuleImpl$internalErrorService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceInternalErrorService mo865invoke() {
                boolean logStrictMode;
                ProcessStateService processStateService = essentialServiceModule.getProcessStateService();
                Clock clock = initModule.getClock();
                logStrictMode = SdkObservabilityModuleImpl.this.getLogStrictMode();
                return new EmbraceInternalErrorService(processStateService, clock, logStrictMode);
            }
        };
        LoadType loadType = LoadType.LAZY;
        this.internalErrorService$delegate = new SingletonDelegate(loadType, qs2Var);
        this.reportingLoggerAction$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.SdkObservabilityModuleImpl$reportingLoggerAction$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ReportingLoggerAction mo865invoke() {
                boolean logStrictMode;
                InternalErrorService internalErrorService = SdkObservabilityModuleImpl.this.getInternalErrorService();
                logStrictMode = SdkObservabilityModuleImpl.this.getLogStrictMode();
                return new ReportingLoggerAction(internalErrorService, logStrictMode);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getLogStrictMode() {
        return ((Boolean) this.logStrictMode$delegate.getValue()).booleanValue();
    }

    @Override // io.embrace.android.embracesdk.injection.SdkObservabilityModule
    public InternalErrorService getInternalErrorService() {
        return (InternalErrorService) this.internalErrorService$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.embrace.android.embracesdk.injection.SdkObservabilityModule
    public ReportingLoggerAction getReportingLoggerAction() {
        return (ReportingLoggerAction) this.reportingLoggerAction$delegate.getValue(this, $$delegatedProperties[1]);
    }
}
