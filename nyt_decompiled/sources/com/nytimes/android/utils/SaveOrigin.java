package com.nytimes.android.utils;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SaveOrigin {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ SaveOrigin[] $VALUES;
    private final String value;
    public static final SaveOrigin ARTICLE_FRONT = new SaveOrigin("ARTICLE_FRONT", 0, AssetConstants.ARTICLE_TYPE);
    public static final SaveOrigin SECTION_FRONT = new SaveOrigin("SECTION_FRONT", 1, "section front");
    public static final SaveOrigin PROGRAM_VIEW = new SaveOrigin("PROGRAM_VIEW", 2, "homepage");
    public static final SaveOrigin FOLLOW = new SaveOrigin("FOLLOW", 3, "for you");
    public static final SaveOrigin FOLLOW_CHANNEL = new SaveOrigin("FOLLOW_CHANNEL", 4, AppsFlyerProperties.CHANNEL);
    public static final SaveOrigin RECENTLY_VIEWED = new SaveOrigin("RECENTLY_VIEWED", 5, "Recently Viewed");
    public static final SaveOrigin SAVES_HUB = new SaveOrigin("SAVES_HUB", 6, "saves hub");
    public static final SaveOrigin RECENTLY_VIEWED_HUB = new SaveOrigin("RECENTLY_VIEWED_HUB", 7, "RV hub");
    public static final SaveOrigin SHUFFLE_INTEREST = new SaveOrigin("SHUFFLE_INTEREST", 8, "shuffle");
    public static final SaveOrigin FILTER_INTEREST = new SaveOrigin("FILTER_INTEREST", 9, "filter");

    private static final /* synthetic */ SaveOrigin[] $values() {
        return new SaveOrigin[]{ARTICLE_FRONT, SECTION_FRONT, PROGRAM_VIEW, FOLLOW, FOLLOW_CHANNEL, RECENTLY_VIEWED, SAVES_HUB, RECENTLY_VIEWED_HUB, SHUFFLE_INTEREST, FILTER_INTEREST};
    }

    static {
        SaveOrigin[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SaveOrigin(String str, int i, String str2) {
        this.value = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static SaveOrigin valueOf(String str) {
        return (SaveOrigin) Enum.valueOf(SaveOrigin.class, str);
    }

    public static SaveOrigin[] values() {
        return (SaveOrigin[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
