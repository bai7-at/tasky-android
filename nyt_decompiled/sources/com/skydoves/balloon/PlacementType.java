package com.skydoves.balloon;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PlacementType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PlacementType[] $VALUES;
    public static final PlacementType ALIGNMENT = new PlacementType("ALIGNMENT", 0);
    public static final PlacementType DROPDOWN = new PlacementType("DROPDOWN", 1);
    public static final PlacementType CENTER = new PlacementType("CENTER", 2);

    private static final /* synthetic */ PlacementType[] $values() {
        return new PlacementType[]{ALIGNMENT, DROPDOWN, CENTER};
    }

    static {
        PlacementType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PlacementType(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PlacementType valueOf(String str) {
        return (PlacementType) Enum.valueOf(PlacementType.class, str);
    }

    public static PlacementType[] values() {
        return (PlacementType[]) $VALUES.clone();
    }
}
