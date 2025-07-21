package com.nytimes.android.api.config.model.overrides;

import defpackage.zq3;

/* loaded from: classes3.dex */
public final class StoreOverride {
    private final String actionText;
    private final String description;
    private final String promoUrl;
    private final String sku;
    private final String title;
    private final String trial;

    public StoreOverride(String str, String str2, String str3, String str4, String str5, String str6) {
        this.sku = str;
        this.title = str2;
        this.description = str3;
        this.actionText = str4;
        this.trial = str5;
        this.promoUrl = str6;
    }

    public static /* synthetic */ StoreOverride copy$default(StoreOverride storeOverride, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storeOverride.sku;
        }
        if ((i & 2) != 0) {
            str2 = storeOverride.title;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = storeOverride.description;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = storeOverride.actionText;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = storeOverride.trial;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = storeOverride.promoUrl;
        }
        return storeOverride.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.sku;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.actionText;
    }

    public final String component5() {
        return this.trial;
    }

    public final String component6() {
        return this.promoUrl;
    }

    public final StoreOverride copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new StoreOverride(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreOverride)) {
            return false;
        }
        StoreOverride storeOverride = (StoreOverride) obj;
        return zq3.c(this.sku, storeOverride.sku) && zq3.c(this.title, storeOverride.title) && zq3.c(this.description, storeOverride.description) && zq3.c(this.actionText, storeOverride.actionText) && zq3.c(this.trial, storeOverride.trial) && zq3.c(this.promoUrl, storeOverride.promoUrl);
    }

    public final String getActionText() {
        return this.actionText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getPromoUrl() {
        return this.promoUrl;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrial() {
        return this.trial;
    }

    public int hashCode() {
        String str = this.sku;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trial;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.promoUrl;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "StoreOverride(sku=" + this.sku + ", title=" + this.title + ", description=" + this.description + ", actionText=" + this.actionText + ", trial=" + this.trial + ", promoUrl=" + this.promoUrl + ")";
    }
}
