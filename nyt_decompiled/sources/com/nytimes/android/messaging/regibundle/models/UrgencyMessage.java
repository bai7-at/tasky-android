package com.nytimes.android.messaging.regibundle.models;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class UrgencyMessage {
    public static final int $stable = 0;
    private final String buttonText;
    private final long endTimeInterval;
    private final String header;
    private final String sku;
    private final long startTimeInterval;
    private final String text;

    public UrgencyMessage(long j, long j2, String str, String str2, String str3, String str4) {
        this.startTimeInterval = j;
        this.endTimeInterval = j2;
        this.header = str;
        this.text = str2;
        this.buttonText = str3;
        this.sku = str4;
    }

    public final long component1() {
        return this.startTimeInterval;
    }

    public final long component2() {
        return this.endTimeInterval;
    }

    public final String component3() {
        return this.header;
    }

    public final String component4() {
        return this.text;
    }

    public final String component5() {
        return this.buttonText;
    }

    public final String component6() {
        return this.sku;
    }

    public final UrgencyMessage copy(long j, long j2, String str, String str2, String str3, String str4) {
        return new UrgencyMessage(j, j2, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrgencyMessage)) {
            return false;
        }
        UrgencyMessage urgencyMessage = (UrgencyMessage) obj;
        return this.startTimeInterval == urgencyMessage.startTimeInterval && this.endTimeInterval == urgencyMessage.endTimeInterval && zq3.c(this.header, urgencyMessage.header) && zq3.c(this.text, urgencyMessage.text) && zq3.c(this.buttonText, urgencyMessage.buttonText) && zq3.c(this.sku, urgencyMessage.sku);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final long getEndTimeInterval() {
        return this.endTimeInterval;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getSku() {
        return this.sku;
    }

    public final long getStartTimeInterval() {
        return this.startTimeInterval;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.startTimeInterval) * 31) + Long.hashCode(this.endTimeInterval)) * 31;
        String str = this.header;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sku;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "UrgencyMessage(startTimeInterval=" + this.startTimeInterval + ", endTimeInterval=" + this.endTimeInterval + ", header=" + this.header + ", text=" + this.text + ", buttonText=" + this.buttonText + ", sku=" + this.sku + ")";
    }
}
