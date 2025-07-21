package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.EmailMarketingOptInDirectiveValue;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class EmailMarketingOptInUiPrivacyDirectiveJsonAdapter extends JsonAdapter<EmailMarketingOptInUiPrivacyDirective> {
    private final JsonAdapter<EmailMarketingOptInDirectiveValue> emailMarketingOptInDirectiveValueAdapter;
    private final JsonReader.b options;

    public EmailMarketingOptInUiPrivacyDirectiveJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("value");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<EmailMarketingOptInDirectiveValue> f = iVar.f(EmailMarketingOptInDirectiveValue.class, b0.e(), "value");
        zq3.g(f, "adapter(...)");
        this.emailMarketingOptInDirectiveValueAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(59);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EmailMarketingOptInUiPrivacyDirective");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public EmailMarketingOptInUiPrivacyDirective fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        EmailMarketingOptInDirectiveValue emailMarketingOptInDirectiveValue = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (emailMarketingOptInDirectiveValue = (EmailMarketingOptInDirectiveValue) this.emailMarketingOptInDirectiveValueAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("value__", "value", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (emailMarketingOptInDirectiveValue != null) {
            return new EmailMarketingOptInUiPrivacyDirective(emailMarketingOptInDirectiveValue);
        }
        JsonDataException o = c29.o("value__", "value", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, EmailMarketingOptInUiPrivacyDirective emailMarketingOptInUiPrivacyDirective) {
        zq3.h(hVar, "writer");
        if (emailMarketingOptInUiPrivacyDirective == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("value");
        this.emailMarketingOptInDirectiveValueAdapter.mo197toJson(hVar, emailMarketingOptInUiPrivacyDirective.getValue());
        hVar.l();
    }
}
