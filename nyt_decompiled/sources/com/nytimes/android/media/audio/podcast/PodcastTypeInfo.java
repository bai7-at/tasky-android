package com.nytimes.android.media.audio.podcast;

import android.graphics.Color;
import defpackage.b22;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PodcastTypeInfo {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PodcastTypeInfo[] $VALUES;
    public static final a Companion;
    private final String bannerColorHex;
    private final int inverseColor;
    private final String previewUrl;
    public static final PodcastTypeInfo DAILY = new PodcastTypeInfo("DAILY", 0, "#ff006cbb", -1, null);
    public static final PodcastTypeInfo BOOK_REVIEW = new PodcastTypeInfo("BOOK_REVIEW", 1, "#ffdfeded", -16777216, null);
    public static final PodcastTypeInfo CHANGE_AGENT = new PodcastTypeInfo("CHANGE_AGENT", 2, "#ffe9e9eb", -16777216, null);
    public static final PodcastTypeInfo DEAR_SUGARS = new PodcastTypeInfo("DEAR_SUGARS", 3, "#ff85d3d4", -1, null);
    public static final PodcastTypeInfo CALIPHATE = new PodcastTypeInfo("CALIPHATE", 4, "#ff3d3a2d", -1, "https://www.nytimes.com/interactive/2018/podcasts/caliphate-isis-rukmini-callimachi.html");
    public static final PodcastTypeInfo INSIDE_THE_TIMES = new PodcastTypeInfo("INSIDE_THE_TIMES", 5, "#ffbcc3bf", -1, null);
    public static final PodcastTypeInfo MODERN_LOVE = new PodcastTypeInfo("MODERN_LOVE", 6, "#ffeceadd", -16777216, null);
    public static final PodcastTypeInfo POP_CAST = new PodcastTypeInfo("POP_CAST", 7, "#ff040807", -1, null);
    public static final PodcastTypeInfo THE_ARGUMENT = new PodcastTypeInfo("THE_ARGUMENT", 8, "#ffDFD5CC", -16777216, null);
    public static final PodcastTypeInfo THE_NEW_WASHINGTON = new PodcastTypeInfo("THE_NEW_WASHINGTON", 9, "#ff144a9d", -1, null);
    public static final PodcastTypeInfo THE_RUN_UP = new PodcastTypeInfo("THE_RUN_UP", 10, "#ffeceded", -16777216, null);
    public static final PodcastTypeInfo STILL_PROCESSING = new PodcastTypeInfo("STILL_PROCESSING", 11, "#ff6ab9d4", -1, null);
    public static final PodcastTypeInfo THE_CHOICE = new PodcastTypeInfo("THE_CHOICE", 12, "#ff506A8F", -1, null);
    public static final PodcastTypeInfo TOGETHER_APART = new PodcastTypeInfo("TOGETHER_APART", 13, "#ff310185", -1, null);
    public static final PodcastTypeInfo SUGAR_CALLING = new PodcastTypeInfo("SUGAR_CALLING", 14, "#FF16537E", -1, null);
    public static final PodcastTypeInfo DEFAULT = new PodcastTypeInfo("DEFAULT", 15, "#FF000000", -1, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PodcastTypeInfo a(String str) {
            zq3.h(str, "title");
            return h.N(str, "daily", true) ? PodcastTypeInfo.DAILY : h.N(str, "book review", true) ? PodcastTypeInfo.BOOK_REVIEW : h.N(str, "change agent", true) ? PodcastTypeInfo.CHANGE_AGENT : h.N(str, "dear sugars", true) ? PodcastTypeInfo.DEAR_SUGARS : h.N(str, "caliphate", true) ? PodcastTypeInfo.CALIPHATE : h.N(str, "inside", true) ? PodcastTypeInfo.INSIDE_THE_TIMES : h.N(str, "modern love", true) ? PodcastTypeInfo.MODERN_LOVE : h.N(str, "popcast", true) ? PodcastTypeInfo.POP_CAST : h.N(str, "argument", true) ? PodcastTypeInfo.THE_ARGUMENT : h.N(str, "washington", true) ? PodcastTypeInfo.THE_NEW_WASHINGTON : h.N(str, "run up", true) ? PodcastTypeInfo.THE_RUN_UP : h.N(str, "still processing", true) ? PodcastTypeInfo.STILL_PROCESSING : h.N(str, "choice", true) ? PodcastTypeInfo.THE_CHOICE : h.N(str, "together", true) ? PodcastTypeInfo.TOGETHER_APART : h.N(str, "sugar calling", true) ? PodcastTypeInfo.SUGAR_CALLING : PodcastTypeInfo.DEFAULT;
        }

        private a() {
        }
    }

    private static final /* synthetic */ PodcastTypeInfo[] $values() {
        return new PodcastTypeInfo[]{DAILY, BOOK_REVIEW, CHANGE_AGENT, DEAR_SUGARS, CALIPHATE, INSIDE_THE_TIMES, MODERN_LOVE, POP_CAST, THE_ARGUMENT, THE_NEW_WASHINGTON, THE_RUN_UP, STILL_PROCESSING, THE_CHOICE, TOGETHER_APART, SUGAR_CALLING, DEFAULT};
    }

    static {
        PodcastTypeInfo[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private PodcastTypeInfo(String str, int i, String str2, int i2, String str3) {
        this.bannerColorHex = str2;
        this.inverseColor = i2;
        this.previewUrl = str3;
    }

    public static final PodcastTypeInfo from(String str) {
        return Companion.a(str);
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PodcastTypeInfo valueOf(String str) {
        return (PodcastTypeInfo) Enum.valueOf(PodcastTypeInfo.class, str);
    }

    public static PodcastTypeInfo[] values() {
        return (PodcastTypeInfo[]) $VALUES.clone();
    }

    public final int getBannerColor() {
        return Color.parseColor(this.bannerColorHex);
    }

    public final int getInverseColor() {
        return this.inverseColor;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }
}
