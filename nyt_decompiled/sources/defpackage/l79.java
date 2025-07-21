package defpackage;

import com.nytimes.android.ad.params.video.VideoAdParamKeys;
import com.nytimes.android.utils.TimeDuration;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class l79 {
    public VideoAdParamKeys a() {
        return VideoAdParamKeys.VIDEO_DURATION;
    }

    public String b(TimeDuration timeDuration) {
        zq3.h(timeDuration, "input");
        long d = timeDuration.d(TimeUnit.SECONDS);
        return d < 45 ? "short" : d < 60 ? "semishort" : d < 240 ? "medium" : "long";
    }
}
