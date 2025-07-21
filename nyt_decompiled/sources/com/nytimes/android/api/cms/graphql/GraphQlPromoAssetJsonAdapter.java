package com.nytimes.android.api.cms.graphql;

import com.nytimes.android.api.cms.AssetData;
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
public final class GraphQlPromoAssetJsonAdapter extends JsonAdapter<GraphQlPromoAsset> {
    private final JsonAdapter<AssetData> assetDataAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<GraphQlPromoAsset> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public GraphQlPromoAssetJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("assetData", "promoUrl", "isEmbedded");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<AssetData> f = iVar.f(AssetData.class, b0.e(), "assetData");
        zq3.g(f, "adapter(...)");
        this.assetDataAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "promoUrl");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
        JsonAdapter<Boolean> f3 = iVar.f(Boolean.TYPE, b0.e(), "isEmbedded");
        zq3.g(f3, "adapter(...)");
        this.booleanAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GraphQlPromoAsset");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GraphQlPromoAsset fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.b();
        AssetData assetData = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                assetData = (AssetData) this.assetDataAdapter.fromJson(jsonReader);
                if (assetData == null) {
                    JsonDataException x = c29.x("assetData", "assetData", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (P == 2) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    JsonDataException x2 = c29.x("isEmbedded", "isEmbedded", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -7) {
            if (assetData != null) {
                return new GraphQlPromoAsset(assetData, str, bool.booleanValue());
            }
            JsonDataException o = c29.o("assetData", "assetData", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<GraphQlPromoAsset> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GraphQlPromoAsset.class.getDeclaredConstructor(AssetData.class, String.class, Boolean.TYPE, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (assetData != null) {
            GraphQlPromoAsset newInstance = constructor.newInstance(assetData, str, bool, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("assetData", "assetData", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GraphQlPromoAsset graphQlPromoAsset) {
        zq3.h(hVar, "writer");
        if (graphQlPromoAsset == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("assetData");
        this.assetDataAdapter.mo197toJson(hVar, graphQlPromoAsset.getAssetData());
        hVar.C("promoUrl");
        this.nullableStringAdapter.mo197toJson(hVar, graphQlPromoAsset.getPromoUrl());
        hVar.C("isEmbedded");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(graphQlPromoAsset.isEmbedded()));
        hVar.l();
    }
}
