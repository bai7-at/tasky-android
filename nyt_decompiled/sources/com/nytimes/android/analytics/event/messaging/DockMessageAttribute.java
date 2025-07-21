package com.nytimes.android.analytics.event.messaging;

import defpackage.b22;
import defpackage.zq3;
import java.util.Locale;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DockMessageAttribute {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DockMessageAttribute[] $VALUES;
    private final String title;
    public static final DockMessageAttribute SUBSCRIBE = new DockMessageAttribute("SUBSCRIBE", 0);
    public static final DockMessageAttribute LOGIN = new DockMessageAttribute("LOGIN", 1);
    public static final DockMessageAttribute REGISTER = new DockMessageAttribute("REGISTER", 2);

    private static final /* synthetic */ DockMessageAttribute[] $values() {
        return new DockMessageAttribute[]{SUBSCRIBE, LOGIN, REGISTER};
    }

    static {
        DockMessageAttribute[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DockMessageAttribute(String str, int i) {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        this.title = "goto-" + lowerCase;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DockMessageAttribute valueOf(String str) {
        return (DockMessageAttribute) Enum.valueOf(DockMessageAttribute.class, str);
    }

    public static DockMessageAttribute[] values() {
        return (DockMessageAttribute[]) $VALUES.clone();
    }

    public String getTitle() {
        return this.title;
    }
}
