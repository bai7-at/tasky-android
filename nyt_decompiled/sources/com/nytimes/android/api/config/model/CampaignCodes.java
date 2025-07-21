package com.nytimes.android.api.config.model;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.gson.annotations.SerializedName;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class CampaignCodes {

    @SerializedName("adSub")
    private final String afSub;
    private final String gateway;

    @SerializedName("meter")
    private final String meterCard;
    private final String splash;

    @SerializedName("sub")
    private final String subscribe;

    @SerializedName("subAB")
    private final String subscribeAB;

    @SerializedName("subAd")
    private final String subscribeAd;
    private final String toast;
    private final String topStoriesSub;

    public CampaignCodes() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final String component1() {
        return this.subscribe;
    }

    public final String component2() {
        return this.subscribeAB;
    }

    public final String component3() {
        return this.gateway;
    }

    public final String component4() {
        return this.subscribeAd;
    }

    public final String component5() {
        return this.toast;
    }

    public final String component6() {
        return this.meterCard;
    }

    public final String component7() {
        return this.splash;
    }

    public final String component8() {
        return this.topStoriesSub;
    }

    public final String component9() {
        return this.afSub;
    }

    public final CampaignCodes copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new CampaignCodes(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignCodes)) {
            return false;
        }
        CampaignCodes campaignCodes = (CampaignCodes) obj;
        return zq3.c(this.subscribe, campaignCodes.subscribe) && zq3.c(this.subscribeAB, campaignCodes.subscribeAB) && zq3.c(this.gateway, campaignCodes.gateway) && zq3.c(this.subscribeAd, campaignCodes.subscribeAd) && zq3.c(this.toast, campaignCodes.toast) && zq3.c(this.meterCard, campaignCodes.meterCard) && zq3.c(this.splash, campaignCodes.splash) && zq3.c(this.topStoriesSub, campaignCodes.topStoriesSub) && zq3.c(this.afSub, campaignCodes.afSub);
    }

    public final String getAfSub() {
        return this.afSub;
    }

    public final String getGateway() {
        return this.gateway;
    }

    public final String getMeterCard() {
        return this.meterCard;
    }

    public final String getSplash() {
        return this.splash;
    }

    public final String getSubscribe() {
        return this.subscribe;
    }

    public final String getSubscribeAB() {
        return this.subscribeAB;
    }

    public final String getSubscribeAd() {
        return this.subscribeAd;
    }

    public final String getToast() {
        return this.toast;
    }

    public final String getTopStoriesSub() {
        return this.topStoriesSub;
    }

    public int hashCode() {
        String str = this.subscribe;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subscribeAB;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gateway;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subscribeAd;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.toast;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.meterCard;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.splash;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.topStoriesSub;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.afSub;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "CampaignCodes(subscribe=" + this.subscribe + ", subscribeAB=" + this.subscribeAB + ", gateway=" + this.gateway + ", subscribeAd=" + this.subscribeAd + ", toast=" + this.toast + ", meterCard=" + this.meterCard + ", splash=" + this.splash + ", topStoriesSub=" + this.topStoriesSub + ", afSub=" + this.afSub + ")";
    }

    public CampaignCodes(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.subscribe = str;
        this.subscribeAB = str2;
        this.gateway = str3;
        this.subscribeAd = str4;
        this.toast = str5;
        this.meterCard = str6;
        this.splash = str7;
        this.topStoriesSub = str8;
        this.afSub = str9;
    }

    public /* synthetic */ CampaignCodes(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str9);
    }
}
