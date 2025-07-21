package com.nytimes.android.api.cms;

import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
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
public final class PodcastSeriesJsonAdapter extends JsonAdapter<PodcastSeries> {
    private volatile Constructor<PodcastSeries> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Asset> nullableAssetAdapter;
    private final JsonAdapter<List<SubscribeUrl>> nullableListOfSubscribeUrlAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public PodcastSeriesJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("seriesId", AuthenticationTokenClaims.JSON_KEY_NAME, "title", "subtitle", "summary", "linkUrl", "subscribeUrls", AssetConstants.IMAGE_TYPE);
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "seriesId");
        zq3.g(f, "adapter(...)");
        this.longAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
        JsonAdapter<List<SubscribeUrl>> f3 = iVar.f(j.j(List.class, SubscribeUrl.class), b0.e(), "subscribeUrls");
        zq3.g(f3, "adapter(...)");
        this.nullableListOfSubscribeUrlAdapter = f3;
        JsonAdapter<Asset> f4 = iVar.f(Asset.class, b0.e(), AssetConstants.IMAGE_TYPE);
        zq3.g(f4, "adapter(...)");
        this.nullableAssetAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PodcastSeries");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public PodcastSeries fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        int i = -1;
        Long l = 0L;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        Asset asset = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException x = c29.x("seriesId", "seriesId", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    i &= -2;
                    break;
                case 1:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    list = (List) this.nullableListOfSubscribeUrlAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    asset = (Asset) this.nullableAssetAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
            }
        }
        jsonReader.h();
        if (i == -256) {
            return new PodcastSeries(l.longValue(), str, str2, str3, str4, str5, list, asset);
        }
        Constructor<PodcastSeries> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PodcastSeries.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, String.class, String.class, String.class, List.class, Asset.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        PodcastSeries newInstance = constructor.newInstance(l, str, str2, str3, str4, str5, list, asset, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PodcastSeries podcastSeries) {
        zq3.h(hVar, "writer");
        if (podcastSeries == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("seriesId");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(podcastSeries.getSeriesId()));
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.nullableStringAdapter.mo197toJson(hVar, podcastSeries.getName());
        hVar.C("title");
        this.nullableStringAdapter.mo197toJson(hVar, podcastSeries.getTitle());
        hVar.C("subtitle");
        this.nullableStringAdapter.mo197toJson(hVar, podcastSeries.getSubtitle());
        hVar.C("summary");
        this.nullableStringAdapter.mo197toJson(hVar, podcastSeries.getSummary());
        hVar.C("linkUrl");
        this.nullableStringAdapter.mo197toJson(hVar, podcastSeries.getLinkUrl());
        hVar.C("subscribeUrls");
        this.nullableListOfSubscribeUrlAdapter.mo197toJson(hVar, podcastSeries.getSubscribeUrls());
        hVar.C(AssetConstants.IMAGE_TYPE);
        this.nullableAssetAdapter.mo197toJson(hVar, podcastSeries.getImage());
        hVar.l();
    }
}
