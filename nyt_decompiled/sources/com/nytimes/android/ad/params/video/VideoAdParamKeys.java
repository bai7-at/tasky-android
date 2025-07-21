package com.nytimes.android.ad.params.video;

import com.nytimes.android.api.cms.AssetConstants;
import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VideoAdParamKeys {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ VideoAdParamKeys[] $VALUES;
    private final String key;
    public static final VideoAdParamKeys POS = new VideoAdParamKeys("POS", 0, "pos");
    public static final VideoAdParamKeys AUTOPLAY = new VideoAdParamKeys("AUTOPLAY", 1, "autoplay");
    public static final VideoAdParamKeys NOADS = new VideoAdParamKeys("NOADS", 2, AssetConstants.NO_ADS);
    public static final VideoAdParamKeys ABRA_DFP = new VideoAdParamKeys("ABRA_DFP", 3, "abra_dfp");
    public static final VideoAdParamKeys VIDEO_DURATION = new VideoAdParamKeys("VIDEO_DURATION", 4, "viddur");
    public static final VideoAdParamKeys SECTION = new VideoAdParamKeys("SECTION", 5, "section");
    public static final VideoAdParamKeys SUBSECTION = new VideoAdParamKeys("SUBSECTION", 6, "subsection");
    public static final VideoAdParamKeys ID = new VideoAdParamKeys("ID", 7, "id");
    public static final VideoAdParamKeys VIDID = new VideoAdParamKeys("VIDID", 8, "vidid");

    private static final /* synthetic */ VideoAdParamKeys[] $values() {
        return new VideoAdParamKeys[]{POS, AUTOPLAY, NOADS, ABRA_DFP, VIDEO_DURATION, SECTION, SUBSECTION, ID, VIDID};
    }

    static {
        VideoAdParamKeys[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private VideoAdParamKeys(String str, int i, String str2) {
        this.key = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static VideoAdParamKeys valueOf(String str) {
        return (VideoAdParamKeys) Enum.valueOf(VideoAdParamKeys.class, str);
    }

    public static VideoAdParamKeys[] values() {
        return (VideoAdParamKeys[]) $VALUES.clone();
    }

    public String asString() {
        return this.key;
    }
}
