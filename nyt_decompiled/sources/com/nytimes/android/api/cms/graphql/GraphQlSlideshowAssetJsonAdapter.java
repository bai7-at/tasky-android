package com.nytimes.android.api.cms.graphql;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.Slideshow;
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
public final class GraphQlSlideshowAssetJsonAdapter extends JsonAdapter<GraphQlSlideshowAsset> {
    private final JsonAdapter<AssetData> assetDataAdapter;
    private volatile Constructor<GraphQlSlideshowAsset> constructorRef;
    private final JsonAdapter<Slideshow> nullableSlideshowAdapter;
    private final JsonReader.b options;

    public GraphQlSlideshowAssetJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("assetData", AssetConstants.SLIDESHOW_TYPE);
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<AssetData> f = iVar.f(AssetData.class, b0.e(), "assetData");
        zq3.g(f, "adapter(...)");
        this.assetDataAdapter = f;
        JsonAdapter<Slideshow> f2 = iVar.f(Slideshow.class, b0.e(), AssetConstants.SLIDESHOW_TYPE);
        zq3.g(f2, "adapter(...)");
        this.nullableSlideshowAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GraphQlSlideshowAsset");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GraphQlSlideshowAsset fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        AssetData assetData = null;
        Slideshow slideshow = null;
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
                slideshow = (Slideshow) this.nullableSlideshowAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.h();
        if (i == -3) {
            if (assetData != null) {
                return new GraphQlSlideshowAsset(assetData, slideshow);
            }
            JsonDataException o = c29.o("assetData", "assetData", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<GraphQlSlideshowAsset> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GraphQlSlideshowAsset.class.getDeclaredConstructor(AssetData.class, Slideshow.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (assetData != null) {
            GraphQlSlideshowAsset newInstance = constructor.newInstance(assetData, slideshow, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("assetData", "assetData", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GraphQlSlideshowAsset graphQlSlideshowAsset) {
        zq3.h(hVar, "writer");
        if (graphQlSlideshowAsset == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("assetData");
        this.assetDataAdapter.mo197toJson(hVar, graphQlSlideshowAsset.getAssetData());
        hVar.C(AssetConstants.SLIDESHOW_TYPE);
        this.nullableSlideshowAdapter.mo197toJson(hVar, graphQlSlideshowAsset.getSlideshow());
        hVar.l();
    }
}
