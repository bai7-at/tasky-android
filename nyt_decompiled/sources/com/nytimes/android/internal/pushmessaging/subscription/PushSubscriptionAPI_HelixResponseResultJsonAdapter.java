package com.nytimes.android.internal.pushmessaging.subscription;

import com.nytimes.android.internal.pushmessaging.subscription.PushSubscriptionAPI;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PushSubscriptionAPI_HelixResponseResultJsonAdapter extends JsonAdapter<PushSubscriptionAPI.HelixResponseResult> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public PushSubscriptionAPI_HelixResponseResultJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("regi_id", "guid", "tags");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.TYPE, b0.e(), "regiId");
        zq3.g(f, "adapter(...)");
        this.intAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "guid");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
        JsonAdapter<List<String>> f3 = iVar.f(j.j(List.class, String.class), b0.e(), "tags");
        zq3.g(f3, "adapter(...)");
        this.listOfStringAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PushSubscriptionAPI.HelixResponseResult fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        String str = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x = c29.x("regiId", "regi_id", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x2 = c29.x("guid", "guid", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2 && (list = (List) this.listOfStringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("tags", "tags", jsonReader);
                zq3.g(x3, "unexpectedNull(...)");
                throw x3;
            }
        }
        jsonReader.h();
        if (num == null) {
            JsonDataException o = c29.o("regiId", "regi_id", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        int intValue = num.intValue();
        if (str == null) {
            JsonDataException o2 = c29.o("guid", "guid", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        if (list != null) {
            return new PushSubscriptionAPI.HelixResponseResult(intValue, str, list);
        }
        JsonDataException o3 = c29.o("tags", "tags", jsonReader);
        zq3.g(o3, "missingProperty(...)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PushSubscriptionAPI.HelixResponseResult helixResponseResult) {
        zq3.h(hVar, "writer");
        if (helixResponseResult == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("regi_id");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(helixResponseResult.b()));
        hVar.C("guid");
        this.stringAdapter.mo197toJson(hVar, helixResponseResult.a());
        hVar.C("tags");
        this.listOfStringAdapter.mo197toJson(hVar, helixResponseResult.c());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(61);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PushSubscriptionAPI.HelixResponseResult");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
