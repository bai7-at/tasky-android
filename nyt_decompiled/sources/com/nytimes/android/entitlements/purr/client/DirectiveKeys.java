package com.nytimes.android.entitlements.purr.client;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DirectiveKeys {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DirectiveKeys[] $VALUES;
    private final String key;
    public static final DirectiveKeys AcceptableTrackersDirectiveV2 = new DirectiveKeys("AcceptableTrackersDirectiveV2", 0, "PURR_AcceptableTrackers_v2");
    public static final DirectiveKeys AdvertisingConfigurationDirectiveV2 = new DirectiveKeys("AdvertisingConfigurationDirectiveV2", 1, "PURR_AdConfiguration_v2");
    public static final DirectiveKeys AdvertisingConfigurationDirectiveV3 = new DirectiveKeys("AdvertisingConfigurationDirectiveV3", 2, "PURR_AdConfiguration_v3");
    public static final DirectiveKeys DataSalesOptOutDirectiveV2 = new DirectiveKeys("DataSalesOptOutDirectiveV2", 3, "PURR_DataSaleOptOutUI_v2");
    public static final DirectiveKeys DataProcessingConsentUIDirective = new DirectiveKeys("DataProcessingConsentUIDirective", 4, "PURR_DataProcessingConsentUI");
    public static final DirectiveKeys DataProcessingPreferenceUIDirective = new DirectiveKeys("DataProcessingPreferenceUIDirective", 5, "PURR_DataProcessingPreferenceUI");
    public static final DirectiveKeys ShowCaliforniaNoticesUI = new DirectiveKeys("ShowCaliforniaNoticesUI", 6, "PURR_CaliforniaNoticesUI");
    public static final DirectiveKeys EmailMarketingOptInUI = new DirectiveKeys("EmailMarketingOptInUI", 7, "PURR_EmailMarketingOptInUI");
    public static final DirectiveKeys ShowLimitSensitivePIUiDirective = new DirectiveKeys("ShowLimitSensitivePIUiDirective", 8, "PURR_LimitSensitivePIUI");
    public static final DirectiveKeys ShowPurrTCFUIDirective = new DirectiveKeys("ShowPurrTCFUIDirective", 9, "PURR_TCFUI");

    private static final /* synthetic */ DirectiveKeys[] $values() {
        return new DirectiveKeys[]{AcceptableTrackersDirectiveV2, AdvertisingConfigurationDirectiveV2, AdvertisingConfigurationDirectiveV3, DataSalesOptOutDirectiveV2, DataProcessingConsentUIDirective, DataProcessingPreferenceUIDirective, ShowCaliforniaNoticesUI, EmailMarketingOptInUI, ShowLimitSensitivePIUiDirective, ShowPurrTCFUIDirective};
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
