package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NativeThreadAnrSample {
    private final Integer result;
    private final Long sampleDurationMs;
    private final Long sampleTimestamp;
    private final List<NativeThreadAnrStackframe> stackframes;

    public NativeThreadAnrSample(@bt3(name = "r") Integer num, @bt3(name = "t") Long l, @bt3(name = "d") Long l2, @bt3(name = "s") List<NativeThreadAnrStackframe> list) {
        this.result = num;
        this.sampleTimestamp = l;
        this.sampleDurationMs = l2;
        this.stackframes = list;
    }

    public final Integer getResult() {
        return this.result;
    }

    public final Long getSampleDurationMs() {
        return this.sampleDurationMs;
    }

    public final Long getSampleTimestamp() {
        return this.sampleTimestamp;
    }

    public final List<NativeThreadAnrStackframe> getStackframes() {
        return this.stackframes;
    }
}
