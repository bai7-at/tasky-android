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
public final class AssetSectionJsonAdapter extends JsonAdapter<AssetSection> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AssetSection> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public AssetSectionJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("displayName", "content", "branded");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "displayName");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "branded");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AssetSection");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AssetSection fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.b();
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    JsonDataException x = c29.x("branded", "branded", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i = -5;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -5) {
            return new AssetSection(str, str2, bool.booleanValue());
        }
        Constructor<AssetSection> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AssetSection.class.getDeclaredConstructor(String.class, String.class, Boolean.TYPE, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        AssetSection newInstance = constructor.newInstance(str, str2, bool, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AssetSection assetSection) {
        zq3.h(hVar, "writer");
        if (assetSection == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("displayName");
        this.nullableStringAdapter.mo197toJson(hVar, assetSection.getDisplayName());
        hVar.C("content");
        this.nullableStringAdapter.mo197toJson(hVar, assetSection.getContent());
        hVar.C("branded");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(assetSection.getBranded()));
        hVar.l();
    }
}
