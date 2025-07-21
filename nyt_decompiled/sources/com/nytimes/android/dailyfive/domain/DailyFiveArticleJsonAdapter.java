package com.nytimes.android.dailyfive.domain;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class DailyFiveArticleJsonAdapter extends JsonAdapter<DailyFiveArticle> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<DailyFiveAsset> dailyFiveAssetAdapter;
    private final JsonAdapter<List<DailyFiveChannel>> listOfDailyFiveChannelAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public DailyFiveArticleJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("kicker", "isEditorial", "packChannelURI", "promoText", "channels", "asset");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "kicker");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "isEditorial");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
        JsonAdapter<List<DailyFiveChannel>> f3 = iVar.f(j.j(List.class, DailyFiveChannel.class), b0.e(), "channels");
        zq3.g(f3, "adapter(...)");
        this.listOfDailyFiveChannelAdapter = f3;
        JsonAdapter<DailyFiveAsset> f4 = iVar.f(DailyFiveAsset.class, b0.e(), "asset");
        zq3.g(f4, "adapter(...)");
        this.dailyFiveAssetAdapter = f4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DailyFiveArticle fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        DailyFiveAsset dailyFiveAsset = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("kicker", "kicker", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    break;
                case 1:
                    bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        JsonDataException x2 = c29.x("isEditorial", "isEditorial", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    break;
                case 2:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x3 = c29.x("packChannelURI", "packChannelURI", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    break;
                case 3:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x4 = c29.x("promoText", "promoText", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    break;
                case 4:
                    list = (List) this.listOfDailyFiveChannelAdapter.fromJson(jsonReader);
                    if (list == null) {
                        JsonDataException x5 = c29.x("channels", "channels", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    break;
                case 5:
                    dailyFiveAsset = (DailyFiveAsset) this.dailyFiveAssetAdapter.fromJson(jsonReader);
                    if (dailyFiveAsset == null) {
                        JsonDataException x6 = c29.x("asset", "asset", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    break;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("kicker", "kicker", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (bool == null) {
            JsonDataException o2 = c29.o("isEditorial", "isEditorial", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        boolean booleanValue = bool.booleanValue();
        if (str2 == null) {
            JsonDataException o3 = c29.o("packChannelURI", "packChannelURI", jsonReader);
            zq3.g(o3, "missingProperty(...)");
            throw o3;
        }
        if (str3 == null) {
            JsonDataException o4 = c29.o("promoText", "promoText", jsonReader);
            zq3.g(o4, "missingProperty(...)");
            throw o4;
        }
        if (list == null) {
            JsonDataException o5 = c29.o("channels", "channels", jsonReader);
            zq3.g(o5, "missingProperty(...)");
            throw o5;
        }
        if (dailyFiveAsset != null) {
            return new DailyFiveArticle(str, booleanValue, str2, str3, list, dailyFiveAsset);
        }
        JsonDataException o6 = c29.o("asset", "asset", jsonReader);
        zq3.g(o6, "missingProperty(...)");
        throw o6;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, DailyFiveArticle dailyFiveArticle) {
        zq3.h(hVar, "writer");
        if (dailyFiveArticle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("kicker");
        this.stringAdapter.mo197toJson(hVar, dailyFiveArticle.c());
        hVar.C("isEditorial");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(dailyFiveArticle.f()));
        hVar.C("packChannelURI");
        this.stringAdapter.mo197toJson(hVar, dailyFiveArticle.d());
        hVar.C("promoText");
        this.stringAdapter.mo197toJson(hVar, dailyFiveArticle.e());
        hVar.C("channels");
        this.listOfDailyFiveChannelAdapter.mo197toJson(hVar, dailyFiveArticle.b());
        hVar.C("asset");
        this.dailyFiveAssetAdapter.mo197toJson(hVar, dailyFiveArticle.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DailyFiveArticle");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
