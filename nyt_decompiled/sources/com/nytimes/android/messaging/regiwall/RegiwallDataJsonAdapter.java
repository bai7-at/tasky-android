package com.nytimes.android.messaging.regiwall;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class RegiwallDataJsonAdapter extends JsonAdapter<RegiwallData> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<RegiwallData> constructorRef;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public RegiwallDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("isActive", "title", "description", "primaryButtonText", "secondaryButtonText");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Boolean> f = iVar.f(Boolean.TYPE, b0.e(), "isActive");
        zq3.g(f, "adapter(...)");
        this.booleanAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "title");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RegiwallData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.b();
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    JsonDataException x = c29.x("isActive", "isActive", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -2;
            } else if (P == 1) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x2 = c29.x("title", "title", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i &= -3;
            } else if (P == 2) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException x3 = c29.x("description", "description", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
                i &= -5;
            } else if (P == 3) {
                str3 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    JsonDataException x4 = c29.x("primaryButtonText", "primaryButtonText", jsonReader);
                    zq3.g(x4, "unexpectedNull(...)");
                    throw x4;
                }
                i &= -9;
            } else if (P == 4) {
                str4 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str4 == null) {
                    JsonDataException x5 = c29.x("secondaryButtonText", "secondaryButtonText", jsonReader);
                    zq3.g(x5, "unexpectedNull(...)");
                    throw x5;
                }
                i &= -17;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -32) {
            boolean booleanValue = bool2.booleanValue();
            zq3.f(str, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str2, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str3, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str4, "null cannot be cast to non-null type kotlin.String");
            return new RegiwallData(booleanValue, str, str2, str3, str4);
        }
        Constructor<RegiwallData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = RegiwallData.class.getDeclaredConstructor(Boolean.TYPE, String.class, String.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        RegiwallData newInstance = constructor.newInstance(bool2, str, str2, str3, str4, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, RegiwallData regiwallData) {
        zq3.h(hVar, "writer");
        if (regiwallData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("isActive");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(regiwallData.e()));
        hVar.C("title");
        this.stringAdapter.mo197toJson(hVar, regiwallData.d());
        hVar.C("description");
        this.stringAdapter.mo197toJson(hVar, regiwallData.a());
        hVar.C("primaryButtonText");
        this.stringAdapter.mo197toJson(hVar, regiwallData.b());
        hVar.C("secondaryButtonText");
        this.stringAdapter.mo197toJson(hVar, regiwallData.c());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RegiwallData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
