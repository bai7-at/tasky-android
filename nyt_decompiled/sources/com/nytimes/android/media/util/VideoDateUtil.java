package com.nytimes.android.media.util;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class VideoDateUtil {
    private VideoDateUtil() {
    }

    public static String getDurationString(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(j);
        return String.format(Locale.getDefault(), "%d:%02d", Long.valueOf(minutes), Long.valueOf(timeUnit.toSeconds(j) - TimeUnit.MINUTES.toSeconds(minutes)));
    }
}
