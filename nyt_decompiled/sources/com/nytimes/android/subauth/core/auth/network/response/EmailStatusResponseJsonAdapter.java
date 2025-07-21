package com.nytimes.android.subauth.core.auth.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class EmailStatusResponseJsonAdapter extends JsonAdapter<EmailStatusResponse> {
    private final JsonAdapter<EmailStatusResponseData> emailStatusResponseDataAdapter;
    private final JsonReader.b options;

    public EmailStatusResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("data");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<EmailStatusResponseData> f = iVar.f(EmailStatusResponseData.class, b0.e(), "data");
        zq3.g(f, "adapter(...)");
        this.emailStatusResponseDataAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EmailStatusResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        EmailStatusResponseData emailStatusResponseData = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (emailStatusResponseData = (EmailStatusResponseData) this.emailStatusResponseDataAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("data_", "data", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (emailStatusResponseData != null) {
            return new EmailStatusResponse(emailStatusResponseData);
        }
        JsonDataException o = c29.o("data_", "data", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, EmailStatusResponse emailStatusResponse) {
        zq3.h(hVar, "writer");
        if (emailStatusResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("data");
        this.emailStatusResponseDataAdapter.mo197toJson(hVar, emailStatusResponse.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EmailStatusResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
