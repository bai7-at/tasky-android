package com.nytimes.android.ads.models;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CommonAdKeys {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ CommonAdKeys[] $VALUES;
    private final String key;
    public static final CommonAdKeys PAGE_VIEW_ID = new CommonAdKeys("PAGE_VIEW_ID", 0, "page_view_id");
    public static final CommonAdKeys CONTENT_TYPE = new CommonAdKeys("CONTENT_TYPE", 1, "typ");
    public static final CommonAdKeys AD_POSITION = new CommonAdKeys("AD_POSITION", 2, "pos");
    public static final CommonAdKeys COLLECTION = new CommonAdKeys("COLLECTION", 3, "coll");
    public static final CommonAdKeys CONTENT_URL = new CommonAdKeys("CONTENT_URL", 4, "content_url");
    public static final CommonAdKeys AB_EXPERIMENT = new CommonAdKeys("AB_EXPERIMENT", 5, "abra_dfp");

    private static final /* synthetic */ CommonAdKeys[] $values() {
        return new CommonAdKeys[]{PAGE_VIEW_ID, CONTENT_TYPE, AD_POSITION, COLLECTION, CONTENT_URL, AB_EXPERIMENT};
    }

    static {
        CommonAdKeys[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CommonAdKeys(String str, int i, String str2) {
        this.key = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static CommonAdKeys valueOf(String str) {
        return (CommonAdKeys) Enum.valueOf(CommonAdKeys.class, str);
    }

    public static CommonAdKeys[] values() {
        return (CommonAdKeys[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}
