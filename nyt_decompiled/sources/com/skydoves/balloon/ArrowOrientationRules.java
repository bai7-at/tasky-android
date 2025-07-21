package com.skydoves.balloon;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ArrowOrientationRules {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ArrowOrientationRules[] $VALUES;
    public static final ArrowOrientationRules ALIGN_ANCHOR = new ArrowOrientationRules("ALIGN_ANCHOR", 0);
    public static final ArrowOrientationRules ALIGN_FIXED = new ArrowOrientationRules("ALIGN_FIXED", 1);

    private static final /* synthetic */ ArrowOrientationRules[] $values() {
        return new ArrowOrientationRules[]{ALIGN_ANCHOR, ALIGN_FIXED};
    }

    static {
        ArrowOrientationRules[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ArrowOrientationRules(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ArrowOrientationRules valueOf(String str) {
        return (ArrowOrientationRules) Enum.valueOf(ArrowOrientationRules.class, str);
    }

    public static ArrowOrientationRules[] values() {
        return (ArrowOrientationRules[]) $VALUES.clone();
    }
}
