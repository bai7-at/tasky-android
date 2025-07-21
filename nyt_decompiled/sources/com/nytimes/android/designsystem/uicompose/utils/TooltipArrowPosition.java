package com.nytimes.android.designsystem.uicompose.utils;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TooltipArrowPosition {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ TooltipArrowPosition[] $VALUES;
    public static final TooltipArrowPosition TOP = new TooltipArrowPosition("TOP", 0);
    public static final TooltipArrowPosition BOTTOM = new TooltipArrowPosition("BOTTOM", 1);
    public static final TooltipArrowPosition NONE = new TooltipArrowPosition("NONE", 2);

    private static final /* synthetic */ TooltipArrowPosition[] $values() {
        return new TooltipArrowPosition[]{TOP, BOTTOM, NONE};
    }

    static {
        TooltipArrowPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TooltipArrowPosition(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static TooltipArrowPosition valueOf(String str) {
        return (TooltipArrowPosition) Enum.valueOf(TooltipArrowPosition.class, str);
    }

    public static TooltipArrowPosition[] values() {
        return (TooltipArrowPosition[]) $VALUES.clone();
    }
}
