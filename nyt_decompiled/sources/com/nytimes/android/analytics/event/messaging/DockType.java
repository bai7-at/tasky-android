package com.nytimes.android.analytics.event.messaging;

import defpackage.b22;
import defpackage.zq3;
import java.util.Locale;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DockType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DockType[] $VALUES;
    private final String title;
    public static final DockType STANDARD = new DockType("STANDARD", 0);
    public static final DockType EXPANDED = new DockType("EXPANDED", 1);
    public static final DockType MEGA = new DockType("MEGA", 2);

    private static final /* synthetic */ DockType[] $values() {
        return new DockType[]{STANDARD, EXPANDED, MEGA};
    }

    static {
        DockType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DockType(String str, int i) {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        this.title = lowerCase;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DockType valueOf(String str) {
        return (DockType) Enum.valueOf(DockType.class, str);
    }

    public static DockType[] values() {
        return (DockType[]) $VALUES.clone();
    }

    public String getTitle() {
        return this.title;
    }
}
