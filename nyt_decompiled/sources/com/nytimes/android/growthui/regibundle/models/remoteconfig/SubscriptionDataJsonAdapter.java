package com.nytimes.android.growthui.regibundle.models.remoteconfig;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class SubscriptionDataJsonAdapter extends JsonAdapter<SubscriptionData> {
    public static final int $stable = 8;
    private volatile Constructor<SubscriptionData> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public SubscriptionDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("header", "text", "buttonText", "hoursBetweenRecurrence", "sku");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "header");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "hoursBetweenRecurrence");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SubscriptionData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("header_", "header", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -2;
            } else if (P == 1) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException x2 = c29.x("text", "text", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i &= -3;
            } else if (P == 2) {
                str3 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    JsonDataException x3 = c29.x("buttonText", "buttonText", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
                i &= -5;
            } else if (P == 3) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x4 = c29.x("hoursBetweenRecurrence", "hoursBetweenRecurrence", jsonReader);
                    zq3.g(x4, "unexpectedNull(...)");
                    throw x4;
                }
                i &= -9;
            } else if (P == 4) {
                str4 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str4 == null) {
                    JsonDataException x5 = c29.x("sku", "sku", jsonReader);
                    zq3.g(x5, "unexpectedNull(...)");
                    throw x5;
                }
                i &= -17;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -32) {
            zq3.f(str, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str2, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str3, "null cannot be cast to non-null type kotlin.String");
            int intValue = num.intValue();
            zq3.f(str4, "null cannot be cast to non-null type kotlin.String");
            return new SubscriptionData(str, str2, str3, intValue, str4);
        }
        Constructor<SubscriptionData> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = SubscriptionData.class.getDeclaredConstructor(String.class, String.class, String.class, cls, String.class, cls, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        SubscriptionData newInstance = constructor.newInstance(str, str2, str3, num, str4, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, SubscriptionData subscriptionData) {
        zq3.h(hVar, "writer");
        if (subscriptionData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("header");
        this.stringAdapter.mo197toJson(hVar, subscriptionData.b());
        hVar.C("text");
        this.stringAdapter.mo197toJson(hVar, subscriptionData.e());
        hVar.C("buttonText");
        this.stringAdapter.mo197toJson(hVar, subscriptionData.a());
        hVar.C("hoursBetweenRecurrence");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(subscriptionData.c()));
        hVar.C("sku");
        this.stringAdapter.mo197toJson(hVar, subscriptionData.d());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SubscriptionData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
