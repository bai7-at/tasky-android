package com.android.billingclient.api;

import android.text.TextUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SkuDetails {
    private final String a;
    private final JSONObject b;

    public SkuDetails(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString(TransferTable.COLUMN_TYPE))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public String a() {
        return this.b.optString("description");
    }

    public String b() {
        return this.b.optString("freeTrialPeriod");
    }

    public String c() {
        return this.b.optString("introductoryPrice");
    }

    public long d() {
        return this.b.optLong("introductoryPriceAmountMicros");
    }

    public int e() {
        return this.b.optInt("introductoryPriceCycles");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.a, ((SkuDetails) obj).a);
        }
        return false;
    }

    public String f() {
        return this.b.optString("introductoryPricePeriod");
    }

    public String g() {
        return this.b.optString("price");
    }

    public long h() {
        return this.b.optLong("price_amount_micros");
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String i() {
        return this.b.optString("price_currency_code");
    }

    public String j() {
        return this.b.optString("productId");
    }

    public String k() {
        return this.b.optString("subscriptionPeriod");
    }

    public String l() {
        return this.b.optString("title");
    }

    public String m() {
        return this.b.optString(TransferTable.COLUMN_TYPE);
    }

    public int n() {
        return this.b.optInt("offer_type");
    }

    public String o() {
        return this.b.optString("offer_id");
    }

    public String p() {
        String optString = this.b.optString("offerIdToken");
        return optString.isEmpty() ? this.b.optString("offer_id_token") : optString;
    }

    public final String q() {
        return this.b.optString("packageName");
    }

    public String r() {
        return this.b.optString("serializedDocid");
    }

    final String s() {
        return this.b.optString("skuDetailsToken");
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.a));
    }
}
