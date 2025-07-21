package com.nytimes.android.api.cms.graphql;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.Audio;
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
public final class GraphQlAudioAssetJsonAdapter extends JsonAdapter<GraphQlAudioAsset> {
    private final JsonAdapter<AssetData> assetDataAdapter;
    private volatile Constructor<GraphQlAudioAsset> constructorRef;
    private final JsonAdapter<Audio> nullableAudioAdapter;
    private final JsonReader.b options;

    public GraphQlAudioAssetJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("assetData", AssetConstants.AUDIO_TYPE);
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<AssetData> f = iVar.f(AssetData.class, b0.e(), "assetData");
        zq3.g(f, "adapter(...)");
        this.assetDataAdapter = f;
        JsonAdapter<Audio> f2 = iVar.f(Audio.class, b0.e(), AssetConstants.AUDIO_TYPE);
        zq3.g(f2, "adapter(...)");
        this.nullableAudioAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GraphQlAudioAsset");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GraphQlAudioAsset fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        AssetData assetData = null;
        Audio audio = null;
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
                audio = (Audio) this.nullableAudioAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.h();
        if (i == -3) {
            if (assetData != null) {
                return new GraphQlAudioAsset(assetData, audio);
            }
            JsonDataException o = c29.o("assetData", "assetData", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<GraphQlAudioAsset> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GraphQlAudioAsset.class.getDeclaredConstructor(AssetData.class, Audio.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (assetData != null) {
            GraphQlAudioAsset newInstance = constructor.newInstance(assetData, audio, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("assetData", "assetData", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GraphQlAudioAsset graphQlAudioAsset) {
        zq3.h(hVar, "writer");
        if (graphQlAudioAsset == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("assetData");
        this.assetDataAdapter.mo197toJson(hVar, graphQlAudioAsset.getAssetData());
        hVar.C(AssetConstants.AUDIO_TYPE);
        this.nullableAudioAdapter.mo197toJson(hVar, graphQlAudioAsset.getAudio());
        hVar.l();
    }
}
