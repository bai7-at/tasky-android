package com.nytimes.xwords.hybrid;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DirectiveKeys {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DirectiveKeys[] $VALUES;
    public static final DirectiveKeys AcceptableTrackersDirectiveV2 = new DirectiveKeys("AcceptableTrackersDirectiveV2", 0, "PURR_AcceptableTrackers_v2");
    public static final DirectiveKeys AdvertisingConfigurationDirectiveV3 = new DirectiveKeys("AdvertisingConfigurationDirectiveV3", 1, "PURR_AdConfiguration_v3");
    private final String key;

    private static final /* synthetic */ DirectiveKeys[] $values() {
        return new DirectiveKeys[]{AcceptableTrackersDirectiveV2, AdvertisingConfigurationDirectiveV3};
    }

    static {
        DirectiveKeys[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DirectiveKeys(String str, int i, String str2) {
        this.key = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DirectiveKeys valueOf(String str) {
        return (DirectiveKeys) Enum.valueOf(DirectiveKeys.class, str);
    }

    public static DirectiveKeys[] values() {
        return (DirectiveKeys[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}
