package com.nytimes.android.analytics.event.audio;

import defpackage.b22;
import kotlin.enums.a;
import kotlinx.coroutines.DebugKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AudioReferralSource {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AudioReferralSource[] $VALUES;
    private final String title;
    public static final AudioReferralSource SF_CARD = new AudioReferralSource("SF_CARD", 0, "SF Card");
    public static final AudioReferralSource ARTICLE = new AudioReferralSource("ARTICLE", 1, "Article");
    public static final AudioReferralSource CONTROLS = new AudioReferralSource("CONTROLS", 2, "Controls");
    public static final AudioReferralSource NOTIFICATION = new AudioReferralSource("NOTIFICATION", 3, "Notification");
    public static final AudioReferralSource INDICATOR = new AudioReferralSource("INDICATOR", 4, "Indicator");
    public static final AudioReferralSource AUTO = new AudioReferralSource("AUTO", 5, DebugKt.DEBUG_PROPERTY_VALUE_AUTO);

    private static final /* synthetic */ AudioReferralSource[] $values() {
        return new AudioReferralSource[]{SF_CARD, ARTICLE, CONTROLS, NOTIFICATION, INDICATOR, AUTO};
    }

    static {
        AudioReferralSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AudioReferralSource(String str, int i, String str2) {
        this.title = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AudioReferralSource valueOf(String str) {
        return (AudioReferralSource) Enum.valueOf(AudioReferralSource.class, str);
    }

    public static AudioReferralSource[] values() {
        return (AudioReferralSource[]) $VALUES.clone();
    }

    public String getTitle() {
        return this.title;
    }
}
