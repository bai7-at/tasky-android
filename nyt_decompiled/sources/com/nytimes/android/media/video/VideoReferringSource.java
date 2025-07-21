package com.nytimes.android.media.video;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class VideoReferringSource {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ VideoReferringSource[] $VALUES;
    private final String title;
    public static final VideoReferringSource SECTION_FRONT = new VideoReferringSource("SECTION_FRONT", 0, "section front");
    public static final VideoReferringSource HOMEPAGE = new VideoReferringSource("HOMEPAGE", 1, "Homepage");
    public static final VideoReferringSource ARTICLE_FRONT = new VideoReferringSource("ARTICLE_FRONT", 2, "article front");

    private static final /* synthetic */ VideoReferringSource[] $values() {
        return new VideoReferringSource[]{SECTION_FRONT, HOMEPAGE, ARTICLE_FRONT};
    }

    static {
        VideoReferringSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private VideoReferringSource(String str, int i, String str2) {
        this.title = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static VideoReferringSource valueOf(String str) {
        return (VideoReferringSource) Enum.valueOf(VideoReferringSource.class, str);
    }

    public static VideoReferringSource[] values() {
        return (VideoReferringSource[]) $VALUES.clone();
    }

    public String getTitle() {
        return this.title;
    }
}
