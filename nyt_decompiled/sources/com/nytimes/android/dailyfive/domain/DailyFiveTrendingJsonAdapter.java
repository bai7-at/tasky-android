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
public final class DailyFiveTrendingJsonAdapter extends JsonAdapter<DailyFiveTrending> {
    public static final int $stable = 8;
    private final JsonAdapter<List<DailyFiveAsset>> listOfDailyFiveAssetAdapter;
    private final JsonAdapter<List<DailyFiveChannel>> listOfDailyFiveChannelAdapter;
    private final JsonReader.b options;

    public DailyFiveTrendingJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("channels", "assets");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<List<DailyFiveChannel>> f = iVar.f(j.j(List.class, DailyFiveChannel.class), b0.e(), "channels");
        zq3.g(f, "adapter(...)");
        this.listOfDailyFiveChannelAdapter = f;
        JsonAdapter<List<DailyFiveAsset>> f2 = iVar.f(j.j(List.class, DailyFiveAsset.class), b0.e(), "assets");
        zq3.g(f2, "adapter(...)");
        this.listOfDailyFiveAssetAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DailyFiveTrending fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        List list2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.listOfDailyFiveChannelAdapter.fromJson(jsonReader);
                if (list == null) {
                    JsonDataException x = c29.x("channels", "channels", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (list2 = (List) this.listOfDailyFiveAssetAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("assets", "assets", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (list == null) {
            JsonDataException o = c29.o("channels", "channels", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (list2 != null) {
            return new DailyFiveTrending(list, list2);
        }
        JsonDataException o2 = c29.o("assets", "assets", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, DailyFiveTrending dailyFiveTrending) {
        zq3.h(hVar, "writer");
        if (dailyFiveTrending == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("channels");
        this.listOfDailyFiveChannelAdapter.mo197toJson(hVar, dailyFiveTrending.b());
        hVar.C("assets");
        this.listOfDailyFiveAssetAdapter.mo197toJson(hVar, dailyFiveTrending.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DailyFiveTrending");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
