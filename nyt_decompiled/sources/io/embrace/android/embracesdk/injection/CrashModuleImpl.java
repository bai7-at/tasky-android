package io.embrace.android.embracesdk.injection;

import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.anr.AnrService;
import io.embrace.android.embracesdk.capture.crash.CompositeCrashService;
import io.embrace.android.embracesdk.capture.crash.CrashDataSource;
import io.embrace.android.embracesdk.capture.crash.CrashDataSourceImpl;
import io.embrace.android.embracesdk.capture.crash.CrashService;
import io.embrace.android.embracesdk.capture.crash.EmbraceCrashService;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.comms.delivery.DeliveryService;
import io.embrace.android.embracesdk.event.EventService;
import io.embrace.android.embracesdk.gating.GatingService;
import io.embrace.android.embracesdk.internal.crash.CrashFileMarker;
import io.embrace.android.embracesdk.internal.crash.LastRunCrashVerifier;
import io.embrace.android.embracesdk.internal.logs.LogOrchestrator;
import io.embrace.android.embracesdk.ndk.NativeCrashDataSourceImpl;
import io.embrace.android.embracesdk.ndk.NativeCrashService;
import io.embrace.android.embracesdk.ndk.NativeModule;
import io.embrace.android.embracesdk.ndk.NdkService;
import io.embrace.android.embracesdk.ndk.NoopNativeCrashService;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.samples.AutomaticVerificationExceptionHandler;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import io.embrace.android.embracesdk.session.orchestrator.SessionOrchestrator;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties;
import io.embrace.android.embracesdk.session.properties.SessionPropertiesService;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class CrashModuleImpl implements CrashModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(CrashModuleImpl.class, "crashMarker", "getCrashMarker()Lio/embrace/android/embracesdk/internal/crash/CrashFileMarker;", 0)), zt6.i(new PropertyReference1Impl(CrashModuleImpl.class, "legacyCrashService", "getLegacyCrashService()Lio/embrace/android/embracesdk/capture/crash/CrashService;", 0)), zt6.i(new PropertyReference1Impl(CrashModuleImpl.class, "crashDataSource", "getCrashDataSource()Lio/embrace/android/embracesdk/capture/crash/CrashDataSource;", 0)), zt6.i(new PropertyReference1Impl(CrashModuleImpl.class, "crashService", "getCrashService()Lio/embrace/android/embracesdk/capture/crash/CrashService;", 0)), zt6.i(new PropertyReference1Impl(CrashModuleImpl.class, "lastRunCrashVerifier", "getLastRunCrashVerifier()Lio/embrace/android/embracesdk/internal/crash/LastRunCrashVerifier;", 0)), zt6.i(new PropertyReference1Impl(CrashModuleImpl.class, "automaticVerificationExceptionHandler", "getAutomaticVerificationExceptionHandler()Lio/embrace/android/embracesdk/samples/AutomaticVerificationExceptionHandler;", 0)), zt6.i(new PropertyReference1Impl(CrashModuleImpl.class, "nativeCrashService", "getNativeCrashService()Lio/embrace/android/embracesdk/ndk/NativeCrashService;", 0))};
    private final hp6 automaticVerificationExceptionHandler$delegate;
    private final hp6 crashDataSource$delegate;
    private final hp6 crashMarker$delegate;
    private final hp6 crashService$delegate;
    private final hp6 lastRunCrashVerifier$delegate;
    private final hp6 legacyCrashService$delegate;
    private final hp6 nativeCrashService$delegate;

    public CrashModuleImpl(final InitModule initModule, final CoreModule coreModule, StorageModule storageModule, final EssentialServiceModule essentialServiceModule, final DeliveryModule deliveryModule, final NativeModule nativeModule, final SessionModule sessionModule, final AnrModule anrModule, final DataContainerModule dataContainerModule, final AndroidServicesModule androidServicesModule, final CustomerLogModule customerLogModule) {
        zq3.h(initModule, "initModule");
        zq3.h(coreModule, "coreModule");
        zq3.h(storageModule, "storageModule");
        zq3.h(essentialServiceModule, "essentialServiceModule");
        zq3.h(deliveryModule, "deliveryModule");
        zq3.h(nativeModule, "nativeModule");
        zq3.h(sessionModule, "sessionModule");
        zq3.h(anrModule, "anrModule");
        zq3.h(dataContainerModule, "dataContainerModule");
        zq3.h(androidServicesModule, "androidServicesModule");
        zq3.h(customerLogModule, "logModule");
        CrashModuleImpl$crashMarker$2 crashModuleImpl$crashMarker$2 = new CrashModuleImpl$crashMarker$2(storageModule, initModule);
        LoadType loadType = LoadType.LAZY;
        this.crashMarker$delegate = new SingletonDelegate(loadType, crashModuleImpl$crashMarker$2);
        this.legacyCrashService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CrashModuleImpl$legacyCrashService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceCrashService mo865invoke() {
                CrashFileMarker crashMarker;
                LogOrchestrator logOrchestrator = customerLogModule.getLogOrchestrator();
                SessionOrchestrator sessionOrchestrator = sessionModule.getSessionOrchestrator();
                SessionPropertiesService sessionPropertiesService = sessionModule.getSessionPropertiesService();
                MetadataService metadataService = essentialServiceModule.getMetadataService();
                SessionIdTracker sessionIdTracker = essentialServiceModule.getSessionIdTracker();
                DeliveryService deliveryService = deliveryModule.getDeliveryService();
                UserService userService = essentialServiceModule.getUserService();
                EventService eventService = dataContainerModule.getEventService();
                AnrService anrService = anrModule.getAnrService();
                NdkService ndkService = nativeModule.getNdkService();
                GatingService gatingService = essentialServiceModule.getGatingService();
                PreferencesService preferencesService = androidServicesModule.getPreferencesService();
                crashMarker = CrashModuleImpl.this.getCrashMarker();
                return new EmbraceCrashService(logOrchestrator, sessionOrchestrator, sessionPropertiesService, metadataService, sessionIdTracker, deliveryService, userService, eventService, anrService, ndkService, gatingService, preferencesService, crashMarker, initModule.getClock(), initModule.getLogger());
            }
        });
        this.crashDataSource$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CrashModuleImpl$crashDataSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final CrashDataSourceImpl mo865invoke() {
                CrashFileMarker crashMarker;
                LogOrchestrator logOrchestrator = customerLogModule.getLogOrchestrator();
                SessionOrchestrator sessionOrchestrator = sessionModule.getSessionOrchestrator();
                EmbraceSessionProperties sessionProperties = essentialServiceModule.getSessionProperties();
                AnrService anrService = anrModule.getAnrService();
                NdkService ndkService = nativeModule.getNdkService();
                PreferencesService preferencesService = androidServicesModule.getPreferencesService();
                crashMarker = CrashModuleImpl.this.getCrashMarker();
                return new CrashDataSourceImpl(logOrchestrator, sessionOrchestrator, sessionProperties, anrService, ndkService, preferencesService, crashMarker, essentialServiceModule.getLogWriter(), essentialServiceModule.getConfigService(), coreModule.getJsonSerializer(), initModule.getLogger());
            }
        });
        this.crashService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CrashModuleImpl$crashService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final CompositeCrashService mo865invoke() {
                return new CompositeCrashService(new qs2() { // from class: io.embrace.android.embracesdk.injection.CrashModuleImpl$crashService$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final CrashService mo865invoke() {
                        CrashService legacyCrashService;
                        legacyCrashService = CrashModuleImpl.this.getLegacyCrashService();
                        return legacyCrashService;
                    }
                }, new qs2() { // from class: io.embrace.android.embracesdk.injection.CrashModuleImpl$crashService$2.2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final CrashDataSource mo865invoke() {
                        CrashDataSource crashDataSource;
                        crashDataSource = CrashModuleImpl.this.getCrashDataSource();
                        return crashDataSource;
                    }
                }, essentialServiceModule.getConfigService(), initModule.getLogger());
            }
        });
        this.lastRunCrashVerifier$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CrashModuleImpl$lastRunCrashVerifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final LastRunCrashVerifier mo865invoke() {
                CrashFileMarker crashMarker;
                crashMarker = CrashModuleImpl.this.getCrashMarker();
                return new LastRunCrashVerifier(crashMarker, initModule.getLogger());
            }
        });
        this.automaticVerificationExceptionHandler$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CrashModuleImpl$automaticVerificationExceptionHandler$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final AutomaticVerificationExceptionHandler mo865invoke() {
                return new AutomaticVerificationExceptionHandler(Thread.getDefaultUncaughtExceptionHandler(), InitModule.this.getLogger());
            }
        });
        this.nativeCrashService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CrashModuleImpl$nativeCrashService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final NativeCrashService mo865invoke() {
                return !EssentialServiceModule.this.getConfigService().getAutoDataCaptureBehavior().isNdkEnabled() ? new NoopNativeCrashService() : EssentialServiceModule.this.getConfigService().getOTelBehavior().isBetaEnabled() ? new NativeCrashDataSourceImpl(EssentialServiceModule.this.getSessionProperties(), nativeModule.getNdkService(), androidServicesModule.getPreferencesService(), EssentialServiceModule.this.getLogWriter(), EssentialServiceModule.this.getConfigService(), coreModule.getJsonSerializer(), initModule.getLogger()) : nativeModule.getNdkService();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CrashDataSource getCrashDataSource() {
        return (CrashDataSource) this.crashDataSource$delegate.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CrashFileMarker getCrashMarker() {
        return (CrashFileMarker) this.crashMarker$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CrashService getLegacyCrashService() {
        return (CrashService) this.legacyCrashService$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.embrace.android.embracesdk.injection.CrashModule
    public AutomaticVerificationExceptionHandler getAutomaticVerificationExceptionHandler() {
        return (AutomaticVerificationExceptionHandler) this.automaticVerificationExceptionHandler$delegate.getValue(this, $$delegatedProperties[5]);
    }

    @Override // io.embrace.android.embracesdk.injection.CrashModule
    public CrashService getCrashService() {
        return (CrashService) this.crashService$delegate.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.embrace.android.embracesdk.injection.CrashModule
    public LastRunCrashVerifier getLastRunCrashVerifier() {
        return (LastRunCrashVerifier) this.lastRunCrashVerifier$delegate.getValue(this, $$delegatedProperties[4]);
    }

    @Override // io.embrace.android.embracesdk.injection.CrashModule
    public NativeCrashService getNativeCrashService() {
        return (NativeCrashService) this.nativeCrashService$delegate.getValue(this, $$delegatedProperties[6]);
    }
}
