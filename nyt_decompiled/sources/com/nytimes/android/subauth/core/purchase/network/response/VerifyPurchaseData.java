package com.nytimes.android.subauth.core.purchase.network.response;

import com.nytimes.android.subauth.core.auth.network.response.NYTEntitlement;
import defpackage.et3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.i;
import org.json.JSONObject;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class VerifyPurchaseData {
    private final JSONObject a;
    private final Set b;

    public VerifyPurchaseData(JSONObject jSONObject) {
        Iterator<String> keys;
        this.a = jSONObject;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            while (keys.hasNext()) {
                String next = keys.next();
                zq3.e(next);
                linkedHashSet.add(next);
            }
        }
        ArrayList arrayList = new ArrayList(i.w(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(new NYTEntitlement((String) it2.next()));
        }
        this.b = i.c1(arrayList);
    }

    public final JSONObject a() {
        return this.a;
    }

    public final Set b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerifyPurchaseData) && zq3.c(this.a, ((VerifyPurchaseData) obj).a);
    }

    public int hashCode() {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.hashCode();
    }

    public String toString() {
        return "VerifyPurchaseData(entitlements=" + this.a + ")";
    }
}
