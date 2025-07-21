package io.embrace.android.embracesdk.injection;

import android.app.Application;
import android.content.Context;
import com.comscore.streaming.ContentType;
import defpackage.gt2;
import defpackage.it2;
import defpackage.mt2;
import defpackage.ot2;
import defpackage.pt2;
import defpackage.qs2;
import defpackage.rs2;
import defpackage.ss2;
import defpackage.ts2;
import defpackage.vu3;
import defpackage.ws2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.anr.ndk.EmbraceNativeThreadSamplerServiceKt;
import io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerInstaller;
import io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerService;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.internal.logs.LogOrchestrator;
import io.embrace.android.embracesdk.internal.network.http.HttpUrlConnectionTracker;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.internal.utils.BuildVersionChecker;
import io.embrace.android.embracesdk.internal.utils.VersionChecker;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.ndk.NativeModule;
import io.embrace.android.embracesdk.ndk.NativeModuleImpl;
import io.embrace.android.embracesdk.ndk.NdkService;
import io.embrace.android.embracesdk.registry.ServiceRegistry;
import io.embrace.android.embracesdk.session.properties.SessionPropertiesService;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import io.embrace.android.embracesdk.worker.WorkerThreadModuleImpl;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class ModuleInitBootstrapper {
    private AndroidServicesModule androidServicesModule;
    private final it2 androidServicesModuleSupplier;
    private AnrModule anrModule;
    private final it2 anrModuleSupplier;
    private volatile long asyncInitCompletionMs;
    private final AtomicReference<Future<?>> asyncInitTask;
    private CoreModule coreModule;
    private final it2 coreModuleSupplier;
    private CrashModule crashModule;
    private final ts2 crashModuleSupplier;
    private CustomerLogModule customerLogModule;
    private final pt2 customerLogModuleSupplier;
    private DataCaptureServiceModule dataCaptureServiceModule;
    private final pt2 dataCaptureServiceModuleSupplier;
    private DataContainerModule dataContainerModule;
    private final rs2 dataContainerModuleSupplier;
    private DataSourceModule dataSourceModule;
    private final ot2 dataSourceModuleSupplier;
    private DeliveryModule deliveryModule;
    private final mt2 deliveryModuleSupplier;
    private EssentialServiceModule essentialServiceModule;
    private final ts2 essentialServiceModuleSupplier;
    private final InitModule initModule;
    private final InternalEmbraceLogger logger;
    private NativeModule nativeModule;
    private final ot2 nativeModuleSupplier;
    private final OpenTelemetryModule openTelemetryModule;
    private PayloadModule payloadModule;
    private final rs2 payloadModuleSupplier;
    private SdkObservabilityModule sdkObservabilityModule;
    private final gt2 sdkObservabilityModuleSupplier;
    private SessionModule sessionModule;
    private final ws2 sessionModuleSupplier;
    private StorageModule storageModule;
    private final it2 storageModuleSupplier;
    private volatile long synchronousInitCompletionMs;
    private SystemServiceModule systemServiceModule;
    private final gt2 systemServiceModuleSupplier;
    private WorkerThreadModule workerThreadModule;
    private final ss2 workerThreadModuleSupplier;

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements it2 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(3, CoreModuleImpl.class, "<init>", "<init>(Landroid/content/Context;Lio/embrace/android/embracesdk/Embrace$AppFramework;Lio/embrace/android/embracesdk/logging/InternalEmbraceLogger;)V", 0);
        }

        @Override // defpackage.it2
        public final CoreModuleImpl invoke(Context context, Embrace.AppFramework appFramework, InternalEmbraceLogger internalEmbraceLogger) {
            zq3.h(context, "p1");
            zq3.h(appFramework, "p2");
            zq3.h(internalEmbraceLogger, "p3");
            return new CoreModuleImpl(context, appFramework, internalEmbraceLogger);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$10, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass10 extends FunctionReferenceImpl implements it2 {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        AnonymousClass10() {
            super(3, AnrModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/worker/WorkerThreadModule;)V", 0);
        }

        @Override // defpackage.it2
        public final AnrModuleImpl invoke(InitModule initModule, EssentialServiceModule essentialServiceModule, WorkerThreadModule workerThreadModule) {
            zq3.h(initModule, "p1");
            zq3.h(essentialServiceModule, "p2");
            zq3.h(workerThreadModule, "p3");
            return new AnrModuleImpl(initModule, essentialServiceModule, workerThreadModule);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$11, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass11 extends FunctionReferenceImpl implements gt2 {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        AnonymousClass11() {
            super(2, SdkObservabilityModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/EssentialServiceModule;)V", 0);
        }

        @Override // defpackage.gt2
        public final SdkObservabilityModuleImpl invoke(InitModule initModule, EssentialServiceModule essentialServiceModule) {
            zq3.h(initModule, "p1");
            zq3.h(essentialServiceModule, "p2");
            return new SdkObservabilityModuleImpl(initModule, essentialServiceModule);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$12, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass12 extends FunctionReferenceImpl implements pt2 {
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        AnonymousClass12() {
            super(8, CustomerLogModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/CoreModule;Lio/embrace/android/embracesdk/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/injection/DeliveryModule;Lio/embrace/android/embracesdk/worker/WorkerThreadModule;Lio/embrace/android/embracesdk/injection/PayloadModule;)V", 0);
        }

        @Override // defpackage.pt2
        public final CustomerLogModuleImpl invoke(InitModule initModule, CoreModule coreModule, OpenTelemetryModule openTelemetryModule, AndroidServicesModule androidServicesModule, EssentialServiceModule essentialServiceModule, DeliveryModule deliveryModule, WorkerThreadModule workerThreadModule, PayloadModule payloadModule) {
            zq3.h(initModule, "p1");
            zq3.h(coreModule, "p2");
            zq3.h(openTelemetryModule, "p3");
            zq3.h(androidServicesModule, "p4");
            zq3.h(essentialServiceModule, "p5");
            zq3.h(deliveryModule, "p6");
            zq3.h(workerThreadModule, "p7");
            zq3.h(payloadModule, "p8");
            return new CustomerLogModuleImpl(initModule, coreModule, openTelemetryModule, androidServicesModule, essentialServiceModule, deliveryModule, workerThreadModule, payloadModule);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$13, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass13 extends FunctionReferenceImpl implements ot2 {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        AnonymousClass13() {
            super(7, NativeModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/CoreModule;Lio/embrace/android/embracesdk/injection/StorageModule;Lio/embrace/android/embracesdk/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/injection/DeliveryModule;Lio/embrace/android/embracesdk/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/worker/WorkerThreadModule;)V", 0);
        }

        @Override // defpackage.ot2
        public final NativeModuleImpl invoke(InitModule initModule, CoreModule coreModule, StorageModule storageModule, EssentialServiceModule essentialServiceModule, DeliveryModule deliveryModule, AndroidServicesModule androidServicesModule, WorkerThreadModule workerThreadModule) {
            zq3.h(initModule, "p1");
            zq3.h(coreModule, "p2");
            zq3.h(storageModule, "p3");
            zq3.h(essentialServiceModule, "p4");
            zq3.h(deliveryModule, "p5");
            zq3.h(androidServicesModule, "p6");
            zq3.h(workerThreadModule, "p7");
            return new NativeModuleImpl(initModule, coreModule, storageModule, essentialServiceModule, deliveryModule, androidServicesModule, workerThreadModule);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$14, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass14 extends FunctionReferenceImpl implements rs2 {
        public static final AnonymousClass14 INSTANCE = new AnonymousClass14();

        AnonymousClass14() {
            super(10, DataContainerModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/worker/WorkerThreadModule;Lio/embrace/android/embracesdk/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/injection/DataCaptureServiceModule;Lio/embrace/android/embracesdk/injection/AnrModule;Lio/embrace/android/embracesdk/injection/CustomerLogModule;Lio/embrace/android/embracesdk/injection/DeliveryModule;Lio/embrace/android/embracesdk/ndk/NativeModule;J)V", 0);
        }

        @Override // defpackage.rs2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
            return invoke((InitModule) obj, (OpenTelemetryModule) obj2, (WorkerThreadModule) obj3, (EssentialServiceModule) obj4, (DataCaptureServiceModule) obj5, (AnrModule) obj6, (CustomerLogModule) obj7, (DeliveryModule) obj8, (NativeModule) obj9, ((Number) obj10).longValue());
        }

        public final DataContainerModuleImpl invoke(InitModule initModule, OpenTelemetryModule openTelemetryModule, WorkerThreadModule workerThreadModule, EssentialServiceModule essentialServiceModule, DataCaptureServiceModule dataCaptureServiceModule, AnrModule anrModule, CustomerLogModule customerLogModule, DeliveryModule deliveryModule, NativeModule nativeModule, long j) {
            zq3.h(initModule, "p1");
            zq3.h(openTelemetryModule, "p2");
            zq3.h(workerThreadModule, "p3");
            zq3.h(essentialServiceModule, "p4");
            zq3.h(dataCaptureServiceModule, "p5");
            zq3.h(anrModule, "p6");
            zq3.h(customerLogModule, "p7");
            zq3.h(deliveryModule, "p8");
            zq3.h(nativeModule, "p9");
            return new DataContainerModuleImpl(initModule, openTelemetryModule, workerThreadModule, essentialServiceModule, dataCaptureServiceModule, anrModule, customerLogModule, deliveryModule, nativeModule, j);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$15, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass15 extends FunctionReferenceImpl implements ws2 {
        public static final AnonymousClass15 INSTANCE = new AnonymousClass15();

        AnonymousClass15() {
            super(14, SessionModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/ndk/NativeModule;Lio/embrace/android/embracesdk/injection/DataContainerModule;Lio/embrace/android/embracesdk/injection/DeliveryModule;Lio/embrace/android/embracesdk/injection/DataCaptureServiceModule;Lio/embrace/android/embracesdk/injection/CustomerLogModule;Lio/embrace/android/embracesdk/injection/SdkObservabilityModule;Lio/embrace/android/embracesdk/worker/WorkerThreadModule;Lio/embrace/android/embracesdk/injection/DataSourceModule;Lio/embrace/android/embracesdk/injection/PayloadModule;Lio/embrace/android/embracesdk/injection/AnrModule;)V", 0);
        }

        @Override // defpackage.ws2
        public final SessionModuleImpl invoke(InitModule initModule, OpenTelemetryModule openTelemetryModule, AndroidServicesModule androidServicesModule, EssentialServiceModule essentialServiceModule, NativeModule nativeModule, DataContainerModule dataContainerModule, DeliveryModule deliveryModule, DataCaptureServiceModule dataCaptureServiceModule, CustomerLogModule customerLogModule, SdkObservabilityModule sdkObservabilityModule, WorkerThreadModule workerThreadModule, DataSourceModule dataSourceModule, PayloadModule payloadModule, AnrModule anrModule) {
            zq3.h(initModule, "p1");
            zq3.h(openTelemetryModule, "p2");
            zq3.h(androidServicesModule, "p3");
            zq3.h(essentialServiceModule, "p4");
            zq3.h(nativeModule, "p5");
            zq3.h(dataContainerModule, "p6");
            zq3.h(deliveryModule, "p7");
            zq3.h(dataCaptureServiceModule, "p8");
            zq3.h(customerLogModule, "p9");
            zq3.h(sdkObservabilityModule, "p10");
            zq3.h(workerThreadModule, "p11");
            zq3.h(dataSourceModule, "p12");
            zq3.h(payloadModule, "p13");
            zq3.h(anrModule, "p14");
            return new SessionModuleImpl(initModule, openTelemetryModule, androidServicesModule, essentialServiceModule, nativeModule, dataContainerModule, deliveryModule, dataCaptureServiceModule, customerLogModule, sdkObservabilityModule, workerThreadModule, dataSourceModule, payloadModule, anrModule);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$16, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass16 extends FunctionReferenceImpl implements ts2 {
        public static final AnonymousClass16 INSTANCE = new AnonymousClass16();

        AnonymousClass16() {
            super(11, CrashModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/CoreModule;Lio/embrace/android/embracesdk/injection/StorageModule;Lio/embrace/android/embracesdk/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/injection/DeliveryModule;Lio/embrace/android/embracesdk/ndk/NativeModule;Lio/embrace/android/embracesdk/injection/SessionModule;Lio/embrace/android/embracesdk/injection/AnrModule;Lio/embrace/android/embracesdk/injection/DataContainerModule;Lio/embrace/android/embracesdk/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/injection/CustomerLogModule;)V", 0);
        }

        @Override // defpackage.ts2
        public final CrashModuleImpl invoke(InitModule initModule, CoreModule coreModule, StorageModule storageModule, EssentialServiceModule essentialServiceModule, DeliveryModule deliveryModule, NativeModule nativeModule, SessionModule sessionModule, AnrModule anrModule, DataContainerModule dataContainerModule, AndroidServicesModule androidServicesModule, CustomerLogModule customerLogModule) {
            zq3.h(initModule, "p1");
            zq3.h(coreModule, "p2");
            zq3.h(storageModule, "p3");
            zq3.h(essentialServiceModule, "p4");
            zq3.h(deliveryModule, "p5");
            zq3.h(nativeModule, "p6");
            zq3.h(sessionModule, "p7");
            zq3.h(anrModule, "p8");
            zq3.h(dataContainerModule, "p9");
            zq3.h(androidServicesModule, "p10");
            zq3.h(customerLogModule, "p11");
            return new CrashModuleImpl(initModule, coreModule, storageModule, essentialServiceModule, deliveryModule, nativeModule, sessionModule, anrModule, dataContainerModule, androidServicesModule, customerLogModule);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$17, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass17 extends FunctionReferenceImpl implements rs2 {
        public static final AnonymousClass17 INSTANCE = new AnonymousClass17();

        AnonymousClass17() {
            super(10, PayloadModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/CoreModule;Lio/embrace/android/embracesdk/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/injection/SystemServiceModule;Lio/embrace/android/embracesdk/worker/WorkerThreadModule;Lio/embrace/android/embracesdk/ndk/NativeModule;Lio/embrace/android/embracesdk/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/injection/SdkObservabilityModule;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // defpackage.rs2
        public final PayloadModuleImpl invoke(InitModule initModule, CoreModule coreModule, AndroidServicesModule androidServicesModule, EssentialServiceModule essentialServiceModule, SystemServiceModule systemServiceModule, WorkerThreadModule workerThreadModule, NativeModule nativeModule, OpenTelemetryModule openTelemetryModule, SdkObservabilityModule sdkObservabilityModule, qs2 qs2Var) {
            zq3.h(initModule, "p1");
            zq3.h(coreModule, "p2");
            zq3.h(androidServicesModule, "p3");
            zq3.h(essentialServiceModule, "p4");
            zq3.h(systemServiceModule, "p5");
            zq3.h(workerThreadModule, "p6");
            zq3.h(nativeModule, "p7");
            zq3.h(openTelemetryModule, "p8");
            zq3.h(sdkObservabilityModule, "p9");
            zq3.h(qs2Var, "p10");
            return new PayloadModuleImpl(initModule, coreModule, androidServicesModule, essentialServiceModule, systemServiceModule, workerThreadModule, nativeModule, openTelemetryModule, sdkObservabilityModule, qs2Var);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements gt2 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2, SystemServiceModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/CoreModule;Lio/embrace/android/embracesdk/internal/utils/VersionChecker;)V", 0);
        }

        @Override // defpackage.gt2
        public final SystemServiceModuleImpl invoke(CoreModule coreModule, VersionChecker versionChecker) {
            zq3.h(coreModule, "p1");
            zq3.h(versionChecker, "p2");
            return new SystemServiceModuleImpl(coreModule, versionChecker);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements it2 {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(3, AndroidServicesModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/CoreModule;Lio/embrace/android/embracesdk/worker/WorkerThreadModule;)V", 0);
        }

        @Override // defpackage.it2
        public final AndroidServicesModuleImpl invoke(InitModule initModule, CoreModule coreModule, WorkerThreadModule workerThreadModule) {
            zq3.h(initModule, "p1");
            zq3.h(coreModule, "p2");
            zq3.h(workerThreadModule, "p3");
            return new AndroidServicesModuleImpl(initModule, coreModule, workerThreadModule);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements ss2 {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(1, WorkerThreadModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;)V", 0);
        }

        @Override // defpackage.ss2
        public final WorkerThreadModuleImpl invoke(InitModule initModule) {
            zq3.h(initModule, "p1");
            return new WorkerThreadModuleImpl(initModule);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements it2 {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(3, StorageModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/CoreModule;Lio/embrace/android/embracesdk/worker/WorkerThreadModule;)V", 0);
        }

        @Override // defpackage.it2
        public final StorageModuleImpl invoke(InitModule initModule, CoreModule coreModule, WorkerThreadModule workerThreadModule) {
            zq3.h(initModule, "p1");
            zq3.h(coreModule, "p2");
            zq3.h(workerThreadModule, "p3");
            return new StorageModuleImpl(initModule, coreModule, workerThreadModule);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$6, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements ts2 {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        AnonymousClass6() {
            super(11, EssentialServiceModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/injection/CoreModule;Lio/embrace/android/embracesdk/worker/WorkerThreadModule;Lio/embrace/android/embracesdk/injection/SystemServiceModule;Lio/embrace/android/embracesdk/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/injection/StorageModule;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // defpackage.ts2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
            return invoke((InitModule) obj, (OpenTelemetryModule) obj2, (CoreModule) obj3, (WorkerThreadModule) obj4, (SystemServiceModule) obj5, (AndroidServicesModule) obj6, (StorageModule) obj7, (String) obj8, ((Boolean) obj9).booleanValue(), (qs2) obj10, (qs2) obj11);
        }

        public final EssentialServiceModuleImpl invoke(InitModule initModule, OpenTelemetryModule openTelemetryModule, CoreModule coreModule, WorkerThreadModule workerThreadModule, SystemServiceModule systemServiceModule, AndroidServicesModule androidServicesModule, StorageModule storageModule, String str, boolean z, qs2 qs2Var, qs2 qs2Var2) {
            zq3.h(initModule, "p1");
            zq3.h(openTelemetryModule, "p2");
            zq3.h(coreModule, "p3");
            zq3.h(workerThreadModule, "p4");
            zq3.h(systemServiceModule, "p5");
            zq3.h(androidServicesModule, "p6");
            zq3.h(storageModule, "p7");
            zq3.h(qs2Var, "p10");
            zq3.h(qs2Var2, "p11");
            return new EssentialServiceModuleImpl(initModule, openTelemetryModule, coreModule, workerThreadModule, systemServiceModule, androidServicesModule, storageModule, str, z, qs2Var, qs2Var2);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$7, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements ot2 {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        AnonymousClass7() {
            super(7, DataSourceModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/CoreModule;Lio/embrace/android/embracesdk/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/injection/SystemServiceModule;Lio/embrace/android/embracesdk/injection/AndroidServicesModule;Lio/embrace/android/embracesdk/worker/WorkerThreadModule;)V", 0);
        }

        @Override // defpackage.ot2
        public final DataSourceModuleImpl invoke(InitModule initModule, CoreModule coreModule, OpenTelemetryModule openTelemetryModule, EssentialServiceModule essentialServiceModule, SystemServiceModule systemServiceModule, AndroidServicesModule androidServicesModule, WorkerThreadModule workerThreadModule) {
            zq3.h(initModule, "p1");
            zq3.h(coreModule, "p2");
            zq3.h(openTelemetryModule, "p3");
            zq3.h(essentialServiceModule, "p4");
            zq3.h(systemServiceModule, "p5");
            zq3.h(androidServicesModule, "p6");
            zq3.h(workerThreadModule, "p7");
            return new DataSourceModuleImpl(initModule, coreModule, openTelemetryModule, essentialServiceModule, systemServiceModule, androidServicesModule, workerThreadModule);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$8, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass8 extends FunctionReferenceImpl implements pt2 {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        AnonymousClass8() {
            super(8, DataCaptureServiceModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/OpenTelemetryModule;Lio/embrace/android/embracesdk/injection/CoreModule;Lio/embrace/android/embracesdk/injection/SystemServiceModule;Lio/embrace/android/embracesdk/injection/EssentialServiceModule;Lio/embrace/android/embracesdk/worker/WorkerThreadModule;Lio/embrace/android/embracesdk/internal/utils/VersionChecker;Lio/embrace/android/embracesdk/injection/DataSourceModule;)V", 0);
        }

        @Override // defpackage.pt2
        public final DataCaptureServiceModuleImpl invoke(InitModule initModule, OpenTelemetryModule openTelemetryModule, CoreModule coreModule, SystemServiceModule systemServiceModule, EssentialServiceModule essentialServiceModule, WorkerThreadModule workerThreadModule, VersionChecker versionChecker, DataSourceModule dataSourceModule) {
            zq3.h(initModule, "p1");
            zq3.h(openTelemetryModule, "p2");
            zq3.h(coreModule, "p3");
            zq3.h(systemServiceModule, "p4");
            zq3.h(essentialServiceModule, "p5");
            zq3.h(workerThreadModule, "p6");
            zq3.h(versionChecker, "p7");
            zq3.h(dataSourceModule, "p8");
            return new DataCaptureServiceModuleImpl(initModule, openTelemetryModule, coreModule, systemServiceModule, essentialServiceModule, workerThreadModule, versionChecker, dataSourceModule);
        }
    }

    /* renamed from: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$9, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass9 extends FunctionReferenceImpl implements mt2 {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        AnonymousClass9() {
            super(5, DeliveryModuleImpl.class, "<init>", "<init>(Lio/embrace/android/embracesdk/injection/InitModule;Lio/embrace/android/embracesdk/injection/CoreModule;Lio/embrace/android/embracesdk/worker/WorkerThreadModule;Lio/embrace/android/embracesdk/injection/StorageModule;Lio/embrace/android/embracesdk/injection/EssentialServiceModule;)V", 0);
        }

        @Override // defpackage.mt2
        public final DeliveryModuleImpl invoke(InitModule initModule, CoreModule coreModule, WorkerThreadModule workerThreadModule, StorageModule storageModule, EssentialServiceModule essentialServiceModule) {
            zq3.h(initModule, "p1");
            zq3.h(coreModule, "p2");
            zq3.h(workerThreadModule, "p3");
            zq3.h(storageModule, "p4");
            zq3.h(essentialServiceModule, "p5");
            return new DeliveryModuleImpl(initModule, coreModule, workerThreadModule, storageModule, essentialServiceModule);
        }
    }

    public ModuleInitBootstrapper() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public static final /* synthetic */ AndroidServicesModule access$getAndroidServicesModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        AndroidServicesModule androidServicesModule = moduleInitBootstrapper.androidServicesModule;
        if (androidServicesModule == null) {
            zq3.z("androidServicesModule");
        }
        return androidServicesModule;
    }

    public static final /* synthetic */ AnrModule access$getAnrModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        AnrModule anrModule = moduleInitBootstrapper.anrModule;
        if (anrModule == null) {
            zq3.z("anrModule");
        }
        return anrModule;
    }

    public static final /* synthetic */ CoreModule access$getCoreModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        CoreModule coreModule = moduleInitBootstrapper.coreModule;
        if (coreModule == null) {
            zq3.z("coreModule");
        }
        return coreModule;
    }

    public static final /* synthetic */ CrashModule access$getCrashModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        CrashModule crashModule = moduleInitBootstrapper.crashModule;
        if (crashModule == null) {
            zq3.z("crashModule");
        }
        return crashModule;
    }

    public static final /* synthetic */ CustomerLogModule access$getCustomerLogModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        CustomerLogModule customerLogModule = moduleInitBootstrapper.customerLogModule;
        if (customerLogModule == null) {
            zq3.z("customerLogModule");
        }
        return customerLogModule;
    }

    public static final /* synthetic */ DataCaptureServiceModule access$getDataCaptureServiceModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        DataCaptureServiceModule dataCaptureServiceModule = moduleInitBootstrapper.dataCaptureServiceModule;
        if (dataCaptureServiceModule == null) {
            zq3.z("dataCaptureServiceModule");
        }
        return dataCaptureServiceModule;
    }

    public static final /* synthetic */ DataContainerModule access$getDataContainerModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        DataContainerModule dataContainerModule = moduleInitBootstrapper.dataContainerModule;
        if (dataContainerModule == null) {
            zq3.z("dataContainerModule");
        }
        return dataContainerModule;
    }

    public static final /* synthetic */ DataSourceModule access$getDataSourceModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        DataSourceModule dataSourceModule = moduleInitBootstrapper.dataSourceModule;
        if (dataSourceModule == null) {
            zq3.z("dataSourceModule");
        }
        return dataSourceModule;
    }

    public static final /* synthetic */ DeliveryModule access$getDeliveryModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        DeliveryModule deliveryModule = moduleInitBootstrapper.deliveryModule;
        if (deliveryModule == null) {
            zq3.z("deliveryModule");
        }
        return deliveryModule;
    }

    public static final /* synthetic */ EssentialServiceModule access$getEssentialServiceModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        EssentialServiceModule essentialServiceModule = moduleInitBootstrapper.essentialServiceModule;
        if (essentialServiceModule == null) {
            zq3.z("essentialServiceModule");
        }
        return essentialServiceModule;
    }

    public static final /* synthetic */ NativeModule access$getNativeModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        NativeModule nativeModule = moduleInitBootstrapper.nativeModule;
        if (nativeModule == null) {
            zq3.z("nativeModule");
        }
        return nativeModule;
    }

    public static final /* synthetic */ PayloadModule access$getPayloadModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        PayloadModule payloadModule = moduleInitBootstrapper.payloadModule;
        if (payloadModule == null) {
            zq3.z("payloadModule");
        }
        return payloadModule;
    }

    public static final /* synthetic */ SdkObservabilityModule access$getSdkObservabilityModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        SdkObservabilityModule sdkObservabilityModule = moduleInitBootstrapper.sdkObservabilityModule;
        if (sdkObservabilityModule == null) {
            zq3.z("sdkObservabilityModule");
        }
        return sdkObservabilityModule;
    }

    public static final /* synthetic */ SessionModule access$getSessionModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        SessionModule sessionModule = moduleInitBootstrapper.sessionModule;
        if (sessionModule == null) {
            zq3.z("sessionModule");
        }
        return sessionModule;
    }

    public static final /* synthetic */ StorageModule access$getStorageModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        StorageModule storageModule = moduleInitBootstrapper.storageModule;
        if (storageModule == null) {
            zq3.z("storageModule");
        }
        return storageModule;
    }

    public static final /* synthetic */ SystemServiceModule access$getSystemServiceModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        SystemServiceModule systemServiceModule = moduleInitBootstrapper.systemServiceModule;
        if (systemServiceModule == null) {
            zq3.z("systemServiceModule");
        }
        return systemServiceModule;
    }

    public static final /* synthetic */ WorkerThreadModule access$getWorkerThreadModule$p(ModuleInitBootstrapper moduleInitBootstrapper) {
        WorkerThreadModule workerThreadModule = moduleInitBootstrapper.workerThreadModule;
        if (workerThreadModule == null) {
            zq3.z("workerThreadModule");
        }
        return workerThreadModule;
    }

    public static /* synthetic */ boolean init$default(ModuleInitBootstrapper moduleInitBootstrapper, Context context, boolean z, Embrace.AppFramework appFramework, long j, String str, qs2 qs2Var, VersionChecker versionChecker, int i, Object obj) {
        return moduleInitBootstrapper.init(context, z, appFramework, j, (i & 16) != 0 ? null : str, (i & 32) != 0 ? new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Void mo865invoke() {
                return null;
            }
        } : qs2Var, (i & 64) != 0 ? BuildVersionChecker.INSTANCE : versionChecker);
    }

    private final boolean isInitialized() {
        return this.asyncInitTask.get() != null;
    }

    private final <T> T postInit(vu3 vu3Var, qs2 qs2Var) {
        try {
            Systrace.startSynchronous(toSectionName(vu3Var) + "-post-init");
            return (T) qs2Var.mo865invoke();
        } finally {
        }
    }

    private final String toSectionName(vu3 vu3Var) {
        String w0;
        String d = vu3Var.d();
        if (d != null && (w0 = h.w0(d, "Module")) != null) {
            Locale locale = Locale.ENGLISH;
            zq3.g(locale, "Locale.ENGLISH");
            String lowerCase = w0.toLowerCase(locale);
            zq3.g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (lowerCase != null) {
                return lowerCase;
            }
        }
        return "module";
    }

    public static /* synthetic */ void waitForAsyncInit$default(ModuleInitBootstrapper moduleInitBootstrapper, long j, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 5;
        }
        if ((i & 2) != 0) {
            timeUnit = TimeUnit.SECONDS;
        }
        moduleInitBootstrapper.waitForAsyncInit(j, timeUnit);
    }

    public final AndroidServicesModule getAndroidServicesModule() {
        AndroidServicesModule androidServicesModule = this.androidServicesModule;
        if (androidServicesModule == null) {
            zq3.z("androidServicesModule");
        }
        return androidServicesModule;
    }

    public final AnrModule getAnrModule() {
        AnrModule anrModule = this.anrModule;
        if (anrModule == null) {
            zq3.z("anrModule");
        }
        return anrModule;
    }

    public final CoreModule getCoreModule() {
        CoreModule coreModule = this.coreModule;
        if (coreModule == null) {
            zq3.z("coreModule");
        }
        return coreModule;
    }

    public final CrashModule getCrashModule() {
        CrashModule crashModule = this.crashModule;
        if (crashModule == null) {
            zq3.z("crashModule");
        }
        return crashModule;
    }

    public final CustomerLogModule getCustomerLogModule() {
        CustomerLogModule customerLogModule = this.customerLogModule;
        if (customerLogModule == null) {
            zq3.z("customerLogModule");
        }
        return customerLogModule;
    }

    public final DataCaptureServiceModule getDataCaptureServiceModule() {
        DataCaptureServiceModule dataCaptureServiceModule = this.dataCaptureServiceModule;
        if (dataCaptureServiceModule == null) {
            zq3.z("dataCaptureServiceModule");
        }
        return dataCaptureServiceModule;
    }

    public final DataContainerModule getDataContainerModule() {
        DataContainerModule dataContainerModule = this.dataContainerModule;
        if (dataContainerModule == null) {
            zq3.z("dataContainerModule");
        }
        return dataContainerModule;
    }

    public final DataSourceModule getDataSourceModule() {
        DataSourceModule dataSourceModule = this.dataSourceModule;
        if (dataSourceModule == null) {
            zq3.z("dataSourceModule");
        }
        return dataSourceModule;
    }

    public final DeliveryModule getDeliveryModule() {
        DeliveryModule deliveryModule = this.deliveryModule;
        if (deliveryModule == null) {
            zq3.z("deliveryModule");
        }
        return deliveryModule;
    }

    public final EssentialServiceModule getEssentialServiceModule() {
        EssentialServiceModule essentialServiceModule = this.essentialServiceModule;
        if (essentialServiceModule == null) {
            zq3.z("essentialServiceModule");
        }
        return essentialServiceModule;
    }

    public final InitModule getInitModule() {
        return this.initModule;
    }

    public final InternalEmbraceLogger getLogger() {
        return this.logger;
    }

    public final NativeModule getNativeModule() {
        NativeModule nativeModule = this.nativeModule;
        if (nativeModule == null) {
            zq3.z("nativeModule");
        }
        return nativeModule;
    }

    public final OpenTelemetryModule getOpenTelemetryModule() {
        return this.openTelemetryModule;
    }

    public final PayloadModule getPayloadModule() {
        PayloadModule payloadModule = this.payloadModule;
        if (payloadModule == null) {
            zq3.z("payloadModule");
        }
        return payloadModule;
    }

    public final SdkObservabilityModule getSdkObservabilityModule() {
        SdkObservabilityModule sdkObservabilityModule = this.sdkObservabilityModule;
        if (sdkObservabilityModule == null) {
            zq3.z("sdkObservabilityModule");
        }
        return sdkObservabilityModule;
    }

    public final SessionModule getSessionModule() {
        SessionModule sessionModule = this.sessionModule;
        if (sessionModule == null) {
            zq3.z("sessionModule");
        }
        return sessionModule;
    }

    public final StorageModule getStorageModule() {
        StorageModule storageModule = this.storageModule;
        if (storageModule == null) {
            zq3.z("storageModule");
        }
        return storageModule;
    }

    public final SystemServiceModule getSystemServiceModule() {
        SystemServiceModule systemServiceModule = this.systemServiceModule;
        if (systemServiceModule == null) {
            zq3.z("systemServiceModule");
        }
        return systemServiceModule;
    }

    public final WorkerThreadModule getWorkerThreadModule() {
        WorkerThreadModule workerThreadModule = this.workerThreadModule;
        if (workerThreadModule == null) {
            zq3.z("workerThreadModule");
        }
        return workerThreadModule;
    }

    public final boolean init(Context context, boolean z, Embrace.AppFramework appFramework, long j) {
        return init$default(this, context, z, appFramework, j, null, null, null, ContentType.LONG_FORM_ON_DEMAND, null);
    }

    public final void stopServices() {
        if (isInitialized()) {
            return;
        }
        synchronized (this.asyncInitTask) {
            try {
                if (isInitialized()) {
                    CoreModule coreModule = this.coreModule;
                    if (coreModule == null) {
                        zq3.z("coreModule");
                    }
                    coreModule.getServiceRegistry().close();
                    WorkerThreadModule workerThreadModule = this.workerThreadModule;
                    if (workerThreadModule == null) {
                        zq3.z("workerThreadModule");
                    }
                    workerThreadModule.close();
                    EssentialServiceModule essentialServiceModule = this.essentialServiceModule;
                    if (essentialServiceModule == null) {
                        zq3.z("essentialServiceModule");
                    }
                    essentialServiceModule.getProcessStateService().close();
                } else {
                    this.asyncInitTask.set(null);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void waitForAsyncInit() {
        waitForAsyncInit$default(this, 0L, null, 3, null);
    }

    public ModuleInitBootstrapper(InternalEmbraceLogger internalEmbraceLogger, InitModule initModule, OpenTelemetryModule openTelemetryModule, it2 it2Var, gt2 gt2Var, it2 it2Var2, ss2 ss2Var, it2 it2Var3, ts2 ts2Var, ot2 ot2Var, pt2 pt2Var, mt2 mt2Var, it2 it2Var4, gt2 gt2Var2, pt2 pt2Var2, ot2 ot2Var2, rs2 rs2Var, ws2 ws2Var, ts2 ts2Var2, rs2 rs2Var2) {
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(initModule, "initModule");
        zq3.h(openTelemetryModule, "openTelemetryModule");
        zq3.h(it2Var, "coreModuleSupplier");
        zq3.h(gt2Var, "systemServiceModuleSupplier");
        zq3.h(it2Var2, "androidServicesModuleSupplier");
        zq3.h(ss2Var, "workerThreadModuleSupplier");
        zq3.h(it2Var3, "storageModuleSupplier");
        zq3.h(ts2Var, "essentialServiceModuleSupplier");
        zq3.h(ot2Var, "dataSourceModuleSupplier");
        zq3.h(pt2Var, "dataCaptureServiceModuleSupplier");
        zq3.h(mt2Var, "deliveryModuleSupplier");
        zq3.h(it2Var4, "anrModuleSupplier");
        zq3.h(gt2Var2, "sdkObservabilityModuleSupplier");
        zq3.h(pt2Var2, "customerLogModuleSupplier");
        zq3.h(ot2Var2, "nativeModuleSupplier");
        zq3.h(rs2Var, "dataContainerModuleSupplier");
        zq3.h(ws2Var, "sessionModuleSupplier");
        zq3.h(ts2Var2, "crashModuleSupplier");
        zq3.h(rs2Var2, "payloadModuleSupplier");
        this.logger = internalEmbraceLogger;
        this.initModule = initModule;
        this.openTelemetryModule = openTelemetryModule;
        this.coreModuleSupplier = it2Var;
        this.systemServiceModuleSupplier = gt2Var;
        this.androidServicesModuleSupplier = it2Var2;
        this.workerThreadModuleSupplier = ss2Var;
        this.storageModuleSupplier = it2Var3;
        this.essentialServiceModuleSupplier = ts2Var;
        this.dataSourceModuleSupplier = ot2Var;
        this.dataCaptureServiceModuleSupplier = pt2Var;
        this.deliveryModuleSupplier = mt2Var;
        this.anrModuleSupplier = it2Var4;
        this.sdkObservabilityModuleSupplier = gt2Var2;
        this.customerLogModuleSupplier = pt2Var2;
        this.nativeModuleSupplier = ot2Var2;
        this.dataContainerModuleSupplier = rs2Var;
        this.sessionModuleSupplier = ws2Var;
        this.crashModuleSupplier = ts2Var2;
        this.payloadModuleSupplier = rs2Var2;
        this.asyncInitTask = new AtomicReference<>(null);
        this.synchronousInitCompletionMs = -1L;
        this.asyncInitCompletionMs = -1L;
    }

    public final boolean init(Context context, boolean z, Embrace.AppFramework appFramework, long j, String str) {
        return init$default(this, context, z, appFramework, j, str, null, null, 96, null);
    }

    public final void waitForAsyncInit(long j) {
        waitForAsyncInit$default(this, j, null, 2, null);
    }

    public final boolean init(Context context, boolean z, Embrace.AppFramework appFramework, long j, String str, qs2 qs2Var) {
        return init$default(this, context, z, appFramework, j, str, qs2Var, null, 64, null);
    }

    public final void waitForAsyncInit(long j, TimeUnit timeUnit) {
        zq3.h(timeUnit, "unit");
        try {
            Systrace.startSynchronous("async-init-wait");
            Future<?> future = this.asyncInitTask.get();
            if (future != null) {
                future.get(j, timeUnit);
            }
            Systrace.endSynchronous();
            try {
                Systrace.startSynchronous("record-delay");
                long j2 = this.synchronousInitCompletionMs;
                long max = Math.max(this.synchronousInitCompletionMs, this.asyncInitCompletionMs);
                if (j2 > 0) {
                    SpanService.DefaultImpls.recordCompletedSpan$default(this.openTelemetryModule.getSpanService(), "async-init-delay", j2, max, null, null, false, false, null, null, null, 1016, null);
                }
                ww8 ww8Var = ww8.a;
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final boolean init(final Context context, final boolean z, final Embrace.AppFramework appFramework, final long j, final String str, final qs2 qs2Var, final VersionChecker versionChecker) {
        AtomicReference<Future<?>> atomicReference;
        zq3.h(context, "context");
        zq3.h(appFramework, "appFramework");
        zq3.h(qs2Var, "configServiceProvider");
        zq3.h(versionChecker, "versionChecker");
        try {
            Systrace.startSynchronous("modules-init");
            boolean z2 = false;
            if (isInitialized()) {
                return false;
            }
            AtomicReference<Future<?>> atomicReference2 = this.asyncInitTask;
            synchronized (atomicReference2) {
                try {
                    if (isInitialized()) {
                        atomicReference = atomicReference2;
                    } else {
                        this.coreModule = (CoreModule) init(zt6.b(CoreModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public final CoreModule mo865invoke() {
                                it2 it2Var;
                                it2Var = ModuleInitBootstrapper.this.coreModuleSupplier;
                                return (CoreModule) it2Var.invoke(context, appFramework, ModuleInitBootstrapper.this.getLogger());
                            }
                        });
                        this.workerThreadModule = (WorkerThreadModule) init(zt6.b(WorkerThreadModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public final WorkerThreadModule mo865invoke() {
                                ss2 ss2Var;
                                ss2Var = ModuleInitBootstrapper.this.workerThreadModuleSupplier;
                                return (WorkerThreadModule) ss2Var.invoke(ModuleInitBootstrapper.this.getInitModule());
                            }
                        });
                        Future<?> future = (Future) postInit(zt6.b(OpenTelemetryModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public final Future<?> mo865invoke() {
                                return ModuleInitBootstrapper.this.getWorkerThreadModule().backgroundWorker(WorkerName.BACKGROUND_REGISTRATION).submit(TaskPriority.CRITICAL, new Runnable() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$3.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        try {
                                            Systrace.startSynchronous("span-service-init");
                                            ModuleInitBootstrapper.this.getOpenTelemetryModule().getSpanService().initializeService(j);
                                            ww8 ww8Var = ww8.a;
                                            Systrace.endSynchronous();
                                            ModuleInitBootstrapper moduleInitBootstrapper = ModuleInitBootstrapper.this;
                                            moduleInitBootstrapper.asyncInitCompletionMs = moduleInitBootstrapper.getInitModule().getClock().now();
                                        } finally {
                                        }
                                    }
                                });
                            }
                        });
                        CoreModule coreModule = this.coreModule;
                        if (coreModule == null) {
                            zq3.z("coreModule");
                        }
                        final ServiceRegistry serviceRegistry = coreModule.getServiceRegistry();
                        atomicReference = atomicReference2;
                        try {
                            postInit(zt6.b(OpenTelemetryModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    invoke();
                                    return ww8.a;
                                }

                                public final void invoke() {
                                    ServiceRegistry.this.registerService(this.getInitModule().getTelemetryService());
                                    ServiceRegistry.this.registerService(this.getOpenTelemetryModule().getSpanService());
                                }
                            });
                            this.systemServiceModule = (SystemServiceModule) init(zt6.b(SystemServiceModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public final SystemServiceModule mo865invoke() {
                                    gt2 gt2Var;
                                    gt2Var = ModuleInitBootstrapper.this.systemServiceModuleSupplier;
                                    return (SystemServiceModule) gt2Var.invoke(ModuleInitBootstrapper.this.getCoreModule(), versionChecker);
                                }
                            });
                            this.androidServicesModule = (AndroidServicesModule) init(zt6.b(AndroidServicesModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public final AndroidServicesModule mo865invoke() {
                                    it2 it2Var;
                                    it2Var = ModuleInitBootstrapper.this.androidServicesModuleSupplier;
                                    return (AndroidServicesModule) it2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getCoreModule(), ModuleInitBootstrapper.this.getWorkerThreadModule());
                                }
                            });
                            postInit(zt6.b(AndroidServicesModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    invoke();
                                    return ww8.a;
                                }

                                public final void invoke() {
                                    ServiceRegistry.this.registerService(this.getAndroidServicesModule().getPreferencesService());
                                }
                            });
                            this.storageModule = (StorageModule) init(zt6.b(StorageModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public final StorageModule mo865invoke() {
                                    it2 it2Var;
                                    it2Var = ModuleInitBootstrapper.this.storageModuleSupplier;
                                    return (StorageModule) it2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getCoreModule(), ModuleInitBootstrapper.this.getWorkerThreadModule());
                                }
                            });
                            this.essentialServiceModule = (EssentialServiceModule) init(zt6.b(EssentialServiceModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$9
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public final EssentialServiceModule mo865invoke() {
                                    ts2 ts2Var;
                                    ts2Var = ModuleInitBootstrapper.this.essentialServiceModuleSupplier;
                                    return (EssentialServiceModule) ts2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getOpenTelemetryModule(), ModuleInitBootstrapper.this.getCoreModule(), ModuleInitBootstrapper.this.getWorkerThreadModule(), ModuleInitBootstrapper.this.getSystemServiceModule(), ModuleInitBootstrapper.this.getAndroidServicesModule(), ModuleInitBootstrapper.this.getStorageModule(), str, Boolean.valueOf(z), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$9.1
                                        {
                                            super(0);
                                        }

                                        @Override // defpackage.qs2
                                        /* renamed from: invoke */
                                        public final DataSourceModule mo865invoke() {
                                            return ModuleInitBootstrapper.this.getDataSourceModule();
                                        }
                                    }, qs2Var);
                                }
                            });
                            postInit(zt6.b(EssentialServiceModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$10
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    invoke();
                                    return ww8.a;
                                }

                                public final void invoke() {
                                    ServiceRegistry.this.registerServices(this.getEssentialServiceModule().getProcessStateService(), this.getEssentialServiceModule().getMetadataService(), this.getEssentialServiceModule().getConfigService(), this.getEssentialServiceModule().getActivityLifecycleTracker(), this.getEssentialServiceModule().getNetworkConnectivityService(), this.getEssentialServiceModule().getUserService());
                                    NetworkBehavior networkBehavior = this.getEssentialServiceModule().getConfigService().getNetworkBehavior();
                                    if (networkBehavior.isNativeNetworkingMonitoringEnabled()) {
                                        HttpUrlConnectionTracker.registerFactory(networkBehavior.isRequestContentLengthCaptureEnabled());
                                    }
                                    this.getEssentialServiceModule().getMetadataService().precomputeValues();
                                }
                            });
                            this.dataSourceModule = (DataSourceModule) init(zt6.b(DataSourceModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$11
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public final DataSourceModule mo865invoke() {
                                    ot2 ot2Var;
                                    ot2Var = ModuleInitBootstrapper.this.dataSourceModuleSupplier;
                                    return (DataSourceModule) ot2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getCoreModule(), ModuleInitBootstrapper.this.getOpenTelemetryModule(), ModuleInitBootstrapper.this.getEssentialServiceModule(), ModuleInitBootstrapper.this.getSystemServiceModule(), ModuleInitBootstrapper.this.getAndroidServicesModule(), ModuleInitBootstrapper.this.getWorkerThreadModule());
                                }
                            });
                            this.dataCaptureServiceModule = (DataCaptureServiceModule) init(zt6.b(DataCaptureServiceModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$12
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public final DataCaptureServiceModule mo865invoke() {
                                    pt2 pt2Var;
                                    pt2Var = ModuleInitBootstrapper.this.dataCaptureServiceModuleSupplier;
                                    return (DataCaptureServiceModule) pt2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getOpenTelemetryModule(), ModuleInitBootstrapper.this.getCoreModule(), ModuleInitBootstrapper.this.getSystemServiceModule(), ModuleInitBootstrapper.this.getEssentialServiceModule(), ModuleInitBootstrapper.this.getWorkerThreadModule(), versionChecker, ModuleInitBootstrapper.this.getDataSourceModule());
                                }
                            });
                            try {
                                Systrace.startSynchronous("startup-tracker");
                                CoreModule coreModule2 = this.coreModule;
                                if (coreModule2 == null) {
                                    zq3.z("coreModule");
                                }
                                Application application = coreModule2.getApplication();
                                DataCaptureServiceModule dataCaptureServiceModule = this.dataCaptureServiceModule;
                                if (dataCaptureServiceModule == null) {
                                    zq3.z("dataCaptureServiceModule");
                                }
                                application.registerActivityLifecycleCallbacks(dataCaptureServiceModule.getStartupTracker());
                                ww8 ww8Var = ww8.a;
                                Systrace.endSynchronous();
                                postInit(zt6.b(DataCaptureServiceModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$13
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        invoke();
                                        return ww8.a;
                                    }

                                    public final void invoke() {
                                        ServiceRegistry.this.registerServices(this.getDataCaptureServiceModule().getWebviewService(), this.getDataCaptureServiceModule().getMemoryService(), this.getDataCaptureServiceModule().getComponentCallbackService(), this.getDataCaptureServiceModule().getBreadcrumbService(), this.getDataCaptureServiceModule().getPushNotificationService(), this.getDataCaptureServiceModule().getThermalStatusService());
                                    }
                                });
                                this.deliveryModule = (DeliveryModule) init(zt6.b(DeliveryModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$14
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public final DeliveryModule mo865invoke() {
                                        mt2 mt2Var;
                                        mt2Var = ModuleInitBootstrapper.this.deliveryModuleSupplier;
                                        return (DeliveryModule) mt2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getCoreModule(), ModuleInitBootstrapper.this.getWorkerThreadModule(), ModuleInitBootstrapper.this.getStorageModule(), ModuleInitBootstrapper.this.getEssentialServiceModule());
                                    }
                                });
                                postInit(zt6.b(DeliveryModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$15
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        invoke();
                                        return ww8.a;
                                    }

                                    public final void invoke() {
                                        ServiceRegistry.this.registerService(this.getDeliveryModule().getDeliveryService());
                                    }
                                });
                                this.anrModule = (AnrModule) init(zt6.b(AnrModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$16
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public final AnrModule mo865invoke() {
                                        it2 it2Var;
                                        it2Var = ModuleInitBootstrapper.this.anrModuleSupplier;
                                        return (AnrModule) it2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getEssentialServiceModule(), ModuleInitBootstrapper.this.getWorkerThreadModule());
                                    }
                                });
                                postInit(zt6.b(AnrModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$17
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        invoke();
                                        return ww8.a;
                                    }

                                    public final void invoke() {
                                        ServiceRegistry.this.registerServices(this.getAnrModule().getAnrService(), this.getAnrModule().getResponsivenessMonitorService());
                                        this.getAnrModule().getAnrService().finishInitialization(this.getEssentialServiceModule().getConfigService());
                                    }
                                });
                                this.sdkObservabilityModule = (SdkObservabilityModule) init(zt6.b(SdkObservabilityModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$18
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public final SdkObservabilityModule mo865invoke() {
                                        gt2 gt2Var;
                                        gt2Var = ModuleInitBootstrapper.this.sdkObservabilityModuleSupplier;
                                        return (SdkObservabilityModule) gt2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getEssentialServiceModule());
                                    }
                                });
                                postInit(zt6.b(SdkObservabilityModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$19
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        invoke();
                                        return ww8.a;
                                    }

                                    public final void invoke() {
                                        ServiceRegistry.this.registerService(this.getSdkObservabilityModule().getInternalErrorService());
                                        this.getInitModule().getLogger().addLoggerAction(this.getSdkObservabilityModule().getReportingLoggerAction());
                                    }
                                });
                                this.nativeModule = (NativeModule) init(zt6.b(NativeModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$20
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public final NativeModule mo865invoke() {
                                        ot2 ot2Var;
                                        ot2Var = ModuleInitBootstrapper.this.nativeModuleSupplier;
                                        return (NativeModule) ot2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getCoreModule(), ModuleInitBootstrapper.this.getStorageModule(), ModuleInitBootstrapper.this.getEssentialServiceModule(), ModuleInitBootstrapper.this.getDeliveryModule(), ModuleInitBootstrapper.this.getAndroidServicesModule(), ModuleInitBootstrapper.this.getWorkerThreadModule());
                                    }
                                });
                                postInit(zt6.b(NativeModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$21
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        invoke();
                                        return ww8.a;
                                    }

                                    public final void invoke() {
                                        NativeThreadSamplerService nativeThreadSamplerService;
                                        NdkService ndkService = this.getNativeModule().getNdkService();
                                        final long now = this.getInitModule().getClock().now();
                                        BackgroundWorker.submit$default(this.getWorkerThreadModule().backgroundWorker(WorkerName.SERVICE_INIT), (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$21.1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                SpanService.DefaultImpls.recordCompletedSpan$default(this.getOpenTelemetryModule().getSpanService(), "init-worker-schedule-delay", now, this.getInitModule().getClock().now(), null, null, false, false, null, null, null, 1016, null);
                                            }
                                        }, 1, (Object) null);
                                        ServiceRegistry.this.registerServices(ndkService, this.getNativeModule().getNativeThreadSamplerService());
                                        if (this.getEssentialServiceModule().getConfigService().getAutoDataCaptureBehavior().isNdkEnabled()) {
                                            this.getEssentialServiceModule().getSessionIdTracker().setNdkService(this.getNativeModule().getNdkService());
                                        }
                                        if (this.getNativeModule().getNativeThreadSamplerInstaller() == null || (nativeThreadSamplerService = this.getNativeModule().getNativeThreadSamplerService()) == null) {
                                            return;
                                        }
                                        nativeThreadSamplerService.setupNativeSampler();
                                        if (this.getCoreModule().getAppFramework() == Embrace.AppFramework.UNITY && EmbraceNativeThreadSamplerServiceKt.isUnityMainThread()) {
                                            try {
                                                if (this.getNativeModule().getNativeThreadSamplerInstaller() != null) {
                                                    NativeThreadSamplerInstaller nativeThreadSamplerInstaller = this.getNativeModule().getNativeThreadSamplerInstaller();
                                                    if (nativeThreadSamplerInstaller != null) {
                                                        nativeThreadSamplerInstaller.monitorCurrentThread(nativeThreadSamplerService, this.getEssentialServiceModule().getConfigService(), this.getAnrModule().getAnrService());
                                                    }
                                                } else {
                                                    this.getInitModule().getLogger().log("nativeThreadSamplerInstaller not started, cannot sample current thread", InternalEmbraceLogger.Severity.WARNING, null, false);
                                                }
                                            } catch (Throwable th) {
                                                this.getInitModule().getLogger().log("Failed to sample current thread during ANRs", InternalEmbraceLogger.Severity.ERROR, th, false);
                                            }
                                        }
                                    }
                                });
                                this.payloadModule = (PayloadModule) init(zt6.b(PayloadModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$22
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public final PayloadModule mo865invoke() {
                                        rs2 rs2Var;
                                        rs2Var = ModuleInitBootstrapper.this.payloadModuleSupplier;
                                        return (PayloadModule) rs2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getCoreModule(), ModuleInitBootstrapper.this.getAndroidServicesModule(), ModuleInitBootstrapper.this.getEssentialServiceModule(), ModuleInitBootstrapper.this.getSystemServiceModule(), ModuleInitBootstrapper.this.getWorkerThreadModule(), ModuleInitBootstrapper.this.getNativeModule(), ModuleInitBootstrapper.this.getOpenTelemetryModule(), ModuleInitBootstrapper.this.getSdkObservabilityModule(), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$22.1
                                            {
                                                super(0);
                                            }

                                            @Override // defpackage.qs2
                                            /* renamed from: invoke */
                                            public final SessionPropertiesService mo865invoke() {
                                                return ModuleInitBootstrapper.this.getSessionModule().getSessionPropertiesService();
                                            }
                                        });
                                    }
                                });
                                this.customerLogModule = (CustomerLogModule) init(zt6.b(CustomerLogModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$23
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public final CustomerLogModule mo865invoke() {
                                        pt2 pt2Var;
                                        pt2Var = ModuleInitBootstrapper.this.customerLogModuleSupplier;
                                        return (CustomerLogModule) pt2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getCoreModule(), ModuleInitBootstrapper.this.getOpenTelemetryModule(), ModuleInitBootstrapper.this.getAndroidServicesModule(), ModuleInitBootstrapper.this.getEssentialServiceModule(), ModuleInitBootstrapper.this.getDeliveryModule(), ModuleInitBootstrapper.this.getWorkerThreadModule(), ModuleInitBootstrapper.this.getPayloadModule());
                                    }
                                });
                                postInit(zt6.b(CustomerLogModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$24
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public final LogOrchestrator mo865invoke() {
                                        ServiceRegistry.this.registerServices(this.getCustomerLogModule().getLogMessageService(), this.getCustomerLogModule().getNetworkCaptureService(), this.getCustomerLogModule().getNetworkLoggingService());
                                        return this.getCustomerLogModule().getLogOrchestrator();
                                    }
                                });
                                this.dataContainerModule = (DataContainerModule) init(zt6.b(DataContainerModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$25
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public final DataContainerModule mo865invoke() {
                                        rs2 rs2Var;
                                        rs2Var = ModuleInitBootstrapper.this.dataContainerModuleSupplier;
                                        return (DataContainerModule) rs2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getOpenTelemetryModule(), ModuleInitBootstrapper.this.getWorkerThreadModule(), ModuleInitBootstrapper.this.getEssentialServiceModule(), ModuleInitBootstrapper.this.getDataCaptureServiceModule(), ModuleInitBootstrapper.this.getAnrModule(), ModuleInitBootstrapper.this.getCustomerLogModule(), ModuleInitBootstrapper.this.getDeliveryModule(), ModuleInitBootstrapper.this.getNativeModule(), Long.valueOf(j));
                                    }
                                });
                                postInit(zt6.b(NativeModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$26
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        invoke();
                                        return ww8.a;
                                    }

                                    public final void invoke() {
                                        ServiceRegistry.this.registerServices(this.getDataContainerModule().getPerformanceInfoService(), this.getDataContainerModule().getEventService());
                                    }
                                });
                                this.sessionModule = (SessionModule) init(zt6.b(SessionModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$27
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public final SessionModule mo865invoke() {
                                        ws2 ws2Var;
                                        ws2Var = ModuleInitBootstrapper.this.sessionModuleSupplier;
                                        return (SessionModule) ws2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getOpenTelemetryModule(), ModuleInitBootstrapper.this.getAndroidServicesModule(), ModuleInitBootstrapper.this.getEssentialServiceModule(), ModuleInitBootstrapper.this.getNativeModule(), ModuleInitBootstrapper.this.getDataContainerModule(), ModuleInitBootstrapper.this.getDeliveryModule(), ModuleInitBootstrapper.this.getDataCaptureServiceModule(), ModuleInitBootstrapper.this.getCustomerLogModule(), ModuleInitBootstrapper.this.getSdkObservabilityModule(), ModuleInitBootstrapper.this.getWorkerThreadModule(), ModuleInitBootstrapper.this.getDataSourceModule(), ModuleInitBootstrapper.this.getPayloadModule(), ModuleInitBootstrapper.this.getAnrModule());
                                    }
                                });
                                WorkerThreadModule workerThreadModule = this.workerThreadModule;
                                if (workerThreadModule == null) {
                                    zq3.z("workerThreadModule");
                                }
                                BackgroundWorker.submit$default(workerThreadModule.backgroundWorker(WorkerName.BACKGROUND_REGISTRATION), (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$28
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ModuleInitBootstrapper.this.getSessionModule().getSessionPropertiesService().populateCurrentSession();
                                    }
                                }, 1, (Object) null);
                                this.crashModule = (CrashModule) init(zt6.b(CrashModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$29
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public final CrashModule mo865invoke() {
                                        ts2 ts2Var;
                                        ts2Var = ModuleInitBootstrapper.this.crashModuleSupplier;
                                        return (CrashModule) ts2Var.invoke(ModuleInitBootstrapper.this.getInitModule(), ModuleInitBootstrapper.this.getCoreModule(), ModuleInitBootstrapper.this.getStorageModule(), ModuleInitBootstrapper.this.getEssentialServiceModule(), ModuleInitBootstrapper.this.getDeliveryModule(), ModuleInitBootstrapper.this.getNativeModule(), ModuleInitBootstrapper.this.getSessionModule(), ModuleInitBootstrapper.this.getAnrModule(), ModuleInitBootstrapper.this.getDataContainerModule(), ModuleInitBootstrapper.this.getAndroidServicesModule(), ModuleInitBootstrapper.this.getCustomerLogModule());
                                    }
                                });
                                postInit(zt6.b(CrashModule.class), new qs2() { // from class: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper$init$$inlined$synchronized$lambda$30
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        invoke();
                                        return ww8.a;
                                    }

                                    public final void invoke() {
                                        Thread.setDefaultUncaughtExceptionHandler(this.getCrashModule().getAutomaticVerificationExceptionHandler());
                                        ServiceRegistry.this.registerService(this.getCrashModule().getCrashService());
                                    }
                                });
                                serviceRegistry.closeRegistration();
                                EssentialServiceModule essentialServiceModule = this.essentialServiceModule;
                                if (essentialServiceModule == null) {
                                    zq3.z("essentialServiceModule");
                                }
                                serviceRegistry.registerActivityListeners(essentialServiceModule.getProcessStateService());
                                EssentialServiceModule essentialServiceModule2 = this.essentialServiceModule;
                                if (essentialServiceModule2 == null) {
                                    zq3.z("essentialServiceModule");
                                }
                                serviceRegistry.registerConfigListeners(essentialServiceModule2.getConfigService());
                                EssentialServiceModule essentialServiceModule3 = this.essentialServiceModule;
                                if (essentialServiceModule3 == null) {
                                    zq3.z("essentialServiceModule");
                                }
                                serviceRegistry.registerMemoryCleanerListeners(essentialServiceModule3.getMemoryCleanerService());
                                EssentialServiceModule essentialServiceModule4 = this.essentialServiceModule;
                                if (essentialServiceModule4 == null) {
                                    zq3.z("essentialServiceModule");
                                }
                                serviceRegistry.registerActivityLifecycleListeners(essentialServiceModule4.getActivityLifecycleTracker());
                                this.asyncInitTask.set(future);
                                this.synchronousInitCompletionMs = this.initModule.getClock().now();
                                z2 = true;
                            } finally {
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    return z2;
                } catch (Throwable th2) {
                    th = th2;
                    atomicReference = atomicReference2;
                }
            }
        } finally {
            Systrace.endSynchronous();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ModuleInitBootstrapper(io.embrace.android.embracesdk.logging.InternalEmbraceLogger r22, io.embrace.android.embracesdk.injection.InitModule r23, io.embrace.android.embracesdk.injection.OpenTelemetryModule r24, defpackage.it2 r25, defpackage.gt2 r26, defpackage.it2 r27, defpackage.ss2 r28, defpackage.it2 r29, defpackage.ts2 r30, defpackage.ot2 r31, defpackage.pt2 r32, defpackage.mt2 r33, defpackage.it2 r34, defpackage.gt2 r35, defpackage.pt2 r36, defpackage.ot2 r37, defpackage.rs2 r38, defpackage.ws2 r39, defpackage.ts2 r40, defpackage.rs2 r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.injection.ModuleInitBootstrapper.<init>(io.embrace.android.embracesdk.logging.InternalEmbraceLogger, io.embrace.android.embracesdk.injection.InitModule, io.embrace.android.embracesdk.injection.OpenTelemetryModule, it2, gt2, it2, ss2, it2, ts2, ot2, pt2, mt2, it2, gt2, pt2, ot2, rs2, ws2, ts2, rs2, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final <T> T init(vu3 vu3Var, qs2 qs2Var) {
        try {
            Systrace.startSynchronous(toSectionName(vu3Var) + "-init");
            return (T) qs2Var.mo865invoke();
        } finally {
        }
    }
}
