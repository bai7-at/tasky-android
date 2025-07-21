package com.nytimes.android.growthui.paywall.models.remoteconfig;

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
public final class PaywallUrgencyMessageDataJsonAdapter extends JsonAdapter<PaywallUrgencyMessageData> {
    public static final int $stable = 8;
    private volatile Constructor<PaywallUrgencyMessageData> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public PaywallUrgencyMessageDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("startTimeInterval", "endTimeInterval", "topperText", "header", "buttonText");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "startTimeInterval");
        zq3.g(f, "adapter(...)");
        this.longAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "topperText");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "header");
        zq3.g(f3, "adapter(...)");
        this.stringAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PaywallUrgencyMessageData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("startTimeInterval", "startTimeInterval", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                l2 = (Long) this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    JsonDataException x2 = c29.x("endTimeInterval", "endTimeInterval", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (P == 3) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException x3 = c29.x("header_", "header", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
                i &= -9;
            } else if (P == 4) {
                str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -17;
            }
        }
        jsonReader.h();
        if (i == -29) {
            if (l == null) {
                JsonDataException o = c29.o("startTimeInterval", "startTimeInterval", jsonReader);
                zq3.g(o, "missingProperty(...)");
                throw o;
            }
            long longValue = l.longValue();
            if (l2 != null) {
                long longValue2 = l2.longValue();
                zq3.f(str2, "null cannot be cast to non-null type kotlin.String");
                return new PaywallUrgencyMessageData(longValue, longValue2, str, str2, str3);
            }
            JsonDataException o2 = c29.o("endTimeInterval", "endTimeInterval", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        Constructor<PaywallUrgencyMessageData> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Long.TYPE;
            constructor = PaywallUrgencyMessageData.class.getDeclaredConstructor(cls, cls, String.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (l == null) {
            JsonDataException o3 = c29.o("startTimeInterval", "startTimeInterval", jsonReader);
            zq3.g(o3, "missingProperty(...)");
            throw o3;
        }
        if (l2 == null) {
            JsonDataException o4 = c29.o("endTimeInterval", "endTimeInterval", jsonReader);
            zq3.g(o4, "missingProperty(...)");
            throw o4;
        }
        PaywallUrgencyMessageData newInstance = constructor.newInstance(l, l2, str, str2, str3, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PaywallUrgencyMessageData paywallUrgencyMessageData) {
        zq3.h(hVar, "writer");
        if (paywallUrgencyMessageData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("startTimeInterval");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(paywallUrgencyMessageData.getStartTimeInterval()));
        hVar.C("endTimeInterval");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(paywallUrgencyMessageData.getEndTimeInterval()));
        hVar.C("topperText");
        this.nullableStringAdapter.mo197toJson(hVar, paywallUrgencyMessageData.c());
        hVar.C("header");
        this.stringAdapter.mo197toJson(hVar, paywallUrgencyMessageData.b());
        hVar.C("buttonText");
        this.nullableStringAdapter.mo197toJson(hVar, paywallUrgencyMessageData.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PaywallUrgencyMessageData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
