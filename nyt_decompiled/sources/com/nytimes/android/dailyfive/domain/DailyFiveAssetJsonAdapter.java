package com.nytimes.android.dailyfive.domain;

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

/* loaded from: classes4.dex */
public final class DailyFiveAssetJsonAdapter extends JsonAdapter<DailyFiveAsset> {
    public static final int $stable = 8;
    private volatile Constructor<DailyFiveAsset> constructorRef;
    private final JsonAdapter<b> dailyFiveNodeAdapter;
    private final JsonAdapter<List<TrackingParam>> nullableListOfTrackingParamAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public DailyFiveAssetJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("channelUri", "node", "trackingParams");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "channelUri");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<b> f2 = iVar.f(b.class, b0.e(), "node");
        zq3.g(f2, "adapter(...)");
        this.dailyFiveNodeAdapter = f2;
        JsonAdapter<List<TrackingParam>> f3 = iVar.f(j.j(List.class, TrackingParam.class), b0.e(), "trackingParams");
        zq3.g(f3, "adapter(...)");
        this.nullableListOfTrackingParamAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DailyFiveAsset fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        b bVar = null;
        List list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                bVar = (b) this.dailyFiveNodeAdapter.fromJson(jsonReader);
                if (bVar == null) {
                    JsonDataException x = c29.x("node", "node", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 2) {
                list = (List) this.nullableListOfTrackingParamAdapter.fromJson(jsonReader);
                i = -5;
            }
        }
        jsonReader.h();
        if (i == -5) {
            if (bVar != null) {
                return new DailyFiveAsset(str, bVar, list);
            }
            JsonDataException o = c29.o("node", "node", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<DailyFiveAsset> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DailyFiveAsset.class.getDeclaredConstructor(String.class, b.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (bVar != null) {
            DailyFiveAsset newInstance = constructor.newInstance(str, bVar, list, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("node", "node", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, DailyFiveAsset dailyFiveAsset) {
        zq3.h(hVar, "writer");
        if (dailyFiveAsset == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("channelUri");
        this.nullableStringAdapter.mo197toJson(hVar, dailyFiveAsset.a());
        hVar.C("node");
        this.dailyFiveNodeAdapter.mo197toJson(hVar, dailyFiveAsset.b());
        hVar.C("trackingParams");
        this.nullableListOfTrackingParamAdapter.mo197toJson(hVar, dailyFiveAsset.c());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DailyFiveAsset");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
