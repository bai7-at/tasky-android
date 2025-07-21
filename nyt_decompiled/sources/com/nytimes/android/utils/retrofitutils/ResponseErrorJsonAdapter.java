package com.nytimes.android.utils.retrofitutils;

import com.nytimes.android.utils.retrofitutils.ResponseError;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class ResponseErrorJsonAdapter extends JsonAdapter<ResponseError> {
    private volatile Constructor<ResponseError> constructorRef;
    private final JsonAdapter<ResponseError.Results> nullableResultsAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public ResponseErrorJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("status", "results", "errorDetails");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "status");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<ResponseError.Results> f2 = iVar.f(ResponseError.Results.class, b0.e(), "results");
        zq3.g(f2, "adapter(...)");
        this.nullableResultsAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ResponseError fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        ResponseError.Results results = null;
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
                results = (ResponseError.Results) this.nullableResultsAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (P == 2) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.h();
        if (i == -8) {
            return new ResponseError(str, results, str2);
        }
        Constructor<ResponseError> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ResponseError.class.getDeclaredConstructor(String.class, ResponseError.Results.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        ResponseError newInstance = constructor.newInstance(str, results, str2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ResponseError responseError) {
        zq3.h(hVar, "writer");
        if (responseError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("status");
        this.nullableStringAdapter.mo197toJson(hVar, responseError.c());
        hVar.C("results");
        this.nullableResultsAdapter.mo197toJson(hVar, responseError.b());
        hVar.C("errorDetails");
        this.nullableStringAdapter.mo197toJson(hVar, responseError.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ResponseError");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
