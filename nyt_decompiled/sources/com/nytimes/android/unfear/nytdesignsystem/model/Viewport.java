package com.nytimes.android.unfear.nytdesignsystem.model;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Viewport {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Viewport[] $VALUES;
    public static final Viewport TABLET = new Viewport("TABLET", 0);
    public static final Viewport PHONE = new Viewport("PHONE", 1);

    private static final /* synthetic */ Viewport[] $values() {
        return new Viewport[]{TABLET, PHONE};
    }

    static {
        Viewport[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private Viewport(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Viewport valueOf(String str) {
        return (Viewport) Enum.valueOf(Viewport.class, str);
    }

    public static Viewport[] values() {
        return (Viewport[]) $VALUES.clone();
    }
}
