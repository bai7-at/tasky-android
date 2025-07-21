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
public final class ResponseError_ResultsJsonAdapter extends JsonAdapter<ResponseError.Results> {
    private volatile Constructor<ResponseError.Results> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public ResponseError_ResultsJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("Error");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "errorMessage");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ResponseError.Results fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i = -2;
            }
        }
        jsonReader.h();
        if (i == -2) {
            return new ResponseError.Results(str);
        }
        Constructor<ResponseError.Results> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ResponseError.Results.class.getDeclaredConstructor(String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        ResponseError.Results newInstance = constructor.newInstance(str, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ResponseError.Results results) {
        zq3.h(hVar, "writer");
        if (results == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("Error");
        this.nullableStringAdapter.mo197toJson(hVar, results.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ResponseError.Results");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
