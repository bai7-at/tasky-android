package com.nytimes.android.dailyfive.domain;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class NumberedGuideTrendingNodeJsonAdapter extends JsonAdapter<NumberedGuideTrendingNode> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<NumberedGuideTrendingNode> constructorRef;
    private final JsonAdapter<Instant> instantAdapter;
    private final JsonAdapter<Image> nullableImageAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public NumberedGuideTrendingNodeJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("uri", "url", "headline", "summary", "promoMedia", "lastModified", "isOpinion");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "uri");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Image> f2 = iVar.f(Image.class, b0.e(), "promoMedia");
        zq3.g(f2, "adapter(...)");
        this.nullableImageAdapter = f2;
        JsonAdapter<Instant> f3 = iVar.f(Instant.class, b0.e(), "lastModified");
        zq3.g(f3, "adapter(...)");
        this.instantAdapter = f3;
        JsonAdapter<Boolean> f4 = iVar.f(Boolean.TYPE, b0.e(), "isOpinion");
        zq3.g(f4, "adapter(...)");
        this.booleanAdapter = f4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public NumberedGuideTrendingNode fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.b();
        int i = -1;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Image image = null;
        Instant instant = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("uri", "uri", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x2 = c29.x("url", "url", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x3 = c29.x("headline", "headline", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x4 = c29.x("summary", "summary", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    break;
                case 4:
                    image = (Image) this.nullableImageAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    instant = (Instant) this.instantAdapter.fromJson(jsonReader);
                    if (instant == null) {
                        JsonDataException x5 = c29.x("lastModified", "lastModified", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    break;
                case 6:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        JsonDataException x6 = c29.x("isOpinion", "isOpinion", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    i = -65;
                    break;
            }
        }
        jsonReader.h();
        if (i == -65) {
            if (str == null) {
                JsonDataException o = c29.o("uri", "uri", jsonReader);
                zq3.g(o, "missingProperty(...)");
                throw o;
            }
            if (str2 == null) {
                JsonDataException o2 = c29.o("url", "url", jsonReader);
                zq3.g(o2, "missingProperty(...)");
                throw o2;
            }
            if (str3 == null) {
                JsonDataException o3 = c29.o("headline", "headline", jsonReader);
                zq3.g(o3, "missingProperty(...)");
                throw o3;
            }
            if (str4 == null) {
                JsonDataException o4 = c29.o("summary", "summary", jsonReader);
                zq3.g(o4, "missingProperty(...)");
                throw o4;
            }
            if (instant != null) {
                return new NumberedGuideTrendingNode(str, str2, str3, str4, image, instant, bool2.booleanValue());
            }
            JsonDataException o5 = c29.o("lastModified", "lastModified", jsonReader);
            zq3.g(o5, "missingProperty(...)");
            throw o5;
        }
        Constructor<NumberedGuideTrendingNode> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NumberedGuideTrendingNode.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Image.class, Instant.class, Boolean.TYPE, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (str == null) {
            JsonDataException o6 = c29.o("uri", "uri", jsonReader);
            zq3.g(o6, "missingProperty(...)");
            throw o6;
        }
        if (str2 == null) {
            JsonDataException o7 = c29.o("url", "url", jsonReader);
            zq3.g(o7, "missingProperty(...)");
            throw o7;
        }
        if (str3 == null) {
            JsonDataException o8 = c29.o("headline", "headline", jsonReader);
            zq3.g(o8, "missingProperty(...)");
            throw o8;
        }
        if (str4 == null) {
            JsonDataException o9 = c29.o("summary", "summary", jsonReader);
            zq3.g(o9, "missingProperty(...)");
            throw o9;
        }
        if (instant == null) {
            JsonDataException o10 = c29.o("lastModified", "lastModified", jsonReader);
            zq3.g(o10, "missingProperty(...)");
            throw o10;
        }
        NumberedGuideTrendingNode newInstance = constructor.newInstance(str, str2, str3, str4, image, instant, bool2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NumberedGuideTrendingNode numberedGuideTrendingNode) {
        zq3.h(hVar, "writer");
        if (numberedGuideTrendingNode == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("uri");
        this.stringAdapter.mo197toJson(hVar, numberedGuideTrendingNode.d());
        hVar.C("url");
        this.stringAdapter.mo197toJson(hVar, numberedGuideTrendingNode.e());
        hVar.C("headline");
        this.stringAdapter.mo197toJson(hVar, numberedGuideTrendingNode.a());
        hVar.C("summary");
        this.stringAdapter.mo197toJson(hVar, numberedGuideTrendingNode.c());
        hVar.C("promoMedia");
        this.nullableImageAdapter.mo197toJson(hVar, numberedGuideTrendingNode.b());
        hVar.C("lastModified");
        this.instantAdapter.mo197toJson(hVar, numberedGuideTrendingNode.g());
        hVar.C("isOpinion");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(numberedGuideTrendingNode.f()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NumberedGuideTrendingNode");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
