package com.skydoves.balloon;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BalloonAlign {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ BalloonAlign[] $VALUES;
    public static final BalloonAlign START = new BalloonAlign("START", 0);
    public static final BalloonAlign END = new BalloonAlign("END", 1);
    public static final BalloonAlign TOP = new BalloonAlign("TOP", 2);
    public static final BalloonAlign BOTTOM = new BalloonAlign("BOTTOM", 3);

    private static final /* synthetic */ BalloonAlign[] $values() {
        return new BalloonAlign[]{START, END, TOP, BOTTOM};
    }

    static {
        BalloonAlign[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BalloonAlign(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static BalloonAlign valueOf(String str) {
        return (BalloonAlign) Enum.valueOf(BalloonAlign.class, str);
    }

    public static BalloonAlign[] values() {
        return (BalloonAlign[]) $VALUES.clone();
    }
}
