package com.nytimes.android.api.cms;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class LegacyCollectionMobileJsonAdapter extends JsonAdapter<LegacyCollectionMobile> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<LegacyCollectionMobile> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public LegacyCollectionMobileJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("embedded", "includeInCompatibleApps", "url");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Boolean> f = iVar.f(Boolean.TYPE, b0.e(), "embedded");
        zq3.g(f, "adapter(...)");
        this.booleanAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "url");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LegacyCollectionMobile");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public LegacyCollectionMobile fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.b();
        Boolean bool2 = bool;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    JsonDataException x = c29.x("embedded", "embedded", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -2;
            } else if (P == 1) {
                bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    JsonDataException x2 = c29.x("includeInCompatibleApps", "includeInCompatibleApps", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i &= -3;
            } else if (P == 2) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (i == -4) {
            return new LegacyCollectionMobile(bool.booleanValue(), bool2.booleanValue(), str);
        }
        Constructor<LegacyCollectionMobile> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            constructor = LegacyCollectionMobile.class.getDeclaredConstructor(cls, cls, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        LegacyCollectionMobile newInstance = constructor.newInstance(bool, bool2, str, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LegacyCollectionMobile legacyCollectionMobile) {
        zq3.h(hVar, "writer");
        if (legacyCollectionMobile == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("embedded");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(legacyCollectionMobile.getEmbedded()));
        hVar.C("includeInCompatibleApps");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(legacyCollectionMobile.getIncludeInCompatibleApps()));
        hVar.C("url");
        this.nullableStringAdapter.mo197toJson(hVar, legacyCollectionMobile.getUrl());
        hVar.l();
    }
}
