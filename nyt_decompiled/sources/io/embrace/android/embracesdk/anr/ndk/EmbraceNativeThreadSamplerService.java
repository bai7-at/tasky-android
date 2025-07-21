package io.embrace.android.embracesdk.anr.ndk;

import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.config.behavior.AnrBehavior;
import io.embrace.android.embracesdk.config.remote.AnrRemoteConfig;
import io.embrace.android.embracesdk.internal.DeviceArchitecture;
import io.embrace.android.embracesdk.internal.SharedObjectLoader;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.NativeThreadAnrInterval;
import io.embrace.android.embracesdk.payload.NativeThreadAnrSample;
import io.embrace.android.embracesdk.payload.ThreadStateKt;
import io.embrace.android.embracesdk.worker.ScheduledWorker;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceNativeThreadSamplerService implements NativeThreadSamplerService {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_NATIVE_SAMPLES = 10;
    private final ConfigService configService;
    private int count;
    private final NdkDelegate delegate;
    private final DeviceArchitecture deviceArchitecture;
    private int factor;
    private boolean ignored;
    private List<NativeThreadAnrInterval> intervals;
    private final InternalEmbraceLogger logger;
    private final Random random;
    private boolean sampling;
    private final ScheduledWorker scheduledWorker;
    private final SharedObjectLoader sharedObjectLoader;
    private final c04 symbols;
    private Thread targetThread;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public interface NdkDelegate {
        List<NativeThreadAnrSample> finishSampling();

        boolean monitorCurrentThread();

        boolean setupNativeThreadSampler(boolean z);

        void startSampling(int i, long j);
    }

    public EmbraceNativeThreadSamplerService(ConfigService configService, c04 c04Var, InternalEmbraceLogger internalEmbraceLogger, ScheduledWorker scheduledWorker, DeviceArchitecture deviceArchitecture, SharedObjectLoader sharedObjectLoader) {
        this(configService, c04Var, null, internalEmbraceLogger, null, scheduledWorker, deviceArchitecture, sharedObjectLoader, 20, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchIntervals() {
        List<NativeThreadAnrSample> finishSampling;
        List<NativeThreadAnrSample> samples$embrace_android_sdk_release;
        NativeThreadAnrInterval currentInterval$embrace_android_sdk_release = getCurrentInterval$embrace_android_sdk_release();
        if (currentInterval$embrace_android_sdk_release == null || (finishSampling = this.delegate.finishSampling()) == null || (samples$embrace_android_sdk_release = currentInterval$embrace_android_sdk_release.getSamples$embrace_android_sdk_release()) == null) {
            return;
        }
        samples$embrace_android_sdk_release.clear();
        samples$embrace_android_sdk_release.addAll(finishSampling);
    }

    private final boolean shouldSkipNewSample(AnrBehavior anrBehavior) {
        return !this.configService.getAnrBehavior().isNativeThreadAnrSamplingEnabled() || this.intervals.size() >= anrBehavior.getMaxAnrIntervalsPerSession();
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        this.intervals = new ArrayList();
    }

    public final boolean containsAllowedStackframes$embrace_android_sdk_release(AnrBehavior anrBehavior, StackTraceElement[] stackTraceElementArr) {
        zq3.h(anrBehavior, "anrBehavior");
        zq3.h(stackTraceElementArr, "stacktrace");
        if (anrBehavior.isNativeThreadAnrSamplingAllowlistIgnored()) {
            return true;
        }
        List<AnrRemoteConfig.AllowedNdkSampleMethod> nativeThreadAnrSamplingAllowlist = anrBehavior.getNativeThreadAnrSamplingAllowlist();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            List<AnrRemoteConfig.AllowedNdkSampleMethod> list = nativeThreadAnrSamplingAllowlist;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (AnrRemoteConfig.AllowedNdkSampleMethod allowedNdkSampleMethod : list) {
                    if (zq3.c(stackTraceElement.getMethodName(), allowedNdkSampleMethod.getMethod()) && zq3.c(stackTraceElement.getClassName(), allowedNdkSampleMethod.getClz())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerService
    public List<NativeThreadAnrInterval> getCapturedIntervals(Boolean bool) {
        if (!this.configService.getAnrBehavior().isNativeThreadAnrSamplingEnabled()) {
            return null;
        }
        if (this.sampling && zq3.c(bool, Boolean.FALSE)) {
            fetchIntervals();
        }
        List X0 = i.X0(this.intervals);
        ArrayList arrayList = new ArrayList();
        for (Object obj : X0) {
            List<NativeThreadAnrSample> samples$embrace_android_sdk_release = ((NativeThreadAnrInterval) obj).getSamples$embrace_android_sdk_release();
            if (samples$embrace_android_sdk_release != null && !samples$embrace_android_sdk_release.isEmpty()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return i.X0(arrayList);
    }

    public final int getCount$embrace_android_sdk_release() {
        return this.count;
    }

    public final NativeThreadAnrInterval getCurrentInterval$embrace_android_sdk_release() {
        return (NativeThreadAnrInterval) i.y0(this.intervals);
    }

    public final int getFactor$embrace_android_sdk_release() {
        return this.factor;
    }

    public final boolean getIgnored$embrace_android_sdk_release() {
        return this.ignored;
    }

    public final List<NativeThreadAnrInterval> getIntervals$embrace_android_sdk_release() {
        return this.intervals;
    }

    @Override // io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerService
    public Map<String, String> getNativeSymbols() {
        return (Map) this.symbols.getValue();
    }

    public final boolean getSampling$embrace_android_sdk_release() {
        return this.sampling;
    }

    @Override // io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerService
    public boolean monitorCurrentThread() {
        Thread currentThread = Thread.currentThread();
        zq3.g(currentThread, "Thread.currentThread()");
        this.targetThread = currentThread;
        return this.delegate.monitorCurrentThread();
    }

    @Override // io.embrace.android.embracesdk.anr.BlockedThreadListener
    public void onThreadBlocked(Thread thread, long j) {
        zq3.h(thread, "thread");
        AnrBehavior anrBehavior = this.configService.getAnrBehavior();
        StackTraceElement[] stackTrace = this.targetThread.getStackTrace();
        zq3.g(stackTrace, "targetThread.stackTrace");
        boolean containsAllowedStackframes$embrace_android_sdk_release = containsAllowedStackframes$embrace_android_sdk_release(anrBehavior, stackTrace);
        this.ignored = !containsAllowedStackframes$embrace_android_sdk_release;
        if (!containsAllowedStackframes$embrace_android_sdk_release || shouldSkipNewSample(anrBehavior)) {
            this.ignored = true;
            return;
        }
        AnrRemoteConfig.Unwinder nativeThreadAnrSamplingUnwinder = anrBehavior.getNativeThreadAnrSamplingUnwinder();
        int nativeThreadAnrSamplingFactor = anrBehavior.getNativeThreadAnrSamplingFactor();
        this.factor = nativeThreadAnrSamplingFactor;
        int nextInt = this.random.nextInt(nativeThreadAnrSamplingFactor);
        int i = this.factor;
        this.count = (i - nextInt) % i;
        List<NativeThreadAnrInterval> list = this.intervals;
        Long valueOf = Long.valueOf(this.targetThread.getId());
        String name = this.targetThread.getName();
        Integer valueOf2 = Integer.valueOf(this.targetThread.getPriority());
        Long valueOf3 = Long.valueOf(nextInt * anrBehavior.getSamplingIntervalMs());
        Long valueOf4 = Long.valueOf(j);
        ArrayList arrayList = new ArrayList();
        Thread.State state = this.targetThread.getState();
        zq3.g(state, "targetThread.state");
        list.add(new NativeThreadAnrInterval(valueOf, name, valueOf2, valueOf3, valueOf4, arrayList, ThreadStateKt.mapThreadState(state), nativeThreadAnrSamplingUnwinder));
    }

    @Override // io.embrace.android.embracesdk.anr.BlockedThreadListener
    public void onThreadBlockedInterval(Thread thread, long j) {
        zq3.h(thread, "thread");
        if (this.count >= this.configService.getAnrBehavior().getMaxStacktracesPerInterval()) {
            this.logger.log("ANR stacktrace not captured. Maximum allowed ticks per ANR interval reached.", InternalEmbraceLogger.Severity.DEBUG, null, true);
            return;
        }
        if (this.ignored || !this.configService.getAnrBehavior().isNativeThreadAnrSamplingEnabled()) {
            return;
        }
        if (this.count % this.factor == 0) {
            this.count = 0;
            if (!this.sampling) {
                this.sampling = true;
                AnrBehavior anrBehavior = this.configService.getAnrBehavior();
                AnrRemoteConfig.Unwinder nativeThreadAnrSamplingUnwinder = anrBehavior.getNativeThreadAnrSamplingUnwinder();
                long nativeThreadAnrSamplingIntervalMs = anrBehavior.getNativeThreadAnrSamplingIntervalMs();
                this.delegate.startSampling(nativeThreadAnrSamplingUnwinder.getCode$embrace_android_sdk_release(), nativeThreadAnrSamplingIntervalMs);
                ScheduledWorker scheduledWorker = this.scheduledWorker;
                final EmbraceNativeThreadSamplerService$onThreadBlockedInterval$1 embraceNativeThreadSamplerService$onThreadBlockedInterval$1 = new EmbraceNativeThreadSamplerService$onThreadBlockedInterval$1(this);
                scheduledWorker.schedule(new Runnable() { // from class: io.embrace.android.embracesdk.anr.ndk.EmbraceNativeThreadSamplerServiceKt$sam$java_lang_Runnable$0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zq3.g(qs2.this.mo865invoke(), "invoke(...)");
                    }
                }, nativeThreadAnrSamplingIntervalMs * 10, TimeUnit.MILLISECONDS);
            }
        }
        this.count++;
    }

    @Override // io.embrace.android.embracesdk.anr.BlockedThreadListener
    public void onThreadUnblocked(Thread thread, long j) {
        zq3.h(thread, "thread");
        if (this.sampling) {
            this.scheduledWorker.submit(new Runnable() { // from class: io.embrace.android.embracesdk.anr.ndk.EmbraceNativeThreadSamplerService$onThreadUnblocked$1
                @Override // java.lang.Runnable
                public final void run() {
                    EmbraceNativeThreadSamplerService.this.fetchIntervals();
                }
            });
        }
        this.ignored = true;
        this.sampling = false;
    }

    public final void setCount$embrace_android_sdk_release(int i) {
        this.count = i;
    }

    public final void setFactor$embrace_android_sdk_release(int i) {
        this.factor = i;
    }

    public final void setIgnored$embrace_android_sdk_release(boolean z) {
        this.ignored = z;
    }

    public final void setIntervals$embrace_android_sdk_release(List<NativeThreadAnrInterval> list) {
        zq3.h(list, "<set-?>");
        this.intervals = list;
    }

    public final void setSampling$embrace_android_sdk_release(boolean z) {
        this.sampling = z;
    }

    @Override // io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerService
    public boolean setupNativeSampler() {
        if (this.sharedObjectLoader.loadEmbraceNative()) {
            return this.delegate.setupNativeThreadSampler(this.deviceArchitecture.is32BitDevice());
        }
        this.logger.log("Embrace native binary load failed. Native thread sampler setup aborted.", InternalEmbraceLogger.Severity.WARNING, null, false);
        return false;
    }

    public EmbraceNativeThreadSamplerService(ConfigService configService, c04 c04Var, Random random, InternalEmbraceLogger internalEmbraceLogger, ScheduledWorker scheduledWorker, DeviceArchitecture deviceArchitecture, SharedObjectLoader sharedObjectLoader) {
        this(configService, c04Var, random, internalEmbraceLogger, null, scheduledWorker, deviceArchitecture, sharedObjectLoader, 16, null);
    }

    public EmbraceNativeThreadSamplerService(ConfigService configService, c04 c04Var, Random random, InternalEmbraceLogger internalEmbraceLogger, NdkDelegate ndkDelegate, ScheduledWorker scheduledWorker, DeviceArchitecture deviceArchitecture, SharedObjectLoader sharedObjectLoader) {
        zq3.h(configService, "configService");
        zq3.h(c04Var, "symbols");
        zq3.h(random, "random");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(ndkDelegate, "delegate");
        zq3.h(scheduledWorker, "scheduledWorker");
        zq3.h(deviceArchitecture, "deviceArchitecture");
        zq3.h(sharedObjectLoader, "sharedObjectLoader");
        this.configService = configService;
        this.symbols = c04Var;
        this.random = random;
        this.logger = internalEmbraceLogger;
        this.delegate = ndkDelegate;
        this.scheduledWorker = scheduledWorker;
        this.deviceArchitecture = deviceArchitecture;
        this.sharedObjectLoader = sharedObjectLoader;
        this.ignored = true;
        this.count = -1;
        this.factor = -1;
        this.intervals = new ArrayList();
        Thread currentThread = Thread.currentThread();
        zq3.g(currentThread, "Thread.currentThread()");
        this.targetThread = currentThread;
    }

    public /* synthetic */ EmbraceNativeThreadSamplerService(ConfigService configService, c04 c04Var, Random random, InternalEmbraceLogger internalEmbraceLogger, NdkDelegate ndkDelegate, ScheduledWorker scheduledWorker, DeviceArchitecture deviceArchitecture, SharedObjectLoader sharedObjectLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(configService, c04Var, (i & 4) != 0 ? new Random() : random, internalEmbraceLogger, (i & 16) != 0 ? new NativeThreadSamplerNdkDelegate() : ndkDelegate, scheduledWorker, deviceArchitecture, sharedObjectLoader);
    }
}
