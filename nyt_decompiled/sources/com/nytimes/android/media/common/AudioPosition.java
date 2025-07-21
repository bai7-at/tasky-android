package com.nytimes.android.media.common;

import defpackage.b22;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.DebugKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AudioPosition {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AudioPosition[] $VALUES;
    public static final a Companion;
    private final String title;
    public static final AudioPosition SECTION = new AudioPosition("SECTION", 0, "Section");
    public static final AudioPosition ARTICLE = new AudioPosition("ARTICLE", 1, "Article");
    public static final AudioPosition PODCAST = new AudioPosition("PODCAST", 2, "Podcast");
    public static final AudioPosition AUTO = new AudioPosition("AUTO", 3, DebugKt.DEBUG_PROPERTY_VALUE_AUTO);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AudioPosition a(String str) {
            AudioPosition audioPosition = AudioPosition.SECTION;
            if (zq3.c(str, audioPosition.getTitle())) {
                return audioPosition;
            }
            AudioPosition audioPosition2 = AudioPosition.ARTICLE;
            if (zq3.c(str, audioPosition2.getTitle())) {
                return audioPosition2;
            }
            AudioPosition audioPosition3 = AudioPosition.PODCAST;
            if (zq3.c(str, audioPosition3.getTitle())) {
                return audioPosition3;
            }
            AudioPosition audioPosition4 = AudioPosition.AUTO;
            if (zq3.c(str, audioPosition4.getTitle())) {
                return audioPosition4;
            }
            return null;
        }

        private a() {
        }
    }

    private static final /* synthetic */ AudioPosition[] $values() {
        return new AudioPosition[]{SECTION, ARTICLE, PODCAST, AUTO};
    }

    static {
        AudioPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private AudioPosition(String str, int i, String str2) {
        this.title = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AudioPosition valueOf(String str) {
        return (AudioPosition) Enum.valueOf(AudioPosition.class, str);
    }

    public static AudioPosition[] values() {
        return (AudioPosition[]) $VALUES.clone();
    }

    public String getTitle() {
        return this.title;
    }
}
