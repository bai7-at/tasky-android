package com.nytimes.android.subauth.core.auth.network.response;

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
public final class LoginErrorJsonAdapter extends JsonAdapter<LoginError> {
    private volatile Constructor<LoginError> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public LoginErrorJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("category", "code", "httpCode", "text");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "category");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.class, b0.e(), "code");
        zq3.g(f2, "adapter(...)");
        this.nullableIntAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "errorMessage");
        zq3.g(f3, "adapter(...)");
        this.stringAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoginError fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (P == 1) {
                num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (P == 2) {
                num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (P == 3 && (str2 = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("errorMessage", "text", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (i == -8) {
            if (str2 != null) {
                return new LoginError(str, num, num2, str2);
            }
            JsonDataException o = c29.o("errorMessage", "text", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<LoginError> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LoginError.class.getDeclaredConstructor(String.class, Integer.class, Integer.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (str2 != null) {
            LoginError newInstance = constructor.newInstance(str, num, num2, str2, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("errorMessage", "text", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LoginError loginError) {
        zq3.h(hVar, "writer");
        if (loginError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("category");
        this.nullableStringAdapter.mo197toJson(hVar, loginError.a());
        hVar.C("code");
        this.nullableIntAdapter.mo197toJson(hVar, loginError.b());
        hVar.C("httpCode");
        this.nullableIntAdapter.mo197toJson(hVar, loginError.d());
        hVar.C("text");
        this.stringAdapter.mo197toJson(hVar, loginError.c());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LoginError");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
