package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import io.embrace.android.embracesdk.config.remote.AnrRemoteConfig;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NativeThreadAnrInterval {
    private final Long id;
    private final String name;
    private final Integer priority;
    private final Long sampleOffsetMs;
    private final List<NativeThreadAnrSample> samples;
    private Integer state;
    private final Long threadBlockedTimestamp;
    private Integer unwinder;

    public NativeThreadAnrInterval(@bt3(name = "id") Long l, @bt3(name = "n") String str, @bt3(name = "p") Integer num, @bt3(name = "os") Long l2, @bt3(name = "t") Long l3, @bt3(name = "ss") List<NativeThreadAnrSample> list, ThreadState threadState, AnrRemoteConfig.Unwinder unwinder) {
        this.id = l;
        this.name = str;
        this.priority = num;
        this.sampleOffsetMs = l2;
        this.threadBlockedTimestamp = l3;
        this.samples = list;
        this.unwinder = unwinder != null ? Integer.valueOf(unwinder.getCode$embrace_android_sdk_release()) : null;
        this.state = threadState != null ? Integer.valueOf(threadState.getCode$embrace_android_sdk_release()) : null;
    }

    @bt3(name = "s")
    public static /* synthetic */ void getState$embrace_android_sdk_release$annotations() {
    }

    @bt3(name = "uw")
    public static /* synthetic */ void getUnwinder$embrace_android_sdk_release$annotations() {
    }

    public final Long getId$embrace_android_sdk_release() {
        return this.id;
    }

    public final String getName$embrace_android_sdk_release() {
        return this.name;
    }

    public final Integer getPriority$embrace_android_sdk_release() {
        return this.priority;
    }

    public final Long getSampleOffsetMs$embrace_android_sdk_release() {
        return this.sampleOffsetMs;
    }

    public final List<NativeThreadAnrSample> getSamples$embrace_android_sdk_release() {
        return this.samples;
    }

    public final Integer getState$embrace_android_sdk_release() {
        return this.state;
    }

    public final Long getThreadBlockedTimestamp$embrace_android_sdk_release() {
        return this.threadBlockedTimestamp;
    }

    public final Integer getUnwinder$embrace_android_sdk_release() {
        return this.unwinder;
    }

    public final void setState$embrace_android_sdk_release(Integer num) {
        this.state = num;
    }

    public final void setUnwinder$embrace_android_sdk_release(Integer num) {
        this.unwinder = num;
    }

    public /* synthetic */ NativeThreadAnrInterval(Long l, String str, Integer num, Long l2, Long l3, List list, ThreadState threadState, AnrRemoteConfig.Unwinder unwinder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, str, num, l2, l3, list, (i & 64) != 0 ? null : threadState, (i & 128) != 0 ? null : unwinder);
    }
}
