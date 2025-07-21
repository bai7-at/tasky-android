package io.embrace.android.embracesdk.ndk;

import android.content.Context;
import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerInstaller;
import io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerService;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.comms.delivery.DeliveryService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.injection.AndroidServicesModule;
import io.embrace.android.embracesdk.injection.CoreModule;
import io.embrace.android.embracesdk.injection.DeliveryModule;
import io.embrace.android.embracesdk.injection.EssentialServiceModule;
import io.embrace.android.embracesdk.injection.InitModule;
import io.embrace.android.embracesdk.injection.LoadType;
import io.embrace.android.embracesdk.injection.SingletonDelegate;
import io.embrace.android.embracesdk.injection.StorageModule;
import io.embrace.android.embracesdk.internal.SharedObjectLoader;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties;
import io.embrace.android.embracesdk.storage.StorageService;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class NativeModuleImpl implements NativeModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(NativeModuleImpl.class, "ndkService", "getNdkService()Lio/embrace/android/embracesdk/ndk/NdkService;", 0)), zt6.i(new PropertyReference1Impl(NativeModuleImpl.class, "nativeThreadSamplerService", "getNativeThreadSamplerService()Lio/embrace/android/embracesdk/anr/ndk/NativeThreadSamplerService;", 0)), zt6.i(new PropertyReference1Impl(NativeModuleImpl.class, "nativeThreadSamplerInstaller", "getNativeThreadSamplerInstaller()Lio/embrace/android/embracesdk/anr/ndk/NativeThreadSamplerInstaller;", 0)), zt6.i(new PropertyReference1Impl(NativeModuleImpl.class, "embraceNdkServiceRepository", "getEmbraceNdkServiceRepository()Lio/embrace/android/embracesdk/ndk/EmbraceNdkServiceRepository;", 0))};
    private final hp6 embraceNdkServiceRepository$delegate;
    private final hp6 nativeThreadSamplerInstaller$delegate;
    private final hp6 nativeThreadSamplerService$delegate;
    private final hp6 ndkService$delegate;

    public NativeModuleImpl(final InitModule initModule, final CoreModule coreModule, final StorageModule storageModule, final EssentialServiceModule essentialServiceModule, final DeliveryModule deliveryModule, final AndroidServicesModule androidServicesModule, final WorkerThreadModule workerThreadModule) {
        zq3.h(initModule, "initModule");
        zq3.h(coreModule, "coreModule");
        zq3.h(storageModule, "storageModule");
        zq3.h(essentialServiceModule, "essentialServiceModule");
        zq3.h(deliveryModule, "deliveryModule");
        zq3.h(androidServicesModule, "androidServicesModule");
        zq3.h(workerThreadModule, "workerThreadModule");
        qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.ndk.NativeModuleImpl$ndkService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceNdkService mo865invoke() {
                EmbraceNdkServiceRepository embraceNdkServiceRepository;
                try {
                    Systrace.startSynchronous("ndk-service-init");
                    Context context = coreModule.getContext();
                    StorageService storageService = storageModule.getStorageService();
                    MetadataService metadataService = essentialServiceModule.getMetadataService();
                    ProcessStateService processStateService = essentialServiceModule.getProcessStateService();
                    ConfigService configService = essentialServiceModule.getConfigService();
                    DeliveryService deliveryService = deliveryModule.getDeliveryService();
                    UserService userService = essentialServiceModule.getUserService();
                    PreferencesService preferencesService = androidServicesModule.getPreferencesService();
                    EmbraceSessionProperties sessionProperties = essentialServiceModule.getSessionProperties();
                    Embrace.AppFramework appFramework = coreModule.getAppFramework();
                    SharedObjectLoader sharedObjectLoader = essentialServiceModule.getSharedObjectLoader();
                    InternalEmbraceLogger logger = initModule.getLogger();
                    embraceNdkServiceRepository = NativeModuleImpl.this.getEmbraceNdkServiceRepository();
                    return new EmbraceNdkService(context, storageService, metadataService, processStateService, configService, deliveryService, userService, preferencesService, sessionProperties, appFramework, sharedObjectLoader, logger, embraceNdkServiceRepository, new NdkDelegateImpl(), workerThreadModule.backgroundWorker(WorkerName.BACKGROUND_REGISTRATION), workerThreadModule.backgroundWorker(WorkerName.SERVICE_INIT), essentialServiceModule.getDeviceArchitecture(), coreModule.getJsonSerializer());
                } finally {
                }
            }
        };
        LoadType loadType = LoadType.LAZY;
        this.ndkService$delegate = new SingletonDelegate(loadType, qs2Var);
        this.nativeThreadSamplerService$delegate = new SingletonDelegate(loadType, new NativeModuleImpl$nativeThreadSamplerService$2(this, essentialServiceModule, initModule, workerThreadModule));
        this.nativeThreadSamplerInstaller$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.ndk.NativeModuleImpl$nativeThreadSamplerInstaller$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final NativeThreadSamplerInstaller mo865invoke() {
                boolean nativeThreadSamplingEnabled;
                try {
                    Systrace.startSynchronous("native-thread-sampler-installer-init");
                    nativeThreadSamplingEnabled = NativeModuleImpl.this.nativeThreadSamplingEnabled(essentialServiceModule.getConfigService());
                    return nativeThreadSamplingEnabled ? new NativeThreadSamplerInstaller(essentialServiceModule.getSharedObjectLoader(), initModule.getLogger()) : null;
                } finally {
                }
            }
        });
        this.embraceNdkServiceRepository$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.ndk.NativeModuleImpl$embraceNdkServiceRepository$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceNdkServiceRepository mo865invoke() {
                return new EmbraceNdkServiceRepository(StorageModule.this.getStorageService(), initModule.getLogger());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmbraceNdkServiceRepository getEmbraceNdkServiceRepository() {
        return (EmbraceNdkServiceRepository) this.embraceNdkServiceRepository$delegate.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean nativeThreadSamplingEnabled(ConfigService configService) {
        return configService.getAutoDataCaptureBehavior().isNdkEnabled();
    }

    @Override // io.embrace.android.embracesdk.ndk.NativeModule
    public NativeThreadSamplerInstaller getNativeThreadSamplerInstaller() {
        return (NativeThreadSamplerInstaller) this.nativeThreadSamplerInstaller$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.embrace.android.embracesdk.ndk.NativeModule
    public NativeThreadSamplerService getNativeThreadSamplerService() {
        return (NativeThreadSamplerService) this.nativeThreadSamplerService$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.embrace.android.embracesdk.ndk.NativeModule
    public NdkService getNdkService() {
        return (NdkService) this.ndkService$delegate.getValue(this, $$delegatedProperties[0]);
    }
}
