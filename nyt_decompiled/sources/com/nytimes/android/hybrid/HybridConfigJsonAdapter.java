package com.nytimes.android.hybrid;

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
public final class HybridConfigJsonAdapter extends JsonAdapter<HybridConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<HybridConfig> constructorRef;
    private final JsonAdapter<Float> floatAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Map<String, String>> mapOfStringNullableStringAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<HybridTcfInfo> nullableHybridTcfInfoAdapter;
    private final JsonAdapter<HybridUserInfo> nullableHybridUserInfoAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringNullableStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public HybridConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("BaseFontSize", "Theme", "LoggedIn", "deepLinkType", "Subscriber", "Device", "OS", "language", "OSVersion", "AppVersion", "Timezone", "ConnectionStatus", "AbraConfig", "AdRequirements", "PurrDirectives", "tc_info", "userInfo", "NativeAds", "hasOptedOutOfTracking", "trackingSensitive");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Float> f = iVar.f(Float.TYPE, b0.e(), "baseFontSize");
        zq3.g(f, "adapter(...)");
        this.floatAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "theme");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
        JsonAdapter<Boolean> f3 = iVar.f(Boolean.class, b0.e(), "loggedIn");
        zq3.g(f3, "adapter(...)");
        this.nullableBooleanAdapter = f3;
        JsonAdapter<String> f4 = iVar.f(String.class, b0.e(), "deepLinkType");
        zq3.g(f4, "adapter(...)");
        this.nullableStringAdapter = f4;
        JsonAdapter<Integer> f5 = iVar.f(Integer.TYPE, b0.e(), "connectionStatus");
        zq3.g(f5, "adapter(...)");
        this.intAdapter = f5;
        JsonAdapter<Map<String, String>> f6 = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "abraConfig");
        zq3.g(f6, "adapter(...)");
        this.nullableMapOfStringNullableStringAdapter = f6;
        JsonAdapter<Map<String, String>> f7 = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "purrDirectives");
        zq3.g(f7, "adapter(...)");
        this.mapOfStringNullableStringAdapter = f7;
        JsonAdapter<HybridTcfInfo> f8 = iVar.f(HybridTcfInfo.class, b0.e(), "hybridTcfInfo");
        zq3.g(f8, "adapter(...)");
        this.nullableHybridTcfInfoAdapter = f8;
        JsonAdapter<HybridUserInfo> f9 = iVar.f(HybridUserInfo.class, b0.e(), "userInfo");
        zq3.g(f9, "adapter(...)");
        this.nullableHybridUserInfoAdapter = f9;
        JsonAdapter<Boolean> f10 = iVar.f(Boolean.TYPE, b0.e(), "nativeAds");
        zq3.g(f10, "adapter(...)");
        this.booleanAdapter = f10;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HybridConfig fromJson(JsonReader jsonReader) {
        Map map;
        int i;
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.b();
        String str = null;
        int i2 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = null;
        Float f = null;
        String str2 = null;
        Map map2 = null;
        Integer num = null;
        String str3 = null;
        Boolean bool4 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Map map3 = null;
        Map map4 = null;
        HybridTcfInfo hybridTcfInfo = null;
        HybridUserInfo hybridUserInfo = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    f = (Float) this.floatAdapter.fromJson(jsonReader);
                    if (f == null) {
                        JsonDataException x = c29.x("baseFontSize", "BaseFontSize", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    continue;
                case 1:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x2 = c29.x("theme", "Theme", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    continue;
                case 2:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 4:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                case 5:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 6:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x3 = c29.x("os", "OS", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    i2 &= -65;
                    continue;
                case 7:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 8:
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 9:
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 10:
                    str8 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 11:
                    num = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        JsonDataException x4 = c29.x("connectionStatus", "ConnectionStatus", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    continue;
                case 12:
                    map3 = (Map) this.nullableMapOfStringNullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 13:
                    map4 = (Map) this.nullableMapOfStringNullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 14:
                    map2 = (Map) this.mapOfStringNullableStringAdapter.fromJson(jsonReader);
                    if (map2 == null) {
                        JsonDataException x5 = c29.x("purrDirectives", "PurrDirectives", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    i2 &= -16385;
                    continue;
                case 15:
                    hybridTcfInfo = (HybridTcfInfo) this.nullableHybridTcfInfoAdapter.fromJson(jsonReader);
                    i = -32769;
                    break;
                case 16:
                    hybridUserInfo = (HybridUserInfo) this.nullableHybridUserInfoAdapter.fromJson(jsonReader);
                    i = -65537;
                    break;
                case 17:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        JsonDataException x6 = c29.x("nativeAds", "NativeAds", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    i = -131073;
                    break;
                case 18:
                    bool5 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                case 19:
                    bool6 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
            }
            i2 &= i;
        }
        jsonReader.h();
        if (i2 == -245825) {
            if (f == null) {
                JsonDataException o = c29.o("baseFontSize", "BaseFontSize", jsonReader);
                zq3.g(o, "missingProperty(...)");
                throw o;
            }
            float floatValue = f.floatValue();
            if (str == null) {
                JsonDataException o2 = c29.o("theme", "Theme", jsonReader);
                zq3.g(o2, "missingProperty(...)");
                throw o2;
            }
            zq3.f(str2, "null cannot be cast to non-null type kotlin.String");
            if (num == null) {
                JsonDataException o3 = c29.o("connectionStatus", "ConnectionStatus", jsonReader);
                zq3.g(o3, "missingProperty(...)");
                throw o3;
            }
            int intValue = num.intValue();
            zq3.f(map2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
            return new HybridConfig(floatValue, str, bool3, str3, bool4, str4, str2, str5, str6, str7, str8, intValue, (Map<String, String>) map3, (Map<String, String>) map4, (Map<String, String>) map2, hybridTcfInfo, hybridUserInfo, bool2.booleanValue(), bool5, bool6);
        }
        Constructor<HybridConfig> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Float.TYPE;
            Class cls2 = Integer.TYPE;
            map = map2;
            constructor = HybridConfig.class.getDeclaredConstructor(cls, String.class, Boolean.class, String.class, Boolean.class, String.class, String.class, String.class, String.class, String.class, String.class, cls2, Map.class, Map.class, Map.class, HybridTcfInfo.class, HybridUserInfo.class, Boolean.TYPE, Boolean.class, Boolean.class, cls2, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        } else {
            map = map2;
        }
        Constructor<HybridConfig> constructor2 = constructor;
        if (f == null) {
            JsonDataException o4 = c29.o("baseFontSize", "BaseFontSize", jsonReader);
            zq3.g(o4, "missingProperty(...)");
            throw o4;
        }
        if (str == null) {
            JsonDataException o5 = c29.o("theme", "Theme", jsonReader);
            zq3.g(o5, "missingProperty(...)");
            throw o5;
        }
        if (num == null) {
            JsonDataException o6 = c29.o("connectionStatus", "ConnectionStatus", jsonReader);
            zq3.g(o6, "missingProperty(...)");
            throw o6;
        }
        HybridConfig newInstance = constructor2.newInstance(f, str, bool3, str3, bool4, str4, str2, str5, str6, str7, str8, num, map3, map4, map, hybridTcfInfo, hybridUserInfo, bool2, bool5, bool6, Integer.valueOf(i2), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, HybridConfig hybridConfig) {
        zq3.h(hVar, "writer");
        if (hybridConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("BaseFontSize");
        this.floatAdapter.mo197toJson(hVar, Float.valueOf(hybridConfig.d()));
        hVar.C("Theme");
        this.stringAdapter.mo197toJson(hVar, hybridConfig.q());
        hVar.C("LoggedIn");
        this.nullableBooleanAdapter.mo197toJson(hVar, hybridConfig.k());
        hVar.C("deepLinkType");
        this.nullableStringAdapter.mo197toJson(hVar, hybridConfig.f());
        hVar.C("Subscriber");
        this.nullableBooleanAdapter.mo197toJson(hVar, hybridConfig.p());
        hVar.C("Device");
        this.nullableStringAdapter.mo197toJson(hVar, hybridConfig.g());
        hVar.C("OS");
        this.stringAdapter.mo197toJson(hVar, hybridConfig.m());
        hVar.C("language");
        this.nullableStringAdapter.mo197toJson(hVar, hybridConfig.j());
        hVar.C("OSVersion");
        this.nullableStringAdapter.mo197toJson(hVar, hybridConfig.n());
        hVar.C("AppVersion");
        this.nullableStringAdapter.mo197toJson(hVar, hybridConfig.c());
        hVar.C("Timezone");
        this.nullableStringAdapter.mo197toJson(hVar, hybridConfig.r());
        hVar.C("ConnectionStatus");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(hybridConfig.e()));
        hVar.C("AbraConfig");
        this.nullableMapOfStringNullableStringAdapter.mo197toJson(hVar, hybridConfig.a());
        hVar.C("AdRequirements");
        this.nullableMapOfStringNullableStringAdapter.mo197toJson(hVar, hybridConfig.b());
        hVar.C("PurrDirectives");
        this.mapOfStringNullableStringAdapter.mo197toJson(hVar, hybridConfig.o());
        hVar.C("tc_info");
        this.nullableHybridTcfInfoAdapter.mo197toJson(hVar, hybridConfig.i());
        hVar.C("userInfo");
        this.nullableHybridUserInfoAdapter.mo197toJson(hVar, hybridConfig.t());
        hVar.C("NativeAds");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(hybridConfig.l()));
        hVar.C("hasOptedOutOfTracking");
        this.nullableBooleanAdapter.mo197toJson(hVar, hybridConfig.h());
        hVar.C("trackingSensitive");
        this.nullableBooleanAdapter.mo197toJson(hVar, hybridConfig.s());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("HybridConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
