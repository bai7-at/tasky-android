package com.nytimes.android.utils;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ShareOrigin {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ShareOrigin[] $VALUES;
    private final String value;
    public static final ShareOrigin SECTION_FRONT = new ShareOrigin("SECTION_FRONT", 0, "section front");
    public static final ShareOrigin ARTICLE_FRONT = new ShareOrigin("ARTICLE_FRONT", 1, AssetConstants.ARTICLE_TYPE);
    public static final ShareOrigin AUDIO_CONTROLS = new ShareOrigin("AUDIO_CONTROLS", 2, "Audio Controls");
    public static final ShareOrigin NOTIFICATION_ACTIONS = new ShareOrigin("NOTIFICATION_ACTIONS", 3, "Notification Actions");
    public static final ShareOrigin RECENTLY_VIEWED = new ShareOrigin("RECENTLY_VIEWED", 4, "Recently Viewed");
    public static final ShareOrigin PROGRAM_VIEW = new ShareOrigin("PROGRAM_VIEW", 5, "homepage");
    public static final ShareOrigin FOLLOW_CHANNEL = new ShareOrigin("FOLLOW_CHANNEL", 6, AppsFlyerProperties.CHANNEL);
    public static final ShareOrigin FOLLOW = new ShareOrigin("FOLLOW", 7, "for you");
    public static final ShareOrigin YOU = new ShareOrigin("YOU", 8, "you tab");

    private static final /* synthetic */ ShareOrigin[] $values() {
        return new ShareOrigin[]{SECTION_FRONT, ARTICLE_FRONT, AUDIO_CONTROLS, NOTIFICATION_ACTIONS, RECENTLY_VIEWED, PROGRAM_VIEW, FOLLOW_CHANNEL, FOLLOW, YOU};
    }

    static {
        ShareOrigin[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ShareOrigin(String str, int i, String str2) {
        this.value = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ShareOrigin valueOf(String str) {
        return (ShareOrigin) Enum.valueOf(ShareOrigin.class, str);
    }

    public static ShareOrigin[] values() {
        return (ShareOrigin[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
