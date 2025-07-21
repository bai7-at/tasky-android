package com.nytimes.android.utils;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ImageCropConfig {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ImageCropConfig[] $VALUES;
    private final String resCropID;
    public static final ImageCropConfig SF_PACKAGE_VERTICAL_IMAGE = new ImageCropConfig("SF_PACKAGE_VERTICAL_IMAGE", 0, "sfPackageVertical");
    public static final ImageCropConfig SF_PACKAGE_HORIZONTAL_IMAGE = new ImageCropConfig("SF_PACKAGE_HORIZONTAL_IMAGE", 1, "sfPackageHorizontal");
    public static final ImageCropConfig SF_LEDE_VERTICAL_IMAGE = new ImageCropConfig("SF_LEDE_VERTICAL_IMAGE", 2, "sfLedeVertical");
    public static final ImageCropConfig SF_LEDE_HORIZONTAL_IMAGE = new ImageCropConfig("SF_LEDE_HORIZONTAL_IMAGE", 3, "sfLedeHorizontal");
    public static final ImageCropConfig SF_ARTICLE = new ImageCropConfig("SF_ARTICLE", 4, "sfArticle");
    public static final ImageCropConfig SF_LEDE_PHOTO_VIDEO = new ImageCropConfig("SF_LEDE_PHOTO_VIDEO", 5, "sfLedePhotoVideo");
    public static final ImageCropConfig SF_PHOTO_VIDEO = new ImageCropConfig("SF_PHOTO_VIDEO", 6, "sfPhotoVideo");
    public static final ImageCropConfig SF_VERTICAL_VIDEO = new ImageCropConfig("SF_VERTICAL_VIDEO", 7, "sfVerticalVideo");
    public static final ImageCropConfig SF_DAILY_BRIEFING = new ImageCropConfig("SF_DAILY_BRIEFING", 8, "sfDailyBriefing");
    public static final ImageCropConfig WIDGET_ARTICLE = new ImageCropConfig("WIDGET_ARTICLE", 9, "widgetArticle");
    public static final ImageCropConfig NOTIFICATION_THUMBNAIL = new ImageCropConfig("NOTIFICATION_THUMBNAIL", 10, "notificationThumbnail");
    public static final ImageCropConfig NOTIFICATION_IMAGE = new ImageCropConfig("NOTIFICATION_IMAGE", 11, "notificationImage");
    public static final ImageCropConfig AF_TOP_REGION = new ImageCropConfig("AF_TOP_REGION", 12, "afTopRegion");
    public static final ImageCropConfig AF_SMALL = new ImageCropConfig("AF_SMALL", 13, "afSmall");
    public static final ImageCropConfig AF_LARGE = new ImageCropConfig("AF_LARGE", 14, "afLarge");
    public static final ImageCropConfig AF_INTERACTIVE = new ImageCropConfig("AF_INTERACTIVE", 15, "afInteractive");
    public static final ImageCropConfig AF_COLUMNIST_PHOTO = new ImageCropConfig("AF_COLUMNIST_PHOTO", 16, "afColumnistPhoto");
    public static final ImageCropConfig FS_SLIDESHOW = new ImageCropConfig("FS_SLIDESHOW", 17, "fsSlideshow");

    private static final /* synthetic */ ImageCropConfig[] $values() {
        return new ImageCropConfig[]{SF_PACKAGE_VERTICAL_IMAGE, SF_PACKAGE_HORIZONTAL_IMAGE, SF_LEDE_VERTICAL_IMAGE, SF_LEDE_HORIZONTAL_IMAGE, SF_ARTICLE, SF_LEDE_PHOTO_VIDEO, SF_PHOTO_VIDEO, SF_VERTICAL_VIDEO, SF_DAILY_BRIEFING, WIDGET_ARTICLE, NOTIFICATION_THUMBNAIL, NOTIFICATION_IMAGE, AF_TOP_REGION, AF_SMALL, AF_LARGE, AF_INTERACTIVE, AF_COLUMNIST_PHOTO, FS_SLIDESHOW};
    }

    static {
        ImageCropConfig[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ImageCropConfig(String str, int i, String str2) {
        this.resCropID = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ImageCropConfig valueOf(String str) {
        return (ImageCropConfig) Enum.valueOf(ImageCropConfig.class, str);
    }

    public static ImageCropConfig[] values() {
        return (ImageCropConfig[]) $VALUES.clone();
    }

    public final String getResCropID() {
        return this.resCropID;
    }
}
