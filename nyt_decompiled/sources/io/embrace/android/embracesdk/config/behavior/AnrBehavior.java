package io.embrace.android.embracesdk.config.behavior;

import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.local.AnrLocalConfig;
import io.embrace.android.embracesdk.config.remote.AnrRemoteConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.c;
import kotlin.collections.i;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class AnrBehavior extends MergedConfigBehavior<AnrLocalConfig, AnrRemoteConfig> {
    private static final boolean CAPTURE_GOOGLE_DEFAULT = false;
    private static final boolean DEFAULT_ANR_BG_PCT_ENABLED = false;
    private static final long DEFAULT_ANR_INTERVAL_MS = 100;
    private static final boolean DEFAULT_ANR_MAIN_THREAD_ONLY = true;
    private static final int DEFAULT_ANR_MAX_ANR_INTERVALS_PER_SESSION = 5;
    private static final int DEFAULT_ANR_MAX_PER_INTERVAL = 80;
    private static final int DEFAULT_ANR_MIN_CAPTURE_DURATION = 1000;
    private static final int DEFAULT_ANR_MIN_THREAD_PRIORITY_TO_CAPTURE = 0;
    private static final boolean DEFAULT_ANR_PCT_ENABLED = true;
    private static final long DEFAULT_ANR_PROCESS_ERRORS_DELAY_MS = 5000;
    private static final long DEFAULT_ANR_PROCESS_ERRORS_INTERVAL_MS = 1000;
    private static final boolean DEFAULT_ANR_PROCESS_ERRORS_PCT_ENABLED = false;
    private static final long DEFAULT_ANR_PROCESS_ERRORS_SCHEDULER_EXTRA_TIME_ALLOWANCE = 30000;
    private static final boolean DEFAULT_IDLE_HANDLER_ENABLED = false;
    private static final boolean DEFAULT_IGNORE_NATIVE_THREAD_ANR_SAMPLING_ALLOWLIST = true;
    private static final int DEFAULT_MONITOR_THREAD_PRIORITY = 0;
    private static final boolean DEFAULT_NATIVE_THREAD_ANR_OFFSET_ENABLED = true;
    private static final boolean DEFAULT_NATIVE_THREAD_ANR_SAMPLING_ENABLED = false;
    private static final int DEFAULT_NATIVE_THREAD_ANR_SAMPLING_FACTOR = 5;
    private static final int DEFAULT_STACKTRACE_FRAME_LIMIT = 100;
    private static final boolean DEFAULT_STRICT_MODE_LISTENER_ENABLED = false;
    private static final int DEFAULT_STRICT_MODE_VIOLATION_LIMIT = 25;
    private final c04 allowPatternList$delegate;
    private final c04 blockPatternList$delegate;
    public static final Companion Companion = new Companion(null);
    private static final List<AnrRemoteConfig.AllowedNdkSampleMethod> DEFAULT_NATIVE_THREAD_ANR_SAMPLING_ALLOWLIST = i.e(new AnrRemoteConfig.AllowedNdkSampleMethod("UnityPlayer", "pauseUnity"));

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnrBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var, qs2 qs2Var2) {
        super(behaviorThresholdCheck, qs2Var, qs2Var2);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "localSupplier");
        zq3.h(qs2Var2, "remoteSupplier");
        this.allowPatternList$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.config.behavior.AnrBehavior$allowPatternList$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final List<Pattern> mo865invoke() {
                List<String> allowList;
                AnrRemoteConfig remote = AnrBehavior.this.getRemote();
                if (remote == null || (allowList = remote.getAllowList()) == null) {
                    return i.l();
                }
                List<String> list = allowList;
                ArrayList arrayList = new ArrayList(i.w(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Pattern.compile((String) it2.next()));
                }
                return arrayList;
            }
        });
        this.blockPatternList$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.config.behavior.AnrBehavior$blockPatternList$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final List<Pattern> mo865invoke() {
                List<String> blockList;
                AnrRemoteConfig remote = AnrBehavior.this.getRemote();
                if (remote == null || (blockList = remote.getBlockList()) == null) {
                    return i.l();
                }
                List<String> list = blockList;
                ArrayList arrayList = new ArrayList(i.w(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Pattern.compile((String) it2.next()));
                }
                return arrayList;
            }
        });
    }

    public final List<Pattern> getAllowPatternList() {
        return (List) this.allowPatternList$delegate.getValue();
    }

    public final long getAnrProcessErrorsDelayMs() {
        Long anrProcessErrorsDelayMs;
        AnrRemoteConfig remote = getRemote();
        if (remote == null || (anrProcessErrorsDelayMs = remote.getAnrProcessErrorsDelayMs()) == null) {
            return 5000L;
        }
        return anrProcessErrorsDelayMs.longValue();
    }

    public final long getAnrProcessErrorsIntervalMs() {
        Long anrProcessErrorsIntervalMs;
        AnrRemoteConfig remote = getRemote();
        return (remote == null || (anrProcessErrorsIntervalMs = remote.getAnrProcessErrorsIntervalMs()) == null) ? DEFAULT_ANR_PROCESS_ERRORS_INTERVAL_MS : anrProcessErrorsIntervalMs.longValue();
    }

    public final long getAnrProcessErrorsSchedulerExtraTimeAllowanceMs() {
        Long anrProcessErrorsSchedulerExtraTimeAllowance;
        AnrRemoteConfig remote = getRemote();
        return (remote == null || (anrProcessErrorsSchedulerExtraTimeAllowance = remote.getAnrProcessErrorsSchedulerExtraTimeAllowance()) == null) ? DEFAULT_ANR_PROCESS_ERRORS_SCHEDULER_EXTRA_TIME_ALLOWANCE : anrProcessErrorsSchedulerExtraTimeAllowance.longValue();
    }

    public final List<Pattern> getBlockPatternList() {
        return (List) this.blockPatternList$delegate.getValue();
    }

    public final int getMaxAnrIntervalsPerSession() {
        Integer anrPerSession;
        AnrRemoteConfig remote = getRemote();
        if (remote == null || (anrPerSession = remote.getAnrPerSession()) == null) {
            return 5;
        }
        return anrPerSession.intValue();
    }

    public final int getMaxStacktracesPerInterval() {
        Integer maxStacktracesPerInterval;
        AnrRemoteConfig remote = getRemote();
        return (remote == null || (maxStacktracesPerInterval = remote.getMaxStacktracesPerInterval()) == null) ? DEFAULT_ANR_MAX_PER_INTERVAL : maxStacktracesPerInterval.intValue();
    }

    public final int getMinDuration() {
        Integer minDuration;
        AnrRemoteConfig remote = getRemote();
        if (remote == null || (minDuration = remote.getMinDuration()) == null) {
            return 1000;
        }
        return minDuration.intValue();
    }

    public final int getMinThreadPriority() {
        Integer minThreadPriority;
        AnrRemoteConfig remote = getRemote();
        if (remote == null || (minThreadPriority = remote.getMinThreadPriority()) == null) {
            return 0;
        }
        return minThreadPriority.intValue();
    }

    public final int getMonitorThreadPriority() {
        Integer monitorThreadPriority;
        AnrRemoteConfig remote = getRemote();
        if (remote == null || (monitorThreadPriority = remote.getMonitorThreadPriority()) == null) {
            return 0;
        }
        return monitorThreadPriority.intValue();
    }

    public final List<AnrRemoteConfig.AllowedNdkSampleMethod> getNativeThreadAnrSamplingAllowlist() {
        List<AnrRemoteConfig.AllowedNdkSampleMethod> nativeThreadAnrSamplingAllowlist;
        AnrRemoteConfig remote = getRemote();
        return (remote == null || (nativeThreadAnrSamplingAllowlist = remote.getNativeThreadAnrSamplingAllowlist()) == null) ? DEFAULT_NATIVE_THREAD_ANR_SAMPLING_ALLOWLIST : nativeThreadAnrSamplingAllowlist;
    }

    public final int getNativeThreadAnrSamplingFactor() {
        Integer nativeThreadAnrSamplingFactor;
        AnrRemoteConfig remote = getRemote();
        if (remote == null || (nativeThreadAnrSamplingFactor = remote.getNativeThreadAnrSamplingFactor()) == null) {
            return 5;
        }
        return nativeThreadAnrSamplingFactor.intValue();
    }

    public final long getNativeThreadAnrSamplingIntervalMs() {
        return getSamplingIntervalMs() * getNativeThreadAnrSamplingFactor();
    }

    public final AnrRemoteConfig.Unwinder getNativeThreadAnrSamplingUnwinder() {
        Object b;
        AnrRemoteConfig.Unwinder unwinder;
        try {
            Result.a aVar = Result.a;
            AnrRemoteConfig.Unwinder[] values = AnrRemoteConfig.Unwinder.values();
            int length = values.length;
            int i = 0;
            while (true) {
                unwinder = null;
                if (i >= length) {
                    break;
                }
                AnrRemoteConfig.Unwinder unwinder2 = values[i];
                String name = unwinder2.name();
                AnrRemoteConfig remote = getRemote();
                if (h.w(name, remote != null ? remote.getNativeThreadAnrSamplingUnwinder() : null, true)) {
                    unwinder = unwinder2;
                    break;
                }
                i++;
            }
            if (unwinder == null) {
                unwinder = AnrRemoteConfig.Unwinder.LIBUNWIND;
            }
            b = Result.b(unwinder);
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        AnrRemoteConfig.Unwinder unwinder3 = AnrRemoteConfig.Unwinder.LIBUNWIND;
        if (Result.g(b)) {
            b = unwinder3;
        }
        return (AnrRemoteConfig.Unwinder) b;
    }

    public final long getSamplingIntervalMs() {
        Long sampleIntervalMs;
        AnrRemoteConfig remote = getRemote();
        return (remote == null || (sampleIntervalMs = remote.getSampleIntervalMs()) == null) ? DEFAULT_ANR_INTERVAL_MS : sampleIntervalMs.longValue();
    }

    public final int getStacktraceFrameLimit() {
        Integer stacktraceFrameLimit;
        AnrRemoteConfig remote = getRemote();
        if (remote == null || (stacktraceFrameLimit = remote.getStacktraceFrameLimit()) == null) {
            return 100;
        }
        return stacktraceFrameLimit.intValue();
    }

    public final int getStrictModeViolationLimit() {
        Integer strictModeViolationLimit;
        AnrRemoteConfig remote = getRemote();
        if (remote == null || (strictModeViolationLimit = remote.getStrictModeViolationLimit()) == null) {
            return 25;
        }
        return strictModeViolationLimit.intValue();
    }

    public final boolean isAnrCaptureEnabled() {
        BehaviorThresholdCheck thresholdCheck = getThresholdCheck();
        AnrRemoteConfig remote = getRemote();
        Boolean isBehaviorEnabled = thresholdCheck.isBehaviorEnabled(remote != null ? remote.getPctEnabled() : null);
        if (isBehaviorEnabled != null) {
            return isBehaviorEnabled.booleanValue();
        }
        return true;
    }

    public final boolean isAnrProcessErrorsCaptureEnabled() {
        BehaviorThresholdCheck thresholdCheck = getThresholdCheck();
        AnrRemoteConfig remote = getRemote();
        Boolean isBehaviorEnabled = thresholdCheck.isBehaviorEnabled(remote != null ? remote.getPctAnrProcessErrorsEnabled() : null);
        if (isBehaviorEnabled != null) {
            return isBehaviorEnabled.booleanValue();
        }
        return false;
    }

    public final boolean isBgAnrCaptureEnabled() {
        BehaviorThresholdCheck thresholdCheck = getThresholdCheck();
        AnrRemoteConfig remote = getRemote();
        Boolean isBehaviorEnabled = thresholdCheck.isBehaviorEnabled(remote != null ? remote.getPctBgEnabled() : null);
        if (isBehaviorEnabled != null) {
            return isBehaviorEnabled.booleanValue();
        }
        return false;
    }

    public final boolean isGoogleAnrCaptureEnabled() {
        BehaviorThresholdCheck thresholdCheck = getThresholdCheck();
        AnrRemoteConfig remote = getRemote();
        Boolean bool = null;
        Boolean isBehaviorEnabled = thresholdCheck.isBehaviorEnabled(remote != null ? remote.getGooglePctEnabled() : null);
        if (isBehaviorEnabled == null) {
            AnrLocalConfig local = getLocal();
            if (local != null) {
                bool = local.getCaptureGoogle();
            }
        } else {
            bool = isBehaviorEnabled;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean isIdleHandlerEnabled() {
        BehaviorThresholdCheck thresholdCheck = getThresholdCheck();
        AnrRemoteConfig remote = getRemote();
        Boolean isBehaviorEnabled = thresholdCheck.isBehaviorEnabled(remote != null ? remote.getPctIdleHandlerEnabled() : null);
        if (isBehaviorEnabled != null) {
            return isBehaviorEnabled.booleanValue();
        }
        return false;
    }

    public final boolean isNativeThreadAnrSamplingAllowlistIgnored() {
        Boolean ignoreNativeThreadAnrSamplingAllowlist;
        AnrRemoteConfig remote = getRemote();
        if (remote == null || (ignoreNativeThreadAnrSamplingAllowlist = remote.getIgnoreNativeThreadAnrSamplingAllowlist()) == null) {
            return true;
        }
        return ignoreNativeThreadAnrSamplingAllowlist.booleanValue();
    }

    public final boolean isNativeThreadAnrSamplingEnabled() {
        BehaviorThresholdCheck thresholdCheck = getThresholdCheck();
        AnrRemoteConfig remote = getRemote();
        Boolean bool = null;
        Boolean isBehaviorEnabled = thresholdCheck.isBehaviorEnabled(remote != null ? remote.getPctNativeThreadAnrSamplingEnabled() : null);
        if (isBehaviorEnabled == null) {
            AnrLocalConfig local = getLocal();
            if (local != null) {
                bool = local.getCaptureUnityThread();
            }
        } else {
            bool = isBehaviorEnabled;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean isNativeThreadAnrSamplingOffsetEnabled() {
        Boolean nativeThreadAnrSamplingOffsetEnabled;
        AnrRemoteConfig remote = getRemote();
        if (remote == null || (nativeThreadAnrSamplingOffsetEnabled = remote.getNativeThreadAnrSamplingOffsetEnabled()) == null) {
            return true;
        }
        return nativeThreadAnrSamplingOffsetEnabled.booleanValue();
    }

    public final boolean isStrictModeListenerEnabled() {
        BehaviorThresholdCheck thresholdCheck = getThresholdCheck();
        AnrRemoteConfig remote = getRemote();
        Boolean isBehaviorEnabled = thresholdCheck.isBehaviorEnabled(remote != null ? remote.getPctStrictModeListenerEnabled() : null);
        if (isBehaviorEnabled != null) {
            return isBehaviorEnabled.booleanValue();
        }
        return false;
    }

    public final boolean shouldCaptureMainThreadOnly() {
        Boolean mainThreadOnly;
        AnrRemoteConfig remote = getRemote();
        if (remote == null || (mainThreadOnly = remote.getMainThreadOnly()) == null) {
            return true;
        }
        return mainThreadOnly.booleanValue();
    }
}
