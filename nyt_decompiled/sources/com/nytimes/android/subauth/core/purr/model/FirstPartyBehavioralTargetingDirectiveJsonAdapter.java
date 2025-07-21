package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.FirstPartyDirectiveValue;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class FirstPartyBehavioralTargetingDirectiveJsonAdapter extends JsonAdapter<FirstPartyBehavioralTargetingDirective> {
    private final JsonAdapter<FirstPartyDirectiveValue> firstPartyDirectiveValueAdapter;
    private final JsonReader.b options;

    public FirstPartyBehavioralTargetingDirectiveJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("value");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<FirstPartyDirectiveValue> f = iVar.f(FirstPartyDirectiveValue.class, b0.e(), "value");
        zq3.g(f, "adapter(...)");
        this.firstPartyDirectiveValueAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("FirstPartyBehavioralTargetingDirective");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public FirstPartyBehavioralTargetingDirective fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        FirstPartyDirectiveValue firstPartyDirectiveValue = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (firstPartyDirectiveValue = (FirstPartyDirectiveValue) this.firstPartyDirectiveValueAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("value__", "value", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (firstPartyDirectiveValue != null) {
            return new FirstPartyBehavioralTargetingDirective(firstPartyDirectiveValue);
        }
        JsonDataException o = c29.o("value__", "value", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, FirstPartyBehavioralTargetingDirective firstPartyBehavioralTargetingDirective) {
        zq3.h(hVar, "writer");
        if (firstPartyBehavioralTargetingDirective == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("value");
        this.firstPartyDirectiveValueAdapter.mo197toJson(hVar, firstPartyBehavioralTargetingDirective.getValue());
        hVar.l();
    }
}
