package com.nytimes.android.api.cms.graphql;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.Image;
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
public final class GraphQlImageAssetJsonAdapter extends JsonAdapter<GraphQlImageAsset> {
    private final JsonAdapter<AssetData> assetDataAdapter;
    private volatile Constructor<GraphQlImageAsset> constructorRef;
    private final JsonAdapter<Image> nullableImageAdapter;
    private final JsonReader.b options;

    public GraphQlImageAssetJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("assetData", AssetConstants.IMAGE_TYPE);
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<AssetData> f = iVar.f(AssetData.class, b0.e(), "assetData");
        zq3.g(f, "adapter(...)");
        this.assetDataAdapter = f;
        JsonAdapter<Image> f2 = iVar.f(Image.class, b0.e(), AssetConstants.IMAGE_TYPE);
        zq3.g(f2, "adapter(...)");
        this.nullableImageAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GraphQlImageAsset");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GraphQlImageAsset fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        AssetData assetData = null;
        Image image = null;
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
                image = (Image) this.nullableImageAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.h();
        if (i == -3) {
            if (assetData != null) {
                return new GraphQlImageAsset(assetData, image);
            }
            JsonDataException o = c29.o("assetData", "assetData", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<GraphQlImageAsset> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GraphQlImageAsset.class.getDeclaredConstructor(AssetData.class, Image.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (assetData != null) {
            GraphQlImageAsset newInstance = constructor.newInstance(assetData, image, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("assetData", "assetData", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GraphQlImageAsset graphQlImageAsset) {
        zq3.h(hVar, "writer");
        if (graphQlImageAsset == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("assetData");
        this.assetDataAdapter.mo197toJson(hVar, graphQlImageAsset.getAssetData());
        hVar.C(AssetConstants.IMAGE_TYPE);
        this.nullableImageAdapter.mo197toJson(hVar, graphQlImageAsset.getImage());
        hVar.l();
    }
}
