package io.embrace.android.embracesdk.injection;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.view.WindowManager;
import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.capture.envelope.log.LogEnvelopeSource;
import io.embrace.android.embracesdk.capture.envelope.log.LogEnvelopeSourceImpl;
import io.embrace.android.embracesdk.capture.envelope.log.LogPayloadSourceImpl;
import io.embrace.android.embracesdk.capture.envelope.metadata.EnvelopeMetadataSourceImpl;
import io.embrace.android.embracesdk.capture.envelope.resource.DeviceImpl;
import io.embrace.android.embracesdk.capture.envelope.resource.EnvelopeResourceSourceImpl;
import io.embrace.android.embracesdk.capture.envelope.session.SessionEnvelopeSource;
import io.embrace.android.embracesdk.capture.envelope.session.SessionEnvelopeSourceImpl;
import io.embrace.android.embracesdk.capture.envelope.session.SessionPayloadSourceImpl;
import io.embrace.android.embracesdk.capture.metadata.AppEnvironment;
import io.embrace.android.embracesdk.capture.metadata.HostedSdkVersionInfo;
import io.embrace.android.embracesdk.internal.BuildInfo;
import io.embrace.android.embracesdk.internal.DeviceArchitecture;
import io.embrace.android.embracesdk.ndk.NativeModule;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class PayloadModuleImpl implements PayloadModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(PayloadModuleImpl.class, "metadataSource", "getMetadataSource()Lio/embrace/android/embracesdk/capture/envelope/metadata/EnvelopeMetadataSourceImpl;", 0)), zt6.i(new PropertyReference1Impl(PayloadModuleImpl.class, "resourceSource", "getResourceSource()Lio/embrace/android/embracesdk/capture/envelope/resource/EnvelopeResourceSourceImpl;", 0)), zt6.i(new PropertyReference1Impl(PayloadModuleImpl.class, "sessionPayloadSource", "getSessionPayloadSource()Lio/embrace/android/embracesdk/capture/envelope/session/SessionPayloadSourceImpl;", 0)), zt6.i(new PropertyReference1Impl(PayloadModuleImpl.class, "logPayloadSource", "getLogPayloadSource()Lio/embrace/android/embracesdk/capture/envelope/log/LogPayloadSourceImpl;", 0)), zt6.i(new PropertyReference1Impl(PayloadModuleImpl.class, "sessionEnvelopeSource", "getSessionEnvelopeSource()Lio/embrace/android/embracesdk/capture/envelope/session/SessionEnvelopeSource;", 0)), zt6.i(new PropertyReference1Impl(PayloadModuleImpl.class, "logEnvelopeSource", "getLogEnvelopeSource()Lio/embrace/android/embracesdk/capture/envelope/log/LogEnvelopeSource;", 0))};
    private final BackgroundWorker backgroundWorker;
    private final hp6 logEnvelopeSource$delegate;
    private final hp6 logPayloadSource$delegate;
    private final hp6 metadataSource$delegate;
    private final hp6 resourceSource$delegate;
    private final hp6 sessionEnvelopeSource$delegate;
    private final hp6 sessionPayloadSource$delegate;

    public PayloadModuleImpl(final InitModule initModule, final CoreModule coreModule, final AndroidServicesModule androidServicesModule, final EssentialServiceModule essentialServiceModule, final SystemServiceModule systemServiceModule, WorkerThreadModule workerThreadModule, final NativeModule nativeModule, final OpenTelemetryModule openTelemetryModule, final SdkObservabilityModule sdkObservabilityModule, final qs2 qs2Var) {
        zq3.h(initModule, "initModule");
        zq3.h(coreModule, "coreModule");
        zq3.h(androidServicesModule, "androidServicesModule");
        zq3.h(essentialServiceModule, "essentialServiceModule");
        zq3.h(systemServiceModule, "systemServiceModule");
        zq3.h(workerThreadModule, "workerThreadModule");
        zq3.h(nativeModule, "nativeModule");
        zq3.h(openTelemetryModule, "otelModule");
        zq3.h(sdkObservabilityModule, "sdkObservabilityModule");
        zq3.h(qs2Var, "sessionPropertiesServiceProvider");
        this.backgroundWorker = workerThreadModule.backgroundWorker(WorkerName.BACKGROUND_REGISTRATION);
        qs2 qs2Var2 = new qs2() { // from class: io.embrace.android.embracesdk.injection.PayloadModuleImpl$metadataSource$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EnvelopeMetadataSourceImpl mo865invoke() {
                return new EnvelopeMetadataSourceImpl(EssentialServiceModule.this.getUserService());
            }
        };
        LoadType loadType = LoadType.LAZY;
        this.metadataSource$delegate = new SingletonDelegate(loadType, qs2Var2);
        this.resourceSource$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.PayloadModuleImpl$resourceSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EnvelopeResourceSourceImpl mo865invoke() {
                BackgroundWorker backgroundWorker;
                HostedSdkVersionInfo hostedSdkVersionInfo = essentialServiceModule.getHostedSdkVersionInfo();
                ApplicationInfo applicationInfo = coreModule.getContext().getApplicationInfo();
                zq3.g(applicationInfo, "coreModule.context.applicationInfo");
                AppEnvironment.Environment environment = new AppEnvironment(applicationInfo).getEnvironment();
                BuildInfo buildInfo = coreModule.getBuildInfo();
                PackageInfo packageInfo = coreModule.getPackageInfo();
                Embrace.AppFramework appFramework = coreModule.getAppFramework();
                DeviceArchitecture deviceArchitecture = essentialServiceModule.getDeviceArchitecture();
                WindowManager windowManager = systemServiceModule.getWindowManager();
                PreferencesService preferencesService = androidServicesModule.getPreferencesService();
                backgroundWorker = PayloadModuleImpl.this.backgroundWorker;
                return new EnvelopeResourceSourceImpl(hostedSdkVersionInfo, environment, buildInfo, packageInfo, appFramework, deviceArchitecture, new DeviceImpl(windowManager, preferencesService, backgroundWorker, initModule.getSystemInfo(), essentialServiceModule.getCpuInfoDelegate(), initModule.getLogger()), essentialServiceModule.getMetadataService());
            }
        });
        this.sessionPayloadSource$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.PayloadModuleImpl$sessionPayloadSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final SessionPayloadSourceImpl mo865invoke() {
                return new SessionPayloadSourceImpl(SdkObservabilityModule.this.getInternalErrorService(), nativeModule.getNativeThreadSamplerService(), openTelemetryModule.getSpanSink(), openTelemetryModule.getCurrentSessionSpan(), openTelemetryModule.getSpanRepository(), initModule.getLogger(), qs2Var);
            }
        });
        this.logPayloadSource$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.PayloadModuleImpl$logPayloadSource$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final LogPayloadSourceImpl mo865invoke() {
                return new LogPayloadSourceImpl(OpenTelemetryModule.this.getLogSink());
            }
        });
        this.sessionEnvelopeSource$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.PayloadModuleImpl$sessionEnvelopeSource$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final SessionEnvelopeSourceImpl mo865invoke() {
                EnvelopeMetadataSourceImpl metadataSource;
                EnvelopeResourceSourceImpl resourceSource;
                SessionPayloadSourceImpl sessionPayloadSource;
                metadataSource = PayloadModuleImpl.this.getMetadataSource();
                resourceSource = PayloadModuleImpl.this.getResourceSource();
                sessionPayloadSource = PayloadModuleImpl.this.getSessionPayloadSource();
                return new SessionEnvelopeSourceImpl(metadataSource, resourceSource, sessionPayloadSource);
            }
        });
        this.logEnvelopeSource$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.PayloadModuleImpl$logEnvelopeSource$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final LogEnvelopeSourceImpl mo865invoke() {
                EnvelopeMetadataSourceImpl metadataSource;
                EnvelopeResourceSourceImpl resourceSource;
                LogPayloadSourceImpl logPayloadSource;
                metadataSource = PayloadModuleImpl.this.getMetadataSource();
                resourceSource = PayloadModuleImpl.this.getResourceSource();
                logPayloadSource = PayloadModuleImpl.this.getLogPayloadSource();
                return new LogEnvelopeSourceImpl(metadataSource, resourceSource, logPayloadSource);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogPayloadSourceImpl getLogPayloadSource() {
        return (LogPayloadSourceImpl) this.logPayloadSource$delegate.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnvelopeMetadataSourceImpl getMetadataSource() {
        return (EnvelopeMetadataSourceImpl) this.metadataSource$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnvelopeResourceSourceImpl getResourceSource() {
        return (EnvelopeResourceSourceImpl) this.resourceSource$delegate.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SessionPayloadSourceImpl getSessionPayloadSource() {
        return (SessionPayloadSourceImpl) this.sessionPayloadSource$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.embrace.android.embracesdk.injection.PayloadModule
    public LogEnvelopeSource getLogEnvelopeSource() {
        return (LogEnvelopeSource) this.logEnvelopeSource$delegate.getValue(this, $$delegatedProperties[5]);
    }

    @Override // io.embrace.android.embracesdk.injection.PayloadModule
    public SessionEnvelopeSource getSessionEnvelopeSource() {
        return (SessionEnvelopeSource) this.sessionEnvelopeSource$delegate.getValue(this, $$delegatedProperties[4]);
    }
}
