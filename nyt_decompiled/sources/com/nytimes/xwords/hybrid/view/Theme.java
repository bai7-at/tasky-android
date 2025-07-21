package com.nytimes.xwords.hybrid.view;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Theme {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Theme[] $VALUES;
    public static final Theme LIGHT = new Theme("LIGHT", 0);
    public static final Theme DARK = new Theme("DARK", 1);

    private static final /* synthetic */ Theme[] $values() {
        return new Theme[]{LIGHT, DARK};
    }

    static {
        Theme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private Theme(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) $VALUES.clone();
    }
}
