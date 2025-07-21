package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class AnrSample {
    public static final int CODE_DEFAULT = 0;
    public static final int CODE_SAMPLE_LIMIT_REACHED = 1;
    public static final Companion Companion = new Companion(null);
    private final Integer code;
    private final Long sampleOverheadMs;
    private final List<ThreadInfo> threads;
    private final long timestamp;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AnrSample(@bt3(name = "ts") long j, List<ThreadInfo> list, @bt3(name = "o") Long l, @bt3(name = "c") Integer num) {
        this.timestamp = j;
        this.threads = list;
        this.sampleOverheadMs = l;
        this.code = num;
    }

    public static /* synthetic */ AnrSample copy$default(AnrSample anrSample, long j, List list, Long l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = anrSample.timestamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            list = anrSample.threads;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            l = anrSample.sampleOverheadMs;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            num = anrSample.code;
        }
        return anrSample.copy(j2, list2, l2, num);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final List<ThreadInfo> component2() {
        return this.threads;
    }

    public final Long component3() {
        return this.sampleOverheadMs;
    }

    public final Integer component4() {
        return this.code;
    }

    public final AnrSample copy(@bt3(name = "ts") long j, List<ThreadInfo> list, @bt3(name = "o") Long l, @bt3(name = "c") Integer num) {
        return new AnrSample(j, list, l, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnrSample)) {
            return false;
        }
        AnrSample anrSample = (AnrSample) obj;
        return this.timestamp == anrSample.timestamp && zq3.c(this.threads, anrSample.threads) && zq3.c(this.sampleOverheadMs, anrSample.sampleOverheadMs) && zq3.c(this.code, anrSample.code);
    }

    public final Integer getCode() {
        return this.code;
    }

    public final Long getSampleOverheadMs() {
        return this.sampleOverheadMs;
    }

    public final List<ThreadInfo> getThreads() {
        return this.threads;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.timestamp) * 31;
        List<ThreadInfo> list = this.threads;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Long l = this.sampleOverheadMs;
        int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 31;
        Integer num = this.code;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AnrSample(timestamp=" + this.timestamp + ", threads=" + this.threads + ", sampleOverheadMs=" + this.sampleOverheadMs + ", code=" + this.code + ")";
    }

    public /* synthetic */ AnrSample(long j, List list, Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, l, (i & 8) != 0 ? 0 : num);
    }
}
