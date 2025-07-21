package com.nytimes.android.ads.network.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes2.dex */
public final class AlsTargetingDataJsonAdapter extends JsonAdapter<AlsTargetingData> {
    private volatile Constructor<AlsTargetingData> constructorRef;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public AlsTargetingDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("User", "als_test_clientside", "Asset");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Map<String, String>> f = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "userData");
        zq3.g(f, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "alsTestClientSide");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AlsTargetingData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Map map = null;
        String str = null;
        Map map2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                map = (Map) this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (P == 1) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (P == 2) {
                map2 = (Map) this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.h();
        if (i == -8) {
            return new AlsTargetingData(map, str, map2);
        }
        Constructor<AlsTargetingData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AlsTargetingData.class.getDeclaredConstructor(Map.class, String.class, Map.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        AlsTargetingData newInstance = constructor.newInstance(map, str, map2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AlsTargetingData alsTargetingData) {
        zq3.h(hVar, "writer");
        if (alsTargetingData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("User");
        this.nullableMapOfStringStringAdapter.mo197toJson(hVar, alsTargetingData.d());
        hVar.C("als_test_clientside");
        this.nullableStringAdapter.mo197toJson(hVar, alsTargetingData.a());
        hVar.C("Asset");
        this.nullableMapOfStringStringAdapter.mo197toJson(hVar, alsTargetingData.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AlsTargetingData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
