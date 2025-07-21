package io.embrace.android.embracesdk.payload.extensions;

import defpackage.zq3;
import io.embrace.android.embracesdk.payload.AnrInterval;
import io.embrace.android.embracesdk.payload.AnrSampleList;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class AnrIntervalExtKt {
    public static final AnrInterval clearSamples(AnrInterval anrInterval) {
        AnrInterval copy;
        zq3.h(anrInterval, "$this$clearSamples");
        copy = anrInterval.copy((r16 & 1) != 0 ? anrInterval.startTime : 0L, (r16 & 2) != 0 ? anrInterval.lastKnownTime : null, (r16 & 4) != 0 ? anrInterval.endTime : null, (r16 & 8) != 0 ? anrInterval.f82type : null, (r16 & 16) != 0 ? anrInterval.anrSampleList : null, (r16 & 32) != 0 ? anrInterval.code : 1);
        return copy;
    }

    public static final AnrInterval deepCopy(AnrInterval anrInterval) {
        zq3.h(anrInterval, "$this$deepCopy");
        AnrSampleList anrSampleList = anrInterval.getAnrSampleList();
        return new AnrInterval(anrInterval.getStartTime(), anrInterval.getLastKnownTime(), anrInterval.getEndTime(), anrInterval.getType(), anrSampleList == null ? null : anrSampleList.copy(i.a1(anrSampleList.getSamples())), anrInterval.getCode());
    }

    public static final long duration(AnrInterval anrInterval) {
        zq3.h(anrInterval, "$this$duration");
        Long endTime = anrInterval.getEndTime();
        if (endTime == null) {
            endTime = anrInterval.getLastKnownTime();
        }
        if (endTime == null) {
            return -1L;
        }
        return endTime.longValue() - anrInterval.getStartTime();
    }

    public static final boolean hasSamples(AnrInterval anrInterval) {
        zq3.h(anrInterval, "$this$hasSamples");
        Integer code = anrInterval.getCode();
        return code == null || code.intValue() != 1;
    }

    public static final int size(AnrInterval anrInterval) {
        zq3.h(anrInterval, "$this$size");
        AnrSampleList anrSampleList = anrInterval.getAnrSampleList();
        if (anrSampleList != null) {
            return AnrSampleListExtKt.size(anrSampleList);
        }
        return 0;
    }
}
