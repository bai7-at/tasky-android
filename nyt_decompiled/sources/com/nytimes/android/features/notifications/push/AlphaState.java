package com.nytimes.android.features.notifications.push;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AlphaState {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AlphaState[] $VALUES;
    private final float alpha;
    public static final AlphaState ON = new AlphaState("ON", 0, 1.0f);
    public static final AlphaState OFF = new AlphaState("OFF", 1, 0.4f);

    private static final /* synthetic */ AlphaState[] $values() {
        return new AlphaState[]{ON, OFF};
    }

    static {
        AlphaState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AlphaState(String str, int i, float f) {
        this.alpha = f;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AlphaState valueOf(String str) {
        return (AlphaState) Enum.valueOf(AlphaState.class, str);
    }

    public static AlphaState[] values() {
        return (AlphaState[]) $VALUES.clone();
    }

    public final float getAlpha() {
        return this.alpha;
    }
}
