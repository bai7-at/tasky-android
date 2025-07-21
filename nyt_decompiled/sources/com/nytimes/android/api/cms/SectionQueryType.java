package com.nytimes.android.api.cms;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SectionQueryType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ SectionQueryType[] $VALUES;
    public static final SectionQueryType LEGACY_COLLECTION = new SectionQueryType("LEGACY_COLLECTION", 0);
    public static final SectionQueryType GENERIC_LEGACY_COLLECTION = new SectionQueryType("GENERIC_LEGACY_COLLECTION", 1);
    public static final SectionQueryType VIDEO_PLAY_LIST = new SectionQueryType("VIDEO_PLAY_LIST", 2);
    public static final SectionQueryType MOST_POPULAR_LIST = new SectionQueryType("MOST_POPULAR_LIST", 3);

    private static final /* synthetic */ SectionQueryType[] $values() {
        return new SectionQueryType[]{LEGACY_COLLECTION, GENERIC_LEGACY_COLLECTION, VIDEO_PLAY_LIST, MOST_POPULAR_LIST};
    }

    static {
        SectionQueryType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SectionQueryType(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static SectionQueryType valueOf(String str) {
        return (SectionQueryType) Enum.valueOf(SectionQueryType.class, str);
    }

    public static SectionQueryType[] values() {
        return (SectionQueryType[]) $VALUES.clone();
    }
}
