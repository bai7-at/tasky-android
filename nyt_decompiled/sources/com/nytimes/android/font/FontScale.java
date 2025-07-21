package com.nytimes.android.font;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class FontScale {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ FontScale[] $VALUES;
    private final float scale;
    public static final FontScale Small = new FontScale("Small", 0, 0.85f);
    public static final FontScale Default = new FontScale("Default", 1, 1.0f);
    public static final FontScale Large = new FontScale("Large", 2, 1.15f);
    public static final FontScale Largest = new FontScale("Largest", 3, 1.3f);

    private static final /* synthetic */ FontScale[] $values() {
        return new FontScale[]{Small, Default, Large, Largest};
    }

    static {
        FontScale[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private FontScale(String str, int i, float f) {
        this.scale = f;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static FontScale valueOf(String str) {
        return (FontScale) Enum.valueOf(FontScale.class, str);
    }

    public static FontScale[] values() {
        return (FontScale[]) $VALUES.clone();
    }

    public final float getScale() {
        return this.scale;
    }
}
