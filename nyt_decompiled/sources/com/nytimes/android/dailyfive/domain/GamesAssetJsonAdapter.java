package com.nytimes.android.dailyfive.domain;

import com.appsflyer.AppsFlyerProperties;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class GamesAssetJsonAdapter extends JsonAdapter<GamesAsset> {
    public static final int $stable = 8;
    private final JsonAdapter<DailyFiveChannel> dailyFiveChannelAdapter;
    private final JsonAdapter<GamesNode> gamesNodeAdapter;
    private final JsonReader.b options;

    public GamesAssetJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("node", AppsFlyerProperties.CHANNEL);
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<GamesNode> f = iVar.f(GamesNode.class, b0.e(), "node");
        zq3.g(f, "adapter(...)");
        this.gamesNodeAdapter = f;
        JsonAdapter<DailyFiveChannel> f2 = iVar.f(DailyFiveChannel.class, b0.e(), AppsFlyerProperties.CHANNEL);
        zq3.g(f2, "adapter(...)");
        this.dailyFiveChannelAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public GamesAsset fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        GamesNode gamesNode = null;
        DailyFiveChannel dailyFiveChannel = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                gamesNode = (GamesNode) this.gamesNodeAdapter.fromJson(jsonReader);
                if (gamesNode == null) {
                    JsonDataException x = c29.x("node", "node", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (dailyFiveChannel = (DailyFiveChannel) this.dailyFiveChannelAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x(AppsFlyerProperties.CHANNEL, AppsFlyerProperties.CHANNEL, jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (gamesNode == null) {
            JsonDataException o = c29.o("node", "node", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (dailyFiveChannel != null) {
            return new GamesAsset(gamesNode, dailyFiveChannel);
        }
        JsonDataException o2 = c29.o(AppsFlyerProperties.CHANNEL, AppsFlyerProperties.CHANNEL, jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GamesAsset gamesAsset) {
        zq3.h(hVar, "writer");
        if (gamesAsset == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("node");
        this.gamesNodeAdapter.mo197toJson(hVar, gamesAsset.c());
        hVar.C(AppsFlyerProperties.CHANNEL);
        this.dailyFiveChannelAdapter.mo197toJson(hVar, gamesAsset.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GamesAsset");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
