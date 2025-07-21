package com.nytimes.android.subauth.core.purchase.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.zq3;
import kotlin.collections.b0;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class VerifyPurchaseDataJsonAdapter extends JsonAdapter<VerifyPurchaseData> {
    private final JsonAdapter<JSONObject> nullableJSONObjectAdapter;
    private final JsonReader.b options;

    public VerifyPurchaseDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("entitlements");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<JSONObject> f = iVar.f(JSONObject.class, b0.e(), "entitlements");
        zq3.g(f, "adapter(...)");
        this.nullableJSONObjectAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VerifyPurchaseData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        JSONObject jSONObject = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                jSONObject = (JSONObject) this.nullableJSONObjectAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new VerifyPurchaseData(jSONObject);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, VerifyPurchaseData verifyPurchaseData) {
        zq3.h(hVar, "writer");
        if (verifyPurchaseData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("entitlements");
        this.nullableJSONObjectAdapter.mo197toJson(hVar, verifyPurchaseData.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("VerifyPurchaseData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
