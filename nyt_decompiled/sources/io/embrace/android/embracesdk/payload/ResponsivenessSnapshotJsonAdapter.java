package io.embrace.android.embracesdk.payload;

import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.gating.SessionGatingKeys;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class ResponsivenessSnapshotJsonAdapter extends JsonAdapter<ResponsivenessSnapshot> {
    private final JsonAdapter<List<ResponsivenessOutlier>> listOfResponsivenessOutlierAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Map<String, Long>> mapOfStringLongAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public ResponsivenessSnapshotJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(AuthenticationTokenClaims.JSON_KEY_NAME, "first", "last", "gaps", "outliers", SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        zq3.g(a, "JsonReader.Options.of(\"n…    \"outliers\", \"errors\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "firstPing");
        zq3.g(f2, "moshi.adapter(Long::clas…Set(),\n      \"firstPing\")");
        this.longAdapter = f2;
        JsonAdapter<Map<String, Long>> f3 = iVar.f(j.j(Map.class, String.class, Long.class), b0.e(), "gaps");
        zq3.g(f3, "moshi.adapter(Types.newP…ype), emptySet(), \"gaps\")");
        this.mapOfStringLongAdapter = f3;
        JsonAdapter<List<ResponsivenessOutlier>> f4 = iVar.f(j.j(List.class, ResponsivenessOutlier.class), b0.e(), "outliers");
        zq3.g(f4, "moshi.adapter(Types.newP…  emptySet(), \"outliers\")");
        this.listOfResponsivenessOutlierAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ResponsivenessSnapshot");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ResponsivenessSnapshot fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Long l2 = null;
        String str = null;
        Long l3 = null;
        Map map = null;
        List list = null;
        while (true) {
            Long l4 = l3;
            if (!jsonReader.hasNext()) {
                jsonReader.h();
                if (str == null) {
                    JsonDataException o = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                    zq3.g(o, "Util.missingProperty(\"name\", \"name\", reader)");
                    throw o;
                }
                if (l == null) {
                    JsonDataException o2 = c29.o("firstPing", "first", jsonReader);
                    zq3.g(o2, "Util.missingProperty(\"firstPing\", \"first\", reader)");
                    throw o2;
                }
                long longValue = l.longValue();
                if (l2 == null) {
                    JsonDataException o3 = c29.o("lastPing", "last", jsonReader);
                    zq3.g(o3, "Util.missingProperty(\"lastPing\", \"last\", reader)");
                    throw o3;
                }
                long longValue2 = l2.longValue();
                if (map == null) {
                    JsonDataException o4 = c29.o("gaps", "gaps", jsonReader);
                    zq3.g(o4, "Util.missingProperty(\"gaps\", \"gaps\", reader)");
                    throw o4;
                }
                if (list == null) {
                    JsonDataException o5 = c29.o("outliers", "outliers", jsonReader);
                    zq3.g(o5, "Util.missingProperty(\"ou…ers\", \"outliers\", reader)");
                    throw o5;
                }
                if (l4 != null) {
                    return new ResponsivenessSnapshot(str, longValue, longValue2, map, list, l4.longValue());
                }
                JsonDataException o6 = c29.o(SessionGatingKeys.FULL_SESSION_ERROR_LOGS, SessionGatingKeys.FULL_SESSION_ERROR_LOGS, jsonReader);
                zq3.g(o6, "Util.missingProperty(\"errors\", \"errors\", reader)");
                throw o6;
            }
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"nam…ame\",\n            reader)");
                        throw x;
                    }
                    break;
                case 1:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException x2 = c29.x("firstPing", "first", jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"fir…         \"first\", reader)");
                        throw x2;
                    }
                    break;
                case 2:
                    l2 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        JsonDataException x3 = c29.x("lastPing", "last", jsonReader);
                        zq3.g(x3, "Util.unexpectedNull(\"las…          \"last\", reader)");
                        throw x3;
                    }
                    break;
                case 3:
                    Map map2 = (Map) this.mapOfStringLongAdapter.fromJson(jsonReader);
                    if (map2 == null) {
                        JsonDataException x4 = c29.x("gaps", "gaps", jsonReader);
                        zq3.g(x4, "Util.unexpectedNull(\"gap…          \"gaps\", reader)");
                        throw x4;
                    }
                    map = map2;
                    break;
                case 4:
                    List list2 = (List) this.listOfResponsivenessOutlierAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        JsonDataException x5 = c29.x("outliers", "outliers", jsonReader);
                        zq3.g(x5, "Util.unexpectedNull(\"out…ers\", \"outliers\", reader)");
                        throw x5;
                    }
                    list = list2;
                    break;
                case 5:
                    Long l5 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l5 == null) {
                        JsonDataException x6 = c29.x(SessionGatingKeys.FULL_SESSION_ERROR_LOGS, SessionGatingKeys.FULL_SESSION_ERROR_LOGS, jsonReader);
                        zq3.g(x6, "Util.unexpectedNull(\"err…ors\",\n            reader)");
                        throw x6;
                    }
                    l3 = l5;
                    continue;
            }
            l3 = l4;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ResponsivenessSnapshot responsivenessSnapshot) {
        zq3.h(hVar, "writer");
        if (responsivenessSnapshot == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.stringAdapter.mo197toJson(hVar, responsivenessSnapshot.getName());
        hVar.C("first");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(responsivenessSnapshot.getFirstPing()));
        hVar.C("last");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(responsivenessSnapshot.getLastPing()));
        hVar.C("gaps");
        this.mapOfStringLongAdapter.mo197toJson(hVar, responsivenessSnapshot.getGaps());
        hVar.C("outliers");
        this.listOfResponsivenessOutlierAdapter.mo197toJson(hVar, responsivenessSnapshot.getOutliers());
        hVar.C(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        this.longAdapter.mo197toJson(hVar, Long.valueOf(responsivenessSnapshot.getErrors()));
        hVar.l();
    }
}
