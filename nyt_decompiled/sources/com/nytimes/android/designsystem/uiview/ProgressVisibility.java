package com.nytimes.android.designsystem.uiview;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ProgressVisibility {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ProgressVisibility[] $VALUES;
    public static final ProgressVisibility INDICATOR_ONLY = new ProgressVisibility("INDICATOR_ONLY", 0);
    public static final ProgressVisibility INDICATOR_WITH_TEXT = new ProgressVisibility("INDICATOR_WITH_TEXT", 1);
    public static final ProgressVisibility INVISIBLE = new ProgressVisibility("INVISIBLE", 2);

    private static final /* synthetic */ ProgressVisibility[] $values() {
        return new ProgressVisibility[]{INDICATOR_ONLY, INDICATOR_WITH_TEXT, INVISIBLE};
    }

    static {
        ProgressVisibility[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ProgressVisibility(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ProgressVisibility valueOf(String str) {
        return (ProgressVisibility) Enum.valueOf(ProgressVisibility.class, str);
    }

    public static ProgressVisibility[] values() {
        return (ProgressVisibility[]) $VALUES.clone();
    }
}
