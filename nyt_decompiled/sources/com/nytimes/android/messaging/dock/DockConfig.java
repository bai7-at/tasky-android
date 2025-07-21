package com.nytimes.android.messaging.dock;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DockConfig {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DockConfig[] $VALUES;
    public static final DockConfig DEFAULT = new DockConfig("DEFAULT", 0);
    public static final DockConfig PLAY_TAB = new DockConfig("PLAY_TAB", 1);

    private static final /* synthetic */ DockConfig[] $values() {
        return new DockConfig[]{DEFAULT, PLAY_TAB};
    }

    static {
        DockConfig[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DockConfig(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DockConfig valueOf(String str) {
        return (DockConfig) Enum.valueOf(DockConfig.class, str);
    }

    public static DockConfig[] values() {
        return (DockConfig[]) $VALUES.clone();
    }
}
