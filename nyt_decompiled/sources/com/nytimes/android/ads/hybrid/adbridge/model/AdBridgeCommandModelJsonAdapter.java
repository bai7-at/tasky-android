package com.nytimes.android.ads.hybrid.adbridge.model;

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

/* loaded from: classes2.dex */
public final class AdBridgeCommandModelJsonAdapter extends JsonAdapter<AdBridgeCommandModel> {
    private final JsonAdapter<AdSlotEvent> adSlotEventAdapter;
    private volatile Constructor<AdBridgeCommandModel> constructorRef;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonReader.b options;

    public AdBridgeCommandModelJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("eventName", "eventData");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<AdSlotEvent> f = iVar.f(AdSlotEvent.class, b0.e(), "eventName");
        zq3.g(f, "adapter(...)");
        this.adSlotEventAdapter = f;
        JsonAdapter<Map<String, Object>> f2 = iVar.f(j.j(Map.class, String.class, Object.class), b0.e(), "eventData");
        zq3.g(f2, "adapter(...)");
        this.nullableMapOfStringAnyAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AdBridgeCommandModel fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        AdSlotEvent adSlotEvent = null;
        Map map = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                adSlotEvent = (AdSlotEvent) this.adSlotEventAdapter.fromJson(jsonReader);
                if (adSlotEvent == null) {
                    JsonDataException x = c29.x("eventName", "eventName", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i = -2;
            } else if (P == 1) {
                map = (Map) this.nullableMapOfStringAnyAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (i == -2) {
            zq3.f(adSlotEvent, "null cannot be cast to non-null type com.nytimes.android.ads.hybrid.adbridge.model.AdSlotEvent");
            return new AdBridgeCommandModel(adSlotEvent, map);
        }
        Constructor<AdBridgeCommandModel> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AdBridgeCommandModel.class.getDeclaredConstructor(AdSlotEvent.class, Map.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        AdBridgeCommandModel newInstance = constructor.newInstance(adSlotEvent, map, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AdBridgeCommandModel adBridgeCommandModel) {
        zq3.h(hVar, "writer");
        if (adBridgeCommandModel == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("eventName");
        this.adSlotEventAdapter.mo197toJson(hVar, adBridgeCommandModel.b());
        hVar.C("eventData");
        this.nullableMapOfStringAnyAdapter.mo197toJson(hVar, adBridgeCommandModel.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AdBridgeCommandModel");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
