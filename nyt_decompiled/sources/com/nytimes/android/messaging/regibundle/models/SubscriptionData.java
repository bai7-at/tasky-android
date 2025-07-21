package com.nytimes.android.messaging.regibundle.models;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SubscriptionData {
    public static final int $stable = 0;
    private final String buttonText;
    private final String header;
    private final int hoursBetweenRecurrence;
    private final String sku;
    private final String text;

    public SubscriptionData(String str, String str2, String str3, int i, String str4) {
        zq3.h(str, "header");
        zq3.h(str2, "text");
        zq3.h(str3, "buttonText");
        zq3.h(str4, "sku");
        this.header = str;
        this.text = str2;
        this.buttonText = str3;
        this.hoursBetweenRecurrence = i;
        this.sku = str4;
    }

    public static /* synthetic */ SubscriptionData copy$default(SubscriptionData subscriptionData, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = subscriptionData.header;
        }
        if ((i2 & 2) != 0) {
            str2 = subscriptionData.text;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = subscriptionData.buttonText;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = subscriptionData.hoursBetweenRecurrence;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = subscriptionData.sku;
        }
        return subscriptionData.copy(str, str5, str6, i3, str4);
    }

    public final String component1() {
        return this.header;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.buttonText;
    }

    public final int component4() {
        return this.hoursBetweenRecurrence;
    }

    public final String component5() {
        return this.sku;
    }

    public final SubscriptionData copy(String str, String str2, String str3, int i, String str4) {
        zq3.h(str, "header");
        zq3.h(str2, "text");
        zq3.h(str3, "buttonText");
        zq3.h(str4, "sku");
        return new SubscriptionData(str, str2, str3, i, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionData)) {
            return false;
        }
        SubscriptionData subscriptionData = (SubscriptionData) obj;
        return zq3.c(this.header, subscriptionData.header) && zq3.c(this.text, subscriptionData.text) && zq3.c(this.buttonText, subscriptionData.buttonText) && this.hoursBetweenRecurrence == subscriptionData.hoursBetweenRecurrence && zq3.c(this.sku, subscriptionData.sku);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getHeader() {
        return this.header;
    }

    public final int getHoursBetweenRecurrence() {
        return this.hoursBetweenRecurrence;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((((this.header.hashCode() * 31) + this.text.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + Integer.hashCode(this.hoursBetweenRecurrence)) * 31) + this.sku.hashCode();
    }

    public String toString() {
        return "SubscriptionData(header=" + this.header + ", text=" + this.text + ", buttonText=" + this.buttonText + ", hoursBetweenRecurrence=" + this.hoursBetweenRecurrence + ", sku=" + this.sku + ")";
    }
}
