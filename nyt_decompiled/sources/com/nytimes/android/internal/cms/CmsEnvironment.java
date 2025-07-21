package com.nytimes.android.internal.cms;

import android.content.res.Resources;
import defpackage.b22;
import defpackage.el6;
import defpackage.zq3;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CmsEnvironment {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ CmsEnvironment[] $VALUES;
    private final int urlResource;
    public static final CmsEnvironment PRODUCTION = new CmsEnvironment("PRODUCTION", 0, el6.feed_url_production);
    public static final CmsEnvironment STAGING = new CmsEnvironment("STAGING", 1, el6.feed_url_staging);
    public static final CmsEnvironment SAMIZDAT_STAGING = new CmsEnvironment("SAMIZDAT_STAGING", 2, el6.feed_url_samizdat_staging);
    public static final CmsEnvironment TEST_ORIGIN = new CmsEnvironment("TEST_ORIGIN", 3, el6.feed_url_test_origin);
    public static final CmsEnvironment DEVELOP = new CmsEnvironment("DEVELOP", 4, el6.feed_url_dev);

    private static final /* synthetic */ CmsEnvironment[] $values() {
        return new CmsEnvironment[]{PRODUCTION, STAGING, SAMIZDAT_STAGING, TEST_ORIGIN, DEVELOP};
    }

    static {
        CmsEnvironment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CmsEnvironment(String str, int i, int i2) {
        this.urlResource = i2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static CmsEnvironment valueOf(String str) {
        return (CmsEnvironment) Enum.valueOf(CmsEnvironment.class, str);
    }

    public static CmsEnvironment[] values() {
        return (CmsEnvironment[]) $VALUES.clone();
    }

    public final String getUrl(Resources resources) {
        zq3.h(resources, "resources");
        String string = resources.getString(this.urlResource);
        zq3.g(string, "getString(...)");
        return string;
    }

    public final int getUrlResource() {
        return this.urlResource;
    }
}
