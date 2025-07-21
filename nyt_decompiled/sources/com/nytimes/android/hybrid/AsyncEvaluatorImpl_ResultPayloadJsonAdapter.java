package com.nytimes.android.hybrid;

import com.nytimes.android.hybrid.AsyncEvaluatorImpl;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class AsyncEvaluatorImpl_ResultPayloadJsonAdapter extends JsonAdapter<AsyncEvaluatorImpl.ResultPayload> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public AsyncEvaluatorImpl_ResultPayloadJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("success", "result");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Boolean> f = iVar.f(Boolean.TYPE, b0.e(), "success");
        zq3.g(f, "adapter(...)");
        this.booleanAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "result");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AsyncEvaluatorImpl.ResultPayload fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Boolean bool = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    JsonDataException x = c29.x("success", "success", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (bool != null) {
            return new AsyncEvaluatorImpl.ResultPayload(bool.booleanValue(), str);
        }
        JsonDataException o = c29.o("success", "success", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AsyncEvaluatorImpl.ResultPayload resultPayload) {
        zq3.h(hVar, "writer");
        if (resultPayload == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("success");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(resultPayload.b()));
        hVar.C("result");
        this.nullableStringAdapter.mo197toJson(hVar, resultPayload.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(54);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AsyncEvaluatorImpl.ResultPayload");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
