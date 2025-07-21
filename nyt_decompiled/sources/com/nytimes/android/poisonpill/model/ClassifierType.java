package com.nytimes.android.poisonpill.model;

import defpackage.b22;
import defpackage.bt3;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ClassifierType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ClassifierType[] $VALUES;
    private final int priority;

    @bt3(name = "matchAppVersion")
    public static final ClassifierType MATCH_APP_VERSION = new ClassifierType("MATCH_APP_VERSION", 0, 2);

    @bt3(name = "appVersionBelow")
    public static final ClassifierType APP_VERSION_BELOW = new ClassifierType("APP_VERSION_BELOW", 1, 1);

    private static final /* synthetic */ ClassifierType[] $values() {
        return new ClassifierType[]{MATCH_APP_VERSION, APP_VERSION_BELOW};
    }

    static {
        ClassifierType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ClassifierType(String str, int i, int i2) {
        this.priority = i2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ClassifierType valueOf(String str) {
        return (ClassifierType) Enum.valueOf(ClassifierType.class, str);
    }

    public static ClassifierType[] values() {
        return (ClassifierType[]) $VALUES.clone();
    }

    public final int getPriority() {
        return this.priority;
    }
}
