package com.skydoves.balloon;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ArrowPositionRules {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ArrowPositionRules[] $VALUES;
    public static final ArrowPositionRules ALIGN_BALLOON = new ArrowPositionRules("ALIGN_BALLOON", 0);
    public static final ArrowPositionRules ALIGN_ANCHOR = new ArrowPositionRules("ALIGN_ANCHOR", 1);

    private static final /* synthetic */ ArrowPositionRules[] $values() {
        return new ArrowPositionRules[]{ALIGN_BALLOON, ALIGN_ANCHOR};
    }

    static {
        ArrowPositionRules[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ArrowPositionRules(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ArrowPositionRules valueOf(String str) {
        return (ArrowPositionRules) Enum.valueOf(ArrowPositionRules.class, str);
    }

    public static ArrowPositionRules[] values() {
        return (ArrowPositionRules[]) $VALUES.clone();
    }
}
