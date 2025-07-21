package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class AnrSampleList {
    private final List<AnrSample> samples;

    public AnrSampleList(@bt3(name = "ticks") List<AnrSample> list) {
        zq3.h(list, "samples");
        this.samples = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnrSampleList copy$default(AnrSampleList anrSampleList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = anrSampleList.samples;
        }
        return anrSampleList.copy(list);
    }

    public final List<AnrSample> component1() {
        return this.samples;
    }

    public final AnrSampleList copy(@bt3(name = "ticks") List<AnrSample> list) {
        zq3.h(list, "samples");
        return new AnrSampleList(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AnrSampleList) && zq3.c(this.samples, ((AnrSampleList) obj).samples);
        }
        return true;
    }

    public final List<AnrSample> getSamples() {
        return this.samples;
    }

    public int hashCode() {
        List<AnrSample> list = this.samples;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AnrSampleList(samples=" + this.samples + ")";
    }
}
