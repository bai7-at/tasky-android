package io.embrace.android.embracesdk.injection;

import android.os.Looper;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.anr.AnrOtelMapper;
import io.embrace.android.embracesdk.anr.AnrService;
import io.embrace.android.embracesdk.anr.EmbraceAnrService;
import io.embrace.android.embracesdk.anr.NoOpAnrService;
import io.embrace.android.embracesdk.anr.detection.BlockedThreadDetector;
import io.embrace.android.embracesdk.anr.detection.LivenessCheckScheduler;
import io.embrace.android.embracesdk.anr.detection.TargetThreadHandler;
import io.embrace.android.embracesdk.anr.detection.ThreadMonitoringState;
import io.embrace.android.embracesdk.anr.sigquit.FilesDelegate;
import io.embrace.android.embracesdk.anr.sigquit.FindGoogleThread;
import io.embrace.android.embracesdk.anr.sigquit.GetThreadCommand;
import io.embrace.android.embracesdk.anr.sigquit.GetThreadsInCurrentProcess;
import io.embrace.android.embracesdk.anr.sigquit.GoogleAnrHandlerNativeDelegate;
import io.embrace.android.embracesdk.anr.sigquit.GoogleAnrTimestampRepository;
import io.embrace.android.embracesdk.anr.sigquit.SigquitDetectionService;
import io.embrace.android.embracesdk.capture.monitor.EmbraceResponsivenessMonitorService;
import io.embrace.android.embracesdk.capture.monitor.NoOpResponsivenessMonitorService;
import io.embrace.android.embracesdk.capture.monitor.ResponsivenessMonitorService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.ApkToolsConfig;
import io.embrace.android.embracesdk.internal.SharedObjectLoader;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.worker.ScheduledWorker;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class AnrModuleImpl implements AnrModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(AnrModuleImpl.class, "googleAnrTimestampRepository", "getGoogleAnrTimestampRepository()Lio/embrace/android/embracesdk/anr/sigquit/GoogleAnrTimestampRepository;", 0)), zt6.i(new PropertyReference1Impl(AnrModuleImpl.class, "anrService", "getAnrService()Lio/embrace/android/embracesdk/anr/AnrService;", 0)), zt6.i(new PropertyReference1Impl(AnrModuleImpl.class, "anrOtelMapper", "getAnrOtelMapper()Lio/embrace/android/embracesdk/anr/AnrOtelMapper;", 0)), zt6.i(new PropertyReference1Impl(AnrModuleImpl.class, "responsivenessMonitorService", "getResponsivenessMonitorService()Lio/embrace/android/embracesdk/capture/monitor/ResponsivenessMonitorService;", 0)), zt6.i(new PropertyReference1Impl(AnrModuleImpl.class, "looper", "getLooper()Landroid/os/Looper;", 0)), zt6.i(new PropertyReference1Impl(AnrModuleImpl.class, TransferTable.COLUMN_STATE, "getState()Lio/embrace/android/embracesdk/anr/detection/ThreadMonitoringState;", 0)), zt6.i(new PropertyReference1Impl(AnrModuleImpl.class, "targetThreadHandler", "getTargetThreadHandler()Lio/embrace/android/embracesdk/anr/detection/TargetThreadHandler;", 0)), zt6.i(new PropertyReference1Impl(AnrModuleImpl.class, "blockedThreadDetector", "getBlockedThreadDetector()Lio/embrace/android/embracesdk/anr/detection/BlockedThreadDetector;", 0)), zt6.i(new PropertyReference1Impl(AnrModuleImpl.class, "livenessCheckScheduler", "getLivenessCheckScheduler()Lio/embrace/android/embracesdk/anr/detection/LivenessCheckScheduler;", 0)), zt6.i(new PropertyReference1Impl(AnrModuleImpl.class, "sigquitDetectionService", "getSigquitDetectionService()Lio/embrace/android/embracesdk/anr/sigquit/SigquitDetectionService;", 0))};
    private final ScheduledWorker anrMonitorWorker;
    private final hp6 anrOtelMapper$delegate;
    private final hp6 anrService$delegate;
    private final hp6 blockedThreadDetector$delegate;
    private final ConfigService configService;
    private final hp6 googleAnrTimestampRepository$delegate;
    private final hp6 livenessCheckScheduler$delegate;
    private final hp6 looper$delegate;
    private final hp6 responsivenessMonitorService$delegate;
    private final hp6 sigquitDetectionService$delegate;
    private final hp6 state$delegate;
    private final hp6 targetThreadHandler$delegate;

    public AnrModuleImpl(final InitModule initModule, EssentialServiceModule essentialServiceModule, final WorkerThreadModule workerThreadModule) {
        zq3.h(initModule, "initModule");
        zq3.h(essentialServiceModule, "essentialServiceModule");
        zq3.h(workerThreadModule, "workerModule");
        this.anrMonitorWorker = workerThreadModule.scheduledWorker(WorkerName.ANR_MONITOR);
        this.configService = essentialServiceModule.getConfigService();
        qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.injection.AnrModuleImpl$googleAnrTimestampRepository$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final GoogleAnrTimestampRepository mo865invoke() {
                return new GoogleAnrTimestampRepository(InitModule.this.getLogger());
            }
        };
        LoadType loadType = LoadType.LAZY;
        this.googleAnrTimestampRepository$delegate = new SingletonDelegate(loadType, qs2Var);
        this.anrService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.AnrModuleImpl$anrService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final AnrService mo865invoke() {
                ConfigService configService;
                ConfigService configService2;
                Looper looper;
                SigquitDetectionService sigquitDetectionService;
                LivenessCheckScheduler livenessCheckScheduler;
                ScheduledWorker scheduledWorker;
                ThreadMonitoringState state;
                configService = AnrModuleImpl.this.configService;
                if (!configService.getAutoDataCaptureBehavior().isAnrServiceEnabled() || ApkToolsConfig.IS_ANR_MONITORING_DISABLED) {
                    return new NoOpAnrService();
                }
                configService2 = AnrModuleImpl.this.configService;
                looper = AnrModuleImpl.this.getLooper();
                zq3.g(looper, "looper");
                InternalEmbraceLogger logger = initModule.getLogger();
                sigquitDetectionService = AnrModuleImpl.this.getSigquitDetectionService();
                livenessCheckScheduler = AnrModuleImpl.this.getLivenessCheckScheduler();
                scheduledWorker = AnrModuleImpl.this.anrMonitorWorker;
                state = AnrModuleImpl.this.getState();
                return new EmbraceAnrService(configService2, looper, logger, sigquitDetectionService, livenessCheckScheduler, scheduledWorker, state, initModule.getClock(), workerThreadModule.getAnrMonitorThread());
            }
        });
        this.anrOtelMapper$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.AnrModuleImpl$anrOtelMapper$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final AnrOtelMapper mo865invoke() {
                return new AnrOtelMapper(AnrModuleImpl.this.getAnrService());
            }
        });
        this.responsivenessMonitorService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.AnrModuleImpl$responsivenessMonitorService$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ResponsivenessMonitorService mo865invoke() {
                ConfigService configService;
                LivenessCheckScheduler livenessCheckScheduler;
                configService = AnrModuleImpl.this.configService;
                if (!configService.getAutoDataCaptureBehavior().isAnrServiceEnabled() || ApkToolsConfig.IS_ANR_MONITORING_DISABLED) {
                    return new NoOpResponsivenessMonitorService();
                }
                livenessCheckScheduler = AnrModuleImpl.this.getLivenessCheckScheduler();
                return new EmbraceResponsivenessMonitorService(livenessCheckScheduler);
            }
        });
        this.looper$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.AnrModuleImpl$looper$2
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Looper mo865invoke() {
                return Looper.getMainLooper();
            }
        });
        this.state$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.AnrModuleImpl$state$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ThreadMonitoringState mo865invoke() {
                return new ThreadMonitoringState(InitModule.this.getClock());
            }
        });
        this.targetThreadHandler$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.AnrModuleImpl$targetThreadHandler$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final TargetThreadHandler mo865invoke() {
                Looper looper;
                ScheduledWorker scheduledWorker;
                ConfigService configService;
                looper = AnrModuleImpl.this.getLooper();
                zq3.g(looper, "looper");
                scheduledWorker = AnrModuleImpl.this.anrMonitorWorker;
                AtomicReference<Thread> anrMonitorThread = workerThreadModule.getAnrMonitorThread();
                configService = AnrModuleImpl.this.configService;
                return new TargetThreadHandler(looper, scheduledWorker, anrMonitorThread, configService, null, initModule.getLogger(), initModule.getClock(), 16, null);
            }
        });
        this.blockedThreadDetector$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.AnrModuleImpl$blockedThreadDetector$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final BlockedThreadDetector mo865invoke() {
                ConfigService configService;
                ThreadMonitoringState state;
                Looper looper;
                configService = AnrModuleImpl.this.configService;
                Clock clock = initModule.getClock();
                state = AnrModuleImpl.this.getState();
                looper = AnrModuleImpl.this.getLooper();
                zq3.g(looper, "looper");
                Thread thread = looper.getThread();
                zq3.g(thread, "looper.thread");
                return new BlockedThreadDetector(configService, clock, null, state, thread, initModule.getLogger(), workerThreadModule.getAnrMonitorThread(), 4, null);
            }
        });
        this.livenessCheckScheduler$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.AnrModuleImpl$livenessCheckScheduler$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final LivenessCheckScheduler mo865invoke() {
                ConfigService configService;
                ScheduledWorker scheduledWorker;
                ThreadMonitoringState state;
                TargetThreadHandler targetThreadHandler;
                BlockedThreadDetector blockedThreadDetector;
                configService = AnrModuleImpl.this.configService;
                scheduledWorker = AnrModuleImpl.this.anrMonitorWorker;
                Clock clock = initModule.getClock();
                state = AnrModuleImpl.this.getState();
                targetThreadHandler = AnrModuleImpl.this.getTargetThreadHandler();
                blockedThreadDetector = AnrModuleImpl.this.getBlockedThreadDetector();
                return new LivenessCheckScheduler(configService, scheduledWorker, clock, state, targetThreadHandler, blockedThreadDetector, initModule.getLogger(), workerThreadModule.getAnrMonitorThread());
            }
        });
        this.sigquitDetectionService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.AnrModuleImpl$sigquitDetectionService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final SigquitDetectionService mo865invoke() {
                ConfigService configService;
                FilesDelegate filesDelegate = new FilesDelegate();
                SharedObjectLoader sharedObjectLoader = new SharedObjectLoader(initModule.getLogger());
                FindGoogleThread findGoogleThread = new FindGoogleThread(initModule.getLogger(), new GetThreadsInCurrentProcess(filesDelegate), new GetThreadCommand(filesDelegate));
                GoogleAnrHandlerNativeDelegate googleAnrHandlerNativeDelegate = new GoogleAnrHandlerNativeDelegate(AnrModuleImpl.this.getGoogleAnrTimestampRepository(), initModule.getLogger());
                GoogleAnrTimestampRepository googleAnrTimestampRepository = AnrModuleImpl.this.getGoogleAnrTimestampRepository();
                configService = AnrModuleImpl.this.configService;
                return new SigquitDetectionService(sharedObjectLoader, findGoogleThread, googleAnrHandlerNativeDelegate, googleAnrTimestampRepository, configService, initModule.getLogger());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BlockedThreadDetector getBlockedThreadDetector() {
        return (BlockedThreadDetector) this.blockedThreadDetector$delegate.getValue(this, $$delegatedProperties[7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LivenessCheckScheduler getLivenessCheckScheduler() {
        return (LivenessCheckScheduler) this.livenessCheckScheduler$delegate.getValue(this, $$delegatedProperties[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Looper getLooper() {
        return (Looper) this.looper$delegate.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SigquitDetectionService getSigquitDetectionService() {
        return (SigquitDetectionService) this.sigquitDetectionService$delegate.getValue(this, $$delegatedProperties[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadMonitoringState getState() {
        return (ThreadMonitoringState) this.state$delegate.getValue(this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TargetThreadHandler getTargetThreadHandler() {
        return (TargetThreadHandler) this.targetThreadHandler$delegate.getValue(this, $$delegatedProperties[6]);
    }

    @Override // io.embrace.android.embracesdk.injection.AnrModule
    public AnrOtelMapper getAnrOtelMapper() {
        return (AnrOtelMapper) this.anrOtelMapper$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.embrace.android.embracesdk.injection.AnrModule
    public AnrService getAnrService() {
        return (AnrService) this.anrService$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.embrace.android.embracesdk.injection.AnrModule
    public GoogleAnrTimestampRepository getGoogleAnrTimestampRepository() {
        return (GoogleAnrTimestampRepository) this.googleAnrTimestampRepository$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.embrace.android.embracesdk.injection.AnrModule
    public ResponsivenessMonitorService getResponsivenessMonitorService() {
        return (ResponsivenessMonitorService) this.responsivenessMonitorService$delegate.getValue(this, $$delegatedProperties[3]);
    }
}
