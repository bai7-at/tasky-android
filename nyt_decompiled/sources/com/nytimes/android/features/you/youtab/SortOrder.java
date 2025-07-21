package com.nytimes.android.features.you.youtab;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SortOrder {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ SortOrder[] $VALUES;
    private final String label;
    public static final SortOrder YOUR_ORDER = new SortOrder("YOUR_ORDER", 0, "Your Order");
    public static final SortOrder MOST_RECENT = new SortOrder("MOST_RECENT", 1, "Most Recent");

    private static final /* synthetic */ SortOrder[] $values() {
        return new SortOrder[]{YOUR_ORDER, MOST_RECENT};
    }

    static {
        SortOrder[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SortOrder(String str, int i, String str2) {
        this.label = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static SortOrder valueOf(String str) {
        return (SortOrder) Enum.valueOf(SortOrder.class, str);
    }

    public static SortOrder[] values() {
        return (SortOrder[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
