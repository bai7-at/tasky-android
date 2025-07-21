package com.nytimes.android.api.config.model;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class Marketing {
    private final CampaignCodes campaignCodes;
    private final boolean disableComScore;

    public Marketing(CampaignCodes campaignCodes, boolean z) {
        this.campaignCodes = campaignCodes;
        this.disableComScore = z;
    }

    public static /* synthetic */ Marketing copy$default(Marketing marketing, CampaignCodes campaignCodes, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            campaignCodes = marketing.campaignCodes;
        }
        if ((i & 2) != 0) {
            z = marketing.disableComScore;
        }
        return marketing.copy(campaignCodes, z);
    }

    public final CampaignCodes component1() {
        return this.campaignCodes;
    }

    public final boolean component2() {
        return this.disableComScore;
    }

    public final Marketing copy(CampaignCodes campaignCodes, boolean z) {
        return new Marketing(campaignCodes, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Marketing)) {
            return false;
        }
        Marketing marketing = (Marketing) obj;
        return zq3.c(this.campaignCodes, marketing.campaignCodes) && this.disableComScore == marketing.disableComScore;
    }

    public final CampaignCodes getCampaignCodes() {
        return this.campaignCodes;
    }

    public final boolean getDisableComScore() {
        return this.disableComScore;
    }

    public int hashCode() {
        CampaignCodes campaignCodes = this.campaignCodes;
        return ((campaignCodes == null ? 0 : campaignCodes.hashCode()) * 31) + Boolean.hashCode(this.disableComScore);
    }

    public String toString() {
        return "Marketing(campaignCodes=" + this.campaignCodes + ", disableComScore=" + this.disableComScore + ")";
    }

    public /* synthetic */ Marketing(CampaignCodes campaignCodes, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(campaignCodes, (i & 2) != 0 ? false : z);
    }
}
