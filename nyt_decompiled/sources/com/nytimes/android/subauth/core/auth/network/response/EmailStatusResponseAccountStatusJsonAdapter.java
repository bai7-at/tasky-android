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
public final class EmailStatusResponseAccountStatusJsonAdapter extends JsonAdapter<EmailStatusResponseAccountStatus> {
    private volatile Constructor<EmailStatusResponseAccountStatus> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public EmailStatusResponseAccountStatusJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("status", "regiLite");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "status");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.class, b0.e(), "regiLite");
        zq3.g(f2, "adapter(...)");
        this.nullableBooleanAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EmailStatusResponseAccountStatus fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Boolean bool = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("status", "status", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.h();
        if (i == -3) {
            if (str != null) {
                return new EmailStatusResponseAccountStatus(str, bool);
            }
            JsonDataException o = c29.o("status", "status", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<EmailStatusResponseAccountStatus> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EmailStatusResponseAccountStatus.class.getDeclaredConstructor(String.class, Boolean.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (str != null) {
            EmailStatusResponseAccountStatus newInstance = constructor.newInstance(str, bool, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("status", "status", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, EmailStatusResponseAccountStatus emailStatusResponseAccountStatus) {
        zq3.h(hVar, "writer");
        if (emailStatusResponseAccountStatus == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("status");
        this.stringAdapter.mo197toJson(hVar, emailStatusResponseAccountStatus.b());
        hVar.C("regiLite");
        this.nullableBooleanAdapter.mo197toJson(hVar, emailStatusResponseAccountStatus.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(54);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EmailStatusResponseAccountStatus");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
