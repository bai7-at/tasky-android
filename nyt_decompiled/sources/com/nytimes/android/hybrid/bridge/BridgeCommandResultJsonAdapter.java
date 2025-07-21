package com.nytimes.android.hybrid.bridge;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class BridgeCommandResultJsonAdapter extends JsonAdapter<BridgeCommandResult> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<BridgeCommandResult> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringNullableAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public BridgeCommandResultJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("id", "success", "error", "errorDetails", "values");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.TYPE, b0.e(), "id");
        zq3.g(f, "adapter(...)");
        this.intAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "success");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "error");
        zq3.g(f3, "adapter(...)");
        this.nullableStringAdapter = f3;
        JsonAdapter<Map<String, Object>> f4 = iVar.f(j.j(Map.class, String.class, Object.class), b0.e(), "values");
        zq3.g(f4, "adapter(...)");
        this.nullableMapOfStringNullableAnyAdapter = f4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public BridgeCommandResult fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        Map map = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x = c29.x("id", "id", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    JsonDataException x2 = c29.x("success", "success", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (P == 3) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            } else if (P == 4) {
                map = (Map) this.nullableMapOfStringNullableAnyAdapter.fromJson(jsonReader);
                i &= -17;
            }
        }
        jsonReader.h();
        if (i == -29) {
            if (num == null) {
                JsonDataException o = c29.o("id", "id", jsonReader);
                zq3.g(o, "missingProperty(...)");
                throw o;
            }
            int intValue = num.intValue();
            if (bool != null) {
                return new BridgeCommandResult(intValue, bool.booleanValue(), str, str2, map);
            }
            JsonDataException o2 = c29.o("success", "success", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        Constructor<BridgeCommandResult> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = BridgeCommandResult.class.getDeclaredConstructor(cls, Boolean.TYPE, String.class, String.class, Map.class, cls, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (num == null) {
            JsonDataException o3 = c29.o("id", "id", jsonReader);
            zq3.g(o3, "missingProperty(...)");
            throw o3;
        }
        if (bool == null) {
            JsonDataException o4 = c29.o("success", "success", jsonReader);
            zq3.g(o4, "missingProperty(...)");
            throw o4;
        }
        BridgeCommandResult newInstance = constructor.newInstance(num, bool, str, str2, map, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, BridgeCommandResult bridgeCommandResult) {
        zq3.h(hVar, "writer");
        if (bridgeCommandResult == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("id");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(bridgeCommandResult.c()));
        hVar.C("success");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(bridgeCommandResult.d()));
        hVar.C("error");
        this.nullableStringAdapter.mo197toJson(hVar, bridgeCommandResult.a());
        hVar.C("errorDetails");
        this.nullableStringAdapter.mo197toJson(hVar, bridgeCommandResult.b());
        hVar.C("values");
        this.nullableMapOfStringNullableAnyAdapter.mo197toJson(hVar, bridgeCommandResult.e());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BridgeCommandResult");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
