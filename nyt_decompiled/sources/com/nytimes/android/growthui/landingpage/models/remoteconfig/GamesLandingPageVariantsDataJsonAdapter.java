package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class GamesLandingPageVariantsDataJsonAdapter extends JsonAdapter<GamesLandingPageVariantsData> {
    public static final int $stable = 8;
    private volatile Constructor<GamesLandingPageVariantsData> constructorRef;
    private final JsonAdapter<GamesLandingPageData> gamesLandingPageDataAdapter;
    private final JsonAdapter<Map<String, GamesLandingPageData>> nullableMapOfStringGamesLandingPageDataAdapter;
    private final JsonReader.b options;

    public GamesLandingPageVariantsDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("config", "variants");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<GamesLandingPageData> f = iVar.f(GamesLandingPageData.class, b0.e(), "config");
        zq3.g(f, "adapter(...)");
        this.gamesLandingPageDataAdapter = f;
        JsonAdapter<Map<String, GamesLandingPageData>> f2 = iVar.f(j.j(Map.class, String.class, GamesLandingPageData.class), b0.e(), "variants");
        zq3.g(f2, "adapter(...)");
        this.nullableMapOfStringGamesLandingPageDataAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public GamesLandingPageVariantsData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        GamesLandingPageData gamesLandingPageData = null;
        Map map = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                gamesLandingPageData = (GamesLandingPageData) this.gamesLandingPageDataAdapter.fromJson(jsonReader);
                if (gamesLandingPageData == null) {
                    JsonDataException x = c29.x("config", "config", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -2;
            } else if (P == 1) {
                map = (Map) this.nullableMapOfStringGamesLandingPageDataAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.h();
        if (i == -4) {
            zq3.f(gamesLandingPageData, "null cannot be cast to non-null type com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageData");
            return new GamesLandingPageVariantsData(gamesLandingPageData, map);
        }
        Constructor<GamesLandingPageVariantsData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GamesLandingPageVariantsData.class.getDeclaredConstructor(GamesLandingPageData.class, Map.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        GamesLandingPageVariantsData newInstance = constructor.newInstance(gamesLandingPageData, map, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GamesLandingPageVariantsData gamesLandingPageVariantsData) {
        zq3.h(hVar, "writer");
        if (gamesLandingPageVariantsData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("config");
        this.gamesLandingPageDataAdapter.mo197toJson(hVar, gamesLandingPageVariantsData.a());
        hVar.C("variants");
        this.nullableMapOfStringGamesLandingPageDataAdapter.mo197toJson(hVar, gamesLandingPageVariantsData.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GamesLandingPageVariantsData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
