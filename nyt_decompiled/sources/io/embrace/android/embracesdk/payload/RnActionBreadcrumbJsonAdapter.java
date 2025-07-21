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
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class RnActionBreadcrumbJsonAdapter extends JsonAdapter<RnActionBreadcrumb> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfNullableStringNullableAnyAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public RnActionBreadcrumbJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.IS_NEW_USER, "st", Session.MESSAGE_TYPE_END, "p", "pz", QueryKeys.DOCUMENT_WIDTH);
        zq3.g(a, "JsonReader.Options.of(\"n…t\", \"en\", \"p\", \"pz\", \"o\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "startTime");
        zq3.g(f2, "moshi.adapter(Long::clas…Set(),\n      \"startTime\")");
        this.longAdapter = f2;
        JsonAdapter<Map<String, Object>> f3 = iVar.f(j.j(Map.class, String.class, Object.class), b0.e(), "properties");
        zq3.g(f3, "moshi.adapter(Types.newP…emptySet(), \"properties\")");
        this.nullableMapOfNullableStringNullableAnyAdapter = f3;
        JsonAdapter<Integer> f4 = iVar.f(Integer.TYPE, b0.e(), "bytesSent");
        zq3.g(f4, "moshi.adapter(Int::class… emptySet(), \"bytesSent\")");
        this.intAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RnActionBreadcrumb");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public RnActionBreadcrumb fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Long l2 = null;
        String str = null;
        Integer num = null;
        Map map = null;
        String str2 = null;
        while (true) {
            Map map2 = map;
            String str3 = str2;
            Integer num2 = num;
            if (!jsonReader.hasNext()) {
                jsonReader.h();
                if (str == null) {
                    JsonDataException o = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, QueryKeys.IS_NEW_USER, jsonReader);
                    zq3.g(o, "Util.missingProperty(\"name\", \"n\", reader)");
                    throw o;
                }
                if (l == null) {
                    JsonDataException o2 = c29.o("startTime", "st", jsonReader);
                    zq3.g(o2, "Util.missingProperty(\"startTime\", \"st\", reader)");
                    throw o2;
                }
                long longValue = l.longValue();
                if (l2 == null) {
                    JsonDataException o3 = c29.o("endTime", Session.MESSAGE_TYPE_END, jsonReader);
                    zq3.g(o3, "Util.missingProperty(\"endTime\", \"en\", reader)");
                    throw o3;
                }
                long longValue2 = l2.longValue();
                if (num2 == null) {
                    JsonDataException o4 = c29.o("bytesSent", "pz", jsonReader);
                    zq3.g(o4, "Util.missingProperty(\"bytesSent\", \"pz\", reader)");
                    throw o4;
                }
                int intValue = num2.intValue();
                if (str3 != null) {
                    return new RnActionBreadcrumb(str, longValue, longValue2, map2, intValue, str3);
                }
                JsonDataException o5 = c29.o("output", QueryKeys.DOCUMENT_WIDTH, jsonReader);
                zq3.g(o5, "Util.missingProperty(\"output\", \"o\", reader)");
                throw o5;
            }
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    map = map2;
                    str2 = str3;
                    num = num2;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, QueryKeys.IS_NEW_USER, jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"name\", \"n\", reader)");
                        throw x;
                    }
                    map = map2;
                    str2 = str3;
                    num = num2;
                case 1:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException x2 = c29.x("startTime", "st", jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"sta…            \"st\", reader)");
                        throw x2;
                    }
                    map = map2;
                    str2 = str3;
                    num = num2;
                case 2:
                    l2 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        JsonDataException x3 = c29.x("endTime", Session.MESSAGE_TYPE_END, jsonReader);
                        zq3.g(x3, "Util.unexpectedNull(\"end…\"en\",\n            reader)");
                        throw x3;
                    }
                    map = map2;
                    str2 = str3;
                    num = num2;
                case 3:
                    map = (Map) this.nullableMapOfNullableStringNullableAnyAdapter.fromJson(jsonReader);
                    str2 = str3;
                    num = num2;
                case 4:
                    num = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        JsonDataException x4 = c29.x("bytesSent", "pz", jsonReader);
                        zq3.g(x4, "Util.unexpectedNull(\"byt…\"pz\",\n            reader)");
                        throw x4;
                    }
                    map = map2;
                    str2 = str3;
                case 5:
                    String str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x5 = c29.x("output", QueryKeys.DOCUMENT_WIDTH, jsonReader);
                        zq3.g(x5, "Util.unexpectedNull(\"out… \"o\",\n            reader)");
                        throw x5;
                    }
                    str2 = str4;
                    map = map2;
                    num = num2;
                default:
                    map = map2;
                    str2 = str3;
                    num = num2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, RnActionBreadcrumb rnActionBreadcrumb) {
        zq3.h(hVar, "writer");
        if (rnActionBreadcrumb == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.IS_NEW_USER);
        this.stringAdapter.mo197toJson(hVar, rnActionBreadcrumb.getName());
        hVar.C("st");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(rnActionBreadcrumb.getStartTime$embrace_android_sdk_release()));
        hVar.C(Session.MESSAGE_TYPE_END);
        this.longAdapter.mo197toJson(hVar, Long.valueOf(rnActionBreadcrumb.getEndTime()));
        hVar.C("p");
        this.nullableMapOfNullableStringNullableAnyAdapter.mo197toJson(hVar, rnActionBreadcrumb.getProperties());
        hVar.C("pz");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(rnActionBreadcrumb.getBytesSent()));
        hVar.C(QueryKeys.DOCUMENT_WIDTH);
        this.stringAdapter.mo197toJson(hVar, rnActionBreadcrumb.getOutput());
        hVar.l();
    }
}
