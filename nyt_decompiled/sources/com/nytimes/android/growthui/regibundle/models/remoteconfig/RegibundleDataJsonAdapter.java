package com.nytimes.android.growthui.regibundle.models.remoteconfig;

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
public final class RegibundleDataJsonAdapter extends JsonAdapter<RegibundleData> {
    public static final int $stable = 8;
    private volatile Constructor<RegibundleData> constructorRef;
    private final JsonAdapter<List<RegibundleSkuOverrideData>> nullableListOfRegibundleSkuOverrideDataAdapter;
    private final JsonAdapter<List<RegibundleUrgencyMessageData>> nullableListOfRegibundleUrgencyMessageDataAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<RegistrationData> registrationDataAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<SubscriptionData> subscriptionDataAdapter;

    public RegibundleDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("loginText", "registration", "subscription", "subscriptionUrgencyMessages", "automatedSkuChanges");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "loginText");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<RegistrationData> f2 = iVar.f(RegistrationData.class, b0.e(), "registration");
        zq3.g(f2, "adapter(...)");
        this.registrationDataAdapter = f2;
        JsonAdapter<SubscriptionData> f3 = iVar.f(SubscriptionData.class, b0.e(), "subscription");
        zq3.g(f3, "adapter(...)");
        this.subscriptionDataAdapter = f3;
        JsonAdapter<List<RegibundleUrgencyMessageData>> f4 = iVar.f(j.j(List.class, RegibundleUrgencyMessageData.class), b0.e(), "subscriptionUrgencyMessages");
        zq3.g(f4, "adapter(...)");
        this.nullableListOfRegibundleUrgencyMessageDataAdapter = f4;
        JsonAdapter<List<RegibundleSkuOverrideData>> f5 = iVar.f(j.j(List.class, RegibundleSkuOverrideData.class), b0.e(), "automatedSkuChanges");
        zq3.g(f5, "adapter(...)");
        this.nullableListOfRegibundleSkuOverrideDataAdapter = f5;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RegibundleData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        RegistrationData registrationData = null;
        SubscriptionData subscriptionData = null;
        List list = null;
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
                    JsonDataException x = c29.x("loginText", "loginText", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -2;
            } else if (P == 1) {
                registrationData = (RegistrationData) this.registrationDataAdapter.fromJson(jsonReader);
                if (registrationData == null) {
                    JsonDataException x2 = c29.x("registration", "registration", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i &= -3;
            } else if (P == 2) {
                subscriptionData = (SubscriptionData) this.subscriptionDataAdapter.fromJson(jsonReader);
                if (subscriptionData == null) {
                    JsonDataException x3 = c29.x("subscription", "subscription", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
                i &= -5;
            } else if (P == 3) {
                list = (List) this.nullableListOfRegibundleUrgencyMessageDataAdapter.fromJson(jsonReader);
                i &= -9;
            } else if (P == 4) {
                list2 = (List) this.nullableListOfRegibundleSkuOverrideDataAdapter.fromJson(jsonReader);
                i &= -17;
            }
        }
        jsonReader.h();
        if (i == -32) {
            zq3.f(str, "null cannot be cast to non-null type kotlin.String");
            zq3.f(registrationData, "null cannot be cast to non-null type com.nytimes.android.growthui.regibundle.models.remoteconfig.RegistrationData");
            zq3.f(subscriptionData, "null cannot be cast to non-null type com.nytimes.android.growthui.regibundle.models.remoteconfig.SubscriptionData");
            return new RegibundleData(str, registrationData, subscriptionData, list, list2);
        }
        Constructor<RegibundleData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = RegibundleData.class.getDeclaredConstructor(String.class, RegistrationData.class, SubscriptionData.class, List.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        RegibundleData newInstance = constructor.newInstance(str, registrationData, subscriptionData, list, list2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, RegibundleData regibundleData) {
        zq3.h(hVar, "writer");
        if (regibundleData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("loginText");
        this.stringAdapter.mo197toJson(hVar, regibundleData.b());
        hVar.C("registration");
        this.registrationDataAdapter.mo197toJson(hVar, regibundleData.c());
        hVar.C("subscription");
        this.subscriptionDataAdapter.mo197toJson(hVar, regibundleData.d());
        hVar.C("subscriptionUrgencyMessages");
        this.nullableListOfRegibundleUrgencyMessageDataAdapter.mo197toJson(hVar, regibundleData.e());
        hVar.C("automatedSkuChanges");
        this.nullableListOfRegibundleSkuOverrideDataAdapter.mo197toJson(hVar, regibundleData.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RegibundleData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
