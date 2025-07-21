package com.nytimes.android.ads.models;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CoreAdKeys {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ CoreAdKeys[] $VALUES;
    private final String key;
    public static final CoreAdKeys PLATFORM = new CoreAdKeys("PLATFORM", 0, "plat");
    public static final CoreAdKeys PROPERTY = new CoreAdKeys("PROPERTY", 1, "prop");
    public static final CoreAdKeys USER_ACCESS_POINT = new CoreAdKeys("USER_ACCESS_POINT", 2, "uap");
    public static final CoreAdKeys SHARE_OF_VOICE = new CoreAdKeys("SHARE_OF_VOICE", 3, "sov");
    public static final CoreAdKeys SUBSCRIBER = new CoreAdKeys("SUBSCRIBER", 4, "sub");
    public static final CoreAdKeys APP_VERSION = new CoreAdKeys("APP_VERSION", 5, "ver");
    public static final CoreAdKeys AD_KEYWORD = new CoreAdKeys("AD_KEYWORD", 6, "adv");
    public static final CoreAdKeys VIEWPORT_SIZE = new CoreAdKeys("VIEWPORT_SIZE", 7, "vp");
    public static final CoreAdKeys CORRELATOR = new CoreAdKeys("CORRELATOR", 8, "correlator");

    private static final /* synthetic */ CoreAdKeys[] $values() {
        return new CoreAdKeys[]{PLATFORM, PROPERTY, USER_ACCESS_POINT, SHARE_OF_VOICE, SUBSCRIBER, APP_VERSION, AD_KEYWORD, VIEWPORT_SIZE, CORRELATOR};
    }

    static {
        CoreAdKeys[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CoreAdKeys(String str, int i, String str2) {
        this.key = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static CoreAdKeys valueOf(String str) {
        return (CoreAdKeys) Enum.valueOf(CoreAdKeys.class, str);
    }

    public static CoreAdKeys[] values() {
        return (CoreAdKeys[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}
