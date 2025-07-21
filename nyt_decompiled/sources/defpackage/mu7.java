package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class mu7 {
    private final String campaignCode;
    private final Boolean isAutoRenewing;
    private final String orderId;
    private final String originalJson;
    private final String packageName;
    private final Long purchaseTime;
    private final String receipt;
    private final String sku;

    public mu7(String str, String str2, String str3, String str4, String str5, Long l, Boolean bool, String str6) {
        zq3.h(str, "sku");
        this.sku = str;
        this.receipt = str2;
        this.packageName = str3;
        this.campaignCode = str4;
        this.orderId = str5;
        this.purchaseTime = l;
        this.isAutoRenewing = bool;
        this.originalJson = str6;
    }

    public final String a() {
        return this.campaignCode;
    }

    public final String b() {
        return this.orderId;
    }

    public final String c() {
        return this.originalJson;
    }

    public final String d() {
        return this.packageName;
    }

    public final Long e() {
        return this.purchaseTime;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu7)) {
            return false;
        }
        mu7 mu7Var = (mu7) obj;
        return zq3.c(this.sku, mu7Var.sku) && zq3.c(this.receipt, mu7Var.receipt) && zq3.c(this.packageName, mu7Var.packageName) && zq3.c(this.campaignCode, mu7Var.campaignCode) && zq3.c(this.orderId, mu7Var.orderId) && zq3.c(this.purchaseTime, mu7Var.purchaseTime) && zq3.c(this.isAutoRenewing, mu7Var.isAutoRenewing) && zq3.c(this.originalJson, mu7Var.originalJson);
    }

    public final String f() {
        return this.receipt;
    }

    public final String g() {
        return this.sku;
    }

    public final Boolean h() {
        return this.isAutoRenewing;
    }

    public int hashCode() {
        int hashCode = this.sku.hashCode() * 31;
        String str = this.receipt;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.packageName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campaignCode;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.purchaseTime;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.isAutoRenewing;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.originalJson;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "SkuPurchase(sku=" + this.sku + ", receipt=" + this.receipt + ", packageName=" + this.packageName + ", campaignCode=" + this.campaignCode + ", orderId=" + this.orderId + ", purchaseTime=" + this.purchaseTime + ", isAutoRenewing=" + this.isAutoRenewing + ", originalJson=" + this.originalJson + ")";
    }

    public /* synthetic */ mu7(String str, String str2, String str3, String str4, String str5, Long l, Boolean bool, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : bool, (i & 128) == 0 ? str6 : null);
    }
}
