package com.google.android.exoplayer2.drm;

import defpackage.a84;
import defpackage.z19;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class a {
    public static byte[] a(byte[] bArr) {
        return z19.a >= 27 ? bArr : z19.o0(c(z19.E(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (z19.a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(z19.E(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return z19.o0(sb.toString());
        } catch (JSONException e) {
            a84.e("ClearKeyUtil", "Failed to adjust response data: " + z19.E(bArr), e);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
