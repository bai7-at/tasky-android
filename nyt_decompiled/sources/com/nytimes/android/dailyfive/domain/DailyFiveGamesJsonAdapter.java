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
public final class DailyFiveGamesJsonAdapter extends JsonAdapter<DailyFiveGames> {
    public static final int $stable = 8;
    private final JsonAdapter<List<GamesAsset>> listOfGamesAssetAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public DailyFiveGamesJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("kicker", "assets");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "kicker");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<List<GamesAsset>> f2 = iVar.f(j.j(List.class, GamesAsset.class), b0.e(), "assets");
        zq3.g(f2, "adapter(...)");
        this.listOfGamesAssetAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DailyFiveGames fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("kicker", "kicker", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (list = (List) this.listOfGamesAssetAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("assets", "assets", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("kicker", "kicker", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (list != null) {
            return new DailyFiveGames(str, list);
        }
        JsonDataException o2 = c29.o("assets", "assets", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, DailyFiveGames dailyFiveGames) {
        zq3.h(hVar, "writer");
        if (dailyFiveGames == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("kicker");
        this.stringAdapter.mo197toJson(hVar, dailyFiveGames.b());
        hVar.C("assets");
        this.listOfGamesAssetAdapter.mo197toJson(hVar, dailyFiveGames.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DailyFiveGames");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
