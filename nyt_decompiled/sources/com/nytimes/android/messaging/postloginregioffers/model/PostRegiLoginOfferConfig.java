package com.nytimes.android.messaging.postloginregioffers.model;

import androidx.annotation.Keep;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

@et3(generateAdapter = true)
@Keep
/* loaded from: classes4.dex */
public final class PostRegiLoginOfferConfig {
    public static final int $stable = 8;
    private final String accountStatus;
    private final String continueButtonText;
    private final String footer;
    private final boolean hasIntroPrice;
    private final String header;
    private final String legalText;
    private final String productSubHeader;
    private final String productTitle;
    private final List<PostAuthScheduledSku> scheduledSkus;
    private final boolean showValuePropsToggle;
    private final String sku;
    private final String subscribeButtonText;
    private final List<PostAuthUrgencyMessage> urgencyMessaging;
    private final List<ValueProp> valueProps;
    private final String valuePropsHeader;

    public PostRegiLoginOfferConfig(@bt3(name = "account_status") String str, String str2, @bt3(name = "card_header") String str3, @bt3(name = "card_subheader") String str4, @bt3(name = "value_props_header") String str5, @bt3(name = "show_value_props_toggle") boolean z, @bt3(name = "value_props") List<ValueProp> list, String str6, @bt3(name = "subscribe_button_text") String str7, @bt3(name = "continue_button_text") String str8, String str9, @bt3(name = "terms") String str10, @bt3(name = "scheduled_skus") List<PostAuthScheduledSku> list2, @bt3(name = "urgency_messaging") List<PostAuthUrgencyMessage> list3, boolean z2) {
        zq3.h(str, "accountStatus");
        zq3.h(str2, "header");
        zq3.h(str3, "productTitle");
        zq3.h(str4, "productSubHeader");
        zq3.h(str5, "valuePropsHeader");
        zq3.h(list, "valueProps");
        zq3.h(str6, "footer");
        zq3.h(str7, "subscribeButtonText");
        zq3.h(str8, "continueButtonText");
        zq3.h(str9, "sku");
        zq3.h(str10, "legalText");
        this.accountStatus = str;
        this.header = str2;
        this.productTitle = str3;
        this.productSubHeader = str4;
        this.valuePropsHeader = str5;
        this.showValuePropsToggle = z;
        this.valueProps = list;
        this.footer = str6;
        this.subscribeButtonText = str7;
        this.continueButtonText = str8;
        this.sku = str9;
        this.legalText = str10;
        this.scheduledSkus = list2;
        this.urgencyMessaging = list3;
        this.hasIntroPrice = z2;
    }

    public final String component1() {
        return this.accountStatus;
    }

    public final String component10() {
        return this.continueButtonText;
    }

    public final String component11() {
        return this.sku;
    }

    public final String component12() {
        return this.legalText;
    }

    public final List<PostAuthScheduledSku> component13() {
        return this.scheduledSkus;
    }

    public final List<PostAuthUrgencyMessage> component14() {
        return this.urgencyMessaging;
    }

    public final boolean component15() {
        return this.hasIntroPrice;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.productTitle;
    }

    public final String component4() {
        return this.productSubHeader;
    }

    public final String component5() {
        return this.valuePropsHeader;
    }

    public final boolean component6() {
        return this.showValuePropsToggle;
    }

    public final List<ValueProp> component7() {
        return this.valueProps;
    }

    public final String component8() {
        return this.footer;
    }

    public final String component9() {
        return this.subscribeButtonText;
    }

    public final PostRegiLoginOfferConfig copy(@bt3(name = "account_status") String str, String str2, @bt3(name = "card_header") String str3, @bt3(name = "card_subheader") String str4, @bt3(name = "value_props_header") String str5, @bt3(name = "show_value_props_toggle") boolean z, @bt3(name = "value_props") List<ValueProp> list, String str6, @bt3(name = "subscribe_button_text") String str7, @bt3(name = "continue_button_text") String str8, String str9, @bt3(name = "terms") String str10, @bt3(name = "scheduled_skus") List<PostAuthScheduledSku> list2, @bt3(name = "urgency_messaging") List<PostAuthUrgencyMessage> list3, boolean z2) {
        zq3.h(str, "accountStatus");
        zq3.h(str2, "header");
        zq3.h(str3, "productTitle");
        zq3.h(str4, "productSubHeader");
        zq3.h(str5, "valuePropsHeader");
        zq3.h(list, "valueProps");
        zq3.h(str6, "footer");
        zq3.h(str7, "subscribeButtonText");
        zq3.h(str8, "continueButtonText");
        zq3.h(str9, "sku");
        zq3.h(str10, "legalText");
        return new PostRegiLoginOfferConfig(str, str2, str3, str4, str5, z, list, str6, str7, str8, str9, str10, list2, list3, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostRegiLoginOfferConfig)) {
            return false;
        }
        PostRegiLoginOfferConfig postRegiLoginOfferConfig = (PostRegiLoginOfferConfig) obj;
        return zq3.c(this.accountStatus, postRegiLoginOfferConfig.accountStatus) && zq3.c(this.header, postRegiLoginOfferConfig.header) && zq3.c(this.productTitle, postRegiLoginOfferConfig.productTitle) && zq3.c(this.productSubHeader, postRegiLoginOfferConfig.productSubHeader) && zq3.c(this.valuePropsHeader, postRegiLoginOfferConfig.valuePropsHeader) && this.showValuePropsToggle == postRegiLoginOfferConfig.showValuePropsToggle && zq3.c(this.valueProps, postRegiLoginOfferConfig.valueProps) && zq3.c(this.footer, postRegiLoginOfferConfig.footer) && zq3.c(this.subscribeButtonText, postRegiLoginOfferConfig.subscribeButtonText) && zq3.c(this.continueButtonText, postRegiLoginOfferConfig.continueButtonText) && zq3.c(this.sku, postRegiLoginOfferConfig.sku) && zq3.c(this.legalText, postRegiLoginOfferConfig.legalText) && zq3.c(this.scheduledSkus, postRegiLoginOfferConfig.scheduledSkus) && zq3.c(this.urgencyMessaging, postRegiLoginOfferConfig.urgencyMessaging) && this.hasIntroPrice == postRegiLoginOfferConfig.hasIntroPrice;
    }

    public final String getAccountStatus() {
        return this.accountStatus;
    }

    public final String getContinueButtonText() {
        return this.continueButtonText;
    }

    public final String getFooter() {
        return this.footer;
    }

    public final boolean getHasIntroPrice() {
        return this.hasIntroPrice;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getLegalText() {
        return this.legalText;
    }

    public final String getProductSubHeader() {
        return this.productSubHeader;
    }

    public final String getProductTitle() {
        return this.productTitle;
    }

    public final List<PostAuthScheduledSku> getScheduledSkus() {
        return this.scheduledSkus;
    }

    public final boolean getShowValuePropsToggle() {
        return this.showValuePropsToggle;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getSubscribeButtonText() {
        return this.subscribeButtonText;
    }

    public final List<PostAuthUrgencyMessage> getUrgencyMessaging() {
        return this.urgencyMessaging;
    }

    public final List<ValueProp> getValueProps() {
        return this.valueProps;
    }

    public final String getValuePropsHeader() {
        return this.valuePropsHeader;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.accountStatus.hashCode() * 31) + this.header.hashCode()) * 31) + this.productTitle.hashCode()) * 31) + this.productSubHeader.hashCode()) * 31) + this.valuePropsHeader.hashCode()) * 31) + Boolean.hashCode(this.showValuePropsToggle)) * 31) + this.valueProps.hashCode()) * 31) + this.footer.hashCode()) * 31) + this.subscribeButtonText.hashCode()) * 31) + this.continueButtonText.hashCode()) * 31) + this.sku.hashCode()) * 31) + this.legalText.hashCode()) * 31;
        List<PostAuthScheduledSku> list = this.scheduledSkus;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<PostAuthUrgencyMessage> list2 = this.urgencyMessaging;
        return ((hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasIntroPrice);
    }

    public String toString() {
        return "PostRegiLoginOfferConfig(accountStatus=" + this.accountStatus + ", header=" + this.header + ", productTitle=" + this.productTitle + ", productSubHeader=" + this.productSubHeader + ", valuePropsHeader=" + this.valuePropsHeader + ", showValuePropsToggle=" + this.showValuePropsToggle + ", valueProps=" + this.valueProps + ", footer=" + this.footer + ", subscribeButtonText=" + this.subscribeButtonText + ", continueButtonText=" + this.continueButtonText + ", sku=" + this.sku + ", legalText=" + this.legalText + ", scheduledSkus=" + this.scheduledSkus + ", urgencyMessaging=" + this.urgencyMessaging + ", hasIntroPrice=" + this.hasIntroPrice + ")";
    }

    public /* synthetic */ PostRegiLoginOfferConfig(String str, String str2, String str3, String str4, String str5, boolean z, List list, String str6, String str7, String str8, String str9, String str10, List list2, List list3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, z, list, (i & 128) != 0 ? "" : str6, str7, str8, str9, str10, list2, list3, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z2);
    }
}
