package com.skydoves.balloon;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class IconGravity {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ IconGravity[] $VALUES;
    public static final IconGravity START = new IconGravity("START", 0);
    public static final IconGravity END = new IconGravity("END", 1);
    public static final IconGravity TOP = new IconGravity("TOP", 2);
    public static final IconGravity BOTTOM = new IconGravity("BOTTOM", 3);

    private static final /* synthetic */ IconGravity[] $values() {
        return new IconGravity[]{START, END, TOP, BOTTOM};
    }

    static {
        IconGravity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private IconGravity(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static IconGravity valueOf(String str) {
        return (IconGravity) Enum.valueOf(IconGravity.class, str);
    }

    public static IconGravity[] values() {
        return (IconGravity[]) $VALUES.clone();
    }
}
