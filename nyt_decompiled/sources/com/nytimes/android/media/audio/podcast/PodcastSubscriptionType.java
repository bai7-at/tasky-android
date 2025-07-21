package com.nytimes.android.media.audio.podcast;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PodcastSubscriptionType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PodcastSubscriptionType[] $VALUES;
    public static final PodcastSubscriptionType NOT_SET = new PodcastSubscriptionType("NOT_SET", 0);
    public static final PodcastSubscriptionType GOOGLE = new PodcastSubscriptionType("GOOGLE", 1);
    public static final PodcastSubscriptionType APPLE = new PodcastSubscriptionType("APPLE", 2);
    public static final PodcastSubscriptionType RADIO_PUBLIC = new PodcastSubscriptionType("RADIO_PUBLIC", 3);

    private static final /* synthetic */ PodcastSubscriptionType[] $values() {
        return new PodcastSubscriptionType[]{NOT_SET, GOOGLE, APPLE, RADIO_PUBLIC};
    }

    static {
        PodcastSubscriptionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PodcastSubscriptionType(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PodcastSubscriptionType valueOf(String str) {
        return (PodcastSubscriptionType) Enum.valueOf(PodcastSubscriptionType.class, str);
    }

    public static PodcastSubscriptionType[] values() {
        return (PodcastSubscriptionType[]) $VALUES.clone();
    }
}
