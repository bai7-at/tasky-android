package com.nytimes.android.ad;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BaseAdParamKey {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ BaseAdParamKey[] $VALUES;
    private final String key;
    public static final BaseAdParamKey PLATFORM = new BaseAdParamKey("PLATFORM", 0, "plat");
    public static final BaseAdParamKey SUBSCRIBER = new BaseAdParamKey("SUBSCRIBER", 1, "sub");
    public static final BaseAdParamKey EDITION = new BaseAdParamKey("EDITION", 2, "edn");
    public static final BaseAdParamKey VERSION = new BaseAdParamKey("VERSION", 3, "ver");
    public static final BaseAdParamKey PROP = new BaseAdParamKey("PROP", 4, "prop");
    public static final BaseAdParamKey AD_KEYWORD = new BaseAdParamKey("AD_KEYWORD", 5, "adv");
    public static final BaseAdParamKey ORG_ID = new BaseAdParamKey("ORG_ID", 6, "org");
    public static final BaseAdParamKey MKT_BUCKET = new BaseAdParamKey("MKT_BUCKET", 7, "mktBucket");
    public static final BaseAdParamKey VERSION_CODE = new BaseAdParamKey("VERSION_CODE", 8, "vnum");
    public static final BaseAdParamKey BUILD_TYPE = new BaseAdParamKey("BUILD_TYPE", 9, "btyp");
    public static final BaseAdParamKey CONTENT_TYPE = new BaseAdParamKey("CONTENT_TYPE", 10, "typ");
    public static final BaseAdParamKey AUTOPLAY = new BaseAdParamKey("AUTOPLAY", 11, "autoplay");
    public static final BaseAdParamKey CONTENT_URL = new BaseAdParamKey("CONTENT_URL", 12, "content_url");
    public static final BaseAdParamKey PURR = new BaseAdParamKey("PURR", 13, "purr");
    public static final BaseAdParamKey NPA = new BaseAdParamKey("NPA", 14, "npa");
    public static final BaseAdParamKey RDP = new BaseAdParamKey("RDP", 15, "rdp");
    public static final BaseAdParamKey LTD = new BaseAdParamKey("LTD", 16, "ltd");

    private static final /* synthetic */ BaseAdParamKey[] $values() {
        return new BaseAdParamKey[]{PLATFORM, SUBSCRIBER, EDITION, VERSION, PROP, AD_KEYWORD, ORG_ID, MKT_BUCKET, VERSION_CODE, BUILD_TYPE, CONTENT_TYPE, AUTOPLAY, CONTENT_URL, PURR, NPA, RDP, LTD};
    }

    static {
        BaseAdParamKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BaseAdParamKey(String str, int i, String str2) {
        this.key = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static BaseAdParamKey valueOf(String str) {
        return (BaseAdParamKey) Enum.valueOf(BaseAdParamKey.class, str);
    }

    public static BaseAdParamKey[] values() {
        return (BaseAdParamKey[]) $VALUES.clone();
    }

    public String asString() {
        return this.key;
    }

    public final String getKey() {
        return this.key;
    }
}
