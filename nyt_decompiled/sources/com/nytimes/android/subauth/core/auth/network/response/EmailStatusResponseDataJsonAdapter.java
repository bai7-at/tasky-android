package com.nytimes.android.subauth.core.auth.network.response;

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
public final class EmailStatusResponseDataJsonAdapter extends JsonAdapter<EmailStatusResponseData> {
    private volatile Constructor<EmailStatusResponseData> constructorRef;
    private final JsonAdapter<EmailStatusResponseAccountStatus> emailStatusResponseAccountStatusAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public EmailStatusResponseDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("authMethods", "email", "accountStatus", "userId", "validToken", "passwordSetToken");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<List<String>> f = iVar.f(j.j(List.class, String.class), b0.e(), "authMethods");
        zq3.g(f, "adapter(...)");
        this.nullableListOfStringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "email");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
        JsonAdapter<EmailStatusResponseAccountStatus> f3 = iVar.f(EmailStatusResponseAccountStatus.class, b0.e(), "accountStatus");
        zq3.g(f3, "adapter(...)");
        this.emailStatusResponseAccountStatusAdapter = f3;
        JsonAdapter<Long> f4 = iVar.f(Long.class, b0.e(), "userId");
        zq3.g(f4, "adapter(...)");
        this.nullableLongAdapter = f4;
        JsonAdapter<Boolean> f5 = iVar.f(Boolean.class, b0.e(), "validToken");
        zq3.g(f5, "adapter(...)");
        this.nullableBooleanAdapter = f5;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EmailStatusResponseData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        int i = -1;
        String str = null;
        EmailStatusResponseAccountStatus emailStatusResponseAccountStatus = null;
        Long l = null;
        Boolean bool = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    list = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    emailStatusResponseAccountStatus = (EmailStatusResponseAccountStatus) this.emailStatusResponseAccountStatusAdapter.fromJson(jsonReader);
                    if (emailStatusResponseAccountStatus == null) {
                        JsonDataException x = c29.x("accountStatus", "accountStatus", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    break;
                case 3:
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
            }
        }
        jsonReader.h();
        if (i == -60) {
            if (emailStatusResponseAccountStatus != null) {
                return new EmailStatusResponseData(list, str, emailStatusResponseAccountStatus, l, bool, str2);
            }
            JsonDataException o = c29.o("accountStatus", "accountStatus", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<EmailStatusResponseData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EmailStatusResponseData.class.getDeclaredConstructor(List.class, String.class, EmailStatusResponseAccountStatus.class, Long.class, Boolean.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        Constructor<EmailStatusResponseData> constructor2 = constructor;
        if (emailStatusResponseAccountStatus == null) {
            JsonDataException o2 = c29.o("accountStatus", "accountStatus", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        EmailStatusResponseData newInstance = constructor2.newInstance(list, str, emailStatusResponseAccountStatus, l, bool, str2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, EmailStatusResponseData emailStatusResponseData) {
        zq3.h(hVar, "writer");
        if (emailStatusResponseData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("authMethods");
        this.nullableListOfStringAdapter.mo197toJson(hVar, emailStatusResponseData.c());
        hVar.C("email");
        this.nullableStringAdapter.mo197toJson(hVar, emailStatusResponseData.d());
        hVar.C("accountStatus");
        this.emailStatusResponseAccountStatusAdapter.mo197toJson(hVar, emailStatusResponseData.b());
        hVar.C("userId");
        this.nullableLongAdapter.mo197toJson(hVar, emailStatusResponseData.f());
        hVar.C("validToken");
        this.nullableBooleanAdapter.mo197toJson(hVar, emailStatusResponseData.g());
        hVar.C("passwordSetToken");
        this.nullableStringAdapter.mo197toJson(hVar, emailStatusResponseData.e());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EmailStatusResponseData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
