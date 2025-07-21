package com.nytimes.android.api.cms.graphql;

import com.nytimes.android.api.cms.Article;
import com.nytimes.android.api.cms.AssetConstants;
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
public final class GraphQlArticleAssetJsonAdapter extends JsonAdapter<GraphQlArticleAsset> {
    private final JsonAdapter<AssetData> assetDataAdapter;
    private volatile Constructor<GraphQlArticleAsset> constructorRef;
    private final JsonAdapter<Article> nullableArticleAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public GraphQlArticleAssetJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("assetData", AssetConstants.ARTICLE_TYPE, "articleSubHeadline");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<AssetData> f = iVar.f(AssetData.class, b0.e(), "assetData");
        zq3.g(f, "adapter(...)");
        this.assetDataAdapter = f;
        JsonAdapter<Article> f2 = iVar.f(Article.class, b0.e(), AssetConstants.ARTICLE_TYPE);
        zq3.g(f2, "adapter(...)");
        this.nullableArticleAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "articleSubHeadline");
        zq3.g(f3, "adapter(...)");
        this.nullableStringAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GraphQlArticleAsset");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GraphQlArticleAsset fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        AssetData assetData = null;
        Article article = null;
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
                article = (Article) this.nullableArticleAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (P == 2) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.h();
        if (i == -7) {
            if (assetData != null) {
                return new GraphQlArticleAsset(assetData, article, str);
            }
            JsonDataException o = c29.o("assetData", "assetData", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<GraphQlArticleAsset> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GraphQlArticleAsset.class.getDeclaredConstructor(AssetData.class, Article.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (assetData != null) {
            GraphQlArticleAsset newInstance = constructor.newInstance(assetData, article, str, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("assetData", "assetData", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GraphQlArticleAsset graphQlArticleAsset) {
        zq3.h(hVar, "writer");
        if (graphQlArticleAsset == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("assetData");
        this.assetDataAdapter.mo197toJson(hVar, graphQlArticleAsset.getAssetData());
        hVar.C(AssetConstants.ARTICLE_TYPE);
        this.nullableArticleAdapter.mo197toJson(hVar, graphQlArticleAsset.getArticle());
        hVar.C("articleSubHeadline");
        this.nullableStringAdapter.mo197toJson(hVar, graphQlArticleAsset.getArticleSubHeadline());
        hVar.l();
    }
}
