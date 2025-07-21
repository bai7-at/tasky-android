package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.AuthenticationTokenClaims;
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

/* loaded from: classes5.dex */
public final class LegacyExceptionInfoJsonAdapter extends JsonAdapter<LegacyExceptionInfo> {
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public LegacyExceptionInfoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.IS_NEW_USER, QueryKeys.MAX_SCROLL_DEPTH, "tt");
        zq3.g(a, "JsonReader.Options.of(\"n\", \"m\", \"tt\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.stringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "message");
        zq3.g(f2, "moshi.adapter(String::cl…   emptySet(), \"message\")");
        this.nullableStringAdapter = f2;
        JsonAdapter<List<String>> f3 = iVar.f(j.j(List.class, String.class), b0.e(), "lines");
        zq3.g(f3, "moshi.adapter(Types.newP…mptySet(),\n      \"lines\")");
        this.listOfStringAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LegacyExceptionInfo");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public LegacyExceptionInfo fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, QueryKeys.IS_NEW_USER, jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"name\", \"n\", reader)");
                    throw x;
                }
            } else if (P == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 2 && (list = (List) this.listOfStringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("lines", "tt", jsonReader);
                zq3.g(x2, "Util.unexpectedNull(\"lin…            \"tt\", reader)");
                throw x2;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, QueryKeys.IS_NEW_USER, jsonReader);
            zq3.g(o, "Util.missingProperty(\"name\", \"n\", reader)");
            throw o;
        }
        if (list != null) {
            return new LegacyExceptionInfo(str, str2, list);
        }
        JsonDataException o2 = c29.o("lines", "tt", jsonReader);
        zq3.g(o2, "Util.missingProperty(\"lines\", \"tt\", reader)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LegacyExceptionInfo legacyExceptionInfo) {
        zq3.h(hVar, "writer");
        if (legacyExceptionInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.IS_NEW_USER);
        this.stringAdapter.mo197toJson(hVar, legacyExceptionInfo.getName());
        hVar.C(QueryKeys.MAX_SCROLL_DEPTH);
        this.nullableStringAdapter.mo197toJson(hVar, legacyExceptionInfo.getMessage());
        hVar.C("tt");
        this.listOfStringAdapter.mo197toJson(hVar, legacyExceptionInfo.getLines());
        hVar.l();
    }
}
