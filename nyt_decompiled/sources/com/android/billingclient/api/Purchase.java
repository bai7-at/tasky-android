package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Purchase {
    private final String a;
    private final String b;
    private final JSONObject c;

    public Purchase(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
    }

    private final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        if (this.c.has("productIds")) {
            JSONArray optJSONArray = this.c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (this.c.has("productId")) {
            arrayList.add(this.c.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        String optString = this.c.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.c.optString("packageName");
    }

    public List d() {
        return l();
    }

    public int e() {
        return this.c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.a, purchase.b()) && TextUtils.equals(this.b, purchase.h());
    }

    public long f() {
        return this.c.optLong("purchaseTime");
    }

    public String g() {
        JSONObject jSONObject = this.c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String h() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public ArrayList i() {
        return l();
    }

    public boolean j() {
        return this.c.optBoolean("acknowledged", true);
    }

    public boolean k() {
        return this.c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.a));
    }
}
