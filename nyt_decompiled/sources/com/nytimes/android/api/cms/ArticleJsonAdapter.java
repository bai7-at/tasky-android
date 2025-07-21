package com.nytimes.android.api.cms;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class ArticleJsonAdapter extends JsonAdapter<Article> {
    private volatile Constructor<Article> constructorRef;
    private final JsonAdapter<HybridContent> nullableHybridContentAdapter;
    private final JsonAdapter<List<HybridImage>> nullableListOfHybridImageAdapter;
    private final JsonAdapter<List<HybridResource>> nullableListOfHybridResourceAdapter;
    private final JsonReader.b options;

    public ArticleJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("hybridContent", "hybridResources", "hybridImages");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<HybridContent> f = iVar.f(HybridContent.class, b0.e(), "hybridContent");
        zq3.g(f, "adapter(...)");
        this.nullableHybridContentAdapter = f;
        JsonAdapter<List<HybridResource>> f2 = iVar.f(j.j(List.class, HybridResource.class), b0.e(), "hybridResources");
        zq3.g(f2, "adapter(...)");
        this.nullableListOfHybridResourceAdapter = f2;
        JsonAdapter<List<HybridImage>> f3 = iVar.f(j.j(List.class, HybridImage.class), b0.e(), "hybridImages");
        zq3.g(f3, "adapter(...)");
        this.nullableListOfHybridImageAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(29);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Article");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Article fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        HybridContent hybridContent = null;
        List list = null;
        List list2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                hybridContent = (HybridContent) this.nullableHybridContentAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (P == 1) {
                list = (List) this.nullableListOfHybridResourceAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (P == 2) {
                list2 = (List) this.nullableListOfHybridImageAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.h();
        if (i == -8) {
            return new Article(hybridContent, list, list2);
        }
        Constructor<Article> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Article.class.getDeclaredConstructor(HybridContent.class, List.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        Article newInstance = constructor.newInstance(hybridContent, list, list2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Article article) {
        zq3.h(hVar, "writer");
        if (article == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("hybridContent");
        this.nullableHybridContentAdapter.mo197toJson(hVar, article.getHybridContent());
        hVar.C("hybridResources");
        this.nullableListOfHybridResourceAdapter.mo197toJson(hVar, article.getHybridResources());
        hVar.C("hybridImages");
        this.nullableListOfHybridImageAdapter.mo197toJson(hVar, article.getHybridImages());
        hVar.l();
    }
}
