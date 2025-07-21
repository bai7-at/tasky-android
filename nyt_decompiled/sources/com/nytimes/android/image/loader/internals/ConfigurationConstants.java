package com.nytimes.android.image.loader.internals;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ConfigurationConstants {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ConfigurationConstants[] $VALUES;
    public static final ConfigurationConstants INDICATORS_ENABLED = new ConfigurationConstants("INDICATORS_ENABLED", 0);
    public static final ConfigurationConstants LOGGING_ENABLED = new ConfigurationConstants("LOGGING_ENABLED", 1);

    private static final /* synthetic */ ConfigurationConstants[] $values() {
        return new ConfigurationConstants[]{INDICATORS_ENABLED, LOGGING_ENABLED};
    }

    static {
        ConfigurationConstants[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ConfigurationConstants(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ConfigurationConstants valueOf(String str) {
        return (ConfigurationConstants) Enum.valueOf(ConfigurationConstants.class, str);
    }

    public static ConfigurationConstants[] values() {
        return (ConfigurationConstants[]) $VALUES.clone();
    }
}
