package com.nytimes.android.media.util;

import com.nytimes.android.utils.TimeDuration;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class MediaDurationFormatter {
    private final Formatter formatter;
    private final StringBuilder timeFormatBuilder;

    public MediaDurationFormatter() {
        StringBuilder sb = new StringBuilder();
        this.timeFormatBuilder = sb;
        this.formatter = new Formatter(sb, Locale.getDefault());
    }

    public String stringForTime(TimeDuration timeDuration) {
        int d = (int) timeDuration.d(TimeUnit.SECONDS);
        int i = d % 60;
        int i2 = (d / 60) % 60;
        int i3 = d / 3600;
        this.timeFormatBuilder.setLength(0);
        return i3 > 0 ? this.formatter.format("%d:%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i)).toString().trim() : i2 < 10 ? this.formatter.format("%2d:%02d", Integer.valueOf(i2), Integer.valueOf(i)).toString().trim() : this.formatter.format("%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i)).toString().trim();
    }
}
