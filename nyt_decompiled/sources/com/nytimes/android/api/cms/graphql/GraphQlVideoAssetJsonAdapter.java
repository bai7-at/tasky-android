package com.nytimes.android.api.cms.graphql;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.Video;
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
public final class GraphQlVideoAssetJsonAdapter extends JsonAdapter<GraphQlVideoAsset> {
    private final JsonAdapter<AssetData> assetDataAdapter;
    private volatile Constructor<GraphQlVideoAsset> constructorRef;
    private final JsonAdapter<Video> nullableVideoAdapter;
    private final JsonReader.b options;

    public GraphQlVideoAssetJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("assetData", AssetConstants.VIDEO_TYPE);
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<AssetData> f = iVar.f(AssetData.class, b0.e(), "assetData");
        zq3.g(f, "adapter(...)");
        this.assetDataAdapter = f;
        JsonAdapter<Video> f2 = iVar.f(Video.class, b0.e(), AssetConstants.VIDEO_TYPE);
        zq3.g(f2, "adapter(...)");
        this.nullableVideoAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GraphQlVideoAsset");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GraphQlVideoAsset fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        AssetData assetData = null;
        Video video = null;
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
                video = (Video) this.nullableVideoAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.h();
        if (i == -3) {
            if (assetData != null) {
                return new GraphQlVideoAsset(assetData, video);
            }
            JsonDataException o = c29.o("assetData", "assetData", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<GraphQlVideoAsset> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GraphQlVideoAsset.class.getDeclaredConstructor(AssetData.class, Video.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (assetData != null) {
            GraphQlVideoAsset newInstance = constructor.newInstance(assetData, video, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("assetData", "assetData", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GraphQlVideoAsset graphQlVideoAsset) {
        zq3.h(hVar, "writer");
        if (graphQlVideoAsset == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("assetData");
        this.assetDataAdapter.mo197toJson(hVar, graphQlVideoAsset.getAssetData());
        hVar.C(AssetConstants.VIDEO_TYPE);
        this.nullableVideoAdapter.mo197toJson(hVar, graphQlVideoAsset.getVideo());
        hVar.l();
    }
}
