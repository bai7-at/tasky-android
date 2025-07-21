package com.nytimes.android.resourcedownloader.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class AssetResourceSourceJsonAdapter extends JsonAdapter<AssetResourceSource> {
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public AssetResourceSourceJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("assetUri");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "assetUri");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AssetResourceSource");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AssetResourceSource fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (str = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("assetUri", "assetUri", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (str != null) {
            return new AssetResourceSource(str);
        }
        JsonDataException o = c29.o("assetUri", "assetUri", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AssetResourceSource assetResourceSource) {
        zq3.h(hVar, "writer");
        if (assetResourceSource == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("assetUri");
        this.stringAdapter.mo197toJson(hVar, assetResourceSource.getAssetUri());
        hVar.l();
    }
}
