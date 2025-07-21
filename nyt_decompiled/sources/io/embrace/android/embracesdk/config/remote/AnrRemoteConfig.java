package io.embrace.android.embracesdk.config.remote;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class AnrRemoteConfig {
    private final List<String> allowList;
    private final Integer anrPerSession;
    private final Long anrProcessErrorsDelayMs;
    private final Long anrProcessErrorsIntervalMs;
    private final Long anrProcessErrorsSchedulerExtraTimeAllowance;
    private final List<String> blockList;
    private final Integer googlePctEnabled;
    private final Boolean ignoreNativeThreadAnrSamplingAllowlist;
    private final Boolean mainThreadOnly;
    private final Integer maxStacktracesPerInterval;
    private final Integer minDuration;
    private final Integer minThreadPriority;
    private final Integer monitorThreadPriority;
    private final List<AllowedNdkSampleMethod> nativeThreadAnrSamplingAllowlist;
    private final Integer nativeThreadAnrSamplingFactor;
    private final Boolean nativeThreadAnrSamplingOffsetEnabled;
    private final String nativeThreadAnrSamplingUnwinder;
    private final Integer pctAnrProcessErrorsEnabled;
    private final Integer pctBgEnabled;
    private final Integer pctEnabled;
    private final Float pctIdleHandlerEnabled;
    private final Float pctNativeThreadAnrSamplingEnabled;
    private final Float pctStrictModeListenerEnabled;
    private final Long sampleIntervalMs;
    private final Integer stacktraceFrameLimit;
    private final Integer strictModeViolationLimit;

    @et3(generateAdapter = true)
    public static final class AllowedNdkSampleMethod {
        private final String clz;
        private final String method;

        /* JADX WARN: Multi-variable type inference failed */
        public AllowedNdkSampleMethod() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final String getClz() {
            return this.clz;
        }

        public final String getMethod() {
            return this.method;
        }

        public AllowedNdkSampleMethod(@bt3(name = "c") String str, @bt3(name = "m") String str2) {
            this.clz = str;
            this.method = str2;
        }

        public /* synthetic */ AllowedNdkSampleMethod(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    public enum Unwinder {
        LIBUNWIND(0),
        LIBUNWINDSTACK(1);

        private final int code;

        Unwinder(int i) {
            this.code = i;
        }

        public final int getCode$embrace_android_sdk_release() {
            return this.code;
        }
    }

    public AnrRemoteConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }

    public final Integer component1() {
        return this.pctEnabled;
    }

    public final Integer component10() {
        return this.anrPerSession;
    }

    public final Boolean component11() {
        return this.mainThreadOnly;
    }

    public final Integer component12() {
        return this.minThreadPriority;
    }

    public final Integer component13() {
        return this.minDuration;
    }

    public final List<String> component14() {
        return this.allowList;
    }

    public final List<String> component15() {
        return this.blockList;
    }

    public final Integer component16() {
        return this.nativeThreadAnrSamplingFactor;
    }

    public final String component17() {
        return this.nativeThreadAnrSamplingUnwinder;
    }

    public final Float component18() {
        return this.pctNativeThreadAnrSamplingEnabled;
    }

    public final Boolean component19() {
        return this.nativeThreadAnrSamplingOffsetEnabled;
    }

    public final Integer component2() {
        return this.pctAnrProcessErrorsEnabled;
    }

    public final Float component20() {
        return this.pctIdleHandlerEnabled;
    }

    public final Float component21() {
        return this.pctStrictModeListenerEnabled;
    }

    public final Integer component22() {
        return this.strictModeViolationLimit;
    }

    public final Boolean component23() {
        return this.ignoreNativeThreadAnrSamplingAllowlist;
    }

    public final List<AllowedNdkSampleMethod> component24() {
        return this.nativeThreadAnrSamplingAllowlist;
    }

    public final Integer component25() {
        return this.googlePctEnabled;
    }

    public final Integer component26() {
        return this.monitorThreadPriority;
    }

    public final Integer component3() {
        return this.pctBgEnabled;
    }

    public final Long component4() {
        return this.sampleIntervalMs;
    }

    public final Long component5() {
        return this.anrProcessErrorsIntervalMs;
    }

    public final Long component6() {
        return this.anrProcessErrorsDelayMs;
    }

    public final Long component7() {
        return this.anrProcessErrorsSchedulerExtraTimeAllowance;
    }

    public final Integer component8() {
        return this.maxStacktracesPerInterval;
    }

    public final Integer component9() {
        return this.stacktraceFrameLimit;
    }

    public final AnrRemoteConfig copy(@bt3(name = "pct_enabled") Integer num, @bt3(name = "pct_pe_enabled") Integer num2, @bt3(name = "pct_bg_enabled") Integer num3, @bt3(name = "interval") Long l, @bt3(name = "anr_pe_interval") Long l2, @bt3(name = "anr_pe_delay") Long l3, @bt3(name = "anr_pe_sc_extra_time") Long l4, @bt3(name = "per_interval") Integer num4, @bt3(name = "max_depth") Integer num5, @bt3(name = "per_session") Integer num6, @bt3(name = "main_thread_only") Boolean bool, @bt3(name = "priority") Integer num7, @bt3(name = "min_duration") Integer num8, @bt3(name = "white_list") List<String> list, @bt3(name = "black_list") List<String> list2, @bt3(name = "unity_ndk_sampling_factor") Integer num9, @bt3(name = "unity_ndk_sampling_unwinder") String str, @bt3(name = "pct_unity_thread_capture_enabled") Float f, @bt3(name = "ndk_sampling_offset_enabled") Boolean bool2, @bt3(name = "pct_idle_handler_enabled") Float f2, @bt3(name = "pct_strictmode_listener_enabled") Float f3, @bt3(name = "strictmode_violation_limit") Integer num10, @bt3(name = "ignore_unity_ndk_sampling_allowlist") Boolean bool3, @bt3(name = "unity_ndk_sampling_allowlist") List<AllowedNdkSampleMethod> list3, @bt3(name = "google_pct_enabled") Integer num11, @bt3(name = "monitor_thread_priority") Integer num12) {
        return new AnrRemoteConfig(num, num2, num3, l, l2, l3, l4, num4, num5, num6, bool, num7, num8, list, list2, num9, str, f, bool2, f2, f3, num10, bool3, list3, num11, num12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnrRemoteConfig)) {
            return false;
        }
        AnrRemoteConfig anrRemoteConfig = (AnrRemoteConfig) obj;
        return zq3.c(this.pctEnabled, anrRemoteConfig.pctEnabled) && zq3.c(this.pctAnrProcessErrorsEnabled, anrRemoteConfig.pctAnrProcessErrorsEnabled) && zq3.c(this.pctBgEnabled, anrRemoteConfig.pctBgEnabled) && zq3.c(this.sampleIntervalMs, anrRemoteConfig.sampleIntervalMs) && zq3.c(this.anrProcessErrorsIntervalMs, anrRemoteConfig.anrProcessErrorsIntervalMs) && zq3.c(this.anrProcessErrorsDelayMs, anrRemoteConfig.anrProcessErrorsDelayMs) && zq3.c(this.anrProcessErrorsSchedulerExtraTimeAllowance, anrRemoteConfig.anrProcessErrorsSchedulerExtraTimeAllowance) && zq3.c(this.maxStacktracesPerInterval, anrRemoteConfig.maxStacktracesPerInterval) && zq3.c(this.stacktraceFrameLimit, anrRemoteConfig.stacktraceFrameLimit) && zq3.c(this.anrPerSession, anrRemoteConfig.anrPerSession) && zq3.c(this.mainThreadOnly, anrRemoteConfig.mainThreadOnly) && zq3.c(this.minThreadPriority, anrRemoteConfig.minThreadPriority) && zq3.c(this.minDuration, anrRemoteConfig.minDuration) && zq3.c(this.allowList, anrRemoteConfig.allowList) && zq3.c(this.blockList, anrRemoteConfig.blockList) && zq3.c(this.nativeThreadAnrSamplingFactor, anrRemoteConfig.nativeThreadAnrSamplingFactor) && zq3.c(this.nativeThreadAnrSamplingUnwinder, anrRemoteConfig.nativeThreadAnrSamplingUnwinder) && zq3.c(this.pctNativeThreadAnrSamplingEnabled, anrRemoteConfig.pctNativeThreadAnrSamplingEnabled) && zq3.c(this.nativeThreadAnrSamplingOffsetEnabled, anrRemoteConfig.nativeThreadAnrSamplingOffsetEnabled) && zq3.c(this.pctIdleHandlerEnabled, anrRemoteConfig.pctIdleHandlerEnabled) && zq3.c(this.pctStrictModeListenerEnabled, anrRemoteConfig.pctStrictModeListenerEnabled) && zq3.c(this.strictModeViolationLimit, anrRemoteConfig.strictModeViolationLimit) && zq3.c(this.ignoreNativeThreadAnrSamplingAllowlist, anrRemoteConfig.ignoreNativeThreadAnrSamplingAllowlist) && zq3.c(this.nativeThreadAnrSamplingAllowlist, anrRemoteConfig.nativeThreadAnrSamplingAllowlist) && zq3.c(this.googlePctEnabled, anrRemoteConfig.googlePctEnabled) && zq3.c(this.monitorThreadPriority, anrRemoteConfig.monitorThreadPriority);
    }

    public final List<String> getAllowList() {
        return this.allowList;
    }

    public final Integer getAnrPerSession() {
        return this.anrPerSession;
    }

    public final Long getAnrProcessErrorsDelayMs() {
        return this.anrProcessErrorsDelayMs;
    }

    public final Long getAnrProcessErrorsIntervalMs() {
        return this.anrProcessErrorsIntervalMs;
    }

    public final Long getAnrProcessErrorsSchedulerExtraTimeAllowance() {
        return this.anrProcessErrorsSchedulerExtraTimeAllowance;
    }

    public final List<String> getBlockList() {
        return this.blockList;
    }

    public final Integer getGooglePctEnabled() {
        return this.googlePctEnabled;
    }

    public final Boolean getIgnoreNativeThreadAnrSamplingAllowlist() {
        return this.ignoreNativeThreadAnrSamplingAllowlist;
    }

    public final Boolean getMainThreadOnly() {
        return this.mainThreadOnly;
    }

    public final Integer getMaxStacktracesPerInterval() {
        return this.maxStacktracesPerInterval;
    }

    public final Integer getMinDuration() {
        return this.minDuration;
    }

    public final Integer getMinThreadPriority() {
        return this.minThreadPriority;
    }

    public final Integer getMonitorThreadPriority() {
        return this.monitorThreadPriority;
    }

    public final List<AllowedNdkSampleMethod> getNativeThreadAnrSamplingAllowlist() {
        return this.nativeThreadAnrSamplingAllowlist;
    }

    public final Integer getNativeThreadAnrSamplingFactor() {
        return this.nativeThreadAnrSamplingFactor;
    }

    public final Boolean getNativeThreadAnrSamplingOffsetEnabled() {
        return this.nativeThreadAnrSamplingOffsetEnabled;
    }

    public final String getNativeThreadAnrSamplingUnwinder() {
        return this.nativeThreadAnrSamplingUnwinder;
    }

    public final Integer getPctAnrProcessErrorsEnabled() {
        return this.pctAnrProcessErrorsEnabled;
    }

    public final Integer getPctBgEnabled() {
        return this.pctBgEnabled;
    }

    public final Integer getPctEnabled() {
        return this.pctEnabled;
    }

    public final Float getPctIdleHandlerEnabled() {
        return this.pctIdleHandlerEnabled;
    }

    public final Float getPctNativeThreadAnrSamplingEnabled() {
        return this.pctNativeThreadAnrSamplingEnabled;
    }

    public final Float getPctStrictModeListenerEnabled() {
        return this.pctStrictModeListenerEnabled;
    }

    public final Long getSampleIntervalMs() {
        return this.sampleIntervalMs;
    }

    public final Integer getStacktraceFrameLimit() {
        return this.stacktraceFrameLimit;
    }

    public final Integer getStrictModeViolationLimit() {
        return this.strictModeViolationLimit;
    }

    public int hashCode() {
        Integer num = this.pctEnabled;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.pctAnrProcessErrorsEnabled;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.pctBgEnabled;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Long l = this.sampleIntervalMs;
        int hashCode4 = (hashCode3 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.anrProcessErrorsIntervalMs;
        int hashCode5 = (hashCode4 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.anrProcessErrorsDelayMs;
        int hashCode6 = (hashCode5 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.anrProcessErrorsSchedulerExtraTimeAllowance;
        int hashCode7 = (hashCode6 + (l4 != null ? l4.hashCode() : 0)) * 31;
        Integer num4 = this.maxStacktracesPerInterval;
        int hashCode8 = (hashCode7 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.stacktraceFrameLimit;
        int hashCode9 = (hashCode8 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Integer num6 = this.anrPerSession;
        int hashCode10 = (hashCode9 + (num6 != null ? num6.hashCode() : 0)) * 31;
        Boolean bool = this.mainThreadOnly;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num7 = this.minThreadPriority;
        int hashCode12 = (hashCode11 + (num7 != null ? num7.hashCode() : 0)) * 31;
        Integer num8 = this.minDuration;
        int hashCode13 = (hashCode12 + (num8 != null ? num8.hashCode() : 0)) * 31;
        List<String> list = this.allowList;
        int hashCode14 = (hashCode13 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.blockList;
        int hashCode15 = (hashCode14 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Integer num9 = this.nativeThreadAnrSamplingFactor;
        int hashCode16 = (hashCode15 + (num9 != null ? num9.hashCode() : 0)) * 31;
        String str = this.nativeThreadAnrSamplingUnwinder;
        int hashCode17 = (hashCode16 + (str != null ? str.hashCode() : 0)) * 31;
        Float f = this.pctNativeThreadAnrSamplingEnabled;
        int hashCode18 = (hashCode17 + (f != null ? f.hashCode() : 0)) * 31;
        Boolean bool2 = this.nativeThreadAnrSamplingOffsetEnabled;
        int hashCode19 = (hashCode18 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Float f2 = this.pctIdleHandlerEnabled;
        int hashCode20 = (hashCode19 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.pctStrictModeListenerEnabled;
        int hashCode21 = (hashCode20 + (f3 != null ? f3.hashCode() : 0)) * 31;
        Integer num10 = this.strictModeViolationLimit;
        int hashCode22 = (hashCode21 + (num10 != null ? num10.hashCode() : 0)) * 31;
        Boolean bool3 = this.ignoreNativeThreadAnrSamplingAllowlist;
        int hashCode23 = (hashCode22 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        List<AllowedNdkSampleMethod> list3 = this.nativeThreadAnrSamplingAllowlist;
        int hashCode24 = (hashCode23 + (list3 != null ? list3.hashCode() : 0)) * 31;
        Integer num11 = this.googlePctEnabled;
        int hashCode25 = (hashCode24 + (num11 != null ? num11.hashCode() : 0)) * 31;
        Integer num12 = this.monitorThreadPriority;
        return hashCode25 + (num12 != null ? num12.hashCode() : 0);
    }

    public String toString() {
        return "AnrRemoteConfig(pctEnabled=" + this.pctEnabled + ", pctAnrProcessErrorsEnabled=" + this.pctAnrProcessErrorsEnabled + ", pctBgEnabled=" + this.pctBgEnabled + ", sampleIntervalMs=" + this.sampleIntervalMs + ", anrProcessErrorsIntervalMs=" + this.anrProcessErrorsIntervalMs + ", anrProcessErrorsDelayMs=" + this.anrProcessErrorsDelayMs + ", anrProcessErrorsSchedulerExtraTimeAllowance=" + this.anrProcessErrorsSchedulerExtraTimeAllowance + ", maxStacktracesPerInterval=" + this.maxStacktracesPerInterval + ", stacktraceFrameLimit=" + this.stacktraceFrameLimit + ", anrPerSession=" + this.anrPerSession + ", mainThreadOnly=" + this.mainThreadOnly + ", minThreadPriority=" + this.minThreadPriority + ", minDuration=" + this.minDuration + ", allowList=" + this.allowList + ", blockList=" + this.blockList + ", nativeThreadAnrSamplingFactor=" + this.nativeThreadAnrSamplingFactor + ", nativeThreadAnrSamplingUnwinder=" + this.nativeThreadAnrSamplingUnwinder + ", pctNativeThreadAnrSamplingEnabled=" + this.pctNativeThreadAnrSamplingEnabled + ", nativeThreadAnrSamplingOffsetEnabled=" + this.nativeThreadAnrSamplingOffsetEnabled + ", pctIdleHandlerEnabled=" + this.pctIdleHandlerEnabled + ", pctStrictModeListenerEnabled=" + this.pctStrictModeListenerEnabled + ", strictModeViolationLimit=" + this.strictModeViolationLimit + ", ignoreNativeThreadAnrSamplingAllowlist=" + this.ignoreNativeThreadAnrSamplingAllowlist + ", nativeThreadAnrSamplingAllowlist=" + this.nativeThreadAnrSamplingAllowlist + ", googlePctEnabled=" + this.googlePctEnabled + ", monitorThreadPriority=" + this.monitorThreadPriority + ")";
    }

    public AnrRemoteConfig(@bt3(name = "pct_enabled") Integer num, @bt3(name = "pct_pe_enabled") Integer num2, @bt3(name = "pct_bg_enabled") Integer num3, @bt3(name = "interval") Long l, @bt3(name = "anr_pe_interval") Long l2, @bt3(name = "anr_pe_delay") Long l3, @bt3(name = "anr_pe_sc_extra_time") Long l4, @bt3(name = "per_interval") Integer num4, @bt3(name = "max_depth") Integer num5, @bt3(name = "per_session") Integer num6, @bt3(name = "main_thread_only") Boolean bool, @bt3(name = "priority") Integer num7, @bt3(name = "min_duration") Integer num8, @bt3(name = "white_list") List<String> list, @bt3(name = "black_list") List<String> list2, @bt3(name = "unity_ndk_sampling_factor") Integer num9, @bt3(name = "unity_ndk_sampling_unwinder") String str, @bt3(name = "pct_unity_thread_capture_enabled") Float f, @bt3(name = "ndk_sampling_offset_enabled") Boolean bool2, @bt3(name = "pct_idle_handler_enabled") Float f2, @bt3(name = "pct_strictmode_listener_enabled") Float f3, @bt3(name = "strictmode_violation_limit") Integer num10, @bt3(name = "ignore_unity_ndk_sampling_allowlist") Boolean bool3, @bt3(name = "unity_ndk_sampling_allowlist") List<AllowedNdkSampleMethod> list3, @bt3(name = "google_pct_enabled") Integer num11, @bt3(name = "monitor_thread_priority") Integer num12) {
        this.pctEnabled = num;
        this.pctAnrProcessErrorsEnabled = num2;
        this.pctBgEnabled = num3;
        this.sampleIntervalMs = l;
        this.anrProcessErrorsIntervalMs = l2;
        this.anrProcessErrorsDelayMs = l3;
        this.anrProcessErrorsSchedulerExtraTimeAllowance = l4;
        this.maxStacktracesPerInterval = num4;
        this.stacktraceFrameLimit = num5;
        this.anrPerSession = num6;
        this.mainThreadOnly = bool;
        this.minThreadPriority = num7;
        this.minDuration = num8;
        this.allowList = list;
        this.blockList = list2;
        this.nativeThreadAnrSamplingFactor = num9;
        this.nativeThreadAnrSamplingUnwinder = str;
        this.pctNativeThreadAnrSamplingEnabled = f;
        this.nativeThreadAnrSamplingOffsetEnabled = bool2;
        this.pctIdleHandlerEnabled = f2;
        this.pctStrictModeListenerEnabled = f3;
        this.strictModeViolationLimit = num10;
        this.ignoreNativeThreadAnrSamplingAllowlist = bool3;
        this.nativeThreadAnrSamplingAllowlist = list3;
        this.googlePctEnabled = num11;
        this.monitorThreadPriority = num12;
    }

    public /* synthetic */ AnrRemoteConfig(Integer num, Integer num2, Integer num3, Long l, Long l2, Long l3, Long l4, Integer num4, Integer num5, Integer num6, Boolean bool, Integer num7, Integer num8, List list, List list2, Integer num9, String str, Float f, Boolean bool2, Float f2, Float f3, Integer num10, Boolean bool3, List list3, Integer num11, Integer num12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : l4, (i & 128) != 0 ? null : num4, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : num5, (i & 512) != 0 ? null : num6, (i & 1024) != 0 ? null : bool, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : num7, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : num8, (i & 8192) != 0 ? null : list, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list2, (i & 32768) != 0 ? null : num9, (i & 65536) != 0 ? null : str, (i & 131072) != 0 ? null : f, (i & 262144) != 0 ? null : bool2, (i & 524288) != 0 ? null : f2, (i & Constants.MB) != 0 ? null : f3, (i & 2097152) != 0 ? null : num10, (i & 4194304) != 0 ? null : bool3, (i & 8388608) != 0 ? null : list3, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num11, (i & 33554432) != 0 ? null : num12);
    }
}
