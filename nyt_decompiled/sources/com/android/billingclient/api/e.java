package com.android.billingclient.api;

import android.text.TextUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {
    private final String a;
    private final JSONObject b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final List l;
    private final List m;

    public static final class a {
        private final String a;
        private final long b;
        private final String c;
        private final String d;
        private final String e;
        private final zzu f;
        private final Long g;
        private final s h;
        private final u i;
        private final t j;

        a(JSONObject jSONObject) {
            this.a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.c = jSONObject.optString("priceCurrencyCode");
            this.d = jSONObject.optString("offerIdToken");
            this.e = jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.f = zzu.o(arrayList);
            this.g = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.h = optJSONObject == null ? null : new s(optJSONObject);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.i = optJSONObject2 == null ? null : new u(optJSONObject2);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.j = optJSONObject3 != null ? new t(optJSONObject3) : null;
        }

        public String a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }
    }

    public static final class b {
        private final String a;
        private final long b;
        private final String c;
        private final String d;
        private final int e;
        private final int f;

        b(JSONObject jSONObject) {
            this.d = jSONObject.optString("billingPeriod");
            this.c = jSONObject.optString("priceCurrencyCode");
            this.a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f = jSONObject.optInt("recurrenceMode");
            this.e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.e;
        }

        public String b() {
            return this.d;
        }

        public String c() {
            return this.a;
        }

        public long d() {
            return this.b;
        }

        public String e() {
            return this.c;
        }

        public int f() {
            return this.f;
        }
    }

    public static class c {
        private final List a;

        c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(new b(optJSONObject));
                    }
                }
            }
            this.a = arrayList;
        }

        public List a() {
            return this.a;
        }
    }

    public static final class d {
        private final String a;
        private final String b;
        private final String c;
        private final c d;
        private final List e;
        private final r f;

        d(JSONObject jSONObject) {
            this.a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            this.b = true == optString.isEmpty() ? null : optString;
            this.c = jSONObject.getString("offerIdToken");
            this.d = new c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f = optJSONObject != null ? new r(optJSONObject) : null;
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.e = arrayList;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public List c() {
            return this.e;
        }

        public String d() {
            return this.c;
        }

        public c e() {
            return this.d;
        }
    }

    e(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.c = optString;
        String optString2 = jSONObject.optString(TransferTable.COLUMN_TYPE);
        this.d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.e = jSONObject.optString("title");
        this.f = jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.g = jSONObject.optString("description");
        this.i = jSONObject.optString("packageDisplayName");
        this.j = jSONObject.optString("iconUrl");
        this.h = jSONObject.optString("skuDetailsToken");
        this.k = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new d(optJSONArray.getJSONObject(i)));
            }
            this.l = arrayList;
        } else {
            this.l = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList2.add(new a(optJSONArray2.getJSONObject(i2)));
            }
            this.m = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.m = null;
        } else {
            arrayList2.add(new a(optJSONObject));
            this.m = arrayList2;
        }
    }

    public String a() {
        return this.g;
    }

    public String b() {
        return this.f;
    }

    public a c() {
        List list = this.m;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (a) this.m.get(0);
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return TextUtils.equals(this.a, ((e) obj).a);
        }
        return false;
    }

    public List f() {
        return this.l;
    }

    public String g() {
        return this.e;
    }

    public final String h() {
        return this.b.optString("packageName");
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    final String i() {
        return this.h;
    }

    public String j() {
        return this.k;
    }

    public String toString() {
        return "ProductDetails{jsonString='" + this.a + "', parsedJson=" + this.b.toString() + ", productId='" + this.c + "', productType='" + this.d + "', title='" + this.e + "', productDetailsToken='" + this.h + "', subscriptionOfferDetails=" + String.valueOf(this.l) + "}";
    }
}
