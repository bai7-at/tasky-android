package com.nytimes.android.remoteconfig.source;

import defpackage.b22;
import defpackage.rh6;
import defpackage.yc6;
import defpackage.zl6;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ResourceNames {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ResourceNames[] $VALUES;
    private final int resId;
    public static final ResourceNames videoShareMessage = new ResourceNames("videoShareMessage", 0, zl6.share_message_video);
    public static final ResourceNames articleShareMessage = new ResourceNames("articleShareMessage", 1, zl6.share_message_article);
    public static final ResourceNames defaultShareMessage = new ResourceNames("defaultShareMessage", 2, zl6.share_message_default);
    public static final ResourceNames dns_check_enabled = new ResourceNames("dns_check_enabled", 3, yc6.dns_check_enabled);
    public static final ResourceNames geoip_endpoint = new ResourceNames("geoip_endpoint", 4, zl6.geoip_endpoint);
    public static final ResourceNames meter_articleCardSubscriptionButton = new ResourceNames("meter_articleCardSubscriptionButton", 5, zl6.meter_articleCardSubscriptionButton);
    public static final ResourceNames gdpr_overlay_on = new ResourceNames("gdpr_overlay_on", 6, yc6.gdpr_overlay_on);
    public static final ResourceNames adluce_on = new ResourceNames("adluce_on", 7, yc6.adluce_on);
    public static final ResourceNames af_hybrid_enabled = new ResourceNames("af_hybrid_enabled", 8, yc6.af_hybrid_enabled);
    public static final ResourceNames meter_gatewayOfflineValueProp = new ResourceNames("meter_gatewayOfflineValueProp", 9, zl6.meter_gatewayOfflineValueProp);
    public static final ResourceNames android_homeEnabled = new ResourceNames("android_homeEnabled", 10, yc6.android_homeEnabled);
    public static final ResourceNames android_appsFlyerEnabled = new ResourceNames("android_appsFlyerEnabled", 11, yc6.android_appsFlyerEnabled);
    public static final ResourceNames feedback_subject = new ResourceNames("feedback_subject", 12, zl6.feedback_subject);
    public static final ResourceNames purr_timeout_directives = new ResourceNames("purr_timeout_directives", 13, rh6.purr_timeout_directives);
    public static final ResourceNames android_storage_prefix = new ResourceNames("android_storage_prefix", 14, zl6.aws_s3_stg_bucket);

    private static final /* synthetic */ ResourceNames[] $values() {
        return new ResourceNames[]{videoShareMessage, articleShareMessage, defaultShareMessage, dns_check_enabled, geoip_endpoint, meter_articleCardSubscriptionButton, gdpr_overlay_on, adluce_on, af_hybrid_enabled, meter_gatewayOfflineValueProp, android_homeEnabled, android_appsFlyerEnabled, feedback_subject, purr_timeout_directives, android_storage_prefix};
    }

    static {
        ResourceNames[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ResourceNames(String str, int i, int i2) {
        this.resId = i2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ResourceNames valueOf(String str) {
        return (ResourceNames) Enum.valueOf(ResourceNames.class, str);
    }

    public static ResourceNames[] values() {
        return (ResourceNames[]) $VALUES.clone();
    }

    public final int getResId() {
        return this.resId;
    }
}
