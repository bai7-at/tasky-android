package io.embrace.android.embracesdk.payload;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
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
public final class NativeCrashDataJsonAdapter extends JsonAdapter<NativeCrashData> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<NativeCrashDataError>> nullableListOfNullableNativeCrashDataErrorAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfNullableStringNullableStringAdapter;
    private final JsonAdapter<NativeCrashMetadata> nullableNativeCrashMetadataAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public NativeCrashDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("report_id", "sid", "ts", TransferTable.COLUMN_STATE, "meta", "ue", "crash", "symbols", SessionGatingKeys.FULL_SESSION_ERROR_LOGS, "map");
        zq3.g(a, "JsonReader.Options.of(\"r…ymbols\", \"errors\", \"map\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "nativeCrashId");
        zq3.g(f, "moshi.adapter(String::cl…),\n      \"nativeCrashId\")");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "timestamp");
        zq3.g(f2, "moshi.adapter(Long::clas…Set(),\n      \"timestamp\")");
        this.longAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "appState");
        zq3.g(f3, "moshi.adapter(String::cl…  emptySet(), \"appState\")");
        this.nullableStringAdapter = f3;
        JsonAdapter<NativeCrashMetadata> f4 = iVar.f(NativeCrashMetadata.class, b0.e(), "metadata");
        zq3.g(f4, "moshi.adapter(NativeCras…, emptySet(), \"metadata\")");
        this.nullableNativeCrashMetadataAdapter = f4;
        JsonAdapter<Integer> f5 = iVar.f(Integer.class, b0.e(), "unwindError");
        zq3.g(f5, "moshi.adapter(Int::class…mptySet(), \"unwindError\")");
        this.nullableIntAdapter = f5;
        JsonAdapter<Map<String, String>> f6 = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "symbols");
        zq3.g(f6, "moshi.adapter(Types.newP…), emptySet(), \"symbols\")");
        this.nullableMapOfNullableStringNullableStringAdapter = f6;
        JsonAdapter<List<NativeCrashDataError>> f7 = iVar.f(j.j(List.class, NativeCrashDataError.class), b0.e(), SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        zq3.g(f7, "moshi.adapter(Types.newP…    emptySet(), \"errors\")");
        this.nullableListOfNullableNativeCrashDataErrorAdapter = f7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NativeCrashData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NativeCrashData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        NativeCrashMetadata nativeCrashMetadata = null;
        Integer num = null;
        String str4 = null;
        Map map = null;
        List list = null;
        String str5 = null;
        while (true) {
            String str6 = str5;
            List list2 = list;
            Map map2 = map;
            if (!jsonReader.hasNext()) {
                jsonReader.h();
                if (str == null) {
                    JsonDataException o = c29.o("nativeCrashId", "report_id", jsonReader);
                    zq3.g(o, "Util.missingProperty(\"na…_id\",\n            reader)");
                    throw o;
                }
                if (str2 == null) {
                    JsonDataException o2 = c29.o("sessionId", "sid", jsonReader);
                    zq3.g(o2, "Util.missingProperty(\"sessionId\", \"sid\", reader)");
                    throw o2;
                }
                if (l != null) {
                    return new NativeCrashData(str, str2, l.longValue(), str3, nativeCrashMetadata, num, str4, map2, list2, str6);
                }
                JsonDataException o3 = c29.o("timestamp", "ts", jsonReader);
                zq3.g(o3, "Util.missingProperty(\"timestamp\", \"ts\", reader)");
                throw o3;
            }
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    str5 = str6;
                    list = list2;
                    map = map2;
                case 0:
                    String str7 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str7 == null) {
                        JsonDataException x = c29.x("nativeCrashId", "report_id", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"nat…Id\", \"report_id\", reader)");
                        throw x;
                    }
                    str = str7;
                    str5 = str6;
                    list = list2;
                    map = map2;
                case 1:
                    String str8 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        JsonDataException x2 = c29.x("sessionId", "sid", jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"ses…           \"sid\", reader)");
                        throw x2;
                    }
                    str2 = str8;
                    str5 = str6;
                    list = list2;
                    map = map2;
                case 2:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException x3 = c29.x("timestamp", "ts", jsonReader);
                        zq3.g(x3, "Util.unexpectedNull(\"tim…            \"ts\", reader)");
                        throw x3;
                    }
                    str5 = str6;
                    list = list2;
                    map = map2;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str6;
                    list = list2;
                    map = map2;
                case 4:
                    nativeCrashMetadata = (NativeCrashMetadata) this.nullableNativeCrashMetadataAdapter.fromJson(jsonReader);
                    str5 = str6;
                    list = list2;
                    map = map2;
                case 5:
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    str5 = str6;
                    list = list2;
                    map = map2;
                case 6:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str6;
                    list = list2;
                    map = map2;
                case 7:
                    map = (Map) this.nullableMapOfNullableStringNullableStringAdapter.fromJson(jsonReader);
                    str5 = str6;
                    list = list2;
                case 8:
                    list = (List) this.nullableListOfNullableNativeCrashDataErrorAdapter.fromJson(jsonReader);
                    str5 = str6;
                    map = map2;
                case 9:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    list = list2;
                    map = map2;
                default:
                    str5 = str6;
                    list = list2;
                    map = map2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NativeCrashData nativeCrashData) {
        zq3.h(hVar, "writer");
        if (nativeCrashData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("report_id");
        this.stringAdapter.mo197toJson(hVar, nativeCrashData.getNativeCrashId());
        hVar.C("sid");
        this.stringAdapter.mo197toJson(hVar, nativeCrashData.getSessionId());
        hVar.C("ts");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(nativeCrashData.getTimestamp()));
        hVar.C(TransferTable.COLUMN_STATE);
        this.nullableStringAdapter.mo197toJson(hVar, nativeCrashData.getAppState());
        hVar.C("meta");
        this.nullableNativeCrashMetadataAdapter.mo197toJson(hVar, nativeCrashData.getMetadata());
        hVar.C("ue");
        this.nullableIntAdapter.mo197toJson(hVar, nativeCrashData.getUnwindError());
        hVar.C("crash");
        this.nullableStringAdapter.mo197toJson(hVar, nativeCrashData.getCrash$embrace_android_sdk_release());
        hVar.C("symbols");
        this.nullableMapOfNullableStringNullableStringAdapter.mo197toJson(hVar, nativeCrashData.getSymbols());
        hVar.C(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        this.nullableListOfNullableNativeCrashDataErrorAdapter.mo197toJson(hVar, nativeCrashData.getErrors());
        hVar.C("map");
        this.nullableStringAdapter.mo197toJson(hVar, nativeCrashData.getMap());
        hVar.l();
    }
}
