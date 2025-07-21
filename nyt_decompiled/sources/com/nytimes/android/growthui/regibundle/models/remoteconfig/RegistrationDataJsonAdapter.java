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
public final class RegistrationDataJsonAdapter extends JsonAdapter<RegistrationData> {
    public static final int $stable = 8;
    private volatile Constructor<RegistrationData> constructorRef;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public RegistrationDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("header", "text", "buttonText");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "header");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RegistrationData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
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
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -8) {
            zq3.f(str, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str2, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str3, "null cannot be cast to non-null type kotlin.String");
            return new RegistrationData(str, str2, str3);
        }
        Constructor<RegistrationData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = RegistrationData.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        RegistrationData newInstance = constructor.newInstance(str, str2, str3, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, RegistrationData registrationData) {
        zq3.h(hVar, "writer");
        if (registrationData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("header");
        this.stringAdapter.mo197toJson(hVar, registrationData.b());
        hVar.C("text");
        this.stringAdapter.mo197toJson(hVar, registrationData.c());
        hVar.C("buttonText");
        this.stringAdapter.mo197toJson(hVar, registrationData.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RegistrationData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
