package com.nytimes.android.logging.remote.stream.data;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import defpackage.ad0;
import defpackage.er2;
import defpackage.um8;
import defpackage.zq3;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class JsonObjectAdapter {
    @er2
    public final JSONObject fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Object L = jsonReader.L();
        Map map = L instanceof Map ? (Map) L : null;
        if (map == null) {
            return null;
        }
        try {
            return new JSONObject(map);
        } catch (JSONException unused) {
            return null;
        }
    }

    @um8
    public final void toJson(h hVar, JSONObject jSONObject) {
        zq3.h(hVar, "writer");
        if (jSONObject != null) {
            ad0 ad0Var = new ad0();
            String jSONObject2 = jSONObject.toString();
            zq3.g(jSONObject2, "toString(...)");
            hVar.G0(ad0Var.V(jSONObject2));
        }
    }
}
