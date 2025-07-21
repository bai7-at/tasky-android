package com.nytimes.android.ribbon.composable.tabrow;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class TabSlots {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ TabSlots[] $VALUES;
    public static final TabSlots Tabs = new TabSlots("Tabs", 0);
    public static final TabSlots Divider = new TabSlots("Divider", 1);
    public static final TabSlots Indicator = new TabSlots("Indicator", 2);

    private static final /* synthetic */ TabSlots[] $values() {
        return new TabSlots[]{Tabs, Divider, Indicator};
    }

    static {
        TabSlots[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TabSlots(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static TabSlots valueOf(String str) {
        return (TabSlots) Enum.valueOf(TabSlots.class, str);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) $VALUES.clone();
    }
}
