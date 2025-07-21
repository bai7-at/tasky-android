package com.nytimes.android.analytics.api.values;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Edition {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Edition[] $VALUES;
    private final String title;
    public static final Edition US = new Edition("US", 0, "English");
    public static final Edition ESPANOL = new Edition("ESPANOL", 1, "NYT Español");

    private static final /* synthetic */ Edition[] $values() {
        return new Edition[]{US, ESPANOL};
    }

    static {
        Edition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private Edition(String str, int i, String str2) {
        this.title = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Edition valueOf(String str) {
        return (Edition) Enum.valueOf(Edition.class, str);
    }

    public static Edition[] values() {
        return (Edition[]) $VALUES.clone();
    }

    public String getTitle() {
        return this.title;
    }
}
