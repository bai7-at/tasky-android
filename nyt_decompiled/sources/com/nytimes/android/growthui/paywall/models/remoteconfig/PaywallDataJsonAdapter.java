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
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PaywallDataJsonAdapter extends JsonAdapter<PaywallData> {
    public static final int $stable = 8;
    private volatile Constructor<PaywallData> constructorRef;
    private final JsonAdapter<List<PaywallUrgencyMessageData>> nullableListOfPaywallUrgencyMessageDataAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public PaywallDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("topperText", "icons", "header", "buttonText", "paywallUrgencyMessages");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "topperText");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<List<String>> f2 = iVar.f(j.j(List.class, String.class), b0.e(), "icons");
        zq3.g(f2, "adapter(...)");
        this.nullableListOfStringAdapter = f2;
        JsonAdapter<List<PaywallUrgencyMessageData>> f3 = iVar.f(j.j(List.class, PaywallUrgencyMessageData.class), b0.e(), "paywallUrgencyMessages");
        zq3.g(f3, "adapter(...)");
        this.nullableListOfPaywallUrgencyMessageDataAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PaywallData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        List list2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("topperText", "topperText", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -2;
            } else if (P == 1) {
                list = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (P == 2) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException x2 = c29.x("header_", "header", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i &= -5;
            } else if (P == 3) {
                str3 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    JsonDataException x3 = c29.x("buttonText", "buttonText", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
                i &= -9;
            } else if (P == 4) {
                list2 = (List) this.nullableListOfPaywallUrgencyMessageDataAdapter.fromJson(jsonReader);
                i &= -17;
            }
        }
        jsonReader.h();
        if (i == -32) {
            zq3.f(str, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str2, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str3, "null cannot be cast to non-null type kotlin.String");
            return new PaywallData(str, list, str2, str3, list2);
        }
        Constructor<PaywallData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PaywallData.class.getDeclaredConstructor(String.class, List.class, String.class, String.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        PaywallData newInstance = constructor.newInstance(str, list, str2, str3, list2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PaywallData paywallData) {
        zq3.h(hVar, "writer");
        if (paywallData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("topperText");
        this.stringAdapter.mo197toJson(hVar, paywallData.e());
        hVar.C("icons");
        this.nullableListOfStringAdapter.mo197toJson(hVar, paywallData.c());
        hVar.C("header");
        this.stringAdapter.mo197toJson(hVar, paywallData.b());
        hVar.C("buttonText");
        this.stringAdapter.mo197toJson(hVar, paywallData.a());
        hVar.C("paywallUrgencyMessages");
        this.nullableListOfPaywallUrgencyMessageDataAdapter.mo197toJson(hVar, paywallData.d());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PaywallData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
