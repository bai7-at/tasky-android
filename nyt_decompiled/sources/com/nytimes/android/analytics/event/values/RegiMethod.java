package com.nytimes.android.analytics.event.values;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class RegiMethod {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ RegiMethod[] $VALUES;
    private final String title;
    public static final RegiMethod EMAIL = new RegiMethod("EMAIL", 0, "Email");
    public static final RegiMethod GOOGLE = new RegiMethod("GOOGLE", 1, "Google");
    public static final RegiMethod FACEBOOK = new RegiMethod("FACEBOOK", 2, "Facebook");

    private static final /* synthetic */ RegiMethod[] $values() {
        return new RegiMethod[]{EMAIL, GOOGLE, FACEBOOK};
    }

    static {
        RegiMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RegiMethod(String str, int i, String str2) {
        this.title = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static RegiMethod valueOf(String str) {
        return (RegiMethod) Enum.valueOf(RegiMethod.class, str);
    }

    public static RegiMethod[] values() {
        return (RegiMethod[]) $VALUES.clone();
    }

    public String getTitle() {
        return this.title;
    }
}
