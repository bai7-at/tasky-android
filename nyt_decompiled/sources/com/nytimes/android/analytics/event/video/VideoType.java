package com.nytimes.android.analytics.event.video;

import androidx.annotation.Keep;
import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: classes2.dex */
public final class VideoType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ VideoType[] $VALUES;
    private final String title;
    public static final VideoType VIDEO_360 = new VideoType("VIDEO_360", 0, "360");
    public static final VideoType CONTENT = new VideoType("CONTENT", 1, "content");

    private static final /* synthetic */ VideoType[] $values() {
        return new VideoType[]{VIDEO_360, CONTENT};
    }

    static {
        VideoType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private VideoType(String str, int i, String str2) {
        this.title = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static VideoType valueOf(String str) {
        return (VideoType) Enum.valueOf(VideoType.class, str);
    }

    public static VideoType[] values() {
        return (VideoType[]) $VALUES.clone();
    }

    public String getTitle() {
        return this.title;
    }
}
