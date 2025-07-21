package com.nytimes.android.growthui.paywall.models.remoteconfig;

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
public final class PaywallConfigsDataJsonAdapter extends JsonAdapter<PaywallConfigsData> {
    public static final int $stable = 8;
    private volatile Constructor<PaywallConfigsData> constructorRef;
    private final JsonAdapter<Map<String, PaywallData>> nullableMapOfStringPaywallDataAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<PaywallData> paywallDataAdapter;

    public PaywallConfigsDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("config", "variants");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<PaywallData> f = iVar.f(PaywallData.class, b0.e(), "config");
        zq3.g(f, "adapter(...)");
        this.paywallDataAdapter = f;
        JsonAdapter<Map<String, PaywallData>> f2 = iVar.f(j.j(Map.class, String.class, PaywallData.class), b0.e(), "variants");
        zq3.g(f2, "adapter(...)");
        this.nullableMapOfStringPaywallDataAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PaywallConfigsData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        PaywallData paywallData = null;
        Map map = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                paywallData = (PaywallData) this.paywallDataAdapter.fromJson(jsonReader);
                if (paywallData == null) {
                    JsonDataException x = c29.x("config", "config", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -2;
            } else if (P == 1) {
                map = (Map) this.nullableMapOfStringPaywallDataAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.h();
        if (i == -4) {
            zq3.f(paywallData, "null cannot be cast to non-null type com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallData");
            return new PaywallConfigsData(paywallData, map);
        }
        Constructor<PaywallConfigsData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PaywallConfigsData.class.getDeclaredConstructor(PaywallData.class, Map.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        PaywallConfigsData newInstance = constructor.newInstance(paywallData, map, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PaywallConfigsData paywallConfigsData) {
        zq3.h(hVar, "writer");
        if (paywallConfigsData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("config");
        this.paywallDataAdapter.mo197toJson(hVar, paywallConfigsData.a());
        hVar.C("variants");
        this.nullableMapOfStringPaywallDataAdapter.mo197toJson(hVar, paywallConfigsData.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PaywallConfigsData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
